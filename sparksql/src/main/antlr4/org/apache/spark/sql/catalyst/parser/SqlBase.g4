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
  import name.lsg.grammar.tree.*;
  import name.lsg.grammar.tree.join.*;
  import name.lsg.grammar.tree.relation.*;
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

singleStatement
    : statement EOF
    ;

singleExpression
    : namedExpression EOF
    ;

singleTableIdentifier
    : tableIdentifier EOF
    ;

singleFunctionIdentifier
    : functionIdentifier EOF
    ;

singleDataType
    : dataType EOF
    ;

singleTableSchema
    : colTypeList EOF
    ;

statement returns [ AST value]
    : query  { $value = $query.value; }                                #statementDefault
    | USE db=identifier                                                #use
    | CREATE DATABASE (IF NOT EXISTS)? identifier
        (COMMENT comment=STRING)? locationSpec?
        (WITH DBPROPERTIES tablePropertyList)?                         #createDatabase
    | ALTER DATABASE identifier SET DBPROPERTIES tablePropertyList     #setDatabaseProperties
    | DROP DATABASE (IF EXISTS)? identifier (RESTRICT | CASCADE)?      #dropDatabase
    | createTableHeader ('(' colTypeList ')')? tableProvider
        ((OPTIONS options=tablePropertyList) |
        (PARTITIONED BY partitionColumnNames=identifierList) |
        bucketSpec |
        locationSpec |
        (COMMENT comment=STRING) |
        (TBLPROPERTIES tableProps=tablePropertyList))*
        (AS? query)?                                                   #createTable
    | createTableHeader ('(' columns=colTypeList ')')?
        ((COMMENT comment=STRING) |
        (PARTITIONED BY '(' partitionColumns=colTypeList ')') |
        bucketSpec |
        skewSpec |
        rowFormat |
        createFileFormat |
        locationSpec |
        (TBLPROPERTIES tableProps=tablePropertyList))*
        (AS? query)?                                                   #createHiveTable
    | CREATE TABLE (IF NOT EXISTS)? target=tableIdentifier
        LIKE source=tableIdentifier locationSpec?                      #createTableLike
    | ANALYZE TABLE tableIdentifier partitionSpec? COMPUTE STATISTICS
        (identifier | FOR COLUMNS identifierSeq)?                      #analyze
    | ALTER TABLE tableIdentifier
        ADD COLUMNS '(' columns=colTypeList ')'                        #addTableColumns
    | ALTER (TABLE | VIEW) from=tableIdentifier
        RENAME TO to=tableIdentifier                                   #renameTable
    | ALTER (TABLE | VIEW) tableIdentifier
        SET TBLPROPERTIES tablePropertyList                            #setTableProperties
    | ALTER (TABLE | VIEW) tableIdentifier
        UNSET TBLPROPERTIES (IF EXISTS)? tablePropertyList             #unsetTableProperties
    | ALTER TABLE tableIdentifier partitionSpec?
        CHANGE COLUMN? identifier colType colPosition?                 #changeColumn
    | ALTER TABLE tableIdentifier (partitionSpec)?
        SET SERDE STRING (WITH SERDEPROPERTIES tablePropertyList)?     #setTableSerDe
    | ALTER TABLE tableIdentifier (partitionSpec)?
        SET SERDEPROPERTIES tablePropertyList                          #setTableSerDe
    | ALTER TABLE tableIdentifier ADD (IF NOT EXISTS)?
        partitionSpecLocation+                                         #addTablePartition
    | ALTER VIEW tableIdentifier ADD (IF NOT EXISTS)?
        partitionSpec+                                                 #addTablePartition
    | ALTER TABLE tableIdentifier
        from=partitionSpec RENAME TO to=partitionSpec                  #renameTablePartition
    | ALTER TABLE tableIdentifier
        DROP (IF EXISTS)? partitionSpec (',' partitionSpec)* PURGE?    #dropTablePartitions
    | ALTER VIEW tableIdentifier
        DROP (IF EXISTS)? partitionSpec (',' partitionSpec)*           #dropTablePartitions
    | ALTER TABLE tableIdentifier partitionSpec? SET locationSpec      #setTableLocation
    | ALTER TABLE tableIdentifier RECOVER PARTITIONS                   #recoverPartitions
    | DROP TABLE (IF EXISTS)? tableIdentifier PURGE?                   #dropTable
    | DROP VIEW (IF EXISTS)? tableIdentifier                           #dropTable
    | CREATE (OR REPLACE)? (GLOBAL? TEMPORARY)?
        VIEW (IF NOT EXISTS)? tableIdentifier
        identifierCommentList? (COMMENT STRING)?
        (PARTITIONED ON identifierList)?
        (TBLPROPERTIES tablePropertyList)? AS query                    #createView
    | CREATE (OR REPLACE)? GLOBAL? TEMPORARY VIEW
        tableIdentifier ('(' colTypeList ')')? tableProvider
        (OPTIONS tablePropertyList)?                                   #createTempViewUsing
    | ALTER VIEW tableIdentifier AS? query                             #alterViewQuery
    | CREATE (OR REPLACE)? TEMPORARY? FUNCTION (IF NOT EXISTS)?
        qualifiedName AS className=STRING
        (USING resource (',' resource)*)?                              #createFunction
    | DROP TEMPORARY? FUNCTION (IF EXISTS)? qualifiedName              #dropFunction
    | EXPLAIN (LOGICAL | FORMATTED | EXTENDED | CODEGEN | COST)?
        statement                                                      #explain
    | SHOW TABLES ((FROM | IN) db=identifier)?
        (LIKE? pattern=STRING)?                                        #showTables
    | SHOW TABLE EXTENDED ((FROM | IN) db=identifier)?
        LIKE pattern=STRING partitionSpec?                             #showTable
    | SHOW DATABASES (LIKE? pattern=STRING)?                           #showDatabases
    | SHOW TBLPROPERTIES table=tableIdentifier
        ('(' key=tablePropertyKey ')')?                                #showTblProperties
    | SHOW COLUMNS (FROM | IN) tableIdentifier
        ((FROM | IN) db=identifier)?                                   #showColumns
    | SHOW PARTITIONS tableIdentifier partitionSpec?                   #showPartitions
    | SHOW identifier? FUNCTIONS
        (LIKE? (qualifiedName | pattern=STRING))?                      #showFunctions
    | SHOW CREATE TABLE tableIdentifier                                #showCreateTable
    | (DESC | DESCRIBE) FUNCTION EXTENDED? describeFuncName            #describeFunction
    | (DESC | DESCRIBE) DATABASE EXTENDED? identifier                  #describeDatabase
    | (DESC | DESCRIBE) TABLE? option=(EXTENDED | FORMATTED)?
        tableIdentifier partitionSpec? describeColName?                #describeTable
    | REFRESH TABLE tableIdentifier                                    #refreshTable
    | REFRESH (STRING | .*?)                                           #refreshResource
    | CACHE LAZY? TABLE tableIdentifier (AS? query)?                   #cacheTable
    | UNCACHE TABLE (IF EXISTS)? tableIdentifier                       #uncacheTable
    | CLEAR CACHE                                                      #clearCache
    | LOAD DATA LOCAL? INPATH path=STRING OVERWRITE? INTO TABLE
        tableIdentifier partitionSpec?                                 #loadData
    | TRUNCATE TABLE tableIdentifier partitionSpec?                    #truncateTable
    | MSCK REPAIR TABLE tableIdentifier                                #repairTable
    | op=(ADD | LIST) identifier .*?                                   #manageResource
    | SET ROLE .*?                                                     #failNativeCommand
    | SET .*?                                                          #setConfiguration
    | RESET                                                            #resetConfiguration
    | unsupportedHiveNativeCommands .*?                                #failNativeCommand
    ;

