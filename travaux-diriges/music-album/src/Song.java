
import java.util.ArrayList;

public class Song {
	
	private String title;
	private ArrayList<String> artists;
	private Duration time;
	
	public Song(String title, Duration time) {
		this.title = title;
		artists = new ArrayList<String>();
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<String> getArtists() {
		return artists;
	}

	public Duration getTime() {
		return time;
	}
}
