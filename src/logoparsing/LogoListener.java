
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoListener extends ParseTreeListener {
	void enterCosinus(LogoParser.CosinusContext ctx);
	void exitCosinus(LogoParser.CosinusContext ctx);

	void enterMult(LogoParser.MultContext ctx);
	void exitMult(LogoParser.MultContext ctx);

	void enterPartieEntiere(LogoParser.PartieEntiereContext ctx);
	void exitPartieEntiere(LogoParser.PartieEntiereContext ctx);

	void enterDiff(LogoParser.DiffContext ctx);
	void exitDiff(LogoParser.DiffContext ctx);

	void enterParBool(LogoParser.ParBoolContext ctx);
	void exitParBool(LogoParser.ParBoolContext ctx);

	void enterTg(LogoParser.TgContext ctx);
	void exitTg(LogoParser.TgContext ctx);

	void enterTd(LogoParser.TdContext ctx);
	void exitTd(LogoParser.TdContext ctx);

	void enterInstrUnaire(LogoParser.InstrUnaireContext ctx);
	void exitInstrUnaire(LogoParser.InstrUnaireContext ctx);

	void enterListe_instructions(LogoParser.Liste_instructionsContext ctx);
	void exitListe_instructions(LogoParser.Liste_instructionsContext ctx);

	void enterExpsLo(LogoParser.ExpsLoContext ctx);
	void exitExpsLo(LogoParser.ExpsLoContext ctx);

	void enterVarBool(LogoParser.VarBoolContext ctx);
	void exitVarBool(LogoParser.VarBoolContext ctx);

	void enterVarExp(LogoParser.VarExpContext ctx);
	void exitVarExp(LogoParser.VarExpContext ctx);

	void enterExpsEqual(LogoParser.ExpsEqualContext ctx);
	void exitExpsEqual(LogoParser.ExpsEqualContext ctx);

	void enterFcap(LogoParser.FcapContext ctx);
	void exitFcap(LogoParser.FcapContext ctx);

	void enterFalse(LogoParser.FalseContext ctx);
	void exitFalse(LogoParser.FalseContext ctx);

	void enterBc(LogoParser.BcContext ctx);
	void exitBc(LogoParser.BcContext ctx);

	void enterQuot(LogoParser.QuotContext ctx);
	void exitQuot(LogoParser.QuotContext ctx);

	void enterSous(LogoParser.SousContext ctx);
	void exitSous(LogoParser.SousContext ctx);

	void enterExpsDiff(LogoParser.ExpsDiffContext ctx);
	void exitExpsDiff(LogoParser.ExpsDiffContext ctx);

	void enterInt(LogoParser.IntContext ctx);
	void exitInt(LogoParser.IntContext ctx);

	void enterAlternative(LogoParser.AlternativeContext ctx);
	void exitAlternative(LogoParser.AlternativeContext ctx);

	void enterTantque(LogoParser.TantqueContext ctx);
	void exitTantque(LogoParser.TantqueContext ctx);

	void enterNotBool(LogoParser.NotBoolContext ctx);
	void exitNotBool(LogoParser.NotBoolContext ctx);

	void enterInstr(LogoParser.InstrContext ctx);
	void exitInstr(LogoParser.InstrContext ctx);

	void enterSinus(LogoParser.SinusContext ctx);
	void exitSinus(LogoParser.SinusContext ctx);

	void enterSomme(LogoParser.SommeContext ctx);
	void exitSomme(LogoParser.SommeContext ctx);

	void enterREPETEFOR(LogoParser.REPETEFORContext ctx);
	void exitREPETEFOR(LogoParser.REPETEFORContext ctx);

	void enterOrBool(LogoParser.OrBoolContext ctx);
	void exitOrBool(LogoParser.OrBoolContext ctx);

	void enterProgramme(LogoParser.ProgrammeContext ctx);
	void exitProgramme(LogoParser.ProgrammeContext ctx);

	void enterFpos(LogoParser.FposContext ctx);
	void exitFpos(LogoParser.FposContext ctx);

	void enterLc(LogoParser.LcContext ctx);
	void exitLc(LogoParser.LcContext ctx);

	void enterExpsHi(LogoParser.ExpsHiContext ctx);
	void exitExpsHi(LogoParser.ExpsHiContext ctx);

	void enterAffectNum(LogoParser.AffectNumContext ctx);
	void exitAffectNum(LogoParser.AffectNumContext ctx);

	void enterHasard(LogoParser.HasardContext ctx);
	void exitHasard(LogoParser.HasardContext ctx);

	void enterIteration(LogoParser.IterationContext ctx);
	void exitIteration(LogoParser.IterationContext ctx);

	void enterCap(LogoParser.CapContext ctx);
	void exitCap(LogoParser.CapContext ctx);

	void enterAndBool(LogoParser.AndBoolContext ctx);
	void exitAndBool(LogoParser.AndBoolContext ctx);

	void enterDiv(LogoParser.DivContext ctx);
	void exitDiv(LogoParser.DivContext ctx);

	void enterTangeante(LogoParser.TangeanteContext ctx);
	void exitTangeante(LogoParser.TangeanteContext ctx);

	void enterAdd(LogoParser.AddContext ctx);
	void exitAdd(LogoParser.AddContext ctx);

	void enterRe(LogoParser.ReContext ctx);
	void exitRe(LogoParser.ReContext ctx);

	void enterPar(LogoParser.ParContext ctx);
	void exitPar(LogoParser.ParContext ctx);

	void enterRacine(LogoParser.RacineContext ctx);
	void exitRacine(LogoParser.RacineContext ctx);

	void enterAffectBool(LogoParser.AffectBoolContext ctx);
	void exitAffectBool(LogoParser.AffectBoolContext ctx);

	void enterIf(LogoParser.IfContext ctx);
	void exitIf(LogoParser.IfContext ctx);

	void enterVe(LogoParser.VeContext ctx);
	void exitVe(LogoParser.VeContext ctx);

	void enterProd(LogoParser.ProdContext ctx);
	void exitProd(LogoParser.ProdContext ctx);

	void enterReste(LogoParser.ResteContext ctx);
	void exitReste(LogoParser.ResteContext ctx);

	void enterTrue(LogoParser.TrueContext ctx);
	void exitTrue(LogoParser.TrueContext ctx);

	void enterExpsHiEq(LogoParser.ExpsHiEqContext ctx);
	void exitExpsHiEq(LogoParser.ExpsHiEqContext ctx);

	void enterAv(LogoParser.AvContext ctx);
	void exitAv(LogoParser.AvContext ctx);

	void enterFcc(LogoParser.FccContext ctx);
	void exitFcc(LogoParser.FccContext ctx);

	void enterExpsBool(LogoParser.ExpsBoolContext ctx);
	void exitExpsBool(LogoParser.ExpsBoolContext ctx);

	void enterExpsLoEq(LogoParser.ExpsLoEqContext ctx);
	void exitExpsLoEq(LogoParser.ExpsLoEqContext ctx);
}