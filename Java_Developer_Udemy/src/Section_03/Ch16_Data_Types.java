package Section_03;

public class Ch16_Data_Types {

	public static void main(String[] args) {
		
		int nrMeu = 25;
		int a = 23; int g = 2; int sum=a+g;
		
		if (nrMeu>0 && nrMeu<10) {
			System.out.println("Nr meu este < 10: " + nrMeu);
		} else if(nrMeu>10 && nrMeu<20) {
			System.out.println("Nr meu este < 20: " + nrMeu);
		} else if (nrMeu>20 && nrMeu<40) {
			System.out.println("Nr meu este < 40: " + nrMeu);
		}
				
		
		//System.out.println("Nr meu este: " + nrMeu);
		System.out.println("Suma celor 2 nr este: " + sum);
	}
}
