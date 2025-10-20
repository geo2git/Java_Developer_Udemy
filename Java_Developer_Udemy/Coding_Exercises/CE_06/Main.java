package CE_06;

public class Main {

	public static void main(String[] args) {
		
		double x=2.1756;  double y=2.175;
			int intX=(int)x; int intY= (int)y;
			float zecX = (float)(x-intX);  float zecY=(float)(y-intY);
			int c3X = (int)(zecX*1000); int c3Y=(int)(zecY*1000); 
			
			
		System.out.println("intX are valoarea = " + intX);
		System.out.println("Partea zecimala a lui x este = " + zecX);
		System.out.println("Primele 3 cifre din partea zecimala a lui X sunt = " + c3X);
		
		System.out.println("intY are valoarea = " + intY);
		System.out.println("Partea zecimala a lui y este = " + zecY);
		System.out.println("Primele 3 cifre din partea zecimala a lui Y sunt = " + c3Y);
		
		boolean b = DecimalComparator.areEqualByThreeDecimalPlaces(123.123, 222.33);
		System.out.println("X si Y sunt = " + DecimalComparator.areEqualByThreeDecimalPlaces(x, y));
		System.out.println("Numerele sunt egale pana la 3 zecimale = " + b);
		
		boolean b2 = DecimalComparator.areEqualByThreeDecimalPlaces(2.1756, 2.175);
		System.out.println("Numerele sunt egale pana la 3 zecimale = " + b2);
		
	}
}
