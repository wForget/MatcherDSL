package cn.wangz.matcher.relnode;

public class MultiRelMatcher implements RelMatcher {

    private RelMatcher left;
    private RelMatcher right;
    private String op;  // and or

    public MultiRelMatcher(RelMatcher left, RelMatcher right, String op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    @Override
    public Boolean match() {
        Boolean leftValue = left.match();
        Boolean rightValue = right.match();
        switch (op.toUpperCase()) {
            case "AND":
                return leftValue && rightValue;
            case "OR":
                return leftValue || rightValue;
            default:
                throw new RuntimeException("Unsupported operation.");
        }
    }

}
