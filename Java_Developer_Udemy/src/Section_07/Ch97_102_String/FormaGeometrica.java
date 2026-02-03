package Section_07.Ch97_102_String;

public class FormaGeometrica {

	private int x;
	private int y;

	public FormaGeometrica(int x, int y) {

		this.x = x;
		this.y = y;
		System.out.println("Se apeleaza construtorul din clasa parinte !");
	}
	
	public FormaGeometrica getValori() {
		return new Dreptunghi(this.x,this.y);
	}

	@Override
	public String toString() {
		return "FormaGeometrica [x=" + x + ", y=" + y + "]";
	}
	
	
}



class Dreptunghi extends FormaGeometrica {

	private int lungime;
	private int latime;

	public Dreptunghi(int x, int y) {
		this(x, y, 0, 0);
		System.out.println("Se apeleaza primul constructor !");
	}

	public Dreptunghi(int x, int y, int lungime, int latime) {
		super(x, y);
		this.lungime = lungime;
		this.latime = latime;
		System.out.println("Se apeleaza al doilea constructor !");
	}

	public int getDreptunghi(int a, int b) {
		a = this.lungime;
		b = this.latime;

		return a;
	}

	public int getDreptunghi2() {
		int arie = this.lungime * this.latime;
		return arie;
		// System.out.println("Se apeleaza al treile constructor !");
	}



class MainForma {

	public static void main(String[] args) {

		Dreptunghi d = new Dreptunghi(1, 1);
		System.out.println("Aria dreptunghiului este: " + d.getDreptunghi2());

		Dreptunghi d2 = new Dreptunghi(11,684);
		System.out.println("Valoarea lui a este :" + d2.getDreptunghi(11, 324));
		
		FormaGeometrica f= new FormaGeometrica(11, 22);
		System.out.println("Cele doua valori pt x si y sunt: " + f.getValori());
	}
	
	
}}