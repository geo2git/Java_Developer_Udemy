package Section_07.Ch86_90_References__Objets_Instances;

public class Ch87_88_Pet {
	
	private String numeCatel;
	private static String numePisi;
	
	public  Ch87_88_Pet(String numeCatel, String numePisi) {
		this.numeCatel=numeCatel;
		this.numePisi=numePisi;
		System.out.println("Se apeleaza constuctorul cu toti parametrii !");
	}
	
	public Ch87_88_Pet() {
		System.out.println("Se apeleaza constructorul default, fara parametrii !");
	}
	
	public  Ch87_88_Pet(String numePisi) {
		//this.numeCatel=numeCatel;
		this.numePisi=numePisi;
		System.out.println("Se apeleaza constuctorul cu parametrul Pisi !");
	}
	
	public void setNumeCatel(String numeCatel) {
		this.numeCatel=numeCatel;
	}
	
	public void setNumePisi(String numePisi) {
		this.numePisi=numePisi;
	}
	
	public String getNumeCatel() {
		return numeCatel;
	}
	
	public String getNumePisi() {
		return numePisi;
	}

	public static void main(String[] args) {
		
		Ch87_88_Pet p1 = new Ch87_88_Pet("Max", "Luluta");
		
		//p1.setNumeCatel("Max"); 
		//p1.setNumePisi("Lulu");
		System.out.println("Instanta cu numele p1 are numele catelului: " + p1.getNumeCatel() + 
				" iar numele pisicii este: " + p1.getNumePisi());
		
        Ch87_88_Pet p2 = new Ch87_88_Pet();
		p2.setNumeCatel("Jack"); p2.setNumePisi("Norocica");
		System.out.println("Instanta cu numele p2 are numele catelului: " + p2.getNumeCatel() + 
				" iar numele pisicii este: " + p2.getNumePisi());
		System.out.println("Instanta cu numele p1 are numele catelului: " + p1.getNumeCatel() + 
				" iar numele pisicii este: " + p1.getNumePisi());
		
		
		Ch87_88_Pet p3 = new Ch87_88_Pet("Zinel");
		System.out.println("Instanta cu numele p3 este: " + p3.getNumePisi());
		Ch87_88_Pet p4 = new Ch87_88_Pet("Zizica");
		
		System.out.println("Instanta cu numele p3 este: " + p3.getNumePisi() + 
				" iar instanta cu numele p4 este: " + p4.getNumePisi());
		
	}
}
