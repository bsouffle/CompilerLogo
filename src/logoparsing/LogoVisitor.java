
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	T visitCosinus(LogoParser.CosinusContext ctx);

	T visitMult(LogoParser.MultContext ctx);

	T visitPartieEntiere(LogoParser.PartieEntiereContext ctx);

	T visitDiff(LogoParser.DiffContext ctx);

	T visitParBool(LogoParser.ParBoolContext ctx);

	T visitTg(LogoParser.TgContext ctx);

	T visitTd(LogoParser.TdContext ctx);

	T visitInstrUnaire(LogoParser.InstrUnaireContext ctx);

	T visitListe_instructions(LogoParser.Liste_instructionsContext ctx);

	T visitExpsLo(LogoParser.ExpsLoContext ctx);

	T visitVarBool(LogoParser.VarBoolContext ctx);

	T visitVarExp(LogoParser.VarExpContext ctx);

	T visitExpsEqual(LogoParser.ExpsEqualContext ctx);

	T visitFcap(LogoParser.FcapContext ctx);

	T visitFalse(LogoParser.FalseContext ctx);

	T visitBc(LogoParser.BcContext ctx);

	T visitQuot(LogoParser.QuotContext ctx);

	T visitSous(LogoParser.SousContext ctx);

	T visitExpsDiff(LogoParser.ExpsDiffContext ctx);

	T visitInt(LogoParser.IntContext ctx);

	T visitAlternative(LogoParser.AlternativeContext ctx);

	T visitTantque(LogoParser.TantqueContext ctx);

	T visitNotBool(LogoParser.NotBoolContext ctx);

	T visitInstr(LogoParser.InstrContext ctx);

	T visitSinus(LogoParser.SinusContext ctx);

	T visitSomme(LogoParser.SommeContext ctx);

	T visitREPETEFOR(LogoParser.REPETEFORContext ctx);

	T visitOrBool(LogoParser.OrBoolContext ctx);

	T visitProgramme(LogoParser.ProgrammeContext ctx);

	T visitFpos(LogoParser.FposContext ctx);

	T visitLc(LogoParser.LcContext ctx);

	T visitExpsHi(LogoParser.ExpsHiContext ctx);

	T visitAffectNum(LogoParser.AffectNumContext ctx);

	T visitHasard(LogoParser.HasardContext ctx);

	T visitIteration(LogoParser.IterationContext ctx);

	T visitCap(LogoParser.CapContext ctx);

	T visitAndBool(LogoParser.AndBoolContext ctx);

	T visitDiv(LogoParser.DivContext ctx);

	T visitTangeante(LogoParser.TangeanteContext ctx);

	T visitAdd(LogoParser.AddContext ctx);

	T visitRe(LogoParser.ReContext ctx);

	T visitPar(LogoParser.ParContext ctx);

	T visitRacine(LogoParser.RacineContext ctx);

	T visitAffectBool(LogoParser.AffectBoolContext ctx);

	T visitIf(LogoParser.IfContext ctx);

	T visitVe(LogoParser.VeContext ctx);

	T visitProd(LogoParser.ProdContext ctx);

	T visitReste(LogoParser.ResteContext ctx);

	T visitTrue(LogoParser.TrueContext ctx);

	T visitExpsHiEq(LogoParser.ExpsHiEqContext ctx);

	T visitAv(LogoParser.AvContext ctx);

	T visitFcc(LogoParser.FccContext ctx);

	T visitExpsBool(LogoParser.ExpsBoolContext ctx);

	T visitExpsLoEq(LogoParser.ExpsLoEqContext ctx);
}