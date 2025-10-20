package Section_05;

public class Ch54_Challenge {
	
	public static void main(String[] args) {
		
		System.out.println(getDurationString(180));
		System.out.println(getDurationString(100,33));
	}
	
	public static String getDurationString(int sec) {
		
		int min = (int)(sec/60); 

        return getDurationString(sec/60, sec%60);
	}
	public static String getDurationString(int min, int sec) {
		
				int hour = (int)(min/60); 
			    int remMin = (int)(min%60);
								
				if((min<0) || (sec<0 || sec>60)) {
					return "Invalid value !";
				} else {
					return hour + " hours " + remMin + " mins " + sec + " secs";
				}
			 }

	
	
}
