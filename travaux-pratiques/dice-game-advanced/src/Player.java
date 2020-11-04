
public class Player {
	
	private String name;
	private int score;
	private int alternativeScore; // Nombre d'apparitions de six
	
	public Player (String name, int score, int alternativeScore) {
		this.name = name;
		this.score = score;
		this.alternativeScore = alternativeScore;
	}
	
	public int diceRoll() {	
		double value = Math.random();
		int number = (int)(value * 6);
		
		number += 1;	
		return number;
	}
	
	public void optainPoint() {
		this.score += 1;		
	}
	
	public void optainAlternativePoint() {
		this.alternativeScore += 1;		
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getAlternativeScore() {
		return alternativeScore;
	}
}
