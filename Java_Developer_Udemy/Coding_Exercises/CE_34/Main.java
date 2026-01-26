package CE_34;

public class Main {
	public static void main(String[] args) {
		
		Floor f1 = new Floor(3,4);
		Carpet c1 = new Carpet(11);
		
		Calculator calc1 = new Calculator(f1, c1);
		System.out.println("Costul total al covorului este = " + calc1.getTotalCost());
	}

}
