package cn.wangz.matcher;

import org.apache.commons.text.StringEscapeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MatcherTests {

    @Test
    public void matchTest1() throws IOException {
        String matchDsl = "name = \"wangz\" and age > 20 and age < 30 and (interest = \"basketball\" or interest = \"football\") and desc =~ \"hello.*\"";
        Map<String, Object> variableMap = new HashMap<>();
        variableMap.put("name", "wangz");
        variableMap.put("age", 25);
        variableMap.put("interest", "basketball");
        variableMap.put("desc", "hello wangz");
        Matcher matcher = new Matcher(matchDsl, variableMap);
        Assert.assertEquals(matcher.match(), true);
    }

    @Test
    public void matchTest2() throws IOException {
        String matchDsl = "name = \"wangz\" and age > 20 and age < 30 and (interest = \"basketball\" or interest = \"football\") and desc =~ \"^hello.*$\"";
        Map<String, Object> variableMap = new HashMap<>();
        variableMap.put("name", "wangz");
        variableMap.put("age", 35);
        variableMap.put("interest", "basketball");
        variableMap.put("desc", "hello wangz");
        Matcher matcher = new Matcher(matchDsl, variableMap);
        Assert.assertEquals(matcher.match(), false);
    }

    @Test
    public void matchTest3() throws IOException {
        String matchDsl = "name = \"wangz\" and age > 20 and age < 30 and (interest = \"basketball\" or interest = \"football\") and desc =~ \"^hello.*$\"";
        Map<String, Object> variableMap = new HashMap<>();
        variableMap.put("name", "wangz");
        variableMap.put("age", 26);
        variableMap.put("interest", "others");
        variableMap.put("desc", "hello wangz");
        Matcher matcher = new Matcher(matchDsl, variableMap);
        Assert.assertEquals(matcher.match(), false);
    }

    @Test
    public void matchTest4() throws IOException {
        String matchDsl = "name = \"wangz\" and age > 20 and age < 30 and (interest = \"basketball\" or interest = \"football\") and desc =~ \"^hello.*$\"";
        Map<String, Object> variableMap = new HashMap<>();
        variableMap.put("name", "wangz");
        variableMap.put("age", 26);
        variableMap.put("interest", "football");
        variableMap.put("desc", "hello wangz");
        Matcher matcher = new Matcher(matchDsl, variableMap);
        Assert.assertEquals(matcher.match(), true);
    }

    @Test
    public void matchTest5() throws IOException {
        // test function
        String matchDsl = "lower(name) = lower(\"WangZ\") and age > 20 and age < 30 and (interest = \"basketball\" or interest = \"football\") and desc =~ \"hello.*\"";
        Map<String, Object> variableMap = new HashMap<>();
        variableMap.put("name", "WANGZ");
        variableMap.put("age", 25);
        variableMap.put("interest", "basketball");
        variableMap.put("desc", "hello wangz");
        Matcher matcher = new Matcher(matchDsl, variableMap);
        Assert.assertEquals(matcher.match(), true);
    }

//    @Test
//    public void unescapeJavaTest() {
//        String str = "{\"name\":\"sss\"}";
//        System.out.println(StringEscapeUtils.escapeJava(str));
//        System.out.println(StringEscapeUtils.escapeJson(str));
//        System.out.println(StringEscapeUtils.unescapeJava(str));
//        System.out.println(StringEscapeUtils.unescapeJson(str));
//    }

}
