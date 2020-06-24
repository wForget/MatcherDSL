package cn.wangz.matcher.utils;

public class NumberUtils {

    public static boolean isNumber(Object o) {
        return o instanceof Number;
    }

    public static Number toNumber(String value) {
        if (value.contains(".")) {
            return Double.valueOf(value);
        } else {
            return Long.valueOf(value);
        }
    }

    public static Number calculate(Number left, Number right, String op) {
        switch (op) {
            case "+":
                return left.doubleValue() + right.doubleValue();
            case "-":
                return left.doubleValue() - right.doubleValue();
            case "*":
                return left.doubleValue() * right.doubleValue();
            case "/":
                return left.doubleValue() / right.doubleValue();
            default:
                throw new RuntimeException("Unsupported operation.");
        }
    }

}
