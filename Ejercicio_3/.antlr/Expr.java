// Generated from c:/Users/Karim Rios/Documents/vscode/Verano/DuplicarExamen2PorOrdenDeLosPeakyBlinders/Ejercicio_3/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Expr extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABIERO=1, ABIERTO_SLASH=2, XML=3, COMENTARIO=4, CDATA=5, ENTIDAD=6, TEXTO=7, 
		ID=8, STRING=9, IGUAL=10, CERRADO=11, CERRADO_SLASH=12, XML_CERRADO=13, 
		WS=14;
	public static final int
		INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABIERO", "ABIERTO_SLASH", "XML", "COMENTARIO", "CDATA", "ENTIDAD", "TEXTO", 
			"ID", "STRING", "IGUAL", "CERRADO", "CERRADO_SLASH", "XML_CERRADO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'</'", "'<?'", null, null, null, null, null, null, "'='", 
			"'>'", "'/>'", "'?>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABIERO", "ABIERTO_SLASH", "XML", "COMENTARIO", "CDATA", "ENTIDAD", 
			"TEXTO", "ID", "STRING", "IGUAL", "CERRADO", "CERRADO_SLASH", "XML_CERRADO", 
			"WS"
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


	public Expr(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\u000e\u0082\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000"+
		"\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003"+
		"\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006"+
		"\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002"+
		"\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u00033\b\u0003\n\u0003\f\u00036\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0005\u0005R\b\u0005\n\u0005\f\u0005U\t\u0005\u0001\u0006\u0004"+
		"\u0006X\b\u0006\u000b\u0006\f\u0006Y\u0001\u0007\u0001\u0007\u0005\u0007"+
		"^\b\u0007\n\u0007\f\u0007a\t\u0007\u0001\b\u0001\b\u0005\be\b\b\n\b\f"+
		"\bh\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\r}\b\r\u000b\r\f\r~\u0001"+
		"\r\u0001\r\u00034HS\u0000\u000e\u0002\u0001\u0004\u0002\u0006\u0003\b"+
		"\u0004\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016\u000b"+
		"\u0018\f\u001a\r\u001c\u000e\u0002\u0000\u0001\u0005\u0002\u0000&&<<\u0004"+
		"\u0000::AZ__az\u0005\u0000-.0:AZ__az\u0003\u0000\n\n\r\r\"\"\u0003\u0000"+
		"\t\n\r\r  \u0087\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001"+
		"\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000"+
		"\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000"+
		"\u0000\u0000\u000e\u0001\u0000\u0000\u0000\u0001\u0010\u0001\u0000\u0000"+
		"\u0000\u0001\u0012\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000"+
		"\u0000\u0001\u0016\u0001\u0000\u0000\u0000\u0001\u0018\u0001\u0000\u0000"+
		"\u0000\u0001\u001a\u0001\u0000\u0000\u0000\u0001\u001c\u0001\u0000\u0000"+
		"\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000"+
		"\u0006\'\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n;\u0001\u0000"+
		"\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000"+
		"\u0010[\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014k"+
		"\u0001\u0000\u0000\u0000\u0016m\u0001\u0000\u0000\u0000\u0018q\u0001\u0000"+
		"\u0000\u0000\u001av\u0001\u0000\u0000\u0000\u001c|\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005<\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0006"+
		"\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0005<\u0000\u0000"+
		"#$\u0005/\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0006\u0001\u0000\u0000"+
		"&\u0005\u0001\u0000\u0000\u0000\'(\u0005<\u0000\u0000()\u0005?\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*+\u0006\u0002\u0000\u0000+\u0007\u0001\u0000"+
		"\u0000\u0000,-\u0005<\u0000\u0000-.\u0005!\u0000\u0000./\u0005-\u0000"+
		"\u0000/0\u0005-\u0000\u000004\u0001\u0000\u0000\u000013\t\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000078\u0005-\u0000\u000089\u0005-\u0000\u00009:\u0005>"+
		"\u0000\u0000:\t\u0001\u0000\u0000\u0000;<\u0005<\u0000\u0000<=\u0005!"+
		"\u0000\u0000=>\u0005[\u0000\u0000>?\u0005C\u0000\u0000?@\u0005D\u0000"+
		"\u0000@A\u0005A\u0000\u0000AB\u0005T\u0000\u0000BC\u0005A\u0000\u0000"+
		"CD\u0005[\u0000\u0000DH\u0001\u0000\u0000\u0000EG\t\u0000\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000KL\u0005]\u0000\u0000LM\u0005]\u0000\u0000MN\u0005>\u0000"+
		"\u0000N\u000b\u0001\u0000\u0000\u0000OS\u0005&\u0000\u0000PR\t\u0000\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000T\r\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VX\b\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u000f\u0001\u0000\u0000\u0000[_\u0007\u0001\u0000\u0000\\^\u0007\u0002"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0011\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bf\u0005\"\u0000\u0000ce\b\u0003\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000ij\u0005\"\u0000\u0000j\u0013\u0001\u0000\u0000\u0000"+
		"kl\u0005=\u0000\u0000l\u0015\u0001\u0000\u0000\u0000mn\u0005>\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0006\n\u0001\u0000p\u0017\u0001\u0000\u0000"+
		"\u0000qr\u0005/\u0000\u0000rs\u0005>\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tu\u0006\u000b\u0001\u0000u\u0019\u0001\u0000\u0000\u0000vw\u0005?\u0000"+
		"\u0000wx\u0005>\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0006\f\u0001"+
		"\u0000z\u001b\u0001\u0000\u0000\u0000{}\u0007\u0004\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0006\r\u0002\u0000\u0081\u001d\u0001\u0000\u0000\u0000\t\u0000"+
		"\u00014HSY_f~\u0003\u0005\u0001\u0000\u0004\u0000\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}