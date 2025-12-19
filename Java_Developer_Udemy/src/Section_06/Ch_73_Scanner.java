package Section_06;
import java.util.*;

public class Ch_73_Scanner {

	public static void main(String[] args) {
		
		System.out.println("Numele dvs este: " + getScannerInput(2025));
		
		System.out.println();
	}
	
	public static String getScannerInput(int anulCurent) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti numele dvs: ");
		String nume = sc.nextLine();
		System.out.println("Salut " + nume);
		
		System.out.println("In ce an te-ai nascut ? ");
		
		boolean validare = false;
		int varsta=0;
		
		do {
			System.out.println("Introduceti un an >= " + (anulCurent-125) + " si <= " + anulCurent);
						
			try { 
			//int anulNasterii = sc.nextInt();
    		varsta = verificaDatele(anulCurent, sc.nextInt());
    		validare= varsta<0 ? false:true;
			} catch (NumberFormatException badUserData) {
				System.out.println("Caractere nepermise, mai incecati !");
			}
			
		}while(!validare);
		
		return "Deci " + nume + " ai varsta de: " + varsta;
	}
	
	
	public static int verificaDatele(int anulCurent, int anulNasterii) {
		
		int anMin=anulCurent-125;
		
		if((anulNasterii<anMin) ||  (anulNasterii>anulCurent)) {
			 return -1; 
		}
		
		int varsta=anulCurent-anulNasterii;
		return varsta;
	}
}
