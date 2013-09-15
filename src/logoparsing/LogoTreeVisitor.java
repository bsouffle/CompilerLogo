package logoparsing;

import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import logogui.Log;
import logogui.Traceur;
import logoparsing.LogoParser.AvContext;
import logoparsing.LogoParser.TdContext;
import logoparsing.LogoParser.TgContext;

public class LogoTreeVisitor extends LogoBaseVisitor<Double> {
	TableSymboles symboles = new TableSymboles();
	Traceur traceur;
	ParseTreeProperty<Double> atts = new ParseTreeProperty<Double>();

	public LogoTreeVisitor() {
		super();
	}

	public void initialize(java.awt.Graphics g) {
		traceur = new Traceur();
		traceur.setGraphics(g);
	}

	public void setAttValue(ParseTree node, double value) {
		atts.put(node, value);
	}

	public Double getAttValue(ParseTree node) {
		return atts.get(node);
	}

	@Override
	public Double visitAv(AvContext ctx) {
		visitChildren(ctx);
		traceur.avance(getAttValue(ctx.expression()));
		return 0.0;
	}

	@Override
	public Double visitTd(TdContext ctx) {
		visitChildren(ctx);
		traceur.td(getAttValue(ctx.expression()));
		return 0.0;
	}

	@Override
	public Double visitTg(TgContext ctx) {
		visitChildren(ctx);
		traceur.tg(getAttValue(ctx.expression()));
		return 0.0;
	}

	@Override
	public Double visitRe(LogoParser.ReContext ctx) {
		visitChildren(ctx);
		traceur.recule(getAttValue(ctx.expression()));
		return 0.0;
	}

	@Override
	public Double visitFcc(LogoParser.FccContext ctx) {
		visitChildren(ctx);
		traceur.fcc(getAttValue(ctx.expression()).intValue());
		return 0.0;
	}

	@Override
	public Double visitBc(LogoParser.BcContext ctx) {
		visitChildren(ctx);
		traceur.bc();
		return 0.0;
	}

	@Override
	public Double visitLc(LogoParser.LcContext ctx) {
		visitChildren(ctx);
		traceur.lc();
		return 0.0;
	}

