package cn.wangz.matcher.function;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class FunctionFactory {

    private static final Logger logger = LoggerFactory.getLogger(FunctionFactory.class);

    private static Map<String, Class> functionsClassMap = new HashMap<>();
    static {
        loadFunctions();
    }

    public static Object execute(String funcName, Object... params) {
        Class functionClass = functionsClassMap.get(funcName.toUpperCase());
        if (functionClass == null) {
            throw new FunctionExecuteException("function " + funcName + " no found.");
        }
        try {
            Method executeMethod = null;
            for (Method method: functionClass.getMethods()) {
                if ("execute".equals(method.getName())) {
                    executeMethod = method;
                    break;
                }
            }
            return executeMethod.invoke(functionClass.newInstance(), (Object) params);
        } catch (Throwable t) {
            throw new FunctionExecuteException("function " + funcName + " execute failed.", t);
        }
    }

    private static final String FUNCTION_SCAN_PACKAGE = "cn.wangz.matcher.function";
    private static void loadFunctions() {
        try {
            scanPackage(FUNCTION_SCAN_PACKAGE.replaceAll("\\.", "/"));
        } catch (Exception e) {
            logger.warn("scan package error, base package: {}, exception: {}", FUNCTION_SCAN_PACKAGE, e);
        }
    }
    private static void scanPackage(String rootPath) throws IOException, ClassNotFoundException {
        URL url = FunctionFactory.class.getClassLoader().getResource(rootPath);
        if (url == null) return;
        File file = new File(url.getFile());
        if (file.isDirectory()) {
            String[] children = file.list();
            if (children == null && children.length < 1) return;
            for (String childName: children) {
                scanPackage(rootPath + "/" + childName);
            }
        } else {
            String name = file.getName();
            if (!name.endsWith(".class")) return;
            String className = name.substring(0, name.lastIndexOf("."));
            String fullClassName = rootPath.substring(0, rootPath.lastIndexOf(".")).replaceAll("/", ".");
            Class<?> funcClass = FunctionFactory.class.getClassLoader().loadClass(fullClassName);
            if (!funcClass.isAnnotationPresent(Function.class)) return;
            Function funcAnnotation = funcClass.getAnnotation(Function.class);
            String functionName = funcAnnotation.value();
            if (StringUtils.isBlank(functionName)) {
                functionName = CaseUtils.toCamelCase(className, false);
            }
            functionsClassMap.put(functionName.toUpperCase(), funcClass);
        }
    }

//    public static void main(String[] args) {
//        FunctionFactory.functionsClassMap.entrySet().forEach(entry -> {
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//        });
//
//        System.out.println(FunctionFactory.execute("upper", "hello ", "world!"));
//        System.out.println(FunctionFactory.execute("lower", "Hello ", "World!"));
//    }

}