unsupportedHiveNativeCommands
    : kw1=CREATE kw2=ROLE
    | kw1=DROP kw2=ROLE
    | kw1=GRANT kw2=ROLE?
    | kw1=REVOKE kw2=ROLE?
    | kw1=SHOW kw2=GRANT
    | kw1=SHOW kw2=ROLE kw3=GRANT?
    | kw1=SHOW kw2=PRINCIPALS
    | kw1=SHOW kw2=ROLES
    | kw1=SHOW kw2=CURRENT kw3=ROLES
    | kw1=EXPORT kw2=TABLE
    | kw1=IMPORT kw2=TABLE
    | kw1=SHOW kw2=COMPACTIONS
    | kw1=SHOW kw2=CREATE kw3=TABLE
    | kw1=SHOW kw2=TRANSACTIONS
    | kw1=SHOW kw2=INDEXES
    | kw1=SHOW kw2=LOCKS
    | kw1=CREATE kw2=INDEX
    | kw1=DROP kw2=INDEX
    | kw1=ALTER kw2=INDEX
    | kw1=LOCK kw2=TABLE
    | kw1=LOCK kw2=DATABASE
    | kw1=UNLOCK kw2=TABLE
    | kw1=UNLOCK kw2=DATABASE
    | kw1=CREATE kw2=TEMPORARY kw3=MACRO
    | kw1=DROP kw2=TEMPORARY kw3=MACRO
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=NOT kw4=CLUSTERED
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=CLUSTERED kw4=BY
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=NOT kw4=SORTED
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=SKEWED kw4=BY
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=NOT kw4=SKEWED
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=NOT kw4=STORED kw5=AS kw6=DIRECTORIES
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=SET kw4=SKEWED kw5=LOCATION
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=EXCHANGE kw4=PARTITION
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=ARCHIVE kw4=PARTITION
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=UNARCHIVE kw4=PARTITION
    | kw1=ALTER kw2=TABLE tableIdentifier kw3=TOUCH
    | kw1=ALTER kw2=TABLE tableIdentifier partitionSpec? kw3=COMPACT
    | kw1=ALTER kw2=TABLE tableIdentifier partitionSpec? kw3=CONCATENATE
    | kw1=ALTER kw2=TABLE tableIdentifier partitionSpec? kw3=SET kw4=FILEFORMAT
    | kw1=ALTER kw2=TABLE tableIdentifier partitionSpec? kw3=REPLACE kw4=COLUMNS
    | kw1=START kw2=TRANSACTION
    | kw1=COMMIT
    | kw1=ROLLBACK
    | kw1=DFS
    | kw1=DELETE kw2=FROM
    ;

