
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner iterations = new Scanner(System.in);
		Scanner value = new Scanner(System.in);
		Random randomIterations = new Random();
		Random randomValues = new Random();
		
		// Créer objet à partir du tableau et afficher son contenu
		int[] tableau = {3, 10, 65, 34, 28, 127};
		Scoring poll = new Scoring(tableau);
		poll.getEverything();
		
		
		// Trier poll et afficher contenu
		poll.getEverything();
		poll.sort();
		
		
		// Inverser poll et afficher son contenu
		poll.getEverything();
		poll.reverse();
		
		
		// Ajouter scores avec Scanner
		System.out.print("Entrez un nombre n: ");
		int numberOfValues = iterations.nextInt();
		
		for (int i = 0; i < numberOfValues; i++) {
			System.out.print("Entrez une valeur: ");
			int userInput = value.nextInt();
			poll.addScore(userInput);
		}
		
		poll.getEverything();
		
		
		// Ajouter scores avec Random
		long start = System.currentTimeMillis();
		int numberOfRandomValues = randomIterations.nextInt(10000);
		
		for (int i = 0; i < numberOfRandomValues; i++) {
			int number = randomValues.nextInt(100);
			poll.addScore(number);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + " ms");
		
		
		// Retirer des scores supérieurs à 50
		for(int i = 0; i < poll.size(); i++) {
			poll.removeMoreThan(50);
		}
		poll.getEverything();
	}

}
