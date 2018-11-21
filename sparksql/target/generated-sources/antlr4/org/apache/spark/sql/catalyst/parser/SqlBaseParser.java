// Generated from org\apache\spark\sql\catalyst\parser\SqlBase.g4 by ANTLR 4.3
package org.apache.spark.sql.catalyst.parser;


  import java.util.regex.Pattern;
  import java.util.*;
  import name.lsg.grammar.tree.*;
  import name.lsg.grammar.tree.join.*;
  import name.lsg.grammar.tree.relation.*;

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
			setState(208); statement();
			setState(209); match(EOF);
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
			setState(211); namedExpression();
			setState(212); match(EOF);
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
			setState(214); tableIdentifier();
			setState(215); match(EOF);
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
			setState(217); functionIdentifier();
			setState(218); match(EOF);
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
			setState(220); dataType();
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
			setState(223); colTypeList();
			setState(224); match(EOF);
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
			setState(834);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226); ((StatementDefaultContext)_localctx).query = query();
				 ((StatementDefaultContext)_localctx).value =  ((StatementDefaultContext)_localctx).query.value; 
				}
				break;

			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229); match(USE);
				setState(230); ((UseContext)_localctx).db = identifier();
				}
				break;

			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231); match(CREATE);
				setState(232); match(DATABASE);
				setState(236);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(233); match(IF);
					setState(234); match(NOT);
					setState(235); match(EXISTS);
					}
					break;
				}
				setState(238); identifier();
				setState(241);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(239); match(COMMENT);
					setState(240); ((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(244);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(243); locationSpec();
					}
				}

				setState(249);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(246); match(WITH);
					setState(247); match(DBPROPERTIES);
					setState(248); tablePropertyList();
					}
				}

				}
				break;

			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(251); match(ALTER);
				setState(252); match(DATABASE);
				setState(253); identifier();
				setState(254); match(SET);
				setState(255); match(DBPROPERTIES);
				setState(256); tablePropertyList();
				}
				break;

			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(258); match(DROP);
				setState(259); match(DATABASE);
				setState(262);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(260); match(IF);
					setState(261); match(EXISTS);
					}
					break;
				}
				setState(264); identifier();
				setState(266);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(265);
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
				setState(268); createTableHeader();
				setState(273);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(269); match(T__7);
					setState(270); colTypeList();
					setState(271); match(T__5);
					}
				}

				setState(275); tableProvider();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (OPTIONS - 181)) | (1L << (TBLPROPERTIES - 181)) | (1L << (LOCATION - 181)) | (1L << (CLUSTERED - 181)) | (1L << (PARTITIONED - 181)))) != 0)) {
					{
					setState(287);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(276); match(OPTIONS);
						setState(277); ((CreateTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(278); match(PARTITIONED);
						setState(279); match(BY);
						setState(280); ((CreateTableContext)_localctx).partitionColumnNames = identifierList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(281); bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(282); locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(283); match(COMMENT);
						setState(284); ((CreateTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(285); match(TBLPROPERTIES);
						setState(286); ((CreateTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (WITH - 76)) | (1L << (VALUES - 76)) | (1L << (TABLE - 76)) | (1L << (INSERT - 76)) | (1L << (MAP - 76)))) != 0) || _la==REDUCE) {
					{
					setState(293);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(292); match(AS);
						}
					}

					setState(295); query();
					}
				}

				}
				break;

			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(298); createTableHeader();
				setState(303);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(299); match(T__7);
					setState(300); ((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(301); match(T__5);
					}
					break;
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ROW || _la==COMMENT || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (TBLPROPERTIES - 183)) | (1L << (SKEWED - 183)) | (1L << (STORED - 183)) | (1L << (LOCATION - 183)) | (1L << (CLUSTERED - 183)) | (1L << (PARTITIONED - 183)))) != 0)) {
					{
					setState(320);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(305); match(COMMENT);
						setState(306); ((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(307); match(PARTITIONED);
						setState(308); match(BY);
						setState(309); match(T__7);
						setState(310); ((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
						setState(311); match(T__5);
						}
						}
						break;
					case CLUSTERED:
						{
						setState(313); bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(314); skewSpec();
						}
						break;
					case ROW:
						{
						setState(315); rowFormat();
						}
						break;
					case STORED:
						{
						setState(316); createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(317); locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(318); match(TBLPROPERTIES);
						setState(319); ((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (WITH - 76)) | (1L << (VALUES - 76)) | (1L << (TABLE - 76)) | (1L << (INSERT - 76)) | (1L << (MAP - 76)))) != 0) || _la==REDUCE) {
					{
					setState(326);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(325); match(AS);
						}
					}

					setState(328); query();
					}
				}

				}
				break;

			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(331); match(CREATE);
				setState(332); match(TABLE);
				setState(336);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(333); match(IF);
					setState(334); match(NOT);
					setState(335); match(EXISTS);
					}
					break;
				}
				setState(338); ((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(339); match(LIKE);
				setState(340); ((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(342);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(341); locationSpec();
					}
				}

				}
				break;

			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(344); match(ANALYZE);
				setState(345); match(TABLE);
				setState(346); tableIdentifier();
				setState(348);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(347); partitionSpec();
					}
				}

				setState(350); match(COMPUTE);
				setState(351); match(STATISTICS);
				setState(356);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(352); identifier();
					}
					break;

				case 2:
					{
					setState(353); match(FOR);
					setState(354); match(COLUMNS);
					setState(355); identifierSeq();
					}
					break;
				}
				}
				break;

			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(358); match(ALTER);
				setState(359); match(TABLE);
				setState(360); tableIdentifier();
				setState(361); match(ADD);
				setState(362); match(COLUMNS);
				setState(363); match(T__7);
				setState(364); ((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(365); match(T__5);
				}
				break;

			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(367); match(ALTER);
				setState(368);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(369); ((RenameTableContext)_localctx).from = tableIdentifier();
				setState(370); match(RENAME);
				setState(371); match(TO);
				setState(372); ((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;

			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(374); match(ALTER);
				setState(375);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(376); tableIdentifier();
				setState(377); match(SET);
				setState(378); match(TBLPROPERTIES);
				setState(379); tablePropertyList();
				}
				break;

			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(381); match(ALTER);
				setState(382);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(383); tableIdentifier();
				setState(384); match(UNSET);
				setState(385); match(TBLPROPERTIES);
				setState(388);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(386); match(IF);
					setState(387); match(EXISTS);
					}
				}

				setState(390); tablePropertyList();
				}
				break;

			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(392); match(ALTER);
				setState(393); match(TABLE);
				setState(394); tableIdentifier();
				setState(396);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(395); partitionSpec();
					}
				}

				setState(398); match(CHANGE);
				setState(400);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(399); match(COLUMN);
					}
					break;
				}
				setState(402); identifier();
				setState(403); colType();
				setState(405);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(404); colPosition();
					}
				}

				}
				break;

			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(407); match(ALTER);
				setState(408); match(TABLE);
				setState(409); tableIdentifier();
				setState(411);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(410); partitionSpec();
					}
				}

				setState(413); match(SET);
				setState(414); match(SERDE);
				setState(415); match(STRING);
				setState(419);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(416); match(WITH);
					setState(417); match(SERDEPROPERTIES);
					setState(418); tablePropertyList();
					}
				}

				}
				break;

			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(421); match(ALTER);
				setState(422); match(TABLE);
				setState(423); tableIdentifier();
				setState(425);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(424); partitionSpec();
					}
				}

				setState(427); match(SET);
				setState(428); match(SERDEPROPERTIES);
				setState(429); tablePropertyList();
				}
				break;

			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(431); match(ALTER);
				setState(432); match(TABLE);
				setState(433); tableIdentifier();
				setState(434); match(ADD);
				setState(438);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(435); match(IF);
					setState(436); match(NOT);
					setState(437); match(EXISTS);
					}
				}

				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(440); partitionSpecLocation();
					}
					}
					setState(443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;

			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(445); match(ALTER);
				setState(446); match(VIEW);
				setState(447); tableIdentifier();
				setState(448); match(ADD);
				setState(452);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(449); match(IF);
					setState(450); match(NOT);
					setState(451); match(EXISTS);
					}
				}

				setState(455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(454); partitionSpec();
					}
					}
					setState(457); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;

			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(459); match(ALTER);
				setState(460); match(TABLE);
				setState(461); tableIdentifier();
				setState(462); ((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(463); match(RENAME);
				setState(464); match(TO);
				setState(465); ((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;

			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(467); match(ALTER);
				setState(468); match(TABLE);
				setState(469); tableIdentifier();
				setState(470); match(DROP);
				setState(473);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(471); match(IF);
					setState(472); match(EXISTS);
					}
				}

				setState(475); partitionSpec();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(476); match(T__2);
					setState(477); partitionSpec();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(484);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(483); match(PURGE);
					}
				}

				}
				break;

			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(486); match(ALTER);
				setState(487); match(VIEW);
				setState(488); tableIdentifier();
				setState(489); match(DROP);
				setState(492);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(490); match(IF);
					setState(491); match(EXISTS);
					}
				}

				setState(494); partitionSpec();
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(495); match(T__2);
					setState(496); partitionSpec();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(502); match(ALTER);
				setState(503); match(TABLE);
				setState(504); tableIdentifier();
				setState(506);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(505); partitionSpec();
					}
				}

				setState(508); match(SET);
				setState(509); locationSpec();
				}
				break;

			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(511); match(ALTER);
				setState(512); match(TABLE);
				setState(513); tableIdentifier();
				setState(514); match(RECOVER);
				setState(515); match(PARTITIONS);
				}
				break;

			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(517); match(DROP);
				setState(518); match(TABLE);
				setState(521);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(519); match(IF);
					setState(520); match(EXISTS);
					}
					break;
				}
				setState(523); tableIdentifier();
				setState(525);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(524); match(PURGE);
					}
				}

				}
				break;

			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(527); match(DROP);
				setState(528); match(VIEW);
				setState(531);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(529); match(IF);
					setState(530); match(EXISTS);
					}
					break;
				}
				setState(533); tableIdentifier();
				}
				break;

			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(534); match(CREATE);
				setState(537);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(535); match(OR);
					setState(536); match(REPLACE);
					}
				}

				setState(543);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(540);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(539); match(GLOBAL);
						}
					}

					setState(542); match(TEMPORARY);
					}
				}

				setState(545); match(VIEW);
				setState(549);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(546); match(IF);
					setState(547); match(NOT);
					setState(548); match(EXISTS);
					}
					break;
				}
				setState(551); tableIdentifier();
				setState(553);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(552); identifierCommentList();
					}
				}

				setState(557);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(555); match(COMMENT);
					setState(556); match(STRING);
					}
				}

				setState(562);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(559); match(PARTITIONED);
					setState(560); match(ON);
					setState(561); identifierList();
					}
				}

				setState(566);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(564); match(TBLPROPERTIES);
					setState(565); tablePropertyList();
					}
				}

				setState(568); match(AS);
				setState(569); query();
				}
				break;

			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(571); match(CREATE);
				setState(574);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(572); match(OR);
					setState(573); match(REPLACE);
					}
				}

				setState(577);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(576); match(GLOBAL);
					}
				}

				setState(579); match(TEMPORARY);
				setState(580); match(VIEW);
				setState(581); tableIdentifier();
				setState(586);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(582); match(T__7);
					setState(583); colTypeList();
					setState(584); match(T__5);
					}
				}

				setState(588); tableProvider();
				setState(591);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(589); match(OPTIONS);
					setState(590); tablePropertyList();
					}
				}

				}
				break;

			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(593); match(ALTER);
				setState(594); match(VIEW);
				setState(595); tableIdentifier();
				setState(597);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(596); match(AS);
					}
				}

				setState(599); query();
				}
				break;

			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(601); match(CREATE);
				setState(604);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(602); match(OR);
					setState(603); match(REPLACE);
					}
				}

				setState(607);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(606); match(TEMPORARY);
					}
				}

				setState(609); match(FUNCTION);
				setState(613);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(610); match(IF);
					setState(611); match(NOT);
					setState(612); match(EXISTS);
					}
					break;
				}
				setState(615); qualifiedName();
				setState(616); match(AS);
				setState(617); ((CreateFunctionContext)_localctx).className = match(STRING);
				setState(627);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(618); match(USING);
					setState(619); resource();
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(620); match(T__2);
						setState(621); resource();
						}
						}
						setState(626);
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
				setState(629); match(DROP);
				setState(631);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(630); match(TEMPORARY);
					}
				}

				setState(633); match(FUNCTION);
				setState(636);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(634); match(IF);
					setState(635); match(EXISTS);
					}
					break;
				}
				setState(638); qualifiedName();
				}
				break;

			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(639); match(EXPLAIN);
				setState(641);
				_la = _input.LA(1);
				if (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (LOGICAL - 89)) | (1L << (CODEGEN - 89)) | (1L << (COST - 89)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(640);
					_la = _input.LA(1);
					if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (LOGICAL - 89)) | (1L << (CODEGEN - 89)) | (1L << (COST - 89)))) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(643); statement();
				}
				break;

			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(644); match(SHOW);
				setState(645); match(TABLES);
				setState(648);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(646);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(647); ((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(654);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(651);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(650); match(LIKE);
						}
					}

					setState(653); ((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;

			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(656); match(SHOW);
				setState(657); match(TABLE);
				setState(658); match(EXTENDED);
				setState(661);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(659);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(660); ((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(663); match(LIKE);
				setState(664); ((ShowTableContext)_localctx).pattern = match(STRING);
				setState(666);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(665); partitionSpec();
					}
				}

				}
				break;

			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(668); match(SHOW);
				setState(669); match(DATABASES);
				setState(674);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(671);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(670); match(LIKE);
						}
					}

					setState(673); ((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;

			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(676); match(SHOW);
				setState(677); match(TBLPROPERTIES);
				setState(678); ((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(683);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(679); match(T__7);
					setState(680); ((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(681); match(T__5);
					}
				}

				}
				break;

			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(685); match(SHOW);
				setState(686); match(COLUMNS);
				setState(687);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(688); tableIdentifier();
				setState(691);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(689);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(690); ((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;

			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(693); match(SHOW);
				setState(694); match(PARTITIONS);
				setState(695); tableIdentifier();
				setState(697);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(696); partitionSpec();
					}
				}

				}
				break;

			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(699); match(SHOW);
				setState(701);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(700); identifier();
					}
					break;
				}
				setState(703); match(FUNCTIONS);
				setState(711);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (STRING - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
					{
					setState(705);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(704); match(LIKE);
						}
						break;
					}
					setState(709);
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
						setState(707); qualifiedName();
						}
						break;
					case STRING:
						{
						setState(708); ((ShowFunctionsContext)_localctx).pattern = match(STRING);
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
				setState(713); match(SHOW);
				setState(714); match(CREATE);
				setState(715); match(TABLE);
				setState(716); tableIdentifier();
				}
				break;

			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(717);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(718); match(FUNCTION);
				setState(720);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(719); match(EXTENDED);
					}
					break;
				}
				setState(722); describeFuncName();
				}
				break;

			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(723);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(724); match(DATABASE);
				setState(726);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(725); match(EXTENDED);
					}
					break;
				}
				setState(728); identifier();
				}
				break;

			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(729);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(731);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(730); match(TABLE);
					}
					break;
				}
				setState(734);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(733);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(736); tableIdentifier();
				setState(738);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(737); partitionSpec();
					}
					break;
				}
				setState(741);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
					{
					setState(740); describeColName();
					}
				}

				}
				break;

			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(743); match(REFRESH);
				setState(744); match(TABLE);
				setState(745); tableIdentifier();
				}
				break;

			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(746); match(REFRESH);
				setState(754);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(747); match(STRING);
					}
					break;

				case 2:
					{
					setState(751);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(748);
							matchWildcard();
							}
							} 
						}
						setState(753);
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
				setState(756); match(CACHE);
				setState(758);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(757); match(LAZY);
					}
				}

				setState(760); match(TABLE);
				setState(761); tableIdentifier();
				setState(766);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (WITH - 76)) | (1L << (VALUES - 76)) | (1L << (TABLE - 76)) | (1L << (INSERT - 76)) | (1L << (MAP - 76)))) != 0) || _la==REDUCE) {
					{
					setState(763);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(762); match(AS);
						}
					}

					setState(765); query();
					}
				}

				}
				break;

			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(768); match(UNCACHE);
				setState(769); match(TABLE);
				setState(772);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(770); match(IF);
					setState(771); match(EXISTS);
					}
					break;
				}
				setState(774); tableIdentifier();
				}
				break;

			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(775); match(CLEAR);
				setState(776); match(CACHE);
				}
				break;

			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(777); match(LOAD);
				setState(778); match(DATA);
				setState(780);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(779); match(LOCAL);
					}
				}

				setState(782); match(INPATH);
				setState(783); ((LoadDataContext)_localctx).path = match(STRING);
				setState(785);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(784); match(OVERWRITE);
					}
				}

				setState(787); match(INTO);
				setState(788); match(TABLE);
				setState(789); tableIdentifier();
				setState(791);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(790); partitionSpec();
					}
				}

				}
				break;

			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(793); match(TRUNCATE);
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

			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(799); match(MSCK);
				setState(800); match(REPAIR);
				setState(801); match(TABLE);
				setState(802); tableIdentifier();
				}
				break;

			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(803);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(804); identifier();
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(805);
						matchWildcard();
						}
						} 
					}
					setState(810);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
				break;

			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(811); match(SET);
				setState(812); match(ROLE);
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(813);
						matchWildcard();
						}
						} 
					}
					setState(818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;

			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(819); match(SET);
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(820);
						matchWildcard();
						}
						} 
					}
					setState(825);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;

			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(826); match(RESET);
				}
				break;

			case 55:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(827); unsupportedHiveNativeCommands();
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(828);
						matchWildcard();
						}
						} 
					}
					setState(833);
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
			setState(1006);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(836); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(837); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(839); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(840); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(842);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(841); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(844); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(846);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(845); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(848); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(849); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(850); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(851); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(853);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(852); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(855); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(856); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(857); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(858); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(859); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(860); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(861); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(862); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(863); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(864); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(865); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(866); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(867); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(868); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(869); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(870); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(871); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(872); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(873); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(874); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(875); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(876); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(877); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(878); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(879); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(880); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(881); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(882); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(883); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(884); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(885); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(886); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(887); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(888); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(889); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(890); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(891); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(892); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(893); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(894); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(895); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(896); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;

			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(897); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(898); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(899); tableIdentifier();
				setState(900); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(901); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;

			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(903); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(904); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(905); tableIdentifier();
				setState(906); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(907); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;

			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(909); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(910); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(911); tableIdentifier();
				setState(912); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(913); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;

			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(915); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(916); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(917); tableIdentifier();
				setState(918); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(919); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;

			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(921); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(922); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(923); tableIdentifier();
				setState(924); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(925); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;

			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(927); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(928); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(929); tableIdentifier();
				setState(930); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(931); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(932); ((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(933); ((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;

			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(935); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(936); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(937); tableIdentifier();
				setState(938); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(939); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(940); ((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;

			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(942); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(943); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(944); tableIdentifier();
				setState(945); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(946); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;

			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(948); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(949); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(950); tableIdentifier();
				setState(951); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(952); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;

			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(954); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(955); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(956); tableIdentifier();
				setState(957); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(958); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;

			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(960); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(961); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(962); tableIdentifier();
				setState(963); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;

			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(965); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(966); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(967); tableIdentifier();
				setState(969);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(968); partitionSpec();
					}
				}

				setState(971); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;

			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(973); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(974); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(975); tableIdentifier();
				setState(977);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(976); partitionSpec();
					}
				}

				setState(979); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;

			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(981); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(982); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(983); tableIdentifier();
				setState(985);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(984); partitionSpec();
					}
				}

				setState(987); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(988); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;

			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(990); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(991); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(992); tableIdentifier();
				setState(994);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(993); partitionSpec();
					}
				}

				setState(996); ((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(997); ((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;

			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(999); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1000); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;

			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1001); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;

			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1002); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;

			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1003); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;

			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1004); ((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1005); ((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
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
			setState(1008); match(CREATE);
			setState(1010);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1009); match(TEMPORARY);
				}
			}

			setState(1013);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1012); match(EXTERNAL);
				}
			}

			setState(1015); match(TABLE);
			setState(1019);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1016); match(IF);
				setState(1017); match(NOT);
				setState(1018); match(EXISTS);
				}
				break;
			}
			setState(1021); tableIdentifier();
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
			setState(1023); match(CLUSTERED);
			setState(1024); match(BY);
			setState(1025); identifierList();
			setState(1029);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1026); match(SORTED);
				setState(1027); match(BY);
				setState(1028); orderedIdentifierList();
				}
			}

			setState(1031); match(INTO);
			setState(1032); match(INTEGER_VALUE);
			setState(1033); match(BUCKETS);
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
			setState(1035); match(SKEWED);
			setState(1036); match(BY);
			setState(1037); identifierList();
			setState(1038); match(ON);
			setState(1041);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1039); constantList();
				}
				break;

			case 2:
				{
				setState(1040); nestedConstantList();
				}
				break;
			}
			setState(1046);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1043); match(STORED);
				setState(1044); match(AS);
				setState(1045); match(DIRECTORIES);
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
			setState(1048); match(LOCATION);
			setState(1049); match(STRING);
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
			setState(1054);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1051); ((QueryContext)_localctx).ctes = ctes();
				_localctx.value.setWith(((QueryContext)_localctx).ctes.value);
				}
			}

			setState(1056); ((QueryContext)_localctx).queryNoWith = queryNoWith();
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
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
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
		public TablePropertyListContext options;
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
			setState(1107);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1059); match(INSERT);
				setState(1060); match(OVERWRITE);
				setState(1061); match(TABLE);
				setState(1062); tableIdentifier();
				setState(1069);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1063); partitionSpec();
					setState(1067);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1064); match(IF);
						setState(1065); match(NOT);
						setState(1066); match(EXISTS);
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
				setState(1071); match(INSERT);
				setState(1072); match(INTO);
				setState(1074);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1073); match(TABLE);
					}
					break;
				}
				setState(1076); tableIdentifier();
				setState(1078);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1077); partitionSpec();
					}
				}

				}
				break;

			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1080); match(INSERT);
				setState(1081); match(OVERWRITE);
				setState(1083);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1082); match(LOCAL);
					}
				}

				setState(1085); match(DIRECTORY);
				setState(1086); ((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1088);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1087); rowFormat();
					}
				}

				setState(1091);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1090); createFileFormat();
					}
				}

				}
				break;

			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1093); match(INSERT);
				setState(1094); match(OVERWRITE);
				setState(1096);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1095); match(LOCAL);
					}
				}

				setState(1098); match(DIRECTORY);
				setState(1100);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1099); ((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1102); tableProvider();
				setState(1105);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1103); match(OPTIONS);
					setState(1104); ((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
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
			setState(1109); partitionSpec();
			setState(1111);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1110); locationSpec();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113); match(PARTITION);
			setState(1114); match(T__7);
			setState(1115); partitionVal();
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1116); match(T__2);
				setState(1117); partitionVal();
				}
				}
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1123); match(T__5);
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
			setState(1125); identifier();
			setState(1128);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1126); match(EQ);
				setState(1127); constant();
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
			setState(1135);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130); qualifiedName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131); match(STRING);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132); comparisonOperator();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1133); arithmeticOperator();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1134); predicateOperator();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137); ((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1138); match(T__0);
				setState(1139); ((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1144);
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
			setState(1145); match(WITH);
			setState(1146); ((CtesContext)_localctx).namedQuery = namedQuery();
			 _localctx.value.addNamedQuery(((CtesContext)_localctx).namedQuery.value);
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1148); match(T__2);
				setState(1149); ((CtesContext)_localctx).namedQuery = namedQuery();
				 _localctx.value.addNamedQuery(((CtesContext)_localctx).namedQuery.value);
				}
				}
				setState(1156);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157); ((NamedQueryContext)_localctx).name = identifier();
			setState(1159);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1158); match(AS);
				}
			}

			setState(1161); match(T__7);
			setState(1162); ((NamedQueryContext)_localctx).query = query();
			setState(1163); match(T__5);
			 ((NamedQueryContext)_localctx).value =  new NamedQuery(((NamedQueryContext)_localctx).name.value,((NamedQueryContext)_localctx).query.value); 
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
			setState(1166); match(USING);
			setState(1167); qualifiedName();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169); match(T__7);
			setState(1170); tableProperty();
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1171); match(T__2);
				setState(1172); tableProperty();
				}
				}
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1178); match(T__5);
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
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
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
			setState(1180); ((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1185);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & ((1L << (STRING - 238)) | (1L << (INTEGER_VALUE - 238)) | (1L << (DECIMAL_VALUE - 238)))) != 0)) {
				{
				setState(1182);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1181); match(EQ);
					}
				}

				setState(1184); ((TablePropertyContext)_localctx).value = tablePropertyValue();
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
		int _la;
		try {
			setState(1196);
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
				setState(1187); identifier();
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(1188); match(T__0);
					setState(1189); identifier();
					}
					}
					setState(1194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195); match(STRING);
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
			setState(1202);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198); match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199); match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1200); booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1201); match(STRING);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204); match(T__7);
			setState(1205); constant();
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1206); match(T__2);
				setState(1207); constant();
				}
				}
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1213); match(T__5);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215); match(T__7);
			setState(1216); constantList();
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1217); match(T__2);
				setState(1218); constantList();
				}
				}
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1224); match(T__5);
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
			setState(1232);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226); match(STORED);
				setState(1227); match(AS);
				setState(1228); fileFormat();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229); match(STORED);
				setState(1230); match(BY);
				setState(1231); storageHandler();
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
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
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
			setState(1239);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1234); match(INPUTFORMAT);
				setState(1235); ((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1236); match(OUTPUTFORMAT);
				setState(1237); ((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;

			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1238); identifier();
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
			setState(1241); match(STRING);
			setState(1245);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1242); match(WITH);
				setState(1243); match(SERDEPROPERTIES);
				setState(1244); tablePropertyList();
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
			setState(1247); identifier();
			setState(1248); match(STRING);
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
			setState(1263);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1250); insertInto();
					}
				}

				setState(1253); ((SingleInsertQueryContext)_localctx).t = queryTerm(0);
				setState(1254); ((SingleInsertQueryContext)_localctx).o = queryOrganization();
				 ((SingleInsertQueryContext)_localctx).value =  new SingleInsertQuery(((SingleInsertQueryContext)_localctx).t.value,((SingleInsertQueryContext)_localctx).o.value);
				}
				break;

			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1257); fromClause();
				setState(1259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1258); multiInsertQueryBody();
					}
					}
					setState(1261); 
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
			setState(1278);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1265); match(ORDER);
				setState(1266); match(BY);
				setState(1267); ((QueryOrganizationContext)_localctx).order = sortItem();
				 _localctx.value.addOrderItem(((QueryOrganizationContext)_localctx).order.value);
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1269); match(T__2);
					setState(1270); ((QueryOrganizationContext)_localctx).order = sortItem();
					 _localctx.value.addOrderItem(((QueryOrganizationContext)_localctx).order.value);
					}
					}
					setState(1277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1293);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1280); match(CLUSTER);
				setState(1281); match(BY);
				setState(1282); ((QueryOrganizationContext)_localctx).clusterBy = expression();
				 _localctx.value.addClusterItem(((QueryOrganizationContext)_localctx).clusterBy.value);
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1284); match(T__2);
					setState(1285); ((QueryOrganizationContext)_localctx).clusterBy = expression();
					 _localctx.value.addClusterItem(((QueryOrganizationContext)_localctx).clusterBy.value);
					}
					}
					setState(1292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1308);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1295); match(DISTRIBUTE);
				setState(1296); match(BY);
				setState(1297); ((QueryOrganizationContext)_localctx).distributeBy = expression();
				 _localctx.value.addDistributeItem(((QueryOrganizationContext)_localctx).distributeBy.value);
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1299); match(T__2);
					setState(1300); ((QueryOrganizationContext)_localctx).distributeBy = expression();
					 _localctx.value.addDistributeItem(((QueryOrganizationContext)_localctx).distributeBy.value);
					}
					}
					setState(1307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1323);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1310); match(SORT);
				setState(1311); match(BY);
				setState(1312); ((QueryOrganizationContext)_localctx).sort = sortItem();
				 _localctx.value.addSortItem(((QueryOrganizationContext)_localctx).sort.value);
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1314); match(T__2);
					setState(1315); ((QueryOrganizationContext)_localctx).sort = sortItem();
					 _localctx.value.addSortItem(((QueryOrganizationContext)_localctx).sort.value);
					}
					}
					setState(1322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1326);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1325); windows();
				}
			}

			setState(1336);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1328); match(LIMIT);
				setState(1334);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1329); match(ALL);
					_localctx.value.setLimit(new Limit());
					}
					break;

				case 2:
					{
					setState(1331); ((QueryOrganizationContext)_localctx).limit = expression();
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
			setState(1339);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1338); insertInto();
				}
			}

			setState(1341); querySpecification();
			setState(1342); queryOrganization();
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

			setState(1345); ((QueryTermDefaultContext)_localctx).q = queryPrimary();
			((QueryTermDefaultContext)_localctx).value =  ((QueryTermDefaultContext)_localctx).q.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(1358);
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
					setState(1348);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1349);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (UNION - 101)) | (1L << (EXCEPT - 101)) | (1L << (SETMINUS - 101)) | (1L << (INTERSECT - 101)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(1351);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1350); ((SetOperationContext)_localctx).qf = setQuantifier();
						}
					}

					setState(1353); ((SetOperationContext)_localctx).right = queryTerm(2);
					 ((SetOperationContext)_localctx).value =  new JOIN(((SetOperationContext)_localctx).left.value,(((SetOperationContext)_localctx).operator!=null?((SetOperationContext)_localctx).operator.getText():null),((SetOperationContext)_localctx).right.value,((SetOperationContext)_localctx).qf.value);
					}
					} 
				}
				setState(1360);
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
			setState(1372);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1361); ((QueryPrimaryDefaultContext)_localctx).q = querySpecification();
				 ((QueryPrimaryDefaultContext)_localctx).value =  new QueryPrimary(((QueryPrimaryDefaultContext)_localctx).q.value);
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1364); match(TABLE);
				setState(1365); tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1366); inlineTable();
				}
				break;
			case T__7:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1367); match(T__7);
				setState(1368); ((SubqueryContext)_localctx).q = queryNoWith();
				setState(1369); match(T__5);
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
			setState(1374); ((SortItemContext)_localctx).e = expression();
			 ((SortItemContext)_localctx).value =  new SortItem(((SortItemContext)_localctx).e.value);
			setState(1378);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1376);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				consume();
				 _localctx.value.setOrdering((((SortItemContext)_localctx).ordering!=null?((SortItemContext)_localctx).ordering.getText():null));
				}
			}

			setState(1383);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1380); match(NULLS);
				setState(1381);
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
			setState(1500);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1395);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1385); match(SELECT);
					setState(1386); ((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1387); match(T__7);
					setState(1388); namedExpressionSeq();
					setState(1389); match(T__5);
					}
					break;
				case MAP:
					{
					setState(1391); ((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1392); namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1393); ((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1394); namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1398);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1397); ((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1402);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1400); match(RECORDWRITER);
					setState(1401); ((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1404); match(USING);
				setState(1405); ((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1418);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1406); match(AS);
					setState(1416);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(1407); identifierSeq();
						}
						break;

					case 2:
						{
						setState(1408); colTypeList();
						}
						break;

					case 3:
						{
						{
						setState(1409); match(T__7);
						setState(1412);
						switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
						case 1:
							{
							setState(1410); identifierSeq();
							}
							break;

						case 2:
							{
							setState(1411); colTypeList();
							}
							break;
						}
						setState(1414); match(T__5);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1421);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1420); ((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1425);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1423); match(RECORDREADER);
					setState(1424); ((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1428);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1427); fromClause();
					}
					break;
				}
				setState(1432);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1430); match(WHERE);
					setState(1431); ((QuerySpecificationContext)_localctx).where = booleanExpression(0);
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
				setState(1468);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1434); ((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(1435); ((QuerySpecificationContext)_localctx).hint = ((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						 _localctx.value.addHint(((QuerySpecificationContext)_localctx).hint.value);
						}
						}
						setState(1442);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1446);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1443); ((QuerySpecificationContext)_localctx).q = setQuantifier();
						_localctx.value.setQuantifier(((QuerySpecificationContext)_localctx).q.value); 
						}
						break;
					}
					setState(1448); ((QuerySpecificationContext)_localctx).nes = namedExpressionSeq();
					 _localctx.value.setNamedExpressionSeq(((QuerySpecificationContext)_localctx).nes.value); 
					setState(1453);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						setState(1450); ((QuerySpecificationContext)_localctx).fc = fromClause();
						 _localctx.value.setFromClause(((QuerySpecificationContext)_localctx).fc.value); 
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1455); ((QuerySpecificationContext)_localctx).fc = fromClause();
					 _localctx.value.setFromClause(((QuerySpecificationContext)_localctx).fc.value);
					setState(1466);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(1457); ((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1461);
						switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
						case 1:
							{
							setState(1458); ((QuerySpecificationContext)_localctx).q = setQuantifier();
							_localctx.value.setQuantifier(((QuerySpecificationContext)_localctx).q.value); 
							}
							break;
						}
						setState(1463); ((QuerySpecificationContext)_localctx).nes = namedExpressionSeq();
						 _localctx.value.setNamedExpressionSeq(((QuerySpecificationContext)_localctx).nes.value); 
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1470); ((QuerySpecificationContext)_localctx).lv = lateralView();
						_localctx.value.addLiteralView(((QuerySpecificationContext)_localctx).lv.value);
						}
						} 
					}
					setState(1477);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
				setState(1482);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1478); match(WHERE);
					setState(1479); ((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					 _localctx.value.setWhere( new Where(((QuerySpecificationContext)_localctx).where.value));
					}
					break;
				}
				setState(1487);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1484); ((QuerySpecificationContext)_localctx).a = aggregation();
					_localctx.value.setAggregation(((QuerySpecificationContext)_localctx).a.value);
					}
					break;
				}
				setState(1493);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1489); match(HAVING);
					setState(1490); ((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					 _localctx.value.setHaving(new Having(((QuerySpecificationContext)_localctx).having.value));
					}
					break;
				}
				setState(1496);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1495); windows();
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
			setState(1502); match(T__6);
			setState(1503); ((HintContext)_localctx).hintStatement = ((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			 _localctx.value.addStatement(((HintContext)_localctx).hintStatement.value);
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (STRING - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
				{
				{
				setState(1506);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1505); match(T__2);
					}
				}

				setState(1508); ((HintContext)_localctx).hintStatement = ((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				 _localctx.value.addStatement(((HintContext)_localctx).hintStatement.value);
				}
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1516); match(T__8);
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
			setState(1532);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518); ((HintStatementContext)_localctx).hintName = identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519); ((HintStatementContext)_localctx).hintName = identifier();
				setState(1520); match(T__7);
				setState(1521); ((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1522); match(T__2);
					setState(1523); ((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1529); match(T__5);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1531); hintExpression(0);
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
			setState(1535); hintPredicated();
			}
			_ctx.stop = _input.LT(-1);
			setState(1545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1543);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						_localctx = new HintExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_hintExpression);
						setState(1537);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1538); ((HintExpressionContext)_localctx).operator = match(AND);
						setState(1539); ((HintExpressionContext)_localctx).right = hintExpression(3);
						}
						break;

					case 2:
						{
						_localctx = new HintExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_hintExpression);
						setState(1540);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1541); ((HintExpressionContext)_localctx).operator = match(OR);
						setState(1542); ((HintExpressionContext)_localctx).right = hintExpression(2);
						}
						break;
					}
					} 
				}
				setState(1547);
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
			setState(1548); ((HintPredicatedContext)_localctx).v = hintValueExpression(0);
			setState(1550);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1549); hintPredicate();
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
			setState(1575);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1553);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1552); match(NOT);
					}
				}

				setState(1555); ((HintPredicateContext)_localctx).kind = match(BETWEEN);
				setState(1556); ((HintPredicateContext)_localctx).lower = hintValueExpression(0);
				setState(1557); match(AND);
				setState(1558); ((HintPredicateContext)_localctx).upper = hintValueExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1560); match(NOT);
					}
				}

				setState(1563); ((HintPredicateContext)_localctx).kind = match(IN);
				setState(1564); match(T__7);
				setState(1565); ((HintPredicateContext)_localctx).e = expression();
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1566); match(T__2);
					setState(1567); ((HintPredicateContext)_localctx).e = expression();
					}
					}
					setState(1572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1573); match(T__5);
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
			setState(1583);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(1578); match(STRING);
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
				setState(1579); identifier();
				setState(1580); match(T__0);
				setState(1581); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1591);
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
					setState(1585);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1586); ((HintValueExpressionContext)_localctx).op = comparisonOperator();
					setState(1587); ((HintValueExpressionContext)_localctx).right = hintValueExpression(2);
					}
					} 
				}
				setState(1593);
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
			setState(1594); match(FROM);
			setState(1595); ((FromClauseContext)_localctx).r = relation();
			_localctx.value.addRelation(((FromClauseContext)_localctx).r.value);
			setState(1603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1597); match(T__2);
					setState(1598); ((FromClauseContext)_localctx).r = relation();
					_localctx.value.addRelation(((FromClauseContext)_localctx).r.value);
					}
					} 
				}
				setState(1605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1606); ((FromClauseContext)_localctx).l = lateralView();
					 _localctx.value.addLateralView(((FromClauseContext)_localctx).l.value);
					}
					} 
				}
				setState(1613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			setState(1615);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1614); pivotClause();
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
			setState(1617); match(GROUP);
			setState(1618); match(BY);
			setState(1619); ((AggregationContext)_localctx).ge = expression();
			 _localctx.value.addGroupingExpression(((AggregationContext)_localctx).ge.value);
			setState(1627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1621); match(T__2);
					setState(1622); ((AggregationContext)_localctx).ge = expression();
					 _localctx.value.addGroupingExpression(((AggregationContext)_localctx).ge.value);
					}
					} 
				}
				setState(1629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			}
			setState(1647);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1630); match(WITH);
				setState(1631); ((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;

			case 2:
				{
				setState(1632); match(WITH);
				setState(1633); ((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;

			case 3:
				{
				setState(1634); ((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1635); match(SETS);
				setState(1636); match(T__7);
				setState(1637); groupingSet();
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1638); match(T__2);
					setState(1639); groupingSet();
					}
					}
					setState(1644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1645); match(T__5);
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
			setState(1662);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1649); match(T__7);
				setState(1658);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
					{
					setState(1650); expression();
					setState(1655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1651); match(T__2);
						setState(1652); expression();
						}
						}
						setState(1657);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1660); match(T__5);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1661); expression();
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
			setState(1664); match(PIVOT);
			setState(1665); match(T__7);
			setState(1666); ((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1667); match(FOR);
			setState(1668); ((PivotClauseContext)_localctx).pivotColumn = identifier();
			setState(1669); match(IN);
			setState(1670); match(T__7);
			setState(1671); ((PivotClauseContext)_localctx).constant = constant();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).constant);
			setState(1676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1672); match(T__2);
				setState(1673); ((PivotClauseContext)_localctx).constant = constant();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).constant);
				}
				}
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1679); match(T__5);
			setState(1680); match(T__5);
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
			setState(1682); match(LATERAL);
			setState(1683); match(VIEW);
			setState(1686);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1684); match(OUTER);
				 _localctx.value.setOuter(true);
				}
				break;
			}
			setState(1688); ((LateralViewContext)_localctx).fn = qualifiedName();
			 _localctx.value.setFunctionName(((LateralViewContext)_localctx).fn.value);
			setState(1690); match(T__7);
			setState(1699);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
				{
				setState(1691); expression();
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1692); match(T__2);
					setState(1693); expression();
					}
					}
					setState(1698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1701); match(T__5);
			setState(1702); ((LateralViewContext)_localctx).tblName = identifier();
			 _localctx.value.setTableName(((LateralViewContext)_localctx).tblName.value);
			setState(1718);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1705);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1704); match(AS);
					}
					break;
				}
				setState(1707); ((LateralViewContext)_localctx).colName = identifier();
				 _localctx.value.addAsColumn(((LateralViewContext)_localctx).colName.value);
				setState(1715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1709); match(T__2);
						setState(1710); ((LateralViewContext)_localctx).colName = identifier();
						 _localctx.value.addAsColumn(((LateralViewContext)_localctx).colName.value);
						}
						} 
					}
					setState(1717);
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
			setState(1724);
			switch (_input.LA(1)) {
			case DISTINCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720); match(DISTINCT);
				 ((SetQuantifierContext)_localctx).value =  new DISTINCT();
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1722); match(ALL);
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
			setState(1726); ((RelationContext)_localctx).rp = relationPrimary();
			  ((RelationContext)_localctx).value =  new Relation(((RelationContext)_localctx).rp.value);
			setState(1733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1728); ((RelationContext)_localctx).r = joinRelation();
					 _localctx.value.addRelation(((RelationContext)_localctx).r.value);
					}
					} 
				}
				setState(1735);
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
			setState(1751);
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
				setState(1736); ((JoinRelationContext)_localctx).jt = joinType();
				setState(1737); match(JOIN);
				setState(1738); ((JoinRelationContext)_localctx).right = relationPrimary();
				 ((JoinRelationContext)_localctx).value =  new JOINRelation(((JoinRelationContext)_localctx).jt.value, ((JoinRelationContext)_localctx).right.value); JOINRelation jr = (JOINRelation)_localctx.value;
				setState(1743);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1740); ((JoinRelationContext)_localctx).jc = joinCriteria();
					 jr.setJoinCriteria(((JoinRelationContext)_localctx).jc.value);
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1745); match(NATURAL);
				setState(1746); ((JoinRelationContext)_localctx).joinType = joinType();
				setState(1747); match(JOIN);
				setState(1748); ((JoinRelationContext)_localctx).right = relationPrimary();
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
		int _la;
		try {
			setState(1787);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1754);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1753); match(INNER);
					}
				}

				 ((JoinTypeContext)_localctx).value =  new InnerJOIN();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1757); match(CROSS);
				 ((JoinTypeContext)_localctx).value =  new CrossJOIN();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1759); match(LEFT);
				 ((JoinTypeContext)_localctx).value =  new LeftJOIN();
				setState(1763);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1761); match(OUTER);
					 _localctx.value.markAsOuter();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1765); match(LEFT);
				setState(1766); match(SEMI);
				 ((JoinTypeContext)_localctx).value =  new LeftSemiJOIN();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1768); match(RIGHT);
				 ((JoinTypeContext)_localctx).value =  new RightJOIN();
				setState(1772);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1770); match(OUTER);
					 _localctx.value.markAsOuter();
					}
				}

				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1774); match(FULL);
				 ((JoinTypeContext)_localctx).value =  new FullJOIN();
				setState(1778);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1776); match(OUTER);
					 _localctx.value.markAsOuter();
					}
				}

				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				 ((JoinTypeContext)_localctx).value =  new JOINType();
				setState(1783);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1781); match(LEFT);
					 _localctx.value.markAsLeft();
					}
				}

				setState(1785); match(ANTI);
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
			setState(1809);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1789); match(ON);
				setState(1790); ((JoinCriteriaContext)_localctx).b = booleanExpression(0);
				 ((JoinCriteriaContext)_localctx).value =  new ON(((JoinCriteriaContext)_localctx).b.value);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793); match(USING);
				  ((JoinCriteriaContext)_localctx).value =  new USING(); 
				setState(1795); match(T__7);
				setState(1796); ((JoinCriteriaContext)_localctx).i = identifier();
				 USING u = (USING)_localctx.value; u.addIdentifier(((JoinCriteriaContext)_localctx).i.value);
				setState(1804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1798); match(T__2);
					setState(1799); ((JoinCriteriaContext)_localctx).i = identifier();
					  u.addIdentifier(((JoinCriteriaContext)_localctx).i.value);
					}
					}
					setState(1806);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1807); match(T__5);
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
			setState(1811); match(TABLESAMPLE);
			setState(1812); match(T__7);
			setState(1814);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
				{
				setState(1813); sampleMethod();
				}
			}

			setState(1816); match(T__5);
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
			setState(1842);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1819);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1818); ((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1821);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(1822); match(PERCENTLIT);
				}
				break;

			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1823); expression();
				setState(1824); match(ROWS);
				}
				break;

			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1826); ((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1827); ((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1828); match(OUT);
				setState(1829); match(OF);
				setState(1830); ((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1839);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1831); match(ON);
					setState(1837);
					switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
					case 1:
						{
						setState(1832); identifier();
						}
						break;

					case 2:
						{
						setState(1833); qualifiedName();
						setState(1834); match(T__7);
						setState(1835); match(T__5);
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
				setState(1841); ((SampleByBytesContext)_localctx).bytes = expression();
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
			setState(1844); match(T__7);
			setState(1845); ((IdentifierListContext)_localctx).is = identifierSeq();
			setState(1846); match(T__5);
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
			setState(1849); ((IdentifierSeqContext)_localctx).id = identifier();
			 _localctx.value.add(((IdentifierSeqContext)_localctx).id.value);
			setState(1857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1851); match(T__2);
					setState(1852); identifier();
					 _localctx.value.add(((IdentifierSeqContext)_localctx).id.value);
					}
					} 
				}
				setState(1859);
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
			setState(1860); match(T__7);
			setState(1861); orderedIdentifier();
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1862); match(T__2);
				setState(1863); orderedIdentifier();
				}
				}
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1869); match(T__5);
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
			setState(1871); identifier();
			setState(1873);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1872);
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
			setState(1875); match(T__7);
			setState(1876); identifierComment();
			setState(1881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1877); match(T__2);
				setState(1878); identifierComment();
				}
				}
				setState(1883);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1884); match(T__5);
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
			setState(1886); identifier();
			setState(1889);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1887); match(COMMENT);
				setState(1888); match(STRING);
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
			setState(1924);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1891); ((TableNameContext)_localctx).i = tableIdentifier();
				setState(1895);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1892); ((TableNameContext)_localctx).sample = sample();
					_localctx.value.setSample(((TableNameContext)_localctx).sample.value);
					}
					break;
				}
				setState(1897); ((TableNameContext)_localctx).a = tableAlias();
				  ((TableNameContext)_localctx).value =  new TableName(((TableNameContext)_localctx).i.value,_localctx.value.getSample(),((TableNameContext)_localctx).a.value);
				}
				break;

			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1900); match(T__7);
				setState(1901); ((AliasedQueryContext)_localctx).q = queryNoWith();
				setState(1902); match(T__5);
				setState(1906);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1903); ((AliasedQueryContext)_localctx).sample = sample();
					_localctx.value.setSample(((AliasedQueryContext)_localctx).sample.value);
					}
					break;
				}
				setState(1908); ((AliasedQueryContext)_localctx).a = tableAlias();
				 ((AliasedQueryContext)_localctx).value =  new AliasedQuery(((AliasedQueryContext)_localctx).q.value,_localctx.value.getSample(),((AliasedQueryContext)_localctx).a.value);
				}
				break;

			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1911); match(T__7);
				setState(1912); ((AliasedRelationContext)_localctx).r = relation();
				setState(1913); match(T__5);
				setState(1917);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1914); ((AliasedRelationContext)_localctx).sample = sample();
					_localctx.value.setSample(((AliasedRelationContext)_localctx).sample.value);
					}
					break;
				}
				setState(1919); ((AliasedRelationContext)_localctx).a = tableAlias();
				 ((AliasedRelationContext)_localctx).value =  new AliasedRelation(((AliasedRelationContext)_localctx).r.value,_localctx.value.getSample(),((AliasedRelationContext)_localctx).a.value);
				}
				break;

			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1922); inlineTable();
				}
				break;

			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1923); functionTable();
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
			setState(1926); match(VALUES);
			setState(1927); expression();
			setState(1932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1928); match(T__2);
					setState(1929); expression();
					}
					} 
				}
				setState(1934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			setState(1935); tableAlias();
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
			setState(1937); identifier();
			setState(1938); match(T__7);
			setState(1947);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
				{
				setState(1939); expression();
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1940); match(T__2);
					setState(1941); expression();
					}
					}
					setState(1946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1949); match(T__5);
			setState(1950); tableAlias();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1953);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1952); match(AS);
					}
					break;
				}
				setState(1955); ((TableAliasContext)_localctx).s = strictIdentifier();
				 ((TableAliasContext)_localctx).value =  new TableAlias(((TableAliasContext)_localctx).s.value);
				setState(1960);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1957); ((TableAliasContext)_localctx).l = identifierList();
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
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
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
			setState(2013);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1964); match(ROW);
				setState(1965); match(FORMAT);
				setState(1966); match(SERDE);
				setState(1967); ((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1971);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1968); match(WITH);
					setState(1969); match(SERDEPROPERTIES);
					setState(1970); ((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1973); match(ROW);
				setState(1974); match(FORMAT);
				setState(1975); match(DELIMITED);
				setState(1985);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1976); match(FIELDS);
					setState(1977); match(TERMINATED);
					setState(1978); match(BY);
					setState(1979); ((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1983);
					switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
					case 1:
						{
						setState(1980); match(ESCAPED);
						setState(1981); match(BY);
						setState(1982); ((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1992);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1987); match(COLLECTION);
					setState(1988); match(ITEMS);
					setState(1989); match(TERMINATED);
					setState(1990); match(BY);
					setState(1991); ((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1999);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1994); match(MAP);
					setState(1995); match(KEYS);
					setState(1996); match(TERMINATED);
					setState(1997); match(BY);
					setState(1998); ((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2005);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2001); match(LINES);
					setState(2002); match(TERMINATED);
					setState(2003); match(BY);
					setState(2004); ((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2011);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2007); match(NULL);
					setState(2008); match(DEFINED);
					setState(2009); match(AS);
					setState(2010); ((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
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
			setState(2019);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2015); ((TableIdentifierContext)_localctx).db = identifier();
				setState(2016); match(T__0);
				 _localctx.value.addIdentifier(((TableIdentifierContext)_localctx).db.value);
				}
				break;
			}
			setState(2021); ((TableIdentifierContext)_localctx).table = identifier();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2024); ((FunctionIdentifierContext)_localctx).db = identifier();
				setState(2025); match(T__0);
				}
				break;
			}
			setState(2029); ((FunctionIdentifierContext)_localctx).function = identifier();
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
			setState(2031); ((NamedExpressionContext)_localctx).e = expression();
			 ((NamedExpressionContext)_localctx).value =  new NamedExpr(((NamedExpressionContext)_localctx).e.value);
			setState(2044);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2034);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2033); match(AS);
					}
					break;
				}
				setState(2042);
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
					setState(2036); ((NamedExpressionContext)_localctx).id = identifier();
					_localctx.value.addAS(((NamedExpressionContext)_localctx).id.value);
					}
					break;
				case T__7:
					{
					setState(2039); ((NamedExpressionContext)_localctx).il = identifierList();
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
			setState(2046); ((NamedExpressionSeqContext)_localctx).ne = namedExpression();
			 _localctx.value.add(((NamedExpressionSeqContext)_localctx).ne.value);
			setState(2054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2048); match(T__2);
					setState(2049); ((NamedExpressionSeqContext)_localctx).ne = namedExpression();
					 _localctx.value.add(((NamedExpressionSeqContext)_localctx).ne.value);
					}
					} 
				}
				setState(2056);
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
			setState(2057); ((ExpressionContext)_localctx).b = booleanExpression(0);
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
			setState(2073);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2061); match(NOT);
				setState(2062); ((LogicalNotContext)_localctx).b = booleanExpression(5);
				 ((LogicalNotContext)_localctx).value =  new NOT(((LogicalNotContext)_localctx).b.value);
				}
				break;

			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2065); match(EXISTS);
				setState(2066); match(T__7);
				setState(2067); query();
				setState(2068); match(T__5);
				}
				break;

			case 3:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2070); ((BooleanDefaultContext)_localctx).predicated = predicated();
				 ((BooleanDefaultContext)_localctx).value =  ((BooleanDefaultContext)_localctx).predicated.value;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2085);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2075);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2076); ((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2077); ((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						 ((LogicalBinaryContext)_localctx).value =  new AND(((LogicalBinaryContext)_localctx).left.value, ((LogicalBinaryContext)_localctx).right.value);
						}
						break;

					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2080);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2081); ((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2082); ((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						 ((LogicalBinaryContext)_localctx).value =  new OR(((LogicalBinaryContext)_localctx).left.value, ((LogicalBinaryContext)_localctx).right.value);
						}
						break;
					}
					} 
				}
				setState(2089);
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
			setState(2090); ((PredicatedContext)_localctx).v = valueExpression(0);
			 ((PredicatedContext)_localctx).value =  new Predicated(((PredicatedContext)_localctx).v.value);
			setState(2095);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2092); ((PredicatedContext)_localctx).predicate = predicate();
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
		int _la;
		try {
			setState(2162);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2099);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2097); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2101); ((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2102); ((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2103); match(AND);
				setState(2104); ((PredicateContext)_localctx).upper = valueExpression(0);
				 ((PredicateContext)_localctx).value =  new Between( _localctx.value.isNot(),((PredicateContext)_localctx).lower.value,((PredicateContext)_localctx).upper.value );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2107); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2111); ((PredicateContext)_localctx).kind = match(IN);
				 ((PredicateContext)_localctx).value =  new InList(_localctx.value.isNot());
				setState(2113); match(T__7);
				setState(2114); ((PredicateContext)_localctx).e = expression();
				 {InList in = (InList)_localctx.value; in.addExpr(((PredicateContext)_localctx).e.value);} 
				setState(2122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2116); match(T__2);
					setState(2117); ((PredicateContext)_localctx).e = expression();
					 {InList in = (InList)_localctx.value; in.addExpr(((PredicateContext)_localctx).e.value);} 
					}
					}
					setState(2124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2125); match(T__5);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2129);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2127); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2131); ((PredicateContext)_localctx).kind = match(IN);
				setState(2132); match(T__7);
				setState(2133); ((PredicateContext)_localctx).query = query();
				setState(2134); match(T__5);
				 ((PredicateContext)_localctx).value =  new InQuery(_localctx.value.isNot(), ((PredicateContext)_localctx).query.value);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2139);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2137); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2141);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(2142); ((PredicateContext)_localctx).pattern = valueExpression(0);
				 ((PredicateContext)_localctx).value =  new Like(_localctx.value.isNot(), (((PredicateContext)_localctx).kind!=null?((PredicateContext)_localctx).kind.getText():null), ((PredicateContext)_localctx).pattern.value);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2145); match(IS);
				setState(2148);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2146); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2150); ((PredicateContext)_localctx).kind = match(NULL);
				 ((PredicateContext)_localctx).value =  new IsNULL(_localctx.value.isNot());
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2152); match(IS);
				setState(2155);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2153); match(NOT);
					 _localctx.value.setNot(true);
					}
				}

				setState(2157); ((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2158); match(FROM);
				setState(2159); ((PredicateContext)_localctx).right = valueExpression(0);
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
			setState(2172);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2165);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (TILDE - 136)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(2166); ((ArithmeticUnaryContext)_localctx).ve = valueExpression(7);
				 ((ArithmeticUnaryContext)_localctx).value =  new ArithmeticUnary((((ArithmeticUnaryContext)_localctx).operator!=null?((ArithmeticUnaryContext)_localctx).operator.getText():null), ((ArithmeticUnaryContext)_localctx).ve.value);
				}
				break;

			case 2:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2169); ((ValueExpressionDefaultContext)_localctx).pe = primaryExpression(0);
				 ((ValueExpressionDefaultContext)_localctx).value =  ((ValueExpressionDefaultContext)_localctx).pe.value;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2204);
					switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2174);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2175);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ASTERISK - 138)) | (1L << (SLASH - 138)) | (1L << (PERCENT - 138)) | (1L << (DIV - 138)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(2176); ((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2179);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2180);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (CONCAT_PIPE - 136)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(2181); ((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2184);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2185); ((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2186); ((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2189);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2190); ((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2191); ((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2194);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2195); ((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2196); ((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						 ((ArithmeticBinaryContext)_localctx).value =  new ArithmeticBinary(((ArithmeticBinaryContext)_localctx).left.value,(((ArithmeticBinaryContext)_localctx).operator!=null?((ArithmeticBinaryContext)_localctx).operator.getText():null),((ArithmeticBinaryContext)_localctx).right.value); 
						}
						break;

					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2199);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2200); ((ComparisonContext)_localctx).op = comparisonOperator();
						setState(2201); ((ComparisonContext)_localctx).right = valueExpression(2);
						 ((ComparisonContext)_localctx).value =  new ArithmeticBinary(((ComparisonContext)_localctx).left.value,((ComparisonContext)_localctx).op.text,((ComparisonContext)_localctx).right.value); 
						}
						break;
					}
					} 
				}
				setState(2208);
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
			setState(2347);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2210); match(CASE);
				setState(2212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2211); whenClause();
					}
					}
					setState(2214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2218);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2216); match(ELSE);
					setState(2217); ((SearchedCaseContext)_localctx).elseExpression = ((SearchedCaseContext)_localctx).expression = expression();
					}
				}

				setState(2220); match(END);
				}
				break;

			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2222); match(CASE);
				setState(2223); ((SimpleCaseContext)_localctx).expr = ((SimpleCaseContext)_localctx).expression = expression();
				setState(2225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2224); whenClause();
					}
					}
					setState(2227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2231);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2229); match(ELSE);
					setState(2230); ((SimpleCaseContext)_localctx).elseExpression = ((SimpleCaseContext)_localctx).expression = expression();
					}
				}

				setState(2233); match(END);
				}
				break;

			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2235); match(CAST);
				setState(2236); match(T__7);
				setState(2237); ((CastContext)_localctx).expr = ((CastContext)_localctx).expression = expression();
				setState(2238); match(AS);
				setState(2239); ((CastContext)_localctx).dataType = dataType();
				setState(2240); match(T__5);
				 ((CastContext)_localctx).value =  new CAST(((CastContext)_localctx).expr.value,((CastContext)_localctx).dataType.value);  
				}
				break;

			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2243); match(STRUCT);
				setState(2244); match(T__7);
				setState(2253);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
					{
					setState(2245); ((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2246); match(T__2);
						setState(2247); ((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2252);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2255); match(T__5);
				}
				break;

			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2256); match(FIRST);
				setState(2257); match(T__7);
				setState(2258); ((FirstContext)_localctx).expression = expression();
				setState(2261);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2259); match(IGNORE);
					setState(2260); match(NULLS);
					}
				}

				setState(2263); match(T__5);
				}
				break;

			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2265); match(LAST);
				setState(2266); match(T__7);
				setState(2267); ((LastContext)_localctx).expression = expression();
				setState(2270);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2268); match(IGNORE);
					setState(2269); match(NULLS);
					}
				}

				setState(2272); match(T__5);
				}
				break;

			case 7:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2274); match(POSITION);
				setState(2275); match(T__7);
				setState(2276); ((PositionContext)_localctx).substr = valueExpression(0);
				setState(2277); match(IN);
				setState(2278); ((PositionContext)_localctx).str = valueExpression(0);
				setState(2279); match(T__5);
				}
				break;

			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2281); ((ConstantDefaultContext)_localctx).constant = constant();
				((ConstantDefaultContext)_localctx).value =  ((ConstantDefaultContext)_localctx).constant.value;
				}
				break;

			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2284); match(ASTERISK);
				 ((StarContext)_localctx).value =  new Star();
				}
				break;

			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2286); ((StarContext)_localctx).qualifiedName = qualifiedName();
				setState(2287); match(T__0);
				setState(2288); match(ASTERISK);
				 ((StarContext)_localctx).value =  new Star(((StarContext)_localctx).qualifiedName.value);
				}
				break;

			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2291); match(T__7);
				setState(2292); namedExpression();
				setState(2295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2293); match(T__2);
					setState(2294); namedExpression();
					}
					}
					setState(2297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2299); match(T__5);
				}
				break;

			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2301); match(T__7);
				setState(2302); query();
				setState(2303); match(T__5);
				}
				break;

			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2305); ((FunctionCallContext)_localctx).qualifiedName = qualifiedName();
				 AST quantifier = null; ((FunctionCallContext)_localctx).value =  new FunctionCall(((FunctionCallContext)_localctx).qualifiedName.value); FunctionCall fc = (FunctionCall)_localctx.value;
				setState(2307); match(T__7);
				setState(2324);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (PERCENTLIT - 136)) | (1L << (BUCKET - 136)) | (1L << (OUT - 136)) | (1L << (OF - 136)) | (1L << (SORT - 136)) | (1L << (CLUSTER - 136)) | (1L << (DISTRIBUTE - 136)) | (1L << (OVERWRITE - 136)) | (1L << (TRANSFORM - 136)) | (1L << (REDUCE - 136)) | (1L << (SERDE - 136)) | (1L << (SERDEPROPERTIES - 136)) | (1L << (RECORDREADER - 136)) | (1L << (RECORDWRITER - 136)) | (1L << (DELIMITED - 136)) | (1L << (FIELDS - 136)) | (1L << (TERMINATED - 136)) | (1L << (COLLECTION - 136)) | (1L << (ITEMS - 136)) | (1L << (KEYS - 136)) | (1L << (ESCAPED - 136)) | (1L << (LINES - 136)) | (1L << (SEPARATED - 136)) | (1L << (FUNCTION - 136)) | (1L << (EXTENDED - 136)) | (1L << (REFRESH - 136)) | (1L << (CLEAR - 136)) | (1L << (CACHE - 136)) | (1L << (UNCACHE - 136)) | (1L << (LAZY - 136)) | (1L << (FORMATTED - 136)) | (1L << (GLOBAL - 136)) | (1L << (TEMPORARY - 136)) | (1L << (OPTIONS - 136)) | (1L << (UNSET - 136)) | (1L << (TBLPROPERTIES - 136)) | (1L << (DBPROPERTIES - 136)) | (1L << (BUCKETS - 136)) | (1L << (SKEWED - 136)) | (1L << (STORED - 136)) | (1L << (DIRECTORIES - 136)) | (1L << (LOCATION - 136)) | (1L << (EXCHANGE - 136)) | (1L << (ARCHIVE - 136)) | (1L << (UNARCHIVE - 136)) | (1L << (FILEFORMAT - 136)) | (1L << (TOUCH - 136)) | (1L << (COMPACT - 136)) | (1L << (CONCATENATE - 136)) | (1L << (CHANGE - 136)) | (1L << (CASCADE - 136)) | (1L << (RESTRICT - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (CLUSTERED - 200)) | (1L << (SORTED - 200)) | (1L << (PURGE - 200)) | (1L << (INPUTFORMAT - 200)) | (1L << (OUTPUTFORMAT - 200)) | (1L << (DATABASE - 200)) | (1L << (DATABASES - 200)) | (1L << (DFS - 200)) | (1L << (TRUNCATE - 200)) | (1L << (ANALYZE - 200)) | (1L << (COMPUTE - 200)) | (1L << (LIST - 200)) | (1L << (STATISTICS - 200)) | (1L << (PARTITIONED - 200)) | (1L << (EXTERNAL - 200)) | (1L << (DEFINED - 200)) | (1L << (REVOKE - 200)) | (1L << (GRANT - 200)) | (1L << (LOCK - 200)) | (1L << (UNLOCK - 200)) | (1L << (MSCK - 200)) | (1L << (REPAIR - 200)) | (1L << (RECOVER - 200)) | (1L << (EXPORT - 200)) | (1L << (IMPORT - 200)) | (1L << (LOAD - 200)) | (1L << (ROLE - 200)) | (1L << (ROLES - 200)) | (1L << (COMPACTIONS - 200)) | (1L << (PRINCIPALS - 200)) | (1L << (TRANSACTIONS - 200)) | (1L << (INDEX - 200)) | (1L << (INDEXES - 200)) | (1L << (LOCKS - 200)) | (1L << (OPTION - 200)) | (1L << (ANTI - 200)) | (1L << (LOCAL - 200)) | (1L << (INPATH - 200)) | (1L << (STRING - 200)) | (1L << (BIGINT_LITERAL - 200)) | (1L << (SMALLINT_LITERAL - 200)) | (1L << (TINYINT_LITERAL - 200)) | (1L << (INTEGER_VALUE - 200)) | (1L << (DECIMAL_VALUE - 200)) | (1L << (DOUBLE_LITERAL - 200)) | (1L << (BIGDECIMAL_LITERAL - 200)) | (1L << (IDENTIFIER - 200)) | (1L << (BACKQUOTED_IDENTIFIER - 200)))) != 0)) {
					{
					setState(2311);
					switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
					case 1:
						{
						setState(2308); ((FunctionCallContext)_localctx).sq = setQuantifier();
						 quantifier = ((FunctionCallContext)_localctx).sq.value; 
						}
						break;
					}
					setState(2313); ((FunctionCallContext)_localctx).expression = expression();
					 fc.addArgument(new Argument(quantifier,((FunctionCallContext)_localctx).expression.value));
					setState(2321);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2315); match(T__2);
						setState(2316); ((FunctionCallContext)_localctx).expression = expression();
						 fc.addArgument(new Argument(((FunctionCallContext)_localctx).expression.value));
						}
						}
						setState(2323);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2326); match(T__5);
				setState(2329);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2327); match(OVER);
					setState(2328); windowSpec();
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
				setState(2331); ((FunctionCallContext)_localctx).qualifiedName = qualifiedName();
				setState(2332); match(T__7);
				setState(2333);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (BOTH - 123)) | (1L << (LEADING - 123)) | (1L << (TRAILING - 123)))) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(2334); ((FunctionCallContext)_localctx).expression = ((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2335); match(FROM);
				setState(2336); ((FunctionCallContext)_localctx).expression = ((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2337); match(T__5);
				}
				break;

			case 15:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2339); ((ColumnReferenceContext)_localctx).identifier = identifier();
				 ((ColumnReferenceContext)_localctx).value =  ((ColumnReferenceContext)_localctx).identifier.value;
				}
				break;

			case 16:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2342); match(T__7);
				setState(2343); ((ParenthesizedExpressionContext)_localctx).expression = expression();
				setState(2344); match(T__5);
				 ((ParenthesizedExpressionContext)_localctx).value =  ((ParenthesizedExpressionContext)_localctx).expression.value;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2359);
					switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2349);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2350); match(T__3);
						setState(2351); ((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2352); match(T__1);
						}
						break;

					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2354);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2355); match(T__0);
						setState(2356); ((DereferenceContext)_localctx).fieldName = ((DereferenceContext)_localctx).identifier = identifier();
						 ((DereferenceContext)_localctx).value =  new Dereference(((DereferenceContext)_localctx).base.value,((DereferenceContext)_localctx).fieldName.value);
						}
						break;
					}
					} 
				}
				setState(2363);
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
			setState(2382);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2364); match(NULL);
				 ((NullLiteralContext)_localctx).value =  new NULL();
				}
				break;

			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2366); interval();
				}
				break;

			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2367); identifier();
				setState(2368); match(STRING);
				}
				break;

			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2370); ((NumericLiteralContext)_localctx).number = number();
				 ((NumericLiteralContext)_localctx).value =  ((NumericLiteralContext)_localctx).number.value;
				}
				break;

			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2373); ((BooleanLiteralContext)_localctx).booleanValue = booleanValue();
				 ((BooleanLiteralContext)_localctx).value =  ((BooleanLiteralContext)_localctx).booleanValue.value;
				}
				break;

			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2378); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2376); ((StringLiteralContext)_localctx).s = match(STRING);
						 ((StringLiteralContext)_localctx).value =  new StringLiteral((((StringLiteralContext)_localctx).s!=null?((StringLiteralContext)_localctx).s.getText():null));
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2380); 
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
			setState(2384);
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
			setState(2387);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PLUS - 136)) | (1L << (MINUS - 136)) | (1L << (ASTERISK - 136)) | (1L << (SLASH - 136)) | (1L << (PERCENT - 136)) | (1L << (DIV - 136)) | (1L << (TILDE - 136)) | (1L << (AMPERSAND - 136)) | (1L << (PIPE - 136)) | (1L << (CONCAT_PIPE - 136)) | (1L << (HAT - 136)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			setState(2389);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			setState(2395);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2391); match(TRUE);
				 ((BooleanValueContext)_localctx).value =  new BoolValue(true);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2393); match(FALSE);
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
			setState(2397); match(INTERVAL);
			setState(2403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2398); ((IntervalContext)_localctx).intervalField = intervalField();
					 _localctx.value.addIntervalField(((IntervalContext)_localctx).intervalField.value);
					}
					} 
				}
				setState(2405);
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
			setState(2406); ((IntervalFieldContext)_localctx).iv = intervalValue();
			setState(2407); ((IntervalFieldContext)_localctx).unit = identifier();
			setState(2410);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2408); match(TO);
				setState(2409); ((IntervalFieldContext)_localctx).to = identifier();
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
		int _la;
		try {
			setState(2417);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2412);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(2415);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2416); match(STRING);
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
			setState(2422);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2419); match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2420); match(AFTER);
				setState(2421); identifier();
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
			setState(2463);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2424); ((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2425); match(LT);
				setState(2426); ((ComplexDataTypeContext)_localctx).dataType = dataType();
				setState(2427); match(GT);
				 ((ComplexDataTypeContext)_localctx).value =  new ARRAY(_localctx.value);  
				}
				break;

			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2430); ((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2431); match(LT);
				setState(2432); ((ComplexDataTypeContext)_localctx).k = dataType();
				setState(2433); match(T__2);
				setState(2434); ((ComplexDataTypeContext)_localctx).v = dataType();
				setState(2435); match(GT);
				 ((ComplexDataTypeContext)_localctx).value =  new MAP(((ComplexDataTypeContext)_localctx).k.value, ((ComplexDataTypeContext)_localctx).v.value);
				}
				break;

			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2438); ((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2445);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2439); match(LT);
					setState(2441);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL) | (1L << WINDOW))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DIV - 141)) | (1L << (PERCENTLIT - 141)) | (1L << (BUCKET - 141)) | (1L << (OUT - 141)) | (1L << (OF - 141)) | (1L << (SORT - 141)) | (1L << (CLUSTER - 141)) | (1L << (DISTRIBUTE - 141)) | (1L << (OVERWRITE - 141)) | (1L << (TRANSFORM - 141)) | (1L << (REDUCE - 141)) | (1L << (SERDE - 141)) | (1L << (SERDEPROPERTIES - 141)) | (1L << (RECORDREADER - 141)) | (1L << (RECORDWRITER - 141)) | (1L << (DELIMITED - 141)) | (1L << (FIELDS - 141)) | (1L << (TERMINATED - 141)) | (1L << (COLLECTION - 141)) | (1L << (ITEMS - 141)) | (1L << (KEYS - 141)) | (1L << (ESCAPED - 141)) | (1L << (LINES - 141)) | (1L << (SEPARATED - 141)) | (1L << (FUNCTION - 141)) | (1L << (EXTENDED - 141)) | (1L << (REFRESH - 141)) | (1L << (CLEAR - 141)) | (1L << (CACHE - 141)) | (1L << (UNCACHE - 141)) | (1L << (LAZY - 141)) | (1L << (FORMATTED - 141)) | (1L << (GLOBAL - 141)) | (1L << (TEMPORARY - 141)) | (1L << (OPTIONS - 141)) | (1L << (UNSET - 141)) | (1L << (TBLPROPERTIES - 141)) | (1L << (DBPROPERTIES - 141)) | (1L << (BUCKETS - 141)) | (1L << (SKEWED - 141)) | (1L << (STORED - 141)) | (1L << (DIRECTORIES - 141)) | (1L << (LOCATION - 141)) | (1L << (EXCHANGE - 141)) | (1L << (ARCHIVE - 141)) | (1L << (UNARCHIVE - 141)) | (1L << (FILEFORMAT - 141)) | (1L << (TOUCH - 141)) | (1L << (COMPACT - 141)) | (1L << (CONCATENATE - 141)) | (1L << (CHANGE - 141)) | (1L << (CASCADE - 141)) | (1L << (RESTRICT - 141)) | (1L << (CLUSTERED - 141)) | (1L << (SORTED - 141)) | (1L << (PURGE - 141)) | (1L << (INPUTFORMAT - 141)) | (1L << (OUTPUTFORMAT - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (DATABASE - 205)) | (1L << (DATABASES - 205)) | (1L << (DFS - 205)) | (1L << (TRUNCATE - 205)) | (1L << (ANALYZE - 205)) | (1L << (COMPUTE - 205)) | (1L << (LIST - 205)) | (1L << (STATISTICS - 205)) | (1L << (PARTITIONED - 205)) | (1L << (EXTERNAL - 205)) | (1L << (DEFINED - 205)) | (1L << (REVOKE - 205)) | (1L << (GRANT - 205)) | (1L << (LOCK - 205)) | (1L << (UNLOCK - 205)) | (1L << (MSCK - 205)) | (1L << (REPAIR - 205)) | (1L << (RECOVER - 205)) | (1L << (EXPORT - 205)) | (1L << (IMPORT - 205)) | (1L << (LOAD - 205)) | (1L << (ROLE - 205)) | (1L << (ROLES - 205)) | (1L << (COMPACTIONS - 205)) | (1L << (PRINCIPALS - 205)) | (1L << (TRANSACTIONS - 205)) | (1L << (INDEX - 205)) | (1L << (INDEXES - 205)) | (1L << (LOCKS - 205)) | (1L << (OPTION - 205)) | (1L << (ANTI - 205)) | (1L << (LOCAL - 205)) | (1L << (INPATH - 205)) | (1L << (IDENTIFIER - 205)) | (1L << (BACKQUOTED_IDENTIFIER - 205)))) != 0)) {
						{
						setState(2440); complexColTypeList();
						}
					}

					setState(2443); match(GT);
					}
					break;
				case NEQ:
					{
					setState(2444); match(NEQ);
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
				setState(2447); ((PrimitiveDataTypeContext)_localctx).i = identifier();
				 PrimitiveDataType pdt = new PrimitiveDataType(((PrimitiveDataTypeContext)_localctx).i.value); ((PrimitiveDataTypeContext)_localctx).value =  pdt; 
				setState(2461);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2449); match(T__7);
					setState(2450); ((PrimitiveDataTypeContext)_localctx).v = match(INTEGER_VALUE);
					 pdt.addValue(new IntegerValue((((PrimitiveDataTypeContext)_localctx).v!=null?((PrimitiveDataTypeContext)_localctx).v.getText():null)));  
					setState(2457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2452); match(T__2);
						setState(2453); ((PrimitiveDataTypeContext)_localctx).v = match(INTEGER_VALUE);
						 pdt.addValue(new IntegerValue((((PrimitiveDataTypeContext)_localctx).v!=null?((PrimitiveDataTypeContext)_localctx).v.getText():null))); 
						}
						}
						setState(2459);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2460); match(T__5);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2465); colType();
			setState(2470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2466); match(T__2);
					setState(2467); colType();
					}
					} 
				}
				setState(2472);
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
			setState(2473); identifier();
			setState(2474); dataType();
			setState(2477);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2475); match(COMMENT);
				setState(2476); match(STRING);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479); complexColType();
			setState(2484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2480); match(T__2);
				setState(2481); complexColType();
				}
				}
				setState(2486);
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
			setState(2487); identifier();
			setState(2488); match(T__4);
			setState(2489); dataType();
			setState(2492);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2490); match(COMMENT);
				setState(2491); match(STRING);
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
			setState(2494); match(WHEN);
			setState(2495); ((WhenClauseContext)_localctx).condition = expression();
			setState(2496); match(THEN);
			setState(2497); ((WhenClauseContext)_localctx).result = expression();
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2499); match(WINDOW);
			setState(2500); namedWindow();
			setState(2505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2501); match(T__2);
					setState(2502); namedWindow();
					}
					} 
				}
				setState(2507);
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
			setState(2508); identifier();
			setState(2509); match(AS);
			setState(2510); windowSpec();
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
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
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
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
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
		int _la;
		try {
			setState(2554);
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
				setState(2512); ((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__7:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2513); match(T__7);
				setState(2548);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2514); match(CLUSTER);
					setState(2515); match(BY);
					setState(2516); ((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2521);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2517); match(T__2);
						setState(2518); ((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2523);
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
					setState(2534);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2524);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(2525); match(BY);
						setState(2526); ((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2531);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2527); match(T__2);
							setState(2528); ((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2533);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2546);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2536);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(2537); match(BY);
						setState(2538); sortItem();
						setState(2543);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2539); match(T__2);
							setState(2540); sortItem();
							}
							}
							setState(2545);
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
				setState(2551);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2550); windowFrame();
					}
				}

				setState(2553); match(T__5);
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
		public Token frameType;
		public FrameBoundContext start;
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
			setState(2572);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2556); ((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2557); ((WindowFrameContext)_localctx).start = frameBound();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2558); ((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2559); ((WindowFrameContext)_localctx).start = frameBound();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2560); ((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2561); match(BETWEEN);
				setState(2562); ((WindowFrameContext)_localctx).start = frameBound();
				setState(2563); match(AND);
				setState(2564); ((WindowFrameContext)_localctx).end = frameBound();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2566); ((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2567); match(BETWEEN);
				setState(2568); ((WindowFrameContext)_localctx).start = frameBound();
				setState(2569); match(AND);
				setState(2570); ((WindowFrameContext)_localctx).end = frameBound();
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
		public Token boundType;
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
			setState(2581);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2574); match(UNBOUNDED);
				setState(2575);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2576); ((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2577); match(ROW);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2578); expression();
				setState(2579);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				consume();
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
			setState(2583); ((QualifiedNameContext)_localctx).i = identifier();
			 _localctx.value.addIdentifier(((QualifiedNameContext)_localctx).i.value); 
			setState(2591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2585); match(T__0);
					setState(2586); ((QualifiedNameContext)_localctx).i = identifier();
					 _localctx.value.addIdentifier(((QualifiedNameContext)_localctx).i.value); 
					}
					} 
				}
				setState(2593);
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
			setState(2599);
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
				setState(2594); ((IdentifierContext)_localctx).s = strictIdentifier();
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
				setState(2597);
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
			setState(2609);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2601); ((UnquotedIdentifierContext)_localctx).i = match(IDENTIFIER);
				 ((UnquotedIdentifierContext)_localctx).value =  new Identifier((((UnquotedIdentifierContext)_localctx).i!=null?((UnquotedIdentifierContext)_localctx).i.getText():null));
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2603); ((QuotedIdentifierAlternativeContext)_localctx).q = quotedIdentifier();
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
				setState(2606); ((UnquotedIdentifierContext)_localctx).n = nonReserved();
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
			setState(2611); ((QuotedIdentifierContext)_localctx).b = match(BACKQUOTED_IDENTIFIER);
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
			setState(2656);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2616);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2614); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2618); ((DecimalLiteralContext)_localctx).v = match(DECIMAL_VALUE);
				 ((DecimalLiteralContext)_localctx).value =  new DecimalValue(_localctx.value.isMinus(),(((DecimalLiteralContext)_localctx).v!=null?((DecimalLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2622);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2620); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2624); ((IntegerLiteralContext)_localctx).v = match(INTEGER_VALUE);
				 ((IntegerLiteralContext)_localctx).value =  new IntegerValue(_localctx.value.isMinus(),(((IntegerLiteralContext)_localctx).v!=null?((IntegerLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2628);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2626); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2630); ((BigIntLiteralContext)_localctx).v = match(BIGINT_LITERAL);
				 ((BigIntLiteralContext)_localctx).value =  new BigIntValue(_localctx.value.isMinus(),(((BigIntLiteralContext)_localctx).v!=null?((BigIntLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2634);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2632); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2636); ((SmallIntLiteralContext)_localctx).v = match(SMALLINT_LITERAL);
				 ((SmallIntLiteralContext)_localctx).value =  new SmallIntValue(_localctx.value.isMinus(),(((SmallIntLiteralContext)_localctx).v!=null?((SmallIntLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2640);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2638); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2642); ((TinyIntLiteralContext)_localctx).v = match(TINYINT_LITERAL);
				 ((TinyIntLiteralContext)_localctx).value =  new TinyIntValue(_localctx.value.isMinus(),(((TinyIntLiteralContext)_localctx).v!=null?((TinyIntLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2646);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2644); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2648); ((DoubleLiteralContext)_localctx).v = match(DOUBLE_LITERAL);
				 ((DoubleLiteralContext)_localctx).value =  new DoubleValue(_localctx.value.isMinus(),(((DoubleLiteralContext)_localctx).v!=null?((DoubleLiteralContext)_localctx).v.getText():null));
				}
				break;

			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2652);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2650); match(MINUS);
					_localctx.value.setMinus(true);
					}
				}

				setState(2654); ((BigDecimalLiteralContext)_localctx).v = match(BIGDECIMAL_LITERAL);
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
			setState(2658);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00fe\u0a68\4\2\t"+
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
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ef\n\b\3\b\3\b\3\b\5\b\u00f4\n\b"+
		"\3\b\5\b\u00f7\n\b\3\b\3\b\3\b\5\b\u00fc\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0109\n\b\3\b\3\b\5\b\u010d\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0114\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u0122\n\b\f\b\16\b\u0125\13\b\3\b\5\b\u0128\n\b\3\b\5\b\u012b\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0132\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u0143\n\b\f\b\16\b\u0146\13\b\3\b\5\b\u0149\n"+
		"\b\3\b\5\b\u014c\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0153\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0159\n\b\3\b\3\b\3\b\3\b\5\b\u015f\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0167\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0187"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u018f\n\b\3\b\3\b\5\b\u0193\n\b\3\b\3"+
		"\b\3\b\5\b\u0198\n\b\3\b\3\b\3\b\3\b\5\b\u019e\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u01a6\n\b\3\b\3\b\3\b\3\b\5\b\u01ac\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u01b9\n\b\3\b\6\b\u01bc\n\b\r\b\16\b\u01bd"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01c7\n\b\3\b\6\b\u01ca\n\b\r\b\16\b"+
		"\u01cb\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01dc"+
		"\n\b\3\b\3\b\3\b\7\b\u01e1\n\b\f\b\16\b\u01e4\13\b\3\b\5\b\u01e7\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u01ef\n\b\3\b\3\b\3\b\7\b\u01f4\n\b\f\b\16"+
		"\b\u01f7\13\b\3\b\3\b\3\b\3\b\5\b\u01fd\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u020c\n\b\3\b\3\b\5\b\u0210\n\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0216\n\b\3\b\3\b\3\b\3\b\5\b\u021c\n\b\3\b\5\b\u021f\n\b"+
		"\3\b\5\b\u0222\n\b\3\b\3\b\3\b\3\b\5\b\u0228\n\b\3\b\3\b\5\b\u022c\n\b"+
		"\3\b\3\b\5\b\u0230\n\b\3\b\3\b\3\b\5\b\u0235\n\b\3\b\3\b\5\b\u0239\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0241\n\b\3\b\5\b\u0244\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u024d\n\b\3\b\3\b\3\b\5\b\u0252\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0258\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u025f\n\b\3\b\5\b\u0262\n\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0268\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0271\n\b\f"+
		"\b\16\b\u0274\13\b\5\b\u0276\n\b\3\b\3\b\5\b\u027a\n\b\3\b\3\b\3\b\5\b"+
		"\u027f\n\b\3\b\3\b\3\b\5\b\u0284\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u028b\n\b"+
		"\3\b\5\b\u028e\n\b\3\b\5\b\u0291\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0298\n\b"+
		"\3\b\3\b\3\b\5\b\u029d\n\b\3\b\3\b\3\b\5\b\u02a2\n\b\3\b\5\b\u02a5\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02ae\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u02b6\n\b\3\b\3\b\3\b\3\b\5\b\u02bc\n\b\3\b\3\b\5\b\u02c0\n\b\3\b\3\b"+
		"\5\b\u02c4\n\b\3\b\3\b\5\b\u02c8\n\b\5\b\u02ca\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u02d3\n\b\3\b\3\b\3\b\3\b\5\b\u02d9\n\b\3\b\3\b\3\b\5\b\u02de"+
		"\n\b\3\b\5\b\u02e1\n\b\3\b\3\b\5\b\u02e5\n\b\3\b\5\b\u02e8\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u02f0\n\b\f\b\16\b\u02f3\13\b\5\b\u02f5\n\b\3\b\3"+
		"\b\5\b\u02f9\n\b\3\b\3\b\3\b\5\b\u02fe\n\b\3\b\5\b\u0301\n\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0307\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u030f\n\b\3\b\3\b\3\b"+
		"\5\b\u0314\n\b\3\b\3\b\3\b\3\b\5\b\u031a\n\b\3\b\3\b\3\b\3\b\5\b\u0320"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0329\n\b\f\b\16\b\u032c\13\b\3\b"+
		"\3\b\3\b\7\b\u0331\n\b\f\b\16\b\u0334\13\b\3\b\3\b\7\b\u0338\n\b\f\b\16"+
		"\b\u033b\13\b\3\b\3\b\3\b\7\b\u0340\n\b\f\b\16\b\u0343\13\b\5\b\u0345"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u034d\n\t\3\t\3\t\5\t\u0351\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0358\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03cc"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03d4\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u03dc\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03e5\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u03f1\n\t\3\n\3\n\5\n\u03f5\n\n\3\n\5\n\u03f8"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u03fe\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0408\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0414"+
		"\n\f\3\f\3\f\3\f\5\f\u0419\n\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0421\n"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u042e"+
		"\n\17\5\17\u0430\n\17\3\17\3\17\3\17\5\17\u0435\n\17\3\17\3\17\5\17\u0439"+
		"\n\17\3\17\3\17\3\17\5\17\u043e\n\17\3\17\3\17\3\17\5\17\u0443\n\17\3"+
		"\17\5\17\u0446\n\17\3\17\3\17\3\17\5\17\u044b\n\17\3\17\3\17\5\17\u044f"+
		"\n\17\3\17\3\17\3\17\5\17\u0454\n\17\5\17\u0456\n\17\3\20\3\20\5\20\u045a"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u0461\n\21\f\21\16\21\u0464\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u046b\n\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0472\n\23\3\24\3\24\3\24\7\24\u0477\n\24\f\24\16\24\u047a\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0483\n\25\f\25\16\25\u0486\13\25"+
		"\3\26\3\26\5\26\u048a\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\7\30\u0498\n\30\f\30\16\30\u049b\13\30\3\30\3\30\3\31"+
		"\3\31\5\31\u04a1\n\31\3\31\5\31\u04a4\n\31\3\32\3\32\3\32\7\32\u04a9\n"+
		"\32\f\32\16\32\u04ac\13\32\3\32\5\32\u04af\n\32\3\33\3\33\3\33\3\33\5"+
		"\33\u04b5\n\33\3\34\3\34\3\34\3\34\7\34\u04bb\n\34\f\34\16\34\u04be\13"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u04c6\n\35\f\35\16\35\u04c9\13"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u04d3\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u04da\n\37\3 \3 \3 \3 \5 \u04e0\n \3!\3!\3!\3\"\5"+
		"\"\u04e6\n\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u04ee\n\"\r\"\16\"\u04ef\5\""+
		"\u04f2\n\"\3#\3#\3#\3#\3#\3#\3#\3#\7#\u04fc\n#\f#\16#\u04ff\13#\5#\u0501"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u050b\n#\f#\16#\u050e\13#\5#\u0510\n#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\7#\u051a\n#\f#\16#\u051d\13#\5#\u051f\n#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\7#\u0529\n#\f#\16#\u052c\13#\5#\u052e\n#\3#\5#\u0531"+
		"\n#\3#\3#\3#\3#\3#\3#\5#\u0539\n#\5#\u053b\n#\3$\5$\u053e\n$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u054a\n%\3%\3%\3%\7%\u054f\n%\f%\16%\u0552\13"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u055f\n&\3\'\3\'\3\'\3\'\5\'\u0565"+
		"\n\'\3\'\3\'\3\'\5\'\u056a\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0576"+
		"\n(\3(\5(\u0579\n(\3(\3(\5(\u057d\n(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0587"+
		"\n(\3(\3(\5(\u058b\n(\5(\u058d\n(\3(\5(\u0590\n(\3(\3(\5(\u0594\n(\3("+
		"\5(\u0597\n(\3(\3(\5(\u059b\n(\3(\3(\3(\3(\7(\u05a1\n(\f(\16(\u05a4\13"+
		"(\3(\3(\3(\5(\u05a9\n(\3(\3(\3(\3(\3(\5(\u05b0\n(\3(\3(\3(\3(\3(\3(\5"+
		"(\u05b8\n(\3(\3(\3(\5(\u05bd\n(\5(\u05bf\n(\3(\3(\3(\7(\u05c4\n(\f(\16"+
		"(\u05c7\13(\3(\3(\3(\3(\5(\u05cd\n(\3(\3(\3(\5(\u05d2\n(\3(\3(\3(\3(\5"+
		"(\u05d8\n(\3(\5(\u05db\n(\3(\3(\5(\u05df\n(\3)\3)\3)\3)\5)\u05e5\n)\3"+
		")\3)\3)\7)\u05ea\n)\f)\16)\u05ed\13)\3)\3)\3*\3*\3*\3*\3*\3*\7*\u05f7"+
		"\n*\f*\16*\u05fa\13*\3*\3*\3*\5*\u05ff\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\7"+
		"+\u060a\n+\f+\16+\u060d\13+\3,\3,\5,\u0611\n,\3-\5-\u0614\n-\3-\3-\3-"+
		"\3-\3-\3-\5-\u061c\n-\3-\3-\3-\3-\3-\7-\u0623\n-\f-\16-\u0626\13-\3-\3"+
		"-\5-\u062a\n-\3.\3.\3.\3.\3.\3.\5.\u0632\n.\3.\3.\3.\3.\7.\u0638\n.\f"+
		".\16.\u063b\13.\3/\3/\3/\3/\3/\3/\3/\7/\u0644\n/\f/\16/\u0647\13/\3/\3"+
		"/\3/\7/\u064c\n/\f/\16/\u064f\13/\3/\5/\u0652\n/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\7\60\u065c\n\60\f\60\16\60\u065f\13\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u066b\n\60\f\60\16\60\u066e"+
		"\13\60\3\60\3\60\5\60\u0672\n\60\3\61\3\61\3\61\3\61\7\61\u0678\n\61\f"+
		"\61\16\61\u067b\13\61\5\61\u067d\n\61\3\61\3\61\5\61\u0681\n\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u068d\n\62\f\62\16\62"+
		"\u0690\13\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u0699\n\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\7\63\u06a1\n\63\f\63\16\63\u06a4\13\63\5\63\u06a6"+
		"\n\63\3\63\3\63\3\63\3\63\5\63\u06ac\n\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\7\63\u06b4\n\63\f\63\16\63\u06b7\13\63\5\63\u06b9\n\63\3\64\3\64\3\64"+
		"\3\64\5\64\u06bf\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u06c6\n\65\f\65\16"+
		"\65\u06c9\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u06d2\n\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u06da\n\66\3\67\5\67\u06dd\n\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\5\67\u06e6\n\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u06ef\n\67\3\67\3\67\3\67\3\67\5\67\u06f5\n\67\3\67\3"+
		"\67\3\67\5\67\u06fa\n\67\3\67\3\67\5\67\u06fe\n\67\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\78\u070d\n8\f8\168\u0710\138\38\38\58\u0714\n8\39"+
		"\39\39\59\u0719\n9\39\39\3:\5:\u071e\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\5:\u0730\n:\5:\u0732\n:\3:\5:\u0735\n:\3;\3;\3;\3;"+
		"\3;\3<\3<\3<\3<\3<\3<\7<\u0742\n<\f<\16<\u0745\13<\3=\3=\3=\3=\7=\u074b"+
		"\n=\f=\16=\u074e\13=\3=\3=\3>\3>\5>\u0754\n>\3?\3?\3?\3?\7?\u075a\n?\f"+
		"?\16?\u075d\13?\3?\3?\3@\3@\3@\5@\u0764\n@\3A\3A\3A\3A\5A\u076a\nA\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0775\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0780"+
		"\nA\3A\3A\3A\3A\3A\5A\u0787\nA\3B\3B\3B\3B\7B\u078d\nB\fB\16B\u0790\13"+
		"B\3B\3B\3C\3C\3C\3C\3C\7C\u0799\nC\fC\16C\u079c\13C\5C\u079e\nC\3C\3C"+
		"\3C\3D\5D\u07a4\nD\3D\3D\3D\3D\3D\5D\u07ab\nD\5D\u07ad\nD\3E\3E\3E\3E"+
		"\3E\3E\3E\5E\u07b6\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u07c2\nE\5E\u07c4"+
		"\nE\3E\3E\3E\3E\3E\5E\u07cb\nE\3E\3E\3E\3E\3E\5E\u07d2\nE\3E\3E\3E\3E"+
		"\5E\u07d8\nE\3E\3E\3E\3E\5E\u07de\nE\5E\u07e0\nE\3F\3F\3F\3F\5F\u07e6"+
		"\nF\3F\3F\3F\3G\3G\3G\5G\u07ee\nG\3G\3G\3H\3H\3H\5H\u07f5\nH\3H\3H\3H"+
		"\3H\3H\3H\5H\u07fd\nH\5H\u07ff\nH\3I\3I\3I\3I\3I\3I\7I\u0807\nI\fI\16"+
		"I\u080a\13I\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u081c\n"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\7K\u0828\nK\fK\16K\u082b\13K\3L\3L\3L"+
		"\3L\3L\5L\u0832\nL\3M\3M\5M\u0836\nM\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0840"+
		"\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\7M\u084b\nM\fM\16M\u084e\13M\3M\3M\3M\3"+
		"M\5M\u0854\nM\3M\3M\3M\3M\3M\3M\3M\3M\5M\u085e\nM\3M\3M\3M\3M\3M\3M\3"+
		"M\5M\u0867\nM\3M\3M\3M\3M\3M\5M\u086e\nM\3M\3M\3M\3M\3M\5M\u0875\nM\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\5N\u087f\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7N\u089f\nN\f"+
		"N\16N\u08a2\13N\3O\3O\3O\6O\u08a7\nO\rO\16O\u08a8\3O\3O\5O\u08ad\nO\3"+
		"O\3O\3O\3O\3O\6O\u08b4\nO\rO\16O\u08b5\3O\3O\5O\u08ba\nO\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\7O\u08cb\nO\fO\16O\u08ce\13O\5O\u08d0"+
		"\nO\3O\3O\3O\3O\3O\3O\5O\u08d8\nO\3O\3O\3O\3O\3O\3O\3O\5O\u08e1\nO\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\6O"+
		"\u08fa\nO\rO\16O\u08fb\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u090a\n"+
		"O\3O\3O\3O\3O\3O\3O\7O\u0912\nO\fO\16O\u0915\13O\5O\u0917\nO\3O\3O\3O"+
		"\5O\u091c\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u092e"+
		"\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\7O\u093a\nO\fO\16O\u093d\13O\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\6P\u094d\nP\rP\16P\u094e\5P\u0951\n"+
		"P\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3T\5T\u095e\nT\3U\3U\3U\3U\7U\u0964\n"+
		"U\fU\16U\u0967\13U\3V\3V\3V\3V\5V\u096d\nV\3W\5W\u0970\nW\3W\3W\5W\u0974"+
		"\nW\3X\3X\3X\5X\u0979\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\5Y\u098c\nY\3Y\3Y\5Y\u0990\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u099a"+
		"\nY\fY\16Y\u099d\13Y\3Y\5Y\u09a0\nY\5Y\u09a2\nY\3Z\3Z\3Z\7Z\u09a7\nZ\f"+
		"Z\16Z\u09aa\13Z\3[\3[\3[\3[\5[\u09b0\n[\3\\\3\\\3\\\7\\\u09b5\n\\\f\\"+
		"\16\\\u09b8\13\\\3]\3]\3]\3]\3]\5]\u09bf\n]\3^\3^\3^\3^\3^\3_\3_\3_\3"+
		"_\7_\u09ca\n_\f_\16_\u09cd\13_\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\7a\u09da"+
		"\na\fa\16a\u09dd\13a\3a\3a\3a\3a\3a\7a\u09e4\na\fa\16a\u09e7\13a\5a\u09e9"+
		"\na\3a\3a\3a\3a\3a\7a\u09f0\na\fa\16a\u09f3\13a\5a\u09f5\na\5a\u09f7\n"+
		"a\3a\5a\u09fa\na\3a\5a\u09fd\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\5b\u0a0f\nb\3c\3c\3c\3c\3c\3c\3c\5c\u0a18\nc\3d\3d\3d\3d\3"+
		"d\3d\7d\u0a20\nd\fd\16d\u0a23\13d\3e\3e\3e\3e\3e\5e\u0a2a\ne\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\5f\u0a34\nf\3g\3g\3g\3h\3h\5h\u0a3b\nh\3h\3h\3h\3h\5h"+
		"\u0a41\nh\3h\3h\3h\3h\5h\u0a47\nh\3h\3h\3h\3h\5h\u0a4d\nh\3h\3h\3h\3h"+
		"\5h\u0a53\nh\3h\3h\3h\3h\5h\u0a59\nh\3h\3h\3h\3h\5h\u0a5f\nh\3h\3h\5h"+
		"\u0a63\nh\3i\3i\3i\3i\7\u02f1\u032a\u0332\u0339\u0341\bHTZ\u0094\u009a"+
		"\u009cj\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\2\33"+
		"\3\2\u00c8\u00c9\4\2QQSS\5\2[]\u00ae\u00ae\u00b4\u00b4\4\2\r\r  \4\2-"+
		"-XX\4\2\u00ae\u00ae\u00b4\u00b4\4\2\16\16\u00d5\u00d5\3\2gj\3\2,-\4\2"+
		"JJLL\3\2\u00f4\u00f5\3\2%&\4\2\u008a\u008b\u0090\u0090\3\2\u008c\u008f"+
		"\4\2\u008a\u008b\u0093\u0093\3\2}\177\3\2\u0082\u0089\3\2\u008a\u0094"+
		"\3\2\36!\3\2\u008a\u008b\4\2CC\u009b\u009b\4\2\32\32\u0099\u0099\3\2G"+
		"H\6\2\65\668>gj\u00ed\u00ed\n\2\f\64\67\67?fk\u0081\u008f\u008f\u0095"+
		"\u009e\u00a0\u00ec\u00ee\u00ef\u0bef\2\u00d2\3\2\2\2\4\u00d5\3\2\2\2\6"+
		"\u00d8\3\2\2\2\b\u00db\3\2\2\2\n\u00de\3\2\2\2\f\u00e1\3\2\2\2\16\u0344"+
		"\3\2\2\2\20\u03f0\3\2\2\2\22\u03f2\3\2\2\2\24\u0401\3\2\2\2\26\u040d\3"+
		"\2\2\2\30\u041a\3\2\2\2\32\u0420\3\2\2\2\34\u0455\3\2\2\2\36\u0457\3\2"+
		"\2\2 \u045b\3\2\2\2\"\u0467\3\2\2\2$\u0471\3\2\2\2&\u0473\3\2\2\2(\u047b"+
		"\3\2\2\2*\u0487\3\2\2\2,\u0490\3\2\2\2.\u0493\3\2\2\2\60\u049e\3\2\2\2"+
		"\62\u04ae\3\2\2\2\64\u04b4\3\2\2\2\66\u04b6\3\2\2\28\u04c1\3\2\2\2:\u04d2"+
		"\3\2\2\2<\u04d9\3\2\2\2>\u04db\3\2\2\2@\u04e1\3\2\2\2B\u04f1\3\2\2\2D"+
		"\u0500\3\2\2\2F\u053d\3\2\2\2H\u0542\3\2\2\2J\u055e\3\2\2\2L\u0560\3\2"+
		"\2\2N\u05de\3\2\2\2P\u05e0\3\2\2\2R\u05fe\3\2\2\2T\u0600\3\2\2\2V\u060e"+
		"\3\2\2\2X\u0629\3\2\2\2Z\u0631\3\2\2\2\\\u063c\3\2\2\2^\u0653\3\2\2\2"+
		"`\u0680\3\2\2\2b\u0682\3\2\2\2d\u0694\3\2\2\2f\u06be\3\2\2\2h\u06c0\3"+
		"\2\2\2j\u06d9\3\2\2\2l\u06fd\3\2\2\2n\u0713\3\2\2\2p\u0715\3\2\2\2r\u0734"+
		"\3\2\2\2t\u0736\3\2\2\2v\u073b\3\2\2\2x\u0746\3\2\2\2z\u0751\3\2\2\2|"+
		"\u0755\3\2\2\2~\u0760\3\2\2\2\u0080\u0786\3\2\2\2\u0082\u0788\3\2\2\2"+
		"\u0084\u0793\3\2\2\2\u0086\u07ac\3\2\2\2\u0088\u07df\3\2\2\2\u008a\u07e5"+
		"\3\2\2\2\u008c\u07ed\3\2\2\2\u008e\u07f1\3\2\2\2\u0090\u0800\3\2\2\2\u0092"+
		"\u080b\3\2\2\2\u0094\u081b\3\2\2\2\u0096\u082c\3\2\2\2\u0098\u0874\3\2"+
		"\2\2\u009a\u087e\3\2\2\2\u009c\u092d\3\2\2\2\u009e\u0950\3\2\2\2\u00a0"+
		"\u0952\3\2\2\2\u00a2\u0955\3\2\2\2\u00a4\u0957\3\2\2\2\u00a6\u095d\3\2"+
		"\2\2\u00a8\u095f\3\2\2\2\u00aa\u0968\3\2\2\2\u00ac\u0973\3\2\2\2\u00ae"+
		"\u0978\3\2\2\2\u00b0\u09a1\3\2\2\2\u00b2\u09a3\3\2\2\2\u00b4\u09ab\3\2"+
		"\2\2\u00b6\u09b1\3\2\2\2\u00b8\u09b9\3\2\2\2\u00ba\u09c0\3\2\2\2\u00bc"+
		"\u09c5\3\2\2\2\u00be\u09ce\3\2\2\2\u00c0\u09fc\3\2\2\2\u00c2\u0a0e\3\2"+
		"\2\2\u00c4\u0a17\3\2\2\2\u00c6\u0a19\3\2\2\2\u00c8\u0a29\3\2\2\2\u00ca"+
		"\u0a33\3\2\2\2\u00cc\u0a35\3\2\2\2\u00ce\u0a62\3\2\2\2\u00d0\u0a64\3\2"+
		"\2\2\u00d2\u00d3\5\16\b\2\u00d3\u00d4\7\2\2\3\u00d4\3\3\2\2\2\u00d5\u00d6"+
		"\5\u008eH\2\u00d6\u00d7\7\2\2\3\u00d7\5\3\2\2\2\u00d8\u00d9\5\u008aF\2"+
		"\u00d9\u00da\7\2\2\3\u00da\7\3\2\2\2\u00db\u00dc\5\u008cG\2\u00dc\u00dd"+
		"\7\2\2\3\u00dd\t\3\2\2\2\u00de\u00df\5\u00b0Y\2\u00df\u00e0\7\2\2\3\u00e0"+
		"\13\3\2\2\2\u00e1\u00e2\5\u00b2Z\2\u00e2\u00e3\7\2\2\3\u00e3\r\3\2\2\2"+
		"\u00e4\u00e5\5\32\16\2\u00e5\u00e6\b\b\1\2\u00e6\u0345\3\2\2\2\u00e7\u00e8"+
		"\7c\2\2\u00e8\u0345\5\u00c8e\2\u00e9\u00ea\7P\2\2\u00ea\u00ee\7\u00cf"+
		"\2\2\u00eb\u00ec\7\u0080\2\2\u00ec\u00ed\7!\2\2\u00ed\u00ef\7#\2\2\u00ee"+
		"\u00eb\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\5\u00c8"+
		"e\2\u00f1\u00f2\7s\2\2\u00f2\u00f4\7\u00f0\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\5\30\r\2\u00f6\u00f5\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00f9\7N\2\2\u00f9"+
		"\u00fa\7\u00ba\2\2\u00fa\u00fc\5.\30\2\u00fb\u00f8\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u0345\3\2\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7\u00cf\2"+
		"\2\u00ff\u0100\5\u00c8e\2\u0100\u0101\7t\2\2\u0101\u0102\7\u00ba\2\2\u0102"+
		"\u0103\5.\30\2\u0103\u0345\3\2\2\2\u0104\u0105\7f\2\2\u0105\u0108\7\u00cf"+
		"\2\2\u0106\u0107\7\u0080\2\2\u0107\u0109\7#\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\5\u00c8e\2\u010b\u010d"+
		"\t\2\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0345\3\2\2\2\u010e"+
		"\u0113\5\22\n\2\u010f\u0110\7\4\2\2\u0110\u0111\5\u00b2Z\2\u0111\u0112"+
		"\7\6\2\2\u0112\u0114\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0123\5,\27\2\u0116\u0117\7\u00b7\2\2\u0117\u0122"+
		"\5.\30\2\u0118\u0119\7\u00d7\2\2\u0119\u011a\7\25\2\2\u011a\u0122\5t;"+
		"\2\u011b\u0122\5\24\13\2\u011c\u0122\5\30\r\2\u011d\u011e\7s\2\2\u011e"+
		"\u0122\7\u00f0\2\2\u011f\u0120\7\u00b9\2\2\u0120\u0122\5.\30\2\u0121\u0116"+
		"\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121"+
		"\u011d\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u012a\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0128\7\17\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3"+
		"\2\2\2\u0129\u012b\5\32\16\2\u012a\u0127\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u0345\3\2\2\2\u012c\u0131\5\22\n\2\u012d\u012e\7\4\2\2\u012e\u012f\5"+
		"\u00b2Z\2\u012f\u0130\7\6\2\2\u0130\u0132\3\2\2\2\u0131\u012d\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0144\3\2\2\2\u0133\u0134\7s\2\2\u0134\u0143"+
		"\7\u00f0\2\2\u0135\u0136\7\u00d7\2\2\u0136\u0137\7\25\2\2\u0137\u0138"+
		"\7\4\2\2\u0138\u0139\5\u00b2Z\2\u0139\u013a\7\6\2\2\u013a\u0143\3\2\2"+
		"\2\u013b\u0143\5\24\13\2\u013c\u0143\5\26\f\2\u013d\u0143\5\u0088E\2\u013e"+
		"\u0143\5:\36\2\u013f\u0143\5\30\r\2\u0140\u0141\7\u00b9\2\2\u0141\u0143"+
		"\5.\30\2\u0142\u0133\3\2\2\2\u0142\u0135\3\2\2\2\u0142\u013b\3\2\2\2\u0142"+
		"\u013c\3\2\2\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u014b\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\7\17"+
		"\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\5\32\16\2\u014b\u0148\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0345\3"+
		"\2\2\2\u014d\u014e\7P\2\2\u014e\u0152\7Q\2\2\u014f\u0150\7\u0080\2\2\u0150"+
		"\u0151\7!\2\2\u0151\u0153\7#\2\2\u0152\u014f\3\2\2\2\u0152\u0153\3\2\2"+
		"\2\u0153\u0154\3\2\2\2\u0154\u0155\5\u008aF\2\u0155\u0156\7%\2\2\u0156"+
		"\u0158\5\u008aF\2\u0157\u0159\5\30\r\2\u0158\u0157\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u0345\3\2\2\2\u015a\u015b\7\u00d3\2\2\u015b\u015c\7Q\2"+
		"\2\u015c\u015e\5\u008aF\2\u015d\u015f\5 \21\2\u015e\u015d\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7\u00d4\2\2\u0161\u0166"+
		"\7\u00d6\2\2\u0162\u0167\5\u00c8e\2\u0163\u0164\7.\2\2\u0164\u0165\7a"+
		"\2\2\u0165\u0167\5v<\2\u0166\u0162\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0345\3\2\2\2\u0168\u0169\7n\2\2\u0169\u016a\7Q\2\2\u016a"+
		"\u016b\5\u008aF\2\u016b\u016c\7\16\2\2\u016c\u016d\7a\2\2\u016d\u016e"+
		"\7\4\2\2\u016e\u016f\5\u00b2Z\2\u016f\u0170\7\6\2\2\u0170\u0345\3\2\2"+
		"\2\u0171\u0172\7n\2\2\u0172\u0173\t\3\2\2\u0173\u0174\5\u008aF\2\u0174"+
		"\u0175\7o\2\2\u0175\u0176\7k\2\2\u0176\u0177\5\u008aF\2\u0177\u0345\3"+
		"\2\2\2\u0178\u0179\7n\2\2\u0179\u017a\t\3\2\2\u017a\u017b\5\u008aF\2\u017b"+
		"\u017c\7t\2\2\u017c\u017d\7\u00b9\2\2\u017d\u017e\5.\30\2\u017e\u0345"+
		"\3\2\2\2\u017f\u0180\7n\2\2\u0180\u0181\t\3\2\2\u0181\u0182\5\u008aF\2"+
		"\u0182\u0183\7\u00b8\2\2\u0183\u0186\7\u00b9\2\2\u0184\u0185\7\u0080\2"+
		"\2\u0185\u0187\7#\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0189\5.\30\2\u0189\u0345\3\2\2\2\u018a\u018b\7n\2\2\u018b"+
		"\u018c\7Q\2\2\u018c\u018e\5\u008aF\2\u018d\u018f\5 \21\2\u018e\u018d\3"+
		"\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\7\u00c7\2\2"+
		"\u0191\u0193\7b\2\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\5\u00c8e\2\u0195\u0197\5\u00b4[\2\u0196\u0198\5\u00ae"+
		"X\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0345\3\2\2\2\u0199"+
		"\u019a\7n\2\2\u019a\u019b\7Q\2\2\u019b\u019d\5\u008aF\2\u019c\u019e\5"+
		" \21\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\7t\2\2\u01a0\u01a1\7\u00a0\2\2\u01a1\u01a5\7\u00f0\2\2\u01a2\u01a3"+
		"\7N\2\2\u01a3\u01a4\7\u00a1\2\2\u01a4\u01a6\5.\30\2\u01a5\u01a2\3\2\2"+
		"\2\u01a5\u01a6\3\2\2\2\u01a6\u0345\3\2\2\2\u01a7\u01a8\7n\2\2\u01a8\u01a9"+
		"\7Q\2\2\u01a9\u01ab\5\u008aF\2\u01aa\u01ac\5 \21\2\u01ab\u01aa\3\2\2\2"+
		"\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af"+
		"\7\u00a1\2\2\u01af\u01b0\5.\30\2\u01b0\u0345\3\2\2\2\u01b1\u01b2\7n\2"+
		"\2\u01b2\u01b3\7Q\2\2\u01b3\u01b4\5\u008aF\2\u01b4\u01b8\7\16\2\2\u01b5"+
		"\u01b6\7\u0080\2\2\u01b6\u01b7\7!\2\2\u01b7\u01b9\7#\2\2\u01b8\u01b5\3"+
		"\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01bc\5\36\20\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u0345\3\2\2\2\u01bf\u01c0\7n\2\2\u01c0\u01c1\7S\2\2\u01c1\u01c2"+
		"\5\u008aF\2\u01c2\u01c6\7\16\2\2\u01c3\u01c4\7\u0080\2\2\u01c4\u01c5\7"+
		"!\2\2\u01c5\u01c7\7#\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u01ca\5 \21\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u0345\3\2\2\2\u01cd"+
		"\u01ce\7n\2\2\u01ce\u01cf\7Q\2\2\u01cf\u01d0\5\u008aF\2\u01d0\u01d1\5"+
		" \21\2\u01d1\u01d2\7o\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4\5 \21\2\u01d4"+
		"\u0345\3\2\2\2\u01d5\u01d6\7n\2\2\u01d6\u01d7\7Q\2\2\u01d7\u01d8\5\u008a"+
		"F\2\u01d8\u01db\7f\2\2\u01d9\u01da\7\u0080\2\2\u01da\u01dc\7#\2\2\u01db"+
		"\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e2\5 "+
		"\21\2\u01de\u01df\7\t\2\2\u01df\u01e1\5 \21\2\u01e0\u01de\3\2\2\2\u01e1"+
		"\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e6\3\2"+
		"\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e7\7\u00cc\2\2\u01e6\u01e5\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u0345\3\2\2\2\u01e8\u01e9\7n\2\2\u01e9\u01ea\7S\2"+
		"\2\u01ea\u01eb\5\u008aF\2\u01eb\u01ee\7f\2\2\u01ec\u01ed\7\u0080\2\2\u01ed"+
		"\u01ef\7#\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f5\5 \21\2\u01f1\u01f2\7\t\2\2\u01f2\u01f4\5 \21\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u0345\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7n\2\2\u01f9"+
		"\u01fa\7Q\2\2\u01fa\u01fc\5\u008aF\2\u01fb\u01fd\5 \21\2\u01fc\u01fb\3"+
		"\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\7t\2\2\u01ff"+
		"\u0200\5\30\r\2\u0200\u0345\3\2\2\2\u0201\u0202\7n\2\2\u0202\u0203\7Q"+
		"\2\2\u0203\u0204\5\u008aF\2\u0204\u0205\7\u00e0\2\2\u0205\u0206\7d\2\2"+
		"\u0206\u0345\3\2\2\2\u0207\u0208\7f\2\2\u0208\u020b\7Q\2\2\u0209\u020a"+
		"\7\u0080\2\2\u020a\u020c\7#\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2"+
		"\2\u020c\u020d\3\2\2\2\u020d\u020f\5\u008aF\2\u020e\u0210\7\u00cc\2\2"+
		"\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0345\3\2\2\2\u0211\u0212"+
		"\7f\2\2\u0212\u0215\7S\2\2\u0213\u0214\7\u0080\2\2\u0214\u0216\7#\2\2"+
		"\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0345"+
		"\5\u008aF\2\u0218\u021b\7P\2\2\u0219\u021a\7\36\2\2\u021a\u021c\7T\2\2"+
		"\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0221\3\2\2\2\u021d\u021f"+
		"\7\u00b5\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2"+
		"\2\u0220\u0222\7\u00b6\2\2\u0221\u021e\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0227\7S\2\2\u0224\u0225\7\u0080\2\2\u0225\u0226"+
		"\7!\2\2\u0226\u0228\7#\2\2\u0227\u0224\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022b\5\u008aF\2\u022a\u022c\5|?\2\u022b\u022a\3"+
		"\2\2\2\u022b\u022c\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022e\7s\2\2\u022e"+
		"\u0230\7\u00f0\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0234"+
		"\3\2\2\2\u0231\u0232\7\u00d7\2\2\u0232\u0233\7>\2\2\u0233\u0235\5t;\2"+
		"\u0234\u0231\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0237"+
		"\7\u00b9\2\2\u0237\u0239\5.\30\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2"+
		"\2\u0239\u023a\3\2\2\2\u023a\u023b\7\17\2\2\u023b\u023c\5\32\16\2\u023c"+
		"\u0345\3\2\2\2\u023d\u0240\7P\2\2\u023e\u023f\7\36\2\2\u023f\u0241\7T"+
		"\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242"+
		"\u0244\7\u00b5\2\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245"+
		"\3\2\2\2\u0245\u0246\7\u00b6\2\2\u0246\u0247\7S\2\2\u0247\u024c\5\u008a"+
		"F\2\u0248\u0249\7\4\2\2\u0249\u024a\5\u00b2Z\2\u024a\u024b\7\6\2\2\u024b"+
		"\u024d\3\2\2\2\u024c\u0248\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024e\u0251\5,\27\2\u024f\u0250\7\u00b7\2\2\u0250\u0252\5.\30\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0345\3\2\2\2\u0253\u0254\7n"+
		"\2\2\u0254\u0255\7S\2\2\u0255\u0257\5\u008aF\2\u0256\u0258\7\17\2\2\u0257"+
		"\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\5\32"+
		"\16\2\u025a\u0345\3\2\2\2\u025b\u025e\7P\2\2\u025c\u025d\7\36\2\2\u025d"+
		"\u025f\7T\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2"+
		"\2\2\u0260\u0262\7\u00b6\2\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0267\7\u00ad\2\2\u0264\u0265\7\u0080\2\2\u0265\u0266"+
		"\7!\2\2\u0266\u0268\7#\2\2\u0267\u0264\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\5\u00c6d\2\u026a\u026b\7\17\2\2\u026b\u0275"+
		"\7\u00f0\2\2\u026c\u026d\7\u009f\2\2\u026d\u0272\5@!\2\u026e\u026f\7\t"+
		"\2\2\u026f\u0271\5@!\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0275"+
		"\u026c\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0345\3\2\2\2\u0277\u0279\7f"+
		"\2\2\u0278\u027a\7\u00b6\2\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u027e\7\u00ad\2\2\u027c\u027d\7\u0080\2\2\u027d\u027f"+
		"\7#\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0345\5\u00c6d\2\u0281\u0283\7Y\2\2\u0282\u0284\t\4\2\2\u0283\u0282\3"+
		"\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0345\5\16\b\2\u0286"+
		"\u0287\7_\2\2\u0287\u028a\7`\2\2\u0288\u0289\t\5\2\2\u0289\u028b\5\u00c8"+
		"e\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0290\3\2\2\2\u028c"+
		"\u028e\7%\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u0291\7\u00f0\2\2\u0290\u028d\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0345\3\2\2\2\u0292\u0293\7_\2\2\u0293\u0294\7Q\2\2\u0294\u0297\7\u00ae"+
		"\2\2\u0295\u0296\t\5\2\2\u0296\u0298\5\u00c8e\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\7%\2\2\u029a\u029c\7\u00f0"+
		"\2\2\u029b\u029d\5 \21\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u0345\3\2\2\2\u029e\u029f\7_\2\2\u029f\u02a4\7\u00d0\2\2\u02a0\u02a2"+
		"\7%\2\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a5\7\u00f0\2\2\u02a4\u02a1\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u0345"+
		"\3\2\2\2\u02a6\u02a7\7_\2\2\u02a7\u02a8\7\u00b9\2\2\u02a8\u02ad\5\u008a"+
		"F\2\u02a9\u02aa\7\4\2\2\u02aa\u02ab\5\62\32\2\u02ab\u02ac\7\6\2\2\u02ac"+
		"\u02ae\3\2\2\2\u02ad\u02a9\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u0345\3\2"+
		"\2\2\u02af\u02b0\7_\2\2\u02b0\u02b1\7a\2\2\u02b1\u02b2\t\5\2\2\u02b2\u02b5"+
		"\5\u008aF\2\u02b3\u02b4\t\5\2\2\u02b4\u02b6\5\u00c8e\2\u02b5\u02b3\3\2"+
		"\2\2\u02b5\u02b6\3\2\2\2\u02b6\u0345\3\2\2\2\u02b7\u02b8\7_\2\2\u02b8"+
		"\u02b9\7d\2\2\u02b9\u02bb\5\u008aF\2\u02ba\u02bc\5 \21\2\u02bb\u02ba\3"+
		"\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u0345\3\2\2\2\u02bd\u02bf\7_\2\2\u02be"+
		"\u02c0\5\u00c8e\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c9\7e\2\2\u02c2\u02c4\7%\2\2\u02c3\u02c2\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c8\5\u00c6d\2\u02c6\u02c8"+
		"\7\u00f0\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8\u02ca\3\2\2"+
		"\2\u02c9\u02c3\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u0345\3\2\2\2\u02cb\u02cc"+
		"\7_\2\2\u02cc\u02cd\7P\2\2\u02cd\u02ce\7Q\2\2\u02ce\u0345\5\u008aF\2\u02cf"+
		"\u02d0\t\6\2\2\u02d0\u02d2\7\u00ad\2\2\u02d1\u02d3\7\u00ae\2\2\u02d2\u02d1"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u0345\5$\23\2\u02d5"+
		"\u02d6\t\6\2\2\u02d6\u02d8\7\u00cf\2\2\u02d7\u02d9\7\u00ae\2\2\u02d8\u02d7"+
		"\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u0345\5\u00c8e"+
		"\2\u02db\u02dd\t\6\2\2\u02dc\u02de\7Q\2\2\u02dd\u02dc\3\2\2\2\u02dd\u02de"+
		"\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02e1\t\7\2\2\u02e0\u02df\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\5\u008aF\2\u02e3\u02e5"+
		"\5 \21\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6"+
		"\u02e8\5&\24\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u0345\3\2"+
		"\2\2\u02e9\u02ea\7\u00af\2\2\u02ea\u02eb\7Q\2\2\u02eb\u0345\5\u008aF\2"+
		"\u02ec\u02f4\7\u00af\2\2\u02ed\u02f5\7\u00f0\2\2\u02ee\u02f0\13\2\2\2"+
		"\u02ef\u02ee\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f1\u02ef"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02ed\3\2\2\2\u02f4"+
		"\u02f1\3\2\2\2\u02f5\u0345\3\2\2\2\u02f6\u02f8\7\u00b1\2\2\u02f7\u02f9"+
		"\7\u00b3\2\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2"+
		"\2\u02fa\u02fb\7Q\2\2\u02fb\u0300\5\u008aF\2\u02fc\u02fe\7\17\2\2\u02fd"+
		"\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\5\32"+
		"\16\2\u0300\u02fd\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0345\3\2\2\2\u0302"+
		"\u0303\7\u00b2\2\2\u0303\u0306\7Q\2\2\u0304\u0305\7\u0080\2\2\u0305\u0307"+
		"\7#\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0345\5\u008aF\2\u0309\u030a\7\u00b0\2\2\u030a\u0345\7\u00b1\2\2\u030b"+
		"\u030c\7\u00e3\2\2\u030c\u030e\7v\2\2\u030d\u030f\7\u00ee\2\2\u030e\u030d"+
		"\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\7\u00ef\2"+
		"\2\u0311\u0313\7\u00f0\2\2\u0312\u0314\7\u009c\2\2\u0313\u0312\3\2\2\2"+
		"\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\7W\2\2\u0316\u0317"+
		"\7Q\2\2\u0317\u0319\5\u008aF\2\u0318\u031a\5 \21\2\u0319\u0318\3\2\2\2"+
		"\u0319\u031a\3\2\2\2\u031a\u0345\3\2\2\2\u031b\u031c\7\u00d2\2\2\u031c"+
		"\u031d\7Q\2\2\u031d\u031f\5\u008aF\2\u031e\u0320\5 \21\2\u031f\u031e\3"+
		"\2\2\2\u031f\u0320\3\2\2\2\u0320\u0345\3\2\2\2\u0321\u0322\7\u00de\2\2"+
		"\u0322\u0323\7\u00df\2\2\u0323\u0324\7Q\2\2\u0324\u0345\5\u008aF\2\u0325"+
		"\u0326\t\b\2\2\u0326\u032a\5\u00c8e\2\u0327\u0329\13\2\2\2\u0328\u0327"+
		"\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u032b\3\2\2\2\u032a\u0328\3\2\2\2\u032b"+
		"\u0345\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032e\7t\2\2\u032e\u0332\7\u00e4"+
		"\2\2\u032f\u0331\13\2\2\2\u0330\u032f\3\2\2\2\u0331\u0334\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0345\3\2\2\2\u0334\u0332\3\2"+
		"\2\2\u0335\u0339\7t\2\2\u0336\u0338\13\2\2\2\u0337\u0336\3\2\2\2\u0338"+
		"\u033b\3\2\2\2\u0339\u033a\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u0345\3\2"+
		"\2\2\u033b\u0339\3\2\2\2\u033c\u0345\7u\2\2\u033d\u0341\5\20\t\2\u033e"+
		"\u0340\13\2\2\2\u033f\u033e\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u0342\3"+
		"\2\2\2\u0341\u033f\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0344"+
		"\u00e4\3\2\2\2\u0344\u00e7\3\2\2\2\u0344\u00e9\3\2\2\2\u0344\u00fd\3\2"+
		"\2\2\u0344\u0104\3\2\2\2\u0344\u010e\3\2\2\2\u0344\u012c\3\2\2\2\u0344"+
		"\u014d\3\2\2\2\u0344\u015a\3\2\2\2\u0344\u0168\3\2\2\2\u0344\u0171\3\2"+
		"\2\2\u0344\u0178\3\2\2\2\u0344\u017f\3\2\2\2\u0344\u018a\3\2\2\2\u0344"+
		"\u0199\3\2\2\2\u0344\u01a7\3\2\2\2\u0344\u01b1\3\2\2\2\u0344\u01bf\3\2"+
		"\2\2\u0344\u01cd\3\2\2\2\u0344\u01d5\3\2\2\2\u0344\u01e8\3\2\2\2\u0344"+
		"\u01f8\3\2\2\2\u0344\u0201\3\2\2\2\u0344\u0207\3\2\2\2\u0344\u0211\3\2"+
		"\2\2\u0344\u0218\3\2\2\2\u0344\u023d\3\2\2\2\u0344\u0253\3\2\2\2\u0344"+
		"\u025b\3\2\2\2\u0344\u0277\3\2\2\2\u0344\u0281\3\2\2\2\u0344\u0286\3\2"+
		"\2\2\u0344\u0292\3\2\2\2\u0344\u029e\3\2\2\2\u0344\u02a6\3\2\2\2\u0344"+
		"\u02af\3\2\2\2\u0344\u02b7\3\2\2\2\u0344\u02bd\3\2\2\2\u0344\u02cb\3\2"+
		"\2\2\u0344\u02cf\3\2\2\2\u0344\u02d5\3\2\2\2\u0344\u02db\3\2\2\2\u0344"+
		"\u02e9\3\2\2\2\u0344\u02ec\3\2\2\2\u0344\u02f6\3\2\2\2\u0344\u0302\3\2"+
		"\2\2\u0344\u0309\3\2\2\2\u0344\u030b\3\2\2\2\u0344\u031b\3\2\2\2\u0344"+
		"\u0321\3\2\2\2\u0344\u0325\3\2\2\2\u0344\u032d\3\2\2\2\u0344\u0335\3\2"+
		"\2\2\u0344\u033c\3\2\2\2\u0344\u033d\3\2\2\2\u0345\17\3\2\2\2\u0346\u0347"+
		"\7P\2\2\u0347\u03f1\7\u00e4\2\2\u0348\u0349\7f\2\2\u0349\u03f1\7\u00e4"+
		"\2\2\u034a\u034c\7\u00db\2\2\u034b\u034d\7\u00e4\2\2\u034c\u034b\3\2\2"+
		"\2\u034c\u034d\3\2\2\2\u034d\u03f1\3\2\2\2\u034e\u0350\7\u00da\2\2\u034f"+
		"\u0351\7\u00e4\2\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u03f1"+
		"\3\2\2\2\u0352\u0353\7_\2\2\u0353\u03f1\7\u00db\2\2\u0354\u0355\7_\2\2"+
		"\u0355\u0357\7\u00e4\2\2\u0356\u0358\7\u00db\2\2\u0357\u0356\3\2\2\2\u0357"+
		"\u0358\3\2\2\2\u0358\u03f1\3\2\2\2\u0359\u035a\7_\2\2\u035a\u03f1\7\u00e7"+
		"\2\2\u035b\u035c\7_\2\2\u035c\u03f1\7\u00e5\2\2\u035d\u035e\7_\2\2\u035e"+
		"\u035f\7I\2\2\u035f\u03f1\7\u00e5\2\2\u0360\u0361\7\u00e1\2\2\u0361\u03f1"+
		"\7Q\2\2\u0362\u0363\7\u00e2\2\2\u0363\u03f1\7Q\2\2\u0364\u0365\7_\2\2"+
		"\u0365\u03f1\7\u00e6\2\2\u0366\u0367\7_\2\2\u0367\u0368\7P\2\2\u0368\u03f1"+
		"\7Q\2\2\u0369\u036a\7_\2\2\u036a\u03f1\7\u00e8\2\2\u036b\u036c\7_\2\2"+
		"\u036c\u03f1\7\u00ea\2\2\u036d\u036e\7_\2\2\u036e\u03f1\7\u00eb\2\2\u036f"+
		"\u0370\7P\2\2\u0370\u03f1\7\u00e9\2\2\u0371\u0372\7f\2\2\u0372\u03f1\7"+
		"\u00e9\2\2\u0373\u0374\7n\2\2\u0374\u03f1\7\u00e9\2\2\u0375\u0376\7\u00dc"+
		"\2\2\u0376\u03f1\7Q\2\2\u0377\u0378\7\u00dc\2\2\u0378\u03f1\7\u00cf\2"+
		"\2\u0379\u037a\7\u00dd\2\2\u037a\u03f1\7Q\2\2\u037b\u037c\7\u00dd\2\2"+
		"\u037c\u03f1\7\u00cf\2\2\u037d\u037e\7P\2\2\u037e\u037f\7\u00b6\2\2\u037f"+
		"\u03f1\7{\2\2\u0380\u0381\7f\2\2\u0381\u0382\7\u00b6\2\2\u0382\u03f1\7"+
		"{\2\2\u0383\u0384\7n\2\2\u0384\u0385\7Q\2\2\u0385\u0386\5\u008aF\2\u0386"+
		"\u0387\7!\2\2\u0387\u0388\7\u00ca\2\2\u0388\u03f1\3\2\2\2\u0389\u038a"+
		"\7n\2\2\u038a\u038b\7Q\2\2\u038b\u038c\5\u008aF\2\u038c\u038d\7\u00ca"+
		"\2\2\u038d\u038e\7\25\2\2\u038e\u03f1\3\2\2\2\u038f\u0390\7n\2\2\u0390"+
		"\u0391\7Q\2\2\u0391\u0392\5\u008aF\2\u0392\u0393\7!\2\2\u0393\u0394\7"+
		"\u00cb\2\2\u0394\u03f1\3\2\2\2\u0395\u0396\7n\2\2\u0396\u0397\7Q\2\2\u0397"+
		"\u0398\5\u008aF\2\u0398\u0399\7\u00bc\2\2\u0399\u039a\7\25\2\2\u039a\u03f1"+
		"\3\2\2\2\u039b\u039c\7n\2\2\u039c\u039d\7Q\2\2\u039d\u039e\5\u008aF\2"+
		"\u039e\u039f\7!\2\2\u039f\u03a0\7\u00bc\2\2\u03a0\u03f1\3\2\2\2\u03a1"+
		"\u03a2\7n\2\2\u03a2\u03a3\7Q\2\2\u03a3\u03a4\5\u008aF\2\u03a4\u03a5\7"+
		"!\2\2\u03a5\u03a6\7\u00bd\2\2\u03a6\u03a7\7\17\2\2\u03a7\u03a8\7\u00be"+
		"\2\2\u03a8\u03f1\3\2\2\2\u03a9\u03aa\7n\2\2\u03aa\u03ab\7Q\2\2\u03ab\u03ac"+
		"\5\u008aF\2\u03ac\u03ad\7t\2\2\u03ad\u03ae\7\u00bc\2\2\u03ae\u03af\7\u00bf"+
		"\2\2\u03af\u03f1\3\2\2\2\u03b0\u03b1\7n\2\2\u03b1\u03b2\7Q\2\2\u03b2\u03b3"+
		"\5\u008aF\2\u03b3\u03b4\7\u00c0\2\2\u03b4\u03b5\7C\2\2\u03b5\u03f1\3\2"+
		"\2\2\u03b6\u03b7\7n\2\2\u03b7\u03b8\7Q\2\2\u03b8\u03b9\5\u008aF\2\u03b9"+
		"\u03ba\7\u00c1\2\2\u03ba\u03bb\7C\2\2\u03bb\u03f1\3\2\2\2\u03bc\u03bd"+
		"\7n\2\2\u03bd\u03be\7Q\2\2\u03be\u03bf\5\u008aF\2\u03bf\u03c0\7\u00c2"+
		"\2\2\u03c0\u03c1\7C\2\2\u03c1\u03f1\3\2\2\2\u03c2\u03c3\7n\2\2\u03c3\u03c4"+
		"\7Q\2\2\u03c4\u03c5\5\u008aF\2\u03c5\u03c6\7\u00c4\2\2\u03c6\u03f1\3\2"+
		"\2\2\u03c7\u03c8\7n\2\2\u03c8\u03c9\7Q\2\2\u03c9\u03cb\5\u008aF\2\u03ca"+
		"\u03cc\5 \21\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2"+
		"\2\2\u03cd\u03ce\7\u00c5\2\2\u03ce\u03f1\3\2\2\2\u03cf\u03d0\7n\2\2\u03d0"+
		"\u03d1\7Q\2\2\u03d1\u03d3\5\u008aF\2\u03d2\u03d4\5 \21\2\u03d3\u03d2\3"+
		"\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\7\u00c6\2\2"+
		"\u03d6\u03f1\3\2\2\2\u03d7\u03d8\7n\2\2\u03d8\u03d9\7Q\2\2\u03d9\u03db"+
		"\5\u008aF\2\u03da\u03dc\5 \21\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2"+
		"\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\7t\2\2\u03de\u03df\7\u00c3\2\2\u03df"+
		"\u03f1\3\2\2\2\u03e0\u03e1\7n\2\2\u03e1\u03e2\7Q\2\2\u03e2\u03e4\5\u008a"+
		"F\2\u03e3\u03e5\5 \21\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5"+
		"\u03e6\3\2\2\2\u03e6\u03e7\7T\2\2\u03e7\u03e8\7a\2\2\u03e8\u03f1\3\2\2"+
		"\2\u03e9\u03ea\7w\2\2\u03ea\u03f1\7x\2\2\u03eb\u03f1\7y\2\2\u03ec\u03f1"+
		"\7z\2\2\u03ed\u03f1\7\u00d1\2\2\u03ee\u03ef\7V\2\2\u03ef\u03f1\7\r\2\2"+
		"\u03f0\u0346\3\2\2\2\u03f0\u0348\3\2\2\2\u03f0\u034a\3\2\2\2\u03f0\u034e"+
		"\3\2\2\2\u03f0\u0352\3\2\2\2\u03f0\u0354\3\2\2\2\u03f0\u0359\3\2\2\2\u03f0"+
		"\u035b\3\2\2\2\u03f0\u035d\3\2\2\2\u03f0\u0360\3\2\2\2\u03f0\u0362\3\2"+
		"\2\2\u03f0\u0364\3\2\2\2\u03f0\u0366\3\2\2\2\u03f0\u0369\3\2\2\2\u03f0"+
		"\u036b\3\2\2\2\u03f0\u036d\3\2\2\2\u03f0\u036f\3\2\2\2\u03f0\u0371\3\2"+
		"\2\2\u03f0\u0373\3\2\2\2\u03f0\u0375\3\2\2\2\u03f0\u0377\3\2\2\2\u03f0"+
		"\u0379\3\2\2\2\u03f0\u037b\3\2\2\2\u03f0\u037d\3\2\2\2\u03f0\u0380\3\2"+
		"\2\2\u03f0\u0383\3\2\2\2\u03f0\u0389\3\2\2\2\u03f0\u038f\3\2\2\2\u03f0"+
		"\u0395\3\2\2\2\u03f0\u039b\3\2\2\2\u03f0\u03a1\3\2\2\2\u03f0\u03a9\3\2"+
		"\2\2\u03f0\u03b0\3\2\2\2\u03f0\u03b6\3\2\2\2\u03f0\u03bc\3\2\2\2\u03f0"+
		"\u03c2\3\2\2\2\u03f0\u03c7\3\2\2\2\u03f0\u03cf\3\2\2\2\u03f0\u03d7\3\2"+
		"\2\2\u03f0\u03e0\3\2\2\2\u03f0\u03e9\3\2\2\2\u03f0\u03eb\3\2\2\2\u03f0"+
		"\u03ec\3\2\2\2\u03f0\u03ed\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\21\3\2\2"+
		"\2\u03f2\u03f4\7P\2\2\u03f3\u03f5\7\u00b6\2\2\u03f4\u03f3\3\2\2\2\u03f4"+
		"\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f8\7\u00d8\2\2\u03f7\u03f6"+
		"\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fd\7Q\2\2\u03fa"+
		"\u03fb\7\u0080\2\2\u03fb\u03fc\7!\2\2\u03fc\u03fe\7#\2\2\u03fd\u03fa\3"+
		"\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\5\u008aF\2"+
		"\u0400\23\3\2\2\2\u0401\u0402\7\u00ca\2\2\u0402\u0403\7\25\2\2\u0403\u0407"+
		"\5t;\2\u0404\u0405\7\u00cb\2\2\u0405\u0406\7\25\2\2\u0406\u0408\5x=\2"+
		"\u0407\u0404\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a"+
		"\7W\2\2\u040a\u040b\7\u00f4\2\2\u040b\u040c\7\u00bb\2\2\u040c\25\3\2\2"+
		"\2\u040d\u040e\7\u00bc\2\2\u040e\u040f\7\25\2\2\u040f\u0410\5t;\2\u0410"+
		"\u0413\7>\2\2\u0411\u0414\5\66\34\2\u0412\u0414\58\35\2\u0413\u0411\3"+
		"\2\2\2\u0413\u0412\3\2\2\2\u0414\u0418\3\2\2\2\u0415\u0416\7\u00bd\2\2"+
		"\u0416\u0417\7\17\2\2\u0417\u0419\7\u00be\2\2\u0418\u0415\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\27\3\2\2\2\u041a\u041b\7\u00bf\2\2\u041b\u041c\7"+
		"\u00f0\2\2\u041c\31\3\2\2\2\u041d\u041e\5(\25\2\u041e\u041f\b\16\1\2\u041f"+
		"\u0421\3\2\2\2\u0420\u041d\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2"+
		"\2\2\u0422\u0423\5B\"\2\u0423\u0424\b\16\1\2\u0424\33\3\2\2\2\u0425\u0426"+
		"\7U\2\2\u0426\u0427\7\u009c\2\2\u0427\u0428\7Q\2\2\u0428\u042f\5\u008a"+
		"F\2\u0429\u042d\5 \21\2\u042a\u042b\7\u0080\2\2\u042b\u042c\7!\2\2\u042c"+
		"\u042e\7#\2\2\u042d\u042a\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0430\3\2"+
		"\2\2\u042f\u0429\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0456\3\2\2\2\u0431"+
		"\u0432\7U\2\2\u0432\u0434\7W\2\2\u0433\u0435\7Q\2\2\u0434\u0433\3\2\2"+
		"\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\5\u008aF\2\u0437"+
		"\u0439\5 \21\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u0456\3\2"+
		"\2\2\u043a\u043b\7U\2\2\u043b\u043d\7\u009c\2\2\u043c\u043e\7\u00ee\2"+
		"\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440"+
		"\7R\2\2\u0440\u0442\7\u00f0\2\2\u0441\u0443\5\u0088E\2\u0442\u0441\3\2"+
		"\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2\2\2\u0444\u0446\5:\36\2\u0445"+
		"\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0456\3\2\2\2\u0447\u0448\7U"+
		"\2\2\u0448\u044a\7\u009c\2\2\u0449\u044b\7\u00ee\2\2\u044a\u0449\3\2\2"+
		"\2\u044a\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044e\7R\2\2\u044d\u044f"+
		"\7\u00f0\2\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2"+
		"\2\u0450\u0453\5,\27\2\u0451\u0452\7\u00b7\2\2\u0452\u0454\5.\30\2\u0453"+
		"\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u0425\3\2"+
		"\2\2\u0455\u0431\3\2\2\2\u0455\u043a\3\2\2\2\u0455\u0447\3\2\2\2\u0456"+
		"\35\3\2\2\2\u0457\u0459\5 \21\2\u0458\u045a\5\30\r\2\u0459\u0458\3\2\2"+
		"\2\u0459\u045a\3\2\2\2\u045a\37\3\2\2\2\u045b\u045c\7C\2\2\u045c\u045d"+
		"\7\4\2\2\u045d\u0462\5\"\22\2\u045e\u045f\7\t\2\2\u045f\u0461\5\"\22\2"+
		"\u0460\u045e\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463"+
		"\3\2\2\2\u0463\u0465\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u0466\7\6\2\2\u0466"+
		"!\3\2\2\2\u0467\u046a\5\u00c8e\2\u0468\u0469\7\u0082\2\2\u0469\u046b\5"+
		"\u009eP\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b#\3\2\2\2\u046c"+
		"\u0472\5\u00c6d\2\u046d\u0472\7\u00f0\2\2\u046e\u0472\5\u00a0Q\2\u046f"+
		"\u0472\5\u00a2R\2\u0470\u0472\5\u00a4S\2\u0471\u046c\3\2\2\2\u0471\u046d"+
		"\3\2\2\2\u0471\u046e\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0470\3\2\2\2\u0472"+
		"%\3\2\2\2\u0473\u0478\5\u00c8e\2\u0474\u0475\7\13\2\2\u0475\u0477\5\u00c8"+
		"e\2\u0476\u0474\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476\3\2\2\2\u0478"+
		"\u0479\3\2\2\2\u0479\'\3\2\2\2\u047a\u0478\3\2\2\2\u047b\u047c\7N\2\2"+
		"\u047c\u047d\5*\26\2\u047d\u0484\b\25\1\2\u047e\u047f\7\t\2\2\u047f\u0480"+
		"\5*\26\2\u0480\u0481\b\25\1\2\u0481\u0483\3\2\2\2\u0482\u047e\3\2\2\2"+
		"\u0483\u0486\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485)\3"+
		"\2\2\2\u0486\u0484\3\2\2\2\u0487\u0489\5\u00c8e\2\u0488\u048a\7\17\2\2"+
		"\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c"+
		"\7\4\2\2\u048c\u048d\5\32\16\2\u048d\u048e\7\6\2\2\u048e\u048f\b\26\1"+
		"\2\u048f+\3\2\2\2\u0490\u0491\7\u009f\2\2\u0491\u0492\5\u00c6d\2\u0492"+
		"-\3\2\2\2\u0493\u0494\7\4\2\2\u0494\u0499\5\60\31\2\u0495\u0496\7\t\2"+
		"\2\u0496\u0498\5\60\31\2\u0497\u0495\3\2\2\2\u0498\u049b\3\2\2\2\u0499"+
		"\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\3\2\2\2\u049b\u0499\3\2"+
		"\2\2\u049c\u049d\7\6\2\2\u049d/\3\2\2\2\u049e\u04a3\5\62\32\2\u049f\u04a1"+
		"\7\u0082\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2"+
		"\2\u04a2\u04a4\5\64\33\2\u04a3\u04a0\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\61\3\2\2\2\u04a5\u04aa\5\u00c8e\2\u04a6\u04a7\7\13\2\2\u04a7\u04a9\5"+
		"\u00c8e\2\u04a8\u04a6\3\2\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2"+
		"\u04aa\u04ab\3\2\2\2\u04ab\u04af\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04af"+
		"\7\u00f0\2\2\u04ae\u04a5\3\2\2\2\u04ae\u04ad\3\2\2\2\u04af\63\3\2\2\2"+
		"\u04b0\u04b5\7\u00f4\2\2\u04b1\u04b5\7\u00f5\2\2\u04b2\u04b5\5\u00a6T"+
		"\2\u04b3\u04b5\7\u00f0\2\2\u04b4\u04b0\3\2\2\2\u04b4\u04b1\3\2\2\2\u04b4"+
		"\u04b2\3\2\2\2\u04b4\u04b3\3\2\2\2\u04b5\65\3\2\2\2\u04b6\u04b7\7\4\2"+
		"\2\u04b7\u04bc\5\u009eP\2\u04b8\u04b9\7\t\2\2\u04b9\u04bb\5\u009eP\2\u04ba"+
		"\u04b8\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bd\3\2"+
		"\2\2\u04bd\u04bf\3\2\2\2\u04be\u04bc\3\2\2\2\u04bf\u04c0\7\6\2\2\u04c0"+
		"\67\3\2\2\2\u04c1\u04c2\7\4\2\2\u04c2\u04c7\5\66\34\2\u04c3\u04c4\7\t"+
		"\2\2\u04c4\u04c6\5\66\34\2\u04c5\u04c3\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7"+
		"\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04c7\3\2"+
		"\2\2\u04ca\u04cb\7\6\2\2\u04cb9\3\2\2\2\u04cc\u04cd\7\u00bd\2\2\u04cd"+
		"\u04ce\7\17\2\2\u04ce\u04d3\5<\37\2\u04cf\u04d0\7\u00bd\2\2\u04d0\u04d1"+
		"\7\25\2\2\u04d1\u04d3\5> \2\u04d2\u04cc\3\2\2\2\u04d2\u04cf\3\2\2\2\u04d3"+
		";\3\2\2\2\u04d4\u04d5\7\u00cd\2\2\u04d5\u04d6\7\u00f0\2\2\u04d6\u04d7"+
		"\7\u00ce\2\2\u04d7\u04da\7\u00f0\2\2\u04d8\u04da\5\u00c8e\2\u04d9\u04d4"+
		"\3\2\2\2\u04d9\u04d8\3\2\2\2\u04da=\3\2\2\2\u04db\u04df\7\u00f0\2\2\u04dc"+
		"\u04dd\7N\2\2\u04dd\u04de\7\u00a1\2\2\u04de\u04e0\5.\30\2\u04df\u04dc"+
		"\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0?\3\2\2\2\u04e1\u04e2\5\u00c8e\2\u04e2"+
		"\u04e3\7\u00f0\2\2\u04e3A\3\2\2\2\u04e4\u04e6\5\34\17\2\u04e5\u04e4\3"+
		"\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\5H%\2\u04e8"+
		"\u04e9\5D#\2\u04e9\u04ea\b\"\1\2\u04ea\u04f2\3\2\2\2\u04eb\u04ed\5\\/"+
		"\2\u04ec\u04ee\5F$\2\u04ed\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04ed"+
		"\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04e5\3\2\2\2\u04f1"+
		"\u04eb\3\2\2\2\u04f2C\3\2\2\2\u04f3\u04f4\7\32\2\2\u04f4\u04f5\7\25\2"+
		"\2\u04f5\u04f6\5L\'\2\u04f6\u04fd\b#\1\2\u04f7\u04f8\7\t\2\2\u04f8\u04f9"+
		"\5L\'\2\u04f9\u04fa\b#\1\2\u04fa\u04fc\3\2\2\2\u04fb\u04f7\3\2\2\2\u04fc"+
		"\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0501\3\2"+
		"\2\2\u04ff\u04fd\3\2\2\2\u0500\u04f3\3\2\2\2\u0500\u0501\3\2\2\2\u0501"+
		"\u050f\3\2\2\2\u0502\u0503\7\u009a\2\2\u0503\u0504\7\25\2\2\u0504\u0505"+
		"\5\u0092J\2\u0505\u050c\b#\1\2\u0506\u0507\7\t\2\2\u0507\u0508\5\u0092"+
		"J\2\u0508\u0509\b#\1\2\u0509\u050b\3\2\2\2\u050a\u0506\3\2\2\2\u050b\u050e"+
		"\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0510\3\2\2\2\u050e"+
		"\u050c\3\2\2\2\u050f\u0502\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u051e\3\2"+
		"\2\2\u0511\u0512\7\u009b\2\2\u0512\u0513\7\25\2\2\u0513\u0514\5\u0092"+
		"J\2\u0514\u051b\b#\1\2\u0515\u0516\7\t\2\2\u0516\u0517\5\u0092J\2\u0517"+
		"\u0518\b#\1\2\u0518\u051a\3\2\2\2\u0519\u0515\3\2\2\2\u051a\u051d\3\2"+
		"\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051f\3\2\2\2\u051d"+
		"\u051b\3\2\2\2\u051e\u0511\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u052d\3\2"+
		"\2\2\u0520\u0521\7\u0099\2\2\u0521\u0522\7\25\2\2\u0522\u0523\5L\'\2\u0523"+
		"\u052a\b#\1\2\u0524\u0525\7\t\2\2\u0525\u0526\5L\'\2\u0526\u0527\b#\1"+
		"\2\u0527\u0529\3\2\2\2\u0528\u0524\3\2\2\2\u0529\u052c\3\2\2\2\u052a\u0528"+
		"\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052e\3\2\2\2\u052c\u052a\3\2\2\2\u052d"+
		"\u0520\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u0531\5\u00bc"+
		"_\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u053a\3\2\2\2\u0532"+
		"\u0538\7\34\2\2\u0533\u0534\7\20\2\2\u0534\u0539\b#\1\2\u0535\u0536\5"+
		"\u0092J\2\u0536\u0537\b#\1\2\u0537\u0539\3\2\2\2\u0538\u0533\3\2\2\2\u0538"+
		"\u0535\3\2\2\2\u0539\u053b\3\2\2\2\u053a\u0532\3\2\2\2\u053a\u053b\3\2"+
		"\2\2\u053bE\3\2\2\2\u053c\u053e\5\34\17\2\u053d\u053c\3\2\2\2\u053d\u053e"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\5N(\2\u0540\u0541\5D#\2\u0541"+
		"G\3\2\2\2\u0542\u0543\b%\1\2\u0543\u0544\5J&\2\u0544\u0545\b%\1\2\u0545"+
		"\u0550\3\2\2\2\u0546\u0547\f\3\2\2\u0547\u0549\t\t\2\2\u0548\u054a\5f"+
		"\64\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u054c\5H%\4\u054c\u054d\b%\1\2\u054d\u054f\3\2\2\2\u054e\u0546\3\2\2"+
		"\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551I"+
		"\3\2\2\2\u0552\u0550\3\2\2\2\u0553\u0554\5N(\2\u0554\u0555\b&\1\2\u0555"+
		"\u055f\3\2\2\2\u0556\u0557\7Q\2\2\u0557\u055f\5\u008aF\2\u0558\u055f\5"+
		"\u0082B\2\u0559\u055a\7\4\2\2\u055a\u055b\5B\"\2\u055b\u055c\7\6\2\2\u055c"+
		"\u055d\b&\1\2\u055d\u055f\3\2\2\2\u055e\u0553\3\2\2\2\u055e\u0556\3\2"+
		"\2\2\u055e\u0558\3\2\2\2\u055e\u0559\3\2\2\2\u055fK\3\2\2\2\u0560\u0561"+
		"\5\u0092J\2\u0561\u0564\b\'\1\2\u0562\u0563\t\n\2\2\u0563\u0565\b\'\1"+
		"\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0569\3\2\2\2\u0566\u0567"+
		"\7+\2\2\u0567\u0568\t\13\2\2\u0568\u056a\b\'\1\2\u0569\u0566\3\2\2\2\u0569"+
		"\u056a\3\2\2\2\u056aM\3\2\2\2\u056b\u056c\7\f\2\2\u056c\u056d\7\u009d"+
		"\2\2\u056d\u056e\7\4\2\2\u056e\u056f\5\u0090I\2\u056f\u0570\7\6\2\2\u0570"+
		"\u0576\3\2\2\2\u0571\u0572\7q\2\2\u0572\u0576\5\u0090I\2\u0573\u0574\7"+
		"\u009e\2\2\u0574\u0576\5\u0090I\2\u0575\u056b\3\2\2\2\u0575\u0571\3\2"+
		"\2\2\u0575\u0573\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0579\5\u0088E\2\u0578"+
		"\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057c\3\2\2\2\u057a\u057b\7\u00a3"+
		"\2\2\u057b\u057d\7\u00f0\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d"+
		"\u057e\3\2\2\2\u057e\u057f\7\u009f\2\2\u057f\u058c\7\u00f0\2\2\u0580\u058a"+
		"\7\17\2\2\u0581\u058b\5v<\2\u0582\u058b\5\u00b2Z\2\u0583\u0586\7\4\2\2"+
		"\u0584\u0587\5v<\2\u0585\u0587\5\u00b2Z\2\u0586\u0584\3\2\2\2\u0586\u0585"+
		"\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\7\6\2\2\u0589\u058b\3\2\2\2\u058a"+
		"\u0581\3\2\2\2\u058a\u0582\3\2\2\2\u058a\u0583\3\2\2\2\u058b\u058d\3\2"+
		"\2\2\u058c\u0580\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058f\3\2\2\2\u058e"+
		"\u0590\5\u0088E\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0593"+
		"\3\2\2\2\u0591\u0592\7\u00a2\2\2\u0592\u0594\7\u00f0\2\2\u0593\u0591\3"+
		"\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\3\2\2\2\u0595\u0597\5\\/\2\u0596"+
		"\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u059a\3\2\2\2\u0598\u0599\7\23"+
		"\2\2\u0599\u059b\5\u0094K\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b"+
		"\u05df\3\2\2\2\u059c\u05a2\7\f\2\2\u059d\u059e\5P)\2\u059e\u059f\b(\1"+
		"\2\u059f\u05a1\3\2\2\2\u05a0\u059d\3\2\2\2\u05a1\u05a4\3\2\2\2\u05a2\u05a0"+
		"\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a8\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a5"+
		"\u05a6\5f\64\2\u05a6\u05a7\b(\1\2\u05a7\u05a9\3\2\2\2\u05a8\u05a5\3\2"+
		"\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\5\u0090I\2\u05ab"+
		"\u05af\b(\1\2\u05ac\u05ad\5\\/\2\u05ad\u05ae\b(\1\2\u05ae\u05b0\3\2\2"+
		"\2\u05af\u05ac\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05bf\3\2\2\2\u05b1\u05b2"+
		"\5\\/\2\u05b2\u05bc\b(\1\2\u05b3\u05b7\7\f\2\2\u05b4\u05b5\5f\64\2\u05b5"+
		"\u05b6\b(\1\2\u05b6\u05b8\3\2\2\2\u05b7\u05b4\3\2\2\2\u05b7\u05b8\3\2"+
		"\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\5\u0090I\2\u05ba\u05bb\b(\1\2\u05bb"+
		"\u05bd\3\2\2\2\u05bc\u05b3\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2"+
		"\2\2\u05be\u059c\3\2\2\2\u05be\u05b1\3\2\2\2\u05bf\u05c5\3\2\2\2\u05c0"+
		"\u05c1\5d\63\2\u05c1\u05c2\b(\1\2\u05c2\u05c4\3\2\2\2\u05c3\u05c0\3\2"+
		"\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6"+
		"\u05cc\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8\u05c9\7\23\2\2\u05c9\u05ca\5"+
		"\u0094K\2\u05ca\u05cb\b(\1\2\u05cb\u05cd\3\2\2\2\u05cc\u05c8\3\2\2\2\u05cc"+
		"\u05cd\3\2\2\2\u05cd\u05d1\3\2\2\2\u05ce\u05cf\5^\60\2\u05cf\u05d0\b("+
		"\1\2\u05d0\u05d2\3\2\2\2\u05d1\u05ce\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2"+
		"\u05d7\3\2\2\2\u05d3\u05d4\7\33\2\2\u05d4\u05d5\5\u0094K\2\u05d5\u05d6"+
		"\b(\1\2\u05d6\u05d8\3\2\2\2\u05d7\u05d3\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8"+
		"\u05da\3\2\2\2\u05d9\u05db\5\u00bc_\2\u05da\u05d9\3\2\2\2\u05da\u05db"+
		"\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd\b(\1\2\u05dd\u05df\3\2\2\2\u05de"+
		"\u0575\3\2\2\2\u05de\u05be\3\2\2\2\u05dfO\3\2\2\2\u05e0\u05e1\7\5\2\2"+
		"\u05e1\u05e2\5R*\2\u05e2\u05eb\b)\1\2\u05e3\u05e5\7\t\2\2\u05e4\u05e3"+
		"\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\5R*\2\u05e7"+
		"\u05e8\b)\1\2\u05e8\u05ea\3\2\2\2\u05e9\u05e4\3\2\2\2\u05ea\u05ed\3\2"+
		"\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed"+
		"\u05eb\3\2\2\2\u05ee\u05ef\7\3\2\2\u05efQ\3\2\2\2\u05f0\u05ff\5\u00c8"+
		"e\2\u05f1\u05f2\5\u00c8e\2\u05f2\u05f3\7\4\2\2\u05f3\u05f8\5\u009cO\2"+
		"\u05f4\u05f5\7\t\2\2\u05f5\u05f7\5\u009cO\2\u05f6\u05f4\3\2\2\2\u05f7"+
		"\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fb\3\2"+
		"\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05fc\7\6\2\2\u05fc\u05ff\3\2\2\2\u05fd"+
		"\u05ff\5T+\2\u05fe\u05f0\3\2\2\2\u05fe\u05f1\3\2\2\2\u05fe\u05fd\3\2\2"+
		"\2\u05ffS\3\2\2\2\u0600\u0601\b+\1\2\u0601\u0602\5V,\2\u0602\u060b\3\2"+
		"\2\2\u0603\u0604\f\4\2\2\u0604\u0605\7\37\2\2\u0605\u060a\5T+\5\u0606"+
		"\u0607\f\3\2\2\u0607\u0608\7\36\2\2\u0608\u060a\5T+\4\u0609\u0603\3\2"+
		"\2\2\u0609\u0606\3\2\2\2\u060a\u060d\3\2\2\2\u060b\u0609\3\2\2\2\u060b"+
		"\u060c\3\2\2\2\u060cU\3\2\2\2\u060d\u060b\3\2\2\2\u060e\u0610\5Z.\2\u060f"+
		"\u0611\5X-\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611W\3\2\2\2\u0612"+
		"\u0614\7!\2\2\u0613\u0612\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\3\2"+
		"\2\2\u0615\u0616\7$\2\2\u0616\u0617\5Z.\2\u0617\u0618\7\37\2\2\u0618\u0619"+
		"\5Z.\2\u0619\u062a\3\2\2\2\u061a\u061c\7!\2\2\u061b\u061a\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e\7 \2\2\u061e\u061f\7\4"+
		"\2\2\u061f\u0624\5\u0092J\2\u0620\u0621\7\t\2\2\u0621\u0623\5\u0092J\2"+
		"\u0622\u0620\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0622\3\2\2\2\u0624\u0625"+
		"\3\2\2\2\u0625\u0627\3\2\2\2\u0626\u0624\3\2\2\2\u0627\u0628\7\6\2\2\u0628"+
		"\u062a\3\2\2\2\u0629\u0613\3\2\2\2\u0629\u061b\3\2\2\2\u062aY\3\2\2\2"+
		"\u062b\u062c\b.\1\2\u062c\u0632\7\u00f0\2\2\u062d\u062e\5\u00c8e\2\u062e"+
		"\u062f\7\13\2\2\u062f\u0630\5\u00c8e\2\u0630\u0632\3\2\2\2\u0631\u062b"+
		"\3\2\2\2\u0631\u062d\3\2\2\2\u0632\u0639\3\2\2\2\u0633\u0634\f\3\2\2\u0634"+
		"\u0635\5\u00a0Q\2\u0635\u0636\5Z.\4\u0636\u0638\3\2\2\2\u0637\u0633\3"+
		"\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a"+
		"[\3\2\2\2\u063b\u0639\3\2\2\2\u063c\u063d\7\r\2\2\u063d\u063e\5h\65\2"+
		"\u063e\u0645\b/\1\2\u063f\u0640\7\t\2\2\u0640\u0641\5h\65\2\u0641\u0642"+
		"\b/\1\2\u0642\u0644\3\2\2\2\u0643\u063f\3\2\2\2\u0644\u0647\3\2\2\2\u0645"+
		"\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u064d\3\2\2\2\u0647\u0645\3\2"+
		"\2\2\u0648\u0649\5d\63\2\u0649\u064a\b/\1\2\u064a\u064c\3\2\2\2\u064b"+
		"\u0648\3\2\2\2\u064c\u064f\3\2\2\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2"+
		"\2\2\u064e\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u0650\u0652\5b\62\2\u0651"+
		"\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652]\3\2\2\2\u0653\u0654\7\24\2\2"+
		"\u0654\u0655\7\25\2\2\u0655\u0656\5\u0092J\2\u0656\u065d\b\60\1\2\u0657"+
		"\u0658\7\t\2\2\u0658\u0659\5\u0092J\2\u0659\u065a\b\60\1\2\u065a\u065c"+
		"\3\2\2\2\u065b\u0657\3\2\2\2\u065c\u065f\3\2\2\2\u065d\u065b\3\2\2\2\u065d"+
		"\u065e\3\2\2\2\u065e\u0671\3\2\2\2\u065f\u065d\3\2\2\2\u0660\u0661\7N"+
		"\2\2\u0661\u0672\7\31\2\2\u0662\u0663\7N\2\2\u0663\u0672\7\30\2\2\u0664"+
		"\u0665\7\26\2\2\u0665\u0666\7\27\2\2\u0666\u0667\7\4\2\2\u0667\u066c\5"+
		"`\61\2\u0668\u0669\7\t\2\2\u0669\u066b\5`\61\2\u066a\u0668\3\2\2\2\u066b"+
		"\u066e\3\2\2\2\u066c\u066a\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066f\3\2"+
		"\2\2\u066e\u066c\3\2\2\2\u066f\u0670\7\6\2\2\u0670\u0672\3\2\2\2\u0671"+
		"\u0660\3\2\2\2\u0671\u0662\3\2\2\2\u0671\u0664\3\2\2\2\u0671\u0672\3\2"+
		"\2\2\u0672_\3\2\2\2\u0673\u067c\7\4\2\2\u0674\u0679\5\u0092J\2\u0675\u0676"+
		"\7\t\2\2\u0676\u0678\5\u0092J\2\u0677\u0675\3\2\2\2\u0678\u067b\3\2\2"+
		"\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067d\3\2\2\2\u067b\u0679"+
		"\3\2\2\2\u067c\u0674\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e\3\2\2\2\u067e"+
		"\u0681\7\6\2\2\u067f\u0681\5\u0092J\2\u0680\u0673\3\2\2\2\u0680\u067f"+
		"\3\2\2\2\u0681a\3\2\2\2\u0682\u0683\7?\2\2\u0683\u0684\7\4\2\2\u0684\u0685"+
		"\5\u0090I\2\u0685\u0686\7.\2\2\u0686\u0687\5\u00c8e\2\u0687\u0688\7 \2"+
		"\2\u0688\u0689\7\4\2\2\u0689\u068e\5\u009eP\2\u068a\u068b\7\t\2\2\u068b"+
		"\u068d\5\u009eP\2\u068c\u068a\3\2\2\2\u068d\u0690\3\2\2\2\u068e\u068c"+
		"\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0691\3\2\2\2\u0690\u068e\3\2\2\2\u0691"+
		"\u0692\7\6\2\2\u0692\u0693\7\6\2\2\u0693c\3\2\2\2\u0694\u0695\7@\2\2\u0695"+
		"\u0698\7S\2\2\u0696\u0697\7\67\2\2\u0697\u0699\b\63\1\2\u0698\u0696\3"+
		"\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069b\5\u00c6d\2"+
		"\u069b\u069c\b\63\1\2\u069c\u06a5\7\4\2\2\u069d\u06a2\5\u0092J\2\u069e"+
		"\u069f\7\t\2\2\u069f\u06a1\5\u0092J\2\u06a0\u069e\3\2\2\2\u06a1\u06a4"+
		"\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a6\3\2\2\2\u06a4"+
		"\u06a2\3\2\2\2\u06a5\u069d\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\3\2"+
		"\2\2\u06a7\u06a8\7\6\2\2\u06a8\u06a9\5\u00c8e\2\u06a9\u06b8\b\63\1\2\u06aa"+
		"\u06ac\7\17\2\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\3"+
		"\2\2\2\u06ad\u06ae\5\u00c8e\2\u06ae\u06b5\b\63\1\2\u06af\u06b0\7\t\2\2"+
		"\u06b0\u06b1\5\u00c8e\2\u06b1\u06b2\b\63\1\2\u06b2\u06b4\3\2\2\2\u06b3"+
		"\u06af\3\2\2\2\u06b4\u06b7\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b5\u06b6\3\2"+
		"\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b8\u06ab\3\2\2\2\u06b8"+
		"\u06b9\3\2\2\2\u06b9e\3\2\2\2\u06ba\u06bb\7\22\2\2\u06bb\u06bf\b\64\1"+
		"\2\u06bc\u06bd\7\20\2\2\u06bd\u06bf\b\64\1\2\u06be\u06ba\3\2\2\2\u06be"+
		"\u06bc\3\2\2\2\u06bfg\3\2\2\2\u06c0\u06c1\5\u0080A\2\u06c1\u06c7\b\65"+
		"\1\2\u06c2\u06c3\5j\66\2\u06c3\u06c4\b\65\1\2\u06c4\u06c6\3\2\2\2\u06c5"+
		"\u06c2\3\2\2\2\u06c6\u06c9\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7\u06c8\3\2"+
		"\2\2\u06c8i\3\2\2\2\u06c9\u06c7\3\2\2\2\u06ca\u06cb\5l\67\2\u06cb\u06cc"+
		"\7\65\2\2\u06cc\u06cd\5\u0080A\2\u06cd\u06d1\b\66\1\2\u06ce\u06cf\5n8"+
		"\2\u06cf\u06d0\b\66\1\2\u06d0\u06d2\3\2\2\2\u06d1\u06ce\3\2\2\2\u06d1"+
		"\u06d2\3\2\2\2\u06d2\u06da\3\2\2\2\u06d3\u06d4\7=\2\2\u06d4\u06d5\5l\67"+
		"\2\u06d5\u06d6\7\65\2\2\u06d6\u06d7\5\u0080A\2\u06d7\u06d8\b\66\1\2\u06d8"+
		"\u06da\3\2\2\2\u06d9\u06ca\3\2\2\2\u06d9\u06d3\3\2\2\2\u06dak\3\2\2\2"+
		"\u06db\u06dd\78\2\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06de"+
		"\3\2\2\2\u06de\u06fe\b\67\1\2\u06df\u06e0\7\66\2\2\u06e0\u06fe\b\67\1"+
		"\2\u06e1\u06e2\79\2\2\u06e2\u06e5\b\67\1\2\u06e3\u06e4\7\67\2\2\u06e4"+
		"\u06e6\b\67\1\2\u06e5\u06e3\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06fe\3"+
		"\2\2\2\u06e7\u06e8\79\2\2\u06e8\u06e9\7:\2\2\u06e9\u06fe\b\67\1\2\u06ea"+
		"\u06eb\7;\2\2\u06eb\u06ee\b\67\1\2\u06ec\u06ed\7\67\2\2\u06ed\u06ef\b"+
		"\67\1\2\u06ee\u06ec\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06fe\3\2\2\2\u06f0"+
		"\u06f1\7<\2\2\u06f1\u06f4\b\67\1\2\u06f2\u06f3\7\67\2\2\u06f3\u06f5\b"+
		"\67\1\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06fe\3\2\2\2\u06f6"+
		"\u06f9\b\67\1\2\u06f7\u06f8\79\2\2\u06f8\u06fa\b\67\1\2\u06f9\u06f7\3"+
		"\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\7\u00ed\2\2"+
		"\u06fc\u06fe\b\67\1\2\u06fd\u06dc\3\2\2\2\u06fd\u06df\3\2\2\2\u06fd\u06e1"+
		"\3\2\2\2\u06fd\u06e7\3\2\2\2\u06fd\u06ea\3\2\2\2\u06fd\u06f0\3\2\2\2\u06fd"+
		"\u06f6\3\2\2\2\u06fem\3\2\2\2\u06ff\u0700\7>\2\2\u0700\u0701\5\u0094K"+
		"\2\u0701\u0702\b8\1\2\u0702\u0714\3\2\2\2\u0703\u0704\7\u009f\2\2\u0704"+
		"\u0705\b8\1\2\u0705\u0706\7\4\2\2\u0706\u0707\5\u00c8e\2\u0707\u070e\b"+
		"8\1\2\u0708\u0709\7\t\2\2\u0709\u070a\5\u00c8e\2\u070a\u070b\b8\1\2\u070b"+
		"\u070d\3\2\2\2\u070c\u0708\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u070c\3\2"+
		"\2\2\u070e\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710\u070e\3\2\2\2\u0711"+
		"\u0712\7\6\2\2\u0712\u0714\3\2\2\2\u0713\u06ff\3\2\2\2\u0713\u0703\3\2"+
		"\2\2\u0714o\3\2\2\2\u0715\u0716\7l\2\2\u0716\u0718\7\4\2\2\u0717\u0719"+
		"\5r:\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071a\3\2\2\2\u071a"+
		"\u071b\7\6\2\2\u071bq\3\2\2\2\u071c\u071e\7\u008b\2\2\u071d\u071c\3\2"+
		"\2\2\u071d\u071e\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\t\f\2\2\u0720"+
		"\u0735\7\u0095\2\2\u0721\u0722\5\u0092J\2\u0722\u0723\7E\2\2\u0723\u0735"+
		"\3\2\2\2\u0724\u0725\7\u0096\2\2\u0725\u0726\7\u00f4\2\2\u0726\u0727\7"+
		"\u0097\2\2\u0727\u0728\7\u0098\2\2\u0728\u0731\7\u00f4\2\2\u0729\u072f"+
		"\7>\2\2\u072a\u0730\5\u00c8e\2\u072b\u072c\5\u00c6d\2\u072c\u072d\7\4"+
		"\2\2\u072d\u072e\7\6\2\2\u072e\u0730\3\2\2\2\u072f\u072a\3\2\2\2\u072f"+
		"\u072b\3\2\2\2\u0730\u0732\3\2\2\2\u0731\u0729\3\2\2\2\u0731\u0732\3\2"+
		"\2\2\u0732\u0735\3\2\2\2\u0733\u0735\5\u0092J\2\u0734\u071d\3\2\2\2\u0734"+
		"\u0721\3\2\2\2\u0734\u0724\3\2\2\2\u0734\u0733\3\2\2\2\u0735s\3\2\2\2"+
		"\u0736\u0737\7\4\2\2\u0737\u0738\5v<\2\u0738\u0739\7\6\2\2\u0739\u073a"+
		"\b;\1\2\u073au\3\2\2\2\u073b\u073c\5\u00c8e\2\u073c\u0743\b<\1\2\u073d"+
		"\u073e\7\t\2\2\u073e\u073f\5\u00c8e\2\u073f\u0740\b<\1\2\u0740\u0742\3"+
		"\2\2\2\u0741\u073d\3\2\2\2\u0742\u0745\3\2\2\2\u0743\u0741\3\2\2\2\u0743"+
		"\u0744\3\2\2\2\u0744w\3\2\2\2\u0745\u0743\3\2\2\2\u0746\u0747\7\4\2\2"+
		"\u0747\u074c\5z>\2\u0748\u0749\7\t\2\2\u0749\u074b\5z>\2\u074a\u0748\3"+
		"\2\2\2\u074b\u074e\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d"+
		"\u074f\3\2\2\2\u074e\u074c\3\2\2\2\u074f\u0750\7\6\2\2\u0750y\3\2\2\2"+
		"\u0751\u0753\5\u00c8e\2\u0752\u0754\t\n\2\2\u0753\u0752\3\2\2\2\u0753"+
		"\u0754\3\2\2\2\u0754{\3\2\2\2\u0755\u0756\7\4\2\2\u0756\u075b\5~@\2\u0757"+
		"\u0758\7\t\2\2\u0758\u075a\5~@\2\u0759\u0757\3\2\2\2\u075a\u075d\3\2\2"+
		"\2\u075b\u0759\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u075e\3\2\2\2\u075d\u075b"+
		"\3\2\2\2\u075e\u075f\7\6\2\2\u075f}\3\2\2\2\u0760\u0763\5\u00c8e\2\u0761"+
		"\u0762\7s\2\2\u0762\u0764\7\u00f0\2\2\u0763\u0761\3\2\2\2\u0763\u0764"+
		"\3\2\2\2\u0764\177\3\2\2\2\u0765\u0769\5\u008aF\2\u0766\u0767\5p9\2\u0767"+
		"\u0768\bA\1\2\u0768\u076a\3\2\2\2\u0769\u0766\3\2\2\2\u0769\u076a\3\2"+
		"\2\2\u076a\u076b\3\2\2\2\u076b\u076c\5\u0086D\2\u076c\u076d\bA\1\2\u076d"+
		"\u0787\3\2\2\2\u076e\u076f\7\4\2\2\u076f\u0770\5B\"\2\u0770\u0774\7\6"+
		"\2\2\u0771\u0772\5p9\2\u0772\u0773\bA\1\2\u0773\u0775\3\2\2\2\u0774\u0771"+
		"\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\5\u0086D"+
		"\2\u0777\u0778\bA\1\2\u0778\u0787\3\2\2\2\u0779\u077a\7\4\2\2\u077a\u077b"+
		"\5h\65\2\u077b\u077f\7\6\2\2\u077c\u077d\5p9\2\u077d\u077e\bA\1\2\u077e"+
		"\u0780\3\2\2\2\u077f\u077c\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0781\3\2"+
		"\2\2\u0781\u0782\5\u0086D\2\u0782\u0783\bA\1\2\u0783\u0787\3\2\2\2\u0784"+
		"\u0787\5\u0082B\2\u0785\u0787\5\u0084C\2\u0786\u0765\3\2\2\2\u0786\u076e"+
		"\3\2\2\2\u0786\u0779\3\2\2\2\u0786\u0784\3\2\2\2\u0786\u0785\3\2\2\2\u0787"+
		"\u0081\3\2\2\2\u0788\u0789\7O\2\2\u0789\u078e\5\u0092J\2\u078a\u078b\7"+
		"\t\2\2\u078b\u078d\5\u0092J\2\u078c\u078a\3\2\2\2\u078d\u0790\3\2\2\2"+
		"\u078e\u078c\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0791\3\2\2\2\u0790\u078e"+
		"\3\2\2\2\u0791\u0792\5\u0086D\2\u0792\u0083\3\2\2\2\u0793\u0794\5\u00c8"+
		"e\2\u0794\u079d\7\4\2\2\u0795\u079a\5\u0092J\2\u0796\u0797\7\t\2\2\u0797"+
		"\u0799\5\u0092J\2\u0798\u0796\3\2\2\2\u0799\u079c\3\2\2\2\u079a\u0798"+
		"\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079e\3\2\2\2\u079c\u079a\3\2\2\2\u079d"+
		"\u0795\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a0\7\6"+
		"\2\2\u07a0\u07a1\5\u0086D\2\u07a1\u0085\3\2\2\2\u07a2\u07a4\7\17\2\2\u07a3"+
		"\u07a2\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a6\5\u00ca"+
		"f\2\u07a6\u07aa\bD\1\2\u07a7\u07a8\5t;\2\u07a8\u07a9\bD\1\2\u07a9\u07ab"+
		"\3\2\2\2\u07aa\u07a7\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ad\3\2\2\2\u07ac"+
		"\u07a3\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u0087\3\2\2\2\u07ae\u07af\7M"+
		"\2\2\u07af\u07b0\7Z\2\2\u07b0\u07b1\7\u00a0\2\2\u07b1\u07b5\7\u00f0\2"+
		"\2\u07b2\u07b3\7N\2\2\u07b3\u07b4\7\u00a1\2\2\u07b4\u07b6\5.\30\2\u07b5"+
		"\u07b2\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07e0\3\2\2\2\u07b7\u07b8\7M"+
		"\2\2\u07b8\u07b9\7Z\2\2\u07b9\u07c3\7\u00a4\2\2\u07ba\u07bb\7\u00a5\2"+
		"\2\u07bb\u07bc\7\u00a6\2\2\u07bc\u07bd\7\25\2\2\u07bd\u07c1\7\u00f0\2"+
		"\2\u07be\u07bf\7\u00aa\2\2\u07bf\u07c0\7\25\2\2\u07c0\u07c2\7\u00f0\2"+
		"\2\u07c1\u07be\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07ba"+
		"\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07ca\3\2\2\2\u07c5\u07c6\7\u00a7\2"+
		"\2\u07c6\u07c7\7\u00a8\2\2\u07c7\u07c8\7\u00a6\2\2\u07c8\u07c9\7\25\2"+
		"\2\u07c9\u07cb\7\u00f0\2\2\u07ca\u07c5\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb"+
		"\u07d1\3\2\2\2\u07cc\u07cd\7q\2\2\u07cd\u07ce\7\u00a9\2\2\u07ce\u07cf"+
		"\7\u00a6\2\2\u07cf\u07d0\7\25\2\2\u07d0\u07d2\7\u00f0\2\2\u07d1\u07cc"+
		"\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d7\3\2\2\2\u07d3\u07d4\7\u00ab\2"+
		"\2\u07d4\u07d5\7\u00a6\2\2\u07d5\u07d6\7\25\2\2\u07d6\u07d8\7\u00f0\2"+
		"\2\u07d7\u07d3\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07dd\3\2\2\2\u07d9\u07da"+
		"\7(\2\2\u07da\u07db\7\u00d9\2\2\u07db\u07dc\7\17\2\2\u07dc\u07de\7\u00f0"+
		"\2\2\u07dd\u07d9\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07e0\3\2\2\2\u07df"+
		"\u07ae\3\2\2\2\u07df\u07b7\3\2\2\2\u07e0\u0089\3\2\2\2\u07e1\u07e2\5\u00c8"+
		"e\2\u07e2\u07e3\7\13\2\2\u07e3\u07e4\bF\1\2\u07e4\u07e6\3\2\2\2\u07e5"+
		"\u07e1\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\5\u00c8"+
		"e\2\u07e8\u07e9\bF\1\2\u07e9\u008b\3\2\2\2\u07ea\u07eb\5\u00c8e\2\u07eb"+
		"\u07ec\7\13\2\2\u07ec\u07ee\3\2\2\2\u07ed\u07ea\3\2\2\2\u07ed\u07ee\3"+
		"\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f0\5\u00c8e\2\u07f0\u008d\3\2\2\2"+
		"\u07f1\u07f2\5\u0092J\2\u07f2\u07fe\bH\1\2\u07f3\u07f5\7\17\2\2\u07f4"+
		"\u07f3\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07fc\3\2\2\2\u07f6\u07f7\5\u00c8"+
		"e\2\u07f7\u07f8\bH\1\2\u07f8\u07fd\3\2\2\2\u07f9\u07fa\5t;\2\u07fa\u07fb"+
		"\bH\1\2\u07fb\u07fd\3\2\2\2\u07fc\u07f6\3\2\2\2\u07fc\u07f9\3\2\2\2\u07fd"+
		"\u07ff\3\2\2\2\u07fe\u07f4\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u008f\3\2"+
		"\2\2\u0800\u0801\5\u008eH\2\u0801\u0808\bI\1\2\u0802\u0803\7\t\2\2\u0803"+
		"\u0804\5\u008eH\2\u0804\u0805\bI\1\2\u0805\u0807\3\2\2\2\u0806\u0802\3"+
		"\2\2\2\u0807\u080a\3\2\2\2\u0808\u0806\3\2\2\2\u0808\u0809\3\2\2\2\u0809"+
		"\u0091\3\2\2\2\u080a\u0808\3\2\2\2\u080b\u080c\5\u0094K\2\u080c\u080d"+
		"\bJ\1\2\u080d\u0093\3\2\2\2\u080e\u080f\bK\1\2\u080f\u0810\7!\2\2\u0810"+
		"\u0811\5\u0094K\7\u0811\u0812\bK\1\2\u0812\u081c\3\2\2\2\u0813\u0814\7"+
		"#\2\2\u0814\u0815\7\4\2\2\u0815\u0816\5\32\16\2\u0816\u0817\7\6\2\2\u0817"+
		"\u081c\3\2\2\2\u0818\u0819\5\u0096L\2\u0819\u081a\bK\1\2\u081a\u081c\3"+
		"\2\2\2\u081b\u080e\3\2\2\2\u081b\u0813\3\2\2\2\u081b\u0818\3\2\2\2\u081c"+
		"\u0829\3\2\2\2\u081d\u081e\f\4\2\2\u081e\u081f\7\37\2\2\u081f\u0820\5"+
		"\u0094K\5\u0820\u0821\bK\1\2\u0821\u0828\3\2\2\2\u0822\u0823\f\3\2\2\u0823"+
		"\u0824\7\36\2\2\u0824\u0825\5\u0094K\4\u0825\u0826\bK\1\2\u0826\u0828"+
		"\3\2\2\2\u0827\u081d\3\2\2\2\u0827\u0822\3\2\2\2\u0828\u082b\3\2\2\2\u0829"+
		"\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u0095\3\2\2\2\u082b\u0829\3\2"+
		"\2\2\u082c\u082d\5\u009aN\2\u082d\u0831\bL\1\2\u082e\u082f\5\u0098M\2"+
		"\u082f\u0830\bL\1\2\u0830\u0832\3\2\2\2\u0831\u082e\3\2\2\2\u0831\u0832"+
		"\3\2\2\2\u0832\u0097\3\2\2\2\u0833\u0834\7!\2\2\u0834\u0836\bM\1\2\u0835"+
		"\u0833\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0838\7$"+
		"\2\2\u0838\u0839\5\u009aN\2\u0839\u083a\7\37\2\2\u083a\u083b\5\u009aN"+
		"\2\u083b\u083c\bM\1\2\u083c\u0875\3\2\2\2\u083d\u083e\7!\2\2\u083e\u0840"+
		"\bM\1\2\u083f\u083d\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0841\3\2\2\2\u0841"+
		"\u0842\7 \2\2\u0842\u0843\bM\1\2\u0843\u0844\7\4\2\2\u0844\u0845\5\u0092"+
		"J\2\u0845\u084c\bM\1\2\u0846\u0847\7\t\2\2\u0847\u0848\5\u0092J\2\u0848"+
		"\u0849\bM\1\2\u0849\u084b\3\2\2\2\u084a\u0846\3\2\2\2\u084b\u084e\3\2"+
		"\2\2\u084c\u084a\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084f\3\2\2\2\u084e"+
		"\u084c\3\2\2\2\u084f\u0850\7\6\2\2\u0850\u0875\3\2\2\2\u0851\u0852\7!"+
		"\2\2\u0852\u0854\bM\1\2\u0853\u0851\3\2\2\2\u0853\u0854\3\2\2\2\u0854"+
		"\u0855\3\2\2\2\u0855\u0856\7 \2\2\u0856\u0857\7\4\2\2\u0857\u0858\5\32"+
		"\16\2\u0858\u0859\7\6\2\2\u0859\u085a\bM\1\2\u085a\u0875\3\2\2\2\u085b"+
		"\u085c\7!\2\2\u085c\u085e\bM\1\2\u085d\u085b\3\2\2\2\u085d\u085e\3\2\2"+
		"\2\u085e\u085f\3\2\2\2\u085f\u0860\t\r\2\2\u0860\u0861\5\u009aN\2\u0861"+
		"\u0862\bM\1\2\u0862\u0875\3\2\2\2\u0863\u0866\7\'\2\2\u0864\u0865\7!\2"+
		"\2\u0865\u0867\bM\1\2\u0866\u0864\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868"+
		"\3\2\2\2\u0868\u0869\7(\2\2\u0869\u0875\bM\1\2\u086a\u086d\7\'\2\2\u086b"+
		"\u086c\7!\2\2\u086c\u086e\bM\1\2\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2"+
		"\2\u086e\u086f\3\2\2\2\u086f\u0870\7\22\2\2\u0870\u0871\7\r\2\2\u0871"+
		"\u0872\5\u009aN\2\u0872\u0873\bM\1\2\u0873\u0875\3\2\2\2\u0874\u0835\3"+
		"\2\2\2\u0874\u083f\3\2\2\2\u0874\u0853\3\2\2\2\u0874\u085d\3\2\2\2\u0874"+
		"\u0863\3\2\2\2\u0874\u086a\3\2\2\2\u0875\u0099\3\2\2\2\u0876\u0877\bN"+
		"\1\2\u0877\u0878\t\16\2\2\u0878\u0879\5\u009aN\t\u0879\u087a\bN\1\2\u087a"+
		"\u087f\3\2\2\2\u087b\u087c\5\u009cO\2\u087c\u087d\bN\1\2\u087d\u087f\3"+
		"\2\2\2\u087e\u0876\3\2\2\2\u087e\u087b\3\2\2\2\u087f\u08a0\3\2\2\2\u0880"+
		"\u0881\f\b\2\2\u0881\u0882\t\17\2\2\u0882\u0883\5\u009aN\t\u0883\u0884"+
		"\bN\1\2\u0884\u089f\3\2\2\2\u0885\u0886\f\7\2\2\u0886\u0887\t\20\2\2\u0887"+
		"\u0888\5\u009aN\b\u0888\u0889\bN\1\2\u0889\u089f\3\2\2\2\u088a\u088b\f"+
		"\6\2\2\u088b\u088c\7\u0091\2\2\u088c\u088d\5\u009aN\7\u088d\u088e\bN\1"+
		"\2\u088e\u089f\3\2\2\2\u088f\u0890\f\5\2\2\u0890\u0891\7\u0094\2\2\u0891"+
		"\u0892\5\u009aN\6\u0892\u0893\bN\1\2\u0893\u089f\3\2\2\2\u0894\u0895\f"+
		"\4\2\2\u0895\u0896\7\u0092\2\2\u0896\u0897\5\u009aN\5\u0897\u0898\bN\1"+
		"\2\u0898\u089f\3\2\2\2\u0899\u089a\f\3\2\2\u089a\u089b\5\u00a0Q\2\u089b"+
		"\u089c\5\u009aN\4\u089c\u089d\bN\1\2\u089d\u089f\3\2\2\2\u089e\u0880\3"+
		"\2\2\2\u089e\u0885\3\2\2\2\u089e\u088a\3\2\2\2\u089e\u088f\3\2\2\2\u089e"+
		"\u0894\3\2\2\2\u089e\u0899\3\2\2\2\u089f\u08a2\3\2\2\2\u08a0\u089e\3\2"+
		"\2\2\u08a0\u08a1\3\2\2\2\u08a1\u009b\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a3"+
		"\u08a4\bO\1\2\u08a4\u08a6\7\60\2\2\u08a5\u08a7\5\u00ba^\2\u08a6\u08a5"+
		"\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9"+
		"\u08ac\3\2\2\2\u08aa\u08ab\7\63\2\2\u08ab\u08ad\5\u0092J\2\u08ac\u08aa"+
		"\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08af\7\64\2\2"+
		"\u08af\u092e\3\2\2\2\u08b0\u08b1\7\60\2\2\u08b1\u08b3\5\u0092J\2\u08b2"+
		"\u08b4\5\u00ba^\2\u08b3\u08b2\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u08b3"+
		"\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b9\3\2\2\2\u08b7\u08b8\7\63\2\2"+
		"\u08b8\u08ba\5\u0092J\2\u08b9\u08b7\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba"+
		"\u08bb\3\2\2\2\u08bb\u08bc\7\64\2\2\u08bc\u092e\3\2\2\2\u08bd\u08be\7"+
		"^\2\2\u08be\u08bf\7\4\2\2\u08bf\u08c0\5\u0092J\2\u08c0\u08c1\7\17\2\2"+
		"\u08c1\u08c2\5\u00b0Y\2\u08c2\u08c3\7\6\2\2\u08c3\u08c4\bO\1\2\u08c4\u092e"+
		"\3\2\2\2\u08c5\u08c6\7r\2\2\u08c6\u08cf\7\4\2\2\u08c7\u08cc\5\u008eH\2"+
		"\u08c8\u08c9\7\t\2\2\u08c9\u08cb\5\u008eH\2\u08ca\u08c8\3\2\2\2\u08cb"+
		"\u08ce\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08d0\3\2"+
		"\2\2\u08ce\u08cc\3\2\2\2\u08cf\u08c7\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0"+
		"\u08d1\3\2\2\2\u08d1\u092e\7\6\2\2\u08d2\u08d3\7J\2\2\u08d3\u08d4\7\4"+
		"\2\2\u08d4\u08d7\5\u0092J\2\u08d5\u08d6\7|\2\2\u08d6\u08d8\7+\2\2\u08d7"+
		"\u08d5\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08da\7\6"+
		"\2\2\u08da\u092e\3\2\2\2\u08db\u08dc\7L\2\2\u08dc\u08dd\7\4\2\2\u08dd"+
		"\u08e0\5\u0092J\2\u08de\u08df\7|\2\2\u08df\u08e1\7+\2\2\u08e0\u08de\3"+
		"\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2\u08e3\7\6\2\2\u08e3"+
		"\u092e\3\2\2\2\u08e4\u08e5\7\u0081\2\2\u08e5\u08e6\7\4\2\2\u08e6\u08e7"+
		"\5\u009aN\2\u08e7\u08e8\7 \2\2\u08e8\u08e9\5\u009aN\2\u08e9\u08ea\7\6"+
		"\2\2\u08ea\u092e\3\2\2\2\u08eb\u08ec\5\u009eP\2\u08ec\u08ed\bO\1\2\u08ed"+
		"\u092e\3\2\2\2\u08ee\u08ef\7\u008c\2\2\u08ef\u092e\bO\1\2\u08f0\u08f1"+
		"\5\u00c6d\2\u08f1\u08f2\7\13\2\2\u08f2\u08f3\7\u008c\2\2\u08f3\u08f4\b"+
		"O\1\2\u08f4\u092e\3\2\2\2\u08f5\u08f6\7\4\2\2\u08f6\u08f9\5\u008eH\2\u08f7"+
		"\u08f8\7\t\2\2\u08f8\u08fa\5\u008eH\2\u08f9\u08f7\3\2\2\2\u08fa\u08fb"+
		"\3\2\2\2\u08fb\u08f9\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd"+
		"\u08fe\7\6\2\2\u08fe\u092e\3\2\2\2\u08ff\u0900\7\4\2\2\u0900\u0901\5\32"+
		"\16\2\u0901\u0902\7\6\2\2\u0902\u092e\3\2\2\2\u0903\u0904\5\u00c6d\2\u0904"+
		"\u0905\bO\1\2\u0905\u0916\7\4\2\2\u0906\u0907\5f\64\2\u0907\u0908\bO\1"+
		"\2\u0908\u090a\3\2\2\2\u0909\u0906\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090b"+
		"\3\2\2\2\u090b\u090c\5\u0092J\2\u090c\u0913\bO\1\2\u090d\u090e\7\t\2\2"+
		"\u090e\u090f\5\u0092J\2\u090f\u0910\bO\1\2\u0910\u0912\3\2\2\2\u0911\u090d"+
		"\3\2\2\2\u0912\u0915\3\2\2\2\u0913\u0911\3\2\2\2\u0913\u0914\3\2\2\2\u0914"+
		"\u0917\3\2\2\2\u0915\u0913\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u0916\u0909\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0918\3\2\2\2\u0918"+
		"\u091b\7\6\2\2\u0919\u091a\7B\2\2\u091a\u091c\5\u00c0a\2\u091b\u0919\3"+
		"\2\2\2\u091b\u091c\3\2\2\2\u091c\u092e\3\2\2\2\u091d\u091e\5\u00c6d\2"+
		"\u091e\u091f\7\4\2\2\u091f\u0920\t\21\2\2\u0920\u0921\5\u0092J\2\u0921"+
		"\u0922\7\r\2\2\u0922\u0923\5\u0092J\2\u0923\u0924\7\6\2\2\u0924\u092e"+
		"\3\2\2\2\u0925\u0926\5\u00c8e\2\u0926\u0927\bO\1\2\u0927\u092e\3\2\2\2"+
		"\u0928\u0929\7\4\2\2\u0929\u092a\5\u0092J\2\u092a\u092b\7\6\2\2\u092b"+
		"\u092c\bO\1\2\u092c\u092e\3\2\2\2\u092d\u08a3\3\2\2\2\u092d\u08b0\3\2"+
		"\2\2\u092d\u08bd\3\2\2\2\u092d\u08c5\3\2\2\2\u092d\u08d2\3\2\2\2\u092d"+
		"\u08db\3\2\2\2\u092d\u08e4\3\2\2\2\u092d\u08eb\3\2\2\2\u092d\u08ee\3\2"+
		"\2\2\u092d\u08f0\3\2\2\2\u092d\u08f5\3\2\2\2\u092d\u08ff\3\2\2\2\u092d"+
		"\u0903\3\2\2\2\u092d\u091d\3\2\2\2\u092d\u0925\3\2\2\2\u092d\u0928\3\2"+
		"\2\2\u092e\u093b\3\2\2\2\u092f\u0930\f\6\2\2\u0930\u0931\7\b\2\2\u0931"+
		"\u0932\5\u009aN\2\u0932\u0933\7\n\2\2\u0933\u093a\3\2\2\2\u0934\u0935"+
		"\f\4\2\2\u0935\u0936\7\13\2\2\u0936\u0937\5\u00c8e\2\u0937\u0938\bO\1"+
		"\2\u0938\u093a\3\2\2\2\u0939\u092f\3\2\2\2\u0939\u0934\3\2\2\2\u093a\u093d"+
		"\3\2\2\2\u093b\u0939\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u009d\3\2\2\2\u093d"+
		"\u093b\3\2\2\2\u093e\u093f\7(\2\2\u093f\u0951\bP\1\2\u0940\u0951\5\u00a8"+
		"U\2\u0941\u0942\5\u00c8e\2\u0942\u0943\7\u00f0\2\2\u0943\u0951\3\2\2\2"+
		"\u0944\u0945\5\u00ceh\2\u0945\u0946\bP\1\2\u0946\u0951\3\2\2\2\u0947\u0948"+
		"\5\u00a6T\2\u0948\u0949\bP\1\2\u0949\u0951\3\2\2\2\u094a\u094b\7\u00f0"+
		"\2\2\u094b\u094d\bP\1\2\u094c\u094a\3\2\2\2\u094d\u094e\3\2\2\2\u094e"+
		"\u094c\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0951\3\2\2\2\u0950\u093e\3\2"+
		"\2\2\u0950\u0940\3\2\2\2\u0950\u0941\3\2\2\2\u0950\u0944\3\2\2\2\u0950"+
		"\u0947\3\2\2\2\u0950\u094c\3\2\2\2\u0951\u009f\3\2\2\2\u0952\u0953\t\22"+
		"\2\2\u0953\u0954\bQ\1\2\u0954\u00a1\3\2\2\2\u0955\u0956\t\23\2\2\u0956"+
		"\u00a3\3\2\2\2\u0957\u0958\t\24\2\2\u0958\u00a5\3\2\2\2\u0959\u095a\7"+
		")\2\2\u095a\u095e\bT\1\2\u095b\u095c\7*\2\2\u095c\u095e\bT\1\2\u095d\u0959"+
		"\3\2\2\2\u095d\u095b\3\2\2\2\u095e\u00a7\3\2\2\2\u095f\u0965\7/\2\2\u0960"+
		"\u0961\5\u00aaV\2\u0961\u0962\bU\1\2\u0962\u0964\3\2\2\2\u0963\u0960\3"+
		"\2\2\2\u0964\u0967\3\2\2\2\u0965\u0963\3\2\2\2\u0965\u0966\3\2\2\2\u0966"+
		"\u00a9\3\2\2\2\u0967\u0965\3\2\2\2\u0968\u0969\5\u00acW\2\u0969\u096c"+
		"\5\u00c8e\2\u096a\u096b\7k\2\2\u096b\u096d\5\u00c8e\2\u096c\u096a\3\2"+
		"\2\2\u096c\u096d\3\2\2\2\u096d\u00ab\3\2\2\2\u096e\u0970\t\25\2\2\u096f"+
		"\u096e\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0974\t\f"+
		"\2\2\u0972\u0974\7\u00f0\2\2\u0973\u096f\3\2\2\2\u0973\u0972\3\2\2\2\u0974"+
		"\u00ad\3\2\2\2\u0975\u0979\7J\2\2\u0976\u0977\7K\2\2\u0977\u0979\5\u00c8"+
		"e\2\u0978\u0975\3\2\2\2\u0978\u0976\3\2\2\2\u0979\u00af\3\2\2\2\u097a"+
		"\u097b\7p\2\2\u097b\u097c\7\u0086\2\2\u097c\u097d\5\u00b0Y\2\u097d\u097e"+
		"\7\u0088\2\2\u097e\u097f\bY\1\2\u097f\u09a2\3\2\2\2\u0980\u0981\7q\2\2"+
		"\u0981\u0982\7\u0086\2\2\u0982\u0983\5\u00b0Y\2\u0983\u0984\7\t\2\2\u0984"+
		"\u0985\5\u00b0Y\2\u0985\u0986\7\u0088\2\2\u0986\u0987\bY\1\2\u0987\u09a2"+
		"\3\2\2\2\u0988\u098f\7r\2\2\u0989\u098b\7\u0086\2\2\u098a\u098c\5\u00b6"+
		"\\\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098d\3\2\2\2\u098d"+
		"\u0990\7\u0088\2\2\u098e\u0990\7\u0084\2\2\u098f\u0989\3\2\2\2\u098f\u098e"+
		"\3\2\2\2\u0990\u09a2\3\2\2\2\u0991\u0992\5\u00c8e\2\u0992\u099f\bY\1\2"+
		"\u0993\u0994\7\4\2\2\u0994\u0995\7\u00f4\2\2\u0995\u099b\bY\1\2\u0996"+
		"\u0997\7\t\2\2\u0997\u0998\7\u00f4\2\2\u0998\u099a\bY\1\2\u0999\u0996"+
		"\3\2\2\2\u099a\u099d\3\2\2\2\u099b\u0999\3\2\2\2\u099b\u099c\3\2\2\2\u099c"+
		"\u099e\3\2\2\2\u099d\u099b\3\2\2\2\u099e\u09a0\7\6\2\2\u099f\u0993\3\2"+
		"\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a2\3\2\2\2\u09a1\u097a\3\2\2\2\u09a1"+
		"\u0980\3\2\2\2\u09a1\u0988\3\2\2\2\u09a1\u0991\3\2\2\2\u09a2\u00b1\3\2"+
		"\2\2\u09a3\u09a8\5\u00b4[\2\u09a4\u09a5\7\t\2\2\u09a5\u09a7\5\u00b4[\2"+
		"\u09a6\u09a4\3\2\2\2\u09a7\u09aa\3\2\2\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9"+
		"\3\2\2\2\u09a9\u00b3\3\2\2\2\u09aa\u09a8\3\2\2\2\u09ab\u09ac\5\u00c8e"+
		"\2\u09ac\u09af\5\u00b0Y\2\u09ad\u09ae\7s\2\2\u09ae\u09b0\7\u00f0\2\2\u09af"+
		"\u09ad\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u00b5\3\2\2\2\u09b1\u09b6\5\u00b8"+
		"]\2\u09b2\u09b3\7\t\2\2\u09b3\u09b5\5\u00b8]\2\u09b4\u09b2\3\2\2\2\u09b5"+
		"\u09b8\3\2\2\2\u09b6\u09b4\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u00b7\3\2"+
		"\2\2\u09b8\u09b6\3\2\2\2\u09b9\u09ba\5\u00c8e\2\u09ba\u09bb\7\7\2\2\u09bb"+
		"\u09be\5\u00b0Y\2\u09bc\u09bd\7s\2\2\u09bd\u09bf\7\u00f0\2\2\u09be\u09bc"+
		"\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u00b9\3\2\2\2\u09c0\u09c1\7\61\2\2"+
		"\u09c1\u09c2\5\u0092J\2\u09c2\u09c3\7\62\2\2\u09c3\u09c4\5\u0092J\2\u09c4"+
		"\u00bb\3\2\2\2\u09c5\u09c6\7A\2\2\u09c6\u09cb\5\u00be`\2\u09c7\u09c8\7"+
		"\t\2\2\u09c8\u09ca\5\u00be`\2\u09c9\u09c7\3\2\2\2\u09ca\u09cd\3\2\2\2"+
		"\u09cb\u09c9\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u00bd\3\2\2\2\u09cd\u09cb"+
		"\3\2\2\2\u09ce\u09cf\5\u00c8e\2\u09cf\u09d0\7\17\2\2\u09d0\u09d1\5\u00c0"+
		"a\2\u09d1\u00bf\3\2\2\2\u09d2\u09fd\5\u00c8e\2\u09d3\u09f6\7\4\2\2\u09d4"+
		"\u09d5\7\u009a\2\2\u09d5\u09d6\7\25\2\2\u09d6\u09db\5\u0092J\2\u09d7\u09d8"+
		"\7\t\2\2\u09d8\u09da\5\u0092J\2\u09d9\u09d7\3\2\2\2\u09da\u09dd\3\2\2"+
		"\2\u09db\u09d9\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u09f7\3\2\2\2\u09dd\u09db"+
		"\3\2\2\2\u09de\u09df\t\26\2\2\u09df\u09e0\7\25\2\2\u09e0\u09e5\5\u0092"+
		"J\2\u09e1\u09e2\7\t\2\2\u09e2\u09e4\5\u0092J\2\u09e3\u09e1\3\2\2\2\u09e4"+
		"\u09e7\3\2\2\2\u09e5\u09e3\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e9\3\2"+
		"\2\2\u09e7\u09e5\3\2\2\2\u09e8\u09de\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9"+
		"\u09f4\3\2\2\2\u09ea\u09eb\t\27\2\2\u09eb\u09ec\7\25\2\2\u09ec\u09f1\5"+
		"L\'\2\u09ed\u09ee\7\t\2\2\u09ee\u09f0\5L\'\2\u09ef\u09ed\3\2\2\2\u09f0"+
		"\u09f3\3\2\2\2\u09f1\u09ef\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f5\3\2"+
		"\2\2\u09f3\u09f1\3\2\2\2\u09f4\u09ea\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5"+
		"\u09f7\3\2\2\2\u09f6\u09d4\3\2\2\2\u09f6\u09e8\3\2\2\2\u09f7\u09f9\3\2"+
		"\2\2\u09f8\u09fa\5\u00c2b\2\u09f9\u09f8\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa"+
		"\u09fb\3\2\2\2\u09fb\u09fd\7\6\2\2\u09fc\u09d2\3\2\2\2\u09fc\u09d3\3\2"+
		"\2\2\u09fd\u00c1\3\2\2\2\u09fe\u09ff\7D\2\2\u09ff\u0a0f\5\u00c4c\2\u0a00"+
		"\u0a01\7E\2\2\u0a01\u0a0f\5\u00c4c\2\u0a02\u0a03\7D\2\2\u0a03\u0a04\7"+
		"$\2\2\u0a04\u0a05\5\u00c4c\2\u0a05\u0a06\7\37\2\2\u0a06\u0a07\5\u00c4"+
		"c\2\u0a07\u0a0f\3\2\2\2\u0a08\u0a09\7E\2\2\u0a09\u0a0a\7$\2\2\u0a0a\u0a0b"+
		"\5\u00c4c\2\u0a0b\u0a0c\7\37\2\2\u0a0c\u0a0d\5\u00c4c\2\u0a0d\u0a0f\3"+
		"\2\2\2\u0a0e\u09fe\3\2\2\2\u0a0e\u0a00\3\2\2\2\u0a0e\u0a02\3\2\2\2\u0a0e"+
		"\u0a08\3\2\2\2\u0a0f\u00c3\3\2\2\2\u0a10\u0a11\7F\2\2\u0a11\u0a18\t\30"+
		"\2\2\u0a12\u0a13\7I\2\2\u0a13\u0a18\7M\2\2\u0a14\u0a15\5\u0092J\2\u0a15"+
		"\u0a16\t\30\2\2\u0a16\u0a18\3\2\2\2\u0a17\u0a10\3\2\2\2\u0a17\u0a12\3"+
		"\2\2\2\u0a17\u0a14\3\2\2\2\u0a18\u00c5\3\2\2\2\u0a19\u0a1a\5\u00c8e\2"+
		"\u0a1a\u0a21\bd\1\2\u0a1b\u0a1c\7\13\2\2\u0a1c\u0a1d\5\u00c8e\2\u0a1d"+
		"\u0a1e\bd\1\2\u0a1e\u0a20\3\2\2\2\u0a1f\u0a1b\3\2\2\2\u0a20\u0a23\3\2"+
		"\2\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u00c7\3\2\2\2\u0a23"+
		"\u0a21\3\2\2\2\u0a24\u0a25\5\u00caf\2\u0a25\u0a26\be\1\2\u0a26\u0a2a\3"+
		"\2\2\2\u0a27\u0a28\t\31\2\2\u0a28\u0a2a\be\1\2\u0a29\u0a24\3\2\2\2\u0a29"+
		"\u0a27\3\2\2\2\u0a2a\u00c9\3\2\2\2\u0a2b\u0a2c\7\u00f8\2\2\u0a2c\u0a34"+
		"\bf\1\2\u0a2d\u0a2e\5\u00ccg\2\u0a2e\u0a2f\bf\1\2\u0a2f\u0a34\3\2\2\2"+
		"\u0a30\u0a31\5\u00d0i\2\u0a31\u0a32\bf\1\2\u0a32\u0a34\3\2\2\2\u0a33\u0a2b"+
		"\3\2\2\2\u0a33\u0a2d\3\2\2\2\u0a33\u0a30\3\2\2\2\u0a34\u00cb\3\2\2\2\u0a35"+
		"\u0a36\7\u00f9\2\2\u0a36\u0a37\bg\1\2\u0a37\u00cd\3\2\2\2\u0a38\u0a39"+
		"\7\u008b\2\2\u0a39\u0a3b\bh\1\2\u0a3a\u0a38\3\2\2\2\u0a3a\u0a3b\3\2\2"+
		"\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3d\7\u00f5\2\2\u0a3d\u0a63\bh\1\2\u0a3e"+
		"\u0a3f\7\u008b\2\2\u0a3f\u0a41\bh\1\2\u0a40\u0a3e\3\2\2\2\u0a40\u0a41"+
		"\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a43\7\u00f4\2\2\u0a43\u0a63\bh\1"+
		"\2\u0a44\u0a45\7\u008b\2\2\u0a45\u0a47\bh\1\2\u0a46\u0a44\3\2\2\2\u0a46"+
		"\u0a47\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48\u0a49\7\u00f1\2\2\u0a49\u0a63"+
		"\bh\1\2\u0a4a\u0a4b\7\u008b\2\2\u0a4b\u0a4d\bh\1\2\u0a4c\u0a4a\3\2\2\2"+
		"\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a4f\7\u00f2\2\2\u0a4f"+
		"\u0a63\bh\1\2\u0a50\u0a51\7\u008b\2\2\u0a51\u0a53\bh\1\2\u0a52\u0a50\3"+
		"\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54\u0a55\7\u00f3\2\2"+
		"\u0a55\u0a63\bh\1\2\u0a56\u0a57\7\u008b\2\2\u0a57\u0a59\bh\1\2\u0a58\u0a56"+
		"\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a5b\7\u00f6\2"+
		"\2\u0a5b\u0a63\bh\1\2\u0a5c\u0a5d\7\u008b\2\2\u0a5d\u0a5f\bh\1\2\u0a5e"+
		"\u0a5c\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60\u0a61\7\u00f7"+
		"\2\2\u0a61\u0a63\bh\1\2\u0a62\u0a3a\3\2\2\2\u0a62\u0a40\3\2\2\2\u0a62"+
		"\u0a46\3\2\2\2\u0a62\u0a4c\3\2\2\2\u0a62\u0a52\3\2\2\2\u0a62\u0a58\3\2"+
		"\2\2\u0a62\u0a5e\3\2\2\2\u0a63\u00cf\3\2\2\2\u0a64\u0a65\t\32\2\2\u0a65"+
		"\u0a66\bi\1\2\u0a66\u00d1\3\2\2\2\u0149\u00ee\u00f3\u00f6\u00fb\u0108"+
		"\u010c\u0113\u0121\u0123\u0127\u012a\u0131\u0142\u0144\u0148\u014b\u0152"+
		"\u0158\u015e\u0166\u0186\u018e\u0192\u0197\u019d\u01a5\u01ab\u01b8\u01bd"+
		"\u01c6\u01cb\u01db\u01e2\u01e6\u01ee\u01f5\u01fc\u020b\u020f\u0215\u021b"+
		"\u021e\u0221\u0227\u022b\u022f\u0234\u0238\u0240\u0243\u024c\u0251\u0257"+
		"\u025e\u0261\u0267\u0272\u0275\u0279\u027e\u0283\u028a\u028d\u0290\u0297"+
		"\u029c\u02a1\u02a4\u02ad\u02b5\u02bb\u02bf\u02c3\u02c7\u02c9\u02d2\u02d8"+
		"\u02dd\u02e0\u02e4\u02e7\u02f1\u02f4\u02f8\u02fd\u0300\u0306\u030e\u0313"+
		"\u0319\u031f\u032a\u0332\u0339\u0341\u0344\u034c\u0350\u0357\u03cb\u03d3"+
		"\u03db\u03e4\u03f0\u03f4\u03f7\u03fd\u0407\u0413\u0418\u0420\u042d\u042f"+
		"\u0434\u0438\u043d\u0442\u0445\u044a\u044e\u0453\u0455\u0459\u0462\u046a"+
		"\u0471\u0478\u0484\u0489\u0499\u04a0\u04a3\u04aa\u04ae\u04b4\u04bc\u04c7"+
		"\u04d2\u04d9\u04df\u04e5\u04ef\u04f1\u04fd\u0500\u050c\u050f\u051b\u051e"+
		"\u052a\u052d\u0530\u0538\u053a\u053d\u0549\u0550\u055e\u0564\u0569\u0575"+
		"\u0578\u057c\u0586\u058a\u058c\u058f\u0593\u0596\u059a\u05a2\u05a8\u05af"+
		"\u05b7\u05bc\u05be\u05c5\u05cc\u05d1\u05d7\u05da\u05de\u05e4\u05eb\u05f8"+
		"\u05fe\u0609\u060b\u0610\u0613\u061b\u0624\u0629\u0631\u0639\u0645\u064d"+
		"\u0651\u065d\u066c\u0671\u0679\u067c\u0680\u068e\u0698\u06a2\u06a5\u06ab"+
		"\u06b5\u06b8\u06be\u06c7\u06d1\u06d9\u06dc\u06e5\u06ee\u06f4\u06f9\u06fd"+
		"\u070e\u0713\u0718\u071d\u072f\u0731\u0734\u0743\u074c\u0753\u075b\u0763"+
		"\u0769\u0774\u077f\u0786\u078e\u079a\u079d\u07a3\u07aa\u07ac\u07b5\u07c1"+
		"\u07c3\u07ca\u07d1\u07d7\u07dd\u07df\u07e5\u07ed\u07f4\u07fc\u07fe\u0808"+
		"\u081b\u0827\u0829\u0831\u0835\u083f\u084c\u0853\u085d\u0866\u086d\u0874"+
		"\u087e\u089e\u08a0\u08a8\u08ac\u08b5\u08b9\u08cc\u08cf\u08d7\u08e0\u08fb"+
		"\u0909\u0913\u0916\u091b\u092d\u0939\u093b\u094e\u0950\u095d\u0965\u096c"+
		"\u096f\u0973\u0978\u098b\u098f\u099b\u099f\u09a1\u09a8\u09af\u09b6\u09be"+
		"\u09cb\u09db\u09e5\u09e8\u09f1\u09f4\u09f6\u09f9\u09fc\u0a0e\u0a17\u0a21"+
		"\u0a29\u0a33\u0a3a\u0a40\u0a46\u0a4c\u0a52\u0a58\u0a5e\u0a62";
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