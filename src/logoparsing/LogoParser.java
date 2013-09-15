// $ANTLR ANTLRVersion> LogoParser.java generatedTimestamp>

  package logoparsing;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__100=1, T__99=2, T__98=3, T__97=4, T__96=5, T__95=6, T__94=7, T__93=8, 
		T__92=9, T__91=10, T__90=11, T__89=12, T__88=13, T__87=14, T__86=15, T__85=16, 
		T__84=17, T__83=18, T__82=19, T__81=20, T__80=21, T__79=22, T__78=23, 
		T__77=24, T__76=25, T__75=26, T__74=27, T__73=28, T__72=29, T__71=30, 
		T__70=31, T__69=32, T__68=33, T__67=34, T__66=35, T__65=36, T__64=37, 
		T__63=38, T__62=39, T__61=40, T__60=41, T__59=42, T__58=43, T__57=44, 
		T__56=45, T__55=46, T__54=47, T__53=48, T__52=49, T__51=50, T__50=51, 
		T__49=52, T__48=53, T__47=54, T__46=55, T__45=56, T__44=57, T__43=58, 
		T__42=59, T__41=60, T__40=61, T__39=62, T__38=63, T__37=64, T__36=65, 
		T__35=66, T__34=67, T__33=68, T__32=69, T__31=70, T__30=71, T__29=72, 
		T__28=73, T__27=74, T__26=75, T__25=76, T__24=77, T__23=78, T__22=79, 
		T__21=80, T__20=81, T__19=82, T__18=83, T__17=84, T__16=85, T__15=86, 
		T__14=87, T__13=88, T__12=89, T__11=90, T__10=91, T__9=92, T__8=93, T__7=94, 
		T__6=95, T__5=96, T__4=97, T__3=98, T__2=99, T__1=100, T__0=101, INT=102, 
		COLOR=103, WS=104, VARIABLE_AFF=105, VARIABLE_VAL=106;
	public static final String[] tokenNames = {
		"<INVALID>", "'QUOTIENT'", "'*'", "'tg'", "'LC'", "'sqrt'", "'LEVECRAYON'", 
		"'false'", "'ent'", "'HASARD'", "'rac'", "'prod'", "'FCAP'", "'FIXECAP'", 
		"'ve'", "'fcc'", "'PROD'", "'couleur'", "')'", "'nettoie'", "'RESTE'", 
		"'produit'", "'TANTQUE'", "'AV'", "'droite'", "'QUOT'", "'quotient'", 
		"'gauche'", "'|'", "'!'", "'tan'", "'DONNE'", "'sin'", "'-'", "'floor'", 
		"'BAISSECRAYON'", "'somme'", "'REPETE'", "'VE'", "'TG'", "'true'", "'NETTOIE'", 
		"'+'", "'rec'", "'BC'", "'PRODUIT'", "'SIN'", "'DIFF'", "'cos'", "'>'", 
		"'FLOOR'", "'avance'", "'/'", "'baissecrayon'", "'COS'", "'LOOP'", "'ENT'", 
		"'&'", "'GAUCHE'", "'['", "'DROITE'", "'<'", "'!='", "'dr'", "'SI'", "'RE'", 
		"'SOMME'", "'<='", "'GA'", "'AVANCE'", "'REC'", "'recule'", "'rc'", "'FPOS'", 
		"'CAP'", "'bc'", "'DR'", "'='", "'lc'", "'FCC'", "'diff'", "'fixecap'", 
		"'hasard'", "'td'", "']'", "'fpos'", "'SQRT'", "'('", "'RC'", "'RECULE'", 
		"'levecrayon'", "'re'", "'ga'", "'fcap'", "'RAC'", "'TAN'", "'reste'", 
		"'av'", "'TD'", "'COULEUR'", "'>='", "'quot'", "INT", "COLOR", "WS", "VARIABLE_AFF", 
		"VARIABLE_VAL"
	};
	public static final int
		RULE_programme = 0, RULE_alternative = 1, RULE_bloc = 2, RULE_liste_instructions = 3, 
		RULE_instruction = 4, RULE_instruction_unaire = 5, RULE_bool = 6, RULE_expression = 7;
	public static final String[] ruleNames = {
		"programme", "alternative", "bloc", "liste_instructions", "instruction", 
		"instruction_unaire", "bool", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammeContext extends ParserRuleContext {
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProgramme(this);
			else return null;
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16); bloc();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 31) | (1L << 35) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 51) | (1L << 53) | (1L << 58) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (79 - 64)) | (1L << (81 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (89 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (93 - 64)) | (1L << (97 - 64)) | (1L << (98 - 64)) | (1L << (99 - 64)))) != 0) );
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

	public static class AlternativeContext extends ParserRuleContext {
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAlternative(this);
			else return null;
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_la = _input.LA(1);
			if (_la==59) {
				{
				setState(21); match(59);
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(22); bloc();
					}
					}
					setState(25); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 31) | (1L << 35) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 51) | (1L << 53) | (1L << 58) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (79 - 64)) | (1L << (81 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (89 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (93 - 64)) | (1L << (97 - 64)) | (1L << (98 - 64)) | (1L << (99 - 64)))) != 0) );
				setState(27); match(84);
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

	public static class BlocContext extends ParserRuleContext {
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
	 
		public BlocContext() { }
		public void copyFrom(BlocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class REPETEFORContext extends BlocContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public REPETEFORContext(BlocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterREPETEFOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitREPETEFOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitREPETEFOR(this);
			else return null;
		}
	}
	public static class IfContext extends BlocContext {
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public IfContext(BlocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitIf(this);
			else return null;
		}
	}
	public static class TantqueContext extends BlocContext {
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public TantqueContext(BlocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTantque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTantque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTantque(this);
			else return null;
		}
	}
	public static class InstrContext extends BlocContext {
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public InstrContext(BlocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitInstr(this);
			else return null;
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloc);
		int _la;
		try {
			setState(63);
			switch (_input.LA(1)) {
			case 3:
			case 4:
			case 6:
			case 12:
			case 13:
			case 14:
			case 15:
			case 17:
			case 19:
			case 23:
			case 24:
			case 27:
			case 31:
			case 35:
			case 38:
			case 39:
			case 41:
			case 43:
			case 44:
			case 51:
			case 53:
			case 58:
			case 60:
			case 63:
			case 65:
			case 68:
			case 69:
			case 70:
			case 71:
			case 73:
			case 75:
			case 76:
			case 78:
			case 79:
			case 81:
			case 83:
			case 85:
			case 89:
			case 90:
			case 91:
			case 92:
			case 93:
			case 97:
			case 98:
			case 99:
				_localctx = new InstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31); liste_instructions();
				}
				break;
			case 37:
				_localctx = new REPETEFORContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32); match(37);
				setState(33); expression(0);
				setState(34); match(59);
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35); bloc();
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 31) | (1L << 35) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 51) | (1L << 53) | (1L << 58) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (79 - 64)) | (1L << (81 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (89 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (93 - 64)) | (1L << (97 - 64)) | (1L << (98 - 64)) | (1L << (99 - 64)))) != 0) );
				setState(40); match(84);
				}
				break;
			case 64:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42); match(64);
				setState(43); bool(0);
				setState(44); match(59);
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45); bloc();
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 31) | (1L << 35) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 51) | (1L << 53) | (1L << 58) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (79 - 64)) | (1L << (81 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (89 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (93 - 64)) | (1L << (97 - 64)) | (1L << (98 - 64)) | (1L << (99 - 64)))) != 0) );
				setState(50); match(84);
				setState(51); alternative();
				}
				break;
			case 22:
				_localctx = new TantqueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(53); match(22);
				setState(54); bool(0);
				setState(55); match(59);
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56); bloc();
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 27) | (1L << 31) | (1L << 35) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 51) | (1L << 53) | (1L << 58) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (78 - 64)) | (1L << (79 - 64)) | (1L << (81 - 64)) | (1L << (83 - 64)) | (1L << (85 - 64)) | (1L << (89 - 64)) | (1L << (90 - 64)) | (1L << (91 - 64)) | (1L << (92 - 64)) | (1L << (93 - 64)) | (1L << (97 - 64)) | (1L << (98 - 64)) | (1L << (99 - 64)))) != 0) );
				setState(61); match(84);
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

	public static class Liste_instructionsContext extends ParserRuleContext {
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public Liste_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterListe_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitListe_instructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitListe_instructions(this);
			else return null;
		}
	}

	public final Liste_instructionsContext liste_instructions() throws RecognitionException {
		Liste_instructionsContext _localctx = new Liste_instructionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_liste_instructions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(65); instruction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AffectNumContext extends InstructionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE_AFF() { return getToken(LogoParser.VARIABLE_AFF, 0); }
		public AffectNumContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAffectNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAffectNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAffectNum(this);
			else return null;
		}
	}
	public static class AffectBoolContext extends InstructionContext {
		public TerminalNode VARIABLE_AFF() { return getToken(LogoParser.VARIABLE_AFF, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AffectBoolContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAffectBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAffectBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAffectBool(this);
			else return null;
		}
	}
	public static class VeContext extends InstructionContext {
		public VeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVe(this);
			else return null;
		}
	}
	public static class FposContext extends InstructionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FposContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFpos(this);
			else return null;
		}
	}
	public static class LcContext extends InstructionContext {
		public LcContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLc(this);
			else return null;
		}
	}
	public static class InstrUnaireContext extends InstructionContext {
		public Instruction_unaireContext instruction_unaire() {
			return getRuleContext(Instruction_unaireContext.class,0);
		}
		public InstrUnaireContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInstrUnaire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInstrUnaire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitInstrUnaire(this);
			else return null;
		}
	}
	public static class BcContext extends InstructionContext {
		public BcContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBc(this);
			else return null;
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		int _la;
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new AffectNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(31);
				setState(71); match(VARIABLE_AFF);
				setState(72); expression(0);
				}
				break;

			case 2:
				_localctx = new AffectBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(31);
				setState(74); match(VARIABLE_AFF);
				setState(75); bool(0);
				}
				break;

			case 3:
				_localctx = new InstrUnaireContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76); instruction_unaire();
				}
				break;

			case 4:
				_localctx = new BcContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				_la = _input.LA(1);
				if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (35 - 35)) | (1L << (44 - 35)) | (1L << (53 - 35)) | (1L << (75 - 35)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 5:
				_localctx = new LcContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==6 || _la==78 || _la==90) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 6:
				_localctx = new VeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 19) | (1L << 38) | (1L << 41))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 7:
				_localctx = new FposContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				_la = _input.LA(1);
				if ( !(_la==73 || _la==85) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(81); match(59);
				setState(82); expression(0);
				setState(83); expression(0);
				setState(84); match(84);
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

	public static class Instruction_unaireContext extends ParserRuleContext {
		public Instruction_unaireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_unaire; }
	 
		public Instruction_unaireContext() { }
		public void copyFrom(Instruction_unaireContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TgContext extends Instruction_unaireContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TgContext(Instruction_unaireContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTg(this);
			else return null;
		}
	}
	public static class FcapContext extends Instruction_unaireContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FcapContext(Instruction_unaireContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFcap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFcap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFcap(this);
			else return null;
		}
	}
	public static class TdContext extends Instruction_unaireContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TdContext(Instruction_unaireContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTd(this);
			else return null;
		}
	}
	public static class ReContext extends Instruction_unaireContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReContext(Instruction_unaireContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRe(this);
			else return null;
		}
	}
	public static class FccContext extends Instruction_unaireContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FccContext(Instruction_unaireContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFcc(this);
			else return null;
		}
	}
	public static class AvContext extends Instruction_unaireContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AvContext(Instruction_unaireContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAv(this);
			else return null;
		}
	}

	public final Instruction_unaireContext instruction_unaire() throws RecognitionException {
		Instruction_unaireContext _localctx = new Instruction_unaireContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction_unaire);
		int _la;
		try {
			setState(100);
			switch (_input.LA(1)) {
			case 23:
			case 51:
			case 69:
			case 97:
				_localctx = new AvContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==23 || _la==51 || _la==69 || _la==97) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(89); expression(0);
				}
				break;
			case 24:
			case 60:
			case 63:
			case 76:
			case 83:
			case 98:
				_localctx = new TdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 24) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (76 - 76)) | (1L << (83 - 76)) | (1L << (98 - 76)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(91); expression(0);
				}
				break;
			case 3:
			case 27:
			case 39:
			case 58:
			case 68:
			case 92:
				_localctx = new TgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 27) | (1L << 39) | (1L << 58))) != 0) || _la==68 || _la==92) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(93); expression(0);
				}
				break;
			case 43:
			case 65:
			case 70:
			case 71:
			case 89:
			case 91:
				_localctx = new ReContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				_la = _input.LA(1);
				if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (43 - 43)) | (1L << (65 - 43)) | (1L << (70 - 43)) | (1L << (71 - 43)) | (1L << (89 - 43)) | (1L << (91 - 43)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(95); expression(0);
				}
				break;
			case 15:
			case 17:
			case 79:
			case 99:
				_localctx = new FccContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==15 || _la==17 || _la==79 || _la==99) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(97); expression(0);
				}
				break;
			case 12:
			case 13:
			case 81:
			case 93:
				_localctx = new FcapContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==12 || _la==13 || _la==81 || _la==93) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(99); expression(0);
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

	public static class BoolContext extends ParserRuleContext {
		public int _p;
		public BoolContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BoolContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class ExpsDiffContext extends BoolContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpsDiffContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExpsDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExpsDiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExpsDiff(this);
			else return null;
		}
	}
	public static class AndBoolContext extends BoolContext {
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public AndBoolContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAndBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAndBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAndBool(this);
			else return null;
		}
	}
	public static class ParBoolContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ParBoolContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterParBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitParBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitParBool(this);
			else return null;
		}
	}
	public static class TrueContext extends BoolContext {
		public TrueContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTrue(this);
			else return null;
		}
	}
	public static class ExpsHiEqContext extends BoolContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpsHiEqContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExpsHiEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExpsHiEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExpsHiEq(this);
			else return null;
		}
	}
	public static class NotBoolContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NotBoolContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNotBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNotBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNotBool(this);
			else return null;
		}
	}
	public static class ExpsLoContext extends BoolContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpsLoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExpsLo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExpsLo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExpsLo(this);
			else return null;
		}
	}
	public static class OrBoolContext extends BoolContext {
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public OrBoolContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterOrBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitOrBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitOrBool(this);
			else return null;
		}
	}
	public static class VarBoolContext extends BoolContext {
		public TerminalNode VARIABLE_VAL() { return getToken(LogoParser.VARIABLE_VAL, 0); }
		public VarBoolContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVarBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVarBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVarBool(this);
			else return null;
		}
	}
	public static class ExpsEqualContext extends BoolContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpsEqualContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExpsEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExpsEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExpsEqual(this);
			else return null;
		}
	}
	public static class FalseContext extends BoolContext {
		public FalseContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFalse(this);
			else return null;
		}
	}
	public static class ExpsBoolContext extends BoolContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpsBoolContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExpsBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExpsBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExpsBool(this);
			else return null;
		}
	}
	public static class ExpsLoEqContext extends BoolContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpsLoEqContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExpsLoEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExpsLoEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExpsLoEq(this);
			else return null;
		}
	}
	public static class ExpsHiContext extends BoolContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpsHiContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExpsHi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExpsHi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExpsHi(this);
			else return null;
		}
	}

	public final BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState, _p);
		BoolContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_bool);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NotBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103); match(29);
				setState(104); bool(12);
				}
				break;

			case 2:
				{
				_localctx = new ExpsEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105); expression(0);
				setState(106); match(77);
				setState(107); expression(0);
				}
				break;

			case 3:
				{
				_localctx = new ExpsDiffContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109); expression(0);
				setState(110); match(62);
				setState(111); expression(0);
				}
				break;

			case 4:
				{
				_localctx = new ExpsLoEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113); expression(0);
				setState(114); match(67);
				setState(115); expression(0);
				}
				break;

			case 5:
				{
				_localctx = new ExpsLoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117); expression(0);
				setState(118); match(61);
				setState(119); expression(0);
				}
				break;

			case 6:
				{
				_localctx = new ExpsHiEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121); expression(0);
				setState(122); match(100);
				setState(123); expression(0);
				}
				break;

			case 7:
				{
				_localctx = new ExpsHiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125); expression(0);
				setState(126); match(49);
				setState(127); expression(0);
				}
				break;

			case 8:
				{
				_localctx = new VarBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129); match(VARIABLE_VAL);
				}
				break;

			case 9:
				{
				_localctx = new ExpsBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130); expression(0);
				}
				break;

			case 10:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131); match(40);
				}
				break;

			case 11:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132); match(7);
				}
				break;

			case 12:
				{
				_localctx = new ParBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); match(87);
				setState(134); bool(0);
				setState(135); match(18);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndBoolContext(new BoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(139);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(140); match(57);
						setState(141); bool(15);
						}
						break;

					case 2:
						{
						_localctx = new OrBoolContext(new BoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(142);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(143); match(28);
						setState(144); bool(14);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class CosinusContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CosinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCosinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCosinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitCosinus(this);
			else return null;
		}
	}
	public static class SousContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SousContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSous(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSous(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSous(this);
			else return null;
		}
	}
	public static class MultContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMult(this);
			else return null;
		}
	}
	public static class HasardContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HasardContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterHasard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitHasard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitHasard(this);
			else return null;
		}
	}
	public static class PartieEntiereContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PartieEntiereContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPartieEntiere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPartieEntiere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPartieEntiere(this);
			else return null;
		}
	}
	public static class IterationContext extends ExpressionContext {
		public IterationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitIteration(this);
			else return null;
		}
	}
	public static class DiffContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DiffContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDiff(this);
			else return null;
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(LogoParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitInt(this);
			else return null;
		}
	}
	public static class ResteContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ResteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterReste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitReste(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitReste(this);
			else return null;
		}
	}
	public static class CapContext extends ExpressionContext {
		public CapContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitCap(this);
			else return null;
		}
	}
	public static class DivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDiv(this);
			else return null;
		}
	}
	public static class TangeanteContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TangeanteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTangeante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTangeante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTangeante(this);
			else return null;
		}
	}
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAdd(this);
			else return null;
		}
	}
	public static class SommeContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SommeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSomme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSomme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSomme(this);
			else return null;
		}
	}
	public static class SinusContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSinus(this);
			else return null;
		}
	}
	public static class ParContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPar(this);
			else return null;
		}
	}
	public static class VarExpContext extends ExpressionContext {
		public TerminalNode VARIABLE_VAL() { return getToken(LogoParser.VARIABLE_VAL, 0); }
		public VarExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVarExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVarExp(this);
			else return null;
		}
	}
	public static class RacineContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RacineContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRacine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRacine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRacine(this);
			else return null;
		}
	}
	public static class QuotContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QuotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterQuot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitQuot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitQuot(this);
			else return null;
		}
	}
	public static class ProdContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProd(this);
			else return null;
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			switch (_input.LA(1)) {
			case 9:
			case 82:
				{
				_localctx = new HasardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(151);
				_la = _input.LA(1);
				if ( !(_la==9 || _la==82) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(152); expression(18);
				}
				break;
			case 5:
			case 10:
			case 72:
			case 86:
			case 88:
			case 94:
				{
				_localctx = new RacineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==5 || _la==10 || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (86 - 72)) | (1L << (88 - 72)) | (1L << (94 - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(154); expression(8);
				}
				break;
			case 8:
			case 34:
			case 50:
			case 56:
				{
				_localctx = new PartieEntiereContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 34) | (1L << 50) | (1L << 56))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(156); expression(7);
				}
				break;
			case 32:
			case 46:
				{
				_localctx = new SinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==32 || _la==46) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(158); expression(6);
				}
				break;
			case 48:
			case 54:
				{
				_localctx = new CosinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==48 || _la==54) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(160); expression(5);
				}
				break;
			case 30:
			case 95:
				{
				_localctx = new TangeanteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==30 || _la==95) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(162); expression(4);
				}
				break;
			case 55:
				{
				_localctx = new IterationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); match(55);
				}
				break;
			case 74:
				{
				_localctx = new CapContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164); match(74);
				}
				break;
			case 36:
			case 66:
				{
				_localctx = new SommeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==36 || _la==66) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(166); expression(0);
				setState(167); expression(0);
				}
				break;
			case 47:
			case 80:
				{
				_localctx = new DiffContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==47 || _la==80) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(170); expression(0);
				setState(171); expression(0);
				}
				break;
			case 11:
			case 16:
			case 21:
			case 45:
				{
				_localctx = new ProdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 16) | (1L << 21) | (1L << 45))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(174); expression(0);
				setState(175); expression(0);
				}
				break;
			case 1:
			case 25:
			case 26:
			case 101:
				{
				_localctx = new QuotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 25) | (1L << 26))) != 0) || _la==101) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(178); expression(0);
				setState(179); expression(0);
				}
				break;
			case 20:
			case 96:
				{
				_localctx = new ResteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==20 || _la==96) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(182); expression(0);
				setState(183); expression(0);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185); match(INT);
				}
				break;
			case VARIABLE_VAL:
				{
				_localctx = new VarExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186); match(VARIABLE_VAL);
				}
				break;
			case 87:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187); match(87);
				setState(188); expression(0);
				setState(189); match(18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(194); match(2);
						setState(195); expression(18);
						}
						break;

					case 2:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(197); match(52);
						setState(198); expression(17);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(200); match(42);
						setState(201); expression(16);
						}
						break;

					case 4:
						{
						_localctx = new SousContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(203); match(33);
						setState(204); expression(15);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		case 6: return bool_sempred((BoolContext)_localctx, predIndex);

		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 17 >= _localctx._p;

		case 3: return 16 >= _localctx._p;

		case 4: return 15 >= _localctx._p;

		case 5: return 14 >= _localctx._p;
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 14 >= _localctx._p;

		case 1: return 13 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\1\3j\u00d3\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2"+
		"\7\7\7\1\0\4\0\22\b\0\13\0\f\0\23\1\1\1\1\4\1\30\b\1\13\1\f\1\31\1\1\1"+
		"\1\3\1\36\b\1\1\2\1\2\1\2\1\2\1\2\4\2%\b\2\13\2\f\2&\1\2\1\2\1\2\1\2\1"+
		"\2\1\2\4\2/\b\2\13\2\f\2\60\1\2\1\2\1\2\1\2\1\2\1\2\1\2\4\2:\b\2\13\2"+
		"\f\2;\1\2\1\2\3\2@\b\2\1\3\4\3C\b\3\13\3\f\3D\1\4\1\4\1\4\1\4\1\4\1\4"+
		"\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\3\4W\b\4\1\5\1\5\1\5\1\5\1\5"+
		"\1\5\1\5\1\5\1\5\1\5\1\5\1\5\3\5e\b\5\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6"+
		"\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1"+
		"\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\3\6\u008a\b\6\1\6\1\6\1\6\1\6\1"+
		"\6\1\6\5\6\u0092\b\6\n\6\f\6\u0095\t\6\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7"+
		"\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1"+
		"\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\3\7\u00c0"+
		"\b\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\5\7\u00ce\b\7\n\7"+
		"\f\7\u00d1\t\7\1\7\0\b\0\2\4\6\b\n\f\16\0\25\4##,,\65\65KK\4\4\4\6\6N"+
		"NZZ\4\16\16\23\23&&))\2IIUU\4\27\27\63\63EEaa\6\30\30<<??LLSSbb\6\3\3"+
		"\33\33\'\'::DD\\\\\5++AAFGYY[[\4\17\17\21\21OOcc\3\f\rQQ]]\2\t\tRR\6\5"+
		"\5\n\nHHVVXX^^\4\b\b\"\"\62\6288\2  ..\2\60\60\66\66\2\36\36__\2$$BB\2"+
		"//PP\4\13\13\20\20\25\25--\3\1\1\31\32ee\2\24\24``\u00ff\0\21\1\0\0\0"+
		"\2\35\1\0\0\0\4?\1\0\0\0\6B\1\0\0\0\bV\1\0\0\0\nd\1\0\0\0\f\u0089\1\0"+
		"\0\0\16\u00bf\1\0\0\0\20\22\3\4\2\0\21\20\1\0\0\0\22\23\1\0\0\0\23\21"+
		"\1\0\0\0\23\24\1\0\0\0\24\1\1\0\0\0\25\27\5;\0\0\26\30\3\4\2\0\27\26\1"+
		"\0\0\0\30\31\1\0\0\0\31\27\1\0\0\0\31\32\1\0\0\0\32\33\1\0\0\0\33\34\5"+
		"T\0\0\34\36\1\0\0\0\35\25\1\0\0\0\35\36\1\0\0\0\36\3\1\0\0\0\37@\3\6\3"+
		"\0 !\5%\0\0!\"\3\16\7\0\"$\5;\0\0#%\3\4\2\0$#\1\0\0\0%&\1\0\0\0&$\1\0"+
		"\0\0&\'\1\0\0\0\'(\1\0\0\0()\5T\0\0)@\1\0\0\0*+\5@\0\0+,\3\f\6\0,.\5;"+
		"\0\0-/\3\4\2\0.-\1\0\0\0/\60\1\0\0\0\60.\1\0\0\0\60\61\1\0\0\0\61\62\1"+
		"\0\0\0\62\63\5T\0\0\63\64\3\2\1\0\64@\1\0\0\0\65\66\5\26\0\0\66\67\3\f"+
		"\6\0\679\5;\0\08:\3\4\2\098\1\0\0\0:;\1\0\0\0;9\1\0\0\0;<\1\0\0\0<=\1"+
		"\0\0\0=>\5T\0\0>@\1\0\0\0?\37\1\0\0\0? \1\0\0\0?*\1\0\0\0?\65\1\0\0\0"+
		"@\5\1\0\0\0AC\3\b\4\0BA\1\0\0\0CD\1\0\0\0DB\1\0\0\0DE\1\0\0\0E\7\1\0\0"+
		"\0FG\5\37\0\0GH\5i\0\0HW\3\16\7\0IJ\5\37\0\0JK\5i\0\0KW\3\f\6\0LW\3\n"+
		"\5\0MW\7\0\0\0NW\7\1\0\0OW\7\2\0\0PQ\7\3\0\0QR\5;\0\0RS\3\16\7\0ST\3\16"+
		"\7\0TU\5T\0\0UW\1\0\0\0VF\1\0\0\0VI\1\0\0\0VL\1\0\0\0VM\1\0\0\0VN\1\0"+
		"\0\0VO\1\0\0\0VP\1\0\0\0W\t\1\0\0\0XY\7\4\0\0Ye\3\16\7\0Z[\7\5\0\0[e\3"+
		"\16\7\0\\]\7\6\0\0]e\3\16\7\0^_\7\7\0\0_e\3\16\7\0`a\7\b\0\0ae\3\16\7"+
		"\0bc\7\t\0\0ce\3\16\7\0dX\1\0\0\0dZ\1\0\0\0d\\\1\0\0\0d^\1\0\0\0d`\1\0"+
		"\0\0db\1\0\0\0e\13\1\0\0\0fg\6\6\uffff\0gh\5\35\0\0h\u008a\3\f\6\0ij\3"+
		"\16\7\0jk\5M\0\0kl\3\16\7\0l\u008a\1\0\0\0mn\3\16\7\0no\5>\0\0op\3\16"+
		"\7\0p\u008a\1\0\0\0qr\3\16\7\0rs\5C\0\0st\3\16\7\0t\u008a\1\0\0\0uv\3"+
		"\16\7\0vw\5=\0\0wx\3\16\7\0x\u008a\1\0\0\0yz\3\16\7\0z{\5d\0\0{|\3\16"+
		"\7\0|\u008a\1\0\0\0}~\3\16\7\0~\177\5\61\0\0\177\u0080\3\16\7\0\u0080"+
		"\u008a\1\0\0\0\u0081\u008a\5j\0\0\u0082\u008a\3\16\7\0\u0083\u008a\5("+
		"\0\0\u0084\u008a\5\7\0\0\u0085\u0086\5W\0\0\u0086\u0087\3\f\6\0\u0087"+
		"\u0088\5\22\0\0\u0088\u008a\1\0\0\0\u0089f\1\0\0\0\u0089i\1\0\0\0\u0089"+
		"m\1\0\0\0\u0089q\1\0\0\0\u0089u\1\0\0\0\u0089y\1\0\0\0\u0089}\1\0\0\0"+
		"\u0089\u0081\1\0\0\0\u0089\u0082\1\0\0\0\u0089\u0083\1\0\0\0\u0089\u0084"+
		"\1\0\0\0\u0089\u0085\1\0\0\0\u008a\u0093\1\0\0\0\u008b\u008c\4\6\0\1\u008c"+
		"\u008d\59\0\0\u008d\u0092\3\f\6\0\u008e\u008f\4\6\1\1\u008f\u0090\5\34"+
		"\0\0\u0090\u0092\3\f\6\0\u0091\u008b\1\0\0\0\u0091\u008e\1\0\0\0\u0092"+
		"\u0095\1\0\0\0\u0093\u0091\1\0\0\0\u0093\u0094\1\0\0\0\u0094\r\1\0\0\0"+
		"\u0095\u0093\1\0\0\0\u0096\u0097\6\7\uffff\0\u0097\u0098\7\n\0\0\u0098"+
		"\u00c0\3\16\7\0\u0099\u009a\7\13\0\0\u009a\u00c0\3\16\7\0\u009b\u009c"+
		"\7\f\0\0\u009c\u00c0\3\16\7\0\u009d\u009e\7\r\0\0\u009e\u00c0\3\16\7\0"+
		"\u009f\u00a0\7\16\0\0\u00a0\u00c0\3\16\7\0\u00a1\u00a2\7\17\0\0\u00a2"+
		"\u00c0\3\16\7\0\u00a3\u00c0\5\67\0\0\u00a4\u00c0\5J\0\0\u00a5\u00a6\7"+
		"\20\0\0\u00a6\u00a7\3\16\7\0\u00a7\u00a8\3\16\7\0\u00a8\u00c0\1\0\0\0"+
		"\u00a9\u00aa\7\21\0\0\u00aa\u00ab\3\16\7\0\u00ab\u00ac\3\16\7\0\u00ac"+
		"\u00c0\1\0\0\0\u00ad\u00ae\7\22\0\0\u00ae\u00af\3\16\7\0\u00af\u00b0\3"+
		"\16\7\0\u00b0\u00c0\1\0\0\0\u00b1\u00b2\7\23\0\0\u00b2\u00b3\3\16\7\0"+
		"\u00b3\u00b4\3\16\7\0\u00b4\u00c0\1\0\0\0\u00b5\u00b6\7\24\0\0\u00b6\u00b7"+
		"\3\16\7\0\u00b7\u00b8\3\16\7\0\u00b8\u00c0\1\0\0\0\u00b9\u00c0\5f\0\0"+
		"\u00ba\u00c0\5j\0\0\u00bb\u00bc\5W\0\0\u00bc\u00bd\3\16\7\0\u00bd\u00be"+
		"\5\22\0\0\u00be\u00c0\1\0\0\0\u00bf\u0096\1\0\0\0\u00bf\u0099\1\0\0\0"+
		"\u00bf\u009b\1\0\0\0\u00bf\u009d\1\0\0\0\u00bf\u009f\1\0\0\0\u00bf\u00a1"+
		"\1\0\0\0\u00bf\u00a3\1\0\0\0\u00bf\u00a4\1\0\0\0\u00bf\u00a5\1\0\0\0\u00bf"+
		"\u00a9\1\0\0\0\u00bf\u00ad\1\0\0\0\u00bf\u00b1\1\0\0\0\u00bf\u00b5\1\0"+
		"\0\0\u00bf\u00b9\1\0\0\0\u00bf\u00ba\1\0\0\0\u00bf\u00bb\1\0\0\0\u00c0"+
		"\u00cf\1\0\0\0\u00c1\u00c2\4\7\2\1\u00c2\u00c3\5\2\0\0\u00c3\u00ce\3\16"+
		"\7\0\u00c4\u00c5\4\7\3\1\u00c5\u00c6\5\64\0\0\u00c6\u00ce\3\16\7\0\u00c7"+
		"\u00c8\4\7\4\1\u00c8\u00c9\5*\0\0\u00c9\u00ce\3\16\7\0\u00ca\u00cb\4\7"+
		"\5\1\u00cb\u00cc\5!\0\0\u00cc\u00ce\3\16\7\0\u00cd\u00c1\1\0\0\0\u00cd"+
		"\u00c4\1\0\0\0\u00cd\u00c7\1\0\0\0\u00cd\u00ca\1\0\0\0\u00ce\u00d1\1\0"+
		"\0\0\u00cf\u00cd\1\0\0\0\u00cf\u00d0\1\0\0\0\u00d0\17\1\0\0\0\u00d1\u00cf"+
		"\1\0\0\0\20\23\31\35&\60;?DVd\u0089\u0091\u0093\u00bf\u00cd\u00cf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}