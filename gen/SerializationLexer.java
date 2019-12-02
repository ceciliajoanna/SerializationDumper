// Generated from /Users/joanna/Documents/Portfolio/SerializationDumper/src/Serialization.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SerializationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BYTE=2, SHORT=3, DOUBLE=4, STREAM_MAGIC=5, STREAM_VERSION=6, TC_RESET=7, 
		TC_NULL=8, TC_REFERENCE=9, TC_CLASSDESC=10, TC_OBJECT=11, TC_STRING=12, 
		TC_ARRAY=13, TC_CLASS=14, TC_BLOCKDATA=15, TC_ENDBLOCKDATA=16, TC_BLOCKDATALONG=17, 
		TC_EXCEPTION=18, TC_LONGSTRING=19, TC_PROXYCLASSDESC=20, TC_ENUM=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BYTE", "SHORT", "DOUBLE", "STREAM_MAGIC", "STREAM_VERSION", 
			"TC_RESET", "TC_NULL", "TC_REFERENCE", "TC_CLASSDESC", "TC_OBJECT", "TC_STRING", 
			"TC_ARRAY", "TC_CLASS", "TC_BLOCKDATA", "TC_ENDBLOCKDATA", "TC_BLOCKDATALONG", 
			"TC_EXCEPTION", "TC_LONGSTRING", "TC_PROXYCLASSDESC", "TC_ENUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u0000'", null, null, null, null, null, "'\u0079'", "'\u0070'", 
			"'\u0071'", "'\u0072'", "'\u0073'", "'\u0074'", "'\u0075'", "'\u0076'", 
			"'\u0077'", "'\u0078'", "'\u007A'", "'\u007B'", "'\u007C'", "'\u007D'", 
			"'\u007E'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BYTE", "SHORT", "DOUBLE", "STREAM_MAGIC", "STREAM_VERSION", 
			"TC_RESET", "TC_NULL", "TC_REFERENCE", "TC_CLASSDESC", "TC_OBJECT", "TC_STRING", 
			"TC_ARRAY", "TC_CLASS", "TC_BLOCKDATA", "TC_ENDBLOCKDATA", "TC_BLOCKDATALONG", 
			"TC_EXCEPTION", "TC_LONGSTRING", "TC_PROXYCLASSDESC", "TC_ENUM"
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


	public SerializationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Serialization.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27\3\2\2\2\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3"+
		"\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\64\3\2\2\2\139\3\2\2\2\r<\3\2\2\2\17"+
		"?\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31I\3\2\2\2"+
		"\33K\3\2\2\2\35M\3\2\2\2\37O\3\2\2\2!Q\3\2\2\2#S\3\2\2\2%U\3\2\2\2\'W"+
		"\3\2\2\2)Y\3\2\2\2+[\3\2\2\2-.\7\2\2\2.\4\3\2\2\2/\60\4\2\u0101\2\60\6"+
		"\3\2\2\2\61\62\5\5\3\2\62\63\5\5\3\2\63\b\3\2\2\2\64\65\5\5\3\2\65\66"+
		"\5\5\3\2\66\67\5\5\3\2\678\5\5\3\28\n\3\2\2\29:\7\u00ae\2\2:;\7\u00ef"+
		"\2\2;\f\3\2\2\2<=\7\2\2\2=>\7\7\2\2>\16\3\2\2\2?@\7{\2\2@\20\3\2\2\2A"+
		"B\7r\2\2B\22\3\2\2\2CD\7s\2\2D\24\3\2\2\2EF\7t\2\2F\26\3\2\2\2GH\7u\2"+
		"\2H\30\3\2\2\2IJ\7v\2\2J\32\3\2\2\2KL\7w\2\2L\34\3\2\2\2MN\7x\2\2N\36"+
		"\3\2\2\2OP\7y\2\2P \3\2\2\2QR\7z\2\2R\"\3\2\2\2ST\7|\2\2T$\3\2\2\2UV\7"+
		"}\2\2V&\3\2\2\2WX\7~\2\2X(\3\2\2\2YZ\7\177\2\2Z*\3\2\2\2[\\\7\u0080\2"+
		"\2\\,\3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}