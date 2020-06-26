package cn.wangz.matcher.relnode;

import cn.wangz.matcher.function.FunctionFactory;

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
        return FunctionFactory.execute(funcName, params.stream().map(item -> item.eval()).toArray());
    }
}
