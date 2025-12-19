package CE_19;

public class SharedDigit {
	
	public static boolean hasSharedDigit(int a, int b) {
		
		int drA=a/10; 
		int stA=a%10;
		int drB=b/10;
		int stB=b%10;
		
		if((a<10||a>99) || (b<10 || b>99)) {
			return false;
		} else if((drA==drB) || (drA==stB) || (stA==drB) || (stA==stB)) {
				return true;
			
		} else {
			return false;
		}
	}

}
