
public class Application3 {

	public static void main(String[] args) {
		
		Player player1 = new Player("Edward", 0, 0);
		Player player2 = new Player("Alphonse", 0, 0);
		Player player3 = new Player("Bradley", 0, 0);
		Player player4 = new Player("Scar", 0, 0);
		Match tourney = new Match(player1, player2, player3, player4, 5, 3);
		
		System.out.println("|| DEMI-FINALES ||");
		System.out.println(tourney.getP1().getName() + " vs " + tourney.getP2().getName() + "\n");
		
		while ((tourney.getP1().getScore() < tourney.getVictoryScore() && tourney.getP2().getScore() < tourney.getVictoryScore())
				&& (tourney.getP1().getAlternativeScore() < tourney.getChainOfSixScore() && tourney.getP2().getAlternativeScore() < tourney.getChainOfSixScore())) {
			int a = tourney.getP1().diceRoll();
			int b = tourney.getP2().diceRoll();
			
			if(a < b) {
				tourney.getP2().optainPoint();
			} else if (a > b){
				tourney.getP1().optainPoint();
			} else {
				tourney.getP1().optainPoint();
				tourney.getP2().optainPoint();
			}
			
			if(a == 6 || b == 6) {
				if(a == 6) {
					tourney.getP1().optainAlternativePoint();
				} else if (b == 6) {
					tourney.getP2().optainAlternativePoint();
				} else {
					tourney.getP1().optainAlternativePoint();
					tourney.getP2().optainAlternativePoint();
				}
			}
		
			System.out.println("|| Round " + tourney.getRoundNumber() + " || \n");
			System.out.println("P1 Score: " + tourney.getP1().getScore());
			System.out.println("P2 Score: " + tourney.getP2().getScore());
			System.out.println("P1 Chaine de six score: " + tourney.getP1().getAlternativeScore());
			System.out.println("P2 Chaine de six score: " + tourney.getP2().getAlternativeScore() + "\n");	
			tourney.goToNextRound();
		}
		
		// Essayer avec un Switch plus tard
		if((tourney.getP1().getScore() > tourney.getP2().getScore() && tourney.getP1().getScore() == tourney.getVictoryScore()) || 
			(tourney.getP1().getAlternativeScore() > tourney.getP2().getAlternativeScore() && tourney.getP1().getAlternativeScore() == tourney.getChainOfSixScore())) {
			System.out.println(tourney.getP1().getName() + " gagne ! \n \n");
		} else if((tourney.getP1().getScore() < tourney.getP2().getScore() && tourney.getP2().getScore() == tourney.getVictoryScore()) || 
			(tourney.getP1().getAlternativeScore() < tourney.getP2().getAlternativeScore() && tourney.getP2().getAlternativeScore() == tourney.getChainOfSixScore())) {
			System.out.println(tourney.getP2().getName() + " gagne ! \n \n");
		} else {
			System.out.println("Aucun gagnant ! \n \n");
		}
		
		tourney.restartRoundCounter();
		
		System.out.println("|| DEMI-FINALES ||");
		System.out.println(tourney.getP3().getName() + " vs " + tourney.getP4().getName() + "\n");
		
		while ((tourney.getP3().getScore() < tourney.getVictoryScore() && tourney.getP4().getScore() < tourney.getVictoryScore())
				&& (tourney.getP3().getAlternativeScore() < tourney.getChainOfSixScore() && tourney.getP4().getAlternativeScore() < tourney.getChainOfSixScore())) {
			int c = tourney.getP3().diceRoll();
			int d = tourney.getP4().diceRoll();
			
			if(c < d) {
				tourney.getP4().optainPoint();
			} else if (c > d){
				tourney.getP3().optainPoint();
			} else {
				tourney.getP3().optainPoint();
				tourney.getP4().optainPoint();
			}
			
			if(c == 6 || d == 6) {
				if(c == 6) {
					tourney.getP3().optainAlternativePoint();
				} else if (d == 6) {
					tourney.getP4().optainAlternativePoint();
				} else {
					tourney.getP3().optainAlternativePoint();
					tourney.getP4().optainAlternativePoint();
				}
			}
		
			System.out.println("|| Round " + tourney.getRoundNumber() + " || \n");
			System.out.println("P3 Score: " + tourney.getP3().getScore());
			System.out.println("P4 Score: " + tourney.getP4().getScore());
			System.out.println("P3 Chaine de six score: " + tourney.getP3().getAlternativeScore());
			System.out.println("P4 Chaine de six score: " + tourney.getP4().getAlternativeScore() + "\n");	
			tourney.goToNextRound();
		}
		
		// Essayer avec un Switch plus tard
		if((tourney.getP3().getScore() > tourney.getP4().getScore() && tourney.getP3().getScore() == tourney.getVictoryScore()) || 
			(tourney.getP3().getAlternativeScore() > tourney.getP4().getAlternativeScore() && tourney.getP3().getAlternativeScore() == tourney.getChainOfSixScore())) {
			System.out.println(tourney.getP3().getName() + " gagne !");
		} else if((tourney.getP3().getScore() < tourney.getP4().getScore() && tourney.getP4().getScore() == tourney.getVictoryScore()) || 
			(tourney.getP3().getAlternativeScore() < tourney.getP4().getAlternativeScore() && tourney.getP4().getAlternativeScore() == tourney.getChainOfSixScore())) {
			System.out.println(tourney.getP4().getName() + " gagne !");
		} else {
			System.out.println("Aucun gagnant !");
		}
		
		/* TO-DO: Faire la partie des finales */
		
	}

}
