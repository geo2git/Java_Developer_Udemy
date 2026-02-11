package CE_40;

public class Car {
	
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	
	public Car(int cylinders, String name) {
		super();
		engine = true;
		this.cylinders = cylinders;
		this.name = name;
		wheels = 4;
	}
	

	public void startEngine() {
		System.out.println("Car -> startEngine()");
		//return "Car -> startEngine()";
	}
	
	public void accelerate() {
		System.out.println("Car -> accelerate()");
		//return "Car -> accelerate()";
	}
	
	public void brake() {
		System.out.println("Car -> brake()");
		//return "Car -> brake()";
	}
	
	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
		
}
