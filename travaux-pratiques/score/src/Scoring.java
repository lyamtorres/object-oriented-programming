
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Collections;

public class Scoring {
	private ArrayList<Integer> scores; // Liste de scores
	
	public Scoring() {
		scores = new ArrayList<Integer>();
	}
	
	/* public Scoring(ArrayList<Integer> scores) {
		this.scores = scores;
	} */
	
	public Scoring(int[] tab) {
		scores = new ArrayList<Integer>();
		for(int i = 0; i < tab.length; i++) {
			scores.add(tab[i]);
		}
	}
	
	// Affiche la taille de la liste
	public int size() {
		return scores.size();
	}
	
	// Affiche la valeur se trouvant à un indice donné de la liste 
	public int get(int i) {
		return scores.get(i);
	}
	
	// Affiche toutes les valeurs de la liste
	public void getEverything() {
		for(int i = 0; i < scores.size(); i++) {
			if(i == 0) {
				System.out.print("[" + scores.get(i) + ", ");
			} else if (i == scores.size() - 1) {
				System.out.print( scores.get(i) + "] \n");
			} else {
				System.out.print(scores.get(i) + ", ");
			}
		}
	}
	
	// Ajoute un score à la fin de la liste
	public void addScore(int s) {
		if(s >= 0 && s <= 100) {
			scores.add(s);
		} else {
			System.out.println("Votre score doit se trouver entre 0 et 100");
		}
	}
	
	// Vide entièrement la liste
	public void clear() {
		scores.clear();
	}
	
	// Retourne le nombre de scores supérieurs ou eǵaux à s
	public int countMoreThan(int s) {
		int counter = 0;
		
		for(int i = 0; i < scores.size(); i++) {
			if(scores.get(i) >= s) {
				counter++;
			}
		}
		return counter;
	}
	
	// Retire le nombre de scores supérieurs ou égaux à s (Attention! Les indices changent quand une valeur est enlevée)
	public void removeMoreThan(int s) {
		int i = 0;
		
		while(i < scores.size()) {
			if(scores.get(i) >= s) {
				scores.remove(i);
			} else {
				i++;
			}
		}
	}
	
	// Retourne une liste en tant que tableau de même taille
	public int[] toArray() {
		int tabSize = scores.size();
		int[] tab;
		
		tab = new int[tabSize];
		for(int i = 0; i < scores.size(); i++) {
			tab[i] = scores.get(i);
		}
		return tab;
	}
	
	// Retourne la valeur moyenne des scores dans une liste
	public double avgScore() {
		double average = 0;
		
		for(int i = 0; i < scores.size(); i++) {
			average += scores.get(i);
		}
		average /= scores.size();
		return average;
	}
	
	public int minScore() {
		int minimum = scores.get(0);
		
		for(int i = 0; i < scores.size(); i++) {
			if(minimum > scores.get(i)) {
				minimum = scores.get(i);
			}
		}
		return minimum;
	}
	
	public void sort() {
		Collections.sort(scores);
		System.out.printf("%s\n", scores);
	}
	
	public void reverse() {
		Collections.sort(scores, Collections.reverseOrder());
		System.out.printf("%s\n", scores);
	}
	
	public String toString() {
		String s = "(" ;
		
		for(int i = 0; i < scores.size(); i++) {
			if(i < scores.size() - 1) {
				s += scores.get(i) + ", ";
			} else {
				s += scores.get(i);
			}
		}
		s += ")";
		return s;
	}
}
