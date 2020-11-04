
import java.util.ArrayList;

public class Album {
	
	private String title, author;
	private int year;
	private ArrayList<Song> songs;
	
	public Album(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.songs = new ArrayList<Song>();
	}
	
	public void addSong(Song s) {
		songs.add(s);
	}
	
	public void countSongs() {
		songs.size();
	}
	
	public String calculateInHours() {
		int totalDuration = 0;
		
		for(Song s : songs) {
			totalDuration += s.getTime().toHours();
		}
		return totalDuration + " heures";
	}
	
	public String calculateInMinutes() {
		int totalDuration = 0;
		
		for(Song s : songs) {
			totalDuration += s.getTime().toMinutes();
		}
		return totalDuration + " minutes";
	}
	
	public String calculateInSeconds() {
		int totalDuration = 0;
		
		for(Song s : songs) {
			totalDuration += s.getTime().getTotalSeconds();
		}
		return totalDuration + " secondes";
	}

	public String getTitle() {
		return title;
	}

	public String getEditor() {
		return author;
	}

	public int getYear() {
		return year;
	}
	
}
