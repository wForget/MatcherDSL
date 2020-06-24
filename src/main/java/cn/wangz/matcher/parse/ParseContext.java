package cn.wangz.matcher.parse;

import java.util.HashMap;
import java.util.Map;

public class ParseContext {

    private Map<String, Object> variableMap = new HashMap<>();

    public Map<String, Object> getVariableMap() {
        return variableMap;
    }

    public void setVariableMap(Map<String, Object> variableMap) {
        this.variableMap = variableMap;
    }
}
