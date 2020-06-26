package cn.wangz.matcher.function.impl;

import cn.wangz.matcher.function.Function;
import cn.wangz.matcher.function.FunctionExecuteException;
import cn.wangz.matcher.function.IFunction;

import java.util.Arrays;
import java.util.stream.Collectors;

@Function("lower")
public class ToLowerFunc implements IFunction {

    @Override
    public Object execute(Object... params) {
        if (params.length < 1) {
            throw new FunctionExecuteException("upper function params length mismatch.");
        }
        return Arrays.asList(params).stream()
                .map(item -> String.valueOf(item).toLowerCase())
                .collect(Collectors.joining(" "));
    }

}