createTableHeader
    : CREATE TEMPORARY? EXTERNAL? TABLE (IF NOT EXISTS)? tableIdentifier
    ;

bucketSpec
    : CLUSTERED BY identifierList
      (SORTED BY orderedIdentifierList)?
      INTO INTEGER_VALUE BUCKETS
    ;

skewSpec
    : SKEWED BY identifierList
      ON (constantList | nestedConstantList)
      (STORED AS DIRECTORIES)?
    ;

locationSpec
    : LOCATION STRING
    ;

query returns [ Query value ]
    @init { $value = new Query(); }
    : (ctes {$value.setWith($ctes.value);} )? queryNoWith { $value.setQueryNoWith($queryNoWith.value);}
    ;

insertInto
    : INSERT OVERWRITE TABLE tableIdentifier (partitionSpec (IF NOT EXISTS)?)?                              #insertOverwriteTable
    | INSERT INTO TABLE? tableIdentifier partitionSpec?                                                     #insertIntoTable
    | INSERT OVERWRITE LOCAL? DIRECTORY path=STRING rowFormat? createFileFormat?                            #insertOverwriteHiveDir
    | INSERT OVERWRITE LOCAL? DIRECTORY (path=STRING)? tableProvider (OPTIONS options=tablePropertyList)?   #insertOverwriteDir
    ;

partitionSpecLocation
    : partitionSpec locationSpec?
    ;

partitionSpec
    : PARTITION '(' partitionVal (',' partitionVal)* ')'
    ;

partitionVal
    : identifier (EQ constant)?
    ;

describeFuncName
    : qualifiedName
    | STRING
    | comparisonOperator
    | arithmeticOperator
    | predicateOperator
    ;

describeColName
    : nameParts+=identifier ('.' nameParts+=identifier)*
    ;

