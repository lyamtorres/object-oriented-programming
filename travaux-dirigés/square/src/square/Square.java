package square;
import java.util.ArrayList;

public class Square {
	private ArrayList<Point> sqr;
	
	public Square() {
		sqr = new ArrayList<Point>();
	}
	
	public void addVertex(Point a, Point b) {
		double distanceX = b.getX() - a.getX();
		double distanceY = b.getY() - a.getY();
		Point c = new Point(b.getX() + distanceX, b.getY() - distanceY);
		Point d = new Point(a.getX() + distanceX, a.getY() - distanceY);
		
		sqr.add(a);
		sqr.add(b);
		sqr.add(c);
		sqr.add(d);		
	}
	
	public void getEverything() {
		for(int i = 0; i < sqr.size(); i++) {
			System.out.println(sqr.get(i));
		}
	}

	public static void main(String[] args) {
		Square superSquare = new Square();
		Point k = new Point(2, 2);
		Point l = new Point(4, 4); 
		
		superSquare.addVertex(k, l);
		superSquare.getEverything();
	}

}
