package Section_05;

public class Ch52_Method_Overloading {

	public static void main(String[] args) {
		
				int p1 = punctaj("Geo",111);
				System.out.println("Si cu bonus are =" + p1);
				
				int p2 = punctaj("Geo2",111,123123);
				System.out.println("Si recordul este de  = " + p2 );
		}
	
	public static int punctaj(String nume, int puncte) {
		
		System.out.println(nume + " are " + puncte + " puncte !" );
		return puncte*100;
	}
	
public static int punctaj(String nume, int puncte, int record) {
		
		System.out.println(nume + " are " + puncte + " puncte !" );
		//return puncte*111;
		return record;
	}

	}
