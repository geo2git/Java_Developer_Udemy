
package Section_07.Ch97_102_String;

public class Smartphone {

	private String tipOS;
	//private String marca;
	
	public void ceOS() {
		System.out.println("Sistemul de operare este ANDROID !" );
	}
	
}

class Samsung extends Smartphone{
	
	@Override
	public void ceOS() {
		System.out.println("Samsung are sistemul de operare ANDROID !!");
	}
	
}

class Phones extends Smartphone{
	
	public void ceOS(String iPhone, String Honor) {
		System.out.println(iPhone + " are sistemul de operare IOS, iar " + Honor + " are Android !!!");
	}
}

class mainSmart{
	
	public static void main(String[] args) {
		
		Smartphone sm = new Smartphone();
		sm.ceOS();
		
		Samsung sam = new Samsung();
		sam.ceOS();
		
		Phones ph = new Phones();
		ph.ceOS("iPhone16","Honor Magic 6");
		
	}
}