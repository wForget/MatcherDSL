package cn.wangz.matcher.function;

public class FunctionExecuteException extends RuntimeException {

    public FunctionExecuteException() {
    }

    public FunctionExecuteException(String message) {
        super(message);
    }

    public FunctionExecuteException(String message, Throwable cause) {
        super(message, cause);
    }

    public FunctionExecuteException(Throwable cause) {
        super(cause);
    }

    public FunctionExecuteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
