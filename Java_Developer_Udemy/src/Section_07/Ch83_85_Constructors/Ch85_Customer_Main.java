package Section_07.Ch83_85_Constructors;

public class Ch85_Customer_Main {

	public static void main(String[] args) {
		
		Ch85_Customer c1 = new Ch85_Customer();
					
		System.out.println(c1.getName());
		
		Ch85_Customer c2 = new Ch85_Customer("Geo",123,"dsfsd@sdfsd.r");
		
		System.out.println(c2.getName());
		System.out.println(c2.getCreditLimit());
		
		Ch85_Customer c3 = new Ch85_Customer("Geo2", "fewfwe");
		
		System.out.println(c3.getCreditLimit());
		System.out.println(c3.getName());
	}
}
