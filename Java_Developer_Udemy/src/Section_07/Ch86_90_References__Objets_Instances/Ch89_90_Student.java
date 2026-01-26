package Section_07.Ch86_90_References__Objets_Instances;

public class Ch89_90_Student {

	private String id;
	private String nume;
	private String dataNasterii;
	private String listaClase;
	
	
	public Ch89_90_Student(String id, String nume, String dataNasterii, String listaClase ) {
		this.id=id;
		this.nume=nume;
		this.dataNasterii=dataNasterii;
		this.listaClase=listaClase;
	}


	@Override
	public String toString() {
		return "Ch89_90_Student [id=" + id + ", nume=" + nume
				+ ", dataNasterii=" + dataNasterii + ", listaClase="
				+ listaClase + "]";
	}
	
	
}

