// Generated from org\apache\spark\sql\catalyst\parser\SqlBase.g4 by ANTLR 4.3
package org.apache.spark.sql.catalyst.parser;


  import java.util.regex.Pattern;
  import java.util.*;
  import name.lsg.sparksql.parser.grammar.tree.*;
  import name.lsg.sparksql.parser.grammar.tree.join.*;
  import name.lsg.sparksql.parser.grammar.tree.relation.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		SELECT=10, FROM=11, ADD=12, AS=13, ALL=14, ANY=15, DISTINCT=16, WHERE=17, 
		GROUP=18, BY=19, GROUPING=20, SETS=21, CUBE=22, ROLLUP=23, ORDER=24, HAVING=25, 
		LIMIT=26, AT=27, OR=28, AND=29, IN=30, NOT=31, NO=32, EXISTS=33, BETWEEN=34, 
		LIKE=35, RLIKE=36, IS=37, NULL=38, TRUE=39, FALSE=40, NULLS=41, ASC=42, 
		DESC=43, FOR=44, INTERVAL=45, CASE=46, WHEN=47, THEN=48, ELSE=49, END=50, 
		JOIN=51, CROSS=52, OUTER=53, INNER=54, LEFT=55, SEMI=56, RIGHT=57, FULL=58, 
		NATURAL=59, ON=60, PIVOT=61, LATERAL=62, WINDOW=63, OVER=64, PARTITION=65, 
		RANGE=66, ROWS=67, UNBOUNDED=68, PRECEDING=69, FOLLOWING=70, CURRENT=71, 
		FIRST=72, AFTER=73, LAST=74, ROW=75, WITH=76, VALUES=77, CREATE=78, TABLE=79, 
		DIRECTORY=80, VIEW=81, REPLACE=82, INSERT=83, DELETE=84, INTO=85, DESCRIBE=86, 
		EXPLAIN=87, FORMAT=88, LOGICAL=89, CODEGEN=90, COST=91, CAST=92, SHOW=93, 
		TABLES=94, COLUMNS=95, COLUMN=96, USE=97, PARTITIONS=98, FUNCTIONS=99, 
		DROP=100, UNION=101, EXCEPT=102, SETMINUS=103, INTERSECT=104, TO=105, 
		TABLESAMPLE=106, STRATIFY=107, ALTER=108, RENAME=109, ARRAY=110, MAP=111, 
		STRUCT=112, COMMENT=113, SET=114, RESET=115, DATA=116, START=117, TRANSACTION=118, 
		COMMIT=119, ROLLBACK=120, MACRO=121, IGNORE=122, BOTH=123, LEADING=124, 
		TRAILING=125, IF=126, POSITION=127, EQ=128, NSEQ=129, NEQ=130, NEQJ=131, 
		LT=132, LTE=133, GT=134, GTE=135, PLUS=136, MINUS=137, ASTERISK=138, SLASH=139, 
		PERCENT=140, DIV=141, TILDE=142, AMPERSAND=143, PIPE=144, CONCAT_PIPE=145, 
		HAT=146, PERCENTLIT=147, BUCKET=148, OUT=149, OF=150, SORT=151, CLUSTER=152, 
		DISTRIBUTE=153, OVERWRITE=154, TRANSFORM=155, REDUCE=156, USING=157, SERDE=158, 
		SERDEPROPERTIES=159, RECORDREADER=160, RECORDWRITER=161, DELIMITED=162, 
		FIELDS=163, TERMINATED=164, COLLECTION=165, ITEMS=166, KEYS=167, ESCAPED=168, 
		LINES=169, SEPARATED=170, FUNCTION=171, EXTENDED=172, REFRESH=173, CLEAR=174, 
		CACHE=175, UNCACHE=176, LAZY=177, FORMATTED=178, GLOBAL=179, TEMPORARY=180, 
		OPTIONS=181, UNSET=182, TBLPROPERTIES=183, DBPROPERTIES=184, BUCKETS=185, 
		SKEWED=186, STORED=187, DIRECTORIES=188, LOCATION=189, EXCHANGE=190, ARCHIVE=191, 
		UNARCHIVE=192, FILEFORMAT=193, TOUCH=194, COMPACT=195, CONCATENATE=196, 
		CHANGE=197, CASCADE=198, RESTRICT=199, CLUSTERED=200, SORTED=201, PURGE=202, 
		INPUTFORMAT=203, OUTPUTFORMAT=204, DATABASE=205, DATABASES=206, DFS=207, 
		TRUNCATE=208, ANALYZE=209, COMPUTE=210, LIST=211, STATISTICS=212, PARTITIONED=213, 
		EXTERNAL=214, DEFINED=215, REVOKE=216, GRANT=217, LOCK=218, UNLOCK=219, 
		MSCK=220, REPAIR=221, RECOVER=222, EXPORT=223, IMPORT=224, LOAD=225, ROLE=226, 
		ROLES=227, COMPACTIONS=228, PRINCIPALS=229, TRANSACTIONS=230, INDEX=231, 
		INDEXES=232, LOCKS=233, OPTION=234, ANTI=235, LOCAL=236, INPATH=237, STRING=238, 
		BIGINT_LITERAL=239, SMALLINT_LITERAL=240, TINYINT_LITERAL=241, INTEGER_VALUE=242, 
		DECIMAL_VALUE=243, DOUBLE_LITERAL=244, BIGDECIMAL_LITERAL=245, IDENTIFIER=246, 
		BACKQUOTED_IDENTIFIER=247, SIMPLE_COMMENT=248, BRACKETED_EMPTY_COMMENT=249, 
		BRACKETED_COMMENT=250, WS=251, UNRECOGNIZED=252;
	public static final String[] tokenNames = {
		"<INVALID>", "'*/'", "'('", "'/*+'", "')'", "':'", "'['", "','", "']'", 
		"'.'", "SELECT", "FROM", "ADD", "AS", "ALL", "ANY", "DISTINCT", "WHERE", 
		"GROUP", "BY", "GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", 
		"LIMIT", "AT", "OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", 
		"RLIKE", "IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", 
		"INTERVAL", "CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", 
		"INNER", "LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", "ON", "PIVOT", "LATERAL", 
		"WINDOW", "OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", 
		"FOLLOWING", "CURRENT", "FIRST", "AFTER", "LAST", "ROW", "WITH", "VALUES", 
		"CREATE", "TABLE", "DIRECTORY", "VIEW", "REPLACE", "INSERT", "DELETE", 
		"INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "COST", 
		"CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", 
		"DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", 
		"STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "SET", 
		"RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", 
		"IGNORE", "BOTH", "LEADING", "TRAILING", "IF", "POSITION", "EQ", "'<=>'", 
		"'<>'", "'!='", "'<'", "LTE", "'>'", "GTE", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "PERCENTLIT", "BUCKET", 
		"OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", 
		"REDUCE", "USING", "SERDE", "SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", 
		"DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", 
		"LINES", "SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", 
		"UNCACHE", "LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", 
		"TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", 
		"LOCATION", "EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", 
		"COMPACT", "CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", 
		"SORTED", "PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", 
		"DFS", "TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
		"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
		"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
		"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", 
		"LOCAL", "INPATH", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
		"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "'/**/'", "BRACKETED_COMMENT", 
		"WS", "UNRECOGNIZED"
	};
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_singleTableSchema = 5, 
		RULE_statement = 6, RULE_unsupportedHiveNativeCommands = 7, RULE_createTableHeader = 8, 
		RULE_bucketSpec = 9, RULE_skewSpec = 10, RULE_locationSpec = 11, RULE_query = 12, 
		RULE_insertInto = 13, RULE_partitionSpecLocation = 14, RULE_partitionSpec = 15, 
		RULE_partitionVal = 16, RULE_describeFuncName = 17, RULE_describeColName = 18, 
		RULE_ctes = 19, RULE_namedQuery = 20, RULE_tableProvider = 21, RULE_tablePropertyList = 22, 
		RULE_tableProperty = 23, RULE_tablePropertyKey = 24, RULE_tablePropertyValue = 25, 
		RULE_constantList = 26, RULE_nestedConstantList = 27, RULE_createFileFormat = 28, 
		RULE_fileFormat = 29, RULE_storageHandler = 30, RULE_resource = 31, RULE_queryNoWith = 32, 
		RULE_queryOrganization = 33, RULE_multiInsertQueryBody = 34, RULE_queryTerm = 35, 
		RULE_queryPrimary = 36, RULE_sortItem = 37, RULE_querySpecification = 38, 
		RULE_hint = 39, RULE_hintStatement = 40, RULE_hintExpression = 41, RULE_hintPredicated = 42, 
		RULE_hintPredicate = 43, RULE_hintValueExpression = 44, RULE_fromClause = 45, 
		RULE_aggregation = 46, RULE_groupingSet = 47, RULE_pivotClause = 48, RULE_lateralView = 49, 
		RULE_setQuantifier = 50, RULE_relation = 51, RULE_joinRelation = 52, RULE_joinType = 53, 
		RULE_joinCriteria = 54, RULE_sample = 55, RULE_sampleMethod = 56, RULE_identifierList = 57, 
		RULE_identifierSeq = 58, RULE_orderedIdentifierList = 59, RULE_orderedIdentifier = 60, 
		RULE_identifierCommentList = 61, RULE_identifierComment = 62, RULE_relationPrimary = 63, 
		RULE_inlineTable = 64, RULE_functionTable = 65, RULE_tableAlias = 66, 
		RULE_rowFormat = 67, RULE_tableIdentifier = 68, RULE_functionIdentifier = 69, 
		RULE_namedExpression = 70, RULE_namedExpressionSeq = 71, RULE_expression = 72, 
		RULE_booleanExpression = 73, RULE_predicated = 74, RULE_predicate = 75, 
		RULE_valueExpression = 76, RULE_primaryExpression = 77, RULE_constant = 78, 
		RULE_comparisonOperator = 79, RULE_arithmeticOperator = 80, RULE_predicateOperator = 81, 
		RULE_booleanValue = 82, RULE_interval = 83, RULE_intervalField = 84, RULE_intervalValue = 85, 
		RULE_colPosition = 86, RULE_dataType = 87, RULE_colTypeList = 88, RULE_colType = 89, 
		RULE_complexColTypeList = 90, RULE_complexColType = 91, RULE_whenClause = 92, 
		RULE_windows = 93, RULE_namedWindow = 94, RULE_windowSpec = 95, RULE_windowFrame = 96, 
		RULE_frameBound = 97, RULE_qualifiedName = 98, RULE_identifier = 99, RULE_strictIdentifier = 100, 
		RULE_quotedIdentifier = 101, RULE_number = 102, RULE_nonReserved = 103;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
		"singleDataType", "singleTableSchema", "statement", "unsupportedHiveNativeCommands", 
		"createTableHeader", "bucketSpec", "skewSpec", "locationSpec", "query", 
		"insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
		"describeFuncName", "describeColName", "ctes", "namedQuery", "tableProvider", 
		"tablePropertyList", "tableProperty", "tablePropertyKey", "tablePropertyValue", 
		"constantList", "nestedConstantList", "createFileFormat", "fileFormat", 
		"storageHandler", "resource", "queryNoWith", "queryOrganization", "multiInsertQueryBody", 
		"queryTerm", "queryPrimary", "sortItem", "querySpecification", "hint", 
		"hintStatement", "hintExpression", "hintPredicated", "hintPredicate", 
		"hintValueExpression", "fromClause", "aggregation", "groupingSet", "pivotClause", 
		"lateralView", "setQuantifier", "relation", "joinRelation", "joinType", 
		"joinCriteria", "sample", "sampleMethod", "identifierList", "identifierSeq", 
		"orderedIdentifierList", "orderedIdentifier", "identifierCommentList", 
		"identifierComment", "relationPrimary", "inlineTable", "functionTable", 
		"tableAlias", "rowFormat", "tableIdentifier", "functionIdentifier", "namedExpression", 
		"namedExpressionSeq", "expression", "booleanExpression", "predicated", 
		"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
		"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
		"intervalField", "intervalValue", "colPosition", "dataType", "colTypeList", 
		"colType", "complexColTypeList", "complexColType", "whenClause", "windows", 
		"namedWindow", "windowSpec", "windowFrame", "frameBound", "qualifiedName", 
		"identifier", "strictIdentifier", "quotedIdentifier", "number", "nonReserved"
	};

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public AST value;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); ((SingleStatementContext)_localctx).statement = statement();
			setState(209); match(EOF);
			 ((SingleStatementContext)_localctx).value =  ((SingleStatementContext)_localctx).statement.value; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public AST value;
		public NamedExpressionContext namedExpression;
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); ((SingleExpressionContext)_localctx).namedExpression = namedExpression();
			setState(213); match(EOF);
			 ((SingleExpressionContext)_localctx).value =  ((SingleExpressionContext)_localctx).namedExpression.value; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public AST value;
		public TableIdentifierContext tableIdentifier;
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); ((SingleTableIdentifierContext)_localctx).tableIdentifier = tableIdentifier();
			setState(217); match(EOF);
			  ((SingleTableIdentifierContext)_localctx).value =  ((SingleTableIdentifierContext)_localctx).tableIdentifier.value;  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); functionIdentifier();
			setState(221); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public AST value;
		public DataTypeContext dataType;
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); ((SingleDataTypeContext)_localctx).dataType = dataType();
			setState(224); match(EOF);
			 ((SingleDataTypeContext)_localctx).value =  ((SingleDataTypeContext)_localctx).dataType.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); colTypeList();
			setState(228); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AST value;
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropDatabase(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeDatabase(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateDatabase(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public TablePropertyListContext tableProps;
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateHiveTable(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTable(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetDatabaseProperties(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public TablePropertyListContext tableProps;
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeTable(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
	}
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitChangeColumn(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowDatabases(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(840);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230); ((StatementDefaultContext)_localctx).query = query();
				 ((StatementDefaultContext)_localctx).value =  ((StatementDefaultContext)_localctx).query.value; 
				}
				break;

			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233); match(USE);
				setState(234); ((UseContext)_localctx).db = identifier();
				 ((UseContext)_localctx).value =  new USE(((UseContext)_localctx).db.value);
				}
				break;

			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237); match(CREATE);
				setState(238); match(DATABASE);
				setState(242);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(239); match(IF);
					setState(240); match(NOT);
					setState(241); match(EXISTS);
					}
					break;
				}
				setState(244); identifier();
				setState(247);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(245); match(COMMENT);
					setState(246); ((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(250);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(249); locationSpec();
					}
				}

				setState(255);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(252); match(WITH);
					setState(253); match(DBPROPERTIES);
					setState(254); tablePropertyList();
					}
				}

				}
				break;

			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(257); match(ALTER);
				setState(258); match(DATABASE);
				setState(259); identifier();
				setState(260); match(SET);
				setState(261); match(DBPROPERTIES);
				setState(262); tablePropertyList();
				}
				break;

			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(264); match(DROP);
				setState(265); match(DATABASE);
				setState(268);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(266); match(IF);
					setState(267); match(EXISTS);
					}
					break;
				}
				setState(270); identifier();
				setState(272);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(271);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				break;

			case 6:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(274); createTableHeader();
				setState(279);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(275); match(T__7);
					setState(276); colTypeList();
					setState(277); match(T__5);
					}
				}

				setState(281); tableProvider();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (OPTIONS - 181)) | (1L << (TBLPROPERTIES - 181)) | (1L << (LOCATION - 181)) | (1L << (CLUSTERED - 181)) | (1L << (PARTITIONED - 181)))) != 0)) {
					{
					setState(293);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(282); match(OPTIONS);
						setState(283); ((CreateTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(284); match(PARTITIONED);
						setState(285); match(BY);
						setState(286); ((CreateTableContext)_localctx).partitionColumnNames = identifierList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(287); bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(288); locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(289); match(COMMENT);
						setState(290); ((CreateTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(291); match(TBLPROPERTIES);
						setState(292); ((CreateTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (WITH - 76)) | (1L << (VALUES - 76)) | (1L << (TABLE - 76)) | (1L << (INSERT - 76)) | (1L << (MAP - 76)))) != 0) || _la==REDUCE) {
					{
					setState(299);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(298); match(AS);
						}
					}

					setState(301); query();
					}
				}

				}
				break;

			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(304); createTableHeader();
				setState(309);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(305); match(T__7);
					setState(306); ((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(307); match(T__5);
					}
					break;
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ROW || _la==COMMENT || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (TBLPROPERTIES - 183)) | (1L << (SKEWED - 183)) | (1L << (STORED - 183)) | (1L << (LOCATION - 183)) | (1L << (CLUSTERED - 183)) | (1L << (PARTITIONED - 183)))) != 0)) {
					{
					setState(326);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(311); match(COMMENT);
						setState(312); ((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(313); match(PARTITIONED);
						setState(314); match(BY);
						setState(315); match(T__7);
						setState(316); ((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
						setState(317); match(T__5);
						}
						}
						break;
					case CLUSTERED:
						{
						setState(319); bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(320); skewSpec();
						}
						break;
					case ROW:
						{
						setState(321); rowFormat();
						}
						break;
					case STORED:
						{
						setState(322); createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(323); locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(324); match(TBLPROPERTIES);
						setState(325); ((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (WITH - 76)) | (1L << (VALUES - 76)) | (1L << (TABLE - 76)) | (1L << (INSERT - 76)) | (1L << (MAP - 76)))) != 0) || _la==REDUCE) {
					{
					setState(332);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(331); match(AS);
						}
					}

					setState(334); query();
					}
				}

				}
				break;

			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(337); match(CREATE);
				setState(338); match(TABLE);
				setState(342);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(339); match(IF);
					setState(340); match(NOT);
					setState(341); match(EXISTS);
					}
					break;
				}
				setState(344); ((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(345); match(LIKE);
				setState(346); ((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(348);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(347); locationSpec();
					}
				}

				}
				break;

			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(350); match(ANALYZE);
				setState(351); match(TABLE);
				setState(352); tableIdentifier();
				setState(354);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(353); partitionSpec();
					}
				}

				setState(356); match(COMPUTE);
				setState(357); match(STATISTICS);
				setState(362);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(358); identifier();
					}
					break;

				case 2:
					{
					setState(359); match(FOR);
					setState(360); match(COLUMNS);
					setState(361); identifierSeq();
					}
					break;
				}
				}
				break;

			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(364); match(ALTER);
				setState(365); match(TABLE);
				setState(366); tableIdentifier();
				setState(367); match(ADD);
				setState(368); match(COLUMNS);
				setState(369); match(T__7);
				setState(370); ((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(371); match(T__5);
				}
				break;

			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(373); match(ALTER);
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(375); ((RenameTableContext)_localctx).from = tableIdentifier();
				setState(376); match(RENAME);
				setState(377); match(TO);
				setState(378); ((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;

			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(380); match(ALTER);
				setState(381);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(382); tableIdentifier();
				setState(383); match(SET);
				setState(384); match(TBLPROPERTIES);
				setState(385); tablePropertyList();
				}
				break;

			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(387); match(ALTER);
				setState(388);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(389); tableIdentifier();
				setState(390); match(UNSET);
				setState(391); match(TBLPROPERTIES);
				setState(394);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(392); match(IF);
					setState(393); match(EXISTS);
					}
				}

				setState(396); tablePropertyList();
				}
				break;

			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(398); match(ALTER);
				setState(399); match(TABLE);
				setState(400); tableIdentifier();
				setState(402);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(401); partitionSpec();
					}
				}

				setState(404); match(CHANGE);
				setState(406);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(405); match(COLUMN);
					}
					break;
				}
				setState(408); identifier();
				setState(409); colType();
				setState(411);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(410); colPosition();
					}
				}

				}
				break;

			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(413); match(ALTER);
				setState(414); match(TABLE);
				setState(415); tableIdentifier();
				setState(417);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(416); partitionSpec();
					}
				}

				setState(419); match(SET);
				setState(420); match(SERDE);
				setState(421); match(STRING);
				setState(425);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(422); match(WITH);
					setState(423); match(SERDEPROPERTIES);
					setState(424); tablePropertyList();
					}
				}

				}
				break;

			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(427); match(ALTER);
				setState(428); match(TABLE);
				setState(429); tableIdentifier();
				setState(431);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(430); partitionSpec();
					}
				}

				setState(433); match(SET);
				setState(434); match(SERDEPROPERTIES);
				setState(435); tablePropertyList();
				}
				break;

			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(437); match(ALTER);
				setState(438); match(TABLE);
				setState(439); tableIdentifier();
				setState(440); match(ADD);
				setState(444);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(441); match(IF);
					setState(442); match(NOT);
					setState(443); match(EXISTS);
					}
				}

				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(446); partitionSpecLocation();
					}
					}
					setState(449); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;

			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(451); match(ALTER);
				setState(452); match(VIEW);
				setState(453); tableIdentifier();
				setState(454); match(ADD);
				setState(458);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(455); match(IF);
					setState(456); match(NOT);
					setState(457); match(EXISTS);
					}
				}

				setState(461); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(460); partitionSpec();
					}
					}
					setState(463); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;

			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(465); match(ALTER);
				setState(466); match(TABLE);
				setState(467); tableIdentifier();
				setState(468); ((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(469); match(RENAME);
				setState(470); match(TO);
				setState(471); ((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;

			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(473); match(ALTER);
				setState(474); match(TABLE);
				setState(475); tableIdentifier();
				setState(476); match(DROP);
				setState(479);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(477); match(IF);
					setState(478); match(EXISTS);
					}
				}

				setState(481); partitionSpec();
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(482); match(T__2);
					setState(483); partitionSpec();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(489); match(PURGE);
					}
				}

				}
				break;

			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(492); match(ALTER);
				setState(493); match(VIEW);
				setState(494); tableIdentifier();
				setState(495); match(DROP);
				setState(498);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(496); match(IF);
					setState(497); match(EXISTS);
					}
				}

				setState(500); partitionSpec();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(501); match(T__2);
					setState(502); partitionSpec();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(508); match(ALTER);
				setState(509); match(TABLE);
				setState(510); tableIdentifier();
				setState(512);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(511); partitionSpec();
					}
				}

				setState(514); match(SET);
				setState(515); locationSpec();
				}
				break;

			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(517); match(ALTER);
				setState(518); match(TABLE);
				setState(519); tableIdentifier();
				setState(520); match(RECOVER);
				setState(521); match(PARTITIONS);
				}
				break;

			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(523); match(DROP);
				setState(524); match(TABLE);
				setState(527);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(525); match(IF);
					setState(526); match(EXISTS);
					}
					break;
				}
				setState(529); tableIdentifier();
				setState(531);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(530); match(PURGE);
					}
				}

				}
				break;

			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(533); match(DROP);
				setState(534); match(VIEW);
				setState(537);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(535); match(IF);
					setState(536); match(EXISTS);
					}
					break;
				}
				setState(539); tableIdentifier();
				}
				break;

			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(540); match(CREATE);
				setState(543);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(541); match(OR);
					setState(542); match(REPLACE);
					}
				}

				setState(549);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(546);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(545); match(GLOBAL);
						}
					}

					setState(548); match(TEMPORARY);
					}
				}

				setState(551); match(VIEW);
				setState(555);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(552); match(IF);
					setState(553); match(NOT);
					setState(554); match(EXISTS);
					}
					break;
				}
				setState(557); tableIdentifier();
				setState(559);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(558); identifierCommentList();
					}
				}

				setState(563);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(561); match(COMMENT);
					setState(562); match(STRING);
					}
				}

				setState(568);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(565); match(PARTITIONED);
					setState(566); match(ON);
					setState(567); identifierList();
					}
				}

				setState(572);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(570); match(TBLPROPERTIES);
					setState(571); tablePropertyList();
					}
				}

				setState(574); match(AS);
				setState(575); query();
				}
				break;

			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(577); match(CREATE);
				setState(580);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(578); match(OR);
					setState(579); match(REPLACE);
					}
				}

				setState(583);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(582); match(GLOBAL);
					}
				}

				setState(585); match(TEMPORARY);
				setState(586); match(VIEW);
				setState(587); tableIdentifier();
				setState(592);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(588); match(T__7);
					setState(589); colTypeList();
					setState(590); match(T__5);
					}
				}

				setState(594); tableProvider();
				setState(597);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(595); match(OPTIONS);
					setState(596); tablePropertyList();
					}
				}

				}
				break;

			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(599); match(ALTER);
				setState(600); match(VIEW);
				setState(601); tableIdentifier();
				setState(603);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(602); match(AS);
					}
				}

				setState(605); query();
				}
				break;

			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(607); match(CREATE);
				setState(610);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(608); match(OR);
					setState(609); match(REPLACE);
					}
				}

				setState(613);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(612); match(TEMPORARY);
					}
				}

				setState(615); match(FUNCTION);
				setState(619);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(616); match(IF);
					setState(617); match(NOT);
					setState(618); match(EXISTS);
					}
					break;
				}
				setState(621); qualifiedName();
				setState(622); match(AS);
				setState(623); ((CreateFunctionContext)_localctx).className = match(STRING);
				setState(633);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(624); match(USING);
					setState(625); resource();
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(626); match(T__2);
						setState(627); resource();
						}
						}
						setState(632);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;

			case 30:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(635); match(DROP);
				setState(637);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(636); match(TEMPORARY);
					}
				}

				setState(639); match(FUNCTION);
				setState(642);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(640); match(IF);
					setState(641); match(EXISTS);
					}
					break;
				}
				setState(644); qualifiedName();
				}
				break;

			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(645); match(EXPLAIN);
				setState(647);
				_la = _input.LA(1);
				if (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (LOGICAL - 89)) | (1L << (CODEGEN - 89)) | (1L << (COST - 89)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(646);
					_la = _input.LA(1);
					if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (LOGICAL - 89)) | (1L << (CODEGEN - 89)) | (1L << (COST - 89)))) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(649); statement();
				}
				break;

			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(650); match(SHOW);
				setState(651); match(TABLES);
				setState(654);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(652);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(653); ((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(660);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(657);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(656); match(LIKE);
						}
					}

					setState(659); ((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;

			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(662); match(SHOW);
				setState(663); match(TABLE);
				setState(664); match(EXTENDED);
				setState(667);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(665);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(666); ((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(669); match(LIKE);
				setState(670); ((ShowTableContext)_localctx).pattern = match(STRING);
				setState(672);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(671); partitionSpec();
					}
				}

				}
				break;

			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(674); match(SHOW);
				setState(675); match(DATABASES);
				setState(680);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(677);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(676); match(LIKE);
						}
					}

					setState(679); ((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;

			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(682); match(SHOW);
				setState(683); match(TBLPROPERTIES);
				setState(684); ((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(689);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(685); match(T__7);
					setState(686); ((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(687); match(T__5);
					}
				}

				}
				break;

			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(691); match(SHOW);
				setState(692); match(COLUMNS);
				setState(693);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(694); tableIdentifier();
				setState(697);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(695);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(696); ((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;

			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(699); match(SHOW);
				setState(700); match(PARTITIONS);
				setState(701); tableIdentifier();
				setState(703);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(702); partitionSpec();
					}
				}

				}
				break;

			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(705); match(SHOW);
				setState(707);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(706); identifier();
					}
					break;
				}
				setState(709); match(FUNCTIONS);
				setState(717);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (STRING - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
					{
					setState(711);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(710); match(LIKE);
						}
						break;
					}
					setState(715);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case ANY:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case PIVOT:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case DIRECTORY:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case BOTH:
					case LEADING:
					case TRAILING:
					case IF:
					case POSITION:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(713); qualifiedName();
						}
						break;
					case STRING:
						{
						setState(714); ((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;

			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(719); match(SHOW);
				setState(720); match(CREATE);
				setState(721); match(TABLE);
				setState(722); tableIdentifier();
				}
				break;

			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(723);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(724); match(FUNCTION);
				setState(726);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(725); match(EXTENDED);
					}
					break;
				}
				setState(728); describeFuncName();
				}
				break;

			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(729);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(730); match(DATABASE);
				setState(732);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(731); match(EXTENDED);
					}
					break;
				}
				setState(734); identifier();
				}
				break;

			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(735);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(737);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(736); match(TABLE);
					}
					break;
				}
				setState(740);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(739);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(742); tableIdentifier();
				setState(744);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(743); partitionSpec();
					}
					break;
				}
				setState(747);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
					{
					setState(746); describeColName();
					}
				}

				}
				break;

			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(749); match(REFRESH);
				setState(750); match(TABLE);
				setState(751); tableIdentifier();
				}
				break;

			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(752); match(REFRESH);
				setState(760);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(753); match(STRING);
					}
					break;

				case 2:
					{
					setState(757);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(754);
							matchWildcard();
							}
							} 
						}
						setState(759);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					}
					}
					break;
				}
				}
				break;

			case 45:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(762); match(CACHE);
				setState(764);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(763); match(LAZY);
					}
				}

				setState(766); match(TABLE);
				setState(767); tableIdentifier();
				setState(772);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (WITH - 76)) | (1L << (VALUES - 76)) | (1L << (TABLE - 76)) | (1L << (INSERT - 76)) | (1L << (MAP - 76)))) != 0) || _la==REDUCE) {
					{
					setState(769);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(768); match(AS);
						}
					}

					setState(771); query();
					}
				}

				}
				break;

			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(774); match(UNCACHE);
				setState(775); match(TABLE);
				setState(778);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(776); match(IF);
					setState(777); match(EXISTS);
					}
					break;
				}
				setState(780); tableIdentifier();
				}
				break;

			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(781); match(CLEAR);
				setState(782); match(CACHE);
				}
				break;

			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(783); match(LOAD);
				setState(784); match(DATA);
				setState(786);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(785); match(LOCAL);
					}
				}

				setState(788); match(INPATH);
				setState(789); ((LoadDataContext)_localctx).path = match(STRING);
				setState(791);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(790); match(OVERWRITE);
					}
				}

				setState(793); match(INTO);
				setState(794); match(TABLE);
				setState(795); tableIdentifier();
				setState(797);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(796); partitionSpec();
					}
				}

				}
				break;

			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(799); match(TRUNCATE);
				setState(800); match(TABLE);
				setState(801); tableIdentifier();
				setState(803);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(802); partitionSpec();
					}
				}

				}
				break;

			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(805); match(MSCK);
				setState(806); match(REPAIR);
				setState(807); match(TABLE);
				setState(808); tableIdentifier();
				}
				break;

			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(809);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(810); identifier();
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(811);
						matchWildcard();
						}
						} 
					}
					setState(816);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
				break;

			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(817); match(SET);
				setState(818); match(ROLE);
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(819);
						matchWildcard();
						}
						} 
					}
					setState(824);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;

			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(825); match(SET);
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(826);
						matchWildcard();
						}
						} 
					}
					setState(831);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;

			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(832); match(RESET);
				}
				break;

			case 55:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(833); unsupportedHiveNativeCommands();
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(834);
						matchWildcard();
						}
						} 
					}
					setState(839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1012);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(843); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(845); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(846); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(848);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(847); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(850); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(852);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(851); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(854); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(855); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(856); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(857); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(859);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(858); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(861); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(862); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(863); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(864); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(865); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(866); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(867); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(868); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(869); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(870); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(871); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(872); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(873); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(874); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(875); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(876); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(877); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(878); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(879); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(880); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(881); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(882); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(883); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(884); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(885); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(886); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(887); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(888); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(889); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(890); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(891); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(892); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(893); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(894); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(895); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(896); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(897); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(898); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(899); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(900); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(901); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(902); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;

			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(903); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(904); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(905); tableIdentifier();
				setState(906); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(907); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;

			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(909); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(910); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(911); tableIdentifier();
				setState(912); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(913); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;

			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(915); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(916); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(917); tableIdentifier();
				setState(918); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(919); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;

			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(921); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(922); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(923); tableIdentifier();
				setState(924); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(925); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;

			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(927); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(928); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(929); tableIdentifier();
				setState(930); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(931); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;

			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(933); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(934); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(935); tableIdentifier();
				setState(936); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(937); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(938); ((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(939); ((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;

			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(941); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(942); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(943); tableIdentifier();
				setState(944); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(945); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(946); ((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;

			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(948); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(949); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(950); tableIdentifier();
				setState(951); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(952); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;

			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(954); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(955); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(956); tableIdentifier();
				setState(957); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(958); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;

			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(960); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(961); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(962); tableIdentifier();
				setState(963); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(964); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;

			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(966); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(967); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(968); tableIdentifier();
				setState(969); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;

			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(971); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(972); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(973); tableIdentifier();
				setState(975);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(974); partitionSpec();
					}
				}

				setState(977); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;

			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(979); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(980); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(981); tableIdentifier();
				setState(983);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(982); partitionSpec();
					}
				}

				setState(985); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;

			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(987); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(988); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(989); tableIdentifier();
				setState(991);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(990); partitionSpec();
					}
				}

				setState(993); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(994); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;

			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(996); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(997); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(998); tableIdentifier();
				setState(1000);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(999); partitionSpec();
					}
				}

				setState(1002); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1003); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;

			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1005); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1006); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;

			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1007); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;

			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1008); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;

			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1009); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;

			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1010); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1011); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014); match(CREATE);
			setState(1016);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1015); match(TEMPORARY);
				}
			}

			setState(1019);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1018); match(EXTERNAL);
				}
			}

			setState(1021); match(TABLE);
			setState(1025);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1022); match(IF);
				setState(1023); match(NOT);
				setState(1024); match(EXISTS);
				}
				break;
			}
			setState(1027); tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029); match(CLUSTERED);
			setState(1030); match(BY);
			setState(1031); identifierList();
			setState(1035);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1032); match(SORTED);
				setState(1033); match(BY);
				setState(1034); orderedIdentifierList();
				}
			}

			setState(1037); match(INTO);
			setState(1038); match(INTEGER_VALUE);
			setState(1039); match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041); match(SKEWED);
			setState(1042); match(BY);
			setState(1043); identifierList();
			setState(1044); match(ON);
			setState(1047);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1045); constantList();
				}
				break;

			case 2:
				{
				setState(1046); nestedConstantList();
				}
				break;
			}
			setState(1052);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1049); match(STORED);
				setState(1050); match(AS);
				setState(1051); match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public AST value;
		public Token s;
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054); match(LOCATION);
			setState(1055); ((LocationSpecContext)_localctx).s = match(STRING);
			 ((LocationSpecContext)_localctx).value =  new LocationSpec((((LocationSpecContext)_localctx).s!=null?((LocationSpecContext)_localctx).s.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public Query value;
		public CtesContext ctes;
		public QueryNoWithContext queryNoWith;
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_query);
		 ((QueryContext)_localctx).value =  new Query(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1058); ((QueryContext)_localctx).ctes = ctes();
				_localctx.value.setWith(((QueryContext)_localctx).ctes.value);
				}
			}

			setState(1063); ((QueryContext)_localctx).queryNoWith = queryNoWith();
			 _localctx.value.setQueryNoWith(((QueryContext)_localctx).queryNoWith.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public AST value;
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public RowFormatContext rowFormat;
		public CreateFileFormatContext createFileFormat;
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TableProviderContext tableProvider;
		public TablePropertyListContext options;
		public TablePropertyListContext tablePropertyList;
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TableIdentifierContext t;
		public PartitionSpecContext partitionSpec;
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TableIdentifierContext tableIdentifier;
		public PartitionSpecContext partitionSpec;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insertInto);
		int _la;
		try {
			setState(1135);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1066); match(INSERT);
				setState(1067); match(OVERWRITE);
				setState(1068); match(TABLE);
				setState(1069); ((InsertOverwriteTableContext)_localctx).t = tableIdentifier();
				 InsertOverwriteTable insert = new InsertOverwriteTable(((InsertOverwriteTableContext)_localctx).t.value); ((InsertOverwriteTableContext)_localctx).value =  insert; 
				setState(1079);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1071); ((InsertOverwriteTableContext)_localctx).partitionSpec = partitionSpec();
					insert.setPartitionSpec(((InsertOverwriteTableContext)_localctx).partitionSpec.value);
					setState(1077);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1073); match(IF);
						setState(1074); match(NOT);
						setState(1075); match(EXISTS);
						 insert.setNotExists(true);
						}
					}

					}
				}

				}
				break;

			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1081); match(INSERT);
				setState(1082); match(INTO);
				InsertIntoTable insert = new InsertIntoTable(); ((InsertIntoTableContext)_localctx).value =  insert;
				setState(1086);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1084); match(TABLE);
					 insert.setTable(true);
					}
					break;
				}
				setState(1088); ((InsertIntoTableContext)_localctx).tableIdentifier = tableIdentifier();
				 insert.setTableIdentifier(((InsertIntoTableContext)_localctx).tableIdentifier.value);
				setState(1093);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1090); ((InsertIntoTableContext)_localctx).partitionSpec = partitionSpec();
					insert.setPartitionSpec(((InsertIntoTableContext)_localctx).partitionSpec.value); 
					}
				}

				}
				break;

			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1095); match(INSERT);
				setState(1096); match(OVERWRITE);
				InsertOverwriteHiveDir insert = new InsertOverwriteHiveDir(); ((InsertOverwriteHiveDirContext)_localctx).value =  insert;
				setState(1100);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1098); match(LOCAL);
					insert.setLocal(true);
					}
				}

				setState(1102); match(DIRECTORY);
				setState(1103); ((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				insert.setPath((((InsertOverwriteHiveDirContext)_localctx).path!=null?((InsertOverwriteHiveDirContext)_localctx).path.getText():null));
				setState(1108);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1105); ((InsertOverwriteHiveDirContext)_localctx).rowFormat = rowFormat();
					 insert.setRowFormat(((InsertOverwriteHiveDirContext)_localctx).rowFormat.value);
					}
				}

				setState(1113);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1110); ((InsertOverwriteHiveDirContext)_localctx).createFileFormat = createFileFormat();
					 insert.setCreateFileFormat(((InsertOverwriteHiveDirContext)_localctx).createFileFormat.value);
					}
				}

				}
				break;

			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1115); match(INSERT);
				setState(1116); match(OVERWRITE);
				InsertOverwriteDir insert = new InsertOverwriteDir(); ((InsertOverwriteDirContext)_localctx).value =  insert;
				setState(1120);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1118); match(LOCAL);
					 insert.setLocal(true);
					}
				}

				setState(1122); match(DIRECTORY);
				setState(1125);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1123); ((InsertOverwriteDirContext)_localctx).path = match(STRING);
					insert.setPath((((InsertOverwriteDirContext)_localctx).path!=null?((InsertOverwriteDirContext)_localctx).path.getText():null));
					}
				}

				setState(1127); ((InsertOverwriteDirContext)_localctx).tableProvider = tableProvider();
				 insert.setTableProvider(((InsertOverwriteDirContext)_localctx).tableProvider.value);
				setState(1133);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1129); match(OPTIONS);
					setState(1130); ((InsertOverwriteDirContext)_localctx).options = ((InsertOverwriteDirContext)_localctx).tablePropertyList = tablePropertyList();
					  insert.setTablePropertyList(((InsertOverwriteDirContext)_localctx).tablePropertyList.value);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecLocation value;
		public PartitionSpecContext p;
		public LocationSpecContext l;
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137); ((PartitionSpecLocationContext)_localctx).p = partitionSpec();
			 ((PartitionSpecLocationContext)_localctx).value =  new PartitionSpecLocation(((PartitionSpecLocationContext)_localctx).p.value);
			setState(1142);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1139); ((PartitionSpecLocationContext)_localctx).l = locationSpec();
				 _localctx.value.setLocation(((PartitionSpecLocationContext)_localctx).l.value);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public PartitionSpec value;
		public PartitionValContext partitionVal;
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partitionSpec);
		 ((PartitionSpecContext)_localctx).value =  new PartitionSpec();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144); match(PARTITION);
			setState(1145); match(T__7);
			setState(1146); ((PartitionSpecContext)_localctx).partitionVal = partitionVal();
			 _localctx.value.addPartition(((PartitionSpecContext)_localctx).partitionVal.value);
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1148); match(T__2);
				setState(1149); ((PartitionSpecContext)_localctx).partitionVal = partitionVal();
				 _localctx.value.addPartition(((PartitionSpecContext)_localctx).partitionVal.value);
				}
				}
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1157); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public PartitionVal value;
		public IdentifierContext identifier;
		public ConstantContext constant;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159); ((PartitionValContext)_localctx).identifier = identifier();
			 ((PartitionValContext)_localctx).value =  new PartitionVal(((PartitionValContext)_localctx).identifier.value);
			setState(1165);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1161); match(EQ);
				setState(1162); ((PartitionValContext)_localctx).constant = constant();
				 _localctx.value.setConstant(((PartitionValContext)_localctx).constant.value);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public AST value;
		public QualifiedNameContext qualifiedName;
		public Token s;
		public ComparisonOperatorContext c;
		public ArithmeticOperatorContext a;
		public PredicateOperatorContext p;
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_describeFuncName);
		try {
			setState(1181);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167); ((DescribeFuncNameContext)_localctx).qualifiedName = qualifiedName();
				 ((DescribeFuncNameContext)_localctx).value =  ((DescribeFuncNameContext)_localctx).qualifiedName.value;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170); ((DescribeFuncNameContext)_localctx).s = match(STRING);
				 ((DescribeFuncNameContext)_localctx).value =  new DescribeFuncName((((DescribeFuncNameContext)_localctx).s!=null?((DescribeFuncNameContext)_localctx).s.getText():null));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1172); ((DescribeFuncNameContext)_localctx).c = comparisonOperator();
				 ((DescribeFuncNameContext)_localctx).value =  new DescribeFuncName(((DescribeFuncNameContext)_localctx).c.text);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1175); ((DescribeFuncNameContext)_localctx).a = arithmeticOperator();
				 ((DescribeFuncNameContext)_localctx).value =  new DescribeFuncName(((DescribeFuncNameContext)_localctx).a.text);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1178); ((DescribeFuncNameContext)_localctx).p = predicateOperator();
				 ((DescribeFuncNameContext)_localctx).value =  new DescribeFuncName(((DescribeFuncNameContext)_localctx).p.text);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public DescribeColName value;
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_describeColName);
		 ((DescribeColNameContext)_localctx).value =  new DescribeColName();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183); ((DescribeColNameContext)_localctx).identifier = ((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			 _localctx.value.addName(((DescribeColNameContext)_localctx).identifier.value);
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1185); match(T__0);
				setState(1186); ((DescribeColNameContext)_localctx).identifier = ((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				 _localctx.value.addName(((DescribeColNameContext)_localctx).identifier.value);
				}
				}
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public With value;
		public NamedQueryContext namedQuery;
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ctes);
		 ((CtesContext)_localctx).value =  new With();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194); match(WITH);
			setState(1195); ((CtesContext)_localctx).namedQuery = namedQuery();
			 _localctx.value.addNamedQuery(((CtesContext)_localctx).namedQuery.value);
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1197); match(T__2);
				setState(1198); ((CtesContext)_localctx).namedQuery = namedQuery();
				 _localctx.value.addNamedQuery(((CtesContext)_localctx).namedQuery.value);
				}
				}
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public AST value;
		public IdentifierContext name;
		public QueryContext query;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namedQuery);
		 boolean hasAS = false;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206); ((NamedQueryContext)_localctx).name = identifier();
			setState(1209);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1207); match(AS);
				 hasAS=true;
				}
			}

			setState(1211); match(T__7);
			setState(1212); ((NamedQueryContext)_localctx).query = query();
			setState(1213); match(T__5);
			 ((NamedQueryContext)_localctx).value =  new NamedQuery(((NamedQueryContext)_localctx).name.value,((NamedQueryContext)_localctx).query.value, hasAS); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public AST value;
		public QualifiedNameContext q;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216); match(USING);
			setState(1217); ((TableProviderContext)_localctx).q = qualifiedName();
			 ((TableProviderContext)_localctx).value =  new TableProvider(((TableProviderContext)_localctx).q.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public TablePropertyList value;
		public TablePropertyContext p;
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tablePropertyList);
		 ((TablePropertyListContext)_localctx).value =  new TablePropertyList();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220); match(T__7);
			setState(1221); ((TablePropertyListContext)_localctx).p = tableProperty();
			_localctx.value.addProperty(((TablePropertyListContext)_localctx).p.value);
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1223); match(T__2);
				setState(1224); tableProperty();
				_localctx.value.addProperty(((TablePropertyListContext)_localctx).p.value);
				}
				}
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1232); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TableProperty value;
		public TablePropertyKeyContext key;
		public TablePropertyValueContext v;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234); ((TablePropertyContext)_localctx).key = tablePropertyKey();
			 ((TablePropertyContext)_localctx).value = new TableProperty(((TablePropertyContext)_localctx).key.value);
			setState(1243);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & ((1L << (STRING - 238)) | (1L << (INTEGER_VALUE - 238)) | (1L << (DECIMAL_VALUE - 238)))) != 0)) {
				{
				setState(1238);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1236); match(EQ);
					_localctx.value.setEq(true);
					}
				}

				setState(1240); ((TablePropertyContext)_localctx).v = tablePropertyValue();
				_localctx.value.setValue(((TablePropertyContext)_localctx).v.value);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public TablePropertyKey value;
		public IdentifierContext i;
		public Token s;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tablePropertyKey);
		 ((TablePropertyKeyContext)_localctx).value =  new TablePropertyKey(); 
		int _la;
		try {
			setState(1258);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245); ((TablePropertyKeyContext)_localctx).i = identifier();
				_localctx.value.addKey(((TablePropertyKeyContext)_localctx).i.value);
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(1247); match(T__0);
					setState(1248); identifier();
					_localctx.value.addKey(((TablePropertyKeyContext)_localctx).i.value);
					}
					}
					setState(1255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256); ((TablePropertyKeyContext)_localctx).s = match(STRING);
				 ((TablePropertyKeyContext)_localctx).value =  new TablePropertyKey((((TablePropertyKeyContext)_localctx).s!=null?((TablePropertyKeyContext)_localctx).s.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public AST value;
		public Token i;
		public Token d;
		public BooleanValueContext b;
		public Token s;
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tablePropertyValue);
		try {
			setState(1269);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260); ((TablePropertyValueContext)_localctx).i = match(INTEGER_VALUE);
				 ((TablePropertyValueContext)_localctx).value =  new TablePropertyValue((((TablePropertyValueContext)_localctx).i!=null?((TablePropertyValueContext)_localctx).i.getText():null));
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262); ((TablePropertyValueContext)_localctx).d = match(DECIMAL_VALUE);
				 ((TablePropertyValueContext)_localctx).value =  new TablePropertyValue((((TablePropertyValueContext)_localctx).d!=null?((TablePropertyValueContext)_localctx).d.getText():null));
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1264); ((TablePropertyValueContext)_localctx).b = booleanValue();
				 ((TablePropertyValueContext)_localctx).value =  ((TablePropertyValueContext)_localctx).b.value;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1267); ((TablePropertyValueContext)_localctx).s = match(STRING);
				 ((TablePropertyValueContext)_localctx).value =  new TablePropertyValue((((TablePropertyValueContext)_localctx).s!=null?((TablePropertyValueContext)_localctx).s.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public ConstantList value;
		public ConstantContext c;
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constantList);
		 ((ConstantListContext)_localctx).value =  new ConstantList(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271); match(T__7);
			setState(1272); ((ConstantListContext)_localctx).c = constant();
			_localctx.value.addConstant(((ConstantListContext)_localctx).c.value); 
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1274); match(T__2);
				setState(1275); ((ConstantListContext)_localctx).c = constant();
				_localctx.value.addConstant(((ConstantListContext)_localctx).c.value); 
				}
				}
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1283); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public NestedConstantList value;
		public ConstantListContext c;
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nestedConstantList);
		 ((NestedConstantListContext)_localctx).value =  new NestedConstantList(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285); match(T__7);
			setState(1286); ((NestedConstantListContext)_localctx).c = constantList();
			_localctx.value.addConstant(((NestedConstantListContext)_localctx).c.value); 
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1288); match(T__2);
				setState(1289); ((NestedConstantListContext)_localctx).c = constantList();
				_localctx.value.addConstant(((NestedConstantListContext)_localctx).c.value); 
				}
				}
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1297); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public AST value;
		public Token a;
		public FileFormatContext f;
		public StorageHandlerContext s;
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createFileFormat);
		try {
			setState(1309);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299); match(STORED);
				setState(1300); ((CreateFileFormatContext)_localctx).a = match(AS);
				setState(1301); ((CreateFileFormatContext)_localctx).f = fileFormat();
				 ((CreateFileFormatContext)_localctx).value =  new CreateFileFormat((((CreateFileFormatContext)_localctx).a!=null?((CreateFileFormatContext)_localctx).a.getText():null),((CreateFileFormatContext)_localctx).f.value);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1304); match(STORED);
				setState(1305); ((CreateFileFormatContext)_localctx).a = match(BY);
				setState(1306); ((CreateFileFormatContext)_localctx).s = storageHandler();
				 ((CreateFileFormatContext)_localctx).value =  new CreateFileFormat((((CreateFileFormatContext)_localctx).a!=null?((CreateFileFormatContext)_localctx).a.getText():null),((CreateFileFormatContext)_localctx).s.value);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public AST value;
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext i;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fileFormat);
		try {
			setState(1319);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1311); match(INPUTFORMAT);
				setState(1312); ((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1313); match(OUTPUTFORMAT);
				setState(1314); ((TableFileFormatContext)_localctx).outFmt = match(STRING);
				 ((TableFileFormatContext)_localctx).value =  new TableFileFormat((((TableFileFormatContext)_localctx).inFmt!=null?((TableFileFormatContext)_localctx).inFmt.getText():null),(((TableFileFormatContext)_localctx).outFmt!=null?((TableFileFormatContext)_localctx).outFmt.getText():null));
				}
				break;

			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1316); ((GenericFileFormatContext)_localctx).i = identifier();
				 ((GenericFileFormatContext)_localctx).value =  new GenericFileFormat(((GenericFileFormatContext)_localctx).i.value);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public AST value;
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321); match(STRING);
			setState(1325);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1322); match(WITH);
				setState(1323); match(SERDEPROPERTIES);
				setState(1324); tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public AST value;
		public IdentifierContext i;
		public Token s;
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327); ((ResourceContext)_localctx).i = identifier();
			setState(1328); ((ResourceContext)_localctx).s = match(STRING);
			 ((ResourceContext)_localctx).value =  new Resource(((ResourceContext)_localctx).i.value, (((ResourceContext)_localctx).s!=null?((ResourceContext)_localctx).s.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public AST value;
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext t;
		public QueryOrganizationContext o;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_queryNoWith);
		int _la;
		try {
			setState(1344);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1331); insertInto();
					}
				}

				setState(1334); ((SingleInsertQueryContext)_localctx).t = queryTerm(0);
				setState(1335); ((SingleInsertQueryContext)_localctx).o = queryOrganization();
				 ((SingleInsertQueryContext)_localctx).value =  new SingleInsertQuery(((SingleInsertQueryContext)_localctx).t.value,((SingleInsertQueryContext)_localctx).o.value);
				}
				break;

			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1338); fromClause();
				setState(1340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1339); multiInsertQueryBody();
					}
					}
					setState(1342); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public QueryOrganization value;
		public SortItemContext order;
		public ExpressionContext clusterBy;
		public ExpressionContext distributeBy;
		public SortItemContext sort;
		public ExpressionContext limit;
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryOrganization);
		 ((QueryOrganizationContext)_localctx).value =  new QueryOrganization();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1346); match(ORDER);
				setState(1347); match(BY);
				setState(1348); ((QueryOrganizationContext)_localctx).order = sortItem();
				 _localctx.value.addOrderItem(((QueryOrganizationContext)_localctx).order.value);
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1350); match(T__2);
					setState(1351); ((QueryOrganizationContext)_localctx).order = sortItem();
					 _localctx.value.addOrderItem(((QueryOrganizationContext)_localctx).order.value);
					}
					}
					setState(1358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1374);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1361); match(CLUSTER);
				setState(1362); match(BY);
				setState(1363); ((QueryOrganizationContext)_localctx).clusterBy = expression();
				 _localctx.value.addClusterItem(((QueryOrganizationContext)_localctx).clusterBy.value);
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1365); match(T__2);
					setState(1366); ((QueryOrganizationContext)_localctx).clusterBy = expression();
					 _localctx.value.addClusterItem(((QueryOrganizationContext)_localctx).clusterBy.value);
					}
					}
					setState(1373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1389);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1376); match(DISTRIBUTE);
				setState(1377); match(BY);
				setState(1378); ((QueryOrganizationContext)_localctx).distributeBy = expression();
				 _localctx.value.addDistributeItem(((QueryOrganizationContext)_localctx).distributeBy.value);
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1380); match(T__2);
					setState(1381); ((QueryOrganizationContext)_localctx).distributeBy = expression();
					 _localctx.value.addDistributeItem(((QueryOrganizationContext)_localctx).distributeBy.value);
					}
					}
					setState(1388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1404);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1391); match(SORT);
				setState(1392); match(BY);
				setState(1393); ((QueryOrganizationContext)_localctx).sort = sortItem();
				 _localctx.value.addSortItem(((QueryOrganizationContext)_localctx).sort.value);
				setState(1401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1395); match(T__2);
					setState(1396); ((QueryOrganizationContext)_localctx).sort = sortItem();
					 _localctx.value.addSortItem(((QueryOrganizationContext)_localctx).sort.value);
					}
					}
					setState(1403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1407);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1406); windows();
				}
			}

			setState(1417);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1409); match(LIMIT);
				setState(1415);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1410); match(ALL);
					_localctx.value.setLimit(new Limit());
					}
					break;

				case 2:
					{
					setState(1412); ((QueryOrganizationContext)_localctx).limit = expression();
					_localctx.value.setLimit(new Limit(((QueryOrganizationContext)_localctx).limit.value));
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1419); insertInto();
				}
			}

			setState(1422); querySpecification();
			setState(1423); queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public AST value;
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext q;
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public SetQuantifierContext qf;
		public QueryTermContext right;
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1426); ((QueryTermDefaultContext)_localctx).q = queryPrimary();
			((QueryTermDefaultContext)_localctx).value =  ((QueryTermDefaultContext)_localctx).q.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(1439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(1429);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1430);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (UNION - 101)) | (1L << (EXCEPT - 101)) | (1L << (SETMINUS - 101)) | (1L << (INTERSECT - 101)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(1432);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1431); ((SetOperationContext)_localctx).qf = setQuantifier();
						}
					}

					setState(1434); ((SetOperationContext)_localctx).right = queryTerm(2);
					 ((SetOperationContext)_localctx).value =  new JOIN(((SetOperationContext)_localctx).left.value,(((SetOperationContext)_localctx).operator!=null?((SetOperationContext)_localctx).operator.getText():null),((SetOperationContext)_localctx).right.value,((SetOperationContext)_localctx).qf.value);
					}
					} 
				}
				setState(1441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public AST value;
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext q;
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext q;
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryPrimary);
		try {
			setState(1453);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1442); ((QueryPrimaryDefaultContext)_localctx).q = querySpecification();
				 ((QueryPrimaryDefaultContext)_localctx).value =  new QueryPrimary(((QueryPrimaryDefaultContext)_localctx).q.value);
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1445); match(TABLE);
				setState(1446); tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1447); inlineTable();
				}
				break;
			case T__7:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1448); match(T__7);
				setState(1449); ((SubqueryContext)_localctx).q = queryNoWith();
				setState(1450); match(T__5);
				 ((SubqueryContext)_localctx).value =  new SubQuery(((SubqueryContext)_localctx).q.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public SortItem value;
		public ExpressionContext e;
		public Token ordering;
		public Token nullOrder;
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455); ((SortItemContext)_localctx).e = expression();
			 ((SortItemContext)_localctx).value =  new SortItem(((SortItemContext)_localctx).e.value);
			setState(1459);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1457);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				consume();
				 _localctx.value.setOrdering((((SortItemContext)_localctx).ordering!=null?((SortItemContext)_localctx).ordering.getText():null));
				}
			}

			setState(1464);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1461); match(NULLS);
				setState(1462);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				consume();
				 _localctx.value.setNulls((((SortItemContext)_localctx).nullOrder!=null?((SortItemContext)_localctx).nullOrder.getText():null));
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Select value;
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public SetQuantifierContext q;
		public NamedExpressionSeqContext nes;
		public FromClauseContext fc;
		public LateralViewContext lv;
		public AggregationContext a;
		public BooleanExpressionContext having;
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_querySpecification);
		 ((QuerySpecificationContext)_localctx).value =  new Select(); 
		int _la;
		try {
			int _alt;
			setState(1581);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1476);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1466); match(SELECT);
					setState(1467); ((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1468); match(T__7);
					setState(1469); namedExpressionSeq();
					setState(1470); match(T__5);
					}
					break;
				case MAP:
					{
					setState(1472); ((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1473); namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1474); ((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1475); namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1479);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1478); ((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1483);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1481); match(RECORDWRITER);
					setState(1482); ((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1485); match(USING);
				setState(1486); ((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1499);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1487); match(AS);
					setState(1497);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(1488); identifierSeq();
						}
						break;

					case 2:
						{
						setState(1489); colTypeList();
						}
						break;

					case 3:
						{
						{
						setState(1490); match(T__7);
						setState(1493);
						switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
						case 1:
							{
							setState(1491); identifierSeq();
							}
							break;

						case 2:
							{
							setState(1492); colTypeList();
							}
							break;
						}
						setState(1495); match(T__5);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1502);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1501); ((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1506);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1504); match(RECORDREADER);
					setState(1505); ((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1509);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1508); fromClause();
					}
					break;
				}
				setState(1513);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1511); match(WHERE);
					setState(1512); ((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1549);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1515); ((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1521);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(1516); ((QuerySpecificationContext)_localctx).hint = ((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						 _localctx.value.addHint(((QuerySpecificationContext)_localctx).hint.value);
						}
						}
						setState(1523);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1527);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1524); ((QuerySpecificationContext)_localctx).q = setQuantifier();
						_localctx.value.setQuantifier(((QuerySpecificationContext)_localctx).q.value); 
						}
						break;
					}
					setState(1529); ((QuerySpecificationContext)_localctx).nes = namedExpressionSeq();
					 _localctx.value.setNamedExpressionSeq(((QuerySpecificationContext)_localctx).nes.value); 
					setState(1534);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						setState(1531); ((QuerySpecificationContext)_localctx).fc = fromClause();
						 _localctx.value.setFromClause(((QuerySpecificationContext)_localctx).fc.value); 
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1536); ((QuerySpecificationContext)_localctx).fc = fromClause();
					 _localctx.value.setFromClause(((QuerySpecificationContext)_localctx).fc.value);
					setState(1547);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(1538); ((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1542);
						switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
						case 1:
							{
							setState(1539); ((QuerySpecificationContext)_localctx).q = setQuantifier();
							_localctx.value.setQuantifier(((QuerySpecificationContext)_localctx).q.value); 
							}
							break;
						}
						setState(1544); ((QuerySpecificationContext)_localctx).nes = namedExpressionSeq();
						 _localctx.value.setNamedExpressionSeq(((QuerySpecificationContext)_localctx).nes.value); 
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1551); ((QuerySpecificationContext)_localctx).lv = lateralView();
						_localctx.value.addLiteralView(((QuerySpecificationContext)_localctx).lv.value);
						}
						} 
					}
					setState(1558);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
				setState(1563);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1559); match(WHERE);
					setState(1560); ((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					 _localctx.value.setWhere( new Where(((QuerySpecificationContext)_localctx).where.value));
					}
					break;
				}
				setState(1568);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1565); ((QuerySpecificationContext)_localctx).a = aggregation();
					_localctx.value.setAggregation(((QuerySpecificationContext)_localctx).a.value);
					}
					break;
				}
				setState(1574);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1570); match(HAVING);
					setState(1571); ((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					 _localctx.value.setHaving(new Having(((QuerySpecificationContext)_localctx).having.value));
					}
					break;
				}
				setState(1577);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1576); windows();
					}
					break;
				}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public Hint value;
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hint);
		 ((HintContext)_localctx).value =  new Hint();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583); match(T__6);
			setState(1584); ((HintContext)_localctx).hintStatement = ((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			 _localctx.value.addStatement(((HintContext)_localctx).hintStatement.value);
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (STRING - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
				{
				{
				setState(1587);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1586); match(T__2);
					}
				}

				setState(1589); ((HintContext)_localctx).hintStatement = ((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				 _localctx.value.addStatement(((HintContext)_localctx).hintStatement.value);
				}
				}
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1597); match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public HintStatement value;
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public HintExpressionContext hintExpression() {
			return getRuleContext(HintExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hintStatement);
		int _la;
		try {
			setState(1613);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1599); ((HintStatementContext)_localctx).hintName = identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600); ((HintStatementContext)_localctx).hintName = identifier();
				setState(1601); match(T__7);
				setState(1602); ((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1603); match(T__2);
					setState(1604); ((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1610); match(T__5);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1612); hintExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintExpressionContext extends ParserRuleContext {
		public AST value;
		public HintExpressionContext left;
		public Token operator;
		public HintExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public HintPredicatedContext hintPredicated() {
			return getRuleContext(HintPredicatedContext.class,0);
		}
		public List<HintExpressionContext> hintExpression() {
			return getRuleContexts(HintExpressionContext.class);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public HintExpressionContext hintExpression(int i) {
			return getRuleContext(HintExpressionContext.class,i);
		}
		public HintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintExpression(this);
		}
	}

	public final HintExpressionContext hintExpression() throws RecognitionException {
		return hintExpression(0);
	}

	private HintExpressionContext hintExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		HintExpressionContext _localctx = new HintExpressionContext(_ctx, _parentState);
		HintExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_hintExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1616); hintPredicated();
			}
			_ctx.stop = _input.LT(-1);
			setState(1626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1624);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						_localctx = new HintExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_hintExpression);
						setState(1618);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1619); ((HintExpressionContext)_localctx).operator = match(AND);
						setState(1620); ((HintExpressionContext)_localctx).right = hintExpression(3);
						}
						break;

					case 2:
						{
						_localctx = new HintExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_hintExpression);
						setState(1621);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1622); ((HintExpressionContext)_localctx).operator = match(OR);
						setState(1623); ((HintExpressionContext)_localctx).right = hintExpression(2);
						}
						break;
					}
					} 
				}
				setState(1628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class HintPredicatedContext extends ParserRuleContext {
		public AST value;
		public HintValueExpressionContext v;
		public HintValueExpressionContext hintValueExpression() {
			return getRuleContext(HintValueExpressionContext.class,0);
		}
		public HintPredicateContext hintPredicate() {
			return getRuleContext(HintPredicateContext.class,0);
		}
		public HintPredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintPredicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintPredicated(this);
		}
	}

	public final HintPredicatedContext hintPredicated() throws RecognitionException {
		HintPredicatedContext _localctx = new HintPredicatedContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_hintPredicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629); ((HintPredicatedContext)_localctx).v = hintValueExpression(0);
			setState(1631);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1630); hintPredicate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintPredicateContext extends ParserRuleContext {
		public AST value;
		public Token kind;
		public HintValueExpressionContext lower;
		public HintValueExpressionContext upper;
		public ExpressionContext e;
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public HintValueExpressionContext hintValueExpression(int i) {
			return getRuleContext(HintValueExpressionContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<HintValueExpressionContext> hintValueExpression() {
			return getRuleContexts(HintValueExpressionContext.class);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public HintPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintPredicate(this);
		}
	}

	public final HintPredicateContext hintPredicate() throws RecognitionException {
		HintPredicateContext _localctx = new HintPredicateContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_hintPredicate);
		int _la;
		try {
			setState(1656);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1633); match(NOT);
					}
				}

				setState(1636); ((HintPredicateContext)_localctx).kind = match(BETWEEN);
				setState(1637); ((HintPredicateContext)_localctx).lower = hintValueExpression(0);
				setState(1638); match(AND);
				setState(1639); ((HintPredicateContext)_localctx).upper = hintValueExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1642);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1641); match(NOT);
					}
				}

				setState(1644); ((HintPredicateContext)_localctx).kind = match(IN);
				setState(1645); match(T__7);
				setState(1646); ((HintPredicateContext)_localctx).e = expression();
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1647); match(T__2);
					setState(1648); ((HintPredicateContext)_localctx).e = expression();
					}
					}
					setState(1653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1654); match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintValueExpressionContext extends ParserRuleContext {
		public AST value;
		public HintValueExpressionContext left;
		public ComparisonOperatorContext op;
		public HintValueExpressionContext right;
		public HintValueExpressionContext hintValueExpression(int i) {
			return getRuleContext(HintValueExpressionContext.class,i);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<HintValueExpressionContext> hintValueExpression() {
			return getRuleContexts(HintValueExpressionContext.class);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public HintValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintValueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintValueExpression(this);
		}
	}

	public final HintValueExpressionContext hintValueExpression() throws RecognitionException {
		return hintValueExpression(0);
	}

	private HintValueExpressionContext hintValueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		HintValueExpressionContext _localctx = new HintValueExpressionContext(_ctx, _parentState);
		HintValueExpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_hintValueExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(1659); match(STRING);
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				setState(1660); identifier();
				setState(1661); match(T__0);
				setState(1662); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new HintValueExpressionContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_hintValueExpression);
					setState(1666);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1667); ((HintValueExpressionContext)_localctx).op = comparisonOperator();
					setState(1668); ((HintValueExpressionContext)_localctx).right = hintValueExpression(2);
					}
					} 
				}
				setState(1674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public FromClause value;
		public RelationContext r;
		public LateralViewContext l;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fromClause);
		 ((FromClauseContext)_localctx).value =  new FromClause();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1675); match(FROM);
			setState(1676); ((FromClauseContext)_localctx).r = relation();
			_localctx.value.addRelation(((FromClauseContext)_localctx).r.value);
			setState(1684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1678); match(T__2);
					setState(1679); ((FromClauseContext)_localctx).r = relation();
					_localctx.value.addRelation(((FromClauseContext)_localctx).r.value);
					}
					} 
				}
				setState(1686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1692);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1687); ((FromClauseContext)_localctx).l = lateralView();
					 _localctx.value.addLateralView(((FromClauseContext)_localctx).l.value);
					}
					} 
				}
				setState(1694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			setState(1696);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1695); pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationContext extends ParserRuleContext {
		public GroupBy value;
		public ExpressionContext ge;
		public Token kind;
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregation(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_aggregation);
		 ((AggregationContext)_localctx).value =  new GroupBy();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1698); match(GROUP);
			setState(1699); match(BY);
			setState(1700); ((AggregationContext)_localctx).ge = expression();
			 _localctx.value.addGroupingExpression(((AggregationContext)_localctx).ge.value);
			setState(1708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1702); match(T__2);
					setState(1703); ((AggregationContext)_localctx).ge = expression();
					 _localctx.value.addGroupingExpression(((AggregationContext)_localctx).ge.value);
					}
					} 
				}
				setState(1710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			}
			setState(1728);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1711); match(WITH);
				setState(1712); ((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;

			case 2:
				{
				setState(1713); match(WITH);
				setState(1714); ((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;

			case 3:
				{
				setState(1715); ((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1716); match(SETS);
				setState(1717); match(T__7);
				setState(1718); groupingSet();
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1719); match(T__2);
					setState(1720); groupingSet();
					}
					}
					setState(1725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1726); match(T__5);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_groupingSet);
		int _la;
		try {
			setState(1743);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1730); match(T__7);
				setState(1739);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
					{
					setState(1731); expression();
					setState(1736);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1732); match(T__2);
						setState(1733); expression();
						}
						}
						setState(1738);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1741); match(T__5);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1742); expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public IdentifierContext pivotColumn;
		public ConstantContext constant;
		public List<ConstantContext> pivotValues = new ArrayList<ConstantContext>();
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotClause(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745); match(PIVOT);
			setState(1746); match(T__7);
			setState(1747); ((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1748); match(FOR);
			setState(1749); ((PivotClauseContext)_localctx).pivotColumn = identifier();
			setState(1750); match(IN);
			setState(1751); match(T__7);
			setState(1752); ((PivotClauseContext)_localctx).constant = constant();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).constant);
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1753); match(T__2);
				setState(1754); ((PivotClauseContext)_localctx).constant = constant();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).constant);
				}
				}
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1760); match(T__5);
			setState(1761); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public LateralView value;
		public QualifiedNameContext fn;
		public IdentifierContext tblName;
		public IdentifierContext colName;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lateralView);
		 ((LateralViewContext)_localctx).value =  new LateralView(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1763); match(LATERAL);
			setState(1764); match(VIEW);
			setState(1767);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1765); match(OUTER);
				 _localctx.value.setOuter(true);
				}
				break;
			}
			setState(1769); ((LateralViewContext)_localctx).fn = qualifiedName();
			 _localctx.value.setFunctionName(((LateralViewContext)_localctx).fn.value);
			setState(1771); match(T__7);
			setState(1780);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
				{
				setState(1772); expression();
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1773); match(T__2);
					setState(1774); expression();
					}
					}
					setState(1779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1782); match(T__5);
			setState(1783); ((LateralViewContext)_localctx).tblName = identifier();
			 _localctx.value.setTableName(((LateralViewContext)_localctx).tblName.value);
			setState(1799);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1786);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1785); match(AS);
					}
					break;
				}
				setState(1788); ((LateralViewContext)_localctx).colName = identifier();
				 _localctx.value.addAsColumn(((LateralViewContext)_localctx).colName.value);
				setState(1796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1790); match(T__2);
						setState(1791); ((LateralViewContext)_localctx).colName = identifier();
						 _localctx.value.addAsColumn(((LateralViewContext)_localctx).colName.value);
						}
						} 
					}
					setState(1798);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public AST value;
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_setQuantifier);
		try {
			setState(1805);
			switch (_input.LA(1)) {
			case DISTINCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801); match(DISTINCT);
				 ((SetQuantifierContext)_localctx).value =  new DISTINCT();
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1803); match(ALL);
				 ((SetQuantifierContext)_localctx).value =  new ALL();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public Relation value;
		public RelationPrimaryContext rp;
		public JoinRelationContext r;
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1807); ((RelationContext)_localctx).rp = relationPrimary();
			  ((RelationContext)_localctx).value =  new Relation(((RelationContext)_localctx).rp.value);
			setState(1814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1809); ((RelationContext)_localctx).r = joinRelation();
					 _localctx.value.addRelation(((RelationContext)_localctx).r.value);
					}
					} 
				}
				setState(1816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public NaturalJOINRelation value;
		public JoinTypeContext jt;
		public RelationPrimaryContext right;
		public JoinCriteriaContext jc;
		public JoinTypeContext joinType;
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_joinRelation);
		try {
			setState(1832);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817); ((JoinRelationContext)_localctx).jt = joinType();
				setState(1818); match(JOIN);
				setState(1819); ((JoinRelationContext)_localctx).right = relationPrimary();
				 ((JoinRelationContext)_localctx).value =  new JOINRelation(((JoinRelationContext)_localctx).jt.value, ((JoinRelationContext)_localctx).right.value); JOINRelation jr = (JOINRelation)_localctx.value;
				setState(1824);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1821); ((JoinRelationContext)_localctx).jc = joinCriteria();
					 jr.setJoinCriteria(((JoinRelationContext)_localctx).jc.value);
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1826); match(NATURAL);
				setState(1827); ((JoinRelationContext)_localctx).joinType = joinType();
				setState(1828); match(JOIN);
				setState(1829); ((JoinRelationContext)_localctx).right = relationPrimary();
				 ((JoinRelationContext)_localctx).value =  new NaturalJOINRelation(((JoinRelationContext)_localctx).joinType.value, ((JoinRelationContext)_localctx).right.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public JOINType value;
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_joinType);
		 ((JoinTypeContext)_localctx).value =  new JOINType(); 
		int _la;
		try {
			setState(1868);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1834); match(INNER);
					 ((JoinTypeContext)_localctx).value =  new InnerJOIN();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1838); match(CROSS);
				 ((JoinTypeContext)_localctx).value =  new CrossJOIN();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1840); match(LEFT);
				 ((JoinTypeContext)_localctx).value =  new LeftJOIN();
				setState(1844);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1842); match(OUTER);
					 _localctx.value.markAsOuter();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1846); match(LEFT);
				setState(1847); match(SEMI);
				 ((JoinTypeContext)_localctx).value =  new LeftSemiJOIN();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1849); match(RIGHT);
				 ((JoinTypeContext)_localctx).value =  new RightJOIN();
				setState(1853);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1851); match(OUTER);
					 _localctx.value.markAsOuter();
					}
				}

				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1855); match(FULL);
				 ((JoinTypeContext)_localctx).value =  new FullJOIN();
				setState(1859);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1857); match(OUTER);
					 _localctx.value.markAsOuter();
					}
				}

				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				 ((JoinTypeContext)_localctx).value =  new JOINType();
				setState(1864);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1862); match(LEFT);
					 _localctx.value.markAsLeft();
					}
				}

				setState(1866); match(ANTI);
				 ((JoinTypeContext)_localctx).value =  new AntiJOIN(_localctx.value.isLeft());
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public AST value;
		public BooleanExpressionContext b;
		public IdentifierContext i;
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_joinCriteria);
		int _la;
		try {
			setState(1890);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1870); match(ON);
				setState(1871); ((JoinCriteriaContext)_localctx).b = booleanExpression(0);
				 ((JoinCriteriaContext)_localctx).value =  new ON(((JoinCriteriaContext)_localctx).b.value);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1874); match(USING);
				  ((JoinCriteriaContext)_localctx).value =  new USING(); 
				setState(1876); match(T__7);
				setState(1877); ((JoinCriteriaContext)_localctx).i = identifier();
				 USING u = (USING)_localctx.value; u.addIdentifier(((JoinCriteriaContext)_localctx).i.value);
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1879); match(T__2);
					setState(1880); ((JoinCriteriaContext)_localctx).i = identifier();
					  u.addIdentifier(((JoinCriteriaContext)_localctx).i.value);
					}
					}
					setState(1887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1888); match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public AST value;
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892); match(TABLESAMPLE);
			setState(1893); match(T__7);
			setState(1895);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
				{
				setState(1894); sampleMethod();
				}
			}

			setState(1897); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByRows(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByPercentile(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBucket(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBytes(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sampleMethod);
		int _la;
		try {
			setState(1923);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1900);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1899); ((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1902);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(1903); match(PERCENTLIT);
				}
				break;

			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1904); expression();
				setState(1905); match(ROWS);
				}
				break;

			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1907); ((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1908); ((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1909); match(OUT);
				setState(1910); match(OF);
				setState(1911); ((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1920);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1912); match(ON);
					setState(1918);
					switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
					case 1:
						{
						setState(1913); identifier();
						}
						break;

					case 2:
						{
						setState(1914); qualifiedName();
						setState(1915); match(T__7);
						setState(1916); match(T__5);
						}
						break;
					}
					}
				}

				}
				break;

			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1922); ((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List value;
		public IdentifierSeqContext is;
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925); match(T__7);
			setState(1926); ((IdentifierListContext)_localctx).is = identifierSeq();
			setState(1927); match(T__5);
			 ((IdentifierListContext)_localctx).value =  ((IdentifierListContext)_localctx).is.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List value;
		public IdentifierContext id;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_identifierSeq);
		 ((IdentifierSeqContext)_localctx).value =  new ArrayList(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1930); ((IdentifierSeqContext)_localctx).id = identifier();
			 _localctx.value.add(((IdentifierSeqContext)_localctx).id.value);
			setState(1938);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1932); match(T__2);
					setState(1933); identifier();
					 _localctx.value.add(((IdentifierSeqContext)_localctx).id.value);
					}
					} 
				}
				setState(1940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941); match(T__7);
			setState(1942); orderedIdentifier();
			setState(1947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1943); match(T__2);
				setState(1944); orderedIdentifier();
				}
				}
				setState(1949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1950); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952); identifier();
			setState(1954);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1953);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956); match(T__7);
			setState(1957); identifierComment();
			setState(1962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1958); match(T__2);
				setState(1959); identifierComment();
				}
				}
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1965); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967); identifier();
			setState(1970);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1968); match(COMMENT);
				setState(1969); match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimary value;
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext r;
		public SampleContext sample;
		public TableAliasContext a;
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext q;
		public SampleContext sample;
		public TableAliasContext a;
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext i;
		public SampleContext sample;
		public TableAliasContext a;
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_relationPrimary);
		 ((RelationPrimaryContext)_localctx).value =  new RelationPrimary();
		try {
			setState(2005);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1972); ((TableNameContext)_localctx).i = tableIdentifier();
				setState(1976);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1973); ((TableNameContext)_localctx).sample = sample();
					_localctx.value.setSample(((TableNameContext)_localctx).sample.value);
					}
					break;
				}
				setState(1978); ((TableNameContext)_localctx).a = tableAlias();
				  ((TableNameContext)_localctx).value =  new TableName(((TableNameContext)_localctx).i.value,_localctx.value.getSample(),((TableNameContext)_localctx).a.value);
				}
				break;

			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1981); match(T__7);
				setState(1982); ((AliasedQueryContext)_localctx).q = queryNoWith();
				setState(1983); match(T__5);
				setState(1987);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1984); ((AliasedQueryContext)_localctx).sample = sample();
					_localctx.value.setSample(((AliasedQueryContext)_localctx).sample.value);
					}
					break;
				}
				setState(1989); ((AliasedQueryContext)_localctx).a = tableAlias();
				 ((AliasedQueryContext)_localctx).value =  new AliasedQuery(((AliasedQueryContext)_localctx).q.value,_localctx.value.getSample(),((AliasedQueryContext)_localctx).a.value);
				}
				break;

			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1992); match(T__7);
				setState(1993); ((AliasedRelationContext)_localctx).r = relation();
				setState(1994); match(T__5);
				setState(1998);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1995); ((AliasedRelationContext)_localctx).sample = sample();
					_localctx.value.setSample(((AliasedRelationContext)_localctx).sample.value);
					}
					break;
				}
				setState(2000); ((AliasedRelationContext)_localctx).a = tableAlias();
				 ((AliasedRelationContext)_localctx).value =  new AliasedRelation(((AliasedRelationContext)_localctx).r.value,_localctx.value.getSample(),((AliasedRelationContext)_localctx).a.value);
				}
				break;

			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2003); inlineTable();
				}
				break;

			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2004); functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2007); match(VALUES);
			setState(2008); expression();
			setState(2013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2009); match(T__2);
					setState(2010); expression();
					}
					} 
				}
				setState(2015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			setState(2016); tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018); identifier();
			setState(2019); match(T__7);
			setState(2028);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
				{
				setState(2020); expression();
				setState(2025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2021); match(T__2);
					setState(2022); expression();
					}
					}
					setState(2027);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2030); match(T__5);
			setState(2031); tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public TableAlias value;
		public StrictIdentifierContext s;
		public IdentifierListContext l;
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_tableAlias);
		 ((TableAliasContext)_localctx).value =  new TableAlias();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2035);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2033); match(AS);
					 _localctx.value.setAS(true);
					}
					break;
				}
				setState(2037); ((TableAliasContext)_localctx).s = strictIdentifier();
				 _localctx.value.setStrictIdentifier(((TableAliasContext)_localctx).s.value);
				setState(2042);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(2039); ((TableAliasContext)_localctx).l = identifierList();
					_localctx.value.setIdentifierList(((TableAliasContext)_localctx).l.value);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public AST value;
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_rowFormat);
		try {
			setState(2095);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2046); match(ROW);
				setState(2047); match(FORMAT);
				setState(2048); match(SERDE);
				setState(2049); ((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2053);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2050); match(WITH);
					setState(2051); match(SERDEPROPERTIES);
					setState(2052); ((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2055); match(ROW);
				setState(2056); match(FORMAT);
				setState(2057); match(DELIMITED);
				setState(2067);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2058); match(FIELDS);
					setState(2059); match(TERMINATED);
					setState(2060); match(BY);
					setState(2061); ((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2065);
					switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
					case 1:
						{
						setState(2062); match(ESCAPED);
						setState(2063); match(BY);
						setState(2064); ((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2074);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2069); match(COLLECTION);
					setState(2070); match(ITEMS);
					setState(2071); match(TERMINATED);
					setState(2072); match(BY);
					setState(2073); ((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2081);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(2076); match(MAP);
					setState(2077); match(KEYS);
					setState(2078); match(TERMINATED);
					setState(2079); match(BY);
					setState(2080); ((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2087);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2083); match(LINES);
					setState(2084); match(TERMINATED);
					setState(2085); match(BY);
					setState(2086); ((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2093);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2089); match(NULL);
					setState(2090); match(DEFINED);
					setState(2091); match(AS);
					setState(2092); ((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public TableIdentifier value;
		public IdentifierContext db;
		public IdentifierContext table;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tableIdentifier);
		 ((TableIdentifierContext)_localctx).value =  new TableIdentifier();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2097); ((TableIdentifierContext)_localctx).db = identifier();
				setState(2098); match(T__0);
				 _localctx.value.addIdentifier(((TableIdentifierContext)_localctx).db.value);
				}
				break;
			}
			setState(2103); ((TableIdentifierContext)_localctx).table = identifier();
			 _localctx.value.addIdentifier(((TableIdentifierContext)_localctx).table.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifier value;
		public IdentifierContext db;
		public IdentifierContext function;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionIdentifier);
		 ((FunctionIdentifierContext)_localctx).value =  new FunctionIdentifier();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2106); ((FunctionIdentifierContext)_localctx).db = identifier();
				setState(2107); match(T__0);
				 _localctx.value.setDb(((FunctionIdentifierContext)_localctx).db.value);
				}
				break;
			}
			setState(2112); ((FunctionIdentifierContext)_localctx).function = identifier();
			 _localctx.value.setFunction(((FunctionIdentifierContext)_localctx).function.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public NamedExpr value;
		public ExpressionContext e;
		public IdentifierContext id;
		public IdentifierListContext il;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2115); ((NamedExpressionContext)_localctx).e = expression();
			 ((NamedExpressionContext)_localctx).value =  new NamedExpr(((NamedExpressionContext)_localctx).e.value);
			setState(2129);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2119);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2117); match(AS);
					 _localctx.value.markAS();
					}
					break;
				}
				setState(2127);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case ANY:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case PIVOT:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case DIRECTORY:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case BOTH:
				case LEADING:
				case TRAILING:
				case IF:
				case POSITION:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(2121); ((NamedExpressionContext)_localctx).id = identifier();
					_localctx.value.addAS(((NamedExpressionContext)_localctx).id.value);
					}
					break;
				case T__7:
					{
					setState(2124); ((NamedExpressionContext)_localctx).il = identifierList();
					 _localctx.value.addAS(((NamedExpressionContext)_localctx).il.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List value;
		public NamedExpressionContext ne;
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_namedExpressionSeq);
		 ((NamedExpressionSeqContext)_localctx).value =  new ArrayList();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2131); ((NamedExpressionSeqContext)_localctx).ne = namedExpression();
			 _localctx.value.add(((NamedExpressionSeqContext)_localctx).ne.value);
			setState(2139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2133); match(T__2);
					setState(2134); ((NamedExpressionSeqContext)_localctx).ne = namedExpression();
					 _localctx.value.add(((NamedExpressionSeqContext)_localctx).ne.value);
					}
					} 
				}
				setState(2141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AST value;
		public BooleanExpressionContext b;
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2142); ((ExpressionContext)_localctx).b = booleanExpression(0);
			 ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).b.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public AST value;
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public BooleanExpressionContext b;
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated;
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanDefault(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public QueryContext query;
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2146); match(NOT);
				setState(2147); ((LogicalNotContext)_localctx).b = booleanExpression(5);
				 ((LogicalNotContext)_localctx).value =  new NOT(((LogicalNotContext)_localctx).b.value);
				}
				break;

			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2150); match(EXISTS);
				setState(2151); match(T__7);
				setState(2152); ((ExistsContext)_localctx).query = query();
				setState(2153); match(T__5);
				 ((ExistsContext)_localctx).value =  new EXISTS(((ExistsContext)_localctx).query.value);
				}
				break;

			case 3:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2156); ((BooleanDefaultContext)_localctx).predicated = predicated();
				 ((BooleanDefaultContext)_localctx).value =  ((BooleanDefaultContext)_localctx).predicated.value;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2171);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2162); ((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2163); ((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						 ((LogicalBinaryContext)_localctx).value =  new AND(((LogicalBinaryContext)_localctx).left.value, ((LogicalBinaryContext)_localctx).right.value);
						}
						break;

					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2166);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2167); ((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2168); ((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						 ((LogicalBinaryContext)_localctx).value =  new OR(((LogicalBinaryContext)_localctx).left.value, ((LogicalBinaryContext)_localctx).right.value);
						}
						break;
					}
					} 
				}
				setState(2175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public Predicated value;
		public ValueExpressionContext v;
		public PredicateContext predicate;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2176); ((PredicatedContext)_localctx).v = valueExpression(0);
			 ((PredicatedContext)_localctx).value =  new Predicated(((PredicatedContext)_localctx).v.value);
			setState(2181);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2178); ((PredicatedContext)_localctx).predicate = predicate();
				 _localctx.value.setPredicate(((PredicatedContext)_localctx).predicate.value);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Predicate value;
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ExpressionContext e;
		public QueryContext query;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_predicate);
		 ((PredicateContext)_localctx).value =  new Predicate();
		int _la;
		try {
			setState(2248);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2185);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2183); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2187); ((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2188); ((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2189); match(AND);
				setState(2190); ((PredicateContext)_localctx).upper = valueExpression(0);
				 ((PredicateContext)_localctx).value =  new Between( _localctx.value.isNot(),((PredicateContext)_localctx).lower.value,((PredicateContext)_localctx).upper.value );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2195);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2193); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2197); ((PredicateContext)_localctx).kind = match(IN);
				 ((PredicateContext)_localctx).value =  new InList(_localctx.value.isNot());
				setState(2199); match(T__7);
				setState(2200); ((PredicateContext)_localctx).e = expression();
				 {InList in = (InList)_localctx.value; in.addExpr(((PredicateContext)_localctx).e.value);} 
				setState(2208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2202); match(T__2);
					setState(2203); ((PredicateContext)_localctx).e = expression();
					 {InList in = (InList)_localctx.value; in.addExpr(((PredicateContext)_localctx).e.value);} 
					}
					}
					setState(2210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2211); match(T__5);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2215);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2213); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2217); ((PredicateContext)_localctx).kind = match(IN);
				setState(2218); match(T__7);
				setState(2219); ((PredicateContext)_localctx).query = query();
				setState(2220); match(T__5);
				 ((PredicateContext)_localctx).value =  new InQuery(_localctx.value.isNot(), ((PredicateContext)_localctx).query.value);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2225);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2223); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2227);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(2228); ((PredicateContext)_localctx).pattern = valueExpression(0);
				 ((PredicateContext)_localctx).value =  new Like(_localctx.value.isNot(), (((PredicateContext)_localctx).kind!=null?((PredicateContext)_localctx).kind.getText():null), ((PredicateContext)_localctx).pattern.value);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2231); match(IS);
				setState(2234);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2232); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2236); ((PredicateContext)_localctx).kind = match(NULL);
				 ((PredicateContext)_localctx).value =  new IsNULL(_localctx.value.isNot());
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2238); match(IS);
				setState(2241);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2239); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2243); ((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2244); match(FROM);
				setState(2245); ((PredicateContext)_localctx).right = valueExpression(0);
				 ((PredicateContext)_localctx).value =  new IsDISTINCT(_localctx.value.isNot(), ((PredicateContext)_localctx).right.value); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public AST value;
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext pe;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ComparisonOperatorContext op;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext ve;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2251);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (TILDE - 136)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(2252); ((ArithmeticUnaryContext)_localctx).ve = valueExpression(7);
				 ((ArithmeticUnaryContext)_localctx).value =  new ArithmeticUnary((((ArithmeticUnaryContext)_localctx).operator!=null?((ArithmeticUnaryContext)_localctx).operator.getText():null), ((ArithmeticUnaryContext)_localctx).ve.value);
				}
				break;

			case 2:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2255); ((ValueExpressionDefaultContext)_localctx).pe = primaryExpression(0);
				 ((ValueExpressionDefaultContext)_localctx).value =  ((ValueExpressionDefaultContext)_localctx).pe.value;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2290);
					switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2260);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2261);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ASTERISK - 138)) | (1L << (SLASH - 138)) | (1L << (PERCENT - 138)) | (1L << (DIV - 138)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(2262); ((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2265);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2266);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (CONCAT_PIPE - 136)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(2267); ((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2270);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2271); ((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2272); ((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2275);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2276); ((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2277); ((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2280);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2281); ((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2282); ((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2285);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2286); ((ComparisonContext)_localctx).op = comparisonOperator();
						setState(2287); ((ComparisonContext)_localctx).right = valueExpression(2);
						 ((ComparisonContext)_localctx).value =  new ArithmeticBinary(((ComparisonContext)_localctx).left.value,((ComparisonContext)_localctx).op.text,((ComparisonContext)_localctx).right.value); 
						}
						break;
					}
					} 
				}
				setState(2294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public AST value;
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public IdentifierContext identifier;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext expr;
		public ExpressionContext expression;
		public WhenClauseContext whenClause;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext pe;
		public ValueExpressionContext index;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public ExpressionContext expr;
		public ExpressionContext expression;
		public DataTypeContext dataType;
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName;
		public SetQuantifierContext sq;
		public ExpressionContext expression;
		public WindowSpecContext w;
		public Token trimOption;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public WhenClauseContext whenClause;
		public ExpressionContext elseExpression;
		public ExpressionContext expression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2296); match(CASE);
				 CASE c = new CASE(); ((SearchedCaseContext)_localctx).value =  c; 
				setState(2301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2298); ((SearchedCaseContext)_localctx).whenClause = whenClause();
					 c.addWhen(((SearchedCaseContext)_localctx).whenClause.value);
					}
					}
					setState(2303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2309);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2305); match(ELSE);
					setState(2306); ((SearchedCaseContext)_localctx).elseExpression = ((SearchedCaseContext)_localctx).expression = expression();
					 c.setElseExpr(((SearchedCaseContext)_localctx).elseExpression.value);
					}
				}

				setState(2311); match(END);
				}
				break;

			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2313); match(CASE);
				setState(2314); ((SimpleCaseContext)_localctx).expr = ((SimpleCaseContext)_localctx).expression = expression();
				 CASE c = new CASE(((SimpleCaseContext)_localctx).expr.value); ((SimpleCaseContext)_localctx).value =  c; 
				setState(2319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2316); ((SimpleCaseContext)_localctx).whenClause = whenClause();
					 c.addWhen(((SimpleCaseContext)_localctx).whenClause.value);
					}
					}
					setState(2321); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2327);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2323); match(ELSE);
					setState(2324); ((SimpleCaseContext)_localctx).elseExpression = ((SimpleCaseContext)_localctx).expression = expression();
					 c.setElseExpr(((SimpleCaseContext)_localctx).elseExpression.value);
					}
				}

				setState(2329); match(END);
				}
				break;

			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2331); match(CAST);
				setState(2332); match(T__7);
				setState(2333); ((CastContext)_localctx).expr = ((CastContext)_localctx).expression = expression();
				setState(2334); match(AS);
				setState(2335); ((CastContext)_localctx).dataType = dataType();
				setState(2336); match(T__5);
				 ((CastContext)_localctx).value =  new CAST(((CastContext)_localctx).expr.value,((CastContext)_localctx).dataType.value);  
				}
				break;

			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2339); match(STRUCT);
				setState(2340); match(T__7);
				setState(2352);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
					{
					setState(2341); ((StructContext)_localctx).namedExpression = ((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					 STRUCT struct = new STRUCT(((StructContext)_localctx).namedExpression.value); ((StructContext)_localctx).value =  struct;
					setState(2349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2343); match(T__2);
						setState(2344); ((StructContext)_localctx).namedExpression = ((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						 struct.addArgument(((StructContext)_localctx).namedExpression.value); 
						}
						}
						setState(2351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2354); match(T__5);
				}
				break;

			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2355); match(FIRST);
				setState(2356); match(T__7);
				setState(2357); ((FirstContext)_localctx).expression = expression();
				 FIRST first = new FIRST(((FirstContext)_localctx).expression.value); ((FirstContext)_localctx).value =  first;
				setState(2362);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2359); match(IGNORE);
					setState(2360); match(NULLS);
					 first.setIgnore(true);
					}
				}

				setState(2364); match(T__5);
				}
				break;

			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2366); match(LAST);
				setState(2367); match(T__7);
				setState(2368); ((LastContext)_localctx).expression = expression();
				 LAST last = new LAST(((LastContext)_localctx).expression.value); ((LastContext)_localctx).value =  last;
				setState(2373);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2370); match(IGNORE);
					setState(2371); match(NULLS);
					 last.setIgnore(true); 
					}
				}

				setState(2375); match(T__5);
				}
				break;

			case 7:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2377); match(POSITION);
				setState(2378); match(T__7);
				setState(2379); ((PositionContext)_localctx).substr = valueExpression(0);
				setState(2380); match(IN);
				setState(2381); ((PositionContext)_localctx).str = valueExpression(0);
				setState(2382); match(T__5);
				 ((PositionContext)_localctx).value =  new POSITION(((PositionContext)_localctx).substr.value,((PositionContext)_localctx).str.value);
				}
				break;

			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2385); ((ConstantDefaultContext)_localctx).constant = constant();
				((ConstantDefaultContext)_localctx).value =  ((ConstantDefaultContext)_localctx).constant.value;
				}
				break;

			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2388); match(ASTERISK);
				 ((StarContext)_localctx).value =  new Star();
				}
				break;

			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2390); ((StarContext)_localctx).qualifiedName = qualifiedName();
				setState(2391); match(T__0);
				setState(2392); match(ASTERISK);
				 ((StarContext)_localctx).value =  new Star(((StarContext)_localctx).qualifiedName.value);
				}
				break;

			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2395); match(T__7);
				setState(2396); ((RowConstructorContext)_localctx).namedExpression = namedExpression();
				 RowConstructor rc = new RowConstructor(((RowConstructorContext)_localctx).namedExpression.value); ((RowConstructorContext)_localctx).value =  rc;
				setState(2402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2398); match(T__2);
					setState(2399); ((RowConstructorContext)_localctx).namedExpression = namedExpression();
					 rc.addRow(((RowConstructorContext)_localctx).namedExpression.value);
					}
					}
					setState(2404); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2406); match(T__5);
				}
				break;

			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2408); match(T__7);
				setState(2409); ((SubqueryExpressionContext)_localctx).query = query();
				setState(2410); match(T__5);
				 ((SubqueryExpressionContext)_localctx).value =  new SubQuery(((SubqueryExpressionContext)_localctx).query.value); 
				}
				break;

			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2413); ((FunctionCallContext)_localctx).qualifiedName = qualifiedName();
				 AST quantifier = null; FunctionCall fc = new FunctionCall(((FunctionCallContext)_localctx).qualifiedName.value);  ((FunctionCallContext)_localctx).value =  fc;
				setState(2415); match(T__7);
				setState(2432);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
					{
					setState(2419);
					switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
					case 1:
						{
						setState(2416); ((FunctionCallContext)_localctx).sq = setQuantifier();
						 quantifier = ((FunctionCallContext)_localctx).sq.value; 
						}
						break;
					}
					setState(2421); ((FunctionCallContext)_localctx).expression = expression();
					 fc.addArgument(new Argument(quantifier,((FunctionCallContext)_localctx).expression.value));
					setState(2429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2423); match(T__2);
						setState(2424); ((FunctionCallContext)_localctx).expression = expression();
						 fc.addArgument(new Argument(((FunctionCallContext)_localctx).expression.value));
						}
						}
						setState(2431);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2434); match(T__5);
				setState(2439);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2435); match(OVER);
					setState(2436); ((FunctionCallContext)_localctx).w = windowSpec();
					 fc.setWindowSpec(((FunctionCallContext)_localctx).w.value);
					}
					break;
				}
				}
				break;

			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2441); ((FunctionCallContext)_localctx).qualifiedName = qualifiedName();
				setState(2442); match(T__7);
				setState(2443);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (BOTH - 123)) | (1L << (LEADING - 123)) | (1L << (TRAILING - 123)))) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				consume();
				 TrimFunctionCall fc = new TrimFunctionCall(((FunctionCallContext)_localctx).qualifiedName.value,(((FunctionCallContext)_localctx).trimOption!=null?((FunctionCallContext)_localctx).trimOption.getText():null)); ((FunctionCallContext)_localctx).value =  fc;
				setState(2445); ((FunctionCallContext)_localctx).expression = ((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				fc.addArgument(((FunctionCallContext)_localctx).expression.value); 
				setState(2447); match(FROM);
				setState(2448); ((FunctionCallContext)_localctx).expression = ((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				fc.addArgument(((FunctionCallContext)_localctx).expression.value); 
				setState(2450); match(T__5);
				}
				break;

			case 15:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2452); ((ColumnReferenceContext)_localctx).identifier = identifier();
				 ((ColumnReferenceContext)_localctx).value =  ((ColumnReferenceContext)_localctx).identifier.value;
				}
				break;

			case 16:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2455); match(T__7);
				setState(2456); ((ParenthesizedExpressionContext)_localctx).expression = expression();
				setState(2457); match(T__5);
				 ((ParenthesizedExpressionContext)_localctx).value =  new ParenthesizedExpression(((ParenthesizedExpressionContext)_localctx).expression.value);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2473);
					switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2462);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2463); match(T__3);
						setState(2464); ((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2465); match(T__1);
						 ((SubscriptContext)_localctx).value =  new SubScript(((SubscriptContext)_localctx).pe.value,((SubscriptContext)_localctx).index.value);
						}
						break;

					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2468);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2469); match(T__0);
						setState(2470); ((DereferenceContext)_localctx).fieldName = ((DereferenceContext)_localctx).identifier = identifier();
						 ((DereferenceContext)_localctx).value =  new Dereference(((DereferenceContext)_localctx).base.value,((DereferenceContext)_localctx).fieldName.value);
						}
						break;
					}
					} 
				}
				setState(2477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public AST value;
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public Token s;
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext i;
		public Token s;
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext i;
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue;
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_constant);
		try {
			int _alt;
			setState(2499);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2478); match(NULL);
				 ((NullLiteralContext)_localctx).value =  new NULL();
				}
				break;

			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2480); ((IntervalLiteralContext)_localctx).i = interval();
				 ((IntervalLiteralContext)_localctx).value =  ((IntervalLiteralContext)_localctx).i.value;
				}
				break;

			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2483); ((TypeConstructorContext)_localctx).i = identifier();
				setState(2484); ((TypeConstructorContext)_localctx).s = match(STRING);
				 ((TypeConstructorContext)_localctx).value =  new TypeConstructor(((TypeConstructorContext)_localctx).i.value,(((TypeConstructorContext)_localctx).s!=null?((TypeConstructorContext)_localctx).s.getText():null));
				}
				break;

			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2487); ((NumericLiteralContext)_localctx).number = number();
				 ((NumericLiteralContext)_localctx).value =  ((NumericLiteralContext)_localctx).number.value;
				}
				break;

			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2490); ((BooleanLiteralContext)_localctx).booleanValue = booleanValue();
				 ((BooleanLiteralContext)_localctx).value =  ((BooleanLiteralContext)_localctx).booleanValue.value;
				}
				break;

			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2495); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2493); ((StringLiteralContext)_localctx).s = match(STRING);
						 ((StringLiteralContext)_localctx).value =  new StringLiteral((((StringLiteralContext)_localctx).s!=null?((StringLiteralContext)_localctx).s.getText():null));
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2497); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public String text;
		public Token c;
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2501);
			((ComparisonOperatorContext)_localctx).c = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EQ - 128)) | (1L << (NSEQ - 128)) | (1L << (NEQ - 128)) | (1L << (NEQJ - 128)) | (1L << (LT - 128)) | (1L << (LTE - 128)) | (1L << (GT - 128)) | (1L << (GTE - 128)))) != 0)) ) {
				((ComparisonOperatorContext)_localctx).c = (Token)_errHandler.recoverInline(this);
			}
			consume();
			 ((ComparisonOperatorContext)_localctx).text =  (((ComparisonOperatorContext)_localctx).c!=null?((ComparisonOperatorContext)_localctx).c.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public String text;
		public Token c;
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			((ArithmeticOperatorContext)_localctx).c = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (SLASH - 136)) | (1L << (PERCENT - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (AMPERSAND - 136)) | (1L << (PIPE - 136)) | (1L << (CONCAT_PIPE - 136)) | (1L << (HAT - 136)))) != 0)) ) {
				((ArithmeticOperatorContext)_localctx).c = (Token)_errHandler.recoverInline(this);
			}
			consume();
			 ((ArithmeticOperatorContext)_localctx).text =  (((ArithmeticOperatorContext)_localctx).c!=null?((ArithmeticOperatorContext)_localctx).c.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public String text;
		public Token c;
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2507);
			((PredicateOperatorContext)_localctx).c = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
				((PredicateOperatorContext)_localctx).c = (Token)_errHandler.recoverInline(this);
			}
			consume();
			 ((PredicateOperatorContext)_localctx).text =  (((PredicateOperatorContext)_localctx).c!=null?((PredicateOperatorContext)_localctx).c.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public BoolValue value;
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_booleanValue);
		try {
			setState(2514);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2510); match(TRUE);
				 ((BooleanValueContext)_localctx).value =  new BoolValue(true);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2512); match(FALSE);
				 ((BooleanValueContext)_localctx).value =  new BoolValue(false);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public INTERVAL value;
		public IntervalFieldContext intervalField;
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_interval);
		  ((IntervalContext)_localctx).value =  new INTERVAL();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2516); match(INTERVAL);
			setState(2522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2517); ((IntervalContext)_localctx).intervalField = intervalField();
					 _localctx.value.addIntervalField(((IntervalContext)_localctx).intervalField.value);
					}
					} 
				}
				setState(2524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalField value;
		public IntervalValueContext iv;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2525); ((IntervalFieldContext)_localctx).iv = intervalValue();
			setState(2526); ((IntervalFieldContext)_localctx).unit = identifier();
			setState(2529);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2527); match(TO);
				setState(2528); ((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public IntervalValue value;
		public Token s;
		public Token v;
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_intervalValue);
		 ((IntervalValueContext)_localctx).value =  new IntervalValue(); 
		int _la;
		try {
			setState(2539);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2533);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2531);
					((IntervalValueContext)_localctx).s = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((IntervalValueContext)_localctx).s = (Token)_errHandler.recoverInline(this);
					}
					consume();
					 _localctx.value.setSign((((IntervalValueContext)_localctx).s!=null?((IntervalValueContext)_localctx).s.getText():null));
					}
				}

				setState(2535);
				((IntervalValueContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((IntervalValueContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				consume();
				  _localctx.value.setValue((((IntervalValueContext)_localctx).v!=null?((IntervalValueContext)_localctx).v.getText():null));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2537); ((IntervalValueContext)_localctx).v = match(STRING);
				  _localctx.value.setValue((((IntervalValueContext)_localctx).v!=null?((IntervalValueContext)_localctx).v.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public AST value;
		public Token f;
		public IdentifierContext identifier;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_colPosition);
		try {
			setState(2547);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2541); ((ColPositionContext)_localctx).f = match(FIRST);
				 ((ColPositionContext)_localctx).value =  new ColPosition((((ColPositionContext)_localctx).f!=null?((ColPositionContext)_localctx).f.getText():null));
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2543); ((ColPositionContext)_localctx).f = match(AFTER);
				setState(2544); ((ColPositionContext)_localctx).identifier = identifier();
				 ((ColPositionContext)_localctx).value =  new ColPosition((((ColPositionContext)_localctx).f!=null?((ColPositionContext)_localctx).f.getText():null), ((ColPositionContext)_localctx).identifier.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataType value;
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public DataTypeContext dataType;
		public DataTypeContext k;
		public DataTypeContext v;
		public ComplexColTypeListContext c;
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext i;
		public Token v;
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_dataType);
		int _la;
		try {
			setState(2592);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2549); ((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2550); match(LT);
				setState(2551); ((ComplexDataTypeContext)_localctx).dataType = dataType();
				setState(2552); match(GT);
				 ((ComplexDataTypeContext)_localctx).value =  new ARRAY(_localctx.value);  
				}
				break;

			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2555); ((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2556); match(LT);
				setState(2557); ((ComplexDataTypeContext)_localctx).k = dataType();
				setState(2558); match(T__2);
				setState(2559); ((ComplexDataTypeContext)_localctx).v = dataType();
				setState(2560); match(GT);
				 ((ComplexDataTypeContext)_localctx).value =  new MAP(((ComplexDataTypeContext)_localctx).k.value, ((ComplexDataTypeContext)_localctx).v.value);
				}
				break;

			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2563); ((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				 ComplexDataType struct = new ComplexDataType(); ((ComplexDataTypeContext)_localctx).value = struct;
				setState(2574);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2565); match(LT);
					setState(2569);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
						{
						setState(2566); ((ComplexDataTypeContext)_localctx).c = complexColTypeList();
						 struct.setComplexColTypeList(((ComplexDataTypeContext)_localctx).c.value);
						}
					}

					setState(2571); match(GT);
					}
					break;
				case NEQ:
					{
					setState(2572); match(NEQ);
					 struct.setNeq(new NEQ());
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2576); ((PrimitiveDataTypeContext)_localctx).i = identifier();
				 PrimitiveDataType pdt = new PrimitiveDataType(((PrimitiveDataTypeContext)_localctx).i.value); ((PrimitiveDataTypeContext)_localctx).value =  pdt; 
				setState(2590);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2578); match(T__7);
					setState(2579); ((PrimitiveDataTypeContext)_localctx).v = match(INTEGER_VALUE);
					 pdt.addValue(new IntegerValue((((PrimitiveDataTypeContext)_localctx).v!=null?((PrimitiveDataTypeContext)_localctx).v.getText():null)));  
					setState(2586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2581); match(T__2);
						setState(2582); ((PrimitiveDataTypeContext)_localctx).v = match(INTEGER_VALUE);
						 pdt.addValue(new IntegerValue((((PrimitiveDataTypeContext)_localctx).v!=null?((PrimitiveDataTypeContext)_localctx).v.getText():null))); 
						}
						}
						setState(2588);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2589); match(T__5);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List value;
		public ColTypeContext colType;
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_colTypeList);
		 ((ColTypeListContext)_localctx).value =  new ArrayList(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2594); ((ColTypeListContext)_localctx).colType = colType();
			 _localctx.value.add(((ColTypeListContext)_localctx).colType.value);
			setState(2602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2596); match(T__2);
					setState(2597); ((ColTypeListContext)_localctx).colType = colType();
					 _localctx.value.add(((ColTypeListContext)_localctx).colType.value);
					}
					} 
				}
				setState(2604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public ColType value;
		public IdentifierContext identifier;
		public DataTypeContext dataType;
		public Token s;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2605); ((ColTypeContext)_localctx).identifier = identifier();
			setState(2606); ((ColTypeContext)_localctx).dataType = dataType();
			((ColTypeContext)_localctx).value =  new ColType(((ColTypeContext)_localctx).identifier.value, ((ColTypeContext)_localctx).dataType.value); 
			setState(2611);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2608); match(COMMENT);
				setState(2609); ((ColTypeContext)_localctx).s = match(STRING);
				 _localctx.value.setComment((((ColTypeContext)_localctx).s!=null?((ColTypeContext)_localctx).s.getText():null));
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List value;
		public ComplexColTypeContext complexColType;
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_complexColTypeList);
		 ((ComplexColTypeListContext)_localctx).value =  new ArrayList(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2613); ((ComplexColTypeListContext)_localctx).complexColType = complexColType();
			 _localctx.value.add(((ComplexColTypeListContext)_localctx).complexColType.value);
			setState(2621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2615); match(T__2);
				setState(2616); ((ComplexColTypeListContext)_localctx).complexColType = complexColType();
				 _localctx.value.add(((ComplexColTypeListContext)_localctx).complexColType.value);
				}
				}
				setState(2623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public ComplexColType value;
		public IdentifierContext identifier;
		public DataTypeContext dataType;
		public Token s;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2624); ((ComplexColTypeContext)_localctx).identifier = identifier();
			setState(2625); match(T__4);
			setState(2626); ((ComplexColTypeContext)_localctx).dataType = dataType();
			 ((ComplexColTypeContext)_localctx).value =  new ComplexColType(((ComplexColTypeContext)_localctx).identifier.value, ((ComplexColTypeContext)_localctx).dataType.value);
			setState(2631);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2628); match(COMMENT);
				setState(2629); ((ComplexColTypeContext)_localctx).s = match(STRING);
				 _localctx.value.setComment((((ComplexColTypeContext)_localctx).s!=null?((ComplexColTypeContext)_localctx).s.getText():null));
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public AST value;
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2633); match(WHEN);
			setState(2634); ((WhenClauseContext)_localctx).condition = expression();
			setState(2635); match(THEN);
			setState(2636); ((WhenClauseContext)_localctx).result = expression();
			 ((WhenClauseContext)_localctx).value =  new WhenClause(((WhenClauseContext)_localctx).condition.value, ((WhenClauseContext)_localctx).result.value); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowsContext extends ParserRuleContext {
		public Windows value;
		public NamedWindowContext namedWindow;
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindows(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_windows);
		 ((WindowsContext)_localctx).value =  new Windows();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2639); match(WINDOW);
			setState(2640); ((WindowsContext)_localctx).namedWindow = namedWindow();
			 _localctx.value.addWindow(((WindowsContext)_localctx).namedWindow.value);
			setState(2648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2642); match(T__2);
					setState(2643); ((WindowsContext)_localctx).namedWindow = namedWindow();
					 _localctx.value.addWindow(((WindowsContext)_localctx).namedWindow.value);
					}
					} 
				}
				setState(2650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public AST value;
		public IdentifierContext identifier;
		public WindowSpecContext windowSpec;
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2651); ((NamedWindowContext)_localctx).identifier = identifier();
			setState(2652); match(AS);
			setState(2653); ((NamedWindowContext)_localctx).windowSpec = windowSpec();
			 ((NamedWindowContext)_localctx).value =  new NamedWindow(((NamedWindowContext)_localctx).identifier.value,((NamedWindowContext)_localctx).windowSpec.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpec value;
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public Token pname;
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public Token sname;
		public SortItemContext sortItem;
		public WindowFrameContext windowFrame;
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_windowSpec);
		 ((WindowSpecContext)_localctx).value =  new WindowSpec();
		int _la;
		try {
			setState(2714);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2656); ((WindowRefContext)_localctx).name = identifier();
				((WindowRefContext)_localctx).value =  new WindowSpec(((WindowRefContext)_localctx).name.value); 
				}
				break;
			case T__7:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2659); match(T__7);
				setState(2706);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2660); ((WindowDefContext)_localctx).pname = match(CLUSTER);
					 ((WindowDefContext)_localctx).value =  new WindowSpec((((WindowDefContext)_localctx).pname!=null?((WindowDefContext)_localctx).pname.getText():null)); 
					setState(2662); match(BY);
					setState(2663); ((WindowDefContext)_localctx).expression = ((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					 _localctx.value.addPartition(((WindowDefContext)_localctx).expression.value);
					setState(2671);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2665); match(T__2);
						setState(2666); ((WindowDefContext)_localctx).expression = ((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						 _localctx.value.addPartition(((WindowDefContext)_localctx).expression.value);
						}
						}
						setState(2673);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__5:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2688);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2674);
						((WindowDefContext)_localctx).pname = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
							((WindowDefContext)_localctx).pname = (Token)_errHandler.recoverInline(this);
						}
						consume();
						 ((WindowDefContext)_localctx).value =  new WindowSpec((((WindowDefContext)_localctx).pname!=null?((WindowDefContext)_localctx).pname.getText():null)); 
						setState(2676); match(BY);
						setState(2677); ((WindowDefContext)_localctx).expression = ((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						 _localctx.value.addPartition(((WindowDefContext)_localctx).expression.value);
						setState(2685);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2679); match(T__2);
							setState(2680); ((WindowDefContext)_localctx).expression = ((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							 _localctx.value.addPartition(((WindowDefContext)_localctx).expression.value);
							}
							}
							setState(2687);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2704);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2690);
						((WindowDefContext)_localctx).sname = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
							((WindowDefContext)_localctx).sname = (Token)_errHandler.recoverInline(this);
						}
						consume();
						 _localctx.value.setSortMethod((((WindowDefContext)_localctx).sname!=null?((WindowDefContext)_localctx).sname.getText():null));
						setState(2692); match(BY);
						setState(2693); ((WindowDefContext)_localctx).sortItem = sortItem();
						 _localctx.value.addSortItem(((WindowDefContext)_localctx).sortItem.value);
						setState(2701);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2695); match(T__2);
							setState(2696); ((WindowDefContext)_localctx).sortItem = sortItem();
							 _localctx.value.addSortItem(((WindowDefContext)_localctx).sortItem.value);
							}
							}
							setState(2703);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2711);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2708); ((WindowDefContext)_localctx).windowFrame = windowFrame();
					 _localctx.value.setWindowFrame(((WindowDefContext)_localctx).windowFrame.value);
					}
				}

				setState(2713); match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public WindowFrame value;
		public Token frameType;
		public FrameBoundContext s;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_windowFrame);
		try {
			setState(2738);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2716); ((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2717); ((WindowFrameContext)_localctx).s = frameBound();
				 ((WindowFrameContext)_localctx).value =  new WindowFrame((((WindowFrameContext)_localctx).frameType!=null?((WindowFrameContext)_localctx).frameType.getText():null),((WindowFrameContext)_localctx).s.value); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2720); ((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2721); ((WindowFrameContext)_localctx).s = frameBound();
				 ((WindowFrameContext)_localctx).value =  new WindowFrame((((WindowFrameContext)_localctx).frameType!=null?((WindowFrameContext)_localctx).frameType.getText():null), ((WindowFrameContext)_localctx).s.value);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2724); ((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2725); match(BETWEEN);
				setState(2726); ((WindowFrameContext)_localctx).s = frameBound();
				setState(2727); match(AND);
				setState(2728); ((WindowFrameContext)_localctx).end = frameBound();
				 ((WindowFrameContext)_localctx).value =  new WindowFrame((((WindowFrameContext)_localctx).frameType!=null?((WindowFrameContext)_localctx).frameType.getText():null), ((WindowFrameContext)_localctx).s.value, ((WindowFrameContext)_localctx).end.value);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2731); ((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2732); match(BETWEEN);
				setState(2733); ((WindowFrameContext)_localctx).s = frameBound();
				setState(2734); match(AND);
				setState(2735); ((WindowFrameContext)_localctx).end = frameBound();
				 ((WindowFrameContext)_localctx).value =  new WindowFrame((((WindowFrameContext)_localctx).frameType!=null?((WindowFrameContext)_localctx).frameType.getText():null), ((WindowFrameContext)_localctx).s.value, ((WindowFrameContext)_localctx).end.value);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBound value;
		public Token UNBOUNDED;
		public Token boundType;
		public Token ROW;
		public ExpressionContext expression;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_frameBound);
		int _la;
		try {
			setState(2750);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2740); ((FrameBoundContext)_localctx).UNBOUNDED = match(UNBOUNDED);
				setState(2741);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				consume();
				 ((FrameBoundContext)_localctx).value =  new FrameBound((((FrameBoundContext)_localctx).boundType!=null?((FrameBoundContext)_localctx).boundType.getText():null)); _localctx.value.setBoundType((((FrameBoundContext)_localctx).UNBOUNDED!=null?((FrameBoundContext)_localctx).UNBOUNDED.getText():null)); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2743); ((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2744); ((FrameBoundContext)_localctx).ROW = match(ROW);
				 ((FrameBoundContext)_localctx).value =  new FrameBound((((FrameBoundContext)_localctx).boundType!=null?((FrameBoundContext)_localctx).boundType.getText():null)); _localctx.value.setBoundType((((FrameBoundContext)_localctx).ROW!=null?((FrameBoundContext)_localctx).ROW.getText():null)); 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2746); ((FrameBoundContext)_localctx).expression = expression();
				setState(2747);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				consume();
				 ((FrameBoundContext)_localctx).value =  new FrameBound((((FrameBoundContext)_localctx).boundType!=null?((FrameBoundContext)_localctx).boundType.getText():null)); _localctx.value.setExpr(((FrameBoundContext)_localctx).expression.value); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public QualifiedName value;
		public IdentifierContext i;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_qualifiedName);
		 ((QualifiedNameContext)_localctx).value =  new QualifiedName();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2752); ((QualifiedNameContext)_localctx).i = identifier();
			 _localctx.value.addIdentifier(((QualifiedNameContext)_localctx).i.value); 
			setState(2760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2754); match(T__0);
					setState(2755); ((QualifiedNameContext)_localctx).i = identifier();
					 _localctx.value.addIdentifier(((QualifiedNameContext)_localctx).i.value); 
					}
					} 
				}
				setState(2762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public AST value;
		public StrictIdentifierContext s;
		public Token t;
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_identifier);
		int _la;
		try {
			setState(2768);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2763); ((IdentifierContext)_localctx).s = strictIdentifier();
				 ((IdentifierContext)_localctx).value =  ((IdentifierContext)_localctx).s.value;
				}
				break;
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2766);
				((IdentifierContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (JOIN - 51)) | (1L << (CROSS - 51)) | (1L << (INNER - 51)) | (1L << (LEFT - 51)) | (1L << (SEMI - 51)) | (1L << (RIGHT - 51)) | (1L << (FULL - 51)) | (1L << (NATURAL - 51)) | (1L << (ON - 51)) | (1L << (UNION - 51)) | (1L << (EXCEPT - 51)) | (1L << (SETMINUS - 51)) | (1L << (INTERSECT - 51)))) != 0) || _la==ANTI) ) {
					((IdentifierContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				consume();
				 ((IdentifierContext)_localctx).value =  new Identifier((((IdentifierContext)_localctx).t!=null?((IdentifierContext)_localctx).t.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public Identifier value;
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext q;
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public Token i;
		public NonReservedContext n;
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_strictIdentifier);
		try {
			setState(2778);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2770); ((UnquotedIdentifierContext)_localctx).i = match(IDENTIFIER);
				 ((UnquotedIdentifierContext)_localctx).value =  new Identifier((((UnquotedIdentifierContext)_localctx).i!=null?((UnquotedIdentifierContext)_localctx).i.getText():null));
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2772); ((QuotedIdentifierAlternativeContext)_localctx).q = quotedIdentifier();
				 ((QuotedIdentifierAlternativeContext)_localctx).value =  ((QuotedIdentifierAlternativeContext)_localctx).q.value;
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2775); ((UnquotedIdentifierContext)_localctx).n = nonReserved();
				 ((UnquotedIdentifierContext)_localctx).value =  new Identifier(((UnquotedIdentifierContext)_localctx).n.value); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public Identifier value;
		public Token b;
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780); ((QuotedIdentifierContext)_localctx).b = match(BACKQUOTED_IDENTIFIER);
			((QuotedIdentifierContext)_localctx).value =  new Identifier((((QuotedIdentifierContext)_localctx).b!=null?((QuotedIdentifierContext)_localctx).b.getText():null)); _localctx.value.setQuoted(true); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberValue value;
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public Token v;
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public Token v;
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public Token v;
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public Token v;
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public Token v;
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public Token v;
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public Token v;
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_number);
		 ((NumberContext)_localctx).value =  new NumberValue();
		int _la;
		try {
			setState(2825);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2785);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2783); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2787); ((DecimalLiteralContext)_localctx).v = match(DECIMAL_VALUE);
				 ((DecimalLiteralContext)_localctx).value =  new DecimalValue(_localctx.value.isMinus(),(((DecimalLiteralContext)_localctx).v!=null?((DecimalLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2791);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2789); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2793); ((IntegerLiteralContext)_localctx).v = match(INTEGER_VALUE);
				 ((IntegerLiteralContext)_localctx).value =  new IntegerValue(_localctx.value.isMinus(),(((IntegerLiteralContext)_localctx).v!=null?((IntegerLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2797);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2795); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2799); ((BigIntLiteralContext)_localctx).v = match(BIGINT_LITERAL);
				 ((BigIntLiteralContext)_localctx).value =  new BigIntValue(_localctx.value.isMinus(),(((BigIntLiteralContext)_localctx).v!=null?((BigIntLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2803);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2801); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2805); ((SmallIntLiteralContext)_localctx).v = match(SMALLINT_LITERAL);
				 ((SmallIntLiteralContext)_localctx).value =  new SmallIntValue(_localctx.value.isMinus(),(((SmallIntLiteralContext)_localctx).v!=null?((SmallIntLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2809);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2807); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2811); ((TinyIntLiteralContext)_localctx).v = match(TINYINT_LITERAL);
				 ((TinyIntLiteralContext)_localctx).value =  new TinyIntValue(_localctx.value.isMinus(),(((TinyIntLiteralContext)_localctx).v!=null?((TinyIntLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2815);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2813); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2817); ((DoubleLiteralContext)_localctx).v = match(DOUBLE_LITERAL);
				 ((DoubleLiteralContext)_localctx).value =  new DoubleValue(_localctx.value.isMinus(),(((DoubleLiteralContext)_localctx).v!=null?((DoubleLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2821);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2819); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2823); ((BigDecimalLiteralContext)_localctx).v = match(BIGDECIMAL_LITERAL);
				 ((BigDecimalLiteralContext)_localctx).value =  new BigDecimalValue(_localctx.value.isMinus(),(((BigDecimalLiteralContext)_localctx).v!=null?((BigDecimalLiteralContext)_localctx).v.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public String value;
		public Token t;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode TABLE(int i) {
			return getToken(SqlBaseParser.TABLE, i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TO(int i) {
			return getToken(SqlBaseParser.TO, i);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<TerminalNode> TABLE() { return getTokens(SqlBaseParser.TABLE); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public List<TerminalNode> TO() { return getTokens(SqlBaseParser.TO); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			((NonReservedContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)))) != 0)) ) {
				((NonReservedContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			consume();
			 ((NonReservedContext)_localctx).value =  (((NonReservedContext)_localctx).t!=null?((NonReservedContext)_localctx).t.getText():null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35: return queryTerm_sempred((QueryTermContext)_localctx, predIndex);

		case 41: return hintExpression_sempred((HintExpressionContext)_localctx, predIndex);

		case 44: return hintValueExpression_sempred((HintValueExpressionContext)_localctx, predIndex);

		case 73: return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);

		case 76: return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);

		case 77: return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return precpred(_ctx, 4);

		case 13: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 6);

		case 7: return precpred(_ctx, 5);

		case 8: return precpred(_ctx, 4);

		case 9: return precpred(_ctx, 3);

		case 10: return precpred(_ctx, 2);

		case 11: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean hintValueExpression_sempred(HintValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean hintExpression_sempred(HintExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);

		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);

		case 5: return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00fe\u0b11\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f5\n\b\3"+
		"\b\3\b\3\b\5\b\u00fa\n\b\3\b\5\b\u00fd\n\b\3\b\3\b\3\b\5\b\u0102\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010f\n\b\3\b\3\b\5\b\u0113"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u011a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u0128\n\b\f\b\16\b\u012b\13\b\3\b\5\b\u012e\n\b\3"+
		"\b\5\b\u0131\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0138\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0149\n\b\f\b\16\b\u014c"+
		"\13\b\3\b\5\b\u014f\n\b\3\b\5\b\u0152\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0159"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u015f\n\b\3\b\3\b\3\b\3\b\5\b\u0165\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u016d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u018d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0195\n\b\3\b\3"+
		"\b\5\b\u0199\n\b\3\b\3\b\3\b\5\b\u019e\n\b\3\b\3\b\3\b\3\b\5\b\u01a4\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01ac\n\b\3\b\3\b\3\b\3\b\5\b\u01b2\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01bf\n\b\3\b\6\b\u01c2"+
		"\n\b\r\b\16\b\u01c3\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01cd\n\b\3\b\6\b"+
		"\u01d0\n\b\r\b\16\b\u01d1\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u01e2\n\b\3\b\3\b\3\b\7\b\u01e7\n\b\f\b\16\b\u01ea\13"+
		"\b\3\b\5\b\u01ed\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f5\n\b\3\b\3\b\3\b"+
		"\7\b\u01fa\n\b\f\b\16\b\u01fd\13\b\3\b\3\b\3\b\3\b\5\b\u0203\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0212\n\b\3\b\3\b\5"+
		"\b\u0216\n\b\3\b\3\b\3\b\3\b\5\b\u021c\n\b\3\b\3\b\3\b\3\b\5\b\u0222\n"+
		"\b\3\b\5\b\u0225\n\b\3\b\5\b\u0228\n\b\3\b\3\b\3\b\3\b\5\b\u022e\n\b\3"+
		"\b\3\b\5\b\u0232\n\b\3\b\3\b\5\b\u0236\n\b\3\b\3\b\3\b\5\b\u023b\n\b\3"+
		"\b\3\b\5\b\u023f\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0247\n\b\3\b\5\b\u024a"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0253\n\b\3\b\3\b\3\b\5\b\u0258\n"+
		"\b\3\b\3\b\3\b\3\b\5\b\u025e\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0265\n\b\3\b"+
		"\5\b\u0268\n\b\3\b\3\b\3\b\3\b\5\b\u026e\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\b\u0277\n\b\f\b\16\b\u027a\13\b\5\b\u027c\n\b\3\b\3\b\5\b\u0280\n"+
		"\b\3\b\3\b\3\b\5\b\u0285\n\b\3\b\3\b\3\b\5\b\u028a\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0291\n\b\3\b\5\b\u0294\n\b\3\b\5\b\u0297\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u029e\n\b\3\b\3\b\3\b\5\b\u02a3\n\b\3\b\3\b\3\b\5\b\u02a8\n\b"+
		"\3\b\5\b\u02ab\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02b4\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u02bc\n\b\3\b\3\b\3\b\3\b\5\b\u02c2\n\b\3\b\3\b\5\b"+
		"\u02c6\n\b\3\b\3\b\5\b\u02ca\n\b\3\b\3\b\5\b\u02ce\n\b\5\b\u02d0\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02d9\n\b\3\b\3\b\3\b\3\b\5\b\u02df\n\b"+
		"\3\b\3\b\3\b\5\b\u02e4\n\b\3\b\5\b\u02e7\n\b\3\b\3\b\5\b\u02eb\n\b\3\b"+
		"\5\b\u02ee\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u02f6\n\b\f\b\16\b\u02f9\13"+
		"\b\5\b\u02fb\n\b\3\b\3\b\5\b\u02ff\n\b\3\b\3\b\3\b\5\b\u0304\n\b\3\b\5"+
		"\b\u0307\n\b\3\b\3\b\3\b\3\b\5\b\u030d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0315\n\b\3\b\3\b\3\b\5\b\u031a\n\b\3\b\3\b\3\b\3\b\5\b\u0320\n\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0326\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u032f\n\b\f"+
		"\b\16\b\u0332\13\b\3\b\3\b\3\b\7\b\u0337\n\b\f\b\16\b\u033a\13\b\3\b\3"+
		"\b\7\b\u033e\n\b\f\b\16\b\u0341\13\b\3\b\3\b\3\b\7\b\u0346\n\b\f\b\16"+
		"\b\u0349\13\b\5\b\u034b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0353\n\t\3\t"+
		"\3\t\5\t\u0357\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u035e\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u03d2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03da\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03e2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u03eb\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03f7\n\t\3\n\3"+
		"\n\5\n\u03fb\n\n\3\n\5\n\u03fe\n\n\3\n\3\n\3\n\3\n\5\n\u0404\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u040e\n\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u041a\n\f\3\f\3\f\3\f\5\f\u041f\n\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\5\16\u0428\n\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0438\n\17\5\17\u043a\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u0441\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0448\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u044f\n\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0457\n\17\3\17\3\17\3\17\5\17\u045c\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0463\n\17\3\17\3\17\3\17\5\17\u0468\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u0470\n\17\5\17\u0472\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0479\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0483\n\21\f\21\16\21\u0486\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0490\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u04a0\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u04a8\n\24\f\24\16\24\u04ab\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u04b4\n\25\f\25\16\25\u04b7\13\25\3\26\3\26\3\26\5\26\u04bc"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u04ce\n\30\f\30\16\30\u04d1\13\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\5\31\u04d9\n\31\3\31\3\31\3\31\5\31\u04de\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\7\32\u04e6\n\32\f\32\16\32\u04e9\13\32\3\32\3"+
		"\32\5\32\u04ed\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u04f8\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0501\n\34\f\34\16"+
		"\34\u0504\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u050f"+
		"\n\35\f\35\16\35\u0512\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u0520\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u052a\n\37\3 \3 \3 \3 \5 \u0530\n \3!\3!\3!\3!\3\"\5\"\u0537"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u053f\n\"\r\"\16\"\u0540\5\"\u0543\n"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\7#\u054d\n#\f#\16#\u0550\13#\5#\u0552\n#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\7#\u055c\n#\f#\16#\u055f\13#\5#\u0561\n#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\7#\u056b\n#\f#\16#\u056e\13#\5#\u0570\n#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\7#\u057a\n#\f#\16#\u057d\13#\5#\u057f\n#\3#\5#\u0582\n#"+
		"\3#\3#\3#\3#\3#\3#\5#\u058a\n#\5#\u058c\n#\3$\5$\u058f\n$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3%\5%\u059b\n%\3%\3%\3%\7%\u05a0\n%\f%\16%\u05a3\13%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u05b0\n&\3\'\3\'\3\'\3\'\5\'\u05b6"+
		"\n\'\3\'\3\'\3\'\5\'\u05bb\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u05c7"+
		"\n(\3(\5(\u05ca\n(\3(\3(\5(\u05ce\n(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u05d8"+
		"\n(\3(\3(\5(\u05dc\n(\5(\u05de\n(\3(\5(\u05e1\n(\3(\3(\5(\u05e5\n(\3("+
		"\5(\u05e8\n(\3(\3(\5(\u05ec\n(\3(\3(\3(\3(\7(\u05f2\n(\f(\16(\u05f5\13"+
		"(\3(\3(\3(\5(\u05fa\n(\3(\3(\3(\3(\3(\5(\u0601\n(\3(\3(\3(\3(\3(\3(\5"+
		"(\u0609\n(\3(\3(\3(\5(\u060e\n(\5(\u0610\n(\3(\3(\3(\7(\u0615\n(\f(\16"+
		"(\u0618\13(\3(\3(\3(\3(\5(\u061e\n(\3(\3(\3(\5(\u0623\n(\3(\3(\3(\3(\5"+
		"(\u0629\n(\3(\5(\u062c\n(\3(\3(\5(\u0630\n(\3)\3)\3)\3)\5)\u0636\n)\3"+
		")\3)\3)\7)\u063b\n)\f)\16)\u063e\13)\3)\3)\3*\3*\3*\3*\3*\3*\7*\u0648"+
		"\n*\f*\16*\u064b\13*\3*\3*\3*\5*\u0650\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\7"+
		"+\u065b\n+\f+\16+\u065e\13+\3,\3,\5,\u0662\n,\3-\5-\u0665\n-\3-\3-\3-"+
		"\3-\3-\3-\5-\u066d\n-\3-\3-\3-\3-\3-\7-\u0674\n-\f-\16-\u0677\13-\3-\3"+
		"-\5-\u067b\n-\3.\3.\3.\3.\3.\3.\5.\u0683\n.\3.\3.\3.\3.\7.\u0689\n.\f"+
		".\16.\u068c\13.\3/\3/\3/\3/\3/\3/\3/\7/\u0695\n/\f/\16/\u0698\13/\3/\3"+
		"/\3/\7/\u069d\n/\f/\16/\u06a0\13/\3/\5/\u06a3\n/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\7\60\u06ad\n\60\f\60\16\60\u06b0\13\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u06bc\n\60\f\60\16\60\u06bf"+
		"\13\60\3\60\3\60\5\60\u06c3\n\60\3\61\3\61\3\61\3\61\7\61\u06c9\n\61\f"+
		"\61\16\61\u06cc\13\61\5\61\u06ce\n\61\3\61\3\61\5\61\u06d2\n\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u06de\n\62\f\62\16\62"+
		"\u06e1\13\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u06ea\n\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\7\63\u06f2\n\63\f\63\16\63\u06f5\13\63\5\63\u06f7"+
		"\n\63\3\63\3\63\3\63\3\63\5\63\u06fd\n\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\7\63\u0705\n\63\f\63\16\63\u0708\13\63\5\63\u070a\n\63\3\64\3\64\3\64"+
		"\3\64\5\64\u0710\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u0717\n\65\f\65\16"+
		"\65\u071a\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0723\n\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u072b\n\66\3\67\3\67\5\67\u072f\n\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\5\67\u0737\n\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u0740\n\67\3\67\3\67\3\67\3\67\5\67\u0746\n\67\3\67\3"+
		"\67\3\67\5\67\u074b\n\67\3\67\3\67\5\67\u074f\n\67\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\78\u075e\n8\f8\168\u0761\138\38\38\58\u0765\n8\39"+
		"\39\39\59\u076a\n9\39\39\3:\5:\u076f\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\5:\u0781\n:\5:\u0783\n:\3:\5:\u0786\n:\3;\3;\3;\3;"+
		"\3;\3<\3<\3<\3<\3<\3<\7<\u0793\n<\f<\16<\u0796\13<\3=\3=\3=\3=\7=\u079c"+
		"\n=\f=\16=\u079f\13=\3=\3=\3>\3>\5>\u07a5\n>\3?\3?\3?\3?\7?\u07ab\n?\f"+
		"?\16?\u07ae\13?\3?\3?\3@\3@\3@\5@\u07b5\n@\3A\3A\3A\3A\5A\u07bb\nA\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\5A\u07c6\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u07d1"+
		"\nA\3A\3A\3A\3A\3A\5A\u07d8\nA\3B\3B\3B\3B\7B\u07de\nB\fB\16B\u07e1\13"+
		"B\3B\3B\3C\3C\3C\3C\3C\7C\u07ea\nC\fC\16C\u07ed\13C\5C\u07ef\nC\3C\3C"+
		"\3C\3D\3D\5D\u07f6\nD\3D\3D\3D\3D\3D\5D\u07fd\nD\5D\u07ff\nD\3E\3E\3E"+
		"\3E\3E\3E\3E\5E\u0808\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0814\nE\5E"+
		"\u0816\nE\3E\3E\3E\3E\3E\5E\u081d\nE\3E\3E\3E\3E\3E\5E\u0824\nE\3E\3E"+
		"\3E\3E\5E\u082a\nE\3E\3E\3E\3E\5E\u0830\nE\5E\u0832\nE\3F\3F\3F\3F\5F"+
		"\u0838\nF\3F\3F\3F\3G\3G\3G\3G\5G\u0841\nG\3G\3G\3G\3H\3H\3H\3H\5H\u084a"+
		"\nH\3H\3H\3H\3H\3H\3H\5H\u0852\nH\5H\u0854\nH\3I\3I\3I\3I\3I\3I\7I\u085c"+
		"\nI\fI\16I\u085f\13I\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\5K\u0872\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\7K\u087e\nK\fK\16K\u0881\13"+
		"K\3L\3L\3L\3L\3L\5L\u0888\nL\3M\3M\5M\u088c\nM\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\5M\u0896\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\7M\u08a1\nM\fM\16M\u08a4\13M"+
		"\3M\3M\3M\3M\5M\u08aa\nM\3M\3M\3M\3M\3M\3M\3M\3M\5M\u08b4\nM\3M\3M\3M"+
		"\3M\3M\3M\3M\5M\u08bd\nM\3M\3M\3M\3M\3M\5M\u08c4\nM\3M\3M\3M\3M\3M\5M"+
		"\u08cb\nM\3N\3N\3N\3N\3N\3N\3N\3N\5N\u08d5\nN\3N\3N\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7N"+
		"\u08f5\nN\fN\16N\u08f8\13N\3O\3O\3O\3O\3O\3O\6O\u0900\nO\rO\16O\u0901"+
		"\3O\3O\3O\3O\5O\u0908\nO\3O\3O\3O\3O\3O\3O\3O\3O\6O\u0912\nO\rO\16O\u0913"+
		"\3O\3O\3O\3O\5O\u091a\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\7O\u092e\nO\fO\16O\u0931\13O\5O\u0933\nO\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\5O\u093d\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0948\nO\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\6"+
		"O\u0965\nO\rO\16O\u0966\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0976"+
		"\nO\3O\3O\3O\3O\3O\3O\7O\u097e\nO\fO\16O\u0981\13O\5O\u0983\nO\3O\3O\3"+
		"O\3O\3O\5O\u098a\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\5O\u099f\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\7O\u09ac\nO\fO\16"+
		"O\u09af\13O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\6P\u09c2"+
		"\nP\rP\16P\u09c3\5P\u09c6\nP\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3T\5"+
		"T\u09d5\nT\3U\3U\3U\3U\7U\u09db\nU\fU\16U\u09de\13U\3V\3V\3V\3V\5V\u09e4"+
		"\nV\3W\3W\5W\u09e8\nW\3W\3W\3W\3W\5W\u09ee\nW\3X\3X\3X\3X\3X\3X\5X\u09f6"+
		"\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0a0c"+
		"\nY\3Y\3Y\3Y\5Y\u0a11\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0a1b\nY\fY\16Y\u0a1e"+
		"\13Y\3Y\5Y\u0a21\nY\5Y\u0a23\nY\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0a2b\nZ\fZ\16Z\u0a2e"+
		"\13Z\3[\3[\3[\3[\3[\3[\5[\u0a36\n[\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0a3e\n"+
		"\\\f\\\16\\\u0a41\13\\\3]\3]\3]\3]\3]\3]\3]\5]\u0a4a\n]\3^\3^\3^\3^\3"+
		"^\3^\3_\3_\3_\3_\3_\3_\3_\7_\u0a59\n_\f_\16_\u0a5c\13_\3`\3`\3`\3`\3`"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\7a\u0a70\na\fa\16a\u0a73\13a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\7a\u0a7e\na\fa\16a\u0a81\13a\5a\u0a83\na\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\7a\u0a8e\na\fa\16a\u0a91\13a\5a\u0a93\na\5a\u0a95"+
		"\na\3a\3a\3a\5a\u0a9a\na\3a\5a\u0a9d\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0ab5\nb\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\5c\u0ac1\nc\3d\3d\3d\3d\3d\3d\7d\u0ac9\nd\fd\16d\u0acc\13d\3"+
		"e\3e\3e\3e\3e\5e\u0ad3\ne\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0add\nf\3g\3g\3"+
		"g\3h\3h\5h\u0ae4\nh\3h\3h\3h\3h\5h\u0aea\nh\3h\3h\3h\3h\5h\u0af0\nh\3"+
		"h\3h\3h\3h\5h\u0af6\nh\3h\3h\3h\3h\5h\u0afc\nh\3h\3h\3h\3h\5h\u0b02\n"+
		"h\3h\3h\3h\3h\5h\u0b08\nh\3h\3h\5h\u0b0c\nh\3i\3i\3i\3i\7\u02f7\u0330"+
		"\u0338\u033f\u0347\bHTZ\u0094\u009a\u009cj\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\2\33\3\2\u00c8\u00c9\4\2QQSS\5\2[]\u00ae"+
		"\u00ae\u00b4\u00b4\4\2\r\r  \4\2--XX\4\2\u00ae\u00ae\u00b4\u00b4\4\2\16"+
		"\16\u00d5\u00d5\3\2gj\3\2,-\4\2JJLL\3\2\u00f4\u00f5\3\2%&\4\2\u008a\u008b"+
		"\u0090\u0090\3\2\u008c\u008f\4\2\u008a\u008b\u0093\u0093\3\2}\177\3\2"+
		"\u0082\u0089\3\2\u008a\u0094\3\2\36!\3\2\u008a\u008b\4\2CC\u009b\u009b"+
		"\4\2\32\32\u0099\u0099\3\2GH\6\2\65\668>gj\u00ed\u00ed\n\2\f\64\67\67"+
		"?fk\u0081\u008f\u008f\u0095\u009e\u00a0\u00ec\u00ee\u00ef\u0c98\2\u00d2"+
		"\3\2\2\2\4\u00d6\3\2\2\2\6\u00da\3\2\2\2\b\u00de\3\2\2\2\n\u00e1\3\2\2"+
		"\2\f\u00e5\3\2\2\2\16\u034a\3\2\2\2\20\u03f6\3\2\2\2\22\u03f8\3\2\2\2"+
		"\24\u0407\3\2\2\2\26\u0413\3\2\2\2\30\u0420\3\2\2\2\32\u0427\3\2\2\2\34"+
		"\u0471\3\2\2\2\36\u0473\3\2\2\2 \u047a\3\2\2\2\"\u0489\3\2\2\2$\u049f"+
		"\3\2\2\2&\u04a1\3\2\2\2(\u04ac\3\2\2\2*\u04b8\3\2\2\2,\u04c2\3\2\2\2."+
		"\u04c6\3\2\2\2\60\u04d4\3\2\2\2\62\u04ec\3\2\2\2\64\u04f7\3\2\2\2\66\u04f9"+
		"\3\2\2\28\u0507\3\2\2\2:\u051f\3\2\2\2<\u0529\3\2\2\2>\u052b\3\2\2\2@"+
		"\u0531\3\2\2\2B\u0542\3\2\2\2D\u0551\3\2\2\2F\u058e\3\2\2\2H\u0593\3\2"+
		"\2\2J\u05af\3\2\2\2L\u05b1\3\2\2\2N\u062f\3\2\2\2P\u0631\3\2\2\2R\u064f"+
		"\3\2\2\2T\u0651\3\2\2\2V\u065f\3\2\2\2X\u067a\3\2\2\2Z\u0682\3\2\2\2\\"+
		"\u068d\3\2\2\2^\u06a4\3\2\2\2`\u06d1\3\2\2\2b\u06d3\3\2\2\2d\u06e5\3\2"+
		"\2\2f\u070f\3\2\2\2h\u0711\3\2\2\2j\u072a\3\2\2\2l\u074e\3\2\2\2n\u0764"+
		"\3\2\2\2p\u0766\3\2\2\2r\u0785\3\2\2\2t\u0787\3\2\2\2v\u078c\3\2\2\2x"+
		"\u0797\3\2\2\2z\u07a2\3\2\2\2|\u07a6\3\2\2\2~\u07b1\3\2\2\2\u0080\u07d7"+
		"\3\2\2\2\u0082\u07d9\3\2\2\2\u0084\u07e4\3\2\2\2\u0086\u07fe\3\2\2\2\u0088"+
		"\u0831\3\2\2\2\u008a\u0837\3\2\2\2\u008c\u0840\3\2\2\2\u008e\u0845\3\2"+
		"\2\2\u0090\u0855\3\2\2\2\u0092\u0860\3\2\2\2\u0094\u0871\3\2\2\2\u0096"+
		"\u0882\3\2\2\2\u0098\u08ca\3\2\2\2\u009a\u08d4\3\2\2\2\u009c\u099e\3\2"+
		"\2\2\u009e\u09c5\3\2\2\2\u00a0\u09c7\3\2\2\2\u00a2\u09ca\3\2\2\2\u00a4"+
		"\u09cd\3\2\2\2\u00a6\u09d4\3\2\2\2\u00a8\u09d6\3\2\2\2\u00aa\u09df\3\2"+
		"\2\2\u00ac\u09ed\3\2\2\2\u00ae\u09f5\3\2\2\2\u00b0\u0a22\3\2\2\2\u00b2"+
		"\u0a24\3\2\2\2\u00b4\u0a2f\3\2\2\2\u00b6\u0a37\3\2\2\2\u00b8\u0a42\3\2"+
		"\2\2\u00ba\u0a4b\3\2\2\2\u00bc\u0a51\3\2\2\2\u00be\u0a5d\3\2\2\2\u00c0"+
		"\u0a9c\3\2\2\2\u00c2\u0ab4\3\2\2\2\u00c4\u0ac0\3\2\2\2\u00c6\u0ac2\3\2"+
		"\2\2\u00c8\u0ad2\3\2\2\2\u00ca\u0adc\3\2\2\2\u00cc\u0ade\3\2\2\2\u00ce"+
		"\u0b0b\3\2\2\2\u00d0\u0b0d\3\2\2\2\u00d2\u00d3\5\16\b\2\u00d3\u00d4\7"+
		"\2\2\3\u00d4\u00d5\b\2\1\2\u00d5\3\3\2\2\2\u00d6\u00d7\5\u008eH\2\u00d7"+
		"\u00d8\7\2\2\3\u00d8\u00d9\b\3\1\2\u00d9\5\3\2\2\2\u00da\u00db\5\u008a"+
		"F\2\u00db\u00dc\7\2\2\3\u00dc\u00dd\b\4\1\2\u00dd\7\3\2\2\2\u00de\u00df"+
		"\5\u008cG\2\u00df\u00e0\7\2\2\3\u00e0\t\3\2\2\2\u00e1\u00e2\5\u00b0Y\2"+
		"\u00e2\u00e3\7\2\2\3\u00e3\u00e4\b\6\1\2\u00e4\13\3\2\2\2\u00e5\u00e6"+
		"\5\u00b2Z\2\u00e6\u00e7\7\2\2\3\u00e7\r\3\2\2\2\u00e8\u00e9\5\32\16\2"+
		"\u00e9\u00ea\b\b\1\2\u00ea\u034b\3\2\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed"+
		"\5\u00c8e\2\u00ed\u00ee\b\b\1\2\u00ee\u034b\3\2\2\2\u00ef\u00f0\7P\2\2"+
		"\u00f0\u00f4\7\u00cf\2\2\u00f1\u00f2\7\u0080\2\2\u00f2\u00f3\7!\2\2\u00f3"+
		"\u00f5\7#\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f9\5\u00c8e\2\u00f7\u00f8\7s\2\2\u00f8\u00fa\7\u00f0\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd"+
		"\5\30\r\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2"+
		"\u00fe\u00ff\7N\2\2\u00ff\u0100\7\u00ba\2\2\u0100\u0102\5.\30\2\u0101"+
		"\u00fe\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u034b\3\2\2\2\u0103\u0104\7n"+
		"\2\2\u0104\u0105\7\u00cf\2\2\u0105\u0106\5\u00c8e\2\u0106\u0107\7t\2\2"+
		"\u0107\u0108\7\u00ba\2\2\u0108\u0109\5.\30\2\u0109\u034b\3\2\2\2\u010a"+
		"\u010b\7f\2\2\u010b\u010e\7\u00cf\2\2\u010c\u010d\7\u0080\2\2\u010d\u010f"+
		"\7#\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\5\u00c8e\2\u0111\u0113\t\2\2\2\u0112\u0111\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u034b\3\2\2\2\u0114\u0119\5\22\n\2\u0115\u0116\7\4\2\2"+
		"\u0116\u0117\5\u00b2Z\2\u0117\u0118\7\6\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0115\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0129\5,"+
		"\27\2\u011c\u011d\7\u00b7\2\2\u011d\u0128\5.\30\2\u011e\u011f\7\u00d7"+
		"\2\2\u011f\u0120\7\25\2\2\u0120\u0128\5t;\2\u0121\u0128\5\24\13\2\u0122"+
		"\u0128\5\30\r\2\u0123\u0124\7s\2\2\u0124\u0128\7\u00f0\2\2\u0125\u0126"+
		"\7\u00b9\2\2\u0126\u0128\5.\30\2\u0127\u011c\3\2\2\2\u0127\u011e\3\2\2"+
		"\2\u0127\u0121\3\2\2\2\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u0130\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\7\17\2\2\u012d\u012c\3"+
		"\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\5\32\16\2\u0130"+
		"\u012d\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u034b\3\2\2\2\u0132\u0137\5\22"+
		"\n\2\u0133\u0134\7\4\2\2\u0134\u0135\5\u00b2Z\2\u0135\u0136\7\6\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u014a\3\2"+
		"\2\2\u0139\u013a\7s\2\2\u013a\u0149\7\u00f0\2\2\u013b\u013c\7\u00d7\2"+
		"\2\u013c\u013d\7\25\2\2\u013d\u013e\7\4\2\2\u013e\u013f\5\u00b2Z\2\u013f"+
		"\u0140\7\6\2\2\u0140\u0149\3\2\2\2\u0141\u0149\5\24\13\2\u0142\u0149\5"+
		"\26\f\2\u0143\u0149\5\u0088E\2\u0144\u0149\5:\36\2\u0145\u0149\5\30\r"+
		"\2\u0146\u0147\7\u00b9\2\2\u0147\u0149\5.\30\2\u0148\u0139\3\2\2\2\u0148"+
		"\u013b\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2"+
		"\2\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0151\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u014f\7\17\2\2\u014e\u014d\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\5\32\16\2\u0151\u014e\3"+
		"\2\2\2\u0151\u0152\3\2\2\2\u0152\u034b\3\2\2\2\u0153\u0154\7P\2\2\u0154"+
		"\u0158\7Q\2\2\u0155\u0156\7\u0080\2\2\u0156\u0157\7!\2\2\u0157\u0159\7"+
		"#\2\2\u0158\u0155\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\5\u008aF\2\u015b\u015c\7%\2\2\u015c\u015e\5\u008aF\2\u015d\u015f"+
		"\5\30\r\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u034b\3\2\2\2"+
		"\u0160\u0161\7\u00d3\2\2\u0161\u0162\7Q\2\2\u0162\u0164\5\u008aF\2\u0163"+
		"\u0165\5 \21\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0167\7\u00d4\2\2\u0167\u016c\7\u00d6\2\2\u0168\u016d\5\u00c8"+
		"e\2\u0169\u016a\7.\2\2\u016a\u016b\7a\2\2\u016b\u016d\5v<\2\u016c\u0168"+
		"\3\2\2\2\u016c\u0169\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u034b\3\2\2\2\u016e"+
		"\u016f\7n\2\2\u016f\u0170\7Q\2\2\u0170\u0171\5\u008aF\2\u0171\u0172\7"+
		"\16\2\2\u0172\u0173\7a\2\2\u0173\u0174\7\4\2\2\u0174\u0175\5\u00b2Z\2"+
		"\u0175\u0176\7\6\2\2\u0176\u034b\3\2\2\2\u0177\u0178\7n\2\2\u0178\u0179"+
		"\t\3\2\2\u0179\u017a\5\u008aF\2\u017a\u017b\7o\2\2\u017b\u017c\7k\2\2"+
		"\u017c\u017d\5\u008aF\2\u017d\u034b\3\2\2\2\u017e\u017f\7n\2\2\u017f\u0180"+
		"\t\3\2\2\u0180\u0181\5\u008aF\2\u0181\u0182\7t\2\2\u0182\u0183\7\u00b9"+
		"\2\2\u0183\u0184\5.\30\2\u0184\u034b\3\2\2\2\u0185\u0186\7n\2\2\u0186"+
		"\u0187\t\3\2\2\u0187\u0188\5\u008aF\2\u0188\u0189\7\u00b8\2\2\u0189\u018c"+
		"\7\u00b9\2\2\u018a\u018b\7\u0080\2\2\u018b\u018d\7#\2\2\u018c\u018a\3"+
		"\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\5.\30\2\u018f"+
		"\u034b\3\2\2\2\u0190\u0191\7n\2\2\u0191\u0192\7Q\2\2\u0192\u0194\5\u008a"+
		"F\2\u0193\u0195\5 \21\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\7\u00c7\2\2\u0197\u0199\7b\2\2\u0198\u0197"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5\u00c8e"+
		"\2\u019b\u019d\5\u00b4[\2\u019c\u019e\5\u00aeX\2\u019d\u019c\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u034b\3\2\2\2\u019f\u01a0\7n\2\2\u01a0\u01a1\7Q\2"+
		"\2\u01a1\u01a3\5\u008aF\2\u01a2\u01a4\5 \21\2\u01a3\u01a2\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7\u00a0"+
		"\2\2\u01a7\u01ab\7\u00f0\2\2\u01a8\u01a9\7N\2\2\u01a9\u01aa\7\u00a1\2"+
		"\2\u01aa\u01ac\5.\30\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u034b"+
		"\3\2\2\2\u01ad\u01ae\7n\2\2\u01ae\u01af\7Q\2\2\u01af\u01b1\5\u008aF\2"+
		"\u01b0\u01b2\5 \21\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7\u00a1\2\2\u01b5\u01b6\5.\30"+
		"\2\u01b6\u034b\3\2\2\2\u01b7\u01b8\7n\2\2\u01b8\u01b9\7Q\2\2\u01b9\u01ba"+
		"\5\u008aF\2\u01ba\u01be\7\16\2\2\u01bb\u01bc\7\u0080\2\2\u01bc\u01bd\7"+
		"!\2\2\u01bd\u01bf\7#\2\2\u01be\u01bb\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01c2\5\36\20\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3"+
		"\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u034b\3\2\2\2\u01c5"+
		"\u01c6\7n\2\2\u01c6\u01c7\7S\2\2\u01c7\u01c8\5\u008aF\2\u01c8\u01cc\7"+
		"\16\2\2\u01c9\u01ca\7\u0080\2\2\u01ca\u01cb\7!\2\2\u01cb\u01cd\7#\2\2"+
		"\u01cc\u01c9\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0"+
		"\5 \21\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u034b\3\2\2\2\u01d3\u01d4\7n\2\2\u01d4\u01d5\7Q\2"+
		"\2\u01d5\u01d6\5\u008aF\2\u01d6\u01d7\5 \21\2\u01d7\u01d8\7o\2\2\u01d8"+
		"\u01d9\7k\2\2\u01d9\u01da\5 \21\2\u01da\u034b\3\2\2\2\u01db\u01dc\7n\2"+
		"\2\u01dc\u01dd\7Q\2\2\u01dd\u01de\5\u008aF\2\u01de\u01e1\7f\2\2\u01df"+
		"\u01e0\7\u0080\2\2\u01e0\u01e2\7#\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e8\5 \21\2\u01e4\u01e5\7\t\2\2\u01e5"+
		"\u01e7\5 \21\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ed\7\u00cc\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u034b"+
		"\3\2\2\2\u01ee\u01ef\7n\2\2\u01ef\u01f0\7S\2\2\u01f0\u01f1\5\u008aF\2"+
		"\u01f1\u01f4\7f\2\2\u01f2\u01f3\7\u0080\2\2\u01f3\u01f5\7#\2\2\u01f4\u01f2"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01fb\5 \21\2\u01f7"+
		"\u01f8\7\t\2\2\u01f8\u01fa\5 \21\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2"+
		"\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u034b\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fe\u01ff\7n\2\2\u01ff\u0200\7Q\2\2\u0200\u0202\5\u008a"+
		"F\2\u0201\u0203\5 \21\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\7t\2\2\u0205\u0206\5\30\r\2\u0206\u034b\3\2"+
		"\2\2\u0207\u0208\7n\2\2\u0208\u0209\7Q\2\2\u0209\u020a\5\u008aF\2\u020a"+
		"\u020b\7\u00e0\2\2\u020b\u020c\7d\2\2\u020c\u034b\3\2\2\2\u020d\u020e"+
		"\7f\2\2\u020e\u0211\7Q\2\2\u020f\u0210\7\u0080\2\2\u0210\u0212\7#\2\2"+
		"\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215"+
		"\5\u008aF\2\u0214\u0216\7\u00cc\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3"+
		"\2\2\2\u0216\u034b\3\2\2\2\u0217\u0218\7f\2\2\u0218\u021b\7S\2\2\u0219"+
		"\u021a\7\u0080\2\2\u021a\u021c\7#\2\2\u021b\u0219\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u034b\5\u008aF\2\u021e\u0221\7P\2\2"+
		"\u021f\u0220\7\36\2\2\u0220\u0222\7T\2\2\u0221\u021f\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0227\3\2\2\2\u0223\u0225\7\u00b5\2\2\u0224\u0223\3\2\2"+
		"\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\7\u00b6\2\2\u0227"+
		"\u0224\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022d\7S"+
		"\2\2\u022a\u022b\7\u0080\2\2\u022b\u022c\7!\2\2\u022c\u022e\7#\2\2\u022d"+
		"\u022a\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\5\u008a"+
		"F\2\u0230\u0232\5|?\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0235"+
		"\3\2\2\2\u0233\u0234\7s\2\2\u0234\u0236\7\u00f0\2\2\u0235\u0233\3\2\2"+
		"\2\u0235\u0236\3\2\2\2\u0236\u023a\3\2\2\2\u0237\u0238\7\u00d7\2\2\u0238"+
		"\u0239\7>\2\2\u0239\u023b\5t;\2\u023a\u0237\3\2\2\2\u023a\u023b\3\2\2"+
		"\2\u023b\u023e\3\2\2\2\u023c\u023d\7\u00b9\2\2\u023d\u023f\5.\30\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7\17"+
		"\2\2\u0241\u0242\5\32\16\2\u0242\u034b\3\2\2\2\u0243\u0246\7P\2\2\u0244"+
		"\u0245\7\36\2\2\u0245\u0247\7T\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u0249\3\2\2\2\u0248\u024a\7\u00b5\2\2\u0249\u0248\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7\u00b6\2\2\u024c\u024d"+
		"\7S\2\2\u024d\u0252\5\u008aF\2\u024e\u024f\7\4\2\2\u024f\u0250\5\u00b2"+
		"Z\2\u0250\u0251\7\6\2\2\u0251\u0253\3\2\2\2\u0252\u024e\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257\5,\27\2\u0255\u0256\7\u00b7"+
		"\2\2\u0256\u0258\5.\30\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u034b\3\2\2\2\u0259\u025a\7n\2\2\u025a\u025b\7S\2\2\u025b\u025d\5\u008a"+
		"F\2\u025c\u025e\7\17\2\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0260\5\32\16\2\u0260\u034b\3\2\2\2\u0261\u0264\7"+
		"P\2\2\u0262\u0263\7\36\2\2\u0263\u0265\7T\2\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0268\7\u00b6\2\2\u0267\u0266"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026d\7\u00ad\2"+
		"\2\u026a\u026b\7\u0080\2\2\u026b\u026c\7!\2\2\u026c\u026e\7#\2\2\u026d"+
		"\u026a\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\5\u00c6"+
		"d\2\u0270\u0271\7\17\2\2\u0271\u027b\7\u00f0\2\2\u0272\u0273\7\u009f\2"+
		"\2\u0273\u0278\5@!\2\u0274\u0275\7\t\2\2\u0275\u0277\5@!\2\u0276\u0274"+
		"\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u0272\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u034b\3\2\2\2\u027d\u027f\7f\2\2\u027e\u0280\7\u00b6\2\2\u027f"+
		"\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0284\7\u00ad"+
		"\2\2\u0282\u0283\7\u0080\2\2\u0283\u0285\7#\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u034b\5\u00c6d\2\u0287\u0289"+
		"\7Y\2\2\u0288\u028a\t\4\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u034b\5\16\b\2\u028c\u028d\7_\2\2\u028d\u0290\7`"+
		"\2\2\u028e\u028f\t\5\2\2\u028f\u0291\5\u00c8e\2\u0290\u028e\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0296\3\2\2\2\u0292\u0294\7%\2\2\u0293\u0292\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\7\u00f0\2\2\u0296"+
		"\u0293\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u034b\3\2\2\2\u0298\u0299\7_"+
		"\2\2\u0299\u029a\7Q\2\2\u029a\u029d\7\u00ae\2\2\u029b\u029c\t\5\2\2\u029c"+
		"\u029e\5\u00c8e\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a0\7%\2\2\u02a0\u02a2\7\u00f0\2\2\u02a1\u02a3\5 \21"+
		"\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u034b\3\2\2\2\u02a4\u02a5"+
		"\7_\2\2\u02a5\u02aa\7\u00d0\2\2\u02a6\u02a8\7%\2\2\u02a7\u02a6\3\2\2\2"+
		"\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\7\u00f0\2\2\u02aa"+
		"\u02a7\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u034b\3\2\2\2\u02ac\u02ad\7_"+
		"\2\2\u02ad\u02ae\7\u00b9\2\2\u02ae\u02b3\5\u008aF\2\u02af\u02b0\7\4\2"+
		"\2\u02b0\u02b1\5\62\32\2\u02b1\u02b2\7\6\2\2\u02b2\u02b4\3\2\2\2\u02b3"+
		"\u02af\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u034b\3\2\2\2\u02b5\u02b6\7_"+
		"\2\2\u02b6\u02b7\7a\2\2\u02b7\u02b8\t\5\2\2\u02b8\u02bb\5\u008aF\2\u02b9"+
		"\u02ba\t\5\2\2\u02ba\u02bc\5\u00c8e\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc"+
		"\3\2\2\2\u02bc\u034b\3\2\2\2\u02bd\u02be\7_\2\2\u02be\u02bf\7d\2\2\u02bf"+
		"\u02c1\5\u008aF\2\u02c0\u02c2\5 \21\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2"+
		"\3\2\2\2\u02c2\u034b\3\2\2\2\u02c3\u02c5\7_\2\2\u02c4\u02c6\5\u00c8e\2"+
		"\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02cf"+
		"\7e\2\2\u02c8\u02ca\7%\2\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cd\3\2\2\2\u02cb\u02ce\5\u00c6d\2\u02cc\u02ce\7\u00f0\2\2\u02cd\u02cb"+
		"\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02c9\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u034b\3\2\2\2\u02d1\u02d2\7_\2\2\u02d2\u02d3\7P\2"+
		"\2\u02d3\u02d4\7Q\2\2\u02d4\u034b\5\u008aF\2\u02d5\u02d6\t\6\2\2\u02d6"+
		"\u02d8\7\u00ad\2\2\u02d7\u02d9\7\u00ae\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u034b\5$\23\2\u02db\u02dc\t\6\2\2\u02dc"+
		"\u02de\7\u00cf\2\2\u02dd\u02df\7\u00ae\2\2\u02de\u02dd\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u034b\5\u00c8e\2\u02e1\u02e3\t\6\2"+
		"\2\u02e2\u02e4\7Q\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6"+
		"\3\2\2\2\u02e5\u02e7\t\7\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02ea\5\u008aF\2\u02e9\u02eb\5 \21\2\u02ea\u02e9"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ee\5&\24\2\u02ed"+
		"\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u034b\3\2\2\2\u02ef\u02f0\7\u00af"+
		"\2\2\u02f0\u02f1\7Q\2\2\u02f1\u034b\5\u008aF\2\u02f2\u02fa\7\u00af\2\2"+
		"\u02f3\u02fb\7\u00f0\2\2\u02f4\u02f6\13\2\2\2\u02f5\u02f4\3\2\2\2\u02f6"+
		"\u02f9\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\3\2"+
		"\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02f3\3\2\2\2\u02fa\u02f7\3\2\2\2\u02fb"+
		"\u034b\3\2\2\2\u02fc\u02fe\7\u00b1\2\2\u02fd\u02ff\7\u00b3\2\2\u02fe\u02fd"+
		"\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\7Q\2\2\u0301"+
		"\u0306\5\u008aF\2\u0302\u0304\7\17\2\2\u0303\u0302\3\2\2\2\u0303\u0304"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\5\32\16\2\u0306\u0303\3\2\2\2"+
		"\u0306\u0307\3\2\2\2\u0307\u034b\3\2\2\2\u0308\u0309\7\u00b2\2\2\u0309"+
		"\u030c\7Q\2\2\u030a\u030b\7\u0080\2\2\u030b\u030d\7#\2\2\u030c\u030a\3"+
		"\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u034b\5\u008aF\2"+
		"\u030f\u0310\7\u00b0\2\2\u0310\u034b\7\u00b1\2\2\u0311\u0312\7\u00e3\2"+
		"\2\u0312\u0314\7v\2\2\u0313\u0315\7\u00ee\2\2\u0314\u0313\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\7\u00ef\2\2\u0317\u0319"+
		"\7\u00f0\2\2\u0318\u031a\7\u009c\2\2\u0319\u0318\3\2\2\2\u0319\u031a\3"+
		"\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7W\2\2\u031c\u031d\7Q\2\2\u031d"+
		"\u031f\5\u008aF\2\u031e\u0320\5 \21\2\u031f\u031e\3\2\2\2\u031f\u0320"+
		"\3\2\2\2\u0320\u034b\3\2\2\2\u0321\u0322\7\u00d2\2\2\u0322\u0323\7Q\2"+
		"\2\u0323\u0325\5\u008aF\2\u0324\u0326\5 \21\2\u0325\u0324\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u034b\3\2\2\2\u0327\u0328\7\u00de\2\2\u0328\u0329"+
		"\7\u00df\2\2\u0329\u032a\7Q\2\2\u032a\u034b\5\u008aF\2\u032b\u032c\t\b"+
		"\2\2\u032c\u0330\5\u00c8e\2\u032d\u032f\13\2\2\2\u032e\u032d\3\2\2\2\u032f"+
		"\u0332\3\2\2\2\u0330\u0331\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u034b\3\2"+
		"\2\2\u0332\u0330\3\2\2\2\u0333\u0334\7t\2\2\u0334\u0338\7\u00e4\2\2\u0335"+
		"\u0337\13\2\2\2\u0336\u0335\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0339\3"+
		"\2\2\2\u0338\u0336\3\2\2\2\u0339\u034b\3\2\2\2\u033a\u0338\3\2\2\2\u033b"+
		"\u033f\7t\2\2\u033c\u033e\13\2\2\2\u033d\u033c\3\2\2\2\u033e\u0341\3\2"+
		"\2\2\u033f\u0340\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u034b\3\2\2\2\u0341"+
		"\u033f\3\2\2\2\u0342\u034b\7u\2\2\u0343\u0347\5\20\t\2\u0344\u0346\13"+
		"\2\2\2\u0345\u0344\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0348\3\2\2\2\u0347"+
		"\u0345\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u00e8\3\2"+
		"\2\2\u034a\u00eb\3\2\2\2\u034a\u00ef\3\2\2\2\u034a\u0103\3\2\2\2\u034a"+
		"\u010a\3\2\2\2\u034a\u0114\3\2\2\2\u034a\u0132\3\2\2\2\u034a\u0153\3\2"+
		"\2\2\u034a\u0160\3\2\2\2\u034a\u016e\3\2\2\2\u034a\u0177\3\2\2\2\u034a"+
		"\u017e\3\2\2\2\u034a\u0185\3\2\2\2\u034a\u0190\3\2\2\2\u034a\u019f\3\2"+
		"\2\2\u034a\u01ad\3\2\2\2\u034a\u01b7\3\2\2\2\u034a\u01c5\3\2\2\2\u034a"+
		"\u01d3\3\2\2\2\u034a\u01db\3\2\2\2\u034a\u01ee\3\2\2\2\u034a\u01fe\3\2"+
		"\2\2\u034a\u0207\3\2\2\2\u034a\u020d\3\2\2\2\u034a\u0217\3\2\2\2\u034a"+
		"\u021e\3\2\2\2\u034a\u0243\3\2\2\2\u034a\u0259\3\2\2\2\u034a\u0261\3\2"+
		"\2\2\u034a\u027d\3\2\2\2\u034a\u0287\3\2\2\2\u034a\u028c\3\2\2\2\u034a"+
		"\u0298\3\2\2\2\u034a\u02a4\3\2\2\2\u034a\u02ac\3\2\2\2\u034a\u02b5\3\2"+
		"\2\2\u034a\u02bd\3\2\2\2\u034a\u02c3\3\2\2\2\u034a\u02d1\3\2\2\2\u034a"+
		"\u02d5\3\2\2\2\u034a\u02db\3\2\2\2\u034a\u02e1\3\2\2\2\u034a\u02ef\3\2"+
		"\2\2\u034a\u02f2\3\2\2\2\u034a\u02fc\3\2\2\2\u034a\u0308\3\2\2\2\u034a"+
		"\u030f\3\2\2\2\u034a\u0311\3\2\2\2\u034a\u0321\3\2\2\2\u034a\u0327\3\2"+
		"\2\2\u034a\u032b\3\2\2\2\u034a\u0333\3\2\2\2\u034a\u033b\3\2\2\2\u034a"+
		"\u0342\3\2\2\2\u034a\u0343\3\2\2\2\u034b\17\3\2\2\2\u034c\u034d\7P\2\2"+
		"\u034d\u03f7\7\u00e4\2\2\u034e\u034f\7f\2\2\u034f\u03f7\7\u00e4\2\2\u0350"+
		"\u0352\7\u00db\2\2\u0351\u0353\7\u00e4\2\2\u0352\u0351\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u03f7\3\2\2\2\u0354\u0356\7\u00da\2\2\u0355\u0357\7\u00e4"+
		"\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u03f7\3\2\2\2\u0358"+
		"\u0359\7_\2\2\u0359\u03f7\7\u00db\2\2\u035a\u035b\7_\2\2\u035b\u035d\7"+
		"\u00e4\2\2\u035c\u035e\7\u00db\2\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2"+
		"\2\2\u035e\u03f7\3\2\2\2\u035f\u0360\7_\2\2\u0360\u03f7\7\u00e7\2\2\u0361"+
		"\u0362\7_\2\2\u0362\u03f7\7\u00e5\2\2\u0363\u0364\7_\2\2\u0364\u0365\7"+
		"I\2\2\u0365\u03f7\7\u00e5\2\2\u0366\u0367\7\u00e1\2\2\u0367\u03f7\7Q\2"+
		"\2\u0368\u0369\7\u00e2\2\2\u0369\u03f7\7Q\2\2\u036a\u036b\7_\2\2\u036b"+
		"\u03f7\7\u00e6\2\2\u036c\u036d\7_\2\2\u036d\u036e\7P\2\2\u036e\u03f7\7"+
		"Q\2\2\u036f\u0370\7_\2\2\u0370\u03f7\7\u00e8\2\2\u0371\u0372\7_\2\2\u0372"+
		"\u03f7\7\u00ea\2\2\u0373\u0374\7_\2\2\u0374\u03f7\7\u00eb\2\2\u0375\u0376"+
		"\7P\2\2\u0376\u03f7\7\u00e9\2\2\u0377\u0378\7f\2\2\u0378\u03f7\7\u00e9"+
		"\2\2\u0379\u037a\7n\2\2\u037a\u03f7\7\u00e9\2\2\u037b\u037c\7\u00dc\2"+
		"\2\u037c\u03f7\7Q\2\2\u037d\u037e\7\u00dc\2\2\u037e\u03f7\7\u00cf\2\2"+
		"\u037f\u0380\7\u00dd\2\2\u0380\u03f7\7Q\2\2\u0381\u0382\7\u00dd\2\2\u0382"+
		"\u03f7\7\u00cf\2\2\u0383\u0384\7P\2\2\u0384\u0385\7\u00b6\2\2\u0385\u03f7"+
		"\7{\2\2\u0386\u0387\7f\2\2\u0387\u0388\7\u00b6\2\2\u0388\u03f7\7{\2\2"+
		"\u0389\u038a\7n\2\2\u038a\u038b\7Q\2\2\u038b\u038c\5\u008aF\2\u038c\u038d"+
		"\7!\2\2\u038d\u038e\7\u00ca\2\2\u038e\u03f7\3\2\2\2\u038f\u0390\7n\2\2"+
		"\u0390\u0391\7Q\2\2\u0391\u0392\5\u008aF\2\u0392\u0393\7\u00ca\2\2\u0393"+
		"\u0394\7\25\2\2\u0394\u03f7\3\2\2\2\u0395\u0396\7n\2\2\u0396\u0397\7Q"+
		"\2\2\u0397\u0398\5\u008aF\2\u0398\u0399\7!\2\2\u0399\u039a\7\u00cb\2\2"+
		"\u039a\u03f7\3\2\2\2\u039b\u039c\7n\2\2\u039c\u039d\7Q\2\2\u039d\u039e"+
		"\5\u008aF\2\u039e\u039f\7\u00bc\2\2\u039f\u03a0\7\25\2\2\u03a0\u03f7\3"+
		"\2\2\2\u03a1\u03a2\7n\2\2\u03a2\u03a3\7Q\2\2\u03a3\u03a4\5\u008aF\2\u03a4"+
		"\u03a5\7!\2\2\u03a5\u03a6\7\u00bc\2\2\u03a6\u03f7\3\2\2\2\u03a7\u03a8"+
		"\7n\2\2\u03a8\u03a9\7Q\2\2\u03a9\u03aa\5\u008aF\2\u03aa\u03ab\7!\2\2\u03ab"+
		"\u03ac\7\u00bd\2\2\u03ac\u03ad\7\17\2\2\u03ad\u03ae\7\u00be\2\2\u03ae"+
		"\u03f7\3\2\2\2\u03af\u03b0\7n\2\2\u03b0\u03b1\7Q\2\2\u03b1\u03b2\5\u008a"+
		"F\2\u03b2\u03b3\7t\2\2\u03b3\u03b4\7\u00bc\2\2\u03b4\u03b5\7\u00bf\2\2"+
		"\u03b5\u03f7\3\2\2\2\u03b6\u03b7\7n\2\2\u03b7\u03b8\7Q\2\2\u03b8\u03b9"+
		"\5\u008aF\2\u03b9\u03ba\7\u00c0\2\2\u03ba\u03bb\7C\2\2\u03bb\u03f7\3\2"+
		"\2\2\u03bc\u03bd\7n\2\2\u03bd\u03be\7Q\2\2\u03be\u03bf\5\u008aF\2\u03bf"+
		"\u03c0\7\u00c1\2\2\u03c0\u03c1\7C\2\2\u03c1\u03f7\3\2\2\2\u03c2\u03c3"+
		"\7n\2\2\u03c3\u03c4\7Q\2\2\u03c4\u03c5\5\u008aF\2\u03c5\u03c6\7\u00c2"+
		"\2\2\u03c6\u03c7\7C\2\2\u03c7\u03f7\3\2\2\2\u03c8\u03c9\7n\2\2\u03c9\u03ca"+
		"\7Q\2\2\u03ca\u03cb\5\u008aF\2\u03cb\u03cc\7\u00c4\2\2\u03cc\u03f7\3\2"+
		"\2\2\u03cd\u03ce\7n\2\2\u03ce\u03cf\7Q\2\2\u03cf\u03d1\5\u008aF\2\u03d0"+
		"\u03d2\5 \21\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2"+
		"\2\2\u03d3\u03d4\7\u00c5\2\2\u03d4\u03f7\3\2\2\2\u03d5\u03d6\7n\2\2\u03d6"+
		"\u03d7\7Q\2\2\u03d7\u03d9\5\u008aF\2\u03d8\u03da\5 \21\2\u03d9\u03d8\3"+
		"\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\7\u00c6\2\2"+
		"\u03dc\u03f7\3\2\2\2\u03dd\u03de\7n\2\2\u03de\u03df\7Q\2\2\u03df\u03e1"+
		"\5\u008aF\2\u03e0\u03e2\5 \21\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2"+
		"\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\7t\2\2\u03e4\u03e5\7\u00c3\2\2\u03e5"+
		"\u03f7\3\2\2\2\u03e6\u03e7\7n\2\2\u03e7\u03e8\7Q\2\2\u03e8\u03ea\5\u008a"+
		"F\2\u03e9\u03eb\5 \21\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03ec\3\2\2\2\u03ec\u03ed\7T\2\2\u03ed\u03ee\7a\2\2\u03ee\u03f7\3\2\2"+
		"\2\u03ef\u03f0\7w\2\2\u03f0\u03f7\7x\2\2\u03f1\u03f7\7y\2\2\u03f2\u03f7"+
		"\7z\2\2\u03f3\u03f7\7\u00d1\2\2\u03f4\u03f5\7V\2\2\u03f5\u03f7\7\r\2\2"+
		"\u03f6\u034c\3\2\2\2\u03f6\u034e\3\2\2\2\u03f6\u0350\3\2\2\2\u03f6\u0354"+
		"\3\2\2\2\u03f6\u0358\3\2\2\2\u03f6\u035a\3\2\2\2\u03f6\u035f\3\2\2\2\u03f6"+
		"\u0361\3\2\2\2\u03f6\u0363\3\2\2\2\u03f6\u0366\3\2\2\2\u03f6\u0368\3\2"+
		"\2\2\u03f6\u036a\3\2\2\2\u03f6\u036c\3\2\2\2\u03f6\u036f\3\2\2\2\u03f6"+
		"\u0371\3\2\2\2\u03f6\u0373\3\2\2\2\u03f6\u0375\3\2\2\2\u03f6\u0377\3\2"+
		"\2\2\u03f6\u0379\3\2\2\2\u03f6\u037b\3\2\2\2\u03f6\u037d\3\2\2\2\u03f6"+
		"\u037f\3\2\2\2\u03f6\u0381\3\2\2\2\u03f6\u0383\3\2\2\2\u03f6\u0386\3\2"+
		"\2\2\u03f6\u0389\3\2\2\2\u03f6\u038f\3\2\2\2\u03f6\u0395\3\2\2\2\u03f6"+
		"\u039b\3\2\2\2\u03f6\u03a1\3\2\2\2\u03f6\u03a7\3\2\2\2\u03f6\u03af\3\2"+
		"\2\2\u03f6\u03b6\3\2\2\2\u03f6\u03bc\3\2\2\2\u03f6\u03c2\3\2\2\2\u03f6"+
		"\u03c8\3\2\2\2\u03f6\u03cd\3\2\2\2\u03f6\u03d5\3\2\2\2\u03f6\u03dd\3\2"+
		"\2\2\u03f6\u03e6\3\2\2\2\u03f6\u03ef\3\2\2\2\u03f6\u03f1\3\2\2\2\u03f6"+
		"\u03f2\3\2\2\2\u03f6\u03f3\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\21\3\2\2"+
		"\2\u03f8\u03fa\7P\2\2\u03f9\u03fb\7\u00b6\2\2\u03fa\u03f9\3\2\2\2\u03fa"+
		"\u03fb\3\2\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fe\7\u00d8\2\2\u03fd\u03fc"+
		"\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0403\7Q\2\2\u0400"+
		"\u0401\7\u0080\2\2\u0401\u0402\7!\2\2\u0402\u0404\7#\2\2\u0403\u0400\3"+
		"\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\5\u008aF\2"+
		"\u0406\23\3\2\2\2\u0407\u0408\7\u00ca\2\2\u0408\u0409\7\25\2\2\u0409\u040d"+
		"\5t;\2\u040a\u040b\7\u00cb\2\2\u040b\u040c\7\25\2\2\u040c\u040e\5x=\2"+
		"\u040d\u040a\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410"+
		"\7W\2\2\u0410\u0411\7\u00f4\2\2\u0411\u0412\7\u00bb\2\2\u0412\25\3\2\2"+
		"\2\u0413\u0414\7\u00bc\2\2\u0414\u0415\7\25\2\2\u0415\u0416\5t;\2\u0416"+
		"\u0419\7>\2\2\u0417\u041a\5\66\34\2\u0418\u041a\58\35\2\u0419\u0417\3"+
		"\2\2\2\u0419\u0418\3\2\2\2\u041a\u041e\3\2\2\2\u041b\u041c\7\u00bd\2\2"+
		"\u041c\u041d\7\17\2\2\u041d\u041f\7\u00be\2\2\u041e\u041b\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\27\3\2\2\2\u0420\u0421\7\u00bf\2\2\u0421\u0422\7"+
		"\u00f0\2\2\u0422\u0423\b\r\1\2\u0423\31\3\2\2\2\u0424\u0425\5(\25\2\u0425"+
		"\u0426\b\16\1\2\u0426\u0428\3\2\2\2\u0427\u0424\3\2\2\2\u0427\u0428\3"+
		"\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\5B\"\2\u042a\u042b\b\16\1\2\u042b"+
		"\33\3\2\2\2\u042c\u042d\7U\2\2\u042d\u042e\7\u009c\2\2\u042e\u042f\7Q"+
		"\2\2\u042f\u0430\5\u008aF\2\u0430\u0439\b\17\1\2\u0431\u0432\5 \21\2\u0432"+
		"\u0437\b\17\1\2\u0433\u0434\7\u0080\2\2\u0434\u0435\7!\2\2\u0435\u0436"+
		"\7#\2\2\u0436\u0438\b\17\1\2\u0437\u0433\3\2\2\2\u0437\u0438\3\2\2\2\u0438"+
		"\u043a\3\2\2\2\u0439\u0431\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u0472\3\2"+
		"\2\2\u043b\u043c\7U\2\2\u043c\u043d\7W\2\2\u043d\u0440\b\17\1\2\u043e"+
		"\u043f\7Q\2\2\u043f\u0441\b\17\1\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2"+
		"\2\2\u0441\u0442\3\2\2\2\u0442\u0443\5\u008aF\2\u0443\u0447\b\17\1\2\u0444"+
		"\u0445\5 \21\2\u0445\u0446\b\17\1\2\u0446\u0448\3\2\2\2\u0447\u0444\3"+
		"\2\2\2\u0447\u0448\3\2\2\2\u0448\u0472\3\2\2\2\u0449\u044a\7U\2\2\u044a"+
		"\u044b\7\u009c\2\2\u044b\u044e\b\17\1\2\u044c\u044d\7\u00ee\2\2\u044d"+
		"\u044f\b\17\1\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3"+
		"\2\2\2\u0450\u0451\7R\2\2\u0451\u0452\7\u00f0\2\2\u0452\u0456\b\17\1\2"+
		"\u0453\u0454\5\u0088E\2\u0454\u0455\b\17\1\2\u0455\u0457\3\2\2\2\u0456"+
		"\u0453\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u045b\3\2\2\2\u0458\u0459\5:"+
		"\36\2\u0459\u045a\b\17\1\2\u045a\u045c\3\2\2\2\u045b\u0458\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u0472\3\2\2\2\u045d\u045e\7U\2\2\u045e\u045f\7\u009c"+
		"\2\2\u045f\u0462\b\17\1\2\u0460\u0461\7\u00ee\2\2\u0461\u0463\b\17\1\2"+
		"\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0467"+
		"\7R\2\2\u0465\u0466\7\u00f0\2\2\u0466\u0468\b\17\1\2\u0467\u0465\3\2\2"+
		"\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\5,\27\2\u046a\u046f"+
		"\b\17\1\2\u046b\u046c\7\u00b7\2\2\u046c\u046d\5.\30\2\u046d\u046e\b\17"+
		"\1\2\u046e\u0470\3\2\2\2\u046f\u046b\3\2\2\2\u046f\u0470\3\2\2\2\u0470"+
		"\u0472\3\2\2\2\u0471\u042c\3\2\2\2\u0471\u043b\3\2\2\2\u0471\u0449\3\2"+
		"\2\2\u0471\u045d\3\2\2\2\u0472\35\3\2\2\2\u0473\u0474\5 \21\2\u0474\u0478"+
		"\b\20\1\2\u0475\u0476\5\30\r\2\u0476\u0477\b\20\1\2\u0477\u0479\3\2\2"+
		"\2\u0478\u0475\3\2\2\2\u0478\u0479\3\2\2\2\u0479\37\3\2\2\2\u047a\u047b"+
		"\7C\2\2\u047b\u047c\7\4\2\2\u047c\u047d\5\"\22\2\u047d\u0484\b\21\1\2"+
		"\u047e\u047f\7\t\2\2\u047f\u0480\5\"\22\2\u0480\u0481\b\21\1\2\u0481\u0483"+
		"\3\2\2\2\u0482\u047e\3\2\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2\2\2\u0484"+
		"\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u0488\7\6"+
		"\2\2\u0488!\3\2\2\2\u0489\u048a\5\u00c8e\2\u048a\u048f\b\22\1\2\u048b"+
		"\u048c\7\u0082\2\2\u048c\u048d\5\u009eP\2\u048d\u048e\b\22\1\2\u048e\u0490"+
		"\3\2\2\2\u048f\u048b\3\2\2\2\u048f\u0490\3\2\2\2\u0490#\3\2\2\2\u0491"+
		"\u0492\5\u00c6d\2\u0492\u0493\b\23\1\2\u0493\u04a0\3\2\2\2\u0494\u0495"+
		"\7\u00f0\2\2\u0495\u04a0\b\23\1\2\u0496\u0497\5\u00a0Q\2\u0497\u0498\b"+
		"\23\1\2\u0498\u04a0\3\2\2\2\u0499\u049a\5\u00a2R\2\u049a\u049b\b\23\1"+
		"\2\u049b\u04a0\3\2\2\2\u049c\u049d\5\u00a4S\2\u049d\u049e\b\23\1\2\u049e"+
		"\u04a0\3\2\2\2\u049f\u0491\3\2\2\2\u049f\u0494\3\2\2\2\u049f\u0496\3\2"+
		"\2\2\u049f\u0499\3\2\2\2\u049f\u049c\3\2\2\2\u04a0%\3\2\2\2\u04a1\u04a2"+
		"\5\u00c8e\2\u04a2\u04a9\b\24\1\2\u04a3\u04a4\7\13\2\2\u04a4\u04a5\5\u00c8"+
		"e\2\u04a5\u04a6\b\24\1\2\u04a6\u04a8\3\2\2\2\u04a7\u04a3\3\2\2\2\u04a8"+
		"\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\'\3\2\2\2"+
		"\u04ab\u04a9\3\2\2\2\u04ac\u04ad\7N\2\2\u04ad\u04ae\5*\26\2\u04ae\u04b5"+
		"\b\25\1\2\u04af\u04b0\7\t\2\2\u04b0\u04b1\5*\26\2\u04b1\u04b2\b\25\1\2"+
		"\u04b2\u04b4\3\2\2\2\u04b3\u04af\3\2\2\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3"+
		"\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6)\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8"+
		"\u04bb\5\u00c8e\2\u04b9\u04ba\7\17\2\2\u04ba\u04bc\b\26\1\2\u04bb\u04b9"+
		"\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\7\4\2\2\u04be"+
		"\u04bf\5\32\16\2\u04bf\u04c0\7\6\2\2\u04c0\u04c1\b\26\1\2\u04c1+\3\2\2"+
		"\2\u04c2\u04c3\7\u009f\2\2\u04c3\u04c4\5\u00c6d\2\u04c4\u04c5\b\27\1\2"+
		"\u04c5-\3\2\2\2\u04c6\u04c7\7\4\2\2\u04c7\u04c8\5\60\31\2\u04c8\u04cf"+
		"\b\30\1\2\u04c9\u04ca\7\t\2\2\u04ca\u04cb\5\60\31\2\u04cb\u04cc\b\30\1"+
		"\2\u04cc\u04ce\3\2\2\2\u04cd\u04c9\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2"+
		"\u04d3\7\6\2\2\u04d3/\3\2\2\2\u04d4\u04d5\5\62\32\2\u04d5\u04dd\b\31\1"+
		"\2\u04d6\u04d7\7\u0082\2\2\u04d7\u04d9\b\31\1\2\u04d8\u04d6\3\2\2\2\u04d8"+
		"\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\5\64\33\2\u04db\u04dc\b"+
		"\31\1\2\u04dc\u04de\3\2\2\2\u04dd\u04d8\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\61\3\2\2\2\u04df\u04e0\5\u00c8e\2\u04e0\u04e7\b\32\1\2\u04e1\u04e2\7"+
		"\13\2\2\u04e2\u04e3\5\u00c8e\2\u04e3\u04e4\b\32\1\2\u04e4\u04e6\3\2\2"+
		"\2\u04e5\u04e1\3\2\2\2\u04e6\u04e9\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8"+
		"\3\2\2\2\u04e8\u04ed\3\2\2\2\u04e9\u04e7\3\2\2\2\u04ea\u04eb\7\u00f0\2"+
		"\2\u04eb\u04ed\b\32\1\2\u04ec\u04df\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed"+
		"\63\3\2\2\2\u04ee\u04ef\7\u00f4\2\2\u04ef\u04f8\b\33\1\2\u04f0\u04f1\7"+
		"\u00f5\2\2\u04f1\u04f8\b\33\1\2\u04f2\u04f3\5\u00a6T\2\u04f3\u04f4\b\33"+
		"\1\2\u04f4\u04f8\3\2\2\2\u04f5\u04f6\7\u00f0\2\2\u04f6\u04f8\b\33\1\2"+
		"\u04f7\u04ee\3\2\2\2\u04f7\u04f0\3\2\2\2\u04f7\u04f2\3\2\2\2\u04f7\u04f5"+
		"\3\2\2\2\u04f8\65\3\2\2\2\u04f9\u04fa\7\4\2\2\u04fa\u04fb\5\u009eP\2\u04fb"+
		"\u0502\b\34\1\2\u04fc\u04fd\7\t\2\2\u04fd\u04fe\5\u009eP\2\u04fe\u04ff"+
		"\b\34\1\2\u04ff\u0501\3\2\2\2\u0500\u04fc\3\2\2\2\u0501\u0504\3\2\2\2"+
		"\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\3\2\2\2\u0504\u0502"+
		"\3\2\2\2\u0505\u0506\7\6\2\2\u0506\67\3\2\2\2\u0507\u0508\7\4\2\2\u0508"+
		"\u0509\5\66\34\2\u0509\u0510\b\35\1\2\u050a\u050b\7\t\2\2\u050b\u050c"+
		"\5\66\34\2\u050c\u050d\b\35\1\2\u050d\u050f\3\2\2\2\u050e\u050a\3\2\2"+
		"\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513"+
		"\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0514\7\6\2\2\u05149\3\2\2\2\u0515"+
		"\u0516\7\u00bd\2\2\u0516\u0517\7\17\2\2\u0517\u0518\5<\37\2\u0518\u0519"+
		"\b\36\1\2\u0519\u0520\3\2\2\2\u051a\u051b\7\u00bd\2\2\u051b\u051c\7\25"+
		"\2\2\u051c\u051d\5> \2\u051d\u051e\b\36\1\2\u051e\u0520\3\2\2\2\u051f"+
		"\u0515\3\2\2\2\u051f\u051a\3\2\2\2\u0520;\3\2\2\2\u0521\u0522\7\u00cd"+
		"\2\2\u0522\u0523\7\u00f0\2\2\u0523\u0524\7\u00ce\2\2\u0524\u0525\7\u00f0"+
		"\2\2\u0525\u052a\b\37\1\2\u0526\u0527\5\u00c8e\2\u0527\u0528\b\37\1\2"+
		"\u0528\u052a\3\2\2\2\u0529\u0521\3\2\2\2\u0529\u0526\3\2\2\2\u052a=\3"+
		"\2\2\2\u052b\u052f\7\u00f0\2\2\u052c\u052d\7N\2\2\u052d\u052e\7\u00a1"+
		"\2\2\u052e\u0530\5.\30\2\u052f\u052c\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"?\3\2\2\2\u0531\u0532\5\u00c8e\2\u0532\u0533\7\u00f0\2\2\u0533\u0534\b"+
		"!\1\2\u0534A\3\2\2\2\u0535\u0537\5\34\17\2\u0536\u0535\3\2\2\2\u0536\u0537"+
		"\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\5H%\2\u0539\u053a\5D#\2\u053a"+
		"\u053b\b\"\1\2\u053b\u0543\3\2\2\2\u053c\u053e\5\\/\2\u053d\u053f\5F$"+
		"\2\u053e\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0536\3\2\2\2\u0542\u053c\3\2\2\2\u0543"+
		"C\3\2\2\2\u0544\u0545\7\32\2\2\u0545\u0546\7\25\2\2\u0546\u0547\5L\'\2"+
		"\u0547\u054e\b#\1\2\u0548\u0549\7\t\2\2\u0549\u054a\5L\'\2\u054a\u054b"+
		"\b#\1\2\u054b\u054d\3\2\2\2\u054c\u0548\3\2\2\2\u054d\u0550\3\2\2\2\u054e"+
		"\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2"+
		"\2\2\u0551\u0544\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0560\3\2\2\2\u0553"+
		"\u0554\7\u009a\2\2\u0554\u0555\7\25\2\2\u0555\u0556\5\u0092J\2\u0556\u055d"+
		"\b#\1\2\u0557\u0558\7\t\2\2\u0558\u0559\5\u0092J\2\u0559\u055a\b#\1\2"+
		"\u055a\u055c\3\2\2\2\u055b\u0557\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b"+
		"\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0561\3\2\2\2\u055f\u055d\3\2\2\2\u0560"+
		"\u0553\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u056f\3\2\2\2\u0562\u0563\7\u009b"+
		"\2\2\u0563\u0564\7\25\2\2\u0564\u0565\5\u0092J\2\u0565\u056c\b#\1\2\u0566"+
		"\u0567\7\t\2\2\u0567\u0568\5\u0092J\2\u0568\u0569\b#\1\2\u0569\u056b\3"+
		"\2\2\2\u056a\u0566\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056c"+
		"\u056d\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056f\u0562\3\2"+
		"\2\2\u056f\u0570\3\2\2\2\u0570\u057e\3\2\2\2\u0571\u0572\7\u0099\2\2\u0572"+
		"\u0573\7\25\2\2\u0573\u0574\5L\'\2\u0574\u057b\b#\1\2\u0575\u0576\7\t"+
		"\2\2\u0576\u0577\5L\'\2\u0577\u0578\b#\1\2\u0578\u057a\3\2\2\2\u0579\u0575"+
		"\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
		"\u057f\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u0571\3\2\2\2\u057e\u057f\3\2"+
		"\2\2\u057f\u0581\3\2\2\2\u0580\u0582\5\u00bc_\2\u0581\u0580\3\2\2\2\u0581"+
		"\u0582\3\2\2\2\u0582\u058b\3\2\2\2\u0583\u0589\7\34\2\2\u0584\u0585\7"+
		"\20\2\2\u0585\u058a\b#\1\2\u0586\u0587\5\u0092J\2\u0587\u0588\b#\1\2\u0588"+
		"\u058a\3\2\2\2\u0589\u0584\3\2\2\2\u0589\u0586\3\2\2\2\u058a\u058c\3\2"+
		"\2\2\u058b\u0583\3\2\2\2\u058b\u058c\3\2\2\2\u058cE\3\2\2\2\u058d\u058f"+
		"\5\34\17\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\3\2\2\2"+
		"\u0590\u0591\5N(\2\u0591\u0592\5D#\2\u0592G\3\2\2\2\u0593\u0594\b%\1\2"+
		"\u0594\u0595\5J&\2\u0595\u0596\b%\1\2\u0596\u05a1\3\2\2\2\u0597\u0598"+
		"\f\3\2\2\u0598\u059a\t\t\2\2\u0599\u059b\5f\64\2\u059a\u0599\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059d\5H%\4\u059d\u059e\b%\1"+
		"\2\u059e\u05a0\3\2\2\2\u059f\u0597\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f"+
		"\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2I\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4"+
		"\u05a5\5N(\2\u05a5\u05a6\b&\1\2\u05a6\u05b0\3\2\2\2\u05a7\u05a8\7Q\2\2"+
		"\u05a8\u05b0\5\u008aF\2\u05a9\u05b0\5\u0082B\2\u05aa\u05ab\7\4\2\2\u05ab"+
		"\u05ac\5B\"\2\u05ac\u05ad\7\6\2\2\u05ad\u05ae\b&\1\2\u05ae\u05b0\3\2\2"+
		"\2\u05af\u05a4\3\2\2\2\u05af\u05a7\3\2\2\2\u05af\u05a9\3\2\2\2\u05af\u05aa"+
		"\3\2\2\2\u05b0K\3\2\2\2\u05b1\u05b2\5\u0092J\2\u05b2\u05b5\b\'\1\2\u05b3"+
		"\u05b4\t\n\2\2\u05b4\u05b6\b\'\1\2\u05b5\u05b3\3\2\2\2\u05b5\u05b6\3\2"+
		"\2\2\u05b6\u05ba\3\2\2\2\u05b7\u05b8\7+\2\2\u05b8\u05b9\t\13\2\2\u05b9"+
		"\u05bb\b\'\1\2\u05ba\u05b7\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bbM\3\2\2\2"+
		"\u05bc\u05bd\7\f\2\2\u05bd\u05be\7\u009d\2\2\u05be\u05bf\7\4\2\2\u05bf"+
		"\u05c0\5\u0090I\2\u05c0\u05c1\7\6\2\2\u05c1\u05c7\3\2\2\2\u05c2\u05c3"+
		"\7q\2\2\u05c3\u05c7\5\u0090I\2\u05c4\u05c5\7\u009e\2\2\u05c5\u05c7\5\u0090"+
		"I\2\u05c6\u05bc\3\2\2\2\u05c6\u05c2\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c7"+
		"\u05c9\3\2\2\2\u05c8\u05ca\5\u0088E\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca"+
		"\3\2\2\2\u05ca\u05cd\3\2\2\2\u05cb\u05cc\7\u00a3\2\2\u05cc\u05ce\7\u00f0"+
		"\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf"+
		"\u05d0\7\u009f\2\2\u05d0\u05dd\7\u00f0\2\2\u05d1\u05db\7\17\2\2\u05d2"+
		"\u05dc\5v<\2\u05d3\u05dc\5\u00b2Z\2\u05d4\u05d7\7\4\2\2\u05d5\u05d8\5"+
		"v<\2\u05d6\u05d8\5\u00b2Z\2\u05d7\u05d5\3\2\2\2\u05d7\u05d6\3\2\2\2\u05d8"+
		"\u05d9\3\2\2\2\u05d9\u05da\7\6\2\2\u05da\u05dc\3\2\2\2\u05db\u05d2\3\2"+
		"\2\2\u05db\u05d3\3\2\2\2\u05db\u05d4\3\2\2\2\u05dc\u05de\3\2\2\2\u05dd"+
		"\u05d1\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e0\3\2\2\2\u05df\u05e1\5\u0088"+
		"E\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2"+
		"\u05e3\7\u00a2\2\2\u05e3\u05e5\7\u00f0\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e5"+
		"\3\2\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05e8\5\\/\2\u05e7\u05e6\3\2\2\2\u05e7"+
		"\u05e8\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05ea\7\23\2\2\u05ea\u05ec\5"+
		"\u0094K\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u0630\3\2\2\2"+
		"\u05ed\u05f3\7\f\2\2\u05ee\u05ef\5P)\2\u05ef\u05f0\b(\1\2\u05f0\u05f2"+
		"\3\2\2\2\u05f1\u05ee\3\2\2\2\u05f2\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3"+
		"\u05f4\3\2\2\2\u05f4\u05f9\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f7\5f"+
		"\64\2\u05f7\u05f8\b(\1\2\u05f8\u05fa\3\2\2\2\u05f9\u05f6\3\2\2\2\u05f9"+
		"\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\5\u0090I\2\u05fc\u0600"+
		"\b(\1\2\u05fd\u05fe\5\\/\2\u05fe\u05ff\b(\1\2\u05ff\u0601\3\2\2\2\u0600"+
		"\u05fd\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0610\3\2\2\2\u0602\u0603\5\\"+
		"/\2\u0603\u060d\b(\1\2\u0604\u0608\7\f\2\2\u0605\u0606\5f\64\2\u0606\u0607"+
		"\b(\1\2\u0607\u0609\3\2\2\2\u0608\u0605\3\2\2\2\u0608\u0609\3\2\2\2\u0609"+
		"\u060a\3\2\2\2\u060a\u060b\5\u0090I\2\u060b\u060c\b(\1\2\u060c\u060e\3"+
		"\2\2\2\u060d\u0604\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0610\3\2\2\2\u060f"+
		"\u05ed\3\2\2\2\u060f\u0602\3\2\2\2\u0610\u0616\3\2\2\2\u0611\u0612\5d"+
		"\63\2\u0612\u0613\b(\1\2\u0613\u0615\3\2\2\2\u0614\u0611\3\2\2\2\u0615"+
		"\u0618\3\2\2\2\u0616\u0614\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u061d\3\2"+
		"\2\2\u0618\u0616\3\2\2\2\u0619\u061a\7\23\2\2\u061a\u061b\5\u0094K\2\u061b"+
		"\u061c\b(\1\2\u061c\u061e\3\2\2\2\u061d\u0619\3\2\2\2\u061d\u061e\3\2"+
		"\2\2\u061e\u0622\3\2\2\2\u061f\u0620\5^\60\2\u0620\u0621\b(\1\2\u0621"+
		"\u0623\3\2\2\2\u0622\u061f\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0628\3\2"+
		"\2\2\u0624\u0625\7\33\2\2\u0625\u0626\5\u0094K\2\u0626\u0627\b(\1\2\u0627"+
		"\u0629\3\2\2\2\u0628\u0624\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062b\3\2"+
		"\2\2\u062a\u062c\5\u00bc_\2\u062b\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c"+
		"\u062d\3\2\2\2\u062d\u062e\b(\1\2\u062e\u0630\3\2\2\2\u062f\u05c6\3\2"+
		"\2\2\u062f\u060f\3\2\2\2\u0630O\3\2\2\2\u0631\u0632\7\5\2\2\u0632\u0633"+
		"\5R*\2\u0633\u063c\b)\1\2\u0634\u0636\7\t\2\2\u0635\u0634\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638\5R*\2\u0638\u0639\b)\1"+
		"\2\u0639\u063b\3\2\2\2\u063a\u0635\3\2\2\2\u063b\u063e\3\2\2\2\u063c\u063a"+
		"\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063f\3\2\2\2\u063e\u063c\3\2\2\2\u063f"+
		"\u0640\7\3\2\2\u0640Q\3\2\2\2\u0641\u0650\5\u00c8e\2\u0642\u0643\5\u00c8"+
		"e\2\u0643\u0644\7\4\2\2\u0644\u0649\5\u009cO\2\u0645\u0646\7\t\2\2\u0646"+
		"\u0648\5\u009cO\2\u0647\u0645\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647"+
		"\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064c\3\2\2\2\u064b\u0649\3\2\2\2\u064c"+
		"\u064d\7\6\2\2\u064d\u0650\3\2\2\2\u064e\u0650\5T+\2\u064f\u0641\3\2\2"+
		"\2\u064f\u0642\3\2\2\2\u064f\u064e\3\2\2\2\u0650S\3\2\2\2\u0651\u0652"+
		"\b+\1\2\u0652\u0653\5V,\2\u0653\u065c\3\2\2\2\u0654\u0655\f\4\2\2\u0655"+
		"\u0656\7\37\2\2\u0656\u065b\5T+\5\u0657\u0658\f\3\2\2\u0658\u0659\7\36"+
		"\2\2\u0659\u065b\5T+\4\u065a\u0654\3\2\2\2\u065a\u0657\3\2\2\2\u065b\u065e"+
		"\3\2\2\2\u065c\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065dU\3\2\2\2\u065e"+
		"\u065c\3\2\2\2\u065f\u0661\5Z.\2\u0660\u0662\5X-\2\u0661\u0660\3\2\2\2"+
		"\u0661\u0662\3\2\2\2\u0662W\3\2\2\2\u0663\u0665\7!\2\2\u0664\u0663\3\2"+
		"\2\2\u0664\u0665\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0667\7$\2\2\u0667"+
		"\u0668\5Z.\2\u0668\u0669\7\37\2\2\u0669\u066a\5Z.\2\u066a\u067b\3\2\2"+
		"\2\u066b\u066d\7!\2\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e"+
		"\3\2\2\2\u066e\u066f\7 \2\2\u066f\u0670\7\4\2\2\u0670\u0675\5\u0092J\2"+
		"\u0671\u0672\7\t\2\2\u0672\u0674\5\u0092J\2\u0673\u0671\3\2\2\2\u0674"+
		"\u0677\3\2\2\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\3\2"+
		"\2\2\u0677\u0675\3\2\2\2\u0678\u0679\7\6\2\2\u0679\u067b\3\2\2\2\u067a"+
		"\u0664\3\2\2\2\u067a\u066c\3\2\2\2\u067bY\3\2\2\2\u067c\u067d\b.\1\2\u067d"+
		"\u0683\7\u00f0\2\2\u067e\u067f\5\u00c8e\2\u067f\u0680\7\13\2\2\u0680\u0681"+
		"\5\u00c8e\2\u0681\u0683\3\2\2\2\u0682\u067c\3\2\2\2\u0682\u067e\3\2\2"+
		"\2\u0683\u068a\3\2\2\2\u0684\u0685\f\3\2\2\u0685\u0686\5\u00a0Q\2\u0686"+
		"\u0687\5Z.\4\u0687\u0689\3\2\2\2\u0688\u0684\3\2\2\2\u0689\u068c\3\2\2"+
		"\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b[\3\2\2\2\u068c\u068a"+
		"\3\2\2\2\u068d\u068e\7\r\2\2\u068e\u068f\5h\65\2\u068f\u0696\b/\1\2\u0690"+
		"\u0691\7\t\2\2\u0691\u0692\5h\65\2\u0692\u0693\b/\1\2\u0693\u0695\3\2"+
		"\2\2\u0694\u0690\3\2\2\2\u0695\u0698\3\2\2\2\u0696\u0694\3\2\2\2\u0696"+
		"\u0697\3\2\2\2\u0697\u069e\3\2\2\2\u0698\u0696\3\2\2\2\u0699\u069a\5d"+
		"\63\2\u069a\u069b\b/\1\2\u069b\u069d\3\2\2\2\u069c\u0699\3\2\2\2\u069d"+
		"\u06a0\3\2\2\2\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a2\3\2"+
		"\2\2\u06a0\u069e\3\2\2\2\u06a1\u06a3\5b\62\2\u06a2\u06a1\3\2\2\2\u06a2"+
		"\u06a3\3\2\2\2\u06a3]\3\2\2\2\u06a4\u06a5\7\24\2\2\u06a5\u06a6\7\25\2"+
		"\2\u06a6\u06a7\5\u0092J\2\u06a7\u06ae\b\60\1\2\u06a8\u06a9\7\t\2\2\u06a9"+
		"\u06aa\5\u0092J\2\u06aa\u06ab\b\60\1\2\u06ab\u06ad\3\2\2\2\u06ac\u06a8"+
		"\3\2\2\2\u06ad\u06b0\3\2\2\2\u06ae\u06ac\3\2\2\2\u06ae\u06af\3\2\2\2\u06af"+
		"\u06c2\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b1\u06b2\7N\2\2\u06b2\u06c3\7\31"+
		"\2\2\u06b3\u06b4\7N\2\2\u06b4\u06c3\7\30\2\2\u06b5\u06b6\7\26\2\2\u06b6"+
		"\u06b7\7\27\2\2\u06b7\u06b8\7\4\2\2\u06b8\u06bd\5`\61\2\u06b9\u06ba\7"+
		"\t\2\2\u06ba\u06bc\5`\61\2\u06bb\u06b9\3\2\2\2\u06bc\u06bf\3\2\2\2\u06bd"+
		"\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c0\3\2\2\2\u06bf\u06bd\3\2"+
		"\2\2\u06c0\u06c1\7\6\2\2\u06c1\u06c3\3\2\2\2\u06c2\u06b1\3\2\2\2\u06c2"+
		"\u06b3\3\2\2\2\u06c2\u06b5\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3_\3\2\2\2"+
		"\u06c4\u06cd\7\4\2\2\u06c5\u06ca\5\u0092J\2\u06c6\u06c7\7\t\2\2\u06c7"+
		"\u06c9\5\u0092J\2\u06c8\u06c6\3\2\2\2\u06c9\u06cc\3\2\2\2\u06ca\u06c8"+
		"\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06ce\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cd"+
		"\u06c5\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d2\7\6"+
		"\2\2\u06d0\u06d2\5\u0092J\2\u06d1\u06c4\3\2\2\2\u06d1\u06d0\3\2\2\2\u06d2"+
		"a\3\2\2\2\u06d3\u06d4\7?\2\2\u06d4\u06d5\7\4\2\2\u06d5\u06d6\5\u0090I"+
		"\2\u06d6\u06d7\7.\2\2\u06d7\u06d8\5\u00c8e\2\u06d8\u06d9\7 \2\2\u06d9"+
		"\u06da\7\4\2\2\u06da\u06df\5\u009eP\2\u06db\u06dc\7\t\2\2\u06dc\u06de"+
		"\5\u009eP\2\u06dd\u06db\3\2\2\2\u06de\u06e1\3\2\2\2\u06df\u06dd\3\2\2"+
		"\2\u06df\u06e0\3\2\2\2\u06e0\u06e2\3\2\2\2\u06e1\u06df\3\2\2\2\u06e2\u06e3"+
		"\7\6\2\2\u06e3\u06e4\7\6\2\2\u06e4c\3\2\2\2\u06e5\u06e6\7@\2\2\u06e6\u06e9"+
		"\7S\2\2\u06e7\u06e8\7\67\2\2\u06e8\u06ea\b\63\1\2\u06e9\u06e7\3\2\2\2"+
		"\u06e9\u06ea\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\5\u00c6d\2\u06ec"+
		"\u06ed\b\63\1\2\u06ed\u06f6\7\4\2\2\u06ee\u06f3\5\u0092J\2\u06ef\u06f0"+
		"\7\t\2\2\u06f0\u06f2\5\u0092J\2\u06f1\u06ef\3\2\2\2\u06f2\u06f5\3\2\2"+
		"\2\u06f3\u06f1\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f7\3\2\2\2\u06f5\u06f3"+
		"\3\2\2\2\u06f6\u06ee\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8"+
		"\u06f9\7\6\2\2\u06f9\u06fa\5\u00c8e\2\u06fa\u0709\b\63\1\2\u06fb\u06fd"+
		"\7\17\2\2\u06fc\u06fb\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06fe\3\2\2\2"+
		"\u06fe\u06ff\5\u00c8e\2\u06ff\u0706\b\63\1\2\u0700\u0701\7\t\2\2\u0701"+
		"\u0702\5\u00c8e\2\u0702\u0703\b\63\1\2\u0703\u0705\3\2\2\2\u0704\u0700"+
		"\3\2\2\2\u0705\u0708\3\2\2\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707"+
		"\u070a\3\2\2\2\u0708\u0706\3\2\2\2\u0709\u06fc\3\2\2\2\u0709\u070a\3\2"+
		"\2\2\u070ae\3\2\2\2\u070b\u070c\7\22\2\2\u070c\u0710\b\64\1\2\u070d\u070e"+
		"\7\20\2\2\u070e\u0710\b\64\1\2\u070f\u070b\3\2\2\2\u070f\u070d\3\2\2\2"+
		"\u0710g\3\2\2\2\u0711\u0712\5\u0080A\2\u0712\u0718\b\65\1\2\u0713\u0714"+
		"\5j\66\2\u0714\u0715\b\65\1\2\u0715\u0717\3\2\2\2\u0716\u0713\3\2\2\2"+
		"\u0717\u071a\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2\2\2\u0719i\3"+
		"\2\2\2\u071a\u0718\3\2\2\2\u071b\u071c\5l\67\2\u071c\u071d\7\65\2\2\u071d"+
		"\u071e\5\u0080A\2\u071e\u0722\b\66\1\2\u071f\u0720\5n8\2\u0720\u0721\b"+
		"\66\1\2\u0721\u0723\3\2\2\2\u0722\u071f\3\2\2\2\u0722\u0723\3\2\2\2\u0723"+
		"\u072b\3\2\2\2\u0724\u0725\7=\2\2\u0725\u0726\5l\67\2\u0726\u0727\7\65"+
		"\2\2\u0727\u0728\5\u0080A\2\u0728\u0729\b\66\1\2\u0729\u072b\3\2\2\2\u072a"+
		"\u071b\3\2\2\2\u072a\u0724\3\2\2\2\u072bk\3\2\2\2\u072c\u072d\78\2\2\u072d"+
		"\u072f\b\67\1\2\u072e\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u074f\3"+
		"\2\2\2\u0730\u0731\7\66\2\2\u0731\u074f\b\67\1\2\u0732\u0733\79\2\2\u0733"+
		"\u0736\b\67\1\2\u0734\u0735\7\67\2\2\u0735\u0737\b\67\1\2\u0736\u0734"+
		"\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u074f\3\2\2\2\u0738\u0739\79\2\2\u0739"+
		"\u073a\7:\2\2\u073a\u074f\b\67\1\2\u073b\u073c\7;\2\2\u073c\u073f\b\67"+
		"\1\2\u073d\u073e\7\67\2\2\u073e\u0740\b\67\1\2\u073f\u073d\3\2\2\2\u073f"+
		"\u0740\3\2\2\2\u0740\u074f\3\2\2\2\u0741\u0742\7<\2\2\u0742\u0745\b\67"+
		"\1\2\u0743\u0744\7\67\2\2\u0744\u0746\b\67\1\2\u0745\u0743\3\2\2\2\u0745"+
		"\u0746\3\2\2\2\u0746\u074f\3\2\2\2\u0747\u074a\b\67\1\2\u0748\u0749\7"+
		"9\2\2\u0749\u074b\b\67\1\2\u074a\u0748\3\2\2\2\u074a\u074b\3\2\2\2\u074b"+
		"\u074c\3\2\2\2\u074c\u074d\7\u00ed\2\2\u074d\u074f\b\67\1\2\u074e\u072e"+
		"\3\2\2\2\u074e\u0730\3\2\2\2\u074e\u0732\3\2\2\2\u074e\u0738\3\2\2\2\u074e"+
		"\u073b\3\2\2\2\u074e\u0741\3\2\2\2\u074e\u0747\3\2\2\2\u074fm\3\2\2\2"+
		"\u0750\u0751\7>\2\2\u0751\u0752\5\u0094K\2\u0752\u0753\b8\1\2\u0753\u0765"+
		"\3\2\2\2\u0754\u0755\7\u009f\2\2\u0755\u0756\b8\1\2\u0756\u0757\7\4\2"+
		"\2\u0757\u0758\5\u00c8e\2\u0758\u075f\b8\1\2\u0759\u075a\7\t\2\2\u075a"+
		"\u075b\5\u00c8e\2\u075b\u075c\b8\1\2\u075c\u075e\3\2\2\2\u075d\u0759\3"+
		"\2\2\2\u075e\u0761\3\2\2\2\u075f\u075d\3\2\2\2\u075f\u0760\3\2\2\2\u0760"+
		"\u0762\3\2\2\2\u0761\u075f\3\2\2\2\u0762\u0763\7\6\2\2\u0763\u0765\3\2"+
		"\2\2\u0764\u0750\3\2\2\2\u0764\u0754\3\2\2\2\u0765o\3\2\2\2\u0766\u0767"+
		"\7l\2\2\u0767\u0769\7\4\2\2\u0768\u076a\5r:\2\u0769\u0768\3\2\2\2\u0769"+
		"\u076a\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076c\7\6\2\2\u076cq\3\2\2\2"+
		"\u076d\u076f\7\u008b\2\2\u076e\u076d\3\2\2\2\u076e\u076f\3\2\2\2\u076f"+
		"\u0770\3\2\2\2\u0770\u0771\t\f\2\2\u0771\u0786\7\u0095\2\2\u0772\u0773"+
		"\5\u0092J\2\u0773\u0774\7E\2\2\u0774\u0786\3\2\2\2\u0775\u0776\7\u0096"+
		"\2\2\u0776\u0777\7\u00f4\2\2\u0777\u0778\7\u0097\2\2\u0778\u0779\7\u0098"+
		"\2\2\u0779\u0782\7\u00f4\2\2\u077a\u0780\7>\2\2\u077b\u0781\5\u00c8e\2"+
		"\u077c\u077d\5\u00c6d\2\u077d\u077e\7\4\2\2\u077e\u077f\7\6\2\2\u077f"+
		"\u0781\3\2\2\2\u0780\u077b\3\2\2\2\u0780\u077c\3\2\2\2\u0781\u0783\3\2"+
		"\2\2\u0782\u077a\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0786\3\2\2\2\u0784"+
		"\u0786\5\u0092J\2\u0785\u076e\3\2\2\2\u0785\u0772\3\2\2\2\u0785\u0775"+
		"\3\2\2\2\u0785\u0784\3\2\2\2\u0786s\3\2\2\2\u0787\u0788\7\4\2\2\u0788"+
		"\u0789\5v<\2\u0789\u078a\7\6\2\2\u078a\u078b\b;\1\2\u078bu\3\2\2\2\u078c"+
		"\u078d\5\u00c8e\2\u078d\u0794\b<\1\2\u078e\u078f\7\t\2\2\u078f\u0790\5"+
		"\u00c8e\2\u0790\u0791\b<\1\2\u0791\u0793\3\2\2\2\u0792\u078e\3\2\2\2\u0793"+
		"\u0796\3\2\2\2\u0794\u0792\3\2\2\2\u0794\u0795\3\2\2\2\u0795w\3\2\2\2"+
		"\u0796\u0794\3\2\2\2\u0797\u0798\7\4\2\2\u0798\u079d\5z>\2\u0799\u079a"+
		"\7\t\2\2\u079a\u079c\5z>\2\u079b\u0799\3\2\2\2\u079c\u079f\3\2\2\2\u079d"+
		"\u079b\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u07a0\3\2\2\2\u079f\u079d\3\2"+
		"\2\2\u07a0\u07a1\7\6\2\2\u07a1y\3\2\2\2\u07a2\u07a4\5\u00c8e\2\u07a3\u07a5"+
		"\t\n\2\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5{\3\2\2\2\u07a6"+
		"\u07a7\7\4\2\2\u07a7\u07ac\5~@\2\u07a8\u07a9\7\t\2\2\u07a9\u07ab\5~@\2"+
		"\u07aa\u07a8\3\2\2\2\u07ab\u07ae\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ac\u07ad"+
		"\3\2\2\2\u07ad\u07af\3\2\2\2\u07ae\u07ac\3\2\2\2\u07af\u07b0\7\6\2\2\u07b0"+
		"}\3\2\2\2\u07b1\u07b4\5\u00c8e\2\u07b2\u07b3\7s\2\2\u07b3\u07b5\7\u00f0"+
		"\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\177\3\2\2\2\u07b6\u07ba"+
		"\5\u008aF\2\u07b7\u07b8\5p9\2\u07b8\u07b9\bA\1\2\u07b9\u07bb\3\2\2\2\u07ba"+
		"\u07b7\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07bd\5\u0086"+
		"D\2\u07bd\u07be\bA\1\2\u07be\u07d8\3\2\2\2\u07bf\u07c0\7\4\2\2\u07c0\u07c1"+
		"\5B\"\2\u07c1\u07c5\7\6\2\2\u07c2\u07c3\5p9\2\u07c3\u07c4\bA\1\2\u07c4"+
		"\u07c6\3\2\2\2\u07c5\u07c2\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c7\3\2"+
		"\2\2\u07c7\u07c8\5\u0086D\2\u07c8\u07c9\bA\1\2\u07c9\u07d8\3\2\2\2\u07ca"+
		"\u07cb\7\4\2\2\u07cb\u07cc\5h\65\2\u07cc\u07d0\7\6\2\2\u07cd\u07ce\5p"+
		"9\2\u07ce\u07cf\bA\1\2\u07cf\u07d1\3\2\2\2\u07d0\u07cd\3\2\2\2\u07d0\u07d1"+
		"\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\5\u0086D\2\u07d3\u07d4\bA\1\2"+
		"\u07d4\u07d8\3\2\2\2\u07d5\u07d8\5\u0082B\2\u07d6\u07d8\5\u0084C\2\u07d7"+
		"\u07b6\3\2\2\2\u07d7\u07bf\3\2\2\2\u07d7\u07ca\3\2\2\2\u07d7\u07d5\3\2"+
		"\2\2\u07d7\u07d6\3\2\2\2\u07d8\u0081\3\2\2\2\u07d9\u07da\7O\2\2\u07da"+
		"\u07df\5\u0092J\2\u07db\u07dc\7\t\2\2\u07dc\u07de\5\u0092J\2\u07dd\u07db"+
		"\3\2\2\2\u07de\u07e1\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0"+
		"\u07e2\3\2\2\2\u07e1\u07df\3\2\2\2\u07e2\u07e3\5\u0086D\2\u07e3\u0083"+
		"\3\2\2\2\u07e4\u07e5\5\u00c8e\2\u07e5\u07ee\7\4\2\2\u07e6\u07eb\5\u0092"+
		"J\2\u07e7\u07e8\7\t\2\2\u07e8\u07ea\5\u0092J\2\u07e9\u07e7\3\2\2\2\u07ea"+
		"\u07ed\3\2\2\2\u07eb\u07e9\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ef\3\2"+
		"\2\2\u07ed\u07eb\3\2\2\2\u07ee\u07e6\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef"+
		"\u07f0\3\2\2\2\u07f0\u07f1\7\6\2\2\u07f1\u07f2\5\u0086D\2\u07f2\u0085"+
		"\3\2\2\2\u07f3\u07f4\7\17\2\2\u07f4\u07f6\bD\1\2\u07f5\u07f3\3\2\2\2\u07f5"+
		"\u07f6\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f8\5\u00caf\2\u07f8\u07fc"+
		"\bD\1\2\u07f9\u07fa\5t;\2\u07fa\u07fb\bD\1\2\u07fb\u07fd\3\2\2\2\u07fc"+
		"\u07f9\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07ff\3\2\2\2\u07fe\u07f5\3\2"+
		"\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0087\3\2\2\2\u0800\u0801\7M\2\2\u0801"+
		"\u0802\7Z\2\2\u0802\u0803\7\u00a0\2\2\u0803\u0807\7\u00f0\2\2\u0804\u0805"+
		"\7N\2\2\u0805\u0806\7\u00a1\2\2\u0806\u0808\5.\30\2\u0807\u0804\3\2\2"+
		"\2\u0807\u0808\3\2\2\2\u0808\u0832\3\2\2\2\u0809\u080a\7M\2\2\u080a\u080b"+
		"\7Z\2\2\u080b\u0815\7\u00a4\2\2\u080c\u080d\7\u00a5\2\2\u080d\u080e\7"+
		"\u00a6\2\2\u080e\u080f\7\25\2\2\u080f\u0813\7\u00f0\2\2\u0810\u0811\7"+
		"\u00aa\2\2\u0811\u0812\7\25\2\2\u0812\u0814\7\u00f0\2\2\u0813\u0810\3"+
		"\2\2\2\u0813\u0814\3\2\2\2\u0814\u0816\3\2\2\2\u0815\u080c\3\2\2\2\u0815"+
		"\u0816\3\2\2\2\u0816\u081c\3\2\2\2\u0817\u0818\7\u00a7\2\2\u0818\u0819"+
		"\7\u00a8\2\2\u0819\u081a\7\u00a6\2\2\u081a\u081b\7\25\2\2\u081b\u081d"+
		"\7\u00f0\2\2\u081c\u0817\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u0823\3\2\2"+
		"\2\u081e\u081f\7q\2\2\u081f\u0820\7\u00a9\2\2\u0820\u0821\7\u00a6\2\2"+
		"\u0821\u0822\7\25\2\2\u0822\u0824\7\u00f0\2\2\u0823\u081e\3\2\2\2\u0823"+
		"\u0824\3\2\2\2\u0824\u0829\3\2\2\2\u0825\u0826\7\u00ab\2\2\u0826\u0827"+
		"\7\u00a6\2\2\u0827\u0828\7\25\2\2\u0828\u082a\7\u00f0\2\2\u0829\u0825"+
		"\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082f\3\2\2\2\u082b\u082c\7(\2\2\u082c"+
		"\u082d\7\u00d9\2\2\u082d\u082e\7\17\2\2\u082e\u0830\7\u00f0\2\2\u082f"+
		"\u082b\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0832\3\2\2\2\u0831\u0800\3\2"+
		"\2\2\u0831\u0809\3\2\2\2\u0832\u0089\3\2\2\2\u0833\u0834\5\u00c8e\2\u0834"+
		"\u0835\7\13\2\2\u0835\u0836\bF\1\2\u0836\u0838\3\2\2\2\u0837\u0833\3\2"+
		"\2\2\u0837\u0838\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083a\5\u00c8e\2\u083a"+
		"\u083b\bF\1\2\u083b\u008b\3\2\2\2\u083c\u083d\5\u00c8e\2\u083d\u083e\7"+
		"\13\2\2\u083e\u083f\bG\1\2\u083f\u0841\3\2\2\2\u0840\u083c\3\2\2\2\u0840"+
		"\u0841\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0843\5\u00c8e\2\u0843\u0844"+
		"\bG\1\2\u0844\u008d\3\2\2\2\u0845\u0846\5\u0092J\2\u0846\u0853\bH\1\2"+
		"\u0847\u0848\7\17\2\2\u0848\u084a\bH\1\2\u0849\u0847\3\2\2\2\u0849\u084a"+
		"\3\2\2\2\u084a\u0851\3\2\2\2\u084b\u084c\5\u00c8e\2\u084c\u084d\bH\1\2"+
		"\u084d\u0852\3\2\2\2\u084e\u084f\5t;\2\u084f\u0850\bH\1\2\u0850\u0852"+
		"\3\2\2\2\u0851\u084b\3\2\2\2\u0851\u084e\3\2\2\2\u0852\u0854\3\2\2\2\u0853"+
		"\u0849\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u008f\3\2\2\2\u0855\u0856\5\u008e"+
		"H\2\u0856\u085d\bI\1\2\u0857\u0858\7\t\2\2\u0858\u0859\5\u008eH\2\u0859"+
		"\u085a\bI\1\2\u085a\u085c\3\2\2\2\u085b\u0857\3\2\2\2\u085c\u085f\3\2"+
		"\2\2\u085d\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0091\3\2\2\2\u085f"+
		"\u085d\3\2\2\2\u0860\u0861\5\u0094K\2\u0861\u0862\bJ\1\2\u0862\u0093\3"+
		"\2\2\2\u0863\u0864\bK\1\2\u0864\u0865\7!\2\2\u0865\u0866\5\u0094K\7\u0866"+
		"\u0867\bK\1\2\u0867\u0872\3\2\2\2\u0868\u0869\7#\2\2\u0869\u086a\7\4\2"+
		"\2\u086a\u086b\5\32\16\2\u086b\u086c\7\6\2\2\u086c\u086d\bK\1\2\u086d"+
		"\u0872\3\2\2\2\u086e\u086f\5\u0096L\2\u086f\u0870\bK\1\2\u0870\u0872\3"+
		"\2\2\2\u0871\u0863\3\2\2\2\u0871\u0868\3\2\2\2\u0871\u086e\3\2\2\2\u0872"+
		"\u087f\3\2\2\2\u0873\u0874\f\4\2\2\u0874\u0875\7\37\2\2\u0875\u0876\5"+
		"\u0094K\5\u0876\u0877\bK\1\2\u0877\u087e\3\2\2\2\u0878\u0879\f\3\2\2\u0879"+
		"\u087a\7\36\2\2\u087a\u087b\5\u0094K\4\u087b\u087c\bK\1\2\u087c\u087e"+
		"\3\2\2\2\u087d\u0873\3\2\2\2\u087d\u0878\3\2\2\2\u087e\u0881\3\2\2\2\u087f"+
		"\u087d\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0095\3\2\2\2\u0881\u087f\3\2"+
		"\2\2\u0882\u0883\5\u009aN\2\u0883\u0887\bL\1\2\u0884\u0885\5\u0098M\2"+
		"\u0885\u0886\bL\1\2\u0886\u0888\3\2\2\2\u0887\u0884\3\2\2\2\u0887\u0888"+
		"\3\2\2\2\u0888\u0097\3\2\2\2\u0889\u088a\7!\2\2\u088a\u088c\bM\1\2\u088b"+
		"\u0889\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e\7$"+
		"\2\2\u088e\u088f\5\u009aN\2\u088f\u0890\7\37\2\2\u0890\u0891\5\u009aN"+
		"\2\u0891\u0892\bM\1\2\u0892\u08cb\3\2\2\2\u0893\u0894\7!\2\2\u0894\u0896"+
		"\bM\1\2\u0895\u0893\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0897\3\2\2\2\u0897"+
		"\u0898\7 \2\2\u0898\u0899\bM\1\2\u0899\u089a\7\4\2\2\u089a\u089b\5\u0092"+
		"J\2\u089b\u08a2\bM\1\2\u089c\u089d\7\t\2\2\u089d\u089e\5\u0092J\2\u089e"+
		"\u089f\bM\1\2\u089f\u08a1\3\2\2\2\u08a0\u089c\3\2\2\2\u08a1\u08a4\3\2"+
		"\2\2\u08a2\u08a0\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a5\3\2\2\2\u08a4"+
		"\u08a2\3\2\2\2\u08a5\u08a6\7\6\2\2\u08a6\u08cb\3\2\2\2\u08a7\u08a8\7!"+
		"\2\2\u08a8\u08aa\bM\1\2\u08a9\u08a7\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa"+
		"\u08ab\3\2\2\2\u08ab\u08ac\7 \2\2\u08ac\u08ad\7\4\2\2\u08ad\u08ae\5\32"+
		"\16\2\u08ae\u08af\7\6\2\2\u08af\u08b0\bM\1\2\u08b0\u08cb\3\2\2\2\u08b1"+
		"\u08b2\7!\2\2\u08b2\u08b4\bM\1\2\u08b3\u08b1\3\2\2\2\u08b3\u08b4\3\2\2"+
		"\2\u08b4\u08b5\3\2\2\2\u08b5\u08b6\t\r\2\2\u08b6\u08b7\5\u009aN\2\u08b7"+
		"\u08b8\bM\1\2\u08b8\u08cb\3\2\2\2\u08b9\u08bc\7\'\2\2\u08ba\u08bb\7!\2"+
		"\2\u08bb\u08bd\bM\1\2\u08bc\u08ba\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u08be"+
		"\3\2\2\2\u08be\u08bf\7(\2\2\u08bf\u08cb\bM\1\2\u08c0\u08c3\7\'\2\2\u08c1"+
		"\u08c2\7!\2\2\u08c2\u08c4\bM\1\2\u08c3\u08c1\3\2\2\2\u08c3\u08c4\3\2\2"+
		"\2\u08c4\u08c5\3\2\2\2\u08c5\u08c6\7\22\2\2\u08c6\u08c7\7\r\2\2\u08c7"+
		"\u08c8\5\u009aN\2\u08c8\u08c9\bM\1\2\u08c9\u08cb\3\2\2\2\u08ca\u088b\3"+
		"\2\2\2\u08ca\u0895\3\2\2\2\u08ca\u08a9\3\2\2\2\u08ca\u08b3\3\2\2\2\u08ca"+
		"\u08b9\3\2\2\2\u08ca\u08c0\3\2\2\2\u08cb\u0099\3\2\2\2\u08cc\u08cd\bN"+
		"\1\2\u08cd\u08ce\t\16\2\2\u08ce\u08cf\5\u009aN\t\u08cf\u08d0\bN\1\2\u08d0"+
		"\u08d5\3\2\2\2\u08d1\u08d2\5\u009cO\2\u08d2\u08d3\bN\1\2\u08d3\u08d5\3"+
		"\2\2\2\u08d4\u08cc\3\2\2\2\u08d4\u08d1\3\2\2\2\u08d5\u08f6\3\2\2\2\u08d6"+
		"\u08d7\f\b\2\2\u08d7\u08d8\t\17\2\2\u08d8\u08d9\5\u009aN\t\u08d9\u08da"+
		"\bN\1\2\u08da\u08f5\3\2\2\2\u08db\u08dc\f\7\2\2\u08dc\u08dd\t\20\2\2\u08dd"+
		"\u08de\5\u009aN\b\u08de\u08df\bN\1\2\u08df\u08f5\3\2\2\2\u08e0\u08e1\f"+
		"\6\2\2\u08e1\u08e2\7\u0091\2\2\u08e2\u08e3\5\u009aN\7\u08e3\u08e4\bN\1"+
		"\2\u08e4\u08f5\3\2\2\2\u08e5\u08e6\f\5\2\2\u08e6\u08e7\7\u0094\2\2\u08e7"+
		"\u08e8\5\u009aN\6\u08e8\u08e9\bN\1\2\u08e9\u08f5\3\2\2\2\u08ea\u08eb\f"+
		"\4\2\2\u08eb\u08ec\7\u0092\2\2\u08ec\u08ed\5\u009aN\5\u08ed\u08ee\bN\1"+
		"\2\u08ee\u08f5";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u08ef\u08f0\f\3\2\2\u08f0\u08f1\5\u00a0Q\2\u08f1\u08f2\5\u009a"+
		"N\4\u08f2\u08f3\bN\1\2\u08f3\u08f5\3\2\2\2\u08f4\u08d6\3\2\2\2\u08f4\u08db"+
		"\3\2\2\2\u08f4\u08e0\3\2\2\2\u08f4\u08e5\3\2\2\2\u08f4\u08ea\3\2\2\2\u08f4"+
		"\u08ef\3\2\2\2\u08f5\u08f8\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f6\u08f7\3\2"+
		"\2\2\u08f7\u009b\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f9\u08fa\bO\1\2\u08fa"+
		"\u08fb\7\60\2\2\u08fb\u08ff\bO\1\2\u08fc\u08fd\5\u00ba^\2\u08fd\u08fe"+
		"\bO\1\2\u08fe\u0900\3\2\2\2\u08ff\u08fc\3\2\2\2\u0900\u0901\3\2\2\2\u0901"+
		"\u08ff\3\2\2\2\u0901\u0902\3\2\2\2\u0902\u0907\3\2\2\2\u0903\u0904\7\63"+
		"\2\2\u0904\u0905\5\u0092J\2\u0905\u0906\bO\1\2\u0906\u0908\3\2\2\2\u0907"+
		"\u0903\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\7\64"+
		"\2\2\u090a\u099f\3\2\2\2\u090b\u090c\7\60\2\2\u090c\u090d\5\u0092J\2\u090d"+
		"\u0911\bO\1\2\u090e\u090f\5\u00ba^\2\u090f\u0910\bO\1\2\u0910\u0912\3"+
		"\2\2\2\u0911\u090e\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0911\3\2\2\2\u0913"+
		"\u0914\3\2\2\2\u0914\u0919\3\2\2\2\u0915\u0916\7\63\2\2\u0916\u0917\5"+
		"\u0092J\2\u0917\u0918\bO\1\2\u0918\u091a\3\2\2\2\u0919\u0915\3\2\2\2\u0919"+
		"\u091a\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091c\7\64\2\2\u091c\u099f\3"+
		"\2\2\2\u091d\u091e\7^\2\2\u091e\u091f\7\4\2\2\u091f\u0920\5\u0092J\2\u0920"+
		"\u0921\7\17\2\2\u0921\u0922\5\u00b0Y\2\u0922\u0923\7\6\2\2\u0923\u0924"+
		"\bO\1\2\u0924\u099f\3\2\2\2\u0925\u0926\7r\2\2\u0926\u0932\7\4\2\2\u0927"+
		"\u0928\5\u008eH\2\u0928\u092f\bO\1\2\u0929\u092a\7\t\2\2\u092a\u092b\5"+
		"\u008eH\2\u092b\u092c\bO\1\2\u092c\u092e\3\2\2\2\u092d\u0929\3\2\2\2\u092e"+
		"\u0931\3\2\2\2\u092f\u092d\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0933\3\2"+
		"\2\2\u0931\u092f\3\2\2\2\u0932\u0927\3\2\2\2\u0932\u0933\3\2\2\2\u0933"+
		"\u0934\3\2\2\2\u0934\u099f\7\6\2\2\u0935\u0936\7J\2\2\u0936\u0937\7\4"+
		"\2\2\u0937\u0938\5\u0092J\2\u0938\u093c\bO\1\2\u0939\u093a\7|\2\2\u093a"+
		"\u093b\7+\2\2\u093b\u093d\bO\1\2\u093c\u0939\3\2\2\2\u093c\u093d\3\2\2"+
		"\2\u093d\u093e\3\2\2\2\u093e\u093f\7\6\2\2\u093f\u099f\3\2\2\2\u0940\u0941"+
		"\7L\2\2\u0941\u0942\7\4\2\2\u0942\u0943\5\u0092J\2\u0943\u0947\bO\1\2"+
		"\u0944\u0945\7|\2\2\u0945\u0946\7+\2\2\u0946\u0948\bO\1\2\u0947\u0944"+
		"\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a\7\6\2\2\u094a"+
		"\u099f\3\2\2\2\u094b\u094c\7\u0081\2\2\u094c\u094d\7\4\2\2\u094d\u094e"+
		"\5\u009aN\2\u094e\u094f\7 \2\2\u094f\u0950\5\u009aN\2\u0950\u0951\7\6"+
		"\2\2\u0951\u0952\bO\1\2\u0952\u099f\3\2\2\2\u0953\u0954\5\u009eP\2\u0954"+
		"\u0955\bO\1\2\u0955\u099f\3\2\2\2\u0956\u0957\7\u008c\2\2\u0957\u099f"+
		"\bO\1\2\u0958\u0959\5\u00c6d\2\u0959\u095a\7\13\2\2\u095a\u095b\7\u008c"+
		"\2\2\u095b\u095c\bO\1\2\u095c\u099f\3\2\2\2\u095d\u095e\7\4\2\2\u095e"+
		"\u095f\5\u008eH\2\u095f\u0964\bO\1\2\u0960\u0961\7\t\2\2\u0961\u0962\5"+
		"\u008eH\2\u0962\u0963\bO\1\2\u0963\u0965\3\2\2\2\u0964\u0960\3\2\2\2\u0965"+
		"\u0966\3\2\2\2\u0966\u0964\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\3\2"+
		"\2\2\u0968\u0969\7\6\2\2\u0969\u099f\3\2\2\2\u096a\u096b\7\4\2\2\u096b"+
		"\u096c\5\32\16\2\u096c\u096d\7\6\2\2\u096d\u096e\bO\1\2\u096e\u099f\3"+
		"\2\2\2\u096f\u0970\5\u00c6d\2\u0970\u0971\bO\1\2\u0971\u0982\7\4\2\2\u0972"+
		"\u0973\5f\64\2\u0973\u0974\bO\1\2\u0974\u0976\3\2\2\2\u0975\u0972\3\2"+
		"\2\2\u0975\u0976\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\5\u0092J\2\u0978"+
		"\u097f\bO\1\2\u0979\u097a\7\t\2\2\u097a\u097b\5\u0092J\2\u097b\u097c\b"+
		"O\1\2\u097c\u097e\3\2\2\2\u097d\u0979\3\2\2\2\u097e\u0981\3\2\2\2\u097f"+
		"\u097d\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0983\3\2\2\2\u0981\u097f\3\2"+
		"\2\2\u0982\u0975\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0984\3\2\2\2\u0984"+
		"\u0989\7\6\2\2\u0985\u0986\7B\2\2\u0986\u0987\5\u00c0a\2\u0987\u0988\b"+
		"O\1\2\u0988\u098a\3\2\2\2\u0989\u0985\3\2\2\2\u0989\u098a\3\2\2\2\u098a"+
		"\u099f\3\2\2\2\u098b\u098c\5\u00c6d\2\u098c\u098d\7\4\2\2\u098d\u098e"+
		"\t\21\2\2\u098e\u098f\bO\1\2\u098f\u0990\5\u0092J\2\u0990\u0991\bO\1\2"+
		"\u0991\u0992\7\r\2\2\u0992\u0993\5\u0092J\2\u0993\u0994\bO\1\2\u0994\u0995"+
		"\7\6\2\2\u0995\u099f\3\2\2\2\u0996\u0997\5\u00c8e\2\u0997\u0998\bO\1\2"+
		"\u0998\u099f\3\2\2\2\u0999\u099a\7\4\2\2\u099a\u099b\5\u0092J\2\u099b"+
		"\u099c\7\6\2\2\u099c\u099d\bO\1\2\u099d\u099f\3\2\2\2\u099e\u08f9\3\2"+
		"\2\2\u099e\u090b\3\2\2\2\u099e\u091d\3\2\2\2\u099e\u0925\3\2\2\2\u099e"+
		"\u0935\3\2\2\2\u099e\u0940\3\2\2\2\u099e\u094b\3\2\2\2\u099e\u0953\3\2"+
		"\2\2\u099e\u0956\3\2\2\2\u099e\u0958\3\2\2\2\u099e\u095d\3\2\2\2\u099e"+
		"\u096a\3\2\2\2\u099e\u096f\3\2\2\2\u099e\u098b\3\2\2\2\u099e\u0996\3\2"+
		"\2\2\u099e\u0999\3\2\2\2\u099f\u09ad\3\2\2\2\u09a0\u09a1\f\6\2\2\u09a1"+
		"\u09a2\7\b\2\2\u09a2\u09a3\5\u009aN\2\u09a3\u09a4\7\n\2\2\u09a4\u09a5"+
		"\bO\1\2\u09a5\u09ac\3\2\2\2\u09a6\u09a7\f\4\2\2\u09a7\u09a8\7\13\2\2\u09a8"+
		"\u09a9\5\u00c8e\2\u09a9\u09aa\bO\1\2\u09aa\u09ac\3\2\2\2\u09ab\u09a0\3"+
		"\2\2\2\u09ab\u09a6\3\2\2\2\u09ac\u09af\3\2\2\2\u09ad\u09ab\3\2\2\2\u09ad"+
		"\u09ae\3\2\2\2\u09ae\u009d\3\2\2\2\u09af\u09ad\3\2\2\2\u09b0\u09b1\7("+
		"\2\2\u09b1\u09c6\bP\1\2\u09b2\u09b3\5\u00a8U\2\u09b3\u09b4\bP\1\2\u09b4"+
		"\u09c6\3\2\2\2\u09b5\u09b6\5\u00c8e\2\u09b6\u09b7\7\u00f0\2\2\u09b7\u09b8"+
		"\bP\1\2\u09b8\u09c6\3\2\2\2\u09b9\u09ba\5\u00ceh\2\u09ba\u09bb\bP\1\2"+
		"\u09bb\u09c6\3\2\2\2\u09bc\u09bd\5\u00a6T\2\u09bd\u09be\bP\1\2\u09be\u09c6"+
		"\3\2\2\2\u09bf\u09c0\7\u00f0\2\2\u09c0\u09c2\bP\1\2\u09c1\u09bf\3\2\2"+
		"\2\u09c2\u09c3\3\2\2\2\u09c3\u09c1\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c6"+
		"\3\2\2\2\u09c5\u09b0\3\2\2\2\u09c5\u09b2\3\2\2\2\u09c5\u09b5\3\2\2\2\u09c5"+
		"\u09b9\3\2\2\2\u09c5\u09bc\3\2\2\2\u09c5\u09c1\3\2\2\2\u09c6\u009f\3\2"+
		"\2\2\u09c7\u09c8\t\22\2\2\u09c8\u09c9\bQ\1\2\u09c9\u00a1\3\2\2\2\u09ca"+
		"\u09cb\t\23\2\2\u09cb\u09cc\bR\1\2\u09cc\u00a3\3\2\2\2\u09cd\u09ce\t\24"+
		"\2\2\u09ce\u09cf\bS\1\2\u09cf\u00a5\3\2\2\2\u09d0\u09d1\7)\2\2\u09d1\u09d5"+
		"\bT\1\2\u09d2\u09d3\7*\2\2\u09d3\u09d5\bT\1\2\u09d4\u09d0\3\2\2\2\u09d4"+
		"\u09d2\3\2\2\2\u09d5\u00a7\3\2\2\2\u09d6\u09dc\7/\2\2\u09d7\u09d8\5\u00aa"+
		"V\2\u09d8\u09d9\bU\1\2\u09d9\u09db\3\2\2\2\u09da\u09d7\3\2\2\2\u09db\u09de"+
		"\3\2\2\2\u09dc\u09da\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u00a9\3\2\2\2\u09de"+
		"\u09dc\3\2\2\2\u09df\u09e0\5\u00acW\2\u09e0\u09e3\5\u00c8e\2\u09e1\u09e2"+
		"\7k\2\2\u09e2\u09e4\5\u00c8e\2\u09e3\u09e1\3\2\2\2\u09e3\u09e4\3\2\2\2"+
		"\u09e4\u00ab\3\2\2\2\u09e5\u09e6\t\25\2\2\u09e6\u09e8\bW\1\2\u09e7\u09e5"+
		"\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09ea\t\f\2\2\u09ea"+
		"\u09ee\bW\1\2\u09eb\u09ec\7\u00f0\2\2\u09ec\u09ee\bW\1\2\u09ed\u09e7\3"+
		"\2\2\2\u09ed\u09eb\3\2\2\2\u09ee\u00ad\3\2\2\2\u09ef\u09f0\7J\2\2\u09f0"+
		"\u09f6\bX\1\2\u09f1\u09f2\7K\2\2\u09f2\u09f3\5\u00c8e\2\u09f3\u09f4\b"+
		"X\1\2\u09f4\u09f6\3\2\2\2\u09f5\u09ef\3\2\2\2\u09f5\u09f1\3\2\2\2\u09f6"+
		"\u00af\3\2\2\2\u09f7\u09f8\7p\2\2\u09f8\u09f9\7\u0086\2\2\u09f9\u09fa"+
		"\5\u00b0Y\2\u09fa\u09fb\7\u0088\2\2\u09fb\u09fc\bY\1\2\u09fc\u0a23\3\2"+
		"\2\2\u09fd\u09fe\7q\2\2\u09fe\u09ff\7\u0086\2\2\u09ff\u0a00\5\u00b0Y\2"+
		"\u0a00\u0a01\7\t\2\2\u0a01\u0a02\5\u00b0Y\2\u0a02\u0a03\7\u0088\2\2\u0a03"+
		"\u0a04\bY\1\2\u0a04\u0a23\3\2\2\2\u0a05\u0a06\7r\2\2\u0a06\u0a10\bY\1"+
		"\2\u0a07\u0a0b\7\u0086\2\2\u0a08\u0a09\5\u00b6\\\2\u0a09\u0a0a\bY\1\2"+
		"\u0a0a\u0a0c\3\2\2\2\u0a0b\u0a08\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0d"+
		"\3\2\2\2\u0a0d\u0a11\7\u0088\2\2\u0a0e\u0a0f\7\u0084\2\2\u0a0f\u0a11\b"+
		"Y\1\2\u0a10\u0a07\3\2\2\2\u0a10\u0a0e\3\2\2\2\u0a11\u0a23\3\2\2\2\u0a12"+
		"\u0a13\5\u00c8e\2\u0a13\u0a20\bY\1\2\u0a14\u0a15\7\4\2\2\u0a15\u0a16\7"+
		"\u00f4\2\2\u0a16\u0a1c\bY\1\2\u0a17\u0a18\7\t\2\2\u0a18\u0a19\7\u00f4"+
		"\2\2\u0a19\u0a1b\bY\1\2\u0a1a\u0a17\3\2\2\2\u0a1b\u0a1e\3\2\2\2\u0a1c"+
		"\u0a1a\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a1f\3\2\2\2\u0a1e\u0a1c\3\2"+
		"\2\2\u0a1f\u0a21\7\6\2\2\u0a20\u0a14\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21"+
		"\u0a23\3\2\2\2\u0a22\u09f7\3\2\2\2\u0a22\u09fd\3\2\2\2\u0a22\u0a05\3\2"+
		"\2\2\u0a22\u0a12\3\2\2\2\u0a23\u00b1\3\2\2\2\u0a24\u0a25\5\u00b4[\2\u0a25"+
		"\u0a2c\bZ\1\2\u0a26\u0a27\7\t\2\2\u0a27\u0a28\5\u00b4[\2\u0a28\u0a29\b"+
		"Z\1\2\u0a29\u0a2b\3\2\2\2\u0a2a\u0a26\3\2\2\2\u0a2b\u0a2e\3\2\2\2\u0a2c"+
		"\u0a2a\3\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d\u00b3\3\2\2\2\u0a2e\u0a2c\3\2"+
		"\2\2\u0a2f\u0a30\5\u00c8e\2\u0a30\u0a31\5\u00b0Y\2\u0a31\u0a35\b[\1\2"+
		"\u0a32\u0a33\7s\2\2\u0a33\u0a34\7\u00f0\2\2\u0a34\u0a36\b[\1\2\u0a35\u0a32"+
		"\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u00b5\3\2\2\2\u0a37\u0a38\5\u00b8]"+
		"\2\u0a38\u0a3f\b\\\1\2\u0a39\u0a3a\7\t\2\2\u0a3a\u0a3b\5\u00b8]\2\u0a3b"+
		"\u0a3c\b\\\1\2\u0a3c\u0a3e\3\2\2\2\u0a3d\u0a39\3\2\2\2\u0a3e\u0a41\3\2"+
		"\2\2\u0a3f\u0a3d\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u00b7\3\2\2\2\u0a41"+
		"\u0a3f\3\2\2\2\u0a42\u0a43\5\u00c8e\2\u0a43\u0a44\7\7\2\2\u0a44\u0a45"+
		"\5\u00b0Y\2\u0a45\u0a49\b]\1\2\u0a46\u0a47\7s\2\2\u0a47\u0a48\7\u00f0"+
		"\2\2\u0a48\u0a4a\b]\1\2\u0a49\u0a46\3\2\2\2\u0a49\u0a4a\3\2\2\2\u0a4a"+
		"\u00b9\3\2\2\2\u0a4b\u0a4c\7\61\2\2\u0a4c\u0a4d\5\u0092J\2\u0a4d\u0a4e"+
		"\7\62\2\2\u0a4e\u0a4f\5\u0092J\2\u0a4f\u0a50\b^\1\2\u0a50\u00bb\3\2\2"+
		"\2\u0a51\u0a52\7A\2\2\u0a52\u0a53\5\u00be`\2\u0a53\u0a5a\b_\1\2\u0a54"+
		"\u0a55\7\t\2\2\u0a55\u0a56\5\u00be`\2\u0a56\u0a57\b_\1\2\u0a57\u0a59\3"+
		"\2\2\2\u0a58\u0a54\3\2\2\2\u0a59\u0a5c\3\2\2\2\u0a5a\u0a58\3\2\2\2\u0a5a"+
		"\u0a5b\3\2\2\2\u0a5b\u00bd\3\2\2\2\u0a5c\u0a5a\3\2\2\2\u0a5d\u0a5e\5\u00c8"+
		"e\2\u0a5e\u0a5f\7\17\2\2\u0a5f\u0a60\5\u00c0a\2\u0a60\u0a61\b`\1\2\u0a61"+
		"\u00bf\3\2\2\2\u0a62\u0a63\5\u00c8e\2\u0a63\u0a64\ba\1\2\u0a64\u0a9d\3"+
		"\2\2\2\u0a65\u0a94\7\4\2\2\u0a66\u0a67\7\u009a\2\2\u0a67\u0a68\ba\1\2"+
		"\u0a68\u0a69\7\25\2\2\u0a69\u0a6a\5\u0092J\2\u0a6a\u0a71\ba\1\2\u0a6b"+
		"\u0a6c\7\t\2\2\u0a6c\u0a6d\5\u0092J\2\u0a6d\u0a6e\ba\1\2\u0a6e\u0a70\3"+
		"\2\2\2\u0a6f\u0a6b\3\2\2\2\u0a70\u0a73\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a71"+
		"\u0a72\3\2\2\2\u0a72\u0a95\3\2\2\2\u0a73\u0a71\3\2\2\2\u0a74\u0a75\t\26"+
		"\2\2\u0a75\u0a76\ba\1\2\u0a76\u0a77\7\25\2\2\u0a77\u0a78\5\u0092J\2\u0a78"+
		"\u0a7f\ba\1\2\u0a79\u0a7a\7\t\2\2\u0a7a\u0a7b\5\u0092J\2\u0a7b\u0a7c\b"+
		"a\1\2\u0a7c\u0a7e\3\2\2\2\u0a7d\u0a79\3\2\2\2\u0a7e\u0a81\3\2\2\2\u0a7f"+
		"\u0a7d\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a83\3\2\2\2\u0a81\u0a7f\3\2"+
		"\2\2\u0a82\u0a74\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u0a92\3\2\2\2\u0a84"+
		"\u0a85\t\27\2\2\u0a85\u0a86\ba\1\2\u0a86\u0a87\7\25\2\2\u0a87\u0a88\5"+
		"L\'\2\u0a88\u0a8f\ba\1\2\u0a89\u0a8a\7\t\2\2\u0a8a\u0a8b\5L\'\2\u0a8b"+
		"\u0a8c\ba\1\2\u0a8c\u0a8e\3\2\2\2\u0a8d\u0a89\3\2\2\2\u0a8e\u0a91\3\2"+
		"\2\2\u0a8f\u0a8d\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a93\3\2\2\2\u0a91"+
		"\u0a8f\3\2\2\2\u0a92\u0a84\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93\u0a95\3\2"+
		"\2\2\u0a94\u0a66\3\2\2\2\u0a94\u0a82\3\2\2\2\u0a95\u0a99\3\2\2\2\u0a96"+
		"\u0a97\5\u00c2b\2\u0a97\u0a98\ba\1\2\u0a98\u0a9a\3\2\2\2\u0a99\u0a96\3"+
		"\2\2\2\u0a99\u0a9a\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0a9d\7\6\2\2\u0a9c"+
		"\u0a62\3\2\2\2\u0a9c\u0a65\3\2\2\2\u0a9d\u00c1\3\2\2\2\u0a9e\u0a9f\7D"+
		"\2\2\u0a9f\u0aa0\5\u00c4c\2\u0aa0\u0aa1\bb\1\2\u0aa1\u0ab5\3\2\2\2\u0aa2"+
		"\u0aa3\7E\2\2\u0aa3\u0aa4\5\u00c4c\2\u0aa4\u0aa5\bb\1\2\u0aa5\u0ab5\3"+
		"\2\2\2\u0aa6\u0aa7\7D\2\2\u0aa7\u0aa8\7$\2\2\u0aa8\u0aa9\5\u00c4c\2\u0aa9"+
		"\u0aaa\7\37\2\2\u0aaa\u0aab\5\u00c4c\2\u0aab\u0aac\bb\1\2\u0aac\u0ab5"+
		"\3\2\2\2\u0aad\u0aae\7E\2\2\u0aae\u0aaf\7$\2\2\u0aaf\u0ab0\5\u00c4c\2"+
		"\u0ab0\u0ab1\7\37\2\2\u0ab1\u0ab2\5\u00c4c\2\u0ab2\u0ab3\bb\1\2\u0ab3"+
		"\u0ab5\3\2\2\2\u0ab4\u0a9e\3\2\2\2\u0ab4\u0aa2\3\2\2\2\u0ab4\u0aa6\3\2"+
		"\2\2\u0ab4\u0aad\3\2\2\2\u0ab5\u00c3\3\2\2\2\u0ab6\u0ab7\7F\2\2\u0ab7"+
		"\u0ab8\t\30\2\2\u0ab8\u0ac1\bc\1\2\u0ab9\u0aba\7I\2\2\u0aba\u0abb\7M\2"+
		"\2\u0abb\u0ac1\bc\1\2\u0abc\u0abd\5\u0092J\2\u0abd\u0abe\t\30\2\2\u0abe"+
		"\u0abf\bc\1\2\u0abf\u0ac1\3\2\2\2\u0ac0\u0ab6\3\2\2\2\u0ac0\u0ab9\3\2"+
		"\2\2\u0ac0\u0abc\3\2\2\2\u0ac1\u00c5\3\2\2\2\u0ac2\u0ac3\5\u00c8e\2\u0ac3"+
		"\u0aca\bd\1\2\u0ac4\u0ac5\7\13\2\2\u0ac5\u0ac6\5\u00c8e\2\u0ac6\u0ac7"+
		"\bd\1\2\u0ac7\u0ac9\3\2\2\2\u0ac8\u0ac4\3\2\2\2\u0ac9\u0acc\3\2\2\2\u0aca"+
		"\u0ac8\3\2\2\2\u0aca\u0acb\3\2\2\2\u0acb\u00c7\3\2\2\2\u0acc\u0aca\3\2"+
		"\2\2\u0acd\u0ace\5\u00caf\2\u0ace\u0acf\be\1\2\u0acf\u0ad3\3\2\2\2\u0ad0"+
		"\u0ad1\t\31\2\2\u0ad1\u0ad3\be\1\2\u0ad2\u0acd\3\2\2\2\u0ad2\u0ad0\3\2"+
		"\2\2\u0ad3\u00c9\3\2\2\2\u0ad4\u0ad5\7\u00f8\2\2\u0ad5\u0add\bf\1\2\u0ad6"+
		"\u0ad7\5\u00ccg\2\u0ad7\u0ad8\bf\1\2\u0ad8\u0add\3\2\2\2\u0ad9\u0ada\5"+
		"\u00d0i\2\u0ada\u0adb\bf\1\2\u0adb\u0add\3\2\2\2\u0adc\u0ad4\3\2\2\2\u0adc"+
		"\u0ad6\3\2\2\2\u0adc\u0ad9\3\2\2\2\u0add\u00cb\3\2\2\2\u0ade\u0adf\7\u00f9"+
		"\2\2\u0adf\u0ae0\bg\1\2\u0ae0\u00cd\3\2\2\2\u0ae1\u0ae2\7\u008b\2\2\u0ae2"+
		"\u0ae4\bh\1\2\u0ae3\u0ae1\3\2\2\2\u0ae3\u0ae4\3\2\2\2\u0ae4\u0ae5\3\2"+
		"\2\2\u0ae5\u0ae6\7\u00f5\2\2\u0ae6\u0b0c\bh\1\2\u0ae7\u0ae8\7\u008b\2"+
		"\2\u0ae8\u0aea\bh\1\2\u0ae9\u0ae7\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0aeb"+
		"\3\2\2\2\u0aeb\u0aec\7\u00f4\2\2\u0aec\u0b0c\bh\1\2\u0aed\u0aee\7\u008b"+
		"\2\2\u0aee\u0af0\bh\1\2\u0aef\u0aed\3\2\2\2\u0aef\u0af0\3\2\2\2\u0af0"+
		"\u0af1\3\2\2\2\u0af1\u0af2\7\u00f1\2\2\u0af2\u0b0c\bh\1\2\u0af3\u0af4"+
		"\7\u008b\2\2\u0af4\u0af6\bh\1\2\u0af5\u0af3\3\2\2\2\u0af5\u0af6\3\2\2"+
		"\2\u0af6\u0af7\3\2\2\2\u0af7\u0af8\7\u00f2\2\2\u0af8\u0b0c\bh\1\2\u0af9"+
		"\u0afa\7\u008b\2\2\u0afa\u0afc\bh\1\2\u0afb\u0af9\3\2\2\2\u0afb\u0afc"+
		"\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u0afe\7\u00f3\2\2\u0afe\u0b0c\bh\1"+
		"\2\u0aff\u0b00\7\u008b\2\2\u0b00\u0b02\bh\1\2\u0b01\u0aff\3\2\2\2\u0b01"+
		"\u0b02\3\2\2\2\u0b02\u0b03\3\2\2\2\u0b03\u0b04\7\u00f6\2\2\u0b04\u0b0c"+
		"\bh\1\2\u0b05\u0b06\7\u008b\2\2\u0b06\u0b08\bh\1\2\u0b07\u0b05\3\2\2\2"+
		"\u0b07\u0b08\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u0b0a\7\u00f7\2\2\u0b0a"+
		"\u0b0c\bh\1\2\u0b0b\u0ae3\3\2\2\2\u0b0b\u0ae9\3\2\2\2\u0b0b\u0aef\3\2"+
		"\2\2\u0b0b\u0af5\3\2\2\2\u0b0b\u0afb\3\2\2\2\u0b0b\u0b01\3\2\2\2\u0b0b"+
		"\u0b07\3\2\2\2\u0b0c\u00cf\3\2\2\2\u0b0d\u0b0e\t\32\2\2\u0b0e\u0b0f\b"+
		"i\1\2\u0b0f\u00d1\3\2\2\2\u0149\u00f4\u00f9\u00fc\u0101\u010e\u0112\u0119"+
		"\u0127\u0129\u012d\u0130\u0137\u0148\u014a\u014e\u0151\u0158\u015e\u0164"+
		"\u016c\u018c\u0194\u0198\u019d\u01a3\u01ab\u01b1\u01be\u01c3\u01cc\u01d1"+
		"\u01e1\u01e8\u01ec\u01f4\u01fb\u0202\u0211\u0215\u021b\u0221\u0224\u0227"+
		"\u022d\u0231\u0235\u023a\u023e\u0246\u0249\u0252\u0257\u025d\u0264\u0267"+
		"\u026d\u0278\u027b\u027f\u0284\u0289\u0290\u0293\u0296\u029d\u02a2\u02a7"+
		"\u02aa\u02b3\u02bb\u02c1\u02c5\u02c9\u02cd\u02cf\u02d8\u02de\u02e3\u02e6"+
		"\u02ea\u02ed\u02f7\u02fa\u02fe\u0303\u0306\u030c\u0314\u0319\u031f\u0325"+
		"\u0330\u0338\u033f\u0347\u034a\u0352\u0356\u035d\u03d1\u03d9\u03e1\u03ea"+
		"\u03f6\u03fa\u03fd\u0403\u040d\u0419\u041e\u0427\u0437\u0439\u0440\u0447"+
		"\u044e\u0456\u045b\u0462\u0467\u046f\u0471\u0478\u0484\u048f\u049f\u04a9"+
		"\u04b5\u04bb\u04cf\u04d8\u04dd\u04e7\u04ec\u04f7\u0502\u0510\u051f\u0529"+
		"\u052f\u0536\u0540\u0542\u054e\u0551\u055d\u0560\u056c\u056f\u057b\u057e"+
		"\u0581\u0589\u058b\u058e\u059a\u05a1\u05af\u05b5\u05ba\u05c6\u05c9\u05cd"+
		"\u05d7\u05db\u05dd\u05e0\u05e4\u05e7\u05eb\u05f3\u05f9\u0600\u0608\u060d"+
		"\u060f\u0616\u061d\u0622\u0628\u062b\u062f\u0635\u063c\u0649\u064f\u065a"+
		"\u065c\u0661\u0664\u066c\u0675\u067a\u0682\u068a\u0696\u069e\u06a2\u06ae"+
		"\u06bd\u06c2\u06ca\u06cd\u06d1\u06df\u06e9\u06f3\u06f6\u06fc\u0706\u0709"+
		"\u070f\u0718\u0722\u072a\u072e\u0736\u073f\u0745\u074a\u074e\u075f\u0764"+
		"\u0769\u076e\u0780\u0782\u0785\u0794\u079d\u07a4\u07ac\u07b4\u07ba\u07c5"+
		"\u07d0\u07d7\u07df\u07eb\u07ee\u07f5\u07fc\u07fe\u0807\u0813\u0815\u081c"+
		"\u0823\u0829\u082f\u0831\u0837\u0840\u0849\u0851\u0853\u085d\u0871\u087d"+
		"\u087f\u0887\u088b\u0895\u08a2\u08a9\u08b3\u08bc\u08c3\u08ca\u08d4\u08f4"+
		"\u08f6\u0901\u0907\u0913\u0919\u092f\u0932\u093c\u0947\u0966\u0975\u097f"+
		"\u0982\u0989\u099e\u09ab\u09ad\u09c3\u09c5\u09d4\u09dc\u09e3\u09e7\u09ed"+
		"\u09f5\u0a0b\u0a10\u0a1c\u0a20\u0a22\u0a2c\u0a35\u0a3f\u0a49\u0a5a\u0a71"+
		"\u0a7f\u0a82\u0a8f\u0a92\u0a94\u0a99\u0a9c\u0ab4\u0ac0\u0aca\u0ad2\u0adc"+
		"\u0ae3\u0ae9\u0aef\u0af5\u0afb\u0b01\u0b07\u0b0b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}