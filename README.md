## MatcherDSL

实现 matcher dsl 表达式，实现规则匹配功能(类似规则引擎)。

## Features

+ 支持算术运算符 + - * /
+ 支持条件运算符 > >= < <= =
+ 支持正则匹配 =~
+ 支持逻辑运算符 AND OR
+ 支持定义函数

## Use Demo

```
    String matchDsl = "lower(name) = lower(\"WangZ\") and age > 20 and age < 30 and (interest = \"basketball\" or interest = \"football\") and desc =~ \"hello.*\"";
    Map<String, Object> variableMap = new HashMap<>();
    variableMap.put("name", "WANGZ");
    variableMap.put("age", 25);
    variableMap.put("interest", "basketball");
    variableMap.put("desc", "hello wangz");
    Matcher matcher = new Matcher(matchDsl, variableMap);
    Assert.assertEquals(matcher.match(), true);
```

## 说明

1. 定义函数

可在 cn.wangz.matcher.function.impl 包中实现新的函数，继承 IFunction 接口，并添加 @Function 注解并实现 execute 方法。

## 参考

+ [从0到1搭建技术中台之报警平台实践：匹配器演进](https://www.infoq.cn/article/HzCDvxc0dc5F5clozoeT)
+ [arithmetic.g4](https://github.com/antlr/grammars-v4/blob/master/arithmetic/arithmetic.g4)