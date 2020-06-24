package cn.wangz.matcher.vistor;

import cn.wangz.matcher.dsl.MatcherBaseVisitor;
import cn.wangz.matcher.dsl.MatcherParser;
import cn.wangz.matcher.parse.ParseContext;
import cn.wangz.matcher.relnode.CalRelExpr;
import cn.wangz.matcher.relnode.FuncRelExpr;
import cn.wangz.matcher.relnode.RelExpr;
import cn.wangz.matcher.relnode.ValueRelExpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExprRelVisitor extends MatcherBaseVisitor<RelExpr> {

    private ParseContext parseContext;

    public ExprRelVisitor(ParseContext parseContext) {
        this.parseContext = parseContext;
    }

    @Override
    public RelExpr visitCalExpr(MatcherParser.CalExprContext ctx) {
        RelExpr left = visitExpression(ctx.expression().get(0));
        RelExpr right = visitExpression(ctx.expression().get(1));
        String op = null;
        if (ctx.TIMES() != null) op = ctx.TIMES().getText();
        if (ctx.DIV() != null) op = ctx.DIV().getText();
        if (ctx.PLUS() != null) op = ctx.PLUS().getText();
        if (ctx.MINUS() != null) op = ctx.MINUS().getText();
        return new CalRelExpr(left, right, op);
    }

    @Override
    public RelExpr visitValueExpr(MatcherParser.ValueExprContext ctx) {
        Optional<String> sign = Optional.empty();
        if (ctx.PLUS() != null) {
            sign = Optional.of(ctx.PLUS().getText());
        }
        if (ctx.MINUS() != null) {
            sign = Optional.of(ctx.MINUS().getText());
        }

        ValueRelExpr valueRelExpr = (ValueRelExpr) visitAtom(ctx.atom());
        valueRelExpr.setSign(sign);
        return valueRelExpr;
    }

    @Override
    public RelExpr visitBracketedExpr(MatcherParser.BracketedExprContext ctx) {
        return visitExpression(ctx.expression());
    }

    @Override
    public RelExpr visitFunctionExpr(MatcherParser.FunctionExprContext ctx) {
        return this.visitFunction(ctx.function());
    }

    @Override
    public RelExpr visitFunction(MatcherParser.FunctionContext ctx) {
        String funcName = ctx.funcName().getText();
        List<RelExpr> params = new ArrayList<>();
        if (ctx.expression() != null) {
            for (MatcherParser.ExpressionContext expressionContext: ctx.expression()) {
                params.add(visitExpression(expressionContext));
            }
        }
        return new FuncRelExpr(funcName, params);
    }

    @Override
    public RelExpr visitAtom(MatcherParser.AtomContext ctx) {
        ValueRelExpr.Type type = null;
        String value = null;
        if (ctx.scientific() != null) {
            type = ValueRelExpr.Type.NUMBER;
            value = ctx.scientific().getText();
        }
        if (ctx.variable() != null) {
            type = ValueRelExpr.Type.VARIABLE;
            value = ctx.variable().getText();
        }
        if (ctx.STRING() != null) {
            type = ValueRelExpr.Type.STRING;
            value = ctx.STRING().getText();
        }
        if (type == null || value == null) {
            throw new RuntimeException("visit atom error, type or value is null!");
        }
        return new ValueRelExpr(type, value, parseContext);
    }

    public RelExpr visitExpression(MatcherParser.ExpressionContext ctx) {
        if (ctx instanceof MatcherParser.CalExprContext) {
            return visitCalExpr((MatcherParser.CalExprContext) ctx);
        }
        if (ctx instanceof MatcherParser.FunctionExprContext) {
            return visitFunctionExpr((MatcherParser.FunctionExprContext) ctx);
        }
        if (ctx instanceof MatcherParser.ValueExprContext) {
            return visitValueExpr((MatcherParser.ValueExprContext) ctx);
        }
        if (ctx instanceof MatcherParser.BracketedExprContext) {
            return visitBracketedExpr((MatcherParser.BracketedExprContext) ctx);
        }
        throw new RuntimeException("no case ExpressionContext");
    }

}
