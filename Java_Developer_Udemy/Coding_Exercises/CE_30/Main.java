package CE_30;

public class Main {
	
	public static void main(String[] args) {
		
		SimpleCalculator c1 = new SimpleCalculator();
	
		c1.setFirstNumber(11);
		c1.setSecondNumber(22);
		System.out.println("Primul nr este = " + c1.getFirstNumber()); 
		System.out.println("Al doilea nr este = " + c1.getSecondNumber());
		System.out.println("Suma celor doua nr este = " + c1.getAdditionResult());
		System.out.println("Diferenta celor doua nr este = " + c1.getSubtractionResult());
		System.out.println("Inmultirea celor doua nr este =" + c1.getMultiplicationResult());
		System.out.println("Impartirea celor doua nr este =" + c1.getDivisionResult());
		
				
	}

}