	@Override
	public Double visitFpos(LogoParser.FposContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression().get(0));
		Double y = getAttValue(ctx.expression().get(1));
		traceur.fpos(x, y);
		return 0.0;
	}

	@Override
	public Double visitVe(LogoParser.VeContext ctx) {
		visitChildren(ctx);
		traceur.ve();
		return 0.0;
	}

	@Override
	public Double visitSous(LogoParser.SousContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression().get(0));
		Double y = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, x - y);
		return 0.0;
	}

	@Override
	public Double visitMult(LogoParser.MultContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression().get(0));
		Double y = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, x * y);
		return 0.0;
	}

	@Override
	public Double visitInt(LogoParser.IntContext ctx) {
		double x = Double.parseDouble(ctx.getText());
		setAttValue(ctx, x);
		return 0.0;
	}

	@Override
	public Double visitDiv(LogoParser.DivContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression().get(0));
		Double y = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, x / y);
		return 0.0;
	}

	@Override
	public Double visitAdd(LogoParser.AddContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression().get(0));
		Double y = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, x + y);
		return 0.0;
	}

	@Override
	public Double visitPar(LogoParser.ParContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression());
		setAttValue(ctx, x);
		return 0.0;
	}

	@Override
	public Double visitParBool(LogoParser.ParBoolContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.bool());
		setAttValue(ctx, v);
		return 0.0;
	}

	@Override
	public Double visitAndBool(LogoParser.AndBoolContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.bool().get(0));
		Double w = getAttValue(ctx.bool().get(1));
		setAttValue(ctx, (v == 1 && w == 1) ? 1 : 0);
		return 0.0;
	}

	@Override
	public Double visitExpsLo(LogoParser.ExpsLoContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.expression().get(0));
		Double w = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, (v.compareTo(w) < 0) ? 1 : 0);
		return 0.0;
	}

	@Override
	public Double visitExpsEqual(LogoParser.ExpsEqualContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.expression().get(0));
		Double w = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, (v.compareTo(w) == 0) ? 1 : 0);
		return 0.0;
	}

	@Override
	public Double visitFalse(LogoParser.FalseContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx, 0);
		return 0.0;
	}

	@Override
	public Double visitExpsDiff(LogoParser.ExpsDiffContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.expression().get(0));
		Double w = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, (v != w) ? 1 : 0);
		return 0.0;
	}

	@Override
	public Double visitTrue(LogoParser.TrueContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx, 1);
		return 0.0;
	}

	@Override
	public Double visitExpsHiEq(LogoParser.ExpsHiEqContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.expression().get(0));
		Double w = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, (v.compareTo(w) >= 0) ? 1 : 0);
		return 0.0;
	}

	@Override
	public Double visitNotBool(LogoParser.NotBoolContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.bool());
		setAttValue(ctx, 1 - v);
		return 0.0;
	}

	@Override
	public Double visitOrBool(LogoParser.OrBoolContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.bool().get(0));
		Double w = getAttValue(ctx.bool().get(1));
		setAttValue(ctx, (v == 0 && w == 0) ? 0 : 1);
		return 0.0;
	}

	@Override
	public Double visitExpsBool(LogoParser.ExpsBoolContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.expression());
		setAttValue(ctx, (v != 0) ? 1 : 0);
		return 0.0;
	}

	@Override
	public Double visitExpsLoEq(LogoParser.ExpsLoEqContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.expression().get(0));
		Double w = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, (v.compareTo(w) <= 0) ? 1 : 0);
		return 0.0;
	}

	@Override
	public Double visitExpsHi(LogoParser.ExpsHiContext ctx) {
		visitChildren(ctx);
		Double v = getAttValue(ctx.expression().get(0));
		Double w = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, (v.compareTo(w) > 0) ? 1 : 0);
		return 0.0;
	}

	@Override
	public Double visitAffectNum(LogoParser.AffectNumContext ctx) {
		visitChildren(ctx);
		String s = ctx.VARIABLE_AFF().getText();
		Double val = getAttValue(ctx.expression());
		symboles.rencontreVariable(s.split("\"")[1], val, false);
		return 0.0;
	}

	@Override
	public Double visitVarBool(LogoParser.VarBoolContext ctx) {
		visitChildren(ctx);
		String s = ctx.VARIABLE_VAL().getText();
		Double val = symboles.retourneRecherche(s.split(":")[1]);
		setAttValue(ctx, val);
		return 0.0;
	}

	@Override
	public Double visitVarExp(LogoParser.VarExpContext ctx) {
		String s = ctx.VARIABLE_VAL().getText();
		Double val = symboles.retourneRecherche(s.split(":")[1]);
		setAttValue(ctx, val);
		return 0.0;
	}

	@Override
	public Double visitAffectBool(LogoParser.AffectBoolContext ctx) {
		visitChildren(ctx);
		String s = ctx.VARIABLE_AFF().getText();
		Double val = (double) getAttValue(ctx.bool());
		symboles.rencontreVariable(s.split("\"")[1], val, false);
		return 0.0;
	}

	@Override
	public Double visitHasard(LogoParser.HasardContext ctx) {
		visitChildren(ctx);
		Double a = getAttValue(ctx.expression());
		int b = (int) Math.floor(Math.random() * (a + 1));
		setAttValue(ctx, b);
		return 0.0;
	}

	@Override
	public Double visitListe_instructions(
			LogoParser.Liste_instructionsContext ctx) {
		for (int i = 0; i < ctx.instruction().size(); i++)
			visit(ctx.instruction(i));
		return 0.0;
	}

	@Override
	public Double visitIf(LogoParser.IfContext ctx) {
		visit(ctx.bool());
		Double a = getAttValue(ctx.bool());
		if (a != 0)
			for (int i = 0; i < ctx.bloc().size(); i++) {
				visit(ctx.bloc(i));
			}
		else {
			if (ctx.alternative() != null)
				visit(ctx.alternative());
		}
		
		return 0.0;
	}

	@Override
	public Double visitTantque(LogoParser.TantqueContext ctx) {
		visit(ctx.bool());
		while (getAttValue(ctx.bool()) != 0) {
			for (int i = 0; i < ctx.bloc().size(); i++)
				visit(ctx.bloc(i));
			visit(ctx.bool());
		}
		
		return 0.0;
	}

	@Override
	public Double visitREPETEFOR(LogoParser.REPETEFORContext ctx) {
		visit(ctx.expression());
		for (int i = 1; i <= getAttValue(ctx.expression()); i++) {
			symboles.setLoop(i);
			for (int j = 0; j < ctx.bloc().size(); j++)
				visit(ctx.bloc(j));
		}
		return 0.0;
	}

	@Override
	public Double visitInstr(LogoParser.InstrContext ctx) {
		visitChildren(ctx);
		
		return 0.0;
	}

	@Override
	public Double visitIteration(LogoParser.IterationContext ctx) {
		setAttValue(ctx, symboles.getLoop());
		return 0.0;
	}


	@Override
	public Double visitProgramme(LogoParser.ProgrammeContext ctx) {
		visitChildren(ctx);
		return 0.0;
	}

	@Override
	public Double visitFcap(LogoParser.FcapContext ctx) {
		visitChildren(ctx);
		traceur.setAngle(getAttValue(ctx.expression()).intValue());
		return 0.0;
	}

	@Override
	public Double visitCap(LogoParser.CapContext ctx) {
		setAttValue(ctx, traceur.getAngle());
		return 0.0;
	}

	@Override
	public Double visitPartieEntiere(LogoParser.PartieEntiereContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx, getAttValue(ctx.expression()).intValue());
		return 0.0;
	}

	@Override
	public Double visitDiff(LogoParser.DiffContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression().get(0));
		Double y = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, x - y);
		return 0.0;
	}

	@Override
	public Double visitInstrUnaire(LogoParser.InstrUnaireContext ctx) {
		visit(ctx.instruction_unaire());
		return 0.0;
	}

	@Override
	public Double visitQuot(LogoParser.QuotContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression().get(0));
		Double y = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, x / y);
		return 0.0;
	}

	@Override
	public Double visitSomme(LogoParser.SommeContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression().get(0));
		Double y = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, x + y);
		return 0.0;
	}

	@Override
	public Double visitRacine(LogoParser.RacineContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression());
		;
		setAttValue(ctx, Math.sqrt(x));
		return 0.0;
	}

	@Override
	public Double visitProd(LogoParser.ProdContext ctx) {
		visitChildren(ctx);
		Double x = getAttValue(ctx.expression().get(0));
		Double y = getAttValue(ctx.expression().get(1));
		setAttValue(ctx, x * y);
		return 0.0;
	}

	@Override
	public Double visitReste(LogoParser.ResteContext ctx) {
		visitChildren(ctx);
		int x = getAttValue(ctx.expression().get(0)).intValue();
		int y = getAttValue(ctx.expression().get(1)).intValue();
		int r = x % y;
		if (r < 0)
			r += y;
		setAttValue(ctx, r);
		return 0.0;
	}

	@Override
	public Double visitCosinus(LogoParser.CosinusContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx, Math.cos(getAttValue(ctx.expression())));
		return 0.0;
	}

	@Override
	public Double visitSinus(LogoParser.SinusContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx, Math.sin(getAttValue(ctx.expression())));
		return 0.0;
	}

	@Override
	public Double visitTangeante(LogoParser.TangeanteContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx, Math.tan(getAttValue(ctx.expression())));
		return 0.0;
	}
}
