// Generated from /home/slowcheetah/work_dir/sxf/src/Sxf.g4 by ANTLR 4.9.2
package stelix.xfile.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SxfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INTEGER=7, SET=8, SET_LONG=9, 
		BLOCK_START=10, BLOCK_END=11, SEPARATOR=12, SP_START=13, SP_END=14, IDENTIFIER=15, 
		StringLiteral=16, WS=17, UnterminatedStringLiteral=18, BlockComment=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INTEGER", "SET", "SET_LONG", 
			"BLOCK_START", "BLOCK_END", "SEPARATOR", "SP_START", "SP_END", "IDENTIFIER", 
			"StringLiteral", "WS", "UnterminatedStringLiteral", "A", "B", "C", "D", 
			"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
			"S", "T", "U", "V", "W", "X", "Y", "Z", "BlockComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'false'", "'FALSE'", "'true'", "'TRUE'", "'null'", null, 
			"':'", "'=>'", "'{'", "'}'", "','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INTEGER", "SET", "SET_LONG", 
			"BLOCK_START", "BLOCK_END", "SEPARATOR", "SP_START", "SP_END", "IDENTIFIER", 
			"StringLiteral", "WS", "UnterminatedStringLiteral", "BlockComment"
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


	public SxfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sxf.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00ee\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\5\b|\n\b\3\b\6\b\177\n\b\r\b\16\b\u0080\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20\u0093\n\20\r\20\16\20\u0094"+
		"\3\21\3\21\3\21\3\22\6\22\u009b\n\22\r\22\16\22\u009c\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u00a6\n\23\7\23\u00a8\n\23\f\23\16\23\u00ab\13"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3.\3.\7.\u00e5\n.\f.\16.\u00e8\13.\3.\3.\3.\3.\3.\3\u00e6\2"+
		"/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2"+
		"C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\25\3\2 \3\2\62;\7\2//\62;C\\aac"+
		"|\5\2\13\f\16\17\"\"\6\2\f\f\17\17$$^^\4\2CCcc\4\2DDdd\4\2EEee\4\2FFf"+
		"f\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u00db\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2[\3\2"+
		"\2\2\3]\3\2\2\2\5_\3\2\2\2\7e\3\2\2\2\tk\3\2\2\2\13p\3\2\2\2\ru\3\2\2"+
		"\2\17{\3\2\2\2\21\u0082\3\2\2\2\23\u0084\3\2\2\2\25\u0087\3\2\2\2\27\u0089"+
		"\3\2\2\2\31\u008b\3\2\2\2\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0092\3"+
		"\2\2\2!\u0096\3\2\2\2#\u009a\3\2\2\2%\u00a0\3\2\2\2\'\u00ac\3\2\2\2)\u00ae"+
		"\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2"+
		"\63\u00b8\3\2\2\2\65\u00ba\3\2\2\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0"+
		"\3\2\2\2=\u00c2\3\2\2\2?\u00c4\3\2\2\2A\u00c6\3\2\2\2C\u00c8\3\2\2\2E"+
		"\u00ca\3\2\2\2G\u00cc\3\2\2\2I\u00ce\3\2\2\2K\u00d0\3\2\2\2M\u00d2\3\2"+
		"\2\2O\u00d4\3\2\2\2Q\u00d6\3\2\2\2S\u00d8\3\2\2\2U\u00da\3\2\2\2W\u00dc"+
		"\3\2\2\2Y\u00de\3\2\2\2[\u00e0\3\2\2\2]^\7\60\2\2^\4\3\2\2\2_`\7h\2\2"+
		"`a\7c\2\2ab\7n\2\2bc\7u\2\2cd\7g\2\2d\6\3\2\2\2ef\7H\2\2fg\7C\2\2gh\7"+
		"N\2\2hi\7U\2\2ij\7G\2\2j\b\3\2\2\2kl\7v\2\2lm\7t\2\2mn\7w\2\2no\7g\2\2"+
		"o\n\3\2\2\2pq\7V\2\2qr\7T\2\2rs\7W\2\2st\7G\2\2t\f\3\2\2\2uv\7p\2\2vw"+
		"\7w\2\2wx\7n\2\2xy\7n\2\2y\16\3\2\2\2z|\7/\2\2{z\3\2\2\2{|\3\2\2\2|~\3"+
		"\2\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\20\3\2\2\2\u0082\u0083\7<\2\2\u0083\22\3\2\2\2\u0084\u0085"+
		"\7?\2\2\u0085\u0086\7@\2\2\u0086\24\3\2\2\2\u0087\u0088\7}\2\2\u0088\26"+
		"\3\2\2\2\u0089\u008a\7\177\2\2\u008a\30\3\2\2\2\u008b\u008c\7.\2\2\u008c"+
		"\32\3\2\2\2\u008d\u008e\7]\2\2\u008e\34\3\2\2\2\u008f\u0090\7_\2\2\u0090"+
		"\36\3\2\2\2\u0091\u0093\t\3\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095 \3\2\2\2\u0096\u0097"+
		"\5%\23\2\u0097\u0098\7$\2\2\u0098\"\3\2\2\2\u0099\u009b\t\4\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\22\2\2\u009f$\3\2\2\2\u00a0\u00a9"+
		"\7$\2\2\u00a1\u00a8\n\5\2\2\u00a2\u00a5\7^\2\2\u00a3\u00a6\13\2\2\2\u00a4"+
		"\u00a6\7\2\2\3\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa&\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00ad\t\6\2\2\u00ad(\3\2\2\2\u00ae\u00af\t\7\2\2\u00af*\3\2\2\2"+
		"\u00b0\u00b1\t\b\2\2\u00b1,\3\2\2\2\u00b2\u00b3\t\t\2\2\u00b3.\3\2\2\2"+
		"\u00b4\u00b5\t\n\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\t\13\2\2\u00b7\62\3"+
		"\2\2\2\u00b8\u00b9\t\f\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\t\r\2\2\u00bb"+
		"\66\3\2\2\2\u00bc\u00bd\t\16\2\2\u00bd8\3\2\2\2\u00be\u00bf\t\17\2\2\u00bf"+
		":\3\2\2\2\u00c0\u00c1\t\20\2\2\u00c1<\3\2\2\2\u00c2\u00c3\t\21\2\2\u00c3"+
		">\3\2\2\2\u00c4\u00c5\t\22\2\2\u00c5@\3\2\2\2\u00c6\u00c7\t\23\2\2\u00c7"+
		"B\3\2\2\2\u00c8\u00c9\t\24\2\2\u00c9D\3\2\2\2\u00ca\u00cb\t\25\2\2\u00cb"+
		"F\3\2\2\2\u00cc\u00cd\t\26\2\2\u00cdH\3\2\2\2\u00ce\u00cf\t\27\2\2\u00cf"+
		"J\3\2\2\2\u00d0\u00d1\t\30\2\2\u00d1L\3\2\2\2\u00d2\u00d3\t\31\2\2\u00d3"+
		"N\3\2\2\2\u00d4\u00d5\t\32\2\2\u00d5P\3\2\2\2\u00d6\u00d7\t\33\2\2\u00d7"+
		"R\3\2\2\2\u00d8\u00d9\t\34\2\2\u00d9T\3\2\2\2\u00da\u00db\t\35\2\2\u00db"+
		"V\3\2\2\2\u00dc\u00dd\t\36\2\2\u00ddX\3\2\2\2\u00de\u00df\t\37\2\2\u00df"+
		"Z\3\2\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e2\7=\2\2\u00e2\u00e6\3\2\2\2\u00e3"+
		"\u00e5\13\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7=\2\2\u00ea\u00eb\7&\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b.\2"+
		"\2\u00ed\\\3\2\2\2\13\2{\u0080\u0094\u009c\u00a5\u00a7\u00a9\u00e6\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}