// Generated from YARSpg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YARSpgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, STRING=11, NUMBER=12, NULL=13, TRUE_FALSE=14, STRING_LITERAL_QUOTE=15, 
		ALNUM_PLUS=16, PN_CHARS=17, PN_CHARS_U=18, UCHAR=19, PN_CHARS_BASE=20, 
		HEX=21, SP=22, NL=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "STRING", "NUMBER", "NULL", "TRUE_FALSE", "STRING_LITERAL_QUOTE", 
		"ALNUM_PLUS", "PN_CHARS", "PN_CHARS_U", "UCHAR", "PN_CHARS_BASE", "HEX", 
		"SP", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "':'", "']'", "'{'", "','", "'}'", "'('", "')'", "'-'", "'->'", 
		null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "STRING", 
		"NUMBER", "NULL", "TRUE_FALSE", "STRING_LITERAL_QUOTE", "ALNUM_PLUS", 
		"PN_CHARS", "PN_CHARS_U", "UCHAR", "PN_CHARS_BASE", "HEX", "SP", "NL"
	};
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


	public YARSpgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YARSpg.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\6\rJ\n\r\r\r\16\rK\3\r\5\rO\n\r\3\r\7\rR\n\r"+
		"\f\r\16\rU\13\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17e\n\17\3\20\3\20\3\20\3\20\3\20\7\20l\n\20\f\20\16"+
		"\20o\13\20\3\20\3\20\3\21\3\21\3\21\7\21v\n\21\f\21\16\21y\13\21\3\21"+
		"\5\21|\n\21\3\22\3\22\5\22\u0080\n\22\3\23\3\23\5\23\u0084\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u009a\n\24\3\25\3\25\3\26\5\26\u009f\n\26"+
		"\3\27\6\27\u00a2\n\27\r\27\16\27\u00a3\3\27\3\27\3\30\3\30\2\2\31\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\t\3\2\62;\6\2\f\f\17\17$$^^\7\2"+
		"//\62;\u00b9\u00b9\u0302\u0371\u2041\u2042\20\2\62;C\\c|\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02"+
		"\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\5\2\62;CHch\4\2\13\13\"\"\4"+
		"\2\f\f\17\17\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2"+
		"\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3"+
		"\2\2\2\27F\3\2\2\2\31I\3\2\2\2\33V\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!r\3"+
		"\2\2\2#\177\3\2\2\2%\u0083\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u009e"+
		"\3\2\2\2-\u00a1\3\2\2\2/\u00a7\3\2\2\2\61\62\7]\2\2\62\4\3\2\2\2\63\64"+
		"\7<\2\2\64\6\3\2\2\2\65\66\7_\2\2\66\b\3\2\2\2\678\7}\2\28\n\3\2\2\29"+
		":\7.\2\2:\f\3\2\2\2;<\7\177\2\2<\16\3\2\2\2=>\7*\2\2>\20\3\2\2\2?@\7+"+
		"\2\2@\22\3\2\2\2AB\7/\2\2B\24\3\2\2\2CD\7/\2\2DE\7@\2\2E\26\3\2\2\2FG"+
		"\5\37\20\2G\30\3\2\2\2HJ\t\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2"+
		"\2LN\3\2\2\2MO\7\60\2\2NM\3\2\2\2NO\3\2\2\2OS\3\2\2\2PR\t\2\2\2QP\3\2"+
		"\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\32\3\2\2\2US\3\2\2\2VW\7p\2\2WX\7"+
		"w\2\2XY\7n\2\2YZ\7n\2\2Z\34\3\2\2\2[\\\7v\2\2\\]\7t\2\2]^\7w\2\2^e\7g"+
		"\2\2_`\7h\2\2`a\7c\2\2ab\7n\2\2bc\7u\2\2ce\7g\2\2d[\3\2\2\2d_\3\2\2\2"+
		"e\36\3\2\2\2fm\7$\2\2gl\n\3\2\2hl\7)\2\2ij\7^\2\2jl\7$\2\2kg\3\2\2\2k"+
		"h\3\2\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2"+
		"pq\7$\2\2q \3\2\2\2r{\5)\25\2sv\5#\22\2tv\7\60\2\2us\3\2\2\2ut\3\2\2\2"+
		"vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z|\5#\22\2{w\3\2\2\2"+
		"{|\3\2\2\2|\"\3\2\2\2}\u0080\5%\23\2~\u0080\t\4\2\2\177}\3\2\2\2\177~"+
		"\3\2\2\2\u0080$\3\2\2\2\u0081\u0084\5)\25\2\u0082\u0084\7a\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0082\3\2\2\2\u0084&\3\2\2\2\u0085\u0086\7^\2\2\u0086\u0087"+
		"\7w\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5+\26\2\u0089\u008a\5+\26\2\u008a"+
		"\u008b\5+\26\2\u008b\u008c\5+\26\2\u008c\u009a\3\2\2\2\u008d\u008e\7^"+
		"\2\2\u008e\u008f\7W\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5+\26\2\u0091"+
		"\u0092\5+\26\2\u0092\u0093\5+\26\2\u0093\u0094\5+\26\2\u0094\u0095\5+"+
		"\26\2\u0095\u0096\5+\26\2\u0096\u0097\5+\26\2\u0097\u0098\5+\26\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0085\3\2\2\2\u0099\u008d\3\2\2\2\u009a(\3\2\2\2"+
		"\u009b\u009c\t\5\2\2\u009c*\3\2\2\2\u009d\u009f\t\6\2\2\u009e\u009d\3"+
		"\2\2\2\u009f,\3\2\2\2\u00a0\u00a2\t\7\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\b\27\2\2\u00a6.\3\2\2\2\u00a7\u00a8\t\b\2\2\u00a8\60\3\2\2\2\22"+
		"\2KNSdkmuw{\177\u0083\u0099\u009e\u00a1\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}