
public class Match {
	
	private Player p1;
	private Player p2;
	private Player p3;
	private Player p4;
	private int victoryScore;
	private int chainOfSixScore;
	private int roundNumber;
	
	public Match(Player p1, Player p2, int victoryScore, int chainOfSixScore) {
		this.p1 = p1;
		this.p2 = p2;
		this.victoryScore = victoryScore;
		this.chainOfSixScore = chainOfSixScore;
		roundNumber = 0;
	}
	
	public Match(Player p1, Player p2, Player p3, Player p4, int victoryScore, int chainOfSixScore) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.victoryScore = victoryScore;
		this.chainOfSixScore = chainOfSixScore;
		roundNumber = 0;
	}
	
	public Player getP1() {
		return p1;
	}

	public Player getP2() {
		return p2;
	}
	
	public Player getP3() {
		return p3;
	}

	public Player getP4() {
		return p4;
	}

	public int getVictoryScore() {
		return victoryScore;
	}

	public int getChainOfSixScore() {
		return chainOfSixScore;
	}

	public int getRoundNumber() {
		return roundNumber;
	}

	public void goToNextRound() {
		roundNumber += 1;
	}
	
	public void restartRoundCounter() {
		roundNumber = 0;
	}
}
