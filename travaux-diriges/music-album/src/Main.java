
public class Main {

	public static void main(String[] args) {
		
		Duration time1 = new Duration(0, 0, 1);
		Duration time2 = new Duration(0, 0, 1);
		Duration time3 = new Duration(0, 0, 1);
		
		Song song1 = new Song("Blue Bird", time1);
		Song song2 = new Song("Sign", time2);
		Song song3 = new Song("Silhouette", time3);
		
		Album album = new Album("Naruto Openings", "None", 2000);
		
		album.addSong(song1);
		album.addSong(song2);
		album.addSong(song3);
		
		System.out.println(album.calculateInHours());
		System.out.println(album.calculateInMinutes());
		System.out.println(album.calculateInSeconds());
		
	}

}
