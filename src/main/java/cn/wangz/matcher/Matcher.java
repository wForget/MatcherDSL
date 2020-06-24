package cn.wangz.matcher;

import cn.wangz.matcher.dsl.MatcherLexer;
import cn.wangz.matcher.dsl.MatcherParser;
import cn.wangz.matcher.parse.ParseContext;
import cn.wangz.matcher.relnode.RelMatcher;
import cn.wangz.matcher.vistor.MatcherRelVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class Matcher {

    private String dsl;
    private Map<String, Object> variableMap;

    public Matcher(String dsl) {
        this(dsl, Collections.emptyMap());
    }

    public Matcher(String dsl, Map<String, Object> variableMap) {
        this.dsl = dsl;
        this.variableMap = variableMap;
    }

    public String getDsl() {
        return dsl;
    }

    public void setDsl(String dsl) {
        this.dsl = dsl;
    }

    public Map<String, Object> getVariableMap() {
        return variableMap;
    }

    public void setVariableMap(Map<String, Object> variableMap) {
        this.variableMap = variableMap;
    }

    public Boolean match() throws IOException {
        MatcherLexer lexer = new MatcherLexer(CharStreams.fromString(this.dsl));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        MatcherParser parser = new MatcherParser(tokenStream);
        MatcherParser.MatcherStatementContext statement = parser.matcherStatement();
        ParseContext parseContext = new ParseContext();
        parseContext.setVariableMap(this.variableMap);
        MatcherRelVisitor visitor = new MatcherRelVisitor(parseContext);
        RelMatcher relMatcher = visitor.visit(statement);
        return relMatcher.match();
    }
}
