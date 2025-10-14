package Section_05;

public class Ch43_Challenge {

	public static void main(String[] args) {
		
		
		
	}
	
	
	public static void afiseazaPozitiaScorului(String numeJucator, int pozitie) {
		
		System.out.println(numeJucator + " a reusit sa ajunga in pozitia 2 !" + pozitie + " pe lista de scoruri !");
		
	}
	
	public static int calculeazaPozitiaScorului(int scor) {
		
		if(scor>1000) {
			return 1;
		} else if (scor>500 && scor<1000){
			return 2;
		} else if (scor >100 && scor<500) {
			return 3;
		} else {
			return 4;
		}
		
		
	}
}
