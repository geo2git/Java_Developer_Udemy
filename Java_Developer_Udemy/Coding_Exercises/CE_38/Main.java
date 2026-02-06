package CE_38;

public class Main {

	public static void main(String[] args) {
		
		Wall w1 = new Wall("vest");
		Wall w2 = new Wall("est");
		Wall w3 = new Wall("sud");
		Wall w4 = new Wall("nord");
		
		System.out.println(w1.getDirection());
		
		Ceiling c1 = new Ceiling(11,22);
		
		System.out.println(c1.getHeight());
		
		Bed b = new Bed("Modern", 2,2,3,1);
		
		Lamp l = new Lamp("Clasic", false, 123);
		
		Bedroom br = new Bedroom("geo", w1,w2,w3,w4,c1,b,l);
		br.makeBed();
		br.getLamp().turnOn();
	//	System.out.println("Dormitorul este: " + br.makeBed());
	}
}
