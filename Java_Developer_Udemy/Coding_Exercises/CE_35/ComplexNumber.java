package CE_35;

public class ComplexNumber {

	private double real;
	private double imaginery;
	
	public ComplexNumber(double real, double imaginery) {
		this.real=real;
		this.imaginery=imaginery;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginery;
	}
	
	public void add(double real, double imaginery) {
		 this.real+=real; 
		 this.imaginery+=imaginery;
	}
	
	public void add(ComplexNumber c) {
		this.real=this.real+c.real;
		this.imaginery=this.imaginery+c.imaginery;
	}
	
	public void subtract(double real, double imaginery) {
		this.real-=real; 
		this.imaginery-=imaginery;
	}
	
	public void subtract(ComplexNumber c) {
		this.real=this.real-c.real;
		this.imaginery=this.imaginery-c.imaginery;
	}
}
