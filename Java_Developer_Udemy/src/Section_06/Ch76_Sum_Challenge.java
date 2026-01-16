package Section_06;
import java.util.*;

public class Ch76_Sum_Challenge {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int counter =1; int suma=0;

		while(counter<=5) {
			System.out.println("Introduceti nr # " + counter + " : ");
			String nextNo = sc.nextLine();
			
			try {
				int nr = Integer.parseInt(nextNo);
				counter++;
				suma+=nr;
			} catch (NumberFormatException nfe) {
				System.out.println("Nr invalid !");
			}
		
			//counter++;
		}	System.out.println("Suma celor 5 numere este: " + suma);
//		System.out.println("Introduceti primul nr: ");
//				int nr1 = sc.nextInt();
//				System.out.println("Nr introdus este: " + nr1);			
//			
//		System.out.println("Introduceti al doilea nr: ");
//				int nr2 = sc.nextInt();
//				System.out.println("Nr introdus este: " + nr2);			
//			
//	    System.out.println("Introduceti al treilea nr: ");
//	    		int nr3 = sc.nextInt();
//	    		System.out.println("Nr introdus este: " + nr3);			
//
//		System.out.println("Introduceti al patrulea nr: ");
//				int nr4 = sc.nextInt();
//				System.out.println("Nr introdus este: " + nr4);			
//	
//		System.out.println("Introduceti al cincilea nr: ");
//				int nr5 = sc.nextInt();
//				System.out.println("Nr introdus este: " + nr5);			
//	
//	int suma = nr1+nr2+nr3+nr4+nr5;			
//	System.out.println("Suma celor 5 nr este: " + suma);			
	}
}
