// $ANTLR ANTLRVersion> LogoLexer.java generatedTimestamp>

  package logoparsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'QUOTIENT'", "'*'", "'tg'", "'LC'", "'sqrt'", "'LEVECRAYON'", "'false'", 
		"'ent'", "'HASARD'", "'rac'", "'prod'", "'FCAP'", "'FIXECAP'", "'ve'", 
		"'fcc'", "'PROD'", "'couleur'", "')'", "'nettoie'", "'RESTE'", "'produit'", 
		"'TANTQUE'", "'AV'", "'droite'", "'QUOT'", "'quotient'", "'gauche'", "'|'", 
		"'!'", "'tan'", "'DONNE'", "'sin'", "'-'", "'floor'", "'BAISSECRAYON'", 
		"'somme'", "'REPETE'", "'VE'", "'TG'", "'true'", "'NETTOIE'", "'+'", "'rec'", 
		"'BC'", "'PRODUIT'", "'SIN'", "'DIFF'", "'cos'", "'>'", "'FLOOR'", "'avance'", 
		"'/'", "'baissecrayon'", "'COS'", "'LOOP'", "'ENT'", "'&'", "'GAUCHE'", 
		"'['", "'DROITE'", "'<'", "'!='", "'dr'", "'SI'", "'RE'", "'SOMME'", "'<='", 
		"'GA'", "'AVANCE'", "'REC'", "'recule'", "'rc'", "'FPOS'", "'CAP'", "'bc'", 
		"'DR'", "'='", "'lc'", "'FCC'", "'diff'", "'fixecap'", "'hasard'", "'td'", 
		"']'", "'fpos'", "'SQRT'", "'('", "'RC'", "'RECULE'", "'levecrayon'", 
		"'re'", "'ga'", "'fcap'", "'RAC'", "'TAN'", "'reste'", "'av'", "'TD'", 
		"'COULEUR'", "'>='", "'quot'", "INT", "COLOR", "WS", "VARIABLE_AFF", "VARIABLE_VAL"
	};
	public static final String[] ruleNames = {
		"T__100", "T__99", "T__98", "T__97", "T__96", "T__95", "T__94", "T__93", 
		"T__92", "T__91", "T__90", "T__89", "T__88", "T__87", "T__86", "T__85", 
		"T__84", "T__83", "T__82", "T__81", "T__80", "T__79", "T__78", "T__77", 
		"T__76", "T__75", "T__74", "T__73", "T__72", "T__71", "T__70", "T__69", 
		"T__68", "T__67", "T__66", "T__65", "T__64", "T__63", "T__62", "T__61", 
		"T__60", "T__59", "T__58", "T__57", "T__56", "T__55", "T__54", "T__53", 
		"T__52", "T__51", "T__50", "T__49", "T__48", "T__47", "T__46", "T__45", 
		"T__44", "T__43", "T__42", "T__41", "T__40", "T__39", "T__38", "T__37", 
		"T__36", "T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", 
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "INT", "COLOR", "WS", "VARIABLE_AFF", 
		"VARIABLE_VAL"
	};


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

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
		case 103: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\1\2j\u0302\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2"+
		"\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34"+
		"\7\34\2\35\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\2"+
		"%\7%\2&\7&\2\'\7\'\2(\7(\2)\7)\2*\7*\2+\7+\2,\7,\2-\7-\2.\7.\2/\7/\2\60"+
		"\7\60\2\61\7\61\2\62\7\62\2\63\7\63\2\64\7\64\2\65\7\65\2\66\7\66\2\67"+
		"\7\67\28\78\29\79\2:\7:\2;\7;\2<\7<\2=\7=\2>\7>\2?\7?\2@\7@\2A\7A\2B\7"+
		"B\2C\7C\2D\7D\2E\7E\2F\7F\2G\7G\2H\7H\2I\7I\2J\7J\2K\7K\2L\7L\2M\7M\2"+
		"N\7N\2O\7O\2P\7P\2Q\7Q\2R\7R\2S\7S\2T\7T\2U\7U\2V\7V\2W\7W\2X\7X\2Y\7"+
		"Y\2Z\7Z\2[\7[\2\\\7\\\2]\7]\2^\7^\2_\7_\2`\7`\2a\7a\2b\7b\2c\7c\2d\7d"+
		"\2e\7e\2f\7f\2g\7g\2h\7h\2i\7i\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\1"+
		"\1\1\1\2\1\2\1\2\1\3\1\3\1\3\1\4\1\4\1\4\1\4\1\4\1\5\1\5\1\5\1\5\1\5\1"+
		"\5\1\5\1\5\1\5\1\5\1\5\1\6\1\6\1\6\1\6\1\6\1\6\1\7\1\7\1\7\1\7\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\b\1\t\1\t\1\t\1\t\1\n\1\n\1\n\1\n\1\n\1\13\1\13\1\13"+
		"\1\13\1\13\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\r\1\r\1\r\1\16\1\16\1\16"+
		"\1\16\1\17\1\17\1\17\1\17\1\17\1\20\1\20\1\20\1\20\1\20\1\20\1\20\1\20"+
		"\1\21\1\21\1\22\1\22\1\22\1\22\1\22\1\22\1\22\1\22\1\23\1\23\1\23\1\23"+
		"\1\23\1\23\1\24\1\24\1\24\1\24\1\24\1\24\1\24\1\24\1\25\1\25\1\25\1\25"+
		"\1\25\1\25\1\25\1\25\1\26\1\26\1\26\1\27\1\27\1\27\1\27\1\27\1\27\1\27"+
		"\1\30\1\30\1\30\1\30\1\30\1\31\1\31\1\31\1\31\1\31\1\31\1\31\1\31\1\31"+
		"\1\32\1\32\1\32\1\32\1\32\1\32\1\32\1\33\1\33\1\34\1\34\1\35\1\35\1\35"+
		"\1\35\1\36\1\36\1\36\1\36\1\36\1\36\1\37\1\37\1\37\1\37\1 \1 \1!\1!\1"+
		"!\1!\1!\1!\1\"\1\"\1\"\1\"\1\"\1\"\1\"\1\"\1\"\1\"\1\"\1\"\1\"\1#\1#\1"+
		"#\1#\1#\1#\1$\1$\1$\1$\1$\1$\1$\1%\1%\1%\1&\1&\1&\1\'\1\'\1\'\1\'\1\'"+
		"\1(\1(\1(\1(\1(\1(\1(\1(\1)\1)\1*\1*\1*\1*\1+\1+\1+\1,\1,\1,\1,\1,\1,"+
		"\1,\1,\1-\1-\1-\1-\1.\1.\1.\1.\1.\1/\1/\1/\1/\1\60\1\60\1\61\1\61\1\61"+
		"\1\61\1\61\1\61\1\62\1\62\1\62\1\62\1\62\1\62\1\62\1\63\1\63\1\64\1\64"+
		"\1\64\1\64\1\64\1\64\1\64\1\64\1\64\1\64\1\64\1\64\1\64\1\65\1\65\1\65"+
		"\1\65\1\66\1\66\1\66\1\66\1\66\1\67\1\67\1\67\1\67\18\18\19\19\19\19\1"+
		"9\19\19\1:\1:\1;\1;\1;\1;\1;\1;\1;\1<\1<\1=\1=\1=\1>\1>\1>\1?\1?\1?\1"+
		"@\1@\1@\1A\1A\1A\1A\1A\1A\1B\1B\1B\1C\1C\1C\1D\1D\1D\1D\1D\1D\1D\1E\1"+
		"E\1E\1E\1F\1F\1F\1F\1F\1F\1F\1G\1G\1G\1H\1H\1H\1H\1H\1I\1I\1I\1I\1J\1"+
		"J\1J\1K\1K\1K\1L\1L\1M\1M\1M\1N\1N\1N\1N\1O\1O\1O\1O\1O\1P\1P\1P\1P\1"+
		"P\1P\1P\1P\1Q\1Q\1Q\1Q\1Q\1Q\1Q\1R\1R\1R\1S\1S\1T\1T\1T\1T\1T\1U\1U\1"+
		"U\1U\1U\1V\1V\1W\1W\1W\1X\1X\1X\1X\1X\1X\1X\1Y\1Y\1Y\1Y\1Y\1Y\1Y\1Y\1"+
		"Y\1Y\1Y\1Z\1Z\1Z\1[\1[\1[\1\\\1\\\1\\\1\\\1\\\1]\1]\1]\1]\1^\1^\1^\1^"+
		"\1_\1_\1_\1_\1_\1_\1`\1`\1`\1a\1a\1a\1b\1b\1b\1b\1b\1b\1b\1b\1c\1c\1c"+
		"\1d\1d\1d\1d\1d\1e\1e\3e\u02c5\be\1e\1e\1e\4e\u02ca\be\13e\fe\u02cb\1"+
		"e\3e\u02cf\be\1e\1e\5e\u02d3\be\ne\fe\u02d6\te\1e\3e\u02d9\be\1e\1e\5"+
		"e\u02dd\be\ne\fe\u02e0\te\1e\1e\4e\u02e4\be\13e\fe\u02e5\3e\u02e8\be\1"+
		"f\1f\1g\4g\u02ed\bg\13g\fg\u02ee\1g\1g\1h\1h\1h\5h\u02f6\bh\nh\fh\u02f9"+
		"\th\1i\1i\1i\5i\u02fe\bi\ni\fi\u0301\ti\0j\1\1\uffff\3\2\uffff\5\3\uffff"+
		"\7\4\uffff\t\5\uffff\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff\23\n\uffff"+
		"\25\13\uffff\27\f\uffff\31\r\uffff\33\16\uffff\35\17\uffff\37\20\uffff"+
		"!\21\uffff#\22\uffff%\23\uffff\'\24\uffff)\25\uffff+\26\uffff-\27\uffff"+
		"/\30\uffff\61\31\uffff\63\32\uffff\65\33\uffff\67\34\uffff9\35\uffff;"+
		"\36\uffff=\37\uffff? \uffffA!\uffffC\"\uffffE#\uffffG$\uffffI%\uffffK"+
		"&\uffffM\'\uffffO(\uffffQ)\uffffS*\uffffU+\uffffW,\uffffY-\uffff[.\uffff"+
		"]/\uffff_\60\uffffa\61\uffffc\62\uffffe\63\uffffg\64\uffffi\65\uffffk"+
		"\66\uffffm\67\uffffo8\uffffq9\uffffs:\uffffu;\uffffw<\uffffy=\uffff{>"+
		"\uffff}?\uffff\177@\uffff\u0081A\uffff\u0083B\uffff\u0085C\uffff\u0087"+
		"D\uffff\u0089E\uffff\u008bF\uffff\u008dG\uffff\u008fH\uffff\u0091I\uffff"+
		"\u0093J\uffff\u0095K\uffff\u0097L\uffff\u0099M\uffff\u009bN\uffff\u009d"+
		"O\uffff\u009fP\uffff\u00a1Q\uffff\u00a3R\uffff\u00a5S\uffff\u00a7T\uffff"+
		"\u00a9U\uffff\u00abV\uffff\u00adW\uffff\u00afX\uffff\u00b1Y\uffff\u00b3"+
		"Z\uffff\u00b5[\uffff\u00b7\\\uffff\u00b9]\uffff\u00bb^\uffff\u00bd_\uffff"+
		"\u00bf`\uffff\u00c1a\uffff\u00c3b\uffff\u00c5c\uffff\u00c7d\uffff\u00c9"+
		"e\uffff\u00cbf\uffff\u00cdg\uffff\u00cfh\0\u00d1i\uffff\u00d3j\uffff\1"+
		"\0\16\1..\1\609\1\619\1\609\1\619\1\609\1..\1\609\1\60\67\3\t\n\r\r  "+
		"\2AZaz\3\609AZaz\2AZaz\3\609AZaz\u030e\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0"+
		"\0\0\0\7\1\0\0\0\0\t\1\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21"+
		"\1\0\0\0\0\23\1\0\0\0\0\25\1\0\0\0\0\27\1\0\0\0\0\31\1\0\0\0\0\33\1\0"+
		"\0\0\0\35\1\0\0\0\0\37\1\0\0\0\0!\1\0\0\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1"+
		"\0\0\0\0)\1\0\0\0\0+\1\0\0\0\0-\1\0\0\0\0/\1\0\0\0\0\61\1\0\0\0\0\63\1"+
		"\0\0\0\0\65\1\0\0\0\0\67\1\0\0\0\09\1\0\0\0\0;\1\0\0\0\0=\1\0\0\0\0?\1"+
		"\0\0\0\0A\1\0\0\0\0C\1\0\0\0\0E\1\0\0\0\0G\1\0\0\0\0I\1\0\0\0\0K\1\0\0"+
		"\0\0M\1\0\0\0\0O\1\0\0\0\0Q\1\0\0\0\0S\1\0\0\0\0U\1\0\0\0\0W\1\0\0\0\0"+
		"Y\1\0\0\0\0[\1\0\0\0\0]\1\0\0\0\0_\1\0\0\0\0a\1\0\0\0\0c\1\0\0\0\0e\1"+
		"\0\0\0\0g\1\0\0\0\0i\1\0\0\0\0k\1\0\0\0\0m\1\0\0\0\0o\1\0\0\0\0q\1\0\0"+
		"\0\0s\1\0\0\0\0u\1\0\0\0\0w\1\0\0\0\0y\1\0\0\0\0{\1\0\0\0\0}\1\0\0\0\0"+
		"\177\1\0\0\0\0\u0081\1\0\0\0\0\u0083\1\0\0\0\0\u0085\1\0\0\0\0\u0087\1"+
		"\0\0\0\0\u0089\1\0\0\0\0\u008b\1\0\0\0\0\u008d\1\0\0\0\0\u008f\1\0\0\0"+
		"\0\u0091\1\0\0\0\0\u0093\1\0\0\0\0\u0095\1\0\0\0\0\u0097\1\0\0\0\0\u0099"+
		"\1\0\0\0\0\u009b\1\0\0\0\0\u009d\1\0\0\0\0\u009f\1\0\0\0\0\u00a1\1\0\0"+
		"\0\0\u00a3\1\0\0\0\0\u00a5\1\0\0\0\0\u00a7\1\0\0\0\0\u00a9\1\0\0\0\0\u00ab"+
		"\1\0\0\0\0\u00ad\1\0\0\0\0\u00af\1\0\0\0\0\u00b1\1\0\0\0\0\u00b3\1\0\0"+
		"\0\0\u00b5\1\0\0\0\0\u00b7\1\0\0\0\0\u00b9\1\0\0\0\0\u00bb\1\0\0\0\0\u00bd"+
		"\1\0\0\0\0\u00bf\1\0\0\0\0\u00c1\1\0\0\0\0\u00c3\1\0\0\0\0\u00c5\1\0\0"+
		"\0\0\u00c7\1\0\0\0\0\u00c9\1\0\0\0\0\u00cb\1\0\0\0\0\u00cd\1\0\0\0\0\u00cf"+
		"\1\0\0\0\0\u00d1\1\0\0\0\0\u00d3\1\0\0\0\1\u00d5\1\0\0\0\3\u00de\1\0\0"+
		"\0\5\u00e0\1\0\0\0\7\u00e3\1\0\0\0\t\u00e6\1\0\0\0\13\u00eb\1\0\0\0\r"+
		"\u00f6\1\0\0\0\17\u00fc\1\0\0\0\21\u0100\1\0\0\0\23\u0107\1\0\0\0\25\u010b"+
		"\1\0\0\0\27\u0110\1\0\0\0\31\u0115\1\0\0\0\33\u011d\1\0\0\0\35\u0120\1"+
		"\0\0\0\37\u0124\1\0\0\0!\u0129\1\0\0\0#\u0131\1\0\0\0%\u0133\1\0\0\0\'"+
		"\u013b\1\0\0\0)\u0141\1\0\0\0+\u0149\1\0\0\0-\u0151\1\0\0\0/\u0154\1\0"+
		"\0\0\61\u015b\1\0\0\0\63\u0160\1\0\0\0\65\u0169\1\0\0\0\67\u0170\1\0\0"+
		"\09\u0172\1\0\0\0;\u0174\1\0\0\0=\u0178\1\0\0\0?\u017e\1\0\0\0A\u0182"+
		"\1\0\0\0C\u0184\1\0\0\0E\u018a\1\0\0\0G\u0197\1\0\0\0I\u019d\1\0\0\0K"+
		"\u01a4\1\0\0\0M\u01a7\1\0\0\0O\u01aa\1\0\0\0Q\u01af\1\0\0\0S\u01b7\1\0"+
		"\0\0U\u01b9\1\0\0\0W\u01bd\1\0\0\0Y\u01c0\1\0\0\0[\u01c8\1\0\0\0]\u01cc"+
		"\1\0\0\0_\u01d1\1\0\0\0a\u01d5\1\0\0\0c\u01d7\1\0\0\0e\u01dd\1\0\0\0g"+
		"\u01e4\1\0\0\0i\u01e6\1\0\0\0k\u01f3\1\0\0\0m\u01f7\1\0\0\0o\u01fc\1\0"+
		"\0\0q\u0200\1\0\0\0s\u0202\1\0\0\0u\u0209\1\0\0\0w\u020b\1\0\0\0y\u0212"+
		"\1\0\0\0{\u0214\1\0\0\0}\u0217\1\0\0\0\177\u021a\1\0\0\0\u0081\u021d\1"+
		"\0\0\0\u0083\u0220\1\0\0\0\u0085\u0226\1\0\0\0\u0087\u0229\1\0\0\0\u0089"+
		"\u022c\1\0\0\0\u008b\u0233\1\0\0\0\u008d\u0237\1\0\0\0\u008f\u023e\1\0"+
		"\0\0\u0091\u0241\1\0\0\0\u0093\u0246\1\0\0\0\u0095\u024a\1\0\0\0\u0097"+
		"\u024d\1\0\0\0\u0099\u0250\1\0\0\0\u009b\u0252\1\0\0\0\u009d\u0255\1\0"+
		"\0\0\u009f\u0259\1\0\0\0\u00a1\u025e\1\0\0\0\u00a3\u0266\1\0\0\0\u00a5"+
		"\u026d\1\0\0\0\u00a7\u0270\1\0\0\0\u00a9\u0272\1\0\0\0\u00ab\u0277\1\0"+
		"\0\0\u00ad\u027c\1\0\0\0\u00af\u027e\1\0\0\0\u00b1\u0281\1\0\0\0\u00b3"+
		"\u0288\1\0\0\0\u00b5\u0293\1\0\0\0\u00b7\u0296\1\0\0\0\u00b9\u0299\1\0"+
		"\0\0\u00bb\u029e\1\0\0\0\u00bd\u02a2\1\0\0\0\u00bf\u02a6\1\0\0\0\u00c1"+
		"\u02ac\1\0\0\0\u00c3\u02af\1\0\0\0\u00c5\u02b2\1\0\0\0\u00c7\u02ba\1\0"+
		"\0\0\u00c9\u02bd\1\0\0\0\u00cb\u02e7\1\0\0\0\u00cd\u02e9\1\0\0\0\u00cf"+
		"\u02ec\1\0\0\0\u00d1\u02f2\1\0\0\0\u00d3\u02fa\1\0\0\0\u00d5\u00d6\5Q"+
		"\0\0\u00d6\u00d7\5U\0\0\u00d7\u00d8\5O\0\0\u00d8\u00d9\5T\0\0\u00d9\u00da"+
		"\5I\0\0\u00da\u00db\5E\0\0\u00db\u00dc\5N\0\0\u00dc\u00dd\5T\0\0\u00dd"+
		"\2\1\0\0\0\u00de\u00df\5*\0\0\u00df\4\1\0\0\0\u00e0\u00e1\5t\0\0\u00e1"+
		"\u00e2\5g\0\0\u00e2\6\1\0\0\0\u00e3\u00e4\5L\0\0\u00e4\u00e5\5C\0\0\u00e5"+
		"\b\1\0\0\0\u00e6\u00e7\5s\0\0\u00e7\u00e8\5q\0\0\u00e8\u00e9\5r\0\0\u00e9"+
		"\u00ea\5t\0\0\u00ea\n\1\0\0\0\u00eb\u00ec\5L\0\0\u00ec\u00ed\5E\0\0\u00ed"+
		"\u00ee\5V\0\0\u00ee\u00ef\5E\0\0\u00ef\u00f0\5C\0\0\u00f0\u00f1\5R\0\0"+
		"\u00f1\u00f2\5A\0\0\u00f2\u00f3\5Y\0\0\u00f3\u00f4\5O\0\0\u00f4\u00f5"+
		"\5N\0\0\u00f5\f\1\0\0\0\u00f6\u00f7\5f\0\0\u00f7\u00f8\5a\0\0\u00f8\u00f9"+
		"\5l\0\0\u00f9\u00fa\5s\0\0\u00fa\u00fb\5e\0\0\u00fb\16\1\0\0\0\u00fc\u00fd"+
		"\5e\0\0\u00fd\u00fe\5n\0\0\u00fe\u00ff\5t\0\0\u00ff\20\1\0\0\0\u0100\u0101"+
		"\5H\0\0\u0101\u0102\5A\0\0\u0102\u0103\5S\0\0\u0103\u0104\5A\0\0\u0104"+
		"\u0105\5R\0\0\u0105\u0106\5D\0\0\u0106\22\1\0\0\0\u0107\u0108\5r\0\0\u0108"+
		"\u0109\5a\0\0\u0109\u010a\5c\0\0\u010a\24\1\0\0\0\u010b\u010c\5p\0\0\u010c"+
		"\u010d\5r\0\0\u010d\u010e\5o\0\0\u010e\u010f\5d\0\0\u010f\26\1\0\0\0\u0110"+
		"\u0111\5F\0\0\u0111\u0112\5C\0\0\u0112\u0113\5A\0\0\u0113\u0114\5P\0\0"+
		"\u0114\30\1\0\0\0\u0115\u0116\5F\0\0\u0116\u0117\5I\0\0\u0117\u0118\5"+
		"X\0\0\u0118\u0119\5E\0\0\u0119\u011a\5C\0\0\u011a\u011b\5A\0\0\u011b\u011c"+
		"\5P\0\0\u011c\32\1\0\0\0\u011d\u011e\5v\0\0\u011e\u011f\5e\0\0\u011f\34"+
		"\1\0\0\0\u0120\u0121\5f\0\0\u0121\u0122\5c\0\0\u0122\u0123\5c\0\0\u0123"+
		"\36\1\0\0\0\u0124\u0125\5P\0\0\u0125\u0126\5R\0\0\u0126\u0127\5O\0\0\u0127"+
		"\u0128\5D\0\0\u0128 \1\0\0\0\u0129\u012a\5c\0\0\u012a\u012b\5o\0\0\u012b"+
		"\u012c\5u\0\0\u012c\u012d\5l\0\0\u012d\u012e\5e\0\0\u012e\u012f\5u\0\0"+
		"\u012f\u0130\5r\0\0\u0130\"\1\0\0\0\u0131\u0132\5)\0\0\u0132$\1\0\0\0"+
		"\u0133\u0134\5n\0\0\u0134\u0135\5e\0\0\u0135\u0136\5t\0\0\u0136\u0137"+
		"\5t\0\0\u0137\u0138\5o\0\0\u0138\u0139\5i\0\0\u0139\u013a\5e\0\0\u013a"+
		"&\1\0\0\0\u013b\u013c\5R\0\0\u013c\u013d\5E\0\0\u013d\u013e\5S\0\0\u013e"+
		"\u013f\5T\0\0\u013f\u0140\5E\0\0\u0140(\1\0\0\0\u0141\u0142\5p\0\0\u0142"+
		"\u0143\5r\0\0\u0143\u0144\5o\0\0\u0144\u0145\5d\0\0\u0145\u0146\5u\0\0"+
		"\u0146\u0147\5i\0\0\u0147\u0148\5t\0\0\u0148*\1\0\0\0\u0149\u014a\5T\0"+
		"\0\u014a\u014b\5A\0\0\u014b\u014c\5N\0\0\u014c\u014d\5T\0\0\u014d\u014e"+
		"\5Q\0\0\u014e\u014f\5U\0\0\u014f\u0150\5E\0\0\u0150,\1\0\0\0\u0151\u0152"+
		"\5A\0\0\u0152\u0153\5V\0\0\u0153.\1\0\0\0\u0154\u0155\5d\0\0\u0155\u0156"+
		"\5r\0\0\u0156\u0157\5o\0\0\u0157\u0158\5i\0\0\u0158\u0159\5t\0\0\u0159"+
		"\u015a\5e\0\0\u015a\60\1\0\0\0\u015b\u015c\5Q\0\0\u015c\u015d\5U\0\0\u015d"+
		"\u015e\5O\0\0\u015e\u015f\5T\0\0\u015f\62\1\0\0\0\u0160\u0161\5q\0\0\u0161"+
		"\u0162\5u\0\0\u0162\u0163\5o\0\0\u0163\u0164\5t\0\0\u0164\u0165\5i\0\0"+
		"\u0165\u0166\5e\0\0\u0166\u0167\5n\0\0\u0167\u0168\5t\0\0\u0168\64\1\0"+
		"\0\0\u0169\u016a\5g\0\0\u016a\u016b\5a\0\0\u016b\u016c\5u\0\0\u016c\u016d"+
		"\5c\0\0\u016d\u016e\5h\0\0\u016e\u016f\5e\0\0\u016f\66\1\0\0\0\u0170\u0171"+
		"\5|\0\0\u01718\1\0\0\0\u0172\u0173\5!\0\0\u0173:\1\0\0\0\u0174\u0175\5"+
		"t\0\0\u0175\u0176\5a\0\0\u0176\u0177\5n\0\0\u0177<\1\0\0\0\u0178\u0179"+
		"\5D\0\0\u0179\u017a\5O\0\0\u017a\u017b\5N\0\0\u017b\u017c\5N\0\0\u017c"+
		"\u017d\5E\0\0\u017d>\1\0\0\0\u017e\u017f\5s\0\0\u017f\u0180\5i\0\0\u0180"+
		"\u0181\5n\0\0\u0181@\1\0\0\0\u0182\u0183\5-\0\0\u0183B\1\0\0\0\u0184\u0185"+
		"\5f\0\0\u0185\u0186\5l\0\0\u0186\u0187\5o\0\0\u0187\u0188\5o\0\0\u0188"+
		"\u0189\5r\0\0\u0189D\1\0\0\0\u018a\u018b\5B\0\0\u018b\u018c\5A\0\0\u018c"+
		"\u018d\5I\0\0\u018d\u018e\5S\0\0\u018e\u018f\5S\0\0\u018f\u0190\5E\0\0"+
		"\u0190\u0191\5C\0\0\u0191\u0192\5R\0\0\u0192\u0193\5A\0\0\u0193\u0194"+
		"\5Y\0\0\u0194\u0195\5O\0\0\u0195\u0196\5N\0\0\u0196F\1\0\0\0\u0197\u0198"+
		"\5s\0\0\u0198\u0199\5o\0\0\u0199\u019a\5m\0\0\u019a\u019b\5m\0\0\u019b"+
		"\u019c\5e\0\0\u019cH\1\0\0\0\u019d\u019e\5R\0\0\u019e\u019f\5E\0\0\u019f"+
		"\u01a0\5P\0\0\u01a0\u01a1\5E\0\0\u01a1\u01a2\5T\0\0\u01a2\u01a3\5E\0\0"+
		"\u01a3J\1\0\0\0\u01a4\u01a5\5V\0\0\u01a5\u01a6\5E\0\0\u01a6L\1\0\0\0\u01a7"+
		"\u01a8\5T\0\0\u01a8\u01a9\5G\0\0\u01a9N\1\0\0\0\u01aa\u01ab\5t\0\0\u01ab"+
		"\u01ac\5r\0\0\u01ac\u01ad\5u\0\0\u01ad\u01ae\5e\0\0\u01aeP\1\0\0\0\u01af"+
		"\u01b0\5N\0\0\u01b0\u01b1\5E\0\0\u01b1\u01b2\5T\0\0\u01b2\u01b3\5T\0\0"+
		"\u01b3\u01b4\5O\0\0\u01b4\u01b5\5I\0\0\u01b5\u01b6\5E\0\0\u01b6R\1\0\0"+
		"\0\u01b7\u01b8\5+\0\0\u01b8T\1\0\0\0\u01b9\u01ba\5r\0\0\u01ba\u01bb\5"+
		"e\0\0\u01bb\u01bc\5c\0\0\u01bcV\1\0\0\0\u01bd\u01be\5B\0\0\u01be\u01bf"+
		"\5C\0\0\u01bfX\1\0\0\0\u01c0\u01c1\5P\0\0\u01c1\u01c2\5R\0\0\u01c2\u01c3"+
		"\5O\0\0\u01c3\u01c4\5D\0\0\u01c4\u01c5\5U\0\0\u01c5\u01c6\5I\0\0\u01c6"+
		"\u01c7\5T\0\0\u01c7Z\1\0\0\0\u01c8\u01c9\5S\0\0\u01c9\u01ca\5I\0\0\u01ca"+
		"\u01cb\5N\0\0\u01cb\\\1\0\0\0\u01cc\u01cd\5D\0\0\u01cd\u01ce\5I\0\0\u01ce"+
		"\u01cf\5F\0\0\u01cf\u01d0\5F\0\0\u01d0^\1\0\0\0\u01d1\u01d2\5c\0\0\u01d2"+
		"\u01d3\5o\0\0\u01d3\u01d4\5s\0\0\u01d4`\1\0\0\0\u01d5\u01d6\5>\0\0\u01d6"+
		"b\1\0\0\0\u01d7\u01d8\5F\0\0\u01d8\u01d9\5L\0\0\u01d9\u01da\5O\0\0\u01da"+
		"\u01db\5O\0\0\u01db\u01dc\5R\0\0\u01dcd\1\0\0\0\u01dd\u01de\5a\0\0\u01de"+
		"\u01df\5v\0\0\u01df\u01e0\5a\0\0\u01e0\u01e1\5n\0\0\u01e1\u01e2\5c\0\0"+
		"\u01e2\u01e3\5e\0\0\u01e3f\1\0\0\0\u01e4\u01e5\5/\0\0\u01e5h\1\0\0\0\u01e6"+
		"\u01e7\5b\0\0\u01e7\u01e8\5a\0\0\u01e8\u01e9\5i\0\0\u01e9\u01ea\5s\0\0"+
		"\u01ea\u01eb\5s\0\0\u01eb\u01ec\5e\0\0\u01ec\u01ed\5c\0\0\u01ed\u01ee"+
		"\5r\0\0\u01ee\u01ef\5a\0\0\u01ef\u01f0\5y\0\0\u01f0\u01f1\5o\0\0\u01f1"+
		"\u01f2\5n\0\0\u01f2j\1\0\0\0\u01f3\u01f4\5C\0\0\u01f4\u01f5\5O\0\0\u01f5"+
		"\u01f6\5S\0\0\u01f6l\1\0\0\0\u01f7\u01f8\5L\0\0\u01f8\u01f9\5O\0\0\u01f9"+
		"\u01fa\5O\0\0\u01fa\u01fb\5P\0\0\u01fbn\1\0\0\0\u01fc\u01fd\5E\0\0\u01fd"+
		"\u01fe\5N\0\0\u01fe\u01ff\5T\0\0\u01ffp\1\0\0\0\u0200\u0201\5&\0\0\u0201"+
		"r\1\0\0\0\u0202\u0203\5G\0\0\u0203\u0204\5A\0\0\u0204\u0205\5U\0\0\u0205"+
		"\u0206\5C\0\0\u0206\u0207\5H\0\0\u0207\u0208\5E\0\0\u0208t\1\0\0\0\u0209"+
		"\u020a\5[\0\0\u020av\1\0\0\0\u020b\u020c\5D\0\0\u020c\u020d\5R\0\0\u020d"+
		"\u020e\5O\0\0\u020e\u020f\5I\0\0\u020f\u0210\5T\0\0\u0210\u0211\5E\0\0"+
		"\u0211x\1\0\0\0\u0212\u0213\5<\0\0\u0213z\1\0\0\0\u0214\u0215\5!\0\0\u0215"+
		"\u0216\5=\0\0\u0216|\1\0\0\0\u0217\u0218\5d\0\0\u0218\u0219\5r\0\0\u0219"+
		"~\1\0\0\0\u021a\u021b\5S\0\0\u021b\u021c\5I\0\0\u021c\u0080\1\0\0\0\u021d"+
		"\u021e\5R\0\0\u021e\u021f\5E\0\0\u021f\u0082\1\0\0\0\u0220\u0221\5S\0"+
		"\0\u0221\u0222\5O\0\0\u0222\u0223\5M\0\0\u0223\u0224\5M\0\0\u0224\u0225"+
		"\5E\0\0\u0225\u0084\1\0\0\0\u0226\u0227\5<\0\0\u0227\u0228\5=\0\0\u0228"+
		"\u0086\1\0\0\0\u0229\u022a\5G\0\0\u022a\u022b\5A\0\0\u022b\u0088\1\0\0"+
		"\0\u022c\u022d\5A\0\0\u022d\u022e\5V\0\0\u022e\u022f\5A\0\0\u022f\u0230"+
		"\5N\0\0\u0230\u0231\5C\0\0\u0231\u0232\5E\0\0\u0232\u008a\1\0\0\0\u0233"+
		"\u0234\5R\0\0\u0234\u0235\5E\0\0\u0235\u0236\5C\0\0\u0236\u008c\1\0\0"+
		"\0\u0237\u0238\5r\0\0\u0238\u0239\5e\0\0\u0239\u023a\5c\0\0\u023a\u023b"+
		"\5u\0\0\u023b\u023c\5l\0\0\u023c\u023d\5e\0\0\u023d\u008e\1\0\0\0\u023e"+
		"\u023f\5r\0\0\u023f\u0240\5c\0\0\u0240\u0090\1\0\0\0\u0241\u0242\5F\0"+
		"\0\u0242\u0243\5P\0\0\u0243\u0244\5O\0\0\u0244\u0245\5S\0\0\u0245\u0092"+
		"\1\0\0\0\u0246\u0247\5C\0\0\u0247\u0248\5A\0\0\u0248\u0249\5P\0\0\u0249"+
		"\u0094\1\0\0\0\u024a\u024b\5b\0\0\u024b\u024c\5c\0\0\u024c\u0096\1\0\0"+
		"\0\u024d\u024e\5D\0\0\u024e\u024f\5R\0\0\u024f\u0098\1\0\0\0\u0250\u0251"+
		"\5=\0\0\u0251\u009a\1\0\0\0\u0252\u0253\5l\0\0\u0253\u0254\5c\0\0\u0254"+
		"\u009c\1\0\0\0\u0255\u0256\5F\0\0\u0256\u0257\5C\0\0\u0257\u0258\5C\0"+
		"\0\u0258\u009e\1\0\0\0\u0259\u025a\5d\0\0\u025a\u025b\5i\0\0\u025b\u025c"+
		"\5f\0\0\u025c\u025d\5f\0\0\u025d\u00a0\1\0\0\0\u025e\u025f\5f\0\0\u025f"+
		"\u0260\5i\0\0\u0260\u0261\5x\0\0\u0261\u0262\5e\0\0\u0262\u0263\5c\0\0"+
		"\u0263\u0264\5a\0\0\u0264\u0265\5p\0\0\u0265\u00a2\1\0\0\0\u0266\u0267"+
		"\5h\0\0\u0267\u0268\5a\0\0\u0268\u0269\5s\0\0\u0269\u026a\5a\0\0\u026a"+
		"\u026b\5r\0\0\u026b\u026c\5d\0\0\u026c\u00a4\1\0\0\0\u026d\u026e\5t\0"+
		"\0\u026e\u026f\5d\0\0\u026f\u00a6\1\0\0\0\u0270\u0271\5]\0\0\u0271\u00a8"+
		"\1\0\0\0\u0272\u0273\5f\0\0\u0273\u0274\5p\0\0\u0274\u0275\5o\0\0\u0275"+
		"\u0276\5s\0\0\u0276\u00aa\1\0\0\0\u0277\u0278\5S\0\0\u0278\u0279\5Q\0"+
		"\0\u0279\u027a\5R\0\0\u027a\u027b\5T\0\0\u027b\u00ac\1\0\0\0\u027c\u027d"+
		"\5(\0\0\u027d\u00ae\1\0\0\0\u027e\u027f\5R\0\0\u027f\u0280\5C\0\0\u0280"+
		"\u00b0\1\0\0\0\u0281\u0282\5R\0\0\u0282\u0283\5E\0\0\u0283\u0284\5C\0"+
		"\0\u0284\u0285\5U\0\0\u0285\u0286\5L\0\0\u0286\u0287\5E\0\0\u0287\u00b2"+
		"\1\0\0\0\u0288\u0289\5l\0\0\u0289\u028a\5e\0\0\u028a\u028b\5v\0\0\u028b"+
		"\u028c\5e\0\0\u028c\u028d\5c\0\0\u028d\u028e\5r\0\0\u028e\u028f\5a\0\0"+
		"\u028f\u0290\5y\0\0\u0290\u0291\5o\0\0\u0291\u0292\5n\0\0\u0292\u00b4"+
		"\1\0\0\0\u0293\u0294\5r\0\0\u0294\u0295\5e\0\0\u0295\u00b6\1\0\0\0\u0296"+
		"\u0297\5g\0\0\u0297\u0298\5a\0\0\u0298\u00b8\1\0\0\0\u0299\u029a\5f\0"+
		"\0\u029a\u029b\5c\0\0\u029b\u029c\5a\0\0\u029c\u029d\5p\0\0\u029d\u00ba"+
		"\1\0\0\0\u029e\u029f\5R\0\0\u029f\u02a0\5A\0\0\u02a0\u02a1\5C\0\0\u02a1"+
		"\u00bc\1\0\0\0\u02a2\u02a3\5T\0\0\u02a3\u02a4\5A\0\0\u02a4\u02a5\5N\0"+
		"\0\u02a5\u00be\1\0\0\0\u02a6\u02a7\5r\0\0\u02a7\u02a8\5e\0\0\u02a8\u02a9"+
		"\5s\0\0\u02a9\u02aa\5t\0\0\u02aa\u02ab\5e\0\0\u02ab\u00c0\1\0\0\0\u02ac"+
		"\u02ad\5a\0\0\u02ad\u02ae\5v\0\0\u02ae\u00c2\1\0\0\0\u02af\u02b0\5T\0"+
		"\0\u02b0\u02b1\5D\0\0\u02b1\u00c4\1\0\0\0\u02b2\u02b3\5C\0\0\u02b3\u02b4"+
		"\5O\0\0\u02b4\u02b5\5U\0\0\u02b5\u02b6\5L\0\0\u02b6\u02b7\5E\0\0\u02b7"+
		"\u02b8\5U\0\0\u02b8\u02b9\5R\0\0\u02b9\u00c6\1\0\0\0\u02ba\u02bb\5>\0"+
		"\0\u02bb\u02bc\5=\0\0\u02bc\u00c8\1\0\0\0\u02bd\u02be\5q\0\0\u02be\u02bf"+
		"\5u\0\0\u02bf\u02c0\5o\0\0\u02c0\u02c1\5t\0\0\u02c1\u00ca\1\0\0\0\u02c2"+
		"\u02e8\5\60\0\0\u02c3\u02c5\5-\0\0\u02c4\u02c3\1\0\0\0\u02c4\u02c5\1\0"+
		"\0\0\u02c5\u02c6\1\0\0\0\u02c6\u02c7\5\60\0\0\u02c7\u02c9\7\0\0\0\u02c8"+
		"\u02ca\7\1\0\0\u02c9\u02c8\1\0\0\0\u02ca\u02cb\1\0\0\0\u02cb\u02c9\1\0"+
		"\0\0\u02cb\u02cc\1\0\0\0\u02cc\u02e8\1\0\0\0\u02cd\u02cf\5-\0\0\u02ce"+
		"\u02cd\1\0\0\0\u02ce\u02cf\1\0\0\0\u02cf\u02d0\1\0\0\0\u02d0\u02d4\7\2"+
		"\0\0\u02d1\u02d3\7\3\0\0\u02d2\u02d1\1\0\0\0\u02d3\u02d6\1\0\0\0\u02d4"+
		"\u02d2\1\0\0\0\u02d4\u02d5\1\0\0\0\u02d5\u02e8\1\0\0\0\u02d6\u02d4\1\0"+
		"\0\0\u02d7\u02d9\5-\0\0\u02d8\u02d7\1\0\0\0\u02d8\u02d9\1\0\0\0\u02d9"+
		"\u02da\1\0\0\0\u02da\u02de\7\4\0\0\u02db\u02dd\7\5\0\0\u02dc\u02db\1\0"+
		"\0\0\u02dd\u02e0\1\0\0\0\u02de\u02dc\1\0\0\0\u02de\u02df\1\0\0\0\u02df"+
		"\u02e1\1\0\0\0\u02e0\u02de\1\0\0\0\u02e1\u02e3\7\6\0\0\u02e2\u02e4\7\7"+
		"\0\0\u02e3\u02e2\1\0\0\0\u02e4\u02e5\1\0\0\0\u02e5\u02e3\1\0\0\0\u02e5"+
		"\u02e6\1\0\0\0\u02e6\u02e8\1\0\0\0\u02e7\u02c2\1\0\0\0\u02e7\u02c4\1\0"+
		"\0\0\u02e7\u02ce\1\0\0\0\u02e7\u02d8\1\0\0\0\u02e8\u00cc\1\0\0\0\u02e9"+
		"\u02ea\7\b\0\0\u02ea\u00ce\1\0\0\0\u02eb\u02ed\7\t\0\0\u02ec\u02eb\1\0"+
		"\0\0\u02ed\u02ee\1\0\0\0\u02ee\u02ec\1\0\0\0\u02ee\u02ef\1\0\0\0\u02ef"+
		"\u02f0\1\0\0\0\u02f0\u02f1\6g\0\0\u02f1\u00d0\1\0\0\0\u02f2\u02f3\5\""+
		"\0\0\u02f3\u02f7\7\n\0\0\u02f4\u02f6\7\13\0\0\u02f5\u02f4\1\0\0\0\u02f6"+
		"\u02f9\1\0\0\0\u02f7\u02f5\1\0\0\0\u02f7\u02f8\1\0\0\0\u02f8\u00d2\1\0"+
		"\0\0\u02f9\u02f7\1\0\0\0\u02fa\u02fb\5:\0\0\u02fb\u02ff\7\f\0\0\u02fc"+
		"\u02fe\7\r\0\0\u02fd\u02fc\1\0\0\0\u02fe\u0301\1\0\0\0\u02ff\u02fd\1\0"+
		"\0\0\u02ff\u0300\1\0\0\0\u0300\u00d4\1\0\0\0\u0301\u02ff\1\0\0\0\f\0\u02c4"+
		"\u02cb\u02ce\u02d4\u02d8\u02de\u02e5\u02e7\u02ee\u02f7\u02ff";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}