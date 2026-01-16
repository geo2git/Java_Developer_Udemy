package Section_06;

import java.util.Scanner;

public class Ch77_Min_Max_Challenge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min=0, max=0; int counter=1;
		
		while(true) {
			System.out.println("Introduceti un nr sau alt caracter pt a iesi: ");
			
			String nextVal = sc.nextLine();
			
			try {
				int nrValid = Integer.parseInt(nextVal);
				
					if(counter==0 || nrValid<min) {
						min=nrValid;
					}
					
					if(counter==0 || nrValid>max) {
						max=nrValid;
					}
					counter++;
					
			} catch (NumberFormatException nfe) {
				System.out.println("Ati iesit din program !");
				break;
			}
		}
		
		if(counter>0) {
			System.out.println("min = " + min + " max = " + max);
		}
	}
	
}

