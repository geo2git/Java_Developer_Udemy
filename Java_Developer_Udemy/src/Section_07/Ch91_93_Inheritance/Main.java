package Section_07.Ch91_93_Inheritance;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a = new Animal("Elefant", "mare",3000);
		caracteristiciAnimal(a, "incet");
		
		Caine c = new Caine();
		caracteristiciAnimal(c, "rapid");

		Caine c2 = new Caine("Labrador", 35);
		caracteristiciAnimal(c2, "rapid");
	}

	public static void caracteristiciAnimal(Animal animal, String viteza) {
		
		animal.faceZgomot();
		animal.seMisca(viteza);
		System.out.println(animal);
		System.out.println("________");
	}
	
	
}
