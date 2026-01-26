package CE_35;

public class Main {
	
	public static void main(String[] args) {
		
		ComplexNumber c1 = new ComplexNumber(1, 3);
		System.out.println("Partea reala a lui c1 este = " + c1.getReal() + 
				" si partea imaginara este = " + c1.getImaginery());
		c1.add(-2, 12);
		c1.add(c1);
		System.out.println("Adunarea celor 2 nr complexe este => " + c1.getReal() + "+" + 
				 + c1.getImaginery() + "i");
		
		ComplexNumber c2 = new ComplexNumber(11, 22);
		ComplexNumber c3 = new ComplexNumber(20, 30);
				
		System.out.println("Partea reala a lui c2 este = " + c2.getReal() + 
				" si partea imaginara este = " + c2.getImaginery());
		System.out.println("Partea reala a lui c3 este = " + c3.getReal() + 
				" si partea imaginara este = " + c3.getImaginery());
		
		c3.substract(c2);
		
		System.out.println("Scaderea celor 2 nr complexe este => " + c3.getReal() + "+" + 
				 + c3.getImaginery() + "i");
		
		ComplexNumber c4 = new ComplexNumber(33, 45);
		
		c4.substract(c2);
		
		System.out.println("Scaderea celor 2 nr complexe este => " + c4.getReal() + "+" + 
				 + c4.getImaginery() + "i");
		
		c4.substract(11, 11);
				
		System.out.println("Scaderea celor 2 nr complexe este => " + c4.getReal() + "+" + 
						 + c4.getImaginery() + "i");
				
				
	}

}
