// Generated from SimpleLang.g4 by ANTLR 4.5.2

    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, INT=11, OPERATOR=12, NEWLINE=13, STRING=14, WS=15;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declareInt = 2, RULE_declareString = 3, 
		RULE_declareInferred = 4, RULE_assignment = 5, RULE_print = 6, RULE_expression = 7;
	public static final String[] ruleNames = {
		"program", "statement", "declareInt", "declareString", "declareInferred", 
		"assignment", "print", "expression"
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

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLangParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(16);
				statement();
				setState(17);
				match(NEWLINE);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
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
		public DeclareIntContext declareInt() {
			return getRuleContext(DeclareIntContext.class,0);
		}
		public DeclareStringContext declareString() {
			return getRuleContext(DeclareStringContext.class,0);
		}
		public DeclareInferredContext declareInferred() {
			return getRuleContext(DeclareInferredContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SimpleLangParser.NEWLINE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				declareInt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				declareString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				declareInferred();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
				match(NEWLINE);
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

	public static class DeclareIntContext extends ParserRuleContext {
		public Token ID;
		public ExpressionContext expression;
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclareIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclareInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclareInt(this);
		}
	}

	public final DeclareIntContext declareInt() throws RecognitionException {
		DeclareIntContext _localctx = new DeclareIntContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declareInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			((DeclareIntContext)_localctx).ID = match(ID);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(36);
				match(T__1);
				setState(37);
				((DeclareIntContext)_localctx).ID = match(ID);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__2);
			setState(46);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(44);
				match(T__3);
				setState(45);
				((DeclareIntContext)_localctx).expression = expression(0);
				}
			}

			symbolTable.put((((DeclareIntContext)_localctx).ID!=null?((DeclareIntContext)_localctx).ID.getText():null), ((DeclareIntContext)_localctx).expression.value);
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

	public static class DeclareStringContext extends ParserRuleContext {
		public Token ID;
		public ExpressionContext expression;
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclareStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclareString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclareString(this);
		}
	}

	public final DeclareStringContext declareString() throws RecognitionException {
		DeclareStringContext _localctx = new DeclareStringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declareString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			((DeclareStringContext)_localctx).ID = match(ID);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(52);
				match(T__1);
				setState(53);
				((DeclareStringContext)_localctx).ID = match(ID);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(T__4);
			setState(62);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(60);
				match(T__3);
				setState(61);
				((DeclareStringContext)_localctx).expression = expression(0);
				}
			}

			symbolTable.put((((DeclareStringContext)_localctx).ID!=null?((DeclareStringContext)_localctx).ID.getText():null), ((DeclareStringContext)_localctx).expression.value);
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

	public static class DeclareInferredContext extends ParserRuleContext {
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclareInferredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareInferred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclareInferred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclareInferred(this);
		}
	}

	public final DeclareInferredContext declareInferred() throws RecognitionException {
		DeclareInferredContext _localctx = new DeclareInferredContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declareInferred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((DeclareInferredContext)_localctx).ID = match(ID);
			setState(67);
			match(T__5);
			setState(68);
			((DeclareInferredContext)_localctx).expression = expression(0);
			 
			                if (String.isAssignableFrom(((DeclareInferredContext)_localctx).expression.value)) {
			                    symbolTable.put(((DeclareInferredContext)_localctx).ID, (((DeclareInferredContext)_localctx).expression!=null?_input.getText(((DeclareInferredContext)_localctx).expression.start,((DeclareInferredContext)_localctx).expression.stop):null));
			                }
			                else {
			                    symbolTable.put(((DeclareInferredContext)_localctx).ID, Integer.valueOf((((DeclareInferredContext)_localctx).expression!=null?_input.getText(((DeclareInferredContext)_localctx).expression.start,((DeclareInferredContext)_localctx).expression.stop):null)));
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(72);
			match(T__3);
			setState(73);
			expression(0);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__6);
			setState(76);
			((PrintContext)_localctx).expression = expression(0);
			 System.out.println(((PrintContext)_localctx).expression.value); 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Object value;
		public ExpressionContext expression;
		public Token ID;
		public Token STRING;
		public Token INT;
		public Token OPERATOR;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SimpleLangParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SimpleLangParser.INT, 0); }
		public TerminalNode OPERATOR() { return getToken(SimpleLangParser.OPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(80);
				match(T__7);
				setState(81);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(82);
				match(T__8);
				 ((ExpressionContext)_localctx).value =  _localctx.value; 
				}
				break;
			case ID:
				{
				setState(85);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).value =  symbolTable.get((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case STRING:
				{
				setState(87);
				((ExpressionContext)_localctx).STRING = match(STRING);
				 ((ExpressionContext)_localctx).value =  (((ExpressionContext)_localctx).STRING!=null?((ExpressionContext)_localctx).STRING.getText():null); 
				}
				break;
			case INT:
				{
				setState(89);
				((ExpressionContext)_localctx).INT = match(INT);
				 ((ExpressionContext)_localctx).value =  (((ExpressionContext)_localctx).INT!=null?Integer.valueOf(((ExpressionContext)_localctx).INT.getText()):0);     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(93);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(94);
					((ExpressionContext)_localctx).OPERATOR = match(OPERATOR);
					setState(95);
					((ExpressionContext)_localctx).expression = expression(5);
					 ((ExpressionContext)_localctx).value =  evaluate((((ExpressionContext)_localctx).OPERATOR!=null?((ExpressionContext)_localctx).OPERATOR.getText():null) _localctx.value);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\5\3\5\3\5\5\5A\n\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\t\3\t\3\t\3\t\3\t\7\te\n\t\f\t\16"+
		"\th\13\t\3\t\2\3\20\n\2\4\6\b\n\f\16\20\2\2o\2\27\3\2\2\2\4\"\3\2\2\2"+
		"\6$\3\2\2\2\b\64\3\2\2\2\nD\3\2\2\2\fI\3\2\2\2\16M\3\2\2\2\20]\3\2\2\2"+
		"\22\23\5\4\3\2\23\24\7\17\2\2\24\26\3\2\2\2\25\22\3\2\2\2\26\31\3\2\2"+
		"\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2"+
		"\3\33\3\3\2\2\2\34#\5\6\4\2\35#\5\b\5\2\36#\5\n\6\2\37#\5\f\7\2 #\5\16"+
		"\b\2!#\7\17\2\2\"\34\3\2\2\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2\2\""+
		" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\3\2\2%*\7\f\2\2&\'\7\4\2\2\')\7\f"+
		"\2\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-\60\7"+
		"\5\2\2./\7\6\2\2/\61\5\20\t\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2"+
		"\62\63\b\4\1\2\63\7\3\2\2\2\64\65\7\3\2\2\65:\7\f\2\2\66\67\7\4\2\2\67"+
		"9\7\f\2\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2"+
		"\2=@\7\7\2\2>?\7\6\2\2?A\5\20\t\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\5"+
		"\1\2C\t\3\2\2\2DE\7\f\2\2EF\7\b\2\2FG\5\20\t\2GH\b\6\1\2H\13\3\2\2\2I"+
		"J\7\f\2\2JK\7\6\2\2KL\5\20\t\2L\r\3\2\2\2MN\7\t\2\2NO\5\20\t\2OP\b\b\1"+
		"\2P\17\3\2\2\2QR\b\t\1\2RS\7\n\2\2ST\5\20\t\2TU\7\13\2\2UV\b\t\1\2V^\3"+
		"\2\2\2WX\7\f\2\2X^\b\t\1\2YZ\7\20\2\2Z^\b\t\1\2[\\\7\r\2\2\\^\b\t\1\2"+
		"]Q\3\2\2\2]W\3\2\2\2]Y\3\2\2\2][\3\2\2\2^f\3\2\2\2_`\f\6\2\2`a\7\16\2"+
		"\2ab\5\20\t\7bc\b\t\1\2ce\3\2\2\2d_\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2g\21\3\2\2\2hf\3\2\2\2\n\27\"*\60:@]f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}