package Section_08.Ch110_115_Polymorfism;

public class Car {
	
	private String description;
	
	public void startEngine() {
		System.out.println("Motorul a fost pornit !");
	}
	
	public void drive() {
		System.out.println("Masina care este condusa este " + getClass().getSimpleName());
		runEngine();
	}
	
	protected void runEngine() {
		System.out.println("Motorul masinii ruleaza !  ");
	}

	public Car(String description) {
		super();
		this.description = description;
	}

	
}

class GasCar extends Car{
	
	private double avgPerKm;
	private int cylinders=4;
	

	public GasCar(String description) {
		super(description);
	}


	public GasCar(String description, double avgPerKm, int cylinders) {
		super(description);
		this.avgPerKm = avgPerKm;
		this.cylinders = cylinders;
	}


	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Gas -> Toti cei %d cilindrii sunt porniti si gata !%n",cylinders);
		super.startEngine();
	}


	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Gas -> consumul depaseste media de: %.2f %n",avgPerKm);
		super.runEngine();
	}
		
}

class ElectricCar extends Car{
	
	private double avgPerKm;
	private int batterySize=75;
	

	public ElectricCar(String description) {
		super(description);
	}


	public ElectricCar(String description, double avgPerKm, int batterySize) {
		super(description);
		this.avgPerKm = avgPerKm;
		this.batterySize = batterySize;
	}


	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Electric -> Bateria de capacitate %d kWheste gata !%n",batterySize);
		super.startEngine();
	}


	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Electric -> consumul depaseste media de: %.2f %n",avgPerKm);
		super.runEngine();
	}
		
}

class HybridCar extends Car{
	
	private double avgPerKm;
	private int cylinders=4;
	private int batterySize=50;

	public HybridCar(String description) {
		super(description);
	}


	public HybridCar(String description, double avgPerKm, int cylinders, int batterySize) {
		super(description);
		this.avgPerKm = avgPerKm;
		this.cylinders = cylinders;
		this.batterySize=batterySize;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Hybrid -> Toti cei %d cilindrii sunt porniti si gata !%n",cylinders);
		System.out.printf("Hybrid -> Bateria de capacitate %d kWheste gata !%n",batterySize);
		super.startEngine();
	}

	@Override
	protected void runEngine() {
		// TODO Auto-generated method stub
		System.out.printf("Hybrid -> consumul depaseste media de: %.2f %n",avgPerKm);
		super.runEngine();
	}
		
}
