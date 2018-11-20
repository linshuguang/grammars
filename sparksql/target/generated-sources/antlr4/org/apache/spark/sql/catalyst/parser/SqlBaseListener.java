// Generated from org\apache\spark\sql\catalyst\parser\SqlBase.g4 by ANTLR 4.3
package org.apache.spark.sql.catalyst.parser;


  import java.util.regex.Pattern;
  import java.util.*;
  import name.lsg.grammar.tree.*;
  import name.lsg.grammar.tree.join.*;
  import name.lsg.grammar.tree.relation.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlBaseParser}.
 */
public interface SqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull SqlBaseParser.DecimalLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(@NotNull SqlBaseParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(@NotNull SqlBaseParser.DropDatabaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(@NotNull SqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(@NotNull SqlBaseParser.ComplexColTypeListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(@NotNull SqlBaseParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(@NotNull SqlBaseParser.CreateTempViewUsingContext ctx);

	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(@NotNull SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(@NotNull SqlBaseParser.TypeConstructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(@NotNull SqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(@NotNull SqlBaseParser.SetQuantifierContext ctx);

	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(@NotNull SqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(@NotNull SqlBaseParser.InlineTableDefault2Context ctx);

	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(@NotNull SqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(@NotNull SqlBaseParser.InlineTableDefault1Context ctx);

	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(@NotNull SqlBaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(@NotNull SqlBaseParser.TableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull SqlBaseParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull SqlBaseParser.PredicateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(@NotNull SqlBaseParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(@NotNull SqlBaseParser.RefreshResourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(@NotNull SqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(@NotNull SqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(@NotNull SqlBaseParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(@NotNull SqlBaseParser.TablePropertyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(@NotNull SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(@NotNull SqlBaseParser.NumericLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(@NotNull SqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(@NotNull SqlBaseParser.RowFormatSerdeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull SqlBaseParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull SqlBaseParser.IdentifierListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(@NotNull SqlBaseParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(@NotNull SqlBaseParser.RowConstructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(@NotNull SqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(@NotNull SqlBaseParser.PartitionSpecLocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(@NotNull SqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(@NotNull SqlBaseParser.NamedExpressionSeqContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(@NotNull SqlBaseParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(@NotNull SqlBaseParser.GroupingSetContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(@NotNull SqlBaseParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(@NotNull SqlBaseParser.ColTypeListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(@NotNull SqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(@NotNull SqlBaseParser.AliasedQueryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(@NotNull SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(@NotNull SqlBaseParser.ArithmeticUnaryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetDatabaseProperties(@NotNull SqlBaseParser.SetDatabasePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetDatabaseProperties(@NotNull SqlBaseParser.SetDatabasePropertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(@NotNull SqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(@NotNull SqlBaseParser.TablePropertyKeyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(@NotNull SqlBaseParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(@NotNull SqlBaseParser.LoadDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(@NotNull SqlBaseParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(@NotNull SqlBaseParser.JoinRelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(@NotNull SqlBaseParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(@NotNull SqlBaseParser.BucketSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(@NotNull SqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(@NotNull SqlBaseParser.IdentifierCommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(@NotNull SqlBaseParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(@NotNull SqlBaseParser.FrameBoundContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(@NotNull SqlBaseParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(@NotNull SqlBaseParser.ColTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(@NotNull SqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(@NotNull SqlBaseParser.SampleByBytesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(@NotNull SqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(@NotNull SqlBaseParser.ComplexDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(@NotNull SqlBaseParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(@NotNull SqlBaseParser.CreateViewContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(@NotNull SqlBaseParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(@NotNull SqlBaseParser.WhenClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SqlBaseParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(@NotNull SqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(@NotNull SqlBaseParser.BigIntLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(@NotNull SqlBaseParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(@NotNull SqlBaseParser.StarContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(@NotNull SqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(@NotNull SqlBaseParser.DescribeColNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(@NotNull SqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(@NotNull SqlBaseParser.CreateTableHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(@NotNull SqlBaseParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(@NotNull SqlBaseParser.SampleContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(@NotNull SqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(@NotNull SqlBaseParser.SingleFunctionIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull SqlBaseParser.IntegerLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(@NotNull SqlBaseParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(@NotNull SqlBaseParser.ShowFunctionsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(@NotNull SqlBaseParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(@NotNull SqlBaseParser.CacheTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(@NotNull SqlBaseParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(@NotNull SqlBaseParser.SetTablePropertiesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(@NotNull SqlBaseParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(@NotNull SqlBaseParser.ResetConfigurationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(@NotNull SqlBaseParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(@NotNull SqlBaseParser.RenameTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(@NotNull SqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(@NotNull SqlBaseParser.TableFileFormatContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(@NotNull SqlBaseParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(@NotNull SqlBaseParser.SkewSpecContext ctx);

	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(@NotNull SqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(@NotNull SqlBaseParser.RowFormatDelimitedContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(@NotNull SqlBaseParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(@NotNull SqlBaseParser.ShowTablesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(@NotNull SqlBaseParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(@NotNull SqlBaseParser.RecoverPartitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(@NotNull SqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(@NotNull SqlBaseParser.IdentifierCommentListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(@NotNull SqlBaseParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(@NotNull SqlBaseParser.RepairTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(@NotNull SqlBaseParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(@NotNull SqlBaseParser.PartitionValContext ctx);

	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(@NotNull SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(@NotNull SqlBaseParser.ArithmeticBinaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(@NotNull SqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(@NotNull SqlBaseParser.MultiInsertQueryBodyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull SqlBaseParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(@NotNull SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(@NotNull SqlBaseParser.LogicalBinaryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(@NotNull SqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(@NotNull SqlBaseParser.SimpleCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(@NotNull SqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(@NotNull SqlBaseParser.PredicatedContext ctx);

	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(@NotNull SqlBaseParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(@NotNull SqlBaseParser.LastContext ctx);

	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(@NotNull SqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(@NotNull SqlBaseParser.SingleInsertQueryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(@NotNull SqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(@NotNull SqlBaseParser.InsertOverwriteHiveDirContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(@NotNull SqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(@NotNull SqlBaseParser.PredicateOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull SqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull SqlBaseParser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(@NotNull SqlBaseParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(@NotNull SqlBaseParser.AddTablePartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull SqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull SqlBaseParser.QueryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(@NotNull SqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(@NotNull SqlBaseParser.SmallIntLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(@NotNull SqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(@NotNull SqlBaseParser.SubqueryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(@NotNull SqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(@NotNull SqlBaseParser.DescribeFuncNameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(@NotNull SqlBaseParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(@NotNull SqlBaseParser.ManageResourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(@NotNull SqlBaseParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(@NotNull SqlBaseParser.HintContext ctx);

	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(@NotNull SqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(@NotNull SqlBaseParser.BigDecimalLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#hintPredicated}.
	 * @param ctx the parse tree
	 */
	void enterHintPredicated(@NotNull SqlBaseParser.HintPredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#hintPredicated}.
	 * @param ctx the parse tree
	 */
	void exitHintPredicated(@NotNull SqlBaseParser.HintPredicatedContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(@NotNull SqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(@NotNull SqlBaseParser.QuerySpecificationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(@NotNull SqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(@NotNull SqlBaseParser.InsertIntoTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(@NotNull SqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(@NotNull SqlBaseParser.DereferenceContext ctx);

	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(@NotNull SqlBaseParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(@NotNull SqlBaseParser.CreateTableLikeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(@NotNull SqlBaseParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(@NotNull SqlBaseParser.DropFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(@NotNull SqlBaseParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(@NotNull SqlBaseParser.AggregationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(@NotNull SqlBaseParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(@NotNull SqlBaseParser.ShowPartitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(@NotNull SqlBaseParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(@NotNull SqlBaseParser.ConstantListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(@NotNull SqlBaseParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(@NotNull SqlBaseParser.IntervalValueContext ctx);

	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(@NotNull SqlBaseParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(@NotNull SqlBaseParser.TruncateTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(@NotNull SqlBaseParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(@NotNull SqlBaseParser.SortItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(@NotNull SqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(@NotNull SqlBaseParser.JoinCriteriaContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(@NotNull SqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(@NotNull SqlBaseParser.TablePropertyValueContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(@NotNull SqlBaseParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(@NotNull SqlBaseParser.DropTablePartitionsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(@NotNull SqlBaseParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(@NotNull SqlBaseParser.SetConfigurationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(@NotNull SqlBaseParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(@NotNull SqlBaseParser.DropTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(@NotNull SqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(@NotNull SqlBaseParser.QueryOrganizationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(@NotNull SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(@NotNull SqlBaseParser.NullLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(@NotNull SqlBaseParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(@NotNull SqlBaseParser.WindowDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(@NotNull SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(@NotNull SqlBaseParser.SingleStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(@NotNull SqlBaseParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(@NotNull SqlBaseParser.WindowsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(@NotNull SqlBaseParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(@NotNull SqlBaseParser.CtesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(@NotNull SqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(@NotNull SqlBaseParser.SampleByRowsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(@NotNull SqlBaseParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(@NotNull SqlBaseParser.SetTableLocationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(@NotNull SqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(@NotNull SqlBaseParser.SearchedCaseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(@NotNull SqlBaseParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(@NotNull SqlBaseParser.AddTableColumnsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(@NotNull SqlBaseParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(@NotNull SqlBaseParser.ExplainContext ctx);

	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(@NotNull SqlBaseParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(@NotNull SqlBaseParser.StructContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#hintValueExpression}.
	 * @param ctx the parse tree
	 */
	void enterHintValueExpression(@NotNull SqlBaseParser.HintValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#hintValueExpression}.
	 * @param ctx the parse tree
	 */
	void exitHintValueExpression(@NotNull SqlBaseParser.HintValueExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(@NotNull SqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(@NotNull SqlBaseParser.IdentifierSeqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDatabase(@NotNull SqlBaseParser.DescribeDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDatabase(@NotNull SqlBaseParser.DescribeDatabaseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(@NotNull SqlBaseParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(@NotNull SqlBaseParser.AlterViewQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(@NotNull SqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(@NotNull SqlBaseParser.OrderedIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(@NotNull SqlBaseParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(@NotNull SqlBaseParser.FailNativeCommandContext ctx);

	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(@NotNull SqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(@NotNull SqlBaseParser.AliasedRelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull SqlBaseParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull SqlBaseParser.RelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(@NotNull SqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(@NotNull SqlBaseParser.ArithmeticOperatorContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(@NotNull SqlBaseParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(@NotNull SqlBaseParser.CastContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(@NotNull SqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(@NotNull SqlBaseParser.CreateFileFormatContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(@NotNull SqlBaseParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(@NotNull SqlBaseParser.FunctionTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(@NotNull SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(@NotNull SqlBaseParser.ParenthesizedExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(@NotNull SqlBaseParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(@NotNull SqlBaseParser.InlineTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(@NotNull SqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(@NotNull SqlBaseParser.PrimitiveDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull SqlBaseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull SqlBaseParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(@NotNull SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(@NotNull SqlBaseParser.LogicalNotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(@NotNull SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(@NotNull SqlBaseParser.ColumnReferenceContext ctx);

	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(@NotNull SqlBaseParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(@NotNull SqlBaseParser.RefreshTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(@NotNull SqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(@NotNull SqlBaseParser.PartitionSpecContext ctx);

	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(@NotNull SqlBaseParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(@NotNull SqlBaseParser.CreateDatabaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(@NotNull SqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(@NotNull SqlBaseParser.NestedConstantListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(@NotNull SqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(@NotNull SqlBaseParser.TableIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull SqlBaseParser.StringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(@NotNull SqlBaseParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(@NotNull SqlBaseParser.AnalyzeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull SqlBaseParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull SqlBaseParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(@NotNull SqlBaseParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(@NotNull SqlBaseParser.ShowTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(@NotNull SqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(@NotNull SqlBaseParser.MultiInsertQueryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(@NotNull SqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(@NotNull SqlBaseParser.DoubleLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull SqlBaseParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull SqlBaseParser.IntervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(@NotNull SqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(@NotNull SqlBaseParser.SingleTableIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTable(@NotNull SqlBaseParser.DescribeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTable(@NotNull SqlBaseParser.DescribeTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(@NotNull SqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(@NotNull SqlBaseParser.QuotedIdentifierAlternativeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(@NotNull SqlBaseParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(@NotNull SqlBaseParser.UncacheTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#hintPredicate}.
	 * @param ctx the parse tree
	 */
	void enterHintPredicate(@NotNull SqlBaseParser.HintPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#hintPredicate}.
	 * @param ctx the parse tree
	 */
	void exitHintPredicate(@NotNull SqlBaseParser.HintPredicateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(@NotNull SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(@NotNull SqlBaseParser.ValueExpressionDefaultContext ctx);

	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(@NotNull SqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(@NotNull SqlBaseParser.StatementDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(@NotNull SqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(@NotNull SqlBaseParser.SingleDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(@NotNull SqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(@NotNull SqlBaseParser.IntervalLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(@NotNull SqlBaseParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(@NotNull SqlBaseParser.ColPositionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull SqlBaseParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull SqlBaseParser.TableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(@NotNull SqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(@NotNull SqlBaseParser.TableValuedFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(@NotNull SqlBaseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(@NotNull SqlBaseParser.FromClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(@NotNull SqlBaseParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(@NotNull SqlBaseParser.HintStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(@NotNull SqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(@NotNull SqlBaseParser.QueryTermDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(@NotNull SqlBaseParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(@NotNull SqlBaseParser.NonReservedContext ctx);

	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(@NotNull SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(@NotNull SqlBaseParser.UnquotedIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(@NotNull SqlBaseParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(@NotNull SqlBaseParser.ShowTblPropertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(@NotNull SqlBaseParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(@NotNull SqlBaseParser.PivotClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(@NotNull SqlBaseParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(@NotNull SqlBaseParser.ExistsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(@NotNull SqlBaseParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(@NotNull SqlBaseParser.FirstContext ctx);

	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(@NotNull SqlBaseParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(@NotNull SqlBaseParser.SubqueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(@NotNull SqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(@NotNull SqlBaseParser.SingleExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(@NotNull SqlBaseParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(@NotNull SqlBaseParser.UseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableSchema(@NotNull SqlBaseParser.SingleTableSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableSchema(@NotNull SqlBaseParser.SingleTableSchemaContext ctx);

	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(@NotNull SqlBaseParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(@NotNull SqlBaseParser.ClearCacheContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(@NotNull SqlBaseParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(@NotNull SqlBaseParser.TableAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(@NotNull SqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(@NotNull SqlBaseParser.FunctionIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(@NotNull SqlBaseParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(@NotNull SqlBaseParser.NamedQueryContext ctx);

	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(@NotNull SqlBaseParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(@NotNull SqlBaseParser.WindowRefContext ctx);

	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(@NotNull SqlBaseParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(@NotNull SqlBaseParser.RenameTablePartitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(@NotNull SqlBaseParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(@NotNull SqlBaseParser.LocationSpecContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(@NotNull SqlBaseParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(@NotNull SqlBaseParser.ShowCreateTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(@NotNull SqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(@NotNull SqlBaseParser.ShowColumnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(@NotNull SqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(@NotNull SqlBaseParser.ComplexColTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull SqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull SqlBaseParser.ComparisonContext ctx);

	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(@NotNull SqlBaseParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(@NotNull SqlBaseParser.SubscriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull SqlBaseParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull SqlBaseParser.ResourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(@NotNull SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(@NotNull SqlBaseParser.ComparisonOperatorContext ctx);

	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(@NotNull SqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(@NotNull SqlBaseParser.InsertOverwriteTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(@NotNull SqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(@NotNull SqlBaseParser.IntervalFieldContext ctx);

	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(@NotNull SqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(@NotNull SqlBaseParser.ConstantDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(@NotNull SqlBaseParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(@NotNull SqlBaseParser.LateralViewContext ctx);

	/**
	 * Enter a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateHiveTable(@NotNull SqlBaseParser.CreateHiveTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateHiveTable(@NotNull SqlBaseParser.CreateHiveTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(@NotNull SqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(@NotNull SqlBaseParser.CreateFunctionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(@NotNull SqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(@NotNull SqlBaseParser.SampleByPercentileContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(@NotNull SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(@NotNull SqlBaseParser.BooleanValueContext ctx);

	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(@NotNull SqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(@NotNull SqlBaseParser.QueryPrimaryDefaultContext ctx);

	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(@NotNull SqlBaseParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(@NotNull SqlBaseParser.PositionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(@NotNull SqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(@NotNull SqlBaseParser.TablePropertyListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(@NotNull SqlBaseParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(@NotNull SqlBaseParser.CreateTableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(@NotNull SqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(@NotNull SqlBaseParser.TinyIntLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(@NotNull SqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(@NotNull SqlBaseParser.OrderedIdentifierListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(@NotNull SqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(@NotNull SqlBaseParser.DescribeFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(@NotNull SqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(@NotNull SqlBaseParser.QuotedIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterChangeColumn(@NotNull SqlBaseParser.ChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitChangeColumn(@NotNull SqlBaseParser.ChangeColumnContext ctx);

	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(@NotNull SqlBaseParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(@NotNull SqlBaseParser.BooleanDefaultContext ctx);

	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(@NotNull SqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(@NotNull SqlBaseParser.GenericFileFormatContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(@NotNull SqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(@NotNull SqlBaseParser.StorageHandlerContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(@NotNull SqlBaseParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(@NotNull SqlBaseParser.SetTableSerDeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(@NotNull SqlBaseParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(@NotNull SqlBaseParser.WindowFrameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(@NotNull SqlBaseParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(@NotNull SqlBaseParser.ShowDatabasesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#hintExpression}.
	 * @param ctx the parse tree
	 */
	void enterHintExpression(@NotNull SqlBaseParser.HintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#hintExpression}.
	 * @param ctx the parse tree
	 */
	void exitHintExpression(@NotNull SqlBaseParser.HintExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(@NotNull SqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(@NotNull SqlBaseParser.NamedExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(@NotNull SqlBaseParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(@NotNull SqlBaseParser.TableProviderContext ctx);

	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(@NotNull SqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(@NotNull SqlBaseParser.InsertOverwriteDirContext ctx);

	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(@NotNull SqlBaseParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(@NotNull SqlBaseParser.UnsetTablePropertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(@NotNull SqlBaseParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(@NotNull SqlBaseParser.JoinTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(@NotNull SqlBaseParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(@NotNull SqlBaseParser.SetOperationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(@NotNull SqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(@NotNull SqlBaseParser.SampleByBucketContext ctx);

	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(@NotNull SqlBaseParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(@NotNull SqlBaseParser.NamedWindowContext ctx);
}