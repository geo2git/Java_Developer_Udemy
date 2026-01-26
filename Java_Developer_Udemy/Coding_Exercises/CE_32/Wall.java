package CE_32;

public class Wall {

	private double width;
	private double height;
	
	public Wall() {
		System.out.println("Se apeleaza constructorul default !");
	}
	
	public Wall(double width, double height) {
		if(width<0) {
			width=0;
		} else {
			this.width=width;
		}
		if(height<0) {
			height=0;
		} else {
			this.height=height;
		}
	}
	
	public void setWidth(double width) {
		if(width<0) {
			width=0;
		} else {
			this.width=width;
		}
		
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		if(height<0) {
			height=0;
		} else {
			this.height=height;
		}
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		double area = this.width*this.height;
		return area;
	}

}

class run_main{
	
	public static void main(String[] args) {
		
		Wall w1 = new Wall(5,4);
		System.out.println("area= " + w1.getArea());
		
		Wall w2 = new Wall(5,-4);
		System.out.println("area= " + w2.getArea());
		
		Wall w3 = new Wall();
		
		w3.setWidth(-11); 
		w3.setHeight(11);
		System.out.println("width= " + w3.getWidth());
		System.out.println("height= " + w3.getHeight());
		System.out.println("area= " + w3.getArea());
		
	}
}