ctes returns [ With value]
    @init { $value = new With();}
    : WITH namedQuery  { $value.addNamedQuery($namedQuery.value);} (',' namedQuery { $value.addNamedQuery($namedQuery.value);})*
    ;

namedQuery returns [ AST value]
    : name=identifier AS? '(' query ')' { $value = new NamedQuery($name.value,$query.value); }
    ;

tableProvider
    : USING qualifiedName
    ;

tablePropertyList
    : '(' tableProperty (',' tableProperty)* ')'
    ;

tableProperty
    : key=tablePropertyKey (EQ? value=tablePropertyValue)?
    ;

tablePropertyKey
    : identifier ('.' identifier)*
    | STRING
    ;

tablePropertyValue
    : INTEGER_VALUE
    | DECIMAL_VALUE
    | booleanValue
    | STRING
    ;

constantList
    : '(' constant (',' constant)* ')'
    ;

nestedConstantList
    : '(' constantList (',' constantList)* ')'
    ;

createFileFormat
    : STORED AS fileFormat
    | STORED BY storageHandler
    ;

fileFormat
    : INPUTFORMAT inFmt=STRING OUTPUTFORMAT outFmt=STRING    #tableFileFormat
    | identifier                                             #genericFileFormat
    ;

storageHandler
    : STRING (WITH SERDEPROPERTIES tablePropertyList)?
    ;

resource
    : identifier STRING
    ;

queryNoWith returns [ AST value]
    : insertInto? t=queryTerm o=queryOrganization { $value = new SingleInsertQuery($t.value,$o.value);}                                             #singleInsertQuery
    | fromClause multiInsertQueryBody+                                                     #multiInsertQuery
    ;

queryOrganization returns [ QueryOrganization value]
    @init { $value = new QueryOrganization();}
    : (ORDER BY order=sortItem { $value.addOrderItem($order.value);} (',' order=sortItem { $value.addOrderItem($order.value);})*)?
      (CLUSTER BY clusterBy=expression { $value.addClusterItem($clusterBy.value);} (',' clusterBy=expression { $value.addClusterItem($clusterBy.value);})*)?
      (DISTRIBUTE BY distributeBy=expression { $value.addDistributeItem($distributeBy.value);} (',' distributeBy=expression { $value.addDistributeItem($distributeBy.value);})*)?
      (SORT BY sort=sortItem { $value.addSortItem($sort.value);} (',' sort=sortItem { $value.addSortItem($sort.value);})*)?
      windows?
      (LIMIT (ALL {$value.setLimit(new Limit());}| limit=expression {$value.setLimit(new Limit($limit.value));}))?
    ;

multiInsertQueryBody
    : insertInto?
      querySpecification
      queryOrganization
    ;

queryTerm returns [AST value]
    :  q=queryPrimary  {$value = $q.value;}                                                                       #queryTermDefault
    |  left=queryTerm operator=(INTERSECT | UNION | EXCEPT | SETMINUS) qf=setQuantifier? right=queryTerm
      { $value = new JOIN($left.value,$operator.text,$right.value,$qf.value);}  #setOperation
    ;

queryPrimary returns [AST value]
    : q=querySpecification { $value = new QueryPrimary($q.value);}         #queryPrimaryDefault
    | TABLE tableIdentifier                                                 #table
    | inlineTable                                                           #inlineTableDefault1
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
        | kind=REDUCE namedExpressionSeq))
       inRowFormat=rowFormat?
       (RECORDWRITER recordWriter=STRING)?
       USING script=STRING
       (AS (identifierSeq | colTypeList | ('(' (identifierSeq | colTypeList) ')')))?
       outRowFormat=rowFormat?
       (RECORDREADER recordReader=STRING)?
       fromClause?
       (WHERE where=booleanExpression)?)
    | ((kind=SELECT (hints+=hint { $value.addHint($hint.value);})* (q=setQuantifier {$value.setQuantifier($q.value); })?
        nes=namedExpressionSeq { $value.setNamedExpressionSeq($nes.value); }
        (fc=fromClause { $value.setFromClause($fc.value); })?
       | fc=fromClause { $value.setFromClause($fc.value);} (kind=SELECT (q=setQuantifier {$value.setQuantifier($q.value); })?
         nes=namedExpressionSeq { $value.setNamedExpressionSeq($nes.value); })?)
       (lv=lateralView {$value.addLiteralView($lv.value);} )*
       (WHERE where=booleanExpression { $value.setWhere( new Where($where.value));})?
       (a=aggregation {$value.setAggregation($a.value);})?
       (HAVING having=booleanExpression { $value.setHaving(new Having($having.value));} )?
       (windows)?) {}
    ;

