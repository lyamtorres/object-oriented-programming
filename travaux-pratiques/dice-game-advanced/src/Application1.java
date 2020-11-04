
public class Application1 {

	public static void main(String[] args) {
		
		Player player1 = new Player("Edward", 0, 0);
		Player player2 = new Player("Alphonse", 0, 0);
		int round = 0;
		
		while ((player1.getScore() < 5 && player2.getScore() < 5) && (player1.getAlternativeScore() < 3 && player2.getAlternativeScore() < 3)) {
			int a = player1.diceRoll();
			int b = player2.diceRoll();
			
			if(a < b) {
				player2.optainPoint();
			} else if (a > b){
				player1.optainPoint();
			} else {
				player1.optainPoint();
				player2.optainPoint();
			}
			
			if(a == 6 || b == 6) {
				if(a == 6) {
					player1.optainAlternativePoint();
				} else if (b == 6) {
					player2.optainAlternativePoint();
				} else {
					player1.optainAlternativePoint();
					player2.optainAlternativePoint();
				}
			}
			
			round += 1;
			
			System.out.println("|| ROUND " + round + " ||");
			System.out.println("");
			System.out.println("P1 SCORE: " + player1.getScore());
			System.out.println("P2 SCORE: " + player2.getScore());
			System.out.println("");
			System.out.println("P1 ALT SCORE: " + player1.getAlternativeScore());
			System.out.println("P2 ALT SCORE: " + player2.getAlternativeScore());
			System.out.println("");	
			System.out.println("");			

		}
		
		if((player1.getScore() < player2.getScore()) || (player1.getAlternativeScore() < player2.getAlternativeScore())) {
			System.out.println("PLAYER 2 WINS!!!");
		} else {
			System.out.println("PLAYER 1 WINS!!!");
		}

	}
}
