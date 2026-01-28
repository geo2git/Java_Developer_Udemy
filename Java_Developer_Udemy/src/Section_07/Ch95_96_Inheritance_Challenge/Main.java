package Section_07.Ch95_96_Inheritance_Challenge;

public class Main {

	public static void main(String[] args) {
		
		Angajat a1 = new Angajat("Geo", "1980", "2004");
		
		System.out.println(a1);
		System.out.println("Varsta lui Geo este: " + a1.getVarsta());
		System.out.println("Plata este: " + a1.colecteazaPlata());
		System.out.println("-------------");
		
		Angajat a2 = new Angajat("Geo", "1980", "2004");
		
		System.out.println(a2);
		System.out.println("Varsta lui Geo este: " + a2.getVarsta());
		System.out.println("Plata este: " + a2.colecteazaPlata());
		System.out.println("-------------");
		
		Salariat s1 = new Salariat("geo2", "1999", "2020", 22000);
		System.out.println(s1);
		System.out.println("Salariul lui s1 este: " + s1.colecteazaPlata());
	}
}
