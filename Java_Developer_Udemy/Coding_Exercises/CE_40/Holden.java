package CE_40;

public class Holden extends Car{

	public Holden(int cylinders, String name) {
		super(cylinders, name);
	//	System.out.println("Se apeleaza clasa copil, HOLDEN !");
	}
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		//super.startEngine();
		System.out.println("Holden -> startEngine()");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		//super.accelerate();
		System.out.println("Holden -> accelerate()");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		//super.brake();
		System.out.println("Holden -> brake()");
	}
	

}
