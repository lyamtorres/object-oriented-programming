
public class Line {
	private Point a;
	private Point b;
	
	public Line(Point a, Point b) {
		this.a = a;
		this.b = b;
	}
	
	// Indique si la droite est horizontale ou verticale
	public String defineOrientation() {
		String orientation = "";
		if(a.getX() == b.getX()) {
			orientation = "Cette ligne est verticale";
		} else if(a.getY() == b.getY()) {
			orientation = "Cette ligne est horizontale";
		}
		return orientation;
	}
	
	// Calcule la pente de la droite... Comment gère-t-on le cas ou la pente est infinie ?
	public double calculateSlope() {
		return ((b.getY() - a.getY()) / (b.getX() - a.getX()));
	}
	
	
	public Point getA() {
		return a;
	}
	
	public Point getB() {
		return b;
	}

	public static void main(String[] args) {
		Point A = new Point(0, 6);
		Point B = new Point(0, 0);
		Line theLine = new Line(A, B); 	
		
		System.out.println(theLine.calculateSlope());
	}

}
