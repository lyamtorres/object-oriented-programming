
public class Application2 {

	public static void main(String[] args) {
		
		Player player1 = new Player("Edward", 0, 0);
		Player player2 = new Player("Alphonse", 0, 0);
		Match firstMatch = new Match(player1, player2, 5, 3);
		
		while ((firstMatch.getP1().getScore() < firstMatch.getVictoryScore() && firstMatch.getP2().getScore() < firstMatch.getVictoryScore())
				&& (firstMatch.getP1().getAlternativeScore() < firstMatch.getChainOfSixScore() && firstMatch.getP2().getAlternativeScore() < firstMatch.getChainOfSixScore())) {
			int a = firstMatch.getP1().diceRoll();
			int b = firstMatch.getP2().diceRoll();
			
			if(a < b) {
				firstMatch.getP2().optainPoint();
			} else if (a > b){
				firstMatch.getP1().optainPoint();
			} else {
				firstMatch.getP1().optainPoint();
				firstMatch.getP2().optainPoint();
			}
			
			if(a == 6 || b == 6) {
				if(a == 6) {
					firstMatch.getP1().optainAlternativePoint();
				} else if (b == 6) {
					firstMatch.getP2().optainAlternativePoint();
				} else {
					firstMatch.getP1().optainAlternativePoint();
					firstMatch.getP2().optainAlternativePoint();
				}
			}

			
			System.out.println("|| ROUND " + firstMatch.getRoundNumber() + " ||");
			System.out.println("");
			System.out.println("P1 SCORE: " + firstMatch.getP1().getScore());
			System.out.println("P2 SCORE: " + firstMatch.getP2().getScore());
			System.out.println("P1 CHAIN OF SIX SCORE: " + firstMatch.getP1().getAlternativeScore());
			System.out.println("P2 CHAIN OF SIX SCORE: " + firstMatch.getP2().getAlternativeScore());
			System.out.println("");	
			System.out.println("");			
			firstMatch.goToNextRound();
		}
		
		if((firstMatch.getP1().getScore() < firstMatch.getP2().getScore()) || (firstMatch.getP1().getAlternativeScore() < firstMatch.getP2().getAlternativeScore())) {
			System.out.println("PLAYER 2 WINS!!!");
		} else if ((firstMatch.getP1().getScore() > firstMatch.getP2().getScore()) || (firstMatch.getP1().getAlternativeScore() > firstMatch.getP2().getAlternativeScore())){
			System.out.println("PLAYER 1 WINS!!!");
		} else {
			System.out.println("PLAYER 1 AND PLAYER 2 TIED !!!");
		}
	}
}
