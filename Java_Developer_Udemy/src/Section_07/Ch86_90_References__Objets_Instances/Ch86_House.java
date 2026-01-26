package Section_07.Ch86_90_References__Objets_Instances;

public class Ch86_House {

	private String color;
	private int area;
	
		
	public String getColor() {
		return color;
	}
	
	public int getArea() {
		return area;
	}
	
	public void setColor(String color ) {
		this.color=color;
	}

	public void setArea(int area) {
		this.area=area;
	}
	
	public Ch86_House(String color, int area) {
		//super();
		this.color = color;
		this.area = area;
		System.out.println("Se apeleaza constructorul cu ambii parametrii !!");
	}
	
	public Ch86_House() {
				System.out.println("Se apeleaza constructorul default !!");
	}
	
	public Ch86_House(int area) {
		this.area=area;
		System.out.println("Se apeleaaza constructorul cu un singur parametru --> area !" );
	}
}


