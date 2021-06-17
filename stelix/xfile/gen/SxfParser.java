// Generated from /home/slowcheetah/work_dir/StelixObjectFile/src/Sxf.g4 by ANTLR 4.9.1
package stelix.xfile.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SxfParser extends Parser {
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
	public static final int
		RULE_file = 0, RULE_object = 1, RULE_array_object = 2, RULE_data_object = 3, 
		RULE_array_block = 4, RULE_struct_element = 5, RULE_struct_elements = 6, 
		RULE_data_block = 7, RULE_data_block_elemenets = 8, RULE_data_block_element = 9, 
		RULE_variable = 10, RULE_variables = 11, RULE_data_types = 12, RULE_state_true = 13, 
		RULE_state_false = 14, RULE_state_null = 15, RULE_s_integer = 16, RULE_s_double = 17, 
		RULE_s_float = 18, RULE_s_short = 19, RULE_s_string = 20, RULE_string_literal = 21, 
		RULE_identifier = 22, RULE_block_start = 23, RULE_block_end = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "object", "array_object", "data_object", "array_block", "struct_element", 
			"struct_elements", "data_block", "data_block_elemenets", "data_block_element", 
			"variable", "variables", "data_types", "state_true", "state_false", "state_null", 
			"s_integer", "s_double", "s_float", "s_short", "s_string", "string_literal", 
			"identifier", "block_start", "block_end"
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

	@Override
	public String getGrammarFileName() { return "Sxf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SxfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			object();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(51);
				match(T__0);
				setState(52);
				object();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public Data_objectContext data_object() {
			return getRuleContext(Data_objectContext.class,0);
		}
		public Array_objectContext array_object() {
			return getRuleContext(Array_objectContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				data_object();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				array_object();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_objectContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OBJECT_SET() { return getToken(SxfParser.OBJECT_SET, 0); }
		public Array_blockContext array_block() {
			return getRuleContext(Array_blockContext.class,0);
		}
		public Array_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterArray_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitArray_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitArray_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_objectContext array_object() throws RecognitionException {
		Array_objectContext _localctx = new Array_objectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			identifier();
			setState(63);
			match(T__1);
			setState(64);
			match(OBJECT_SET);
			setState(65);
			array_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_objectContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OBJECT_SET() { return getToken(SxfParser.OBJECT_SET, 0); }
		public Data_blockContext data_block() {
			return getRuleContext(Data_blockContext.class,0);
		}
		public Data_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterData_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitData_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitData_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_objectContext data_object() throws RecognitionException {
		Data_objectContext _localctx = new Data_objectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			identifier();
			setState(68);
			match(OBJECT_SET);
			setState(69);
			data_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_blockContext extends ParserRuleContext {
		public Block_startContext block_start() {
			return getRuleContext(Block_startContext.class,0);
		}
		public Struct_elementsContext struct_elements() {
			return getRuleContext(Struct_elementsContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Array_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterArray_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitArray_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitArray_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_blockContext array_block() throws RecognitionException {
		Array_blockContext _localctx = new Array_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			block_start();
			setState(72);
			struct_elements();
			setState(73);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_elementContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACE() { return getToken(SxfParser.LEFT_SBRACE, 0); }
		public TerminalNode RIGHT_SBRACE() { return getToken(SxfParser.RIGHT_SBRACE, 0); }
		public List<Data_typesContext> data_types() {
			return getRuleContexts(Data_typesContext.class);
		}
		public Data_typesContext data_types(int i) {
			return getRuleContext(Data_typesContext.class,i);
		}
		public Struct_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterStruct_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitStruct_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitStruct_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_elementContext struct_element() throws RecognitionException {
		Struct_elementContext _localctx = new Struct_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_struct_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LEFT_SBRACE);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << STRING) | (1L << LEFT_CURLY) | (1L << LEFT_PAR) | (1L << LEFT_SBRACE) | (1L << NUMBER))) != 0)) {
				{
				setState(76);
				data_types();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(77);
					match(T__0);
					setState(78);
					data_types();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(86);
			match(RIGHT_SBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_elementsContext extends ParserRuleContext {
		public List<Struct_elementContext> struct_element() {
			return getRuleContexts(Struct_elementContext.class);
		}
		public Struct_elementContext struct_element(int i) {
			return getRuleContext(Struct_elementContext.class,i);
		}
		public Struct_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterStruct_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitStruct_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitStruct_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_elementsContext struct_elements() throws RecognitionException {
		Struct_elementsContext _localctx = new Struct_elementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_struct_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SBRACE) {
				{
				setState(88);
				struct_element();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(89);
					match(T__0);
					setState(90);
					struct_element();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_blockContext extends ParserRuleContext {
		public Block_startContext block_start() {
			return getRuleContext(Block_startContext.class,0);
		}
		public Data_block_elemenetsContext data_block_elemenets() {
			return getRuleContext(Data_block_elemenetsContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Data_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterData_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitData_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitData_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_blockContext data_block() throws RecognitionException {
		Data_blockContext _localctx = new Data_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_data_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			block_start();
			setState(99);
			data_block_elemenets();
			setState(100);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_block_elemenetsContext extends ParserRuleContext {
		public List<Data_block_elementContext> data_block_element() {
			return getRuleContexts(Data_block_elementContext.class);
		}
		public Data_block_elementContext data_block_element(int i) {
			return getRuleContext(Data_block_elementContext.class,i);
		}
		public Data_block_elemenetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_block_elemenets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterData_block_elemenets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitData_block_elemenets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitData_block_elemenets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_block_elemenetsContext data_block_elemenets() throws RecognitionException {
		Data_block_elemenetsContext _localctx = new Data_block_elemenetsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_data_block_elemenets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==IDENTIFIER) {
				{
				setState(102);
				data_block_element();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(103);
					match(T__0);
					setState(104);
					data_block_element();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_block_elementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Data_block_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_block_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterData_block_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitData_block_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitData_block_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_block_elementContext data_block_element() throws RecognitionException {
		Data_block_elementContext _localctx = new Data_block_elementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_data_block_element);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				object();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SxfParser.SET, 0); }
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			identifier();
			setState(117);
			match(SET);
			setState(118);
			data_types();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			variable();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(121);
				match(T__0);
				setState(122);
				variable();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typesContext extends ParserRuleContext {
		public State_trueContext state_true() {
			return getRuleContext(State_trueContext.class,0);
		}
		public State_falseContext state_false() {
			return getRuleContext(State_falseContext.class,0);
		}
		public S_stringContext s_string() {
			return getRuleContext(S_stringContext.class,0);
		}
		public S_integerContext s_integer() {
			return getRuleContext(S_integerContext.class,0);
		}
		public S_shortContext s_short() {
			return getRuleContext(S_shortContext.class,0);
		}
		public S_floatContext s_float() {
			return getRuleContext(S_floatContext.class,0);
		}
		public S_doubleContext s_double() {
			return getRuleContext(S_doubleContext.class,0);
		}
		public Struct_elementContext struct_element() {
			return getRuleContext(Struct_elementContext.class,0);
		}
		public Data_blockContext data_block() {
			return getRuleContext(Data_blockContext.class,0);
		}
		public State_nullContext state_null() {
			return getRuleContext(State_nullContext.class,0);
		}
		public Data_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterData_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitData_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitData_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typesContext data_types() throws RecognitionException {
		Data_typesContext _localctx = new Data_typesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_data_types);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				state_true();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				state_false();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				s_string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				s_integer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				s_short();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				s_float();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				s_double();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				struct_element();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				data_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
				state_null();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class State_trueContext extends ParserRuleContext {
		public State_trueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_true; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterState_true(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitState_true(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitState_true(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_trueContext state_true() throws RecognitionException {
		State_trueContext _localctx = new State_trueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_state_true);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class State_falseContext extends ParserRuleContext {
		public State_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_false; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterState_false(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitState_false(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitState_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_falseContext state_false() throws RecognitionException {
		State_falseContext _localctx = new State_falseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_state_false);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class State_nullContext extends ParserRuleContext {
		public State_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterState_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitState_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitState_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_nullContext state_null() throws RecognitionException {
		State_nullContext _localctx = new State_nullContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_state_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_integerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SxfParser.NUMBER, 0); }
		public S_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterS_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitS_integer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitS_integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_integerContext s_integer() throws RecognitionException {
		S_integerContext _localctx = new S_integerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_s_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_doubleContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SxfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SxfParser.NUMBER, i);
		}
		public S_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterS_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitS_double(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitS_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_doubleContext s_double() throws RecognitionException {
		S_doubleContext _localctx = new S_doubleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_s_double);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(NUMBER);
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				{
				setState(149);
				match(T__7);
				setState(150);
				match(NUMBER);
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(151);
					match(T__8);
					}
					break;
				case EOF:
				case T__0:
				case T__9:
				case RIGHT_CURLY:
				case RIGHT_PAR:
				case RIGHT_SBRACE:
					{
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(152);
						match(T__9);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case T__8:
			case T__9:
				{
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_floatContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SxfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SxfParser.NUMBER, i);
		}
		public S_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterS_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitS_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitS_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_floatContext s_float() throws RecognitionException {
		S_floatContext _localctx = new S_floatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_s_float);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(NUMBER);
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				{
				setState(161);
				match(T__7);
				setState(162);
				match(NUMBER);
				setState(167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(163);
					match(T__10);
					}
					break;
				case EOF:
				case T__0:
				case T__11:
				case RIGHT_CURLY:
				case RIGHT_PAR:
				case RIGHT_SBRACE:
					{
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__11) {
						{
						setState(164);
						match(T__11);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case T__10:
			case T__11:
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_shortContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SxfParser.NUMBER, 0); }
		public S_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterS_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitS_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitS_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_shortContext s_short() throws RecognitionException {
		S_shortContext _localctx = new S_shortContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_s_short);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(NUMBER);
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_stringContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public S_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterS_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitS_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitS_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_stringContext s_string() throws RecognitionException {
		S_stringContext _localctx = new S_stringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_s_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SxfParser.STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SxfParser.IDENTIFIER, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifier);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_startContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(SxfParser.LEFT_CURLY, 0); }
		public TerminalNode LEFT_PAR() { return getToken(SxfParser.LEFT_PAR, 0); }
		public Block_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterBlock_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitBlock_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitBlock_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_startContext block_start() throws RecognitionException {
		Block_startContext _localctx = new Block_startContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==LEFT_CURLY || _la==LEFT_PAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode RIGHT_CURLY() { return getToken(SxfParser.RIGHT_CURLY, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(SxfParser.RIGHT_PAR, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SxfListener ) ((SxfListener)listener).exitBlock_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SxfVisitor ) return ((SxfVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_block_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==RIGHT_CURLY || _la==RIGHT_PAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\5\3?\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7R\n"+
		"\7\f\7\16\7U\13\7\5\7W\n\7\3\7\3\7\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b"+
		"\5\bc\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\5\nq\n\n"+
		"\3\13\3\13\5\13u\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r~\n\r\f\r\16\r\u0081"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008d\n\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u009c\n\23\5\23\u009e\n\23\3\23\5\23\u00a1\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u00a8\n\24\5\24\u00aa\n\24\3\24\5\24\u00ad\n\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u00b8\n\30\3\31\3\31\3\32\3\32\3\32"+
		"\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\t\3\2"+
		"\5\6\3\2\7\b\3\2\13\f\3\2\r\16\3\2\17\20\4\2\25\25\27\27\4\2\26\26\30"+
		"\30\2\u00be\2\64\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bE\3\2\2\2\nI\3\2\2\2\f"+
		"M\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22p\3\2\2\2\24t\3\2\2\2\26v\3\2\2\2"+
		"\30z\3\2\2\2\32\u008c\3\2\2\2\34\u008e\3\2\2\2\36\u0090\3\2\2\2 \u0092"+
		"\3\2\2\2\"\u0094\3\2\2\2$\u0096\3\2\2\2&\u00a2\3\2\2\2(\u00ae\3\2\2\2"+
		"*\u00b1\3\2\2\2,\u00b3\3\2\2\2.\u00b7\3\2\2\2\60\u00b9\3\2\2\2\62\u00bb"+
		"\3\2\2\2\649\5\4\3\2\65\66\7\3\2\2\668\5\4\3\2\67\65\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<?\5\b\5\2=?\5\6\4\2><\3\2"+
		"\2\2>=\3\2\2\2?\5\3\2\2\2@A\5.\30\2AB\7\4\2\2BC\7\33\2\2CD\5\n\6\2D\7"+
		"\3\2\2\2EF\5.\30\2FG\7\33\2\2GH\5\20\t\2H\t\3\2\2\2IJ\5\60\31\2JK\5\16"+
		"\b\2KL\5\62\32\2L\13\3\2\2\2MV\7\31\2\2NS\5\32\16\2OP\7\3\2\2PR\5\32\16"+
		"\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VN\3\2\2"+
		"\2VW\3\2\2\2WX\3\2\2\2XY\7\32\2\2Y\r\3\2\2\2Z_\5\f\7\2[\\\7\3\2\2\\^\5"+
		"\f\7\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bZ\3"+
		"\2\2\2bc\3\2\2\2c\17\3\2\2\2de\5\60\31\2ef\5\22\n\2fg\5\62\32\2g\21\3"+
		"\2\2\2hm\5\24\13\2ij\7\3\2\2jl\5\24\13\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2"+
		"mn\3\2\2\2nq\3\2\2\2om\3\2\2\2ph\3\2\2\2pq\3\2\2\2q\23\3\2\2\2ru\5\26"+
		"\f\2su\5\4\3\2tr\3\2\2\2ts\3\2\2\2u\25\3\2\2\2vw\5.\30\2wx\7\24\2\2xy"+
		"\5\32\16\2y\27\3\2\2\2z\177\5\26\f\2{|\7\3\2\2|~\5\26\f\2}{\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\31\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u008d\5\34\17\2\u0083\u008d\5\36\20\2\u0084\u008d\5*\26\2\u0085"+
		"\u008d\5\"\22\2\u0086\u008d\5(\25\2\u0087\u008d\5&\24\2\u0088\u008d\5"+
		"$\23\2\u0089\u008d\5\f\7\2\u008a\u008d\5\20\t\2\u008b\u008d\5 \21\2\u008c"+
		"\u0082\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0085\3\2"+
		"\2\2\u008c\u0086\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c"+
		"\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\33\3\2\2"+
		"\2\u008e\u008f\t\2\2\2\u008f\35\3\2\2\2\u0090\u0091\t\3\2\2\u0091\37\3"+
		"\2\2\2\u0092\u0093\7\t\2\2\u0093!\3\2\2\2\u0094\u0095\7\37\2\2\u0095#"+
		"\3\2\2\2\u0096\u00a0\7\37\2\2\u0097\u0098\7\n\2\2\u0098\u009d\7\37\2\2"+
		"\u0099\u009e\7\13\2\2\u009a\u009c\7\f\2\2\u009b\u009a\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u00a1\t\4\2\2\u00a0\u0097\3\2\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a1%\3\2\2\2\u00a2\u00ac\7\37\2\2\u00a3\u00a4\7\n\2\2\u00a4\u00a9"+
		"\7\37\2\2\u00a5\u00aa\7\r\2\2\u00a6\u00a8\7\16\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\t\5\2\2\u00ac\u00a3\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\'\3\2\2\2\u00ae\u00af\7\37\2\2\u00af\u00b0\t\6\2"+
		"\2\u00b0)\3\2\2\2\u00b1\u00b2\5,\27\2\u00b2+\3\2\2\2\u00b3\u00b4\7\21"+
		"\2\2\u00b4-\3\2\2\2\u00b5\u00b8\7\22\2\2\u00b6\u00b8\5,\27\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8/\3\2\2\2\u00b9\u00ba\t\7\2\2\u00ba"+
		"\61\3\2\2\2\u00bb\u00bc\t\b\2\2\u00bc\63\3\2\2\2\249>SV_bmpt\177\u008c"+
		"\u009b\u009d\u00a0\u00a7\u00a9\u00ac\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}