hint returns [ Hint value]
    @init { $value = new Hint();}
    : '/*+' hintStatements+=hintStatement { $value.addStatement($hintStatement.value);}
        (','? hintStatements+=hintStatement { $value.addStatement($hintStatement.value);})* '*/'
    ;

hintStatement returns [ HintStatement value]
    : hintName=identifier
    | hintName=identifier '(' parameters+=primaryExpression (',' parameters+=primaryExpression)* ')'
    | hintExpression
    ;

hintExpression returns [ AST value]
    : hintPredicated
    | left=hintExpression operator=AND right=hintExpression
    | left=hintExpression operator=OR right=hintExpression
    ;

hintPredicated returns [ AST value]
    : v=hintValueExpression (hintPredicate)?
    ;

hintPredicate returns [ AST value]
    : (NOT)? kind=BETWEEN lower=hintValueExpression AND upper=hintValueExpression
    | (NOT)? kind=IN '(' e=expression  (',' e=expression )* ')'
    ;

hintValueExpression returns [ AST value]
    : STRING
    | identifier '.' identifier
    | left=hintValueExpression op=comparisonOperator right=hintValueExpression
    ;



fromClause returns [ FromClause value]
    @init { $value = new FromClause();}
    : FROM
        r=relation {$value.addRelation($r.value);}(',' r=relation {$value.addRelation($r.value);})*
        (l=lateralView { $value.addLateralView($l.value);})*
        pivotClause?
    ;

aggregation returns [ GroupBy value]
    @init { $value = new GroupBy();}
    : GROUP BY ge=expression { $value.addGroupingExpression($ge.value);} (',' ge=expression { $value.addGroupingExpression($ge.value);})* (
      WITH kind=ROLLUP
    | WITH kind=CUBE
    | kind=GROUPING SETS '(' groupingSet (',' groupingSet)* ')')?
    ;

groupingSet
    : '(' (expression (',' expression)*)? ')'
    | expression
    ;

pivotClause
    : PIVOT '(' aggregates=namedExpressionSeq FOR pivotColumn=identifier IN '(' pivotValues+=constant (',' pivotValues+=constant)* ')' ')'
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
    : INNER? { $value = new InnerJOIN();}
    | CROSS { $value = new CrossJOIN();}
    | LEFT { $value = new LeftJOIN();} (OUTER { $value.markAsOuter();})?
    | LEFT  SEMI { $value = new LeftSemiJOIN();}
    | RIGHT { $value = new RightJOIN();} (OUTER { $value.markAsOuter();})?
    | FULL { $value = new FullJOIN();} (OUTER { $value.markAsOuter();})?
    | { $value = new JOINType();} (LEFT { $value.markAsLeft();})? ANTI { $value = new AntiJOIN($value.isLeft());}
    ;

joinCriteria returns [AST value]
    : ON b=booleanExpression { $value = new ON($b.value);}
    |  USING  {  $value = new USING(); }
        '('
            i=identifier { USING u = (USING)$value; u.addIdentifier($i.value);}
            (',' i=identifier {  u.addIdentifier($i.value);} )*
        ')'
    ;

sample returns [AST value]
    : TABLESAMPLE '(' sampleMethod? ')'
    ;

sampleMethod
    : negativeSign=MINUS? percentage=(INTEGER_VALUE | DECIMAL_VALUE) PERCENTLIT   #sampleByPercentile
    | expression ROWS                                                             #sampleByRows
    | sampleType=BUCKET numerator=INTEGER_VALUE OUT OF denominator=INTEGER_VALUE
        (ON (identifier | qualifiedName '(' ')'))?                                #sampleByBucket
    | bytes=expression                                                            #sampleByBytes
    ;

