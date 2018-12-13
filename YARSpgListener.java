// Generated from YARSpg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YARSpgParser}.
 */
public interface YARSpgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#yarspg}.
	 * @param ctx the parse tree
	 */
	void enterYarspg(YARSpgParser.YarspgContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#yarspg}.
	 * @param ctx the parse tree
	 */
	void exitYarspg(YARSpgParser.YarspgContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YARSpgParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YARSpgParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(YARSpgParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(YARSpgParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#nodeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNodeDeclaration(YARSpgParser.NodeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#nodeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNodeDeclaration(YARSpgParser.NodeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#relationship}.
	 * @param ctx the parse tree
	 */
	void enterRelationship(YARSpgParser.RelationshipContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#relationship}.
	 * @param ctx the parse tree
	 */
	void exitRelationship(YARSpgParser.RelationshipContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#directed}.
	 * @param ctx the parse tree
	 */
	void enterDirected(YARSpgParser.DirectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#directed}.
	 * @param ctx the parse tree
	 */
	void exitDirected(YARSpgParser.DirectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#undirected}.
	 * @param ctx the parse tree
	 */
	void enterUndirected(YARSpgParser.UndirectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#undirected}.
	 * @param ctx the parse tree
	 */
	void exitUndirected(YARSpgParser.UndirectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#relationship_label}.
	 * @param ctx the parse tree
	 */
	void enterRelationship_label(YARSpgParser.Relationship_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#relationship_label}.
	 * @param ctx the parse tree
	 */
	void exitRelationship_label(YARSpgParser.Relationship_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node_label}.
	 * @param ctx the parse tree
	 */
	void enterNode_label(YARSpgParser.Node_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node_label}.
	 * @param ctx the parse tree
	 */
	void exitNode_label(YARSpgParser.Node_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(YARSpgParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(YARSpgParser.PropContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(YARSpgParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(YARSpgParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(YARSpgParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(YARSpgParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#single_key_value}.
	 * @param ctx the parse tree
	 */
	void enterSingle_key_value(YARSpgParser.Single_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#single_key_value}.
	 * @param ctx the parse tree
	 */
	void exitSingle_key_value(YARSpgParser.Single_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#multiple_key_values}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_key_values(YARSpgParser.Multiple_key_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#multiple_key_values}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_key_values(YARSpgParser.Multiple_key_valuesContext ctx);
}