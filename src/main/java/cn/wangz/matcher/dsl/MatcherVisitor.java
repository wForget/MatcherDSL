// Generated from cn.wangz.matcher.dsl\Matcher.g4 by ANTLR 4.8
package cn.wangz.matcher.dsl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MatcherParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MatcherVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MatcherParser#matcherStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatcherStatement(MatcherParser.MatcherStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiMatcher}
	 * labeled alternative in {@link MatcherParser#matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiMatcher(MatcherParser.MultiMatcherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedMatcher}
	 * labeled alternative in {@link MatcherParser#matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedMatcher(MatcherParser.BracketedMatcherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleMatcher}
	 * labeled alternative in {@link MatcherParser#matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleMatcher(MatcherParser.SingleMatcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatcherParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(MatcherParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalExpr(MatcherParser.CalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(MatcherParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedExpr(MatcherParser.BracketedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MatcherParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(MatcherParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatcherParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MatcherParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatcherParser#funcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncName(MatcherParser.FuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatcherParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MatcherParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatcherParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MatcherParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatcherParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(MatcherParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatcherParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MatcherParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatcherParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(MatcherParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatcherParser#logop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogop(MatcherParser.LogopContext ctx);
}