package cn.wangz.matcher.relnode;

import java.util.regex.Pattern;

public class EquationRelMatcher implements RelMatcher {

    private RelExpr left;
    private RelExpr right;
    private String op;  // > >= < <= = =~

    public EquationRelMatcher(RelExpr left, RelExpr right, String op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    @Override
    public Boolean match() {
        Comparable leftValue = (Comparable) left.eval();
        Comparable rightValue = (Comparable) right.eval();
        int compareValue = leftValue.compareTo(rightValue);
        switch (op) {
            case ">":
                return compareValue > 0;
            case ">=":
                return compareValue >= 0;
            case "<":
                return compareValue < 0;
            case "<=":
                return compareValue <= 0;
            case "=":
                return compareValue == 0;
            case "=~":
                return compareReg(leftValue, rightValue);
            default:
                throw new RuntimeException("Unsupported operation.");
        }
    }

    private boolean compareReg(Object left, Object right) {
        Pattern pattern = Pattern.compile(right.toString());
        return pattern.matcher(left.toString()).find();
    }

}
