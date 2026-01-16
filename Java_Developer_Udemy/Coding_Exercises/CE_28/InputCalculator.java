package CE_28;

import java.util.Scanner;

public class InputCalculator {

	public static void inputThenPrintSumAndAverage( ) {
		
		Scanner sc = new Scanner(System.in);

		int sum=0; 	long avg=0;  int count=0;
		
		while(true) {
			
			//System.out.println("Introduceti un nr sau alt caracter pt a iesi: ");
			
			String nextVal = sc.nextLine();
			
			try {
				int nrValid = Integer.parseInt(nextVal);
				
					 sum += nrValid;
					 count++;
					}
										
			 catch (NumberFormatException nfe) {
				//System.out.println("Ati iesit din program !");
				break;
			}
		}
		
		if(count>0) {
			avg = (long)(sum/count);
			
		}
		
		if(count>0) {
			System.out.println("SUM = " + sum + " AVG = " + avg);
		}
		
	}
	
}
