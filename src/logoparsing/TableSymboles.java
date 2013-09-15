package logoparsing;

import java.util.LinkedList;

import org.antlr.v4.runtime.misc.Pair;

/*TODO : CHANGER AVEC UNE PILE DE PAIR*/
public class TableSymboles {
	private LinkedList<Pair<String, Double>> maListe = new LinkedList<Pair<String, Double>>();
	private LinkedList<Integer> indexVariable = new LinkedList<Integer>();
	private int loop;

	public int getLoop() {
		return loop;
	}

	public TableSymboles() {
		super();
		indexVariable.add(0);
	}

	public void setLoop(int i) {
		loop = i;
	}

	private void addValue(String s, Double val) {
		maListe.add(new Pair<String, Double>(s, val));
	}

	private void addGlobaleValue(String s, Double val) {
		maListe.addFirst(new Pair<String, Double>(s, val));
		int j;
		for (int i = 1; i < indexVariable.size(); i++) {
			Integer c = indexVariable.get(i);
			c++;
		}
	}

	/*
	 * public Pair<String,Double> rechercheLocale(String s){
	 * if(estDansFunction){ Pair<String,Double> a; for(int
	 * i=indexVariable;i<maListe.size();i++){ if((a=maListe.get(i)).a.equals(s))
	 * return a; } } return null; } public Pair<String,Double>
	 * rechercheGlobale(String s){ Pair <String,Double> a; for(int
	 * i=0;i<indexVariable;i++) if((a=maListe.get(i)).a.equals(s)) return a;
	 * return null; }
	 */
	public Pair<String, Double> rechercheAux(String s, int i) {
		Pair<String, Double> a = null;
		int cpt = indexVariable.size() - 1;
		int limit1, limit2;
		
		limit2 = maListe.size();

		while (cpt >= 0) {
			limit1 = indexVariable.get(cpt);
			
			for (int j = limit1; j < limit2; j++)
			{
				if ((a = maListe.get(j)).a.equals(s)) return a;
			}
			
			if(cpt == i) break;
			
			cpt--;
			limit2 = limit1;
		}
		
		return null;
	}

	public void entreDansProcedure() {
		indexVariable.add(maListe.size());
	}

	public void sortDeProcedure() {
		for (int i = indexVariable.getLast(); i < maListe.size(); i++)
			maListe.removeLast();
		indexVariable.removeLast();
	}

	public Pair<String, Double> recherche(String s) {
		return rechercheAux(s, 0);
	}

	public Pair<String, Double> rechercheUltraLocale(String s) {
		return rechercheAux(s, indexVariable.size() - 1);
	}

	public Double retourneRecherche(String s) {
		Pair<String, Double> tmp = recherche(s);
		if (tmp != null) {
			return tmp.b;
		}
		return null;
	}

	public void rencontreVariable(String s, Double val, boolean Locale) {
		Pair<String, Double> search;
		if (Locale == false) {
			search = recherche(s);
			if (search != null)
				search.b = val;
			else
				addGlobaleValue(s, val);
		} else {
			search = rechercheUltraLocale(s);
			if (search != null)
				search.b = val;
			else
				addValue(s, val);
		}
	}

	public void affichage() {
		for (int i = 0; i < maListe.size(); i++) {
			System.out.println("Symbole " + maListe.get(i).a);
			System.out.println("value " + maListe.get(i).b);
		}
	}
}
