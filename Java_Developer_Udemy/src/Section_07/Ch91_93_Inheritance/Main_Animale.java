package Section_07.Ch91_93_Inheritance;

public class Main_Animale {
	
	public static void main(String[] args) {
		
		Animale a1 = new Animale("Mamifer", "Caine", "merge", "omnivor", "casa");
		System.out.println("Obiectul a1 are caracteristicile: " + a1);
		System.out.println("-----------");
		
		Caini c1 = new Caini("Jack", "labrador", "auriu", "35 kg");
		System.out.println("Cainele c1 are caracteristicile: " + c1);
		c1.ceFacCainii("Jack");
					
		System.out.println("-----------");
		
		Pisici p1 = new Pisici("Luluta", "maidaneza","alb cu gri","3 kg"); 
		System.out.println("Pisica p1 are cracteristicile: " + p1);
		p1.ceFacPisicile("Zizica");
		System.out.println("-----------");
		
		Animale a2 = new Animale("Mamifer", "Pisica",  "casa");
		
		Pisici p2 = new Pisici("Mamifer", "Pisica", "casa", "Zinel","maidanez", "gri cu negru", "4 kg");
		System.out.println("Pisica p2 are caracteristicile: " + p2);
		System.out.println( " si este un animal de tip: " + a2);
	}

}
