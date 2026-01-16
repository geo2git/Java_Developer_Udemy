package Section_07;

public class Ch79_Masina_Main {

	public static void main(String[] args) {
		
		Ch79_Masina m1 = new Ch79_Masina();
		Ch79_Masina m2 = new Ch79_Masina();
		Ch79_Masina m3 = new Ch79_Masina();
		Ch79_Masina m4 = new Ch79_Masina();
		
		m1.setModel("Rapid");
		m1.setCuloare("Bej");
		m1.setMotor("1.2 TSI");
		m1.setNrUsi(5);
		
		m3.setMarca("Dacia");
		m3.setModel("Duster");
		m3.setCuloare("Maro");
		m3.setMotor("1.3 TSI");
		
		m4.setMarca("Dacia");
		m4.setModel("Logan");
		m4.setCuloare("Rosu");
		m4.setMotor("0.9 TSI");
		m4.setNrUsi(4);
		
		System.out.println("Marca este: " + m1.getMarca());
		System.out.println("Modelul este: " + m1.getModel());
		System.out.println("Motorul este: " + m1.getMotor());
		System.out.println("Culoarea este: " + m1.getCuloare());
		System.out.println("Nr de usi este: " + m1.getNrUsi());
		
		System.out.println("******************************");
		
		System.out.println("Marca este: " + m2.getMarca());
		System.out.println("Modelul este: " + m2.getModel());
		System.out.println("Motorul este: " + m2.getMotor());
		System.out.println("Culoarea este: " + m2.getCuloare());
		System.out.println("Nr de usi este: " + m2.getNrUsi());
		
		System.out.println("******************************");
		
		System.out.println("Marca este: " + m3.getMarca());
		System.out.println("Modelul este: " + m3.getModel());
		System.out.println("Motorul este: " + m3.getMotor());
		System.out.println("Culoarea este: " + m3.getCuloare());
		
        System.out.println("******************************");
		
		System.out.println("Marca este: " + m4.getMarca());
		System.out.println("Modelul este: " + m4.getModel());
		System.out.println("Motorul este: " + m4.getMotor());
		System.out.println("Culoarea este: " + m4.getCuloare());
		
		
	}
}
