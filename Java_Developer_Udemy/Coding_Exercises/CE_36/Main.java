package CE_36;

public class Main {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(11);
		
		System.out.println("Raza cercului este: " + c1.getRadius() + " si aria cercului este: " + c1.getArea());
		
		Cylinder cl1 = new Cylinder(10, 11);
		
		System.out.println("Raza cilindrului este: " + cl1.getRadius() + " si volumul este: " + cl1.getVolume());
	}

}
