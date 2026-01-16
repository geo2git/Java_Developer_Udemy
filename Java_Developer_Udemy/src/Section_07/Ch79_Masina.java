package Section_07;

public class Ch79_Masina {

	private String marca = "Skoda";
	private String model = "Scala";
	private String culoare = "albastru";
	private String motor ="1.0 TSI";
	private int nrUsi = 5;
	//private String 
	
	public void afiseazaDateleMasinii() {
		
		System.out.println("Marca masinii este: " + marca + "\n" +  
										 "Modelul masinii este: " + model + "\n" + 
										 "Culoarea masinii este: " + culoare + "\n" + 
										 "Motorul masinii este: " + motor + "\n" +
										 "Nr  de usi este:  " + nrUsi + "\n");
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getNrUsi() {
		return nrUsi;
	}

	public void setNrUsi(int nrUsi) {
		this.nrUsi = nrUsi;
	}
	
	
}
