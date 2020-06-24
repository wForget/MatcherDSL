package cn.wangz.matcher.relnode;

import cn.wangz.matcher.utils.NumberUtils;

public class CalRelExpr implements RelExpr {

    private RelExpr left;
    private RelExpr right;
    private String op;  // + - * /

    public CalRelExpr(RelExpr left, RelExpr right, String op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    @Override
    public Object eval() {
        Number leftNum = NumberUtils.toNumber(String.valueOf(left.eval()));
        Number rightNum = NumberUtils.toNumber(String.valueOf(right.eval()));
        return NumberUtils.calculate(leftNum, rightNum, op);
    }

}
