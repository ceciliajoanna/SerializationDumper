// Generated from /Users/jds5109/Documents/Portfolio-GitHub/SerializationDumper/src/Serialization.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SerializationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STREAM_MAGIC=1, STREAM_VERSION=2;
	public static final int
		RULE_stream = 0, RULE_contents = 1, RULE_magic = 2, RULE_version = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"stream", "contents", "magic", "version"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STREAM_MAGIC", "STREAM_VERSION"
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
	public String getGrammarFileName() { return "Serialization.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SerializationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StreamContext extends ParserRuleContext {
		public MagicContext magic() {
			return getRuleContext(MagicContext.class,0);
		}
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ContentsContext contents() {
			return getRuleContext(ContentsContext.class,0);
		}
		public StreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SerializationListener ) ((SerializationListener)listener).enterStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SerializationListener ) ((SerializationListener)listener).exitStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SerializationVisitor ) return ((SerializationVisitor<? extends T>)visitor).visitStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamContext stream() throws RecognitionException {
		StreamContext _localctx = new StreamContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			magic();
			setState(9);
			version();
			setState(10);
			contents();
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

	public static class ContentsContext extends ParserRuleContext {
		public ContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SerializationListener ) ((SerializationListener)listener).enterContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SerializationListener ) ((SerializationListener)listener).exitContents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SerializationVisitor ) return ((SerializationVisitor<? extends T>)visitor).visitContents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentsContext contents() throws RecognitionException {
		ContentsContext _localctx = new ContentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_contents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STREAM_MAGIC || _la==STREAM_VERSION) {
				{
				{
				setState(12);
				matchWildcard();
				}
				}
				setState(17);
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

	public static class MagicContext extends ParserRuleContext {
		public TerminalNode STREAM_MAGIC() { return getToken(SerializationParser.STREAM_MAGIC, 0); }
		public MagicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SerializationListener ) ((SerializationListener)listener).enterMagic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SerializationListener ) ((SerializationListener)listener).exitMagic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SerializationVisitor ) return ((SerializationVisitor<? extends T>)visitor).visitMagic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagicContext magic() throws RecognitionException {
		MagicContext _localctx = new MagicContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_magic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(STREAM_MAGIC);
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode STREAM_VERSION() { return getToken(SerializationParser.STREAM_VERSION, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SerializationListener ) ((SerializationListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SerializationListener ) ((SerializationListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SerializationVisitor ) return ((SerializationVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(STREAM_VERSION);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\4\31\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\7\3\20\n\3\f\3\16\3\23\13\3\3"+
		"\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\25\2\n\3\2\2\2\4\21\3\2\2\2\6\24"+
		"\3\2\2\2\b\26\3\2\2\2\n\13\5\6\4\2\13\f\5\b\5\2\f\r\5\4\3\2\r\3\3\2\2"+
		"\2\16\20\13\2\2\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2"+
		"\2\2\22\5\3\2\2\2\23\21\3\2\2\2\24\25\7\3\2\2\25\7\3\2\2\2\26\27\7\4\2"+
		"\2\27\t\3\2\2\2\3\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}