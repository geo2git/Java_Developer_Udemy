package Section_08.Ch110_115_Polymorfism;

public class Main_Car {
	
	public static void main(String[] args) {
		
		Car c = new Car("Skoda Scala");
		runRace(c);
		
		Car skoda = new GasCar("Scala",7,3);
	runRace(skoda);
	
		Car el = new ElectricCar("Tesla", 2,75);
		runRace(el);
		
		Car hyb = new HybridCar("Toyota", 4,4,50);
		runRace(hyb);
	}
	
	public static void runRace(Car car) {
		
		car.startEngine();
		car.drive();
	}
	
}
