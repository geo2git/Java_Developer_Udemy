package CE_40;

public class Mitsubishi extends Car {

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	//	System.out.println("Se apeleaza clasa copil, Mitsubishi !");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		//super.startEngine();
		System.out.println("Mitsubishi -> startEngine()");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		//super.accelerate();
		System.out.println("Mitsubishi -> accelerate()");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		//super.brake();
		System.out.println("Mitsubishi -> brake()");
	}
	
}
