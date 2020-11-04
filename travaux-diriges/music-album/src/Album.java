
import java.util.ArrayList;

public class Album {
	
	private String title, editor;
	private int year;
	private ArrayList<Song> songs;
	
	public Album(String title, String editor, int year) {
		this.title = title;
		this.editor = editor;
		this.year = year;
		songs = new ArrayList<Song>();
	}

	public String getTitle() {
		return title;
	}

	public String getEditor() {
		return editor;
	}

	public int getYear() {
		return year;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}
}
