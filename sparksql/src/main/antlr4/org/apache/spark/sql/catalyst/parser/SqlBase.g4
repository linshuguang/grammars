/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file is an adaptation of Presto's presto-parser/src/main/antlr4/com/facebook/presto/sql/parser/SqlBase.g4 grammar.
 */

grammar SqlBase;

options {
    language = Java;
}

@parser::header {

  import java.util.regex.Pattern;
  import java.util.*;
  import name.lsg.sparksql.parser.grammar.tree.*;
  import name.lsg.sparksql.parser.grammar.tree.join.*;
  import name.lsg.sparksql.parser.grammar.tree.relation.*;
  import name.lsg.sparksql.parser.grammar.tree.ddl.*;
  import name.lsg.sparksql.parser.grammar.tree.dml.*;
}

@members {
  /**
   * Verify whether current token is a valid decimal token (which contains dot).
   * Returns true if the character that follows the token is not a digit or letter or underscore.
   *
   * For example:
   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
   * which is not a digit or letter or underscore.
   */
  public boolean isValidDecimal() {
    int nextChar = _input.LA(1);
    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
      nextChar == '_') {
      return false;
    } else {
      return true;
    }
  }
}

singleStatement returns [ AST value]
    : statement EOF { $value = $statement.value; }
    ;

singleExpression returns [ AST value]
    : namedExpression EOF { $value = $namedExpression.value; }
    ;

singleTableIdentifier returns [ AST value]
    : tableIdentifier EOF {  $value = $tableIdentifier.value;  }
    ;

singleFunctionIdentifier returns [AST value]
    : functionIdentifier EOF { $value = $functionIdentifier.value;}
    ;

singleDataType returns [ AST value]
    : dataType EOF { $value = $dataType.value;}
    ;

singleTableSchema returns [ AST value]
    : colTypeList EOF { $value = new SingleTableSchema($colTypeList.value);}
    ;

