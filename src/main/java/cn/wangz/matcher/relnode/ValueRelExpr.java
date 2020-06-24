package cn.wangz.matcher.relnode;

import cn.wangz.matcher.parse.ParseContext;
import cn.wangz.matcher.utils.NumberUtils;
import org.apache.commons.text.StringEscapeUtils;

import java.util.Optional;

public class ValueRelExpr implements RelExpr {

    private Optional<String> sign;
    private Type type;
    private String value;
    private ParseContext parseContext;

    public ValueRelExpr(Type type, String value, ParseContext parseContext) {
        this(Optional.empty(), type, value, parseContext);
    }

    public ValueRelExpr(Optional<String> sign, Type type, String value, ParseContext parseContext) {
        this.sign = sign;
        this.type = type;
        this.value = value;
        this.parseContext = parseContext;
    }

    @Override
    public Object eval() {
        switch (type) {
            case NUMBER:
                return NumberUtils.toNumber(sign.orElse("") + value);
            case STRING:
                if (sign.isPresent()) {
                    throw new RuntimeException("string value does not need a sing.");
                }
                return unescapeString(value);
            case VARIABLE:
                if (!parseContext.getVariableMap().containsKey(value)) {
                    throw new RuntimeException("variable does not exist.");
                }
                Object relValue = parseContext.getVariableMap().get(value);
                if (NumberUtils.isNumber(relValue)) {
                    return NumberUtils.toNumber(sign.orElse("") + relValue);
                } else {
                    if (sign.isPresent()) {
                        throw new RuntimeException("string value does not need a sing.");
                    }
                    return relValue;
                }
            default:
                break;
        }
        throw new RuntimeException("no match value type.");
    }

    private String unescapeString(String value) {
        return StringEscapeUtils.unescapeJava(value.substring(1, value.length() - 1));
    }


    public enum Type {
        NUMBER, STRING, VARIABLE
    }

    public void setSign(Optional<String> sign) {
        this.sign = sign;
    }
}
