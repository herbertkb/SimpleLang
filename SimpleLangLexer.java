// Generated from SimpleLang.g4 by ANTLR 4.5.2

    import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, INT=11, OPERATOR=12, NEWLINE=13, STRING=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ID", "INT", "OPERATOR", "NEWLINE", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "','", "'int'", "'='", "'string'", "':='", "'print'", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"OPERATOR", "NEWLINE", "STRING", "WS"
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


	    Map<String, Object> symbolTable = new HashMap<String, Object>();
	    
	    int evaluate(String operator, int left, int right) {
	        switch ( operator ) {
	            case '*' : return left * right;
	            case '/' : return left / right;
	            case '+' : return left + right;
	            case '-' : return left - right;
	        }
	    }
	    
	    String evaluate(String operator, String s, int i) {
	        switch (operator) {
	            case '*' : return ;
	            case '/' : return s; // TODO: throw error 
	            case '+' : return substring(s, i);
	            case '-' : return substring(s, i * -1);
	        }
	    }
	    
	    String substring(String s, int i) {
	        if (i > 0) {
	            return s.substring(i);
	        }
	        else {
	            i *= -1;
	            return s.substring(0, s.length() - i);
	        }
	    }


	public SimpleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21g\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13D\n\13\f\13\16\13"+
		"G\13\13\3\f\5\fJ\n\f\3\f\6\fM\n\f\r\f\16\fN\3\r\3\r\3\16\5\16T\n\16\3"+
		"\16\3\16\3\17\3\17\7\17Z\n\17\f\17\16\17]\13\17\3\17\3\17\3\20\6\20b\n"+
		"\20\r\20\16\20c\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\b\4\2C\\c|\5\2\62;C\\c|\3\2"+
		"\62;\5\2,-//\61\61\6\2\"\"\62;C\\c|\4\2\13\13\"\"l\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t+\3"+
		"\2\2\2\13-\3\2\2\2\r\64\3\2\2\2\17\67\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2"+
		"\25A\3\2\2\2\27I\3\2\2\2\31P\3\2\2\2\33S\3\2\2\2\35W\3\2\2\2\37a\3\2\2"+
		"\2!\"\7x\2\2\"#\7c\2\2#$\7t\2\2$\4\3\2\2\2%&\7.\2\2&\6\3\2\2\2\'(\7k\2"+
		"\2()\7p\2\2)*\7v\2\2*\b\3\2\2\2+,\7?\2\2,\n\3\2\2\2-.\7u\2\2./\7v\2\2"+
		"/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7i\2\2\63\f\3\2\2\2\64\65"+
		"\7<\2\2\65\66\7?\2\2\66\16\3\2\2\2\678\7r\2\289\7t\2\29:\7k\2\2:;\7p\2"+
		"\2;<\7v\2\2<\20\3\2\2\2=>\7*\2\2>\22\3\2\2\2?@\7+\2\2@\24\3\2\2\2AE\t"+
		"\2\2\2BD\t\3\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\26\3\2\2\2G"+
		"E\3\2\2\2HJ\7/\2\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KM\t\4\2\2LK\3\2\2\2M"+
		"N\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\30\3\2\2\2PQ\t\5\2\2Q\32\3\2\2\2RT\7\17"+
		"\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\f\2\2V\34\3\2\2\2W[\7$\2\2XZ\t"+
		"\6\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^"+
		"_\7$\2\2_\36\3\2\2\2`b\t\7\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2"+
		"de\3\2\2\2ef\b\20\2\2f \3\2\2\2\t\2EINS[c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}