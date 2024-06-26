// Generated from C:/Global/prog/Lisp/Lisp-Machine/src/main/java/ru/nsu/lispMachine/Parser/lisp_to_java.g4 by ANTLR 4.13.1
package ru.nsu.lispMachine.Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class lisp_to_javaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, PLUS=2, MINUS=3, MULT=4, DIV=5, OP=6, CP=7, LOGIC=8, ADDITIONAL=9, 
		SPACE=10, STRING=11, NUMBER=12, DIGIT=13, LETTER=14, LOWER=15, UPPER=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "PLUS", "MINUS", "MULT", "DIV", "OP", "CP", "LOGIC", "ADDITIONAL", 
			"SPACE", "STRING", "NUMBER", "DIGIT", "LETTER", "LOWER", "UPPER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "PLUS", "MINUS", "MULT", "DIV", "OP", "CP", "LOGIC", 
			"ADDITIONAL", "SPACE", "STRING", "NUMBER", "DIGIT", "LETTER", "LOWER", 
			"UPPER"
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


	public lisp_to_javaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lisp_to_java.g4"; }

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
		"\u0004\u0000\u0010g\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b"+
		"\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000/\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007D\b"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0004\tI\b\t\u000b\t\f\tJ\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0004\nS\b\n\u000b\n\f\nT\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000bZ\b\u000b\u000b\u000b\f\u000b[\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0003\rb\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0002\u0004"+
		"\u0000\"\"\'\'-.@@\u0003\u0000\t\n\r\r  w\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0001.\u0001\u0000\u0000\u0000\u00030\u0001"+
		"\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000"+
		"\u0000\t6\u0001\u0000\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\r:\u0001"+
		"\u0000\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000"+
		"\u0000\u0013H\u0001\u0000\u0000\u0000\u0015N\u0001\u0000\u0000\u0000\u0017"+
		"Y\u0001\u0000\u0000\u0000\u0019]\u0001\u0000\u0000\u0000\u001ba\u0001"+
		"\u0000\u0000\u0000\u001dc\u0001\u0000\u0000\u0000\u001fe\u0001\u0000\u0000"+
		"\u0000!%\u0003\u001b\r\u0000\"%\u0003\u0019\f\u0000#%\u0003\u0011\b\u0000"+
		"$!\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000"+
		"\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'/\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)/\u0003"+
		"\u0003\u0001\u0000*/\u0003\u0005\u0002\u0000+/\u0003\u0007\u0003\u0000"+
		",/\u0003\t\u0004\u0000-/\u0003\u000f\u0007\u0000.&\u0001\u0000\u0000\u0000"+
		".)\u0001\u0000\u0000\u0000.*\u0001\u0000\u0000\u0000.+\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0002\u0001"+
		"\u0000\u0000\u000001\u0005+\u0000\u00001\u0004\u0001\u0000\u0000\u0000"+
		"23\u0005-\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005*\u0000\u0000"+
		"5\b\u0001\u0000\u0000\u000067\u0005/\u0000\u00007\n\u0001\u0000\u0000"+
		"\u000089\u0005(\u0000\u00009\f\u0001\u0000\u0000\u0000:;\u0005)\u0000"+
		"\u0000;\u000e\u0001\u0000\u0000\u0000<D\u0002<>\u0000=>\u0005/\u0000\u0000"+
		">D\u0005=\u0000\u0000?@\u0005>\u0000\u0000@D\u0005=\u0000\u0000AB\u0005"+
		"<\u0000\u0000BD\u0005=\u0000\u0000C<\u0001\u0000\u0000\u0000C=\u0001\u0000"+
		"\u0000\u0000C?\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000D\u0010"+
		"\u0001\u0000\u0000\u0000EF\u0007\u0000\u0000\u0000F\u0012\u0001\u0000"+
		"\u0000\u0000GI\u0007\u0001\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0006\t\u0000\u0000M\u0014\u0001\u0000\u0000"+
		"\u0000NR\u0005\"\u0000\u0000OS\u0003\u001b\r\u0000PS\u0003\u0019\f\u0000"+
		"QS\u0003\u0013\t\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005\"\u0000"+
		"\u0000W\u0016\u0001\u0000\u0000\u0000XZ\u0003\u0019\f\u0000YX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u0018\u0001\u0000\u0000\u0000]^\u000209\u0000^\u001a"+
		"\u0001\u0000\u0000\u0000_b\u0003\u001d\u000e\u0000`b\u0003\u001f\u000f"+
		"\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000b\u001c\u0001"+
		"\u0000\u0000\u0000cd\u0002az\u0000d\u001e\u0001\u0000\u0000\u0000ef\u0002"+
		"AZ\u0000f \u0001\u0000\u0000\u0000\n\u0000$&.CJRT[a\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}