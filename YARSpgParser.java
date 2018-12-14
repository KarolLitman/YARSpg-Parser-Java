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
		RULE_ido = 8, RULE_node_label = 9, RULE_prop = 10, RULE_key = 11, RULE_value = 12, 
		RULE_single_key_value = 13, RULE_multiple_key_values = 14;
	public static final String[] ruleNames = {
		"yarspg", "statement", "declaration", "nodeDeclaration", "relationship", 
		"directed", "undirected", "relationship_label", "ido", "node_label", "prop", 
		"key", "value", "single_key_value", "multiple_key_values"
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==ALNUM_PLUS) {
				{
				{
				setState(30);
				statement();
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					match(NL);
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(40);
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
			setState(41);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALNUM_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				nodeDeclaration();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
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
		public IdoContext ido() {
			return getRuleContext(IdoContext.class,0);
		}
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			ido();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(48);
				match(T__0);
				setState(49);
				node_label();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(50);
					match(T__1);
					setState(51);
					node_label();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				match(T__2);
				}
			}

			setState(61);
			match(T__1);
			setState(62);
			match(T__3);
			setState(63);
			prop();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(64);
				match(T__4);
				setState(65);
				prop();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				directed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
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
		public List<IdoContext> ido() {
			return getRuleContexts(IdoContext.class);
		}
		public IdoContext ido(int i) {
			return getRuleContext(IdoContext.class,i);
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
			setState(77);
			match(T__6);
			setState(78);
			ido();
			setState(79);
			match(T__7);
			setState(80);
			match(T__8);
			setState(81);
			match(T__0);
			setState(82);
			relationship_label();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(83);
				match(T__3);
				setState(84);
				prop();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(85);
					match(T__4);
					setState(86);
					prop();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__5);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__2);
			setState(100);
			match(T__9);
			setState(101);
			match(T__6);
			setState(102);
			ido();
			setState(103);
			match(T__7);
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
		public List<IdoContext> ido() {
			return getRuleContexts(IdoContext.class);
		}
		public IdoContext ido(int i) {
			return getRuleContext(IdoContext.class,i);
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
			setState(105);
			match(T__6);
			setState(106);
			ido();
			setState(107);
			match(T__7);
			setState(108);
			match(T__8);
			setState(109);
			match(T__0);
			setState(110);
			relationship_label();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(111);
				match(T__3);
				setState(112);
				prop();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(113);
					match(T__4);
					setState(114);
					prop();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(T__5);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(T__2);
			setState(128);
			match(T__8);
			setState(129);
			match(T__6);
			setState(130);
			ido();
			setState(131);
			match(T__7);
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
			setState(133);
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

	public static class IdoContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSpgParser.ALNUM_PLUS, 0); }
		public IdoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterIdo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitIdo(this);
		}
	}

	public final IdoContext ido() throws RecognitionException {
		IdoContext _localctx = new IdoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		enterRule(_localctx, 18, RULE_node_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		enterRule(_localctx, 20, RULE_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			key();
			setState(140);
			match(T__1);
			setState(141);
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
		enterRule(_localctx, 22, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		enterRule(_localctx, 24, RULE_value);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case NULL:
			case TRUE_FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				single_key_value();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
		enterRule(_localctx, 26, RULE_single_key_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		enterRule(_localctx, 28, RULE_multiple_key_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__0);
			setState(152);
			single_key_value();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(153);
				match(T__4);
				setState(154);
				single_key_value();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r"+
		"\2\16\2$\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\4\3\4\5\4\60\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\5\3\5\5\5>\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5E\n\5\f\5\16\5H\13\5\3\5\3\5\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\7\7a\n\7\f\7"+
		"\16\7d\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\bv\n\b\f\b\16\by\13\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\5\16\u0096\n\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u009e"+
		"\n\20\f\20\16\20\u00a1\13\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36\2\3\3\2\r\20\2\u00a2\2(\3\2\2\2\4+\3\2\2\2\6/\3\2\2"+
		"\2\b\61\3\2\2\2\nM\3\2\2\2\fO\3\2\2\2\16k\3\2\2\2\20\u0087\3\2\2\2\22"+
		"\u0089\3\2\2\2\24\u008b\3\2\2\2\26\u008d\3\2\2\2\30\u0091\3\2\2\2\32\u0095"+
		"\3\2\2\2\34\u0097\3\2\2\2\36\u0099\3\2\2\2 \"\5\4\3\2!#\7\31\2\2\"!\3"+
		"\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2& \3\2\2\2\'*\3\2\2\2"+
		"(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+,\5\6\4\2,\5\3\2\2\2-\60\5\b"+
		"\5\2.\60\5\n\6\2/-\3\2\2\2/.\3\2\2\2\60\7\3\2\2\2\61=\5\22\n\2\62\63\7"+
		"\3\2\2\638\5\24\13\2\64\65\7\4\2\2\65\67\5\24\13\2\66\64\3\2\2\2\67:\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\5\2\2<>\3\2\2\2="+
		"\62\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\4\2\2@A\7\6\2\2AF\5\26\f\2BC\7\7\2"+
		"\2CE\5\26\f\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2"+
		"\2\2IJ\7\b\2\2J\t\3\2\2\2KN\5\f\7\2LN\5\16\b\2MK\3\2\2\2ML\3\2\2\2N\13"+
		"\3\2\2\2OP\7\t\2\2PQ\5\22\n\2QR\7\n\2\2RS\7\13\2\2ST\7\3\2\2Tb\5\20\t"+
		"\2UV\7\6\2\2V[\5\26\f\2WX\7\7\2\2XZ\5\26\f\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\b\2\2_a\3\2\2\2`U\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\5\2\2fg\7\f\2\2gh\7"+
		"\t\2\2hi\5\22\n\2ij\7\n\2\2j\r\3\2\2\2kl\7\t\2\2lm\5\22\n\2mn\7\n\2\2"+
		"no\7\13\2\2op\7\3\2\2p~\5\20\t\2qr\7\6\2\2rw\5\26\f\2st\7\7\2\2tv\5\26"+
		"\f\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\b"+
		"\2\2{}\3\2\2\2|q\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\5\2\2\u0082\u0083\7\13\2\2\u0083"+
		"\u0084\7\t\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7\n\2\2\u0086\17\3\2\2"+
		"\2\u0087\u0088\7\22\2\2\u0088\21\3\2\2\2\u0089\u008a\7\22\2\2\u008a\23"+
		"\3\2\2\2\u008b\u008c\7\22\2\2\u008c\25\3\2\2\2\u008d\u008e\5\30\r\2\u008e"+
		"\u008f\7\4\2\2\u008f\u0090\5\32\16\2\u0090\27\3\2\2\2\u0091\u0092\7\22"+
		"\2\2\u0092\31\3\2\2\2\u0093\u0096\5\34\17\2\u0094\u0096\5\36\20\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\33\3\2\2\2\u0097\u0098\t\2\2"+
		"\2\u0098\35\3\2\2\2\u0099\u009a\7\3\2\2\u009a\u009f\5\34\17\2\u009b\u009c"+
		"\7\7\2\2\u009c\u009e\5\34\17\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3\37\3\2\2\2\17$(/8=FM[bw~\u0095\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}