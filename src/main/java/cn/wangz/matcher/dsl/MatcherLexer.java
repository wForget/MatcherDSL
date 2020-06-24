// Generated from cn.wangz.matcher.dsl\Matcher.g4 by ANTLR 4.8
package cn.wangz.matcher.dsl;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatcherLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND=2, OR=3, VARIABLE=4, STRING=5, SCIENTIFIC_NUMBER=6, LPAREN=7, 
		RPAREN=8, PLUS=9, MINUS=10, TIMES=11, DIV=12, GT=13, GTE=14, LT=15, LTE=16, 
		REG=17, EQ=18, POINT=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "AND", "OR", "VARIABLE", "VALID_ID_START", "STRING", "VALID_ID_CHAR", 
			"SCIENTIFIC_NUMBER", "NUMBER", "UNSIGNED_INTEGER", "E", "SIGN", "LPAREN", 
			"RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", "GTE", "LT", "LTE", 
			"REG", "EQ", "POINT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, null, null, "'('", "')'", "'+'", "'-'", 
			"'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=~'", "'='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND", "OR", "VARIABLE", "STRING", "SCIENTIFIC_NUMBER", "LPAREN", 
			"RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", "GTE", "LT", "LTE", 
			"REG", "EQ", "POINT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MatcherLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Matcher.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4"+
		"\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\5\6P\n\6\3\7"+
		"\3\7\3\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7"+
		"\16\7c\13\7\3\7\5\7f\n\7\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\5\to\n\t\3\t\3\t"+
		"\5\ts\n\t\3\n\6\nv\n\n\r\n\16\nw\3\n\3\n\6\n|\n\n\r\n\16\n}\5\n\u0080"+
		"\n\n\3\13\6\13\u0083\n\13\r\13\16\13\u0084\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6"+
		"\33\u00a9\n\33\r\33\16\33\u00aa\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\2"+
		"\r\7\17\2\21\b\23\2\25\2\27\2\31\2\33\t\35\n\37\13!\f#\r%\16\'\17)\20"+
		"+\21-\22/\23\61\24\63\25\65\26\3\2\b\5\2C\\aac|\4\2))^^\4\2$$^^\4\2GG"+
		"gg\4\2--//\5\2\13\f\17\17\"\"\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\3\67\3\2\2\2\5?\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13O\3\2\2\2\re\3\2\2\2"+
		"\17i\3\2\2\2\21k\3\2\2\2\23u\3\2\2\2\25\u0082\3\2\2\2\27\u0086\3\2\2\2"+
		"\31\u0088\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!"+
		"\u0090\3\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u0098\3"+
		"\2\2\2+\u009b\3\2\2\2-\u009d\3\2\2\2/\u00a0\3\2\2\2\61\u00a3\3\2\2\2\63"+
		"\u00a5\3\2\2\2\65\u00a8\3\2\2\2\678\7.\2\28\4\3\2\2\29:\7c\2\2:;\7p\2"+
		"\2;@\7f\2\2<=\7C\2\2=>\7P\2\2>@\7F\2\2?9\3\2\2\2?<\3\2\2\2@\6\3\2\2\2"+
		"AB\7q\2\2BF\7t\2\2CD\7Q\2\2DF\7T\2\2EA\3\2\2\2EC\3\2\2\2F\b\3\2\2\2GK"+
		"\5\13\6\2HJ\5\17\b\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\n\3\2\2"+
		"\2MK\3\2\2\2NP\t\2\2\2ON\3\2\2\2P\f\3\2\2\2QW\7)\2\2RV\n\3\2\2ST\7^\2"+
		"\2TV\13\2\2\2UR\3\2\2\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2"+
		"\2\2YW\3\2\2\2Zf\7)\2\2[a\7$\2\2\\`\n\4\2\2]^\7^\2\2^`\13\2\2\2_\\\3\2"+
		"\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2df\7$"+
		"\2\2eQ\3\2\2\2e[\3\2\2\2f\16\3\2\2\2gj\5\13\6\2hj\4\62;\2ig\3\2\2\2ih"+
		"\3\2\2\2j\20\3\2\2\2kr\5\23\n\2ln\5\27\f\2mo\5\31\r\2nm\3\2\2\2no\3\2"+
		"\2\2op\3\2\2\2pq\5\25\13\2qs\3\2\2\2rl\3\2\2\2rs\3\2\2\2s\22\3\2\2\2t"+
		"v\4\62;\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\177\3\2\2\2y{\7\60"+
		"\2\2z|\4\62;\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2"+
		"\177y\3\2\2\2\177\u0080\3\2\2\2\u0080\24\3\2\2\2\u0081\u0083\4\62;\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\26\3\2\2\2\u0086\u0087\t\5\2\2\u0087\30\3\2\2\2\u0088\u0089"+
		"\t\6\2\2\u0089\32\3\2\2\2\u008a\u008b\7*\2\2\u008b\34\3\2\2\2\u008c\u008d"+
		"\7+\2\2\u008d\36\3\2\2\2\u008e\u008f\7-\2\2\u008f \3\2\2\2\u0090\u0091"+
		"\7/\2\2\u0091\"\3\2\2\2\u0092\u0093\7,\2\2\u0093$\3\2\2\2\u0094\u0095"+
		"\7\61\2\2\u0095&\3\2\2\2\u0096\u0097\7@\2\2\u0097(\3\2\2\2\u0098\u0099"+
		"\7@\2\2\u0099\u009a\7?\2\2\u009a*\3\2\2\2\u009b\u009c\7>\2\2\u009c,\3"+
		"\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7?\2\2\u009f.\3\2\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1\u00a2\7\u0080\2\2\u00a2\60\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4"+
		"\62\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6\64\3\2\2\2\u00a7\u00a9\t\7\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\33\2\2\u00ad\66\3\2\2\2\24"+
		"\2?EKOUW_aeinrw}\177\u0084\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}