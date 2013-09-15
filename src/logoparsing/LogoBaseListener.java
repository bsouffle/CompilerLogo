
  package logoparsing;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class LogoBaseListener implements LogoListener {
	@Override public void enterCosinus(LogoParser.CosinusContext ctx) { }
	@Override public void exitCosinus(LogoParser.CosinusContext ctx) { }

	@Override public void enterMult(LogoParser.MultContext ctx) { }
	@Override public void exitMult(LogoParser.MultContext ctx) { }

	@Override public void enterPartieEntiere(LogoParser.PartieEntiereContext ctx) { }
	@Override public void exitPartieEntiere(LogoParser.PartieEntiereContext ctx) { }

	@Override public void enterDiff(LogoParser.DiffContext ctx) { }
	@Override public void exitDiff(LogoParser.DiffContext ctx) { }

	@Override public void enterParBool(LogoParser.ParBoolContext ctx) { }
	@Override public void exitParBool(LogoParser.ParBoolContext ctx) { }

	@Override public void enterTg(LogoParser.TgContext ctx) { }
	@Override public void exitTg(LogoParser.TgContext ctx) { }

	@Override public void enterTd(LogoParser.TdContext ctx) { }
	@Override public void exitTd(LogoParser.TdContext ctx) { }

	@Override public void enterInstrUnaire(LogoParser.InstrUnaireContext ctx) { }
	@Override public void exitInstrUnaire(LogoParser.InstrUnaireContext ctx) { }

	@Override public void enterListe_instructions(LogoParser.Liste_instructionsContext ctx) { }
	@Override public void exitListe_instructions(LogoParser.Liste_instructionsContext ctx) { }

	@Override public void enterExpsLo(LogoParser.ExpsLoContext ctx) { }
	@Override public void exitExpsLo(LogoParser.ExpsLoContext ctx) { }

	@Override public void enterVarBool(LogoParser.VarBoolContext ctx) { }
	@Override public void exitVarBool(LogoParser.VarBoolContext ctx) { }

	@Override public void enterVarExp(LogoParser.VarExpContext ctx) { }
	@Override public void exitVarExp(LogoParser.VarExpContext ctx) { }

	@Override public void enterExpsEqual(LogoParser.ExpsEqualContext ctx) { }
	@Override public void exitExpsEqual(LogoParser.ExpsEqualContext ctx) { }

	@Override public void enterFcap(LogoParser.FcapContext ctx) { }
	@Override public void exitFcap(LogoParser.FcapContext ctx) { }

	@Override public void enterFalse(LogoParser.FalseContext ctx) { }
	@Override public void exitFalse(LogoParser.FalseContext ctx) { }

	@Override public void enterBc(LogoParser.BcContext ctx) { }
	@Override public void exitBc(LogoParser.BcContext ctx) { }

	@Override public void enterQuot(LogoParser.QuotContext ctx) { }
	@Override public void exitQuot(LogoParser.QuotContext ctx) { }

	@Override public void enterSous(LogoParser.SousContext ctx) { }
	@Override public void exitSous(LogoParser.SousContext ctx) { }

	@Override public void enterExpsDiff(LogoParser.ExpsDiffContext ctx) { }
	@Override public void exitExpsDiff(LogoParser.ExpsDiffContext ctx) { }

	@Override public void enterInt(LogoParser.IntContext ctx) { }
	@Override public void exitInt(LogoParser.IntContext ctx) { }

	@Override public void enterAlternative(LogoParser.AlternativeContext ctx) { }
	@Override public void exitAlternative(LogoParser.AlternativeContext ctx) { }

	@Override public void enterTantque(LogoParser.TantqueContext ctx) { }
	@Override public void exitTantque(LogoParser.TantqueContext ctx) { }

	@Override public void enterNotBool(LogoParser.NotBoolContext ctx) { }
	@Override public void exitNotBool(LogoParser.NotBoolContext ctx) { }

	@Override public void enterInstr(LogoParser.InstrContext ctx) { }
	@Override public void exitInstr(LogoParser.InstrContext ctx) { }

	@Override public void enterSinus(LogoParser.SinusContext ctx) { }
	@Override public void exitSinus(LogoParser.SinusContext ctx) { }

	@Override public void enterSomme(LogoParser.SommeContext ctx) { }
	@Override public void exitSomme(LogoParser.SommeContext ctx) { }

	@Override public void enterREPETEFOR(LogoParser.REPETEFORContext ctx) { }
	@Override public void exitREPETEFOR(LogoParser.REPETEFORContext ctx) { }

	@Override public void enterOrBool(LogoParser.OrBoolContext ctx) { }
	@Override public void exitOrBool(LogoParser.OrBoolContext ctx) { }

	@Override public void enterProgramme(LogoParser.ProgrammeContext ctx) { }
	@Override public void exitProgramme(LogoParser.ProgrammeContext ctx) { }

	@Override public void enterFpos(LogoParser.FposContext ctx) { }
	@Override public void exitFpos(LogoParser.FposContext ctx) { }

	@Override public void enterLc(LogoParser.LcContext ctx) { }
	@Override public void exitLc(LogoParser.LcContext ctx) { }

	@Override public void enterExpsHi(LogoParser.ExpsHiContext ctx) { }
	@Override public void exitExpsHi(LogoParser.ExpsHiContext ctx) { }

	@Override public void enterAffectNum(LogoParser.AffectNumContext ctx) { }
	@Override public void exitAffectNum(LogoParser.AffectNumContext ctx) { }

	@Override public void enterHasard(LogoParser.HasardContext ctx) { }
	@Override public void exitHasard(LogoParser.HasardContext ctx) { }

	@Override public void enterIteration(LogoParser.IterationContext ctx) { }
	@Override public void exitIteration(LogoParser.IterationContext ctx) { }

	@Override public void enterCap(LogoParser.CapContext ctx) { }
	@Override public void exitCap(LogoParser.CapContext ctx) { }

	@Override public void enterAndBool(LogoParser.AndBoolContext ctx) { }
	@Override public void exitAndBool(LogoParser.AndBoolContext ctx) { }

	@Override public void enterDiv(LogoParser.DivContext ctx) { }
	@Override public void exitDiv(LogoParser.DivContext ctx) { }

	@Override public void enterTangeante(LogoParser.TangeanteContext ctx) { }
	@Override public void exitTangeante(LogoParser.TangeanteContext ctx) { }

	@Override public void enterAdd(LogoParser.AddContext ctx) { }
	@Override public void exitAdd(LogoParser.AddContext ctx) { }

	@Override public void enterRe(LogoParser.ReContext ctx) { }
	@Override public void exitRe(LogoParser.ReContext ctx) { }

	@Override public void enterPar(LogoParser.ParContext ctx) { }
	@Override public void exitPar(LogoParser.ParContext ctx) { }

	@Override public void enterRacine(LogoParser.RacineContext ctx) { }
	@Override public void exitRacine(LogoParser.RacineContext ctx) { }

	@Override public void enterAffectBool(LogoParser.AffectBoolContext ctx) { }
	@Override public void exitAffectBool(LogoParser.AffectBoolContext ctx) { }

	@Override public void enterIf(LogoParser.IfContext ctx) { }
	@Override public void exitIf(LogoParser.IfContext ctx) { }

	@Override public void enterVe(LogoParser.VeContext ctx) { }
	@Override public void exitVe(LogoParser.VeContext ctx) { }

	@Override public void enterProd(LogoParser.ProdContext ctx) { }
	@Override public void exitProd(LogoParser.ProdContext ctx) { }

	@Override public void enterReste(LogoParser.ResteContext ctx) { }
	@Override public void exitReste(LogoParser.ResteContext ctx) { }

	@Override public void enterTrue(LogoParser.TrueContext ctx) { }
	@Override public void exitTrue(LogoParser.TrueContext ctx) { }

	@Override public void enterExpsHiEq(LogoParser.ExpsHiEqContext ctx) { }
	@Override public void exitExpsHiEq(LogoParser.ExpsHiEqContext ctx) { }

	@Override public void enterAv(LogoParser.AvContext ctx) { }
	@Override public void exitAv(LogoParser.AvContext ctx) { }

	@Override public void enterFcc(LogoParser.FccContext ctx) { }
	@Override public void exitFcc(LogoParser.FccContext ctx) { }

	@Override public void enterExpsBool(LogoParser.ExpsBoolContext ctx) { }
	@Override public void exitExpsBool(LogoParser.ExpsBoolContext ctx) { }

	@Override public void enterExpsLoEq(LogoParser.ExpsLoEqContext ctx) { }
	@Override public void exitExpsLoEq(LogoParser.ExpsLoEqContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}