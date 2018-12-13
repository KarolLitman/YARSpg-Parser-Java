// Generated from YARSpg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YARSpgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, STRING=11, NUMBER=12, NULL=13, TRUE_FALSE=14, STRING_LITERAL_QUOTE=15, 
		ALNUM_PLUS=16, PN_CHARS=17, PN_CHARS_U=18, UCHAR=19, PN_CHARS_BASE=20, 
		HEX=21, SP=22, NL=23;
	public static final int
		RULE_yarspg = 0, RULE_statement = 1, RULE_declaration = 2, RULE_nodeDeclaration = 3, 
		RULE_relationship = 4, RULE_directed = 5, RULE_undirected = 6, RULE_relationship_label = 7, 
		RULE_node_label = 8, RULE_prop = 9, RULE_key = 10, RULE_value = 11, RULE_single_key_value = 12, 
		RULE_multiple_key_values = 13;
	public static final String[] ruleNames = {
		"yarspg", "statement", "declaration", "nodeDeclaration", "relationship", 
		"directed", "undirected", "relationship_label", "node_label", "prop", 
		"key", "value", "single_key_value", "multiple_key_values"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'{'", "','", "'}'", "'('", "')'", "'-'", "'['", "']'", "'->'", 
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

	@Override
	public String getGrammarFileName() { return "YARSpg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YARSpgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class YarspgContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(YARSpgParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(YARSpgParser.NL, i);
		}
		public YarspgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yarspg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterYarspg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitYarspg(this);
		}
	}

	public final YarspgContext yarspg() throws RecognitionException {
		YarspgContext _localctx = new YarspgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_yarspg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==ALNUM_PLUS) {
				{
				{
				setState(28);
				statement();
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					match(NL);
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(38);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			declaration();
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

	public static class DeclarationContext extends ParserRuleContext {
		public NodeDeclarationContext nodeDeclaration() {
			return getRuleContext(NodeDeclarationContext.class,0);
		}
		public RelationshipContext relationship() {
			return getRuleContext(RelationshipContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALNUM_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				nodeDeclaration();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				relationship();
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

	public static class NodeDeclarationContext extends ParserRuleContext {
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public NodeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNodeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNodeDeclaration(this);
		}
	}

	public final NodeDeclarationContext nodeDeclaration() throws RecognitionException {
		NodeDeclarationContext _localctx = new NodeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nodeDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			node_label();
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					match(T__0);
					setState(47);
					node_label();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(53);
			match(T__0);
			setState(54);
			match(T__1);
			setState(55);
			prop();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(56);
				match(T__2);
				setState(57);
				prop();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__3);
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

	public static class RelationshipContext extends ParserRuleContext {
		public DirectedContext directed() {
			return getRuleContext(DirectedContext.class,0);
		}
		public UndirectedContext undirected() {
			return getRuleContext(UndirectedContext.class,0);
		}
		public RelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterRelationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitRelationship(this);
		}
	}

	public final RelationshipContext relationship() throws RecognitionException {
		RelationshipContext _localctx = new RelationshipContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relationship);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				directed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				undirected();
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

	public static class DirectedContext extends ParserRuleContext {
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public Relationship_labelContext relationship_label() {
			return getRuleContext(Relationship_labelContext.class,0);
		}
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public DirectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterDirected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitDirected(this);
		}
	}

	public final DirectedContext directed() throws RecognitionException {
		DirectedContext _localctx = new DirectedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__4);
			setState(70);
			node_label();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(71);
				match(T__0);
				setState(72);
				node_label();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__5);
			setState(79);
			match(T__6);
			setState(80);
			match(T__7);
			setState(81);
			relationship_label();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(82);
				match(T__1);
				setState(83);
				prop();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(84);
					match(T__2);
					setState(85);
					prop();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(T__3);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__8);
			setState(99);
			match(T__9);
			setState(100);
			match(T__4);
			setState(101);
			node_label();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(102);
				match(T__0);
				setState(103);
				node_label();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__5);
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

	public static class UndirectedContext extends ParserRuleContext {
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public Relationship_labelContext relationship_label() {
			return getRuleContext(Relationship_labelContext.class,0);
		}
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public UndirectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undirected; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterUndirected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitUndirected(this);
		}
	}

	public final UndirectedContext undirected() throws RecognitionException {
		UndirectedContext _localctx = new UndirectedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_undirected);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__4);
			setState(112);
			node_label();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(113);
				match(T__0);
				setState(114);
				node_label();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(T__5);
			setState(121);
			match(T__6);
			setState(122);
			match(T__7);
			setState(123);
			relationship_label();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(124);
				match(T__1);
				setState(125);
				prop();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(126);
					match(T__2);
					setState(127);
					prop();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__3);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(T__8);
			setState(141);
			match(T__6);
			setState(142);
			match(T__4);
			setState(143);
			node_label();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(144);
				match(T__0);
				setState(145);
				node_label();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__5);
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

	public static class Relationship_labelContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSpgParser.ALNUM_PLUS, 0); }
		public Relationship_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterRelationship_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitRelationship_label(this);
		}
	}

	public final Relationship_labelContext relationship_label() throws RecognitionException {
		Relationship_labelContext _localctx = new Relationship_labelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relationship_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ALNUM_PLUS);
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

	public static class Node_labelContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSpgParser.ALNUM_PLUS, 0); }
		public Node_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode_label(this);
		}
	}

	public final Node_labelContext node_label() throws RecognitionException {
		Node_labelContext _localctx = new Node_labelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_node_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ALNUM_PLUS);
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

	public static class PropContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitProp(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			key();
			setState(158);
			match(T__0);
			setState(159);
			value();
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSpgParser.ALNUM_PLUS, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ALNUM_PLUS);
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

	public static class ValueContext extends ParserRuleContext {
		public Single_key_valueContext single_key_value() {
			return getRuleContext(Single_key_valueContext.class,0);
		}
		public Multiple_key_valuesContext multiple_key_values() {
			return getRuleContext(Multiple_key_valuesContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case NULL:
			case TRUE_FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				single_key_value();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				multiple_key_values();
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

	public static class Single_key_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(YARSpgParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(YARSpgParser.NULL, 0); }
		public TerminalNode TRUE_FALSE() { return getToken(YARSpgParser.TRUE_FALSE, 0); }
		public Single_key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_key_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterSingle_key_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitSingle_key_value(this);
		}
	}

	public final Single_key_valueContext single_key_value() throws RecognitionException {
		Single_key_valueContext _localctx = new Single_key_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_single_key_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << NULL) | (1L << TRUE_FALSE))) != 0)) ) {
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

	public static class Multiple_key_valuesContext extends ParserRuleContext {
		public List<Single_key_valueContext> single_key_value() {
			return getRuleContexts(Single_key_valueContext.class);
		}
		public Single_key_valueContext single_key_value(int i) {
			return getRuleContext(Single_key_valueContext.class,i);
		}
		public Multiple_key_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_key_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMultiple_key_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMultiple_key_values(this);
		}
	}

	public final Multiple_key_valuesContext multiple_key_values() throws RecognitionException {
		Multiple_key_valuesContext _localctx = new Multiple_key_valuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiple_key_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__7);
			setState(170);
			single_key_value();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(171);
				match(T__2);
				setState(172);
				single_key_value();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(T__8);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\""+
		"\7\2%\n\2\f\2\16\2(\13\2\3\3\3\3\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\7\5\63\n"+
		"\5\f\5\16\5\66\13\5\3\5\3\5\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5\3"+
		"\5\3\6\3\6\5\6F\n\6\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\7\7`\n\7\f\7\16"+
		"\7c\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\7\bv\n\b\f\b\16\by\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u0083\n\b\f\b\16\b\u0086\13\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u00a8\n\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\7\17\u00b0\n\17\f\17\16\17\u00b3\13\17\3\17"+
		"\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\r\20\2\u00b8"+
		"\2&\3\2\2\2\4)\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16"+
		"q\3\2\2\2\20\u009b\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00a3"+
		"\3\2\2\2\30\u00a7\3\2\2\2\32\u00a9\3\2\2\2\34\u00ab\3\2\2\2\36 \5\4\3"+
		"\2\37!\7\31\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2"+
		"$\36\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)*\5"+
		"\6\4\2*\5\3\2\2\2+.\5\b\5\2,.\5\n\6\2-+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/"+
		"\64\5\22\n\2\60\61\7\3\2\2\61\63\5\22\n\2\62\60\3\2\2\2\63\66\3\2\2\2"+
		"\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\3\2\28"+
		"9\7\4\2\29>\5\24\13\2:;\7\5\2\2;=\5\24\13\2<:\3\2\2\2=@\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\6\2\2B\t\3\2\2\2CF\5\f\7\2DF\5"+
		"\16\b\2EC\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GH\7\7\2\2HM\5\22\n\2IJ\7\3\2\2"+
		"JL\5\22\n\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2"+
		"\2PQ\7\b\2\2QR\7\t\2\2RS\7\n\2\2Sa\5\20\t\2TU\7\4\2\2UZ\5\24\13\2VW\7"+
		"\5\2\2WY\5\24\13\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2"+
		"\\Z\3\2\2\2]^\7\6\2\2^`\3\2\2\2_T\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2bd\3\2\2\2ca\3\2\2\2de\7\13\2\2ef\7\f\2\2fg\7\7\2\2gl\5\22\n\2hi\7\3"+
		"\2\2ik\5\22\n\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3"+
		"\2\2\2op\7\b\2\2p\r\3\2\2\2qr\7\7\2\2rw\5\22\n\2st\7\3\2\2tv\5\22\n\2"+
		"us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\b\2\2"+
		"{|\7\t\2\2|}\7\n\2\2}\u008b\5\20\t\2~\177\7\4\2\2\177\u0084\5\24\13\2"+
		"\u0080\u0081\7\5\2\2\u0081\u0083\5\24\13\2\u0082\u0080\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\6\2\2\u0088\u008a\3\2\2\2\u0089~\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\13\2\2\u008f\u0090\7\t\2\2"+
		"\u0090\u0091\7\7\2\2\u0091\u0096\5\22\n\2\u0092\u0093\7\3\2\2\u0093\u0095"+
		"\5\22\n\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a"+
		"\7\b\2\2\u009a\17\3\2\2\2\u009b\u009c\7\22\2\2\u009c\21\3\2\2\2\u009d"+
		"\u009e\7\22\2\2\u009e\23\3\2\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\7\3"+
		"\2\2\u00a1\u00a2\5\30\r\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\22\2\2\u00a4"+
		"\27\3\2\2\2\u00a5\u00a8\5\32\16\2\u00a6\u00a8\5\34\17\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa"+
		"\33\3\2\2\2\u00ab\u00ac\7\n\2\2\u00ac\u00b1\5\32\16\2\u00ad\u00ae\7\5"+
		"\2\2\u00ae\u00b0\5\32\16\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\7\13\2\2\u00b5\35\3\2\2\2\22\"&-\64>EMZalw\u0084\u008b"+
		"\u0096\u00a7\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}