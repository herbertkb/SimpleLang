// Generated from SimpleLang.g4 by ANTLR 4.5.2

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declareInt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareInt(SimpleLangParser.DeclareIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declareInt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareInt(SimpleLangParser.DeclareIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declareString}.
	 * @param ctx the parse tree
	 */
	void enterDeclareString(SimpleLangParser.DeclareStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declareString}.
	 * @param ctx the parse tree
	 */
	void exitDeclareString(SimpleLangParser.DeclareStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declareInferred}.
	 * @param ctx the parse tree
	 */
	void enterDeclareInferred(SimpleLangParser.DeclareInferredContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declareInferred}.
	 * @param ctx the parse tree
	 */
	void exitDeclareInferred(SimpleLangParser.DeclareInferredContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpleLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpleLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleLangParser.ExpressionContext ctx);
}