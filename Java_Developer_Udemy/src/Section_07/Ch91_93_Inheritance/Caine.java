package Section_07.Ch91_93_Inheritance;

public class Caine extends Animal{

	private String formaUrechii;
	private String formaCozii;
	

	public Caine() {
		super("Jack", "mare",50);
	}

	public Caine(String tip, int greutate) {
		this(tip, greutate, "urechi mari", "blanoasa");
	}
	
	public Caine(String tip, int greutate, String formaUrechii, String formaCozii) {
		super(tip, greutate < 15 ? "mic" : (greutate<50 ? "medie" : "mare"), greutate);
		this.formaUrechii=formaUrechii;
		this.formaCozii=formaCozii;
	}

	@Override
	public String toString() {
		return "Caine [formaUrechii=" + formaUrechii + ", formaCozii="
				+ formaCozii + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	private void latra() {
		System.out.println("latra");
	}
	
	private void alearga() {
		System.out.println();
	}
	
}
