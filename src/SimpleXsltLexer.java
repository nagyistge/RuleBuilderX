// Generated from SimpleXslt.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleXsltLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, RESERVED_WORDS=4, T_BOOLS=5, T_OR=6, T_AND=7, 
		T_STRING_LITERAL=8, T_CHAR_LITERAL=9, ID=10, NUMBER=11, DIGIT=12, T_LBRACE=13, 
		T_RBRACE=14, T_LPAREN=15, T_RPAREN=16, T_LSQUIGBRACE=17, T_RSQUIGBRACE=18, 
		T_PLUS=19, T_MINUS=20, T_STAR=21, T_SLASH=22, T_EQ=23, T_NEQ=24, T_LTE=25, 
		T_LT=26, T_GTE=27, T_GT=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'and'", "'or'", "'var'", "RESERVED_WORDS", "T_BOOLS", "T_OR", "T_AND", 
		"T_STRING_LITERAL", "T_CHAR_LITERAL", "ID", "NUMBER", "DIGIT", "'['", 
		"']'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'='", 
		"'!='", "'<='", "'<'", "'>='", "'>'", "WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "RESERVED_WORDS", "T_BOOLS", "T_OR", "T_AND", 
		"T_STRING_LITERAL", "T_CHAR_LITERAL", "ID", "NAMECHAR", "LETTER", "NUMBER", 
		"DIGIT", "DECIMAL", "T_LBRACE", "T_RBRACE", "T_LPAREN", "T_RPAREN", "T_LSQUIGBRACE", 
		"T_RSQUIGBRACE", "T_PLUS", "T_MINUS", "T_STAR", "T_SLASH", "T_EQ", "T_NEQ", 
		"T_LTE", "T_LT", "T_GTE", "T_GT", "WS"
	};


	public SimpleXsltLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleXslt.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 31: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\37\u00de\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5"+
		"\5S\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\5"+
		"\7d\n\7\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3"+
		"\t\3\t\3\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13"+
		"\u0083\n\13\f\13\16\13\u0086\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008e"+
		"\n\f\3\r\3\r\3\16\7\16\u0093\n\16\f\16\16\16\u0096\13\16\3\16\3\16\6\16"+
		"\u009a\n\16\r\16\16\16\u009b\3\16\6\16\u009f\n\16\r\16\16\16\u00a0\3\16"+
		"\3\16\7\16\u00a5\n\16\f\16\16\16\u00a8\13\16\3\16\6\16\u00ab\n\16\r\16"+
		"\16\16\u00ac\5\16\u00af\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3!\6!\u00d9\n!\r!\16!\u00da\3!\3!\2\"\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\2\1\31\2\1\33\r\1\35\16"+
		"\1\37\2\1!\17\1#\20\1%\21\1\'\22\1)\23\1+\24\1-\25\1/\26\1\61\27\1\63"+
		"\30\1\65\31\1\67\32\19\33\1;\34\1=\35\1?\36\1A\37\2\3\2\7\4\2$$^^\4\2"+
		"^^aa\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u00ed\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5G\3\2\2\2\7"+
		"J\3\2\2\2\tR\3\2\2\2\13]\3\2\2\2\rc\3\2\2\2\17j\3\2\2\2\21l\3\2\2\2\23"+
		"u\3\2\2\2\25~\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33\u00ae\3\2\2"+
		"\2\35\u00b0\3\2\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2\2#\u00b6\3\2\2\2%\u00b8"+
		"\3\2\2\2\'\u00ba\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2"+
		"/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8\3\2\2\2\67"+
		"\u00ca\3\2\2\29\u00cd\3\2\2\2;\u00d0\3\2\2\2=\u00d2\3\2\2\2?\u00d5\3\2"+
		"\2\2A\u00d8\3\2\2\2CD\7c\2\2DE\7p\2\2EF\7f\2\2F\4\3\2\2\2GH\7q\2\2HI\7"+
		"t\2\2I\6\3\2\2\2JK\7x\2\2KL\7c\2\2LM\7t\2\2M\b\3\2\2\2NS\5\13\6\2OP\7"+
		"x\2\2PQ\7c\2\2QS\7t\2\2RN\3\2\2\2RO\3\2\2\2S\n\3\2\2\2TU\7v\2\2UV\7t\2"+
		"\2VW\7w\2\2W^\7g\2\2XY\7h\2\2YZ\7c\2\2Z[\7n\2\2[\\\7u\2\2\\^\7g\2\2]T"+
		"\3\2\2\2]X\3\2\2\2^\f\3\2\2\2_`\7q\2\2`d\7t\2\2ab\7~\2\2bd\7~\2\2c_\3"+
		"\2\2\2ca\3\2\2\2d\16\3\2\2\2ef\7c\2\2fg\7p\2\2gk\7f\2\2hi\7(\2\2ik\7("+
		"\2\2je\3\2\2\2jh\3\2\2\2k\20\3\2\2\2lp\7$\2\2mo\n\2\2\2nm\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7$\2\2t\22\3\2\2\2uy"+
		"\7)\2\2vx\n\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y"+
		"\3\2\2\2|}\7)\2\2}\24\3\2\2\2~\177\5)\25\2\177\u0084\5\27\f\2\u0080\u0083"+
		"\5\27\f\2\u0081\u0083\5\35\17\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2"+
		"\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5+\26\2\u0088\26\3\2\2\2\u0089"+
		"\u008e\5\31\r\2\u008a\u008e\t\3\2\2\u008b\u008e\5\63\32\2\u008c\u008e"+
		"\4/\60\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\30\3\2\2\2\u008f\u0090\t\4\2\2\u0090\32\3\2\2\2\u0091"+
		"\u0093\5\35\17\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0099\5\37\20\2\u0098\u009a\5\35\17\2\u0099\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00af\3\2\2\2\u009d"+
		"\u009f\5\35\17\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\5\37\20\2\u00a3"+
		"\u00a5\5\35\17\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00af\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ab\5\35\17\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u0094\3\2\2\2\u00ae"+
		"\u009e\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\34\3\2\2\2\u00b0\u00b1\t\5\2"+
		"\2\u00b1\36\3\2\2\2\u00b2\u00b3\7\60\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7"+
		"]\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7_\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7"+
		"*\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7+\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7}"+
		"\2\2\u00bd*\3\2\2\2\u00be\u00bf\7\177\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7"+
		"-\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7"+
		",\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\64\3\2\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7?\2\2\u00cc8"+
		"\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7?\2\2\u00cf:\3\2\2\2\u00d0\u00d1"+
		"\7>\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4\7?\2\2\u00d4>\3"+
		"\2\2\2\u00d5\u00d6\7@\2\2\u00d6@\3\2\2\2\u00d7\u00d9\t\6\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\b!\2\2\u00ddB\3\2\2\2\23\2R]cjpy\u0082\u0084"+
		"\u008d\u0094\u009b\u00a0\u00a6\u00ac\u00ae\u00da";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}