statement returns [ AST value]
    : query  { $value = $query.value; }                                #statementDefault
    | USE db=identifier   { $value = new USE($db.value);}                                             #use
    | { boolean notExists=false;}CREATE DATABASE (IF NOT EXISTS {notExists=true;})? identifier
        (COMMENT comment=STRING)? locationSpec?
        (WITH DBPROPERTIES tablePropertyList)? { $value =new CreateDatabase(notExists,$identifier.value,$comment.text,$locationSpec.value,$tablePropertyList.value);}                        #createDatabase
    | ALTER DATABASE identifier SET DBPROPERTIES tablePropertyList  {  $value = new SetDatabaseProperties($identifier.value,$tablePropertyList.value);}   #setDatabaseProperties
    | { boolean exists = false;}DROP DATABASE (IF EXISTS {exists = true;})? identifier appendix=(RESTRICT | CASCADE)?  { $value = new DropDatabase(exists,$identifier.value,$appendix.text);}     #dropDatabase
    | createTableHeader ('(' colTypeList ')')? tableProvider {CreateTable createTable = new CreateTable($createTableHeader.value,$colTypeList.value,$tableProvider.value); $value = createTable;}
        ((OPTIONS options=tablePropertyList { createTable.setTablePropertyList($options.value);}) |
        (PARTITIONED BY partitionColumnNames=identifierList {  createTable.setPartitionColumnNames($partitionColumnNames.value);}) |
        bucketSpec { createTable.setBucketSpec($bucketSpec.value);}|
        locationSpec { createTable.setLocationSpec($locationSpec.value);} |
        (COMMENT comment=STRING { createTable.setComment($comment.text);}) |
        (TBLPROPERTIES tableProps=tablePropertyList {  createTable.setTableProps($tableProps.value);}))*
        ((AS{ createTable.markAS();})? query{ createTable.setQuery($query.value);})?                                                   #createTable
    | createTableHeader ('(' columns=colTypeList ')')? { CreateHiveTable createTable = new CreateHiveTable($createTableHeader.value,$columns.value); $value =createTable;}
        ((COMMENT comment=STRING { createTable.setComment($comment.text);}) |
        (PARTITIONED BY '(' partitionColumns=colTypeList ')' { createTable.setPartitionColumns($partitionColumns.value);}) |
        bucketSpec { createTable.setBucketSpec($bucketSpec.value);}|
        skewSpec { createTable.setSkewSpec($skewSpec.value);} |
        rowFormat { createTable.setRowFormat($rowFormat.value);}|
        createFileFormat { createTable.setCreateFileFormat($createFileFormat.value);}|
        locationSpec { createTable.setLocationSpec($locationSpec.value);}|
        (TBLPROPERTIES tableProps=tablePropertyList { createTable.setTableProps($tableProps.value);}))*
        ((AS {createTable.markAS();})? query{ createTable.setQuery($query.value);})?                                                   #createHiveTable
    | {boolean not=false;}CREATE TABLE (IF NOT EXISTS { not=true;})? target=tableIdentifier
        LIKE source=tableIdentifier locationSpec?  {  $value = new CreateTableLike(not,$target.value, $source.value,$locationSpec.value);}                     #createTableLike
    | ANALYZE TABLE t=tableIdentifier p=partitionSpec? COMPUTE STATISTICS { Analyze analyze = new Analyze($t.value,$p.value); $value = analyze;}
        (identifier { analyze.setIdentifier($identifier.value);} | FOR COLUMNS identifierSeq { analyze.setIdentifierSeq($identifierSeq.value);})?                      #analyze
    | ALTER TABLE tableIdentifier
        ADD COLUMNS '(' columns=colTypeList ')'  { $value = new AddTableColumns($tableIdentifier.value, $columns.value);}                      #addTableColumns
    | ALTER alter=(TABLE | VIEW) from=tableIdentifier
        RENAME TO to=tableIdentifier   {$value = new RenameTable($alter.text, $from.value, $to.value);}                                #renameTable
    | ALTER alter=(TABLE | VIEW) tableIdentifier
        SET TBLPROPERTIES tablePropertyList   { $value = new SetTableProperties($alter.text, $tableIdentifier.value, $tablePropertyList.value);}                          #setTableProperties
    | ALTER alter=(TABLE | VIEW) tableIdentifier
        UNSET TBLPROPERTIES {boolean exists = false;} (IF EXISTS { exists =true;})? tablePropertyList { $value = new UnsetTableProperties($alter.text, $tableIdentifier.value,exists, $tablePropertyList.value); }             #unsetTableProperties
    | ALTER TABLE tableIdentifier partitionSpec? { boolean column = false;}
        CHANGE (COLUMN { column = true;})? identifier colType colPosition?    {  $value = new ChangeColumn($tableIdentifier.value,$partitionSpec.value, column,$identifier.value,$colType.value,$colPosition.value );}              #changeColumn
    | ALTER TABLE tableIdentifier (partitionSpec)?
        SET SERDE s=STRING (WITH SERDEPROPERTIES tablePropertyList)? { $value = new SetTableSerDe($tableIdentifier.value, $partitionSpec.value, $s.text, $tablePropertyList.value);}    #setTableSerDe
    | ALTER TABLE tableIdentifier (partitionSpec)?
        SET SERDEPROPERTIES tablePropertyList   { $value = new SetTableSerDe($tableIdentifier.value, $partitionSpec.value, $tablePropertyList.value);}                       #setTableSerDe
    | {boolean notExists = false;}ALTER TABLE tableIdentifier ADD (IF NOT EXISTS { notExists = true;})? { AddTablePartition add = new AddTablePartition($tableIdentifier.value, notExists);$value= add; }
        (partitionSpecLocation {add.addLocation($partitionSpecLocation.value);})+                                         #addTablePartition
    | {boolean notExists = false;} ALTER VIEW tableIdentifier ADD (IF NOT EXISTS { notExists = true;})? { AddViewPartition add = new AddViewPartition($tableIdentifier.value, notExists);$value= add; }
        (partitionSpec{add.addSpec($partitionSpec.value);})+                                                 #addTablePartition
    | ALTER TABLE tableIdentifier
        from=partitionSpec RENAME TO to=partitionSpec    { $value = new RenameTablePartition($tableIdentifier.value, $from.value, $to.value);}              #renameTablePartition
    | ALTER TABLE tableIdentifier {DropTablePartitions drop = new DropTablePartitions($tableIdentifier.value); $value = drop; }
        DROP (IF EXISTS { drop.markExists();})? partitionSpec { drop.addPartitionSpec($partitionSpec.value);} (',' partitionSpec { drop.addPartitionSpec($partitionSpec.value);})*  (PURGE { drop.markPurge();})?    #dropTablePartitions
    | ALTER VIEW tableIdentifier {DropViewPartitions drop = new DropViewPartitions($tableIdentifier.value); $value = drop; }
        DROP (IF EXISTS { drop.markExists();})? partitionSpec { drop.addPartitionSpec($partitionSpec.value);} (',' partitionSpec { drop.addPartitionSpec($partitionSpec.value);})*           #dropTablePartitions
    | ALTER TABLE tableIdentifier partitionSpec? SET locationSpec { $value = new SetTableLocation($tableIdentifier.value, $partitionSpec.value, $locationSpec.value);}      #setTableLocation
    | ALTER TABLE tableIdentifier RECOVER PARTITIONS   { $value = new RecoverPartitions($tableIdentifier.value);}                 #recoverPartitions
    | { boolean exists = false; boolean purge = false;}DROP TABLE (IF EXISTS {exists =true;})? tableIdentifier (PURGE {purge = true;})? { $value = new DropTable(exists, $tableIdentifier.value, purge);}                   #dropTable
    |{ boolean exists = false;} DROP VIEW (IF EXISTS {exists =true;})? tableIdentifier    { $value =new DropView(exists, $tableIdentifier.value);}                       #dropTable
    |{ boolean replace = false; boolean global = false; boolean temporary=false; boolean notExists= false; String comment=null; } CREATE (OR REPLACE {replace =true;})? ((GLOBAL {global = true;})? TEMPORARY {temporary= true;})?
        VIEW (IF NOT EXISTS { notExists=true;})? tableIdentifier
        identifierCommentList? (COMMENT s=STRING {comment=$s.text;})?
        (PARTITIONED ON identifierList)?
        (TBLPROPERTIES tablePropertyList)? AS query  { $value = new CreateView(replace,global,temporary,notExists,$tableIdentifier.value,$identifierCommentList.value,comment,$identifierList.value,$tablePropertyList.value,$query.value);}                   #createView
    | {boolean replace = false; boolean global = false;} CREATE (OR REPLACE {replace = true;})? (GLOBAL {global = true;})? TEMPORARY VIEW
        tableIdentifier ('(' colTypeList ')')? tableProvider
        (OPTIONS tablePropertyList)?  { $value = new CreateTempViewUsing(replace,global,$tableIdentifier.value,$colTypeList.value,$tableProvider.value,$tablePropertyList.value);}                             #createTempViewUsing
    | {boolean as = false;}ALTER VIEW tableIdentifier (AS {as = true;})? query  {$value = new AlterViewQuery($tableIdentifier.value,as, $query.value); }                            #alterViewQuery
    |{boolean replace = false; boolean temporary = false; boolean notExists = false;} CREATE (OR REPLACE {replace = true;})? (TEMPORARY{temporary=true;})? FUNCTION (IF NOT EXISTS{ notExists=true;})?
        qualifiedName AS className=STRING { CreateFunction createFunction = new CreateFunction(replace,temporary,notExists,$qualifiedName.value,$className.text); $value = createFunction; }
        (USING resource {createFunction.addResource($resource.value);} (',' resource {createFunction.addResource($resource.value);})*)?                               #createFunction
    | {boolean temporary = false; boolean exists = false;}DROP TEMPORARY? FUNCTION (IF EXISTS)? qualifiedName  { $value = new DropFunction(temporary,exists,$qualifiedName.value);}            #dropFunction
    | EXPLAIN option=(LOGICAL | FORMATTED | EXTENDED | CODEGEN | COST)?
        statement   { $value = new Explain($option.text, $statement.value);}                                                   #explain
    | SHOW TABLES (method=(FROM | IN) db=identifier)? {boolean like =false;}
        ((LIKE {like =true;})? pattern=STRING)?  { $value = new ShowTables($method.text, $db.value,like, $pattern.text);}                                       #showTables
    | SHOW TABLE EXTENDED (method=(FROM | IN) db=identifier)?
        LIKE pattern=STRING partitionSpec?    { $value = new ShowTable($method.text, $db.value, $pattern.text, $partitionSpec.value);}                         #showTable
    | {boolean like =false;} SHOW DATABASES ((LIKE {like = true;})? pattern=STRING)?  { $value = new ShowDatabases(like ,$pattern.text);}                          #showDatabases
    | SHOW TBLPROPERTIES table=tableIdentifier
        ('(' key=tablePropertyKey ')')?   {$value = new ShowTblProperties($table.value, $key.value);}                             #showTblProperties
    | SHOW COLUMNS tMethod=(FROM | IN) table=tableIdentifier
        (dMethod=(FROM | IN) db=identifier)?   { $value = new ShowColumns($tMethod.text, $table.value, $dMethod.text, $db.value); }                                 #showColumns
    | SHOW PARTITIONS tableIdentifier partitionSpec? { $value = new ShowPartitions($tableIdentifier.value, $partitionSpec.value);}                  #showPartitions
    | { ShowFunctions showFunctions = new ShowFunctions(); $value = showFunctions;} SHOW (identifier { showFunctions.setIdentifier($identifier.value);})? FUNCTIONS
        ((LIKE {showFunctions.setLike(true);})? (qualifiedName{ showFunctions.setQualifiedName($qualifiedName.value);} | pattern=STRING { showFunctions.setPattern($pattern.text);}))?  { }                    #showFunctions
    | SHOW CREATE TABLE tableIdentifier    { $value = new ShowCreateTable($tableIdentifier.value); }                            #showCreateTable
    | { boolean extend=false;} desc=(DESC | DESCRIBE) FUNCTION (EXTENDED {extend =true;})? describeFuncName { $value = new DescribeFunction($desc.text, extend, $describeFuncName.value);}           #describeFunction
    | { boolean extend=false;} desc=(DESC | DESCRIBE) DATABASE (EXTENDED {extend =true;})? identifier { $value = new DescribeDatabase($desc.text, extend, $identifier.value);}                 #describeDatabase
    | { boolean table=false;} desc=(DESC | DESCRIBE) (TABLE{table = true;})? option=(EXTENDED | FORMATTED)?
        tableIdentifier partitionSpec? describeColName?  { $value = new DescribeTable($desc.text, table, $option.text, $tableIdentifier.value,$partitionSpec.value,$describeColName.value);}              #describeTable
    | REFRESH TABLE t=tableIdentifier    { $value = new RefreshTable($t.value);}                                #refreshTable
    | REFRESH (s=STRING  { $value = new RefreshResource($s.text); } | (t=.*?  {$value = new RefreshResource($t.text);}) )                                           #refreshResource
    | { boolean lazy =false; boolean as =false;}CACHE (LAZY {lazy=true;})? TABLE tableIdentifier ((AS {as = true;})? query)?  { $value = new CacheTable(lazy,$tableIdentifier.value,as, $query.value);}                 #cacheTable
    | { boolean exists = false;} UNCACHE TABLE (IF EXISTS {exists =true;})? tableIdentifier    { $value = new UncacheTable(exists, $tableIdentifier.value);}                   #uncacheTable
    | CLEAR CACHE        { $value = new ClearCache();}                                              #clearCache
    | { boolean local =false; boolean overwrite =false;}LOAD DATA (LOCAL {local = true;})? INPATH path=STRING (OVERWRITE {overwrite =true;})? INTO TABLE
        tableIdentifier partitionSpec? { $value = new LoadData(local,$path.text, overwrite, $tableIdentifier.value, $partitionSpec.value);}                                #loadData
    | TRUNCATE TABLE tableIdentifier partitionSpec? { $value = new TruncateTable($tableIdentifier.value, $partitionSpec.value); }                    #truncateTable
    | MSCK REPAIR TABLE tableIdentifier { $value = new RepairTable($tableIdentifier.value);}                                #repairTable
    | op=(ADD | LIST) identifier s=.*?  { $value = new ManageResource($op.text, $identifier.value,$s.text);}                                 #manageResource
    | SET ROLE s=.*? {$value = new SetRole($s.text);}                                                    #failNativeCommand
    | SET s=.*?    {$value = new SetConfiguration($s.text);}                                                      #setConfiguration
    | RESET   { $value = new ResetConfiguration();}                                                         #resetConfiguration
    | unsupportedHiveNativeCommands .*?                                #failNativeCommand
    ;

