
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class LogoBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LogoVisitor<T> {
	@Override public T visitCosinus(LogoParser.CosinusContext ctx) { return visitChildren(ctx); }

	@Override public T visitMult(LogoParser.MultContext ctx) { return visitChildren(ctx); }

	@Override public T visitPartieEntiere(LogoParser.PartieEntiereContext ctx) { return visitChildren(ctx); }

	@Override public T visitDiff(LogoParser.DiffContext ctx) { return visitChildren(ctx); }

	@Override public T visitParBool(LogoParser.ParBoolContext ctx) { return visitChildren(ctx); }

	@Override public T visitTg(LogoParser.TgContext ctx) { return visitChildren(ctx); }

	@Override public T visitTd(LogoParser.TdContext ctx) { return visitChildren(ctx); }

	@Override public T visitInstrUnaire(LogoParser.InstrUnaireContext ctx) { return visitChildren(ctx); }

	@Override public T visitListe_instructions(LogoParser.Liste_instructionsContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpsLo(LogoParser.ExpsLoContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarBool(LogoParser.VarBoolContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarExp(LogoParser.VarExpContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpsEqual(LogoParser.ExpsEqualContext ctx) { return visitChildren(ctx); }

	@Override public T visitFcap(LogoParser.FcapContext ctx) { return visitChildren(ctx); }

	@Override public T visitFalse(LogoParser.FalseContext ctx) { return visitChildren(ctx); }

	@Override public T visitBc(LogoParser.BcContext ctx) { return visitChildren(ctx); }

	@Override public T visitQuot(LogoParser.QuotContext ctx) { return visitChildren(ctx); }

	@Override public T visitSous(LogoParser.SousContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpsDiff(LogoParser.ExpsDiffContext ctx) { return visitChildren(ctx); }

	@Override public T visitInt(LogoParser.IntContext ctx) { return visitChildren(ctx); }

	@Override public T visitAlternative(LogoParser.AlternativeContext ctx) { return visitChildren(ctx); }

	@Override public T visitTantque(LogoParser.TantqueContext ctx) { return visitChildren(ctx); }

	@Override public T visitNotBool(LogoParser.NotBoolContext ctx) { return visitChildren(ctx); }

	@Override public T visitInstr(LogoParser.InstrContext ctx) { return visitChildren(ctx); }

	@Override public T visitSinus(LogoParser.SinusContext ctx) { return visitChildren(ctx); }

	@Override public T visitSomme(LogoParser.SommeContext ctx) { return visitChildren(ctx); }

	@Override public T visitREPETEFOR(LogoParser.REPETEFORContext ctx) { return visitChildren(ctx); }

	@Override public T visitOrBool(LogoParser.OrBoolContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgramme(LogoParser.ProgrammeContext ctx) { return visitChildren(ctx); }

	@Override public T visitFpos(LogoParser.FposContext ctx) { return visitChildren(ctx); }

	@Override public T visitLc(LogoParser.LcContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpsHi(LogoParser.ExpsHiContext ctx) { return visitChildren(ctx); }

	@Override public T visitAffectNum(LogoParser.AffectNumContext ctx) { return visitChildren(ctx); }

	@Override public T visitHasard(LogoParser.HasardContext ctx) { return visitChildren(ctx); }

	@Override public T visitIteration(LogoParser.IterationContext ctx) { return visitChildren(ctx); }

	@Override public T visitCap(LogoParser.CapContext ctx) { return visitChildren(ctx); }

	@Override public T visitAndBool(LogoParser.AndBoolContext ctx) { return visitChildren(ctx); }

	@Override public T visitDiv(LogoParser.DivContext ctx) { return visitChildren(ctx); }

	@Override public T visitTangeante(LogoParser.TangeanteContext ctx) { return visitChildren(ctx); }

	@Override public T visitAdd(LogoParser.AddContext ctx) { return visitChildren(ctx); }

	@Override public T visitRe(LogoParser.ReContext ctx) { return visitChildren(ctx); }

	@Override public T visitPar(LogoParser.ParContext ctx) { return visitChildren(ctx); }

	@Override public T visitRacine(LogoParser.RacineContext ctx) { return visitChildren(ctx); }

	@Override public T visitAffectBool(LogoParser.AffectBoolContext ctx) { return visitChildren(ctx); }

	@Override public T visitIf(LogoParser.IfContext ctx) { return visitChildren(ctx); }

	@Override public T visitVe(LogoParser.VeContext ctx) { return visitChildren(ctx); }

	@Override public T visitProd(LogoParser.ProdContext ctx) { return visitChildren(ctx); }

	@Override public T visitReste(LogoParser.ResteContext ctx) { return visitChildren(ctx); }

	@Override public T visitTrue(LogoParser.TrueContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpsHiEq(LogoParser.ExpsHiEqContext ctx) { return visitChildren(ctx); }

	@Override public T visitAv(LogoParser.AvContext ctx) { return visitChildren(ctx); }

	@Override public T visitFcc(LogoParser.FccContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpsBool(LogoParser.ExpsBoolContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpsLoEq(LogoParser.ExpsLoEqContext ctx) { return visitChildren(ctx); }
}