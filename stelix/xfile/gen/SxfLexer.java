// Generated from /home/slowcheetah/work_dir/StelixObjectFile/src/Sxf.g4 by ANTLR 4.9.1
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, IDENTIFIER=16, 
		STATIC=17, SET=18, LEFT_CURLY=19, RIGHT_CURLY=20, LEFT_PAR=21, RIGHT_PAR=22, 
		LEFT_SBRACE=23, RIGHT_SBRACE=24, OBJECT_SET=25, EXECUTE=26, QUOTE=27, 
		ESC=28, NUMBER=29, WHITESPACE=30, NEWLINE=31, TAB=32, RETURN=33, BlockComment=34, 
		SpecialComment=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "STRING", "IDENTIFIER", "STATIC", 
			"SET", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_PAR", "RIGHT_PAR", "LEFT_SBRACE", 
			"RIGHT_SBRACE", "OBJECT_SET", "EXECUTE", "QUOTE", "ESC", "NUMBER", "WHITESPACE", 
			"NEWLINE", "TAB", "RETURN", "BlockComment", "SpecialComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'[]'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'?'", 
			"'.'", "'d'", "'D'", "'f'", "'F'", "'s'", "'S'", null, null, "'::'", 
			"':'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'=>'", "';'", "'''", 
			"'\\'", null, "' '", null, "'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "IDENTIFIER", "STATIC", "SET", "LEFT_CURLY", 
			"RIGHT_CURLY", "LEFT_PAR", "RIGHT_PAR", "LEFT_SBRACE", "RIGHT_SBRACE", 
			"OBJECT_SET", "EXECUTE", "QUOTE", "ESC", "NUMBER", "WHITESPACE", "NEWLINE", 
			"TAB", "RETURN", "BlockComment", "SpecialComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\20\7\20x\n\20\f\20\16\20{\13\20\3\20\3\20\3\21\3\21\7\21\u0081\n"+
		"\21\f\21\16\21\u0084\13\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\6\36\u00a1\n\36\r\36\16\36\u00a2\3\37\3\37\3\37\3"+
		"\37\3 \5 \u00aa\n \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u00c0\n\"\3#\3#\3#\3#\7#\u00c6\n#\f#\16#\u00c9"+
		"\13#\3#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u00d4\n$\f$\16$\u00d7\13$\3$\3$\3$"+
		"\3$\3$\4\u00c7\u00d5\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\6\2\f\f\17\17$$^^\4\2C\\c|"+
		"\7\2//\62;C\\aac|\3\2\62;\2\u00e4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7N\3\2\2\2\t"+
		"S\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23h\3\2\2\2\25"+
		"j\3\2\2\2\27l\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35r\3\2\2\2\37t\3\2\2\2"+
		"!~\3\2\2\2#\u0085\3\2\2\2%\u0088\3\2\2\2\'\u008a\3\2\2\2)\u008c\3\2\2"+
		"\2+\u008e\3\2\2\2-\u0090\3\2\2\2/\u0092\3\2\2\2\61\u0094\3\2\2\2\63\u0096"+
		"\3\2\2\2\65\u0099\3\2\2\2\67\u009b\3\2\2\29\u009d\3\2\2\2;\u00a0\3\2\2"+
		"\2=\u00a4\3\2\2\2?\u00a9\3\2\2\2A\u00af\3\2\2\2C\u00bf\3\2\2\2E\u00c1"+
		"\3\2\2\2G\u00cf\3\2\2\2IJ\7.\2\2J\4\3\2\2\2KL\7]\2\2LM\7_\2\2M\6\3\2\2"+
		"\2NO\7V\2\2OP\7T\2\2PQ\7W\2\2QR\7G\2\2R\b\3\2\2\2ST\7v\2\2TU\7t\2\2UV"+
		"\7w\2\2VW\7g\2\2W\n\3\2\2\2XY\7H\2\2YZ\7C\2\2Z[\7N\2\2[\\\7U\2\2\\]\7"+
		"G\2\2]\f\3\2\2\2^_\7h\2\2_`\7c\2\2`a\7n\2\2ab\7u\2\2bc\7g\2\2c\16\3\2"+
		"\2\2de\7A\2\2e\20\3\2\2\2fg\7\60\2\2g\22\3\2\2\2hi\7f\2\2i\24\3\2\2\2"+
		"jk\7F\2\2k\26\3\2\2\2lm\7h\2\2m\30\3\2\2\2no\7H\2\2o\32\3\2\2\2pq\7u\2"+
		"\2q\34\3\2\2\2rs\7U\2\2s\36\3\2\2\2ty\7$\2\2ux\59\35\2vx\n\2\2\2wu\3\2"+
		"\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7$"+
		"\2\2} \3\2\2\2~\u0082\t\3\2\2\177\u0081\t\4\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\"\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0085\u0086\7<\2\2\u0086\u0087\7<\2\2\u0087$\3\2"+
		"\2\2\u0088\u0089\7<\2\2\u0089&\3\2\2\2\u008a\u008b\7}\2\2\u008b(\3\2\2"+
		"\2\u008c\u008d\7\177\2\2\u008d*\3\2\2\2\u008e\u008f\7*\2\2\u008f,\3\2"+
		"\2\2\u0090\u0091\7+\2\2\u0091.\3\2\2\2\u0092\u0093\7]\2\2\u0093\60\3\2"+
		"\2\2\u0094\u0095\7_\2\2\u0095\62\3\2\2\2\u0096\u0097\7?\2\2\u0097\u0098"+
		"\7@\2\2\u0098\64\3\2\2\2\u0099\u009a\7=\2\2\u009a\66\3\2\2\2\u009b\u009c"+
		"\7)\2\2\u009c8\3\2\2\2\u009d\u009e\7^\2\2\u009e:\3\2\2\2\u009f\u00a1\t"+
		"\5\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3<\3\2\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a6\u00a7\b\37\2\2\u00a7>\3\2\2\2\u00a8\u00aa\7\17\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\b \2\2\u00ae@\3\2\2\2\u00af\u00b0\7\13\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b!\2\2\u00b2B\3\2\2\2\u00b3\u00b4\7t"+
		"\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8"+
		"\7t\2\2\u00b8\u00c0\7p\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\7G\2\2\u00bb"+
		"\u00bc\7V\2\2\u00bc\u00bd\7W\2\2\u00bd\u00be\7T\2\2\u00be\u00c0\7P\2\2"+
		"\u00bf\u00b3\3\2\2\2\u00bf\u00b9\3\2\2\2\u00c0D\3\2\2\2\u00c1\u00c2\7"+
		"\61\2\2\u00c2\u00c3\7,\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c6\13\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb"+
		"\u00cc\7\61\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b#\2\2\u00ceF\3\2\2\2"+
		"\u00cf\u00d0\7&\2\2\u00d0\u00d1\7<\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d4"+
		"\13\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9"+
		"\7<\2\2\u00d9\u00da\7&\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b$\2\2\u00dc"+
		"H\3\2\2\2\13\2wy\u0082\u00a2\u00a9\u00bf\u00c7\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}