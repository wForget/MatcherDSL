package cn.wangz.matcher.vistor;

import cn.wangz.matcher.dsl.MatcherBaseVisitor;
import cn.wangz.matcher.dsl.MatcherParser;
import cn.wangz.matcher.parse.ParseContext;
import cn.wangz.matcher.relnode.*;

public class MatcherRelVisitor extends MatcherBaseVisitor<RelMatcher> {

    private ParseContext parseContext;
    private ExprRelVisitor exprRelVisitor;

    public MatcherRelVisitor(ParseContext parseContext) {
        this.parseContext = parseContext;
        this.exprRelVisitor = new ExprRelVisitor(parseContext);
    }

    @Override
    public RelMatcher visitMatcherStatement(MatcherParser.MatcherStatementContext ctx) {
        return visitMatcher(ctx.matcher());
    }

    @Override
    public RelMatcher visitMultiMatcher(MatcherParser.MultiMatcherContext ctx) {
        RelMatcher left = visitMatcher(ctx.matcher().get(0));
        RelMatcher right = visitMatcher(ctx.matcher().get(1));
        String op = ctx.logop().getText();
        return new MultiRelMatcher(left, right, op);
    }

    @Override
    public RelMatcher visitBracketedMatcher(MatcherParser.BracketedMatcherContext ctx) {
        return new SingleRelMatcher(visitMatcher(ctx.matcher()));
    }

    @Override
    public RelMatcher visitSingleMatcher(MatcherParser.SingleMatcherContext ctx) {
        return new SingleRelMatcher(visitEquation(ctx.equation()));
    }

    @Override
    public RelMatcher visitEquation(MatcherParser.EquationContext ctx) {
        RelExpr left = exprRelVisitor.visitExpression(ctx.expression().get(0));
        RelExpr right = exprRelVisitor.visitExpression(ctx.expression().get(1));
        String op = ctx.relop().getText();
        return new EquationRelMatcher(left, right, op);
    }

    public RelMatcher visitMatcher(MatcherParser.MatcherContext ctx) {
        if (ctx instanceof MatcherParser.MultiMatcherContext) {
            return visitMultiMatcher((MatcherParser.MultiMatcherContext) ctx);
        }
        if (ctx instanceof MatcherParser.BracketedMatcherContext) {
            return visitBracketedMatcher((MatcherParser.BracketedMatcherContext) ctx);
        }
        if (ctx instanceof MatcherParser.SingleMatcherContext) {
            return visitSingleMatcher((MatcherParser.SingleMatcherContext) ctx);
        }
        throw new RuntimeException("no case MatcherContext");
    }

}
