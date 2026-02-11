package CE_40;

public class Ford extends Car{

	public Ford(int cylinders,String name) {
		super(cylinders,name);
		//System.out.println("Se apeleaza clasa copil, FORD !");
	}
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		//super.startEngine();
		System.out.println(getClass().getSimpleName() + " -> startEngine()");
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		//super.accelerate();
		System.out.println(getClass().getSimpleName() + " -> accelerate()");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		//super.brake();
		System.out.println(getClass().getSimpleName() +" -> brake()");
	}
	

}
