// Generated from java-escape by ANTLR 4.11.1

package ag;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprAGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ADD=4, SUB=5, MUL=6, DIV=7, ID=8, INT=9, NEWLINE=10, 
		WS=11;
	public static final int
		RULE_stat = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ADD", "SUB", "MUL", "DIV", "ID", "INT", "NEWLINE", 
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  Map<String, Integer> memory = new HashMap<>();

	  int eval(int left, int right, int op) {
	    switch (op) {
	      case ADD : return left + right;
	      case SUB : return left - right;
	      case MUL : return left * right;
	      case DIV : return left / right;
	      default : return 0;
	    }
	  }

	public ExprAGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprAGParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(ExprAGParser.ID, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprAGListener ) ((ExprAGListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprAGListener ) ((ExprAGListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprAGVisitor ) return ((ExprAGVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				((StatContext)_localctx).expr = expr(0);
				setState(5);
				match(NEWLINE);
				 System.out.println(((StatContext)_localctx).expr.val); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
				((StatContext)_localctx).ID = match(ID);
				setState(9);
				match(T__0);
				setState(10);
				((StatContext)_localctx).expr = expr(0);
				setState(11);
				match(NEWLINE);
				 memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).expr.val); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public int val;
		public ExprContext left;
		public ExprContext expr;
		public Token ID;
		public Token INT;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(ExprAGParser.ID, 0); }
		public TerminalNode INT() { return getToken(ExprAGParser.INT, 0); }
		public TerminalNode MUL() { return getToken(ExprAGParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprAGParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(ExprAGParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprAGParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprAGListener ) ((ExprAGListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprAGListener ) ((ExprAGListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprAGVisitor ) return ((ExprAGVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(18);
				match(T__1);
				setState(19);
				((ExprContext)_localctx).expr = expr(0);
				setState(20);
				match(T__2);
				 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val; 
				}
				break;
			case ID:
				{
				setState(23);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).val =  memory.getOrDefault((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), 0); 
				}
				break;
			case INT:
				{
				setState(25);
				((ExprContext)_localctx).INT = match(INT);
				 ((ExprContext)_localctx).val =  (((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(29);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(30);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(31);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).val =  eval(((ExprContext)_localctx).left.val, ((ExprContext)_localctx).right.val, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0)); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(35);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(36);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(5);
						 ((ExprContext)_localctx).val =  eval(((ExprContext)_localctx).left.val, ((ExprContext)_localctx).right.val, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0)); 
						}
						break;
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b-\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001(\b"+
		"\u0001\n\u0001\f\u0001+\t\u0001\u0001\u0001\u0000\u0001\u0002\u0002\u0000"+
		"\u0002\u0000\u0002\u0001\u0000\u0006\u0007\u0001\u0000\u0004\u00050\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004"+
		"\u0005\u0003\u0002\u0001\u0000\u0005\u0006\u0005\n\u0000\u0000\u0006\u0007"+
		"\u0006\u0000\uffff\uffff\u0000\u0007\u0010\u0001\u0000\u0000\u0000\b\t"+
		"\u0005\b\u0000\u0000\t\n\u0005\u0001\u0000\u0000\n\u000b\u0003\u0002\u0001"+
		"\u0000\u000b\f\u0005\n\u0000\u0000\f\r\u0006\u0000\uffff\uffff\u0000\r"+
		"\u0010\u0001\u0000\u0000\u0000\u000e\u0010\u0005\n\u0000\u0000\u000f\u0004"+
		"\u0001\u0000\u0000\u0000\u000f\b\u0001\u0000\u0000\u0000\u000f\u000e\u0001"+
		"\u0000\u0000\u0000\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0006"+
		"\u0001\uffff\uffff\u0000\u0012\u0013\u0005\u0002\u0000\u0000\u0013\u0014"+
		"\u0003\u0002\u0001\u0000\u0014\u0015\u0005\u0003\u0000\u0000\u0015\u0016"+
		"\u0006\u0001\uffff\uffff\u0000\u0016\u001c\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005\b\u0000\u0000\u0018\u001c\u0006\u0001\uffff\uffff\u0000\u0019"+
		"\u001a\u0005\t\u0000\u0000\u001a\u001c\u0006\u0001\uffff\uffff\u0000\u001b"+
		"\u0011\u0001\u0000\u0000\u0000\u001b\u0017\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c)\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\n\u0005\u0000\u0000\u001e\u001f\u0007\u0000\u0000\u0000\u001f \u0003"+
		"\u0002\u0001\u0006 !\u0006\u0001\uffff\uffff\u0000!(\u0001\u0000\u0000"+
		"\u0000\"#\n\u0004\u0000\u0000#$\u0007\u0001\u0000\u0000$%\u0003\u0002"+
		"\u0001\u0005%&\u0006\u0001\uffff\uffff\u0000&(\u0001\u0000\u0000\u0000"+
		"\'\u001d\u0001\u0000\u0000\u0000\'\"\u0001\u0000\u0000\u0000(+\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0003"+
		"\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000\u0004\u000f\u001b\'"+
		")";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}