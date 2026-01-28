package Section_07.Ch91_93_Inheritance;

public class Animal {

	private String tip;
	private String marime;
	private int greutate;
	
	public Animal(String tip, String marime, int greutate) {
		
		this.tip=tip;
		this.marime=marime;
		this.greutate=greutate;
	}

	public Animal() {
		
	}
	
	@Override
	public String toString() {
		return "Animal [tip=" + tip + ", marime=" + marime + ", greutate=" + greutate + "]";
	}
	
	public void seMisca(String viteza) {
		System.out.println(tip + " se misca cu viteza de " + viteza);
	}
	
	public void faceZgomot() {
		System.out.println(tip + " face ceva zgomot ");
	}
	
}
