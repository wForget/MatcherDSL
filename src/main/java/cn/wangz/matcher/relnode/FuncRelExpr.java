package cn.wangz.matcher.relnode;

import java.util.List;

public class FuncRelExpr implements RelExpr {

    private String funcName;
    private List<RelExpr> params;

    public FuncRelExpr(String funcName, List<RelExpr> params) {
        this.funcName = funcName;
        this.params = params;
    }

    @Override
    public Object eval() {
        // TODO
        return null;
    }
}