identifierList returns [List value]
    : '(' is=identifierSeq ')' { $value = $is.value;}
    ;

identifierSeq returns [List value]
    @init{ $value = new ArrayList(); }
    : id=identifier { $value.add($id.value);} (',' identifier { $value.add($id.value);})*
    ;

orderedIdentifierList
    : '(' orderedIdentifier (',' orderedIdentifier)* ')'
    ;

orderedIdentifier
    : identifier ordering=(ASC | DESC)?
    ;

identifierCommentList
    : '(' identifierComment (',' identifierComment)* ')'
    ;

identifierComment
    : identifier (COMMENT STRING)?
    ;

relationPrimary returns [ RelationPrimary value ]
    @init { $value = new RelationPrimary();}
    : i=tableIdentifier (sample {$value.setSample($sample.value);})? a=tableAlias  {  $value = new TableName($i.value,$value.getSample(),$a.value);}     #tableName
    | '(' q=queryNoWith ')' (sample {$value.setSample($sample.value);})? a=tableAlias { $value = new AliasedQuery($q.value,$value.getSample(),$a.value);} #aliasedQuery
    | '(' r=relation ')' (sample {$value.setSample($sample.value);})? a=tableAlias  { $value = new AliasedRelation($r.value,$value.getSample(),$a.value);}   #aliasedRelation
    | inlineTable                             #inlineTableDefault2
    | functionTable                           #tableValuedFunction
    ;

inlineTable
    : VALUES expression (',' expression)* tableAlias
    ;

functionTable
    : identifier '(' (expression (',' expression)*)? ')' tableAlias
    ;

tableAlias returns [ TableAlias value]
    @init { $value = new TableAlias();}
    : ((AS { $value.setAS(true);})? s=strictIdentifier  { $value.setStrictIdentifier($s.value);} (l=identifierList {$value.setIdentifierList($l.value);})?)?
    ;

rowFormat
    : ROW FORMAT SERDE name=STRING (WITH SERDEPROPERTIES props=tablePropertyList)?  #rowFormatSerde
    | ROW FORMAT DELIMITED
      (FIELDS TERMINATED BY fieldsTerminatedBy=STRING (ESCAPED BY escapedBy=STRING)?)?
      (COLLECTION ITEMS TERMINATED BY collectionItemsTerminatedBy=STRING)?
      (MAP KEYS TERMINATED BY keysTerminatedBy=STRING)?
      (LINES TERMINATED BY linesSeparatedBy=STRING)?
      (NULL DEFINED AS nullDefinedAs=STRING)?                                       #rowFormatDelimited
    ;

tableIdentifier returns [TableIdentifier value]
    @init { $value = new TableIdentifier();}
    : (db=identifier '.' { $value.addIdentifier($db.value);})? table=identifier { $value.addIdentifier($table.value);}
    ;

functionIdentifier
    : (db=identifier '.')? function=identifier
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
    | EXISTS '(' query ')'                                         #exists
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
    | STRUCT '(' (argument+=namedExpression (',' argument+=namedExpression)*)? ')'             #struct
    | FIRST '(' expression (IGNORE NULLS)? ')'                                                 #first
    | LAST '(' expression (IGNORE NULLS)? ')'                                                  #last
    | POSITION '(' substr=valueExpression IN str=valueExpression ')'                           #position
    | constant  {$value = $constant.value;}                                                                               #constantDefault
    | ASTERISK  { $value = new Star();}                                                                               #star
    | qualifiedName '.' ASTERISK  { $value = new Star($qualifiedName.value);}                                                             #star
    | '(' namedExpression (',' namedExpression)+ ')'                                           #rowConstructor
    | '(' query ')'                                                                            #subqueryExpression
    | qualifiedName { AST quantifier = null; $value = new FunctionCall($qualifiedName.value); FunctionCall fc = (FunctionCall)$value;}
        '(' ((sq=setQuantifier { quantifier = $sq.value; })? expression { fc.addArgument(new Argument(quantifier,$expression.value));} (',' expression { fc.addArgument(new Argument($expression.value));})*)? ')'
       (OVER windowSpec)?                                                                      #functionCall
    | qualifiedName '(' trimOption=(BOTH | LEADING | TRAILING) argument+=expression
      FROM argument+=expression ')'                                                            #functionCall
    | pe=primaryExpression '[' index=valueExpression ']'                                    #subscript
    | identifier  { $value = $identifier.value;}                                                                              #columnReference
    | base=primaryExpression '.' fieldName=identifier   { $value = new Dereference($base.value,$fieldName.value);}                                       #dereference
    | '(' expression ')' { $value = new ParenthesizedExpression($expression.value);}                                                                      #parenthesizedExpression
    ;

