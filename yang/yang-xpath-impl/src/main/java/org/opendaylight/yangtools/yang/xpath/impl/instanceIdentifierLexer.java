// Generated from org\opendaylight\yangtools\yang\xpath\impl\instanceIdentifier.g4 by ANTLR 4.7.2
package org.opendaylight.yangtools.yang.xpath.impl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class instanceIdentifierLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Identifier=9, 
		PositiveIntegerValue=10, STRING=11, WSP=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Identifier", 
			"PositiveIntegerValue", "STRING", "WSP", "YANGCHAR"
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


	public instanceIdentifierLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "instanceIdentifier.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16G\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7\n\60\n\n\f\n\16\n\63\13\n\3\13\3\13"+
		"\7\13\67\n\13\f\13\16\13:\13\13\3\f\6\f=\n\f\r\f\16\f>\3\r\6\rB\n\r\r"+
		"\r\16\rC\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\2\3\2\7\4\2C\\c|\7\2/\60\62;C\\aac|\3\2\63;\3\2\62;\4"+
		"\2\13\13\"\"\3\27\2\13\2\f\2\17\2\17\2\"\2\ud801\2\ue002\2\ufdd1\2\ufdf2"+
		"\2\uffff\2\2\3\uffff\3\2\4\uffff\4\2\5\uffff\5\2\6\uffff\6\2\7\uffff\7"+
		"\2\b\uffff\b\2\t\uffff\t\2\n\uffff\n\2\13\uffff\13\2\f\uffff\f\2\r\uffff"+
		"\r\2\16\uffff\16\2\17\uffff\17\2\20\uffff\20\2\21\uffff\21\2\22\uffff"+
		"\22I\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%"+
		"\3\2\2\2\r\'\3\2\2\2\17)\3\2\2\2\21+\3\2\2\2\23-\3\2\2\2\25\64\3\2\2\2"+
		"\27<\3\2\2\2\31A\3\2\2\2\33E\3\2\2\2\35\36\7\61\2\2\36\4\3\2\2\2\37 \7"+
		"<\2\2 \6\3\2\2\2!\"\7]\2\2\"\b\3\2\2\2#$\7_\2\2$\n\3\2\2\2%&\7\60\2\2"+
		"&\f\3\2\2\2\'(\7?\2\2(\16\3\2\2\2)*\7)\2\2*\20\3\2\2\2+,\7$\2\2,\22\3"+
		"\2\2\2-\61\t\2\2\2.\60\t\3\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\24\3\2\2\2\63\61\3\2\2\2\648\t\4\2\2\65\67\t\5\2\2\66\65"+
		"\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\26\3\2\2\2:8\3\2\2\2;=\5\33"+
		"\16\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\30\3\2\2\2@B\t\6\2\2A@"+
		"\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\32\3\2\2\2EF\t\7\2\2F\34\3\2\2"+
		"\2\7\2\618>C\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}