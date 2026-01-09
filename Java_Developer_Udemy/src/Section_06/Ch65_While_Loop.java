package Section_06;

public class Ch65_While_Loop {

	public static void main(String[] args) {

		int x = 5;
		int count = 0;
		while (x <= 20) {
			x++;
			if (esteNrPar(x) == true) {
				System.out.println(x + " este un nr par " + esteNrPar(x));
			
			count++;
			System.out.println("Nr total de aparitii este: " + count);
			
		}
			
		}
		System.out.println("=========================");
		//System.out.println(//"Valoarea lui i este: " + i);
		System.out.println("Suma cifrelor nr este: "  + sumaCifre(1234));
	}

	public static boolean esteNrPar(int a) {

		if (a % 2 == 0) {
			return true;
		}
		return false;
	}

	public static int sumaCifre(int nr) {
		if(nr<0) {
			return -1;
		} else {
			
				int suma=0;
			
			while (nr>9) {
				
				suma+=(nr%10);
				nr=nr/10;
				
			}	suma=suma+nr;
			
			return suma; 
		} 
	}
	
}
