package Section_06;

public class Ch_63_PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("0 este " + (esteNrPrim(0) ? "" : "NU") + " un nr prim");
		System.out.println("1 este " + (esteNrPrim(1) ? "" : "NU") + " un nr prim");
		System.out.println("2 este " + (esteNrPrim(2) ? "" : "NU") + " un nr prim");
		System.out.println("17 este " + (esteNrPrim(17) ? "" : "NU") + " un nr prim");
		System.out.println("31 este " + (esteNrPrim(31) ? "" : "NU") + " un nr prim");
	
		
		int count =0;
		
		for(int i=0; i<=1000;i++) {
			//System.out.println("Nr: " + count + (esteNrPrim(count) ? "" : " NU") + " un nr prim\"");
			
			if(esteNrPrim(i)) {
				System.out.println("Nr: " + i + " este un nr prim");
				count ++;
				if(count==3) {
					break;
				}
			}
			
		}
		
		System.out.println("Nr total de nr prime gasite este: " + count);
	 }
	
		
	public static boolean esteNrPrim(int nrIntreg) {
		
		if(nrIntreg<=2) {
			return (nrIntreg==2);
		}
		
		for (int div=2; div<=nrIntreg/2; div++) {
			if(nrIntreg%div==0) {
				return false;
			}
		}
		return true;
				
	}
	
	
}
