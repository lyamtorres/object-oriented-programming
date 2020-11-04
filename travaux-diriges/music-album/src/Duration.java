
public class Duration {
	
	private int totalSeconds;
	
	public Duration(int seconds) {
		totalSeconds = seconds;
	}
	
	public Duration(int seconds, int minutes) {
		totalSeconds = seconds + minutes * 60;
	}
	
	public Duration(int seconds, int minutes, int hours) {
		totalSeconds = seconds + minutes * 60 + hours * 3600;
	}
	
	public int getTotalSeconds() {
		return totalSeconds;
	}
	
	// Transforme les secondes en heures
	public int toHours() {
		return totalSeconds / 3600;
	}
	
	// Transforme les secondes en minutes
	public int toMinutes() {
		return totalSeconds / 60;
	}

}
