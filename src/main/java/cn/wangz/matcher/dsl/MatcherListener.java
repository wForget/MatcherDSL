// Generated from cn.wangz.matcher.dsl\Matcher.g4 by ANTLR 4.8
package cn.wangz.matcher.dsl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatcherParser}.
 */
public interface MatcherListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MatcherParser#matcherStatement}.
	 * @param ctx the parse tree
	 */
	void enterMatcherStatement(MatcherParser.MatcherStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#matcherStatement}.
	 * @param ctx the parse tree
	 */
	void exitMatcherStatement(MatcherParser.MatcherStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiMatcher}
	 * labeled alternative in {@link MatcherParser#matcher}.
	 * @param ctx the parse tree
	 */
	void enterMultiMatcher(MatcherParser.MultiMatcherContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiMatcher}
	 * labeled alternative in {@link MatcherParser#matcher}.
	 * @param ctx the parse tree
	 */
	void exitMultiMatcher(MatcherParser.MultiMatcherContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedMatcher}
	 * labeled alternative in {@link MatcherParser#matcher}.
	 * @param ctx the parse tree
	 */
	void enterBracketedMatcher(MatcherParser.BracketedMatcherContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedMatcher}
	 * labeled alternative in {@link MatcherParser#matcher}.
	 * @param ctx the parse tree
	 */
	void exitBracketedMatcher(MatcherParser.BracketedMatcherContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleMatcher}
	 * labeled alternative in {@link MatcherParser#matcher}.
	 * @param ctx the parse tree
	 */
	void enterSingleMatcher(MatcherParser.SingleMatcherContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleMatcher}
	 * labeled alternative in {@link MatcherParser#matcher}.
	 * @param ctx the parse tree
	 */
	void exitSingleMatcher(MatcherParser.SingleMatcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatcherParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(MatcherParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(MatcherParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCalExpr(MatcherParser.CalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCalExpr(MatcherParser.CalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(MatcherParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(MatcherParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketedExpr(MatcherParser.BracketedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketedExpr(MatcherParser.BracketedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(MatcherParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(MatcherParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatcherParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MatcherParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MatcherParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatcherParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(MatcherParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(MatcherParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatcherParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MatcherParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MatcherParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatcherParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MatcherParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MatcherParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatcherParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(MatcherParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(MatcherParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatcherParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MatcherParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MatcherParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatcherParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(MatcherParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(MatcherParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatcherParser#logop}.
	 * @param ctx the parse tree
	 */
	void enterLogop(MatcherParser.LogopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatcherParser#logop}.
	 * @param ctx the parse tree
	 */
	void exitLogop(MatcherParser.LogopContext ctx);
}