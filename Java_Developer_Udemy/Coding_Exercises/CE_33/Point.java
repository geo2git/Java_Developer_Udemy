package CE_33;

public class Point {

	private int x; private int y;
	
	public Point() {
		System.out.println("Se apeleaza constructorul fara parametrii !");
		}

	public Point(int x, int y) {
		this.x=x; this.y=y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getY() {
		return y;
	}

	public double distance() {
		double d0=Math.sqrt((x*x) + (y*y));
		return d0;
	}
	
	public double distance(Point p) {
		double dp = Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
		return dp;
	}
	
	public double distance(int a, int b) {
		double dxy = Math.sqrt((this.x-a)*(this.x-a) + (this.y-b)*(this.y-b));
		return dxy;
	}
}

class run_main{
	
	public static void main(String[] args) {
		Point p0 = new Point(1,2);
		System.out.println("distance for p0 = " + p0.distance());
		
		Point p1 = new Point(); Point p2 = new Point();
		p1.setX(10); p1.setY(20); p2.setX(16);p2.setY(26);
		System.out.println("Distance for p2 - p1 = " + p1.distance());
		
		
		Point p3= new Point();
		p3.setX(11); p3.setY(22);
		System.out.println("Distance for p3 = " + p3.distance());
		
		//System.out.println("distance for p1=" + p1.distance(p1));
	}
	
}