constant returns [ AST value]
    : NULL  { $value = new NULL();}                                                                                   #nullLiteral
    | interval                                                                                 #intervalLiteral
    | identifier STRING                                                                        #typeConstructor
    | number  { $value = $number.value;}                                                                                 #numericLiteral
    | booleanValue   { $value = $booleanValue.value;}                                                                           #booleanLiteral
    |  ( s=STRING { $value = new StringLiteral($s.text);})+                                                  #stringLiteral
    ;

comparisonOperator returns [ String text]
    : c= ( EQ | NEQ | NEQJ | LT | LTE | GT | GTE | NSEQ ) { $text = $c.text;}
    ;

arithmeticOperator
    : PLUS | MINUS | ASTERISK | SLASH | PERCENT | DIV | TILDE | AMPERSAND | PIPE | CONCAT_PIPE | HAT
    ;

predicateOperator
    : OR | AND | IN | NOT
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

intervalValue
    : (PLUS | MINUS)? (INTEGER_VALUE | DECIMAL_VALUE)
    | STRING
    ;

colPosition
    : FIRST | AFTER identifier
    ;

dataType returns [ DataType value ]
    : complex=ARRAY '<' dataType '>'  { $value = new ARRAY($dataType.value);  }                          #complexDataType
    | complex=MAP '<' k=dataType ',' v=dataType '>'   { $value = new MAP($k.value, $v.value);}               #complexDataType
    | complex=STRUCT ('<' complexColTypeList? '>' | NEQ)        #complexDataType
    | i=identifier { PrimitiveDataType pdt = new PrimitiveDataType($i.value); $value= pdt; } ('(' v=INTEGER_VALUE { pdt.addValue(new IntegerValue($v.text));  } (',' v=INTEGER_VALUE { pdt.addValue(new IntegerValue($v.text)); } )* ')')?  #primitiveDataType
    ;

colTypeList
    : colType (',' colType)*
    ;

colType
    : identifier dataType (COMMENT STRING)?
    ;

complexColTypeList
    : complexColType (',' complexColType)*
    ;

complexColType
    : identifier ':' dataType (COMMENT STRING)?
    ;

whenClause returns [ AST value ]
    : WHEN condition=expression THEN result=expression { $value = new WhenClause($condition.value, $result.value); }
    ;

windows
    : WINDOW namedWindow (',' namedWindow)*
    ;

namedWindow
    : identifier AS windowSpec
    ;

windowSpec
    : name=identifier  #windowRef
    | '('
      ( CLUSTER BY partition+=expression (',' partition+=expression)*
      | ((PARTITION | DISTRIBUTE) BY partition+=expression (',' partition+=expression)*)?
        ((ORDER | SORT) BY sortItem (',' sortItem)*)?)
      windowFrame?
      ')'              #windowDef
    ;

windowFrame
    : frameType=RANGE start=frameBound
    | frameType=ROWS start=frameBound
    | frameType=RANGE BETWEEN start=frameBound AND end=frameBound
    | frameType=ROWS BETWEEN start=frameBound AND end=frameBound
    ;

frameBound
    : UNBOUNDED boundType=(PRECEDING | FOLLOWING)
    | boundType=CURRENT ROW
    | expression boundType=(PRECEDING | FOLLOWING)
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
