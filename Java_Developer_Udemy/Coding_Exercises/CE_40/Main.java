package CE_40;

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car(3,"Skoda Scala");
		c.startEngine();
		c.accelerate();
		c.brake();
		
		Ford f = new Ford(6, "Ford Mustang");
		f.startEngine();
		f.accelerate();
		f.brake();
		
		Holden h = new Holden(4, "Torero");
		h.accelerate();
		h.brake();
		h.startEngine();
		System.out.println(h.getName());
	}
}
