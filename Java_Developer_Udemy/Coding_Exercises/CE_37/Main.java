package CE_37;

public class Main {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(22,33);
		System.out.println("Aria dreptunghiului este: " + r.getArea());
		
		Cuboid c = new Cuboid(11,22,33);
		System.out.println("Volumul cubului este: " + c.getVolume());
	}

}
