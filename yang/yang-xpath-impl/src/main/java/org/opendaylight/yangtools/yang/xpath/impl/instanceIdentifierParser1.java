// Generated from org\opendaylight\yangtools\yang\xpath\impl\instanceIdentifier.g4 by ANTLR 4.7.2
package org.opendaylight.yangtools.yang.xpath.impl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class instanceIdentifierParser1 extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Identifier=9, 
		PositiveIntegerValue=10, STRING=11, WSP=12;
	public static final int
		RULE_instanceIdentifier = 0, RULE_pathArgument = 1, RULE_nodeIdentifier = 2, 
		RULE_predicate = 3, RULE_keyPredicate = 4, RULE_keyPredicateExpr = 5, 
		RULE_leafListPredicate = 6, RULE_leafListPredicateExpr = 7, RULE_eqQuotedString = 8, 
		RULE_pos = 9, RULE_quotedString = 10;

	private static String[] makeRuleNames() {
		return new String[] {
			"instanceIdentifier", "pathArgument", "nodeIdentifier", "predicate", 
			"keyPredicate", "keyPredicateExpr", "leafListPredicate", "leafListPredicateExpr", 
			"eqQuotedString", "pos", "quotedString"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "':'", "'['", "']'", "'.'", "'='", "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "Identifier", "PositiveIntegerValue", 
			"STRING", "WSP"
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
	public String getGrammarFileName() { return "instanceIdentifier.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public instanceIdentifierParser1(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InstanceIdentifierContext extends ParserRuleContext {
		public List<PathArgumentContext> pathArgument() {
			return getRuleContexts(PathArgumentContext.class);
		}
		public PathArgumentContext pathArgument(int i) {
			return getRuleContext(PathArgumentContext.class,i);
		}
		public InstanceIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceIdentifier; }
	}

	public final InstanceIdentifierContext instanceIdentifier() throws RecognitionException {
		InstanceIdentifierContext _localctx = new InstanceIdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_instanceIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				match(T__0);
				setState(23);
				pathArgument();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class PathArgumentContext extends ParserRuleContext {
		public NodeIdentifierContext nodeIdentifier() {
			return getRuleContext(NodeIdentifierContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PathArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathArgument; }
	}

	public final PathArgumentContext pathArgument() throws RecognitionException {
		PathArgumentContext _localctx = new PathArgumentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pathArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			nodeIdentifier();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(29);
				predicate();
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

	public static class NodeIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(instanceIdentifierParser1.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(instanceIdentifierParser1.Identifier, i);
		}
		public NodeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeIdentifier; }
	}

	public final NodeIdentifierContext nodeIdentifier() throws RecognitionException {
		NodeIdentifierContext _localctx = new NodeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nodeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(Identifier);
			setState(33);
			match(T__1);
			setState(34);
			match(Identifier);
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

	public static class PredicateContext extends ParserRuleContext {
		public List<KeyPredicateContext> keyPredicate() {
			return getRuleContexts(KeyPredicateContext.class);
		}
		public KeyPredicateContext keyPredicate(int i) {
			return getRuleContext(KeyPredicateContext.class,i);
		}
		public LeafListPredicateContext leafListPredicate() {
			return getRuleContext(LeafListPredicateContext.class,0);
		}
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_predicate);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36);
					keyPredicate();
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				leafListPredicate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				pos();
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

	public static class KeyPredicateContext extends ParserRuleContext {
		public KeyPredicateExprContext keyPredicateExpr() {
			return getRuleContext(KeyPredicateExprContext.class,0);
		}
		public List<TerminalNode> WSP() { return getTokens(instanceIdentifierParser1.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(instanceIdentifierParser1.WSP, i);
		}
		public KeyPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPredicate; }
	}

	public final KeyPredicateContext keyPredicate() throws RecognitionException {
		KeyPredicateContext _localctx = new KeyPredicateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__2);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(46);
				match(WSP);
				}
			}

			setState(49);
			keyPredicateExpr();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(50);
				match(WSP);
				}
			}

			setState(53);
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

	public static class KeyPredicateExprContext extends ParserRuleContext {
		public NodeIdentifierContext nodeIdentifier() {
			return getRuleContext(NodeIdentifierContext.class,0);
		}
		public EqQuotedStringContext eqQuotedString() {
			return getRuleContext(EqQuotedStringContext.class,0);
		}
		public KeyPredicateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPredicateExpr; }
	}

	public final KeyPredicateExprContext keyPredicateExpr() throws RecognitionException {
		KeyPredicateExprContext _localctx = new KeyPredicateExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_keyPredicateExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			nodeIdentifier();
			setState(56);
			eqQuotedString();
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

	public static class LeafListPredicateContext extends ParserRuleContext {
		public LeafListPredicateExprContext leafListPredicateExpr() {
			return getRuleContext(LeafListPredicateExprContext.class,0);
		}
		public List<TerminalNode> WSP() { return getTokens(instanceIdentifierParser1.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(instanceIdentifierParser1.WSP, i);
		}
		public LeafListPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leafListPredicate; }
	}

	public final LeafListPredicateContext leafListPredicate() throws RecognitionException {
		LeafListPredicateContext _localctx = new LeafListPredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_leafListPredicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__2);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(59);
				match(WSP);
				}
			}

			setState(62);
			leafListPredicateExpr();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(63);
				match(WSP);
				}
			}

			setState(66);
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

	public static class LeafListPredicateExprContext extends ParserRuleContext {
		public EqQuotedStringContext eqQuotedString() {
			return getRuleContext(EqQuotedStringContext.class,0);
		}
		public LeafListPredicateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leafListPredicateExpr; }
	}

	public final LeafListPredicateExprContext leafListPredicateExpr() throws RecognitionException {
		LeafListPredicateExprContext _localctx = new LeafListPredicateExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_leafListPredicateExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__4);
			setState(69);
			eqQuotedString();
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

	public static class EqQuotedStringContext extends ParserRuleContext {
		public QuotedStringContext quotedString() {
			return getRuleContext(QuotedStringContext.class,0);
		}
		public List<TerminalNode> WSP() { return getTokens(instanceIdentifierParser1.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(instanceIdentifierParser1.WSP, i);
		}
		public EqQuotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqQuotedString; }
	}

	public final EqQuotedStringContext eqQuotedString() throws RecognitionException {
		EqQuotedStringContext _localctx = new EqQuotedStringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eqQuotedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(71);
				match(WSP);
				}
			}

			setState(74);
			match(T__5);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(75);
				match(WSP);
				}
			}

			setState(78);
			quotedString();
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

	public static class PosContext extends ParserRuleContext {
		public TerminalNode PositiveIntegerValue() { return getToken(instanceIdentifierParser1.PositiveIntegerValue, 0); }
		public List<TerminalNode> WSP() { return getTokens(instanceIdentifierParser1.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(instanceIdentifierParser1.WSP, i);
		}
		public PosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos; }
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__2);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(81);
				match(WSP);
				}
			}

			setState(84);
			match(PositiveIntegerValue);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(85);
				match(WSP);
				}
			}

			setState(88);
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

	public static class QuotedStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(instanceIdentifierParser1.STRING, 0); }
		public QuotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedString; }
	}

	public final QuotedStringContext quotedString() throws RecognitionException {
		QuotedStringContext _localctx = new QuotedStringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quotedString);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(T__6);
				setState(91);
				match(STRING);
				setState(92);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__7);
				setState(94);
				match(STRING);
				setState(95);
				match(T__7);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4"+
		"\3\5\6\5(\n\5\r\5\16\5)\3\5\3\5\5\5.\n\5\3\6\3\6\5\6\62\n\6\3\6\3\6\5"+
		"\6\66\n\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b?\n\b\3\b\3\b\5\bC\n\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\5\nK\n\n\3\n\3\n\5\nO\n\n\3\n\3\n\3\13\3\13\5\13U\n"+
		"\13\3\13\3\13\5\13Y\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fc\n\f\3"+
		"\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2g\2\32\3\2\2\2\4\36\3\2\2\2\6"+
		"\"\3\2\2\2\b-\3\2\2\2\n/\3\2\2\2\f9\3\2\2\2\16<\3\2\2\2\20F\3\2\2\2\22"+
		"J\3\2\2\2\24R\3\2\2\2\26b\3\2\2\2\30\31\7\3\2\2\31\33\5\4\3\2\32\30\3"+
		"\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\3\3\2\2\2\36 \5\6"+
		"\4\2\37!\5\b\5\2 \37\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\"#\7\13\2\2#$\7\4\2"+
		"\2$%\7\13\2\2%\7\3\2\2\2&(\5\n\6\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*.\3\2\2\2+.\5\16\b\2,.\5\24\13\2-\'\3\2\2\2-+\3\2\2\2-,\3\2\2\2"+
		".\t\3\2\2\2/\61\7\5\2\2\60\62\7\16\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\5\f\7\2\64\66\7\16\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\3\2\2\2\678\7\6\2\28\13\3\2\2\29:\5\6\4\2:;\5\22\n\2;\r\3\2\2\2<>"+
		"\7\5\2\2=?\7\16\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@B\5\20\t\2AC\7\16\2"+
		"\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\6\2\2E\17\3\2\2\2FG\7\7\2\2GH\5\22"+
		"\n\2H\21\3\2\2\2IK\7\16\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LN\7\b\2\2MO"+
		"\7\16\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\5\26\f\2Q\23\3\2\2\2RT\7\5\2"+
		"\2SU\7\16\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7\f\2\2WY\7\16\2\2XW\3\2"+
		"\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\6\2\2[\25\3\2\2\2\\]\7\t\2\2]^\7\r\2\2^c"+
		"\7\t\2\2_`\7\n\2\2`a\7\r\2\2ac\7\n\2\2b\\\3\2\2\2b_\3\2\2\2c\27\3\2\2"+
		"\2\17\34 )-\61\65>BJNTXb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}