unsupportedHiveNativeCommands returns [ AST value]
    : kw1=CREATE kw2=ROLE {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=DROP kw2=ROLE {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=GRANT kw2=ROLE? {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=REVOKE kw2=ROLE? {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=GRANT {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=ROLE kw3=GRANT? {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=PRINCIPALS {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=ROLES {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=CURRENT kw3=ROLES {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=EXPORT kw2=TABLE {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=IMPORT kw2=TABLE {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=COMPACTIONS {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=CREATE kw3=TABLE {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=TRANSACTIONS {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=INDEXES {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=SHOW kw2=LOCKS {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=CREATE kw2=INDEX {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=DROP kw2=INDEX {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=ALTER kw2=INDEX {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=LOCK kw2=TABLE {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=LOCK kw2=DATABASE {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=UNLOCK kw2=TABLE {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=UNLOCK kw2=DATABASE {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=CREATE kw2=TEMPORARY kw3=MACRO {$value = new FailNativeCommand($kw1.text, $kw2.text, $kw3.text); }
    | kw1=DROP kw2=TEMPORARY kw3=MACRO {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=NOT kw4=CLUSTERED {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=CLUSTERED kw4=BY {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=NOT kw4=SORTED {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=SKEWED kw4=BY {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=NOT kw4=SKEWED {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=NOT kw4=STORED kw5=AS kw6=DIRECTORIES {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text, $kw5.text, $kw6.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=SET kw4=SKEWED kw5=LOCATION {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text, $kw5.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=EXCHANGE kw4=PARTITION {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=ARCHIVE kw4=PARTITION {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=UNARCHIVE kw4=PARTITION {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text, $kw4.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=TOUCH {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $kw3.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier partitionSpec? kw3=COMPACT {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $partitionSpec.value, $kw3.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier partitionSpec? kw3=CONCATENATE {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $partitionSpec.value, $kw3.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier partitionSpec? kw3=SET kw4=FILEFORMAT {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $partitionSpec.value, $kw3.text, $kw4.text); }
    | kw1=ALTER kw2=TABLE tableIdentifier partitionSpec? kw3=REPLACE kw4=COLUMNS {$value = new FailNativeCommand($kw1.text, $kw2.text, $tableIdentifier.value, $partitionSpec.value, $kw3.text, $kw4.text ); }
    | kw1=START kw2=TRANSACTION {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    | kw1=COMMIT {$value = new FailNativeCommand($kw1.text); }
    | kw1=ROLLBACK {$value = new FailNativeCommand($kw1.text); }
    | kw1=DFS {$value = new FailNativeCommand($kw1.text); }
    | kw1=DELETE kw2=FROM {$value = new FailNativeCommand($kw1.text, $kw2.text); }
    ;

createTableHeader returns [CreateTableHeader value]
    @init { $value = new CreateTableHeader(); }
    : CREATE (TEMPORARY {$value.markTemporary();})? (EXTERNAL {$value.markExternal();})? TABLE (IF NOT EXISTS {$value.markNotExists();})? tableIdentifier {  $value.setTableIdentifier($tableIdentifier.value);}
    ;

bucketSpec returns [ AST value]
    : CLUSTERED BY identifierList
      (SORTED BY orderedIdentifierList)?
      INTO s=INTEGER_VALUE BUCKETS {  $value = new BucketSpec($identifierList.value, $orderedIdentifierList.value,$s.text);}
    ;

skewSpec returns [ SkewSpec value]
    : SKEWED BY identifierList
      ON (constantList {  $value = new SkewSpec($identifierList.value, $constantList.value);} | nestedConstantList {  $value = new SkewSpec($identifierList.value, $nestedConstantList.value);})
      (STORED AS DIRECTORIES { $value.markAsDir();})?
    ;

locationSpec returns [ AST value ]
    : LOCATION s=STRING { $value = new LocationSpec($s.text);}
    ;

query returns [ Query value ]
    @init { $value = new Query(); }
    : (ctes {$value.setWith($ctes.value);} )? queryNoWith { $value.setQueryNoWith($queryNoWith.value);}
    ;

insertInto returns [ AST value]
    : INSERT OVERWRITE TABLE t=tableIdentifier { InsertOverwriteTable insert = new InsertOverwriteTable($t.value); $value = insert; } (partitionSpec {insert.setPartitionSpec($partitionSpec.value);} (IF NOT EXISTS { insert.setNotExists(true);})?)?                              #insertOverwriteTable
    | INSERT INTO {InsertIntoTable insert = new InsertIntoTable(); $value = insert;} (TABLE { insert.setTable(true);})? tableIdentifier { insert.setTableIdentifier($tableIdentifier.value);} (partitionSpec {insert.setPartitionSpec($partitionSpec.value); })?                                                     #insertIntoTable
    | INSERT OVERWRITE {InsertOverwriteHiveDir insert = new InsertOverwriteHiveDir(); $value = insert;} (LOCAL  {insert.setLocal(true);})? DIRECTORY path=STRING {insert.setPath($path.text);} (rowFormat { insert.setRowFormat($rowFormat.value);})? (createFileFormat { insert.setCreateFileFormat($createFileFormat.value);})?                            #insertOverwriteHiveDir
    | INSERT OVERWRITE {InsertOverwriteDir insert = new InsertOverwriteDir(); $value = insert;} (LOCAL { insert.setLocal(true);})? DIRECTORY (path=STRING {insert.setPath($path.text);})? tableProvider { insert.setTableProvider($tableProvider.value);} (OPTIONS options=tablePropertyList {  insert.setTablePropertyList($tablePropertyList.value);})?   #insertOverwriteDir
    ;

partitionSpecLocation returns [ PartitionSpecLocation value]
    : p=partitionSpec { $value = new PartitionSpecLocation($p.value);} (l=locationSpec { $value.setLocation($l.value);})?
    ;

partitionSpec returns [ PartitionSpec value]
    @init { $value = new PartitionSpec();}
    : PARTITION '(' partitionVal { $value.addPartition($partitionVal.value);} (',' partitionVal { $value.addPartition($partitionVal.value);})* ')'
    ;

partitionVal returns [PartitionVal value]
    : identifier { $value = new PartitionVal($identifier.value);} (EQ constant { $value.setConstant($constant.value);})?
    ;

describeFuncName returns [ AST value]
    : qualifiedName { $value = $qualifiedName.value;}
    | s=STRING { $value = new DescribeFuncName($s.text);}
    | c=comparisonOperator { $value = new DescribeFuncName($c.text);}
    | a=arithmeticOperator { $value = new DescribeFuncName($a.text);}
    | p=predicateOperator { $value = new DescribeFuncName($p.text);}
    ;

describeColName returns [ DescribeColName value]
    @init { $value = new DescribeColName();}
    : nameParts+=identifier { $value.addName($identifier.value);} ('.' nameParts+=identifier { $value.addName($identifier.value);})*
    ;

ctes returns [ With value]
    @init { $value = new With();}
    : WITH namedQuery  { $value.addNamedQuery($namedQuery.value);} (',' namedQuery { $value.addNamedQuery($namedQuery.value);})*
    ;

namedQuery returns [ AST value]
    @init { boolean hasAS = false;}
    : name=identifier (AS { hasAS=true;})? '(' query ')' { $value = new NamedQuery($name.value,$query.value, hasAS); }
    ;

tableProvider returns [AST value]
    : USING q=qualifiedName { $value = new TableProvider($q.value);}
    ;

tablePropertyList returns [ TablePropertyList value]
    @init { $value = new TablePropertyList();}
    : '(' p=tableProperty {$value.addProperty($p.value);} (',' tableProperty {$value.addProperty($p.value);})* ')'
    ;

tableProperty returns [TableProperty value]
    : key=tablePropertyKey { $value =new TableProperty($key.value);}( (EQ {$value.setEq(true);})? v=tablePropertyValue {$value.setValue($v.value);})?
    ;

tablePropertyKey returns [TablePropertyKey value]
    @init{ $value = new TablePropertyKey(); }
    : i=identifier {$value.addKey($i.value);} ('.' identifier {$value.addKey($i.value);})*
    | s=STRING { $value = new TablePropertyKey($s.text); }
    ;

tablePropertyValue returns [ AST value]
    : i=INTEGER_VALUE { $value = new TablePropertyValue($i.text);}
    | d=DECIMAL_VALUE{ $value = new TablePropertyValue($d.text);}
    | b=booleanValue { $value = $b.value;}
    | s=STRING { $value = new TablePropertyValue($s.text);}
    ;

constantList returns [ ConstantList value]
    @init{ $value = new ConstantList(); }
    : '(' c=constant {$value.addConstant($c.value); } (',' c=constant {$value.addConstant($c.value); })* ')'
    ;

nestedConstantList returns [ NestedConstantList value]
    @init{ $value = new NestedConstantList(); }
    : '(' c=constantList {$value.addConstant($c.value); } (',' c=constantList {$value.addConstant($c.value); })* ')'
    ;

createFileFormat returns [AST value]
    : STORED a=AS f=fileFormat { $value = new CreateFileFormat($a.text,$f.value);}
    | STORED a=BY s=storageHandler { $value = new CreateFileFormat($a.text,$s.value);}
    ;

fileFormat returns [ AST value]
    : INPUTFORMAT inFmt=STRING OUTPUTFORMAT outFmt=STRING  { $value = new TableFileFormat($inFmt.text,$outFmt.text);}  #tableFileFormat
    | i=identifier    { $value = new GenericFileFormat($i.value);}                                         #genericFileFormat
    ;

storageHandler returns [ AST value]
    : s=STRING (WITH SERDEPROPERTIES t=tablePropertyList)? {  $value = new StorageHandler($s.text, $t.value);}
    ;

resource returns [AST value]
    : i=identifier s=STRING { $value = new Resource($i.value, $s.text);}
    ;

queryNoWith returns [ AST value]
    : {AST insertInto = null;} (insertInto {insertInto = $insertInto.value;})? t=queryTerm o=queryOrganization { $value = new SingleInsertQuery($t.value,$o.value); ((SingleInsertQuery)$value).setInsertInto(insertInto); }                                             #singleInsertQuery
    | fromClause  {MultiInsertQuery insert = new MultiInsertQuery($fromClause.value); $value = insert;} (multiInsertQueryBody { insert.addInsert($multiInsertQueryBody.value);})+                                                     #multiInsertQuery
    ;

queryOrganization returns [ QueryOrganization value]
    @init { $value = new QueryOrganization();}
    : (ORDER BY order=sortItem { $value.addOrderItem($order.value);} (',' order=sortItem { $value.addOrderItem($order.value);})*)?
      (CLUSTER BY clusterBy=expression { $value.addClusterItem($clusterBy.value);} (',' clusterBy=expression { $value.addClusterItem($clusterBy.value);})*)?
      (DISTRIBUTE BY distributeBy=expression { $value.addDistributeItem($distributeBy.value);} (',' distributeBy=expression { $value.addDistributeItem($distributeBy.value);})*)?
      (SORT BY sort=sortItem { $value.addSortItem($sort.value);} (',' sort=sortItem { $value.addSortItem($sort.value);})*)?
      (windows {$value.setWindows($windows.value);})?
      (LIMIT (ALL {$value.setLimit(new Limit());}| limit=expression {$value.setLimit(new Limit($limit.value));}))?
    ;

multiInsertQueryBody returns [AST value]
    : insertInto?
      querySpecification
      queryOrganization  {  $value = new MultiInsertQueryBody($insertInto.value,$querySpecification.value,$queryOrganization.value );}
    ;

queryTerm returns [AST value]
    :  q=queryPrimary  {$value = $q.value;}                                                                       #queryTermDefault
    |  left=queryTerm operator=(INTERSECT | UNION | EXCEPT | SETMINUS) qf=setQuantifier? right=queryTerm
      { $value = new JOIN($left.value,$operator.text,$right.value,$qf.value);}  #setOperation
    ;

queryPrimary returns [AST value]
    : q=querySpecification { $value = new QueryPrimary($q.value);}         #queryPrimaryDefault
    | TABLE tableIdentifier   { $value = new Table($tableIdentifier.value);}                                              #table
    | inlineTable { $value = $inlineTable.value; }                                                           #inlineTableDefault1
    | '(' q=queryNoWith  ')' { $value = new SubQuery($q.value);}                                                  #subquery
    ;

sortItem returns [ SortItem value]
    : e=expression { $value = new SortItem($e.value);}
    (ordering=(ASC | DESC) { $value.setOrdering($ordering.text);}) ?
    (NULLS nullOrder=(LAST | FIRST ) { $value.setNulls($nullOrder.text);})?
    ;

querySpecification returns [ Select value]
    @init { $value = new Select(); }
    : (((SELECT kind=TRANSFORM '(' namedExpressionSeq ')'
        | kind=MAP namedExpressionSeq
        | kind=REDUCE namedExpressionSeq) { $value.setKind($kind.text); $value.setNamedExpressionSeq($namedExpressionSeq.value);})
       (inRowFormat=rowFormat { $value.setInRowFormat($inRowFormat.value);})?
       (RECORDWRITER recordWriter=STRING { $value.setRecordWriter($recordWriter.text);})?
       USING script=STRING { $value.setScript($script.text);}
       (AS (identifierSeq { $value.setAs(new ListHolderAST($identifierSeq.value));}  | colTypeList { $value.setAs(new ListHolderAST($colTypeList.value));}| ('(' (identifierSeq { $value.setAs(new ParenthesisListAST($identifierSeq.value));} | colTypeList { $value.setAs(new ParenthesisListAST($colTypeList.value));}) ')' )))?
       (outRowFormat=rowFormat { $value.setOutRowFormat($outRowFormat.value);})?
       (RECORDREADER recordReader=STRING { $value.setRecordReader($recordReader.text);})?
       (fromClause { $value.setFromClause($fromClause.value);})?
       (WHERE where=booleanExpression { $value.setWhere($where.value);} )?)
    | ((kind=SELECT {$value.setKind($kind.text);} (hints+=hint { $value.addHint($hint.value);})* (q=setQuantifier {$value.setQuantifier($q.value); })?
        nes=namedExpressionSeq { $value.setNamedExpressionSeq($nes.value); }
        (fc=fromClause { $value.setFromClause($fc.value); })?
       |{$value.markAbnormal(); } fc=fromClause { $value.setFromClause($fc.value);} (kind=SELECT{$value.setKind($kind.text);} (q=setQuantifier {$value.setQuantifier($q.value); })?
         nes=namedExpressionSeq { $value.setNamedExpressionSeq($nes.value); })?)
       (lv=lateralView {$value.addLiteralView($lv.value);} )*
       (WHERE where=booleanExpression { $value.setWhere( new Where($where.value));})?
       (a=aggregation {$value.setAggregation($a.value);})?
       (HAVING having=booleanExpression { $value.setHaving(new Having($having.value));} )?
       (windows { $value.setWindows($windows.value); })?)
    ;

hint returns [ Hint value]
    @init { $value = new Hint();}
    : '/*+' hintStatements+=hintStatement { $value.addStatement($hintStatement.value);}
        (','? hintStatements+=hintStatement { $value.addStatement($hintStatement.value);})* '*/'
    ;

hintStatement returns [ AST value]
    : hintName=identifier { $value = new HintStatement($hintName.value); }
    | hintName=identifier  { HintStatement hs = new HintStatement($hintName.value); $value = hs;}  '(' parameters+=primaryExpression  { hs.addParam($primaryExpression.value);}(',' parameters+=primaryExpression { hs.addParam($primaryExpression.value);})* ')'
    | hintExpression
    ;

hintExpression returns [ AST value]
    : hintPredicated { $value = $hintPredicated.value; }
    | left=hintExpression operator=AND right=hintExpression {  $value = new AND($left.value, $right.value);}
    | left=hintExpression operator=OR right=hintExpression {  $value = new OR($left.value, $right.value);}
    ;

hintPredicated returns [ AST value]
    : v=hintValueExpression (hintPredicate)? {  $value = new HintPredicated($v.value, $hintPredicate.value);}
    ;

hintPredicate returns [ AST value]
    @init { boolean not = false;}
    : (NOT { not=true;})? kind=BETWEEN lower=hintValueExpression AND upper=hintValueExpression { $value =new HintPredicateBetween(not, $lower.value,$upper.value);}
    | (NOT { not=true;})? { HintPredicateIN in = new HintPredicateIN(not); $value = in;} kind=IN '(' e=expression { in.addExpr($e.value);} (',' e=expression { in.addExpr($e.value);})* ')'
    ;

hintValueExpression returns [ AST value]
    : s=STRING { $value = new StringLiteral($s.text);}
    | f=identifier '.' l=identifier { QualifiedName qname = new QualifiedName(); qname.addIdentifier($f.value); qname.addIdentifier($l.value); $value = qname;}
    | left=hintValueExpression op=comparisonOperator right=hintValueExpression { $value = new ArithmeticBinary($left.value,$op.text,$right.value);}
    ;



fromClause returns [ FromClause value]
    @init { $value = new FromClause();}
    : FROM
        r=relation {$value.addRelation($r.value);}(',' r=relation {$value.addRelation($r.value);})*
        (l=lateralView { $value.addLateralView($l.value);})*
        (pivotClause { $value.setPivotClause($pivotClause.value);})?
    ;

aggregation returns [ GroupBy value]
    @init { $value = new GroupBy();}
    : GROUP BY ge=expression { $value.addGroupingExpression($ge.value);} (',' ge=expression { $value.addGroupingExpression($ge.value);})* (
      WITH kind=ROLLUP { $value.setWith($kind.text);}
    | WITH kind=CUBE { $value.setWith($kind.text);}
    | kind=GROUPING SETS '(' groupingSet { $value.addGroupingSet($groupingSet.value);} (',' groupingSet { $value.addGroupingSet($groupingSet.value);})* ')')?
    ;

groupingSet returns [ GroupingSet value]
    @init { $value = new GroupingSet();}
    : '(' (expression  { $value.addExpr($expression.value);} (',' expression { $value.addExpr($expression.value);})*)? ')'
    | expression { $value = new GroupingSet($expression.value);}
    ;

pivotClause returns [ PivotClause value]
    : PIVOT '(' aggregates=namedExpressionSeq FOR pivotColumn=identifier { $value=new PivotClause($aggregates.value, $pivotColumn.value); } IN '(' pivotValues+=constant { $value.addPivot($constant.value);} (',' pivotValues+=constant { $value.addPivot($constant.value);})* ')' ')'
    ;

lateralView returns [ LateralView value]
    @init { $value = new LateralView(); }
    : LATERAL VIEW (OUTER { $value.setOuter(true);})? fn=qualifiedName { $value.setFunctionName($fn.value);}
        '(' (expression (',' expression)*)? ')'
        tblName=identifier  { $value.setTableName($tblName.value);}
        (AS? colName=identifier { $value.addAsColumn($colName.value);} (',' colName=identifier { $value.addAsColumn($colName.value);} )* )?
    ;

setQuantifier returns [ AST value]
    : DISTINCT { $value = new DISTINCT();}
    | ALL { $value = new ALL();}
    ;

relation returns [ Relation value]
    : rp=relationPrimary  {  $value = new Relation($rp.value);} (r=joinRelation  { $value.addRelation($r.value);})*
    ;

joinRelation returns [ NaturalJOINRelation value]
    : jt=joinType JOIN right=relationPrimary { $value = new JOINRelation($jt.value, $right.value); JOINRelation jr = (JOINRelation)$value;}
    (jc=joinCriteria { jr.setJoinCriteria($jc.value);})?
    | NATURAL joinType JOIN right=relationPrimary { $value = new NaturalJOINRelation($joinType.value, $right.value);}
    ;

joinType returns [ JOINType value]
    @init { $value = new JOINType(); }
    : (INNER { $value = new InnerJOIN();})?
    | CROSS { $value = new CrossJOIN();}
    | LEFT { $value = new LeftJOIN();} (OUTER { $value.markAsOuter();})?
    | LEFT  SEMI { $value = new LeftSemiJOIN();}
    | RIGHT { $value = new RightJOIN();} (OUTER { $value.markAsOuter();})?
    | FULL { $value = new FullJOIN();} (OUTER { $value.markAsOuter();})?
    | { $value = new JOINType();} (LEFT { $value.markAsLeft();})? ANTI { $value = new AntiJOIN($value.isLeft());}
    ;

joinCriteria returns [AST value]
    : ON b=booleanExpression { $value = new ON($b.value);}
    |  USING  {  USING u = new USING();  $value = u;}
        '('
            i=identifier { u.addIdentifier($i.value);}
            (',' i=identifier {  u.addIdentifier($i.value);} )*
        ')'
    ;

sample returns [AST value]
    : TABLESAMPLE '(' sampleMethod? ')' { $value = new Sample($sampleMethod.value);}
    ;

sampleMethod returns [ AST value]
    : negativeSign=MINUS? percentage=(INTEGER_VALUE | DECIMAL_VALUE) PERCENTLIT { $value = new SampleByPercentile($negativeSign.text, $percentage.text);}  #sampleByPercentile
    | expression ROWS { $value = new SampleByRows($expression.value); }                                                            #sampleByRows
    | sampleType=BUCKET numerator=INTEGER_VALUE OUT OF denominator=INTEGER_VALUE { SampleByBucket sample = new SampleByBucket($numerator.text, $denominator.text); $value = sample;}
        (ON (identifier { sample.setIdentifier($identifier.value); }| qualifiedName '(' ')' { sample.setQualifiedName($qualifiedName.value);}))?                                #sampleByBucket
    | bytes=expression   { $value = new SampleByBytes($bytes.value);}                                                         #sampleByBytes
    ;

identifierList returns [AST value]
    : '(' is=identifierSeq ')' { $value = new IdentifierList($is.value);}
    ;

identifierSeq returns [List value]
    @init{ $value = new ArrayList(); }
    : id=identifier { $value.add($id.value);} (',' identifier { $value.add($id.value);})*
    ;

orderedIdentifierList returns [ OrderedIdentifierList value]
    @init{ $value = new OrderedIdentifierList(); }
    : '(' orderedIdentifier {$value.addIdentifier($orderedIdentifier.value);} (',' orderedIdentifier {$value.addIdentifier($orderedIdentifier.value);})* ')'
    ;

orderedIdentifier returns [ AST value]
    : identifier ordering=(ASC | DESC)? {  $value = new OrderedIdentifier($identifier.value,$ordering.text);}
    ;

identifierCommentList returns [ IdentifierCommentList value]
    : '(' identifierComment { $value = new IdentifierCommentList(); $value.addComment($identifierComment.value);} (',' identifierComment {$value.addComment($identifierComment.value);})* ')'
    ;

identifierComment returns [ IdentifierComment value]
    : identifier { $value = new IdentifierComment($identifier.value);} (COMMENT s=STRING { $value.setComment($s.text);})?
    ;

relationPrimary returns [ AST value ]
    @init { AST sample = null;}
    : i=tableIdentifier (sample {sample = $sample.value;})? a=tableAlias  {  $value = new TableName($i.value,sample,$a.value);}     #tableName
    | '(' q=queryNoWith ')' (sample {sample = $sample.value;})? a=tableAlias { $value = new AliasedQuery($q.value,sample,$a.value);} #aliasedQuery
    | '(' r=relation ')' (sample {sample = $sample.value;})? a=tableAlias  { $value = new AliasedRelation($r.value,sample,$a.value);}   #aliasedRelation
    | inlineTable   { $value = $inlineTable.value; }                          #inlineTableDefault2
    | functionTable     { $value = $functionTable.value; }                      #tableValuedFunction
    ;

inlineTable returns [ InlineTable value]
    @init { $value = new InlineTable();}
    : VALUES expression  { $value.addExpr($expression.value);} (',' expression  { $value.addExpr($expression.value);})* tableAlias {$value.setTableAlias($tableAlias.value);}
    ;

functionTable returns [ FunctionTable value]
    : identifier { $value = new FunctionTable($identifier.value);} '(' (expression { $value.addExpr($expression.value);} (',' expression { $value.addExpr($expression.value);})*)? ')' tableAlias {$value.setTableAlias($tableAlias.value);}
    ;

tableAlias returns [ TableAlias value]
    @init { $value = new TableAlias();}
    : ((AS { $value.setAS(true);})? s=strictIdentifier  { $value.setStrictIdentifier($s.value);} (l=identifierList {$value.setIdentifierList($l.value);})?)?
    ;

rowFormat returns [ AST value]
    : ROW FORMAT SERDE name=STRING (WITH SERDEPROPERTIES props=tablePropertyList)?  #rowFormatSerde
    | ROW FORMAT DELIMITED
      (FIELDS TERMINATED BY fieldsTerminatedBy=STRING (ESCAPED BY escapedBy=STRING)?)?
      (COLLECTION ITEMS TERMINATED BY collectionItemsTerminatedBy=STRING)?
      (MAP KEYS TERMINATED BY keysTerminatedBy=STRING)?
      (LINES TERMINATED BY linesSeparatedBy=STRING)?
      (NULL DEFINED AS nullDefinedAs=STRING)?                                       #rowFormatDelimited
    ;

tableIdentifier returns [AST value]
    @init { TableIdentifier table = new TableIdentifier(); $value = table; }
    : (db=identifier '.' { table.addIdentifier($db.value);})? table=identifier { table.addIdentifier($table.value);}
    ;

functionIdentifier returns [ FunctionIdentifier value]
    @init { $value = new FunctionIdentifier();}
    : (db=identifier '.' { $value.setDb($db.value);})? function=identifier { $value.setFunction($function.value);}
    ;

namedExpression returns [ NamedExpr value]
    : e=expression { $value = new NamedExpr($e.value);}
    ((AS { $value.markAS();})? (id=identifier {$value.addAS($id.value);} | il=identifierList { $value.addAS($il.value);}))?
    ;

namedExpressionSeq returns [ List value]
    @init { $value = new ArrayList();}
    : ne=namedExpression { $value.add($ne.value);} (',' ne=namedExpression { $value.add($ne.value);})*
    ;

expression returns [ AST value ]
    : b=booleanExpression { $value = $b.value;}
    ;

booleanExpression returns [ AST value]
    : NOT b=booleanExpression   { $value = new NOT($b.value);}              #logicalNot
    | EXISTS '(' query ')'   { $value = new EXISTS($query.value);}                                      #exists
    | predicated  { $value = $predicated.value;}                                                 #booleanDefault
    | left=booleanExpression operator=AND right=booleanExpression { $value = new AND($left.value, $right.value);}  #logicalBinary
    | left=booleanExpression operator=OR right=booleanExpression  { $value = new OR($left.value, $right.value);} #logicalBinary
    ;

// workaround for:
//  https://github.com/antlr/antlr4/issues/780
//  https://github.com/antlr/antlr4/issues/781
predicated returns [ Predicated value]
    : v=valueExpression { $value = new Predicated($v.value);} (predicate { $value.setPredicate($predicate.value);})?
    ;

predicate returns [ Predicate value]
    @init { $value = new Predicate();}
    : (NOT{ $value.setNot(true);})? kind=BETWEEN lower=valueExpression AND upper=valueExpression { $value = new Between( $value.isNot(),$lower.value,$upper.value );}
    | (NOT{ $value.setNot(true);})? kind=IN { $value = new InList($value.isNot());} '(' e=expression { {InList in = (InList)$value; in.addExpr($e.value);} } (',' e=expression { {InList in = (InList)$value; in.addExpr($e.value);} })* ')'
    | (NOT{ $value.setNot(true);})? kind=IN '(' query ')' { $value = new InQuery($value.isNot(), $query.value);}
    | (NOT{ $value.setNot(true);})? kind=(RLIKE | LIKE) pattern=valueExpression { $value = new Like($value.isNot(), $kind.text, $pattern.value);}
    | IS (NOT{ $value.setNot(true);})? kind=NULL { $value = new IsNULL($value.isNot());}
    | IS (NOT{ $value.setNot(true);})? kind=DISTINCT FROM right=valueExpression { $value = new IsDISTINCT($value.isNot(), $right.value); }
    ;

valueExpression returns [ AST value]
    : pe=primaryExpression   { $value = $pe.value;}                                                                   #valueExpressionDefault
    | operator=(MINUS | PLUS | TILDE) ve=valueExpression { $value = new ArithmeticUnary($operator.text, $ve.value);}  #arithmeticUnary
    | left=valueExpression operator=(ASTERISK | SLASH | PERCENT | DIV) right=valueExpression { $value = new ArithmeticBinary($left.value,$operator.text,$right.value); }  #arithmeticBinary
    | left=valueExpression operator=(PLUS | MINUS | CONCAT_PIPE) right=valueExpression   { $value = new ArithmeticBinary($left.value,$operator.text,$right.value); }     #arithmeticBinary
    | left=valueExpression operator=AMPERSAND right=valueExpression  { $value = new ArithmeticBinary($left.value,$operator.text,$right.value); }                         #arithmeticBinary
    | left=valueExpression operator=HAT right=valueExpression  { $value = new ArithmeticBinary($left.value,$operator.text,$right.value); }                               #arithmeticBinary
    | left=valueExpression operator=PIPE right=valueExpression   { $value = new ArithmeticBinary($left.value,$operator.text,$right.value); }                             #arithmeticBinary
    | left=valueExpression op=comparisonOperator right=valueExpression     { $value = new ArithmeticBinary($left.value,$op.text,$right.value); }                      #comparison
    ;

primaryExpression returns [ AST value]
    : CASE { CASE c = new CASE(); $value = c; } (whenClause { c.addWhen($whenClause.value);})+ (ELSE elseExpression=expression { c.setElseExpr($elseExpression.value);})? END                                   #searchedCase
    | CASE expr=expression { CASE c = new CASE($expr.value); $value = c; } (whenClause{ c.addWhen($whenClause.value);})+ (ELSE elseExpression=expression { c.setElseExpr($elseExpression.value);})? END                  #simpleCase
    | CAST '(' expr=expression AS dataType ')'   { $value = new CAST($expr.value,$dataType.value);  }                                                   #cast
    | STRUCT '(' (argument+=namedExpression { STRUCT struct = new STRUCT($namedExpression.value); $value = struct;} (',' argument+=namedExpression { struct.addArgument($namedExpression.value); } )*)? ')'             #struct
    | FIRST '(' expression { FIRST first = new FIRST($expression.value); $value = first;} (IGNORE NULLS { first.setIgnore(true);} )? ')'                                                 #first
    | LAST '(' expression { LAST last = new LAST($expression.value); $value = last;} (IGNORE NULLS { last.setIgnore(true); })? ')'                                                  #last
    | POSITION '(' substr=valueExpression IN str=valueExpression ')' { $value = new POSITION($substr.value,$str.value);}                          #position
    | constant  {$value = $constant.value;}                                                                               #constantDefault
    | ASTERISK  { $value = new Star();}                                                                               #star
    | qualifiedName '.' ASTERISK  { $value = new Star($qualifiedName.value);}                                                             #star
    | '(' namedExpression { RowConstructor rc = new RowConstructor($namedExpression.value); $value = rc;} (',' namedExpression { rc.addRow($namedExpression.value);} )+ ')'                                           #rowConstructor
    | '(' query ')'   { $value = new SubQuery($query.value); }                                                                         #subqueryExpression
    | qualifiedName { AST quantifier = null; FunctionCall fc = new FunctionCall($qualifiedName.value);  $value = fc;}
        '(' ((sq=setQuantifier { quantifier = $sq.value; })? expression { fc.addArgument(new Argument(quantifier,$expression.value));} (',' expression { fc.addArgument(new Argument($expression.value));})*)? ')'
       (OVER w=windowSpec { fc.setWindowSpec($w.value);})?                                                                      #functionCall
    | qualifiedName '(' trimOption=(BOTH | LEADING | TRAILING) { TrimFunctionCall fc = new TrimFunctionCall($qualifiedName.value,$trimOption.text); $value = fc;} argument+=expression {fc.addArgument($expression.value); }
      FROM argument+=expression  {fc.addArgument($expression.value); } ')'                                                            #functionCall
    | pe=primaryExpression '[' index=valueExpression ']'  { $value = new SubScript($pe.value,$index.value);}                                   #subscript
    | identifier  { $value = $identifier.value;}                                                                              #columnReference
    | base=primaryExpression '.' fieldName=identifier   { $value = new Dereference($base.value,$fieldName.value);}                                       #dereference
    | '(' expression ')' { $value = new ParenthesizedExpression($expression.value);}                                                                      #parenthesizedExpression
    ;

constant returns [ AST value]
    : NULL  { $value = new NULL();}                                                                                   #nullLiteral
    | i=interval { $value = $i.value;}                                                                                #intervalLiteral
    | i=identifier s=STRING  { $value = new TypeConstructor($i.value,$s.text);}                                                                      #typeConstructor
    | number  { $value = $number.value;}                                                                                 #numericLiteral
    | booleanValue   { $value = $booleanValue.value;}                                                                           #booleanLiteral
    |  ( s=STRING { $value = new StringLiteral($s.text);})+                                                  #stringLiteral
    ;

comparisonOperator returns [ String text]
    : c= ( EQ | NEQ | NEQJ | LT | LTE | GT | GTE | NSEQ ) { $text = $c.text;}
    ;

arithmeticOperator returns [ String text]
    : c=(PLUS | MINUS | ASTERISK | SLASH | PERCENT | DIV | TILDE | AMPERSAND | PIPE | CONCAT_PIPE | HAT)  { $text = $c.text;}
    ;

predicateOperator returns [ String text]
    : c=(OR | AND | IN | NOT) { $text = $c.text;}
    ;

booleanValue returns [ BoolValue value]
    : TRUE { $value = new BoolValue(true);} | FALSE { $value = new BoolValue(false);}
    ;

interval returns [ INTERVAL value ]
    @init {  $value = new INTERVAL();}
    : INTERVAL (intervalField { $value.addIntervalField($intervalField.value);})*
    ;

intervalField returns [ IntervalField value]
    : iv=intervalValue unit=identifier (TO to=identifier)?
    ;

intervalValue returns [ IntervalValue value]
    @init{ $value = new IntervalValue(); }
    : (s=(PLUS | MINUS) { $value.setSign($s.text);})? v=(INTEGER_VALUE | DECIMAL_VALUE) {  $value.setValue($v.text);}
    | v=STRING {  $value.setValue($v.text);}
    ;

colPosition returns [ AST value]
    : f=FIRST { $value = new ColPosition($f.text);} | f=AFTER identifier { $value = new ColPosition($f.text, $identifier.value);}
    ;

dataType returns [ DataType value ]
    : complex=ARRAY '<' dataType '>'  { $value = new ARRAY($dataType.value);  }                          #complexDataType
    | complex=MAP '<' k=dataType ',' v=dataType '>'   { $value = new MAP($k.value, $v.value);}               #complexDataType
    | complex=STRUCT  { ComplexDataType struct = new ComplexDataType(); $value=struct;}('<' (c=complexColTypeList { struct.setComplexColTypeList($c.value);})?  '>' | NEQ { struct.setNeq(new NEQ());})        #complexDataType
    | i=identifier { PrimitiveDataType pdt = new PrimitiveDataType($i.value); $value= pdt; } ('(' v=INTEGER_VALUE { pdt.addValue(new IntegerValue($v.text));  } (',' v=INTEGER_VALUE { pdt.addValue(new IntegerValue($v.text)); } )* ')')?  #primitiveDataType
    ;

colTypeList returns [ List value ]
    @init{ $value = new ArrayList(); }
    : colType { $value.add($colType.value);} (',' colType { $value.add($colType.value);})*
    ;

colType returns [ ColType value ]
    : identifier dataType {$value = new ColType($identifier.value, $dataType.value); }(COMMENT s=STRING { $value.setComment($s.text);})?
    ;

complexColTypeList returns [ List value ]
    @init{ $value = new ArrayList(); }
    : complexColType { $value.add($complexColType.value);} (',' complexColType { $value.add($complexColType.value);} )*
    ;

complexColType returns [ ComplexColType value ]
    : identifier ':' dataType { $value = new ComplexColType($identifier.value, $dataType.value);}  (COMMENT s=STRING { $value.setComment($s.text);})?
    ;

whenClause returns [ AST value ]
    : WHEN condition=expression THEN result=expression { $value = new WhenClause($condition.value, $result.value); }
    ;

windows returns [ Windows value]
    @init { $value = new Windows();}
    : WINDOW namedWindow { $value.addWindow($namedWindow.value);} (',' namedWindow { $value.addWindow($namedWindow.value);})*
    ;

namedWindow returns [ AST value]
    : identifier AS windowSpec { $value = new NamedWindow($identifier.value,$windowSpec.value);}
    ;

windowSpec returns [ WindowSpec value ]
    @init { $value = new WindowSpec();}
    : name=identifier {$value = new WindowSpec($name.value); }  #windowRef
    | '('
      ( pname=CLUSTER { $value = new WindowSpec($pname.text); } BY partition+=expression { $value.addPartition($expression.value);} (',' partition+=expression { $value.addPartition($expression.value);})*
      | (pname=(PARTITION | DISTRIBUTE) { $value = new WindowSpec($pname.text); } BY partition+=expression { $value.addPartition($expression.value);} (',' partition+=expression { $value.addPartition($expression.value);})*)?
        (sname=(ORDER | SORT) { $value.setSortMethod($sname.text);} BY sortItem { $value.addSortItem($sortItem.value);} (',' sortItem { $value.addSortItem($sortItem.value);})*)?)
      (windowFrame { $value.setWindowFrame($windowFrame.value);})?
      ')'              #windowDef
    ;

windowFrame returns [ WindowFrame value ]
    : frameType=RANGE s=frameBound { $value = new WindowFrame($frameType.text,$s.value); }
    | frameType=ROWS s=frameBound { $value = new WindowFrame($frameType.text, $s.value);}
    | frameType=RANGE BETWEEN s=frameBound AND end=frameBound { $value = new WindowFrame($frameType.text, $s.value, $end.value);}
    | frameType=ROWS BETWEEN s=frameBound AND end=frameBound { $value = new WindowFrame($frameType.text, $s.value, $end.value);}
    ;

frameBound returns [ FrameBound value]
    : UNBOUNDED boundType=(PRECEDING | FOLLOWING) { $value = new FrameBound($boundType.text); $value.setBoundType($UNBOUNDED.text); }
    | boundType=CURRENT ROW { $value = new FrameBound($boundType.text); $value.setBoundType($ROW.text); }
    | expression boundType=(PRECEDING | FOLLOWING) { $value = new FrameBound($boundType.text); $value.setExpr($expression.value); }
    ;

qualifiedName returns [ QualifiedName value]
    @init { $value = new QualifiedName();}
    : i=identifier { $value.addIdentifier($i.value); } ('.' i=identifier { $value.addIdentifier($i.value); })*
    ;

identifier returns [ AST value]
    : s=strictIdentifier { $value = $s.value;}
    | t=(ANTI | FULL | INNER | LEFT | SEMI | RIGHT | NATURAL | JOIN | CROSS | ON
    | UNION | INTERSECT | EXCEPT | SETMINUS) { $value = new Identifier($t.text); }
    ;

strictIdentifier returns [ Identifier value]
    : i=IDENTIFIER  { $value = new Identifier($i.text);}           #unquotedIdentifier
    | q=quotedIdentifier  { $value = $q.value;}     #quotedIdentifierAlternative
    | n=nonReserved    { $value = new Identifier($n.value); }        #unquotedIdentifier
    ;

quotedIdentifier returns [ Identifier value]
    : b=BACKQUOTED_IDENTIFIER {$value = new Identifier($b.text); $value.setQuoted(true); }
    ;

number returns [ NumberValue value]
    @init { $value = new NumberValue();}
    : (MINUS {$value.setMinus(true);})? v=DECIMAL_VALUE { $value = new DecimalValue($value.isMinus(),$v.text);}           #decimalLiteral
    | (MINUS {$value.setMinus(true);})? v=INTEGER_VALUE   { $value = new IntegerValue($value.isMinus(),$v.text);}         #integerLiteral
    | (MINUS {$value.setMinus(true);})? v=BIGINT_LITERAL { $value = new BigIntValue($value.isMinus(),$v.text);}          #bigIntLiteral
    | (MINUS {$value.setMinus(true);})? v=SMALLINT_LITERAL { $value = new SmallIntValue($value.isMinus(),$v.text);}        #smallIntLiteral
    | (MINUS {$value.setMinus(true);})? v=TINYINT_LITERAL  { $value= new TinyIntValue($value.isMinus(),$v.text);}        #tinyIntLiteral
    | (MINUS {$value.setMinus(true);})? v=DOUBLE_LITERAL  { $value = new DoubleValue($value.isMinus(),$v.text);}         #doubleLiteral
    | (MINUS {$value.setMinus(true);})? v=BIGDECIMAL_LITERAL  { $value = new BigDecimalValue($value.isMinus(),$v.text);}     #bigDecimalLiteral
    ;

nonReserved returns [String value]
    : t=(SHOW | TABLES | COLUMNS | COLUMN | PARTITIONS | FUNCTIONS | DATABASES
    | ADD
    | OVER | PARTITION | RANGE | ROWS | PRECEDING | FOLLOWING | CURRENT | ROW | LAST | FIRST | AFTER
    | MAP | ARRAY | STRUCT
    | PIVOT | LATERAL | WINDOW | REDUCE | TRANSFORM | SERDE | SERDEPROPERTIES | RECORDREADER
    | DELIMITED | FIELDS | TERMINATED | COLLECTION | ITEMS | KEYS | ESCAPED | LINES | SEPARATED
    | EXTENDED | REFRESH | CLEAR | CACHE | UNCACHE | LAZY | GLOBAL | TEMPORARY | OPTIONS
    | GROUPING | CUBE | ROLLUP
    | EXPLAIN | FORMAT | LOGICAL | FORMATTED | CODEGEN | COST
    | TABLESAMPLE | USE | TO | BUCKET | PERCENTLIT | OUT | OF
    | SET | RESET
    | VIEW | REPLACE
    | IF
    | POSITION
    | NO | DATA
    | START | TRANSACTION | COMMIT | ROLLBACK | IGNORE
    | SORT | CLUSTER | DISTRIBUTE | UNSET | TBLPROPERTIES | SKEWED | STORED | DIRECTORIES | LOCATION
    | EXCHANGE | ARCHIVE | UNARCHIVE | FILEFORMAT | TOUCH | COMPACT | CONCATENATE | CHANGE
    | CASCADE | RESTRICT | BUCKETS | CLUSTERED | SORTED | PURGE | INPUTFORMAT | OUTPUTFORMAT
    | DBPROPERTIES | DFS | TRUNCATE | COMPUTE | LIST
    | STATISTICS | ANALYZE | PARTITIONED | EXTERNAL | DEFINED | RECORDWRITER
    | REVOKE | GRANT | LOCK | UNLOCK | MSCK | REPAIR | RECOVER | EXPORT | IMPORT | LOAD | VALUES | COMMENT | ROLE
    | ROLES | COMPACTIONS | PRINCIPALS | TRANSACTIONS | INDEX | INDEXES | LOCKS | OPTION | LOCAL | INPATH
    | ASC | DESC | LIMIT | RENAME | SETS
    | AT | NULLS | OVERWRITE | ALL | ANY | ALTER | AS | BETWEEN | BY | CREATE | DELETE
    | DESCRIBE | DROP | EXISTS | FALSE | FOR | GROUP | IN | INSERT | INTO | IS |LIKE
    | NULL | ORDER | OUTER | TABLE | TRUE | WITH | RLIKE
    | AND | CASE | CAST | DISTINCT | DIV | ELSE | END | FUNCTION | INTERVAL | MACRO | OR | STRATIFY | THEN
    | UNBOUNDED | WHEN
    | DATABASE | SELECT | FROM | WHERE | HAVING | TO | TABLE | WITH | NOT
    | DIRECTORY
    | BOTH | LEADING | TRAILING) { $value = $t.text; }
    ;

SELECT: S E L E C T;
FROM:  F R O M;
ADD: A D D;
AS: A S;
ALL: A L L ;
ANY: A N Y;
DISTINCT: D I S T I N C T;
WHERE: W H E R E;
GROUP: G R O U P;
BY: B Y;
GROUPING: G R O U P I N G;
SETS: S E T S;
CUBE: C U B E;
ROLLUP: R O L L U P;
ORDER: O R D E R;
HAVING: H A V I N G;
LIMIT: L I M I T;
AT: A T;
OR: O R;
AND: A N D;
IN: I N;
NOT: N O T | '!';
NO: N O;
EXISTS: E X I S T S;
BETWEEN: B E T W E E N ;
LIKE: L I K E;
RLIKE: R L I K E | R E G E X P;
IS: I S ;
NULL: N U L L;
TRUE: T R U E;
FALSE: F A L S E;
NULLS: N U L L S;
ASC: A S C;
DESC: D E S C;
FOR: F O R;
INTERVAL: I N T E R V A L;
CASE: C A S E;
WHEN: W H E N;
THEN: T H E N;
ELSE: E L S E;
END: E N D;
JOIN: J O I N;
CROSS: C R O S S;
OUTER: O U T E R;
INNER: I N N E R;
LEFT: L E F T;
SEMI: S E M I;
RIGHT: R I G H T;
FULL: F U L L;
NATURAL: N A T U R A L;
ON: O N;
PIVOT: P I V O T;
LATERAL: L A T E R A L;
WINDOW: W I N D O W ;
OVER: O V E R;
PARTITION: P A R T I T I O N;
RANGE: R A N G E ;
ROWS: R O W S;
UNBOUNDED: U N B O U N D E D;
PRECEDING: P R E C E D I N G;
FOLLOWING: F O L L O W I N G ;
CURRENT: C U R R E N T ;
FIRST: F I R S T;
AFTER: A F T E R;
LAST: L A S T ;
ROW: R O W;
WITH: W I T H ;
VALUES: V A L U E S;
CREATE: C R E A T E;
TABLE: T A B L E;
DIRECTORY: D I R E C T O R Y;
VIEW: V I E W ;
REPLACE: R E P L A C E;
INSERT: I N S E R T ;
DELETE: D E L E T E;
INTO: I N T O;
DESCRIBE: D E S C R I B E ;
EXPLAIN: E X P L A I N ;
FORMAT: F O R M A T;
LOGICAL: L O G I C A L;
CODEGEN: C O D E G E N;
COST: C O S T;
CAST: C A S T ;
SHOW: S H O W ;
TABLES: T A B L E S;
COLUMNS: C O L U M N S;
COLUMN: C O L U M N;
USE: U S E;
PARTITIONS: P A R T I T I O N S;
FUNCTIONS: F U N C T I O N S;
DROP: D R O P ;
UNION: U N I O N;
EXCEPT: E X C E P T ;
SETMINUS: M I N U S;
INTERSECT: I N T E R S E C T;
TO: T O;
TABLESAMPLE: T A B L E S A M P L E;
STRATIFY: S T R A T I F Y;
ALTER: A L T E R;
RENAME: R E N A M E;
ARRAY: A R R A Y;
MAP: M A P;
STRUCT: S T R U C T;
COMMENT: C O M M E N T ;
SET: S E T ;
RESET: R E S E T;
DATA: D A T A;
START: S T A R T;
TRANSACTION: T R A N S A C T I O N;
COMMIT: C O M M I T;
ROLLBACK: R O L L B A C K;
MACRO: M A C R O;
IGNORE: I G N O R E;
BOTH: B O T H;
LEADING: L E A D I N G;
TRAILING: T R A I L I N G;

IF: I F;
POSITION: P O S I T I O N;

EQ  : '=' | '==';
NSEQ: '<=>';
NEQ : '<>';
NEQJ: '!=';
LT  : '<';
LTE : '<=' | '!>';
GT  : '>';
GTE : '>=' | '!<';

PLUS: '+';
MINUS: '-';
ASTERISK: '*';
SLASH: '/';
PERCENT: '%';
DIV: 'DIV';
TILDE: '~';
AMPERSAND: '&';
PIPE: '|';
CONCAT_PIPE: '||';
HAT: '^';

PERCENTLIT: P E R C E N T;
BUCKET: B U C K E T;
OUT: O U T ;
OF: O F;

SORT: S O R T;
CLUSTER: C L U S T E R;
DISTRIBUTE: D I S T R I B U T E;
OVERWRITE: O V E R W R I T E;
TRANSFORM: T R A N S F O R M;
REDUCE: R E D U C E;
USING: U S I N G ;
SERDE: S E R D E;
SERDEPROPERTIES: S E R D E P R O P E R T I E S;
RECORDREADER: R E C O R D R E A D E R;
RECORDWRITER: R E C O R D W R I T E R;
DELIMITED: D E L I M I T E D;
FIELDS: F I E L D S;
TERMINATED: T E R M I N A T E D;
COLLECTION: C O L L E C T I O N;
ITEMS: I T E M S;
KEYS: K E Y S;
ESCAPED: E S C A P E D;
LINES: L I N E S;
SEPARATED: S E P A R A T E D;
FUNCTION: F U N C T I O N;
EXTENDED: E X T E N D E D;
REFRESH: R E F R E S H;
CLEAR: C L E A R;
CACHE: C A C H E ;
UNCACHE: U N C A C H E;
LAZY: L A Z Y;
FORMATTED: F O R M A T T E D;
GLOBAL: G L O B A L;
TEMPORARY: T E M P O R A R Y  | T E M P;
OPTIONS: O P T I O N S;
UNSET: U N S E T;
TBLPROPERTIES: T B L P R O P E R T I E S;
DBPROPERTIES: D B P R O P E R T I E S;
BUCKETS: B U C K E T S;
SKEWED: S K E W E D;
STORED: S T O R E D;
DIRECTORIES: D I R E C T O R I E S;
LOCATION: L O C A T I O N;
EXCHANGE: E X C H A N G E;
ARCHIVE: A R C H I V E;
UNARCHIVE: U N A R C H I V E;
FILEFORMAT: F I L E F O R M A T;
TOUCH: T O U C H ;
COMPACT: C O M P A C T;
CONCATENATE: C O N C A T E N A T E;
CHANGE: C H A N G E;
CASCADE: C A S C A D E;
RESTRICT: R E S T R I C T;
CLUSTERED: C L U S T E R E D;
SORTED: S O R T E D;
PURGE: P U R G E;
INPUTFORMAT: I N P U T F O R M A T;
OUTPUTFORMAT: O U T P U T F O R M A T;
DATABASE: D A T A B A S E | S C H E M A;
DATABASES: D A T A B A S E S | S C H E M A S;
DFS: D F S ;
TRUNCATE: T R U N C A T E;
ANALYZE: A N A L Y Z E;
COMPUTE: C O M P U T E;
LIST: L I S T;
STATISTICS: S T A T I S T I C S ;
PARTITIONED: P A R T I T I O N E D;
EXTERNAL: E X T E R N A L;
DEFINED: D E F I N E D;
REVOKE: R E V O K E ;
GRANT: G R A N T;
LOCK: L O C K ;
UNLOCK: U N L O C K ;
MSCK: M S C K;
REPAIR: R E P A I R;
RECOVER: R E C O V E R;
EXPORT: E X P O R T ;
IMPORT: I M P O R T;
LOAD: L O A D;
ROLE: R O L E;
ROLES: R O L E S;
COMPACTIONS:  C O M P A C T I O N S ;
PRINCIPALS: P R I N C I P A L S;
TRANSACTIONS: T R A N S A C T I O N S;
INDEX: I N D E X;
INDEXES: I N D E X E S;
LOCKS: L O C K S;
OPTION: O P T I O N;
ANTI: A N T I;
LOCAL: L O C A L;
INPATH: I N P A T H;



fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

STRING
    : '\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    | '"' ( ~('"'|'\\') | ('\\' .) )* '"'
    ;

BIGINT_LITERAL
    : DIGIT+ 'L'
    ;

SMALLINT_LITERAL
    : DIGIT+ 'S'
    ;

TINYINT_LITERAL
    : DIGIT+ 'Y'
    ;

INTEGER_VALUE
    : DIGIT+
    ;

DECIMAL_VALUE
    : DIGIT+ EXPONENT
    | DECIMAL_DIGITS EXPONENT? {isValidDecimal()}?
    ;

DOUBLE_LITERAL
    : DIGIT+ EXPONENT? 'D'
    | DECIMAL_DIGITS EXPONENT? 'D' {isValidDecimal()}?
    ;

BIGDECIMAL_LITERAL
    : DIGIT+ EXPONENT? 'BD'
    | DECIMAL_DIGITS EXPONENT? 'BD' {isValidDecimal()}?
    ;

IDENTIFIER
    : (LETTER | DIGIT | '_')+
    ;

BACKQUOTED_IDENTIFIER
    : '`' ( ~'`' | '``' )* '`'
    ;

fragment DECIMAL_DIGITS
    : DIGIT+ '.' DIGIT*
    | '.' DIGIT+
    ;

fragment EXPONENT
    : 'E' [+-]? DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [A-Za-z]
    ;

SIMPLE_COMMENT
    : '--' ~[\r\n]* '\r'? '\n'? -> channel(HIDDEN)
    ;

BRACKETED_EMPTY_COMMENT
    : '/**/' -> channel(HIDDEN)
    ;

BRACKETED_COMMENT
    : '/*' ~[+] .*? '*/' -> channel(HIDDEN)
    ;

WS
    : [ \r\n\t]+ -> channel(HIDDEN)
    ;

// Catch-all for anything we can't recognize.
// We use this to be able to ignore and recover all the text
// when splitting statements with DelimiterLexer
UNRECOGNIZED
    : .
    ;
