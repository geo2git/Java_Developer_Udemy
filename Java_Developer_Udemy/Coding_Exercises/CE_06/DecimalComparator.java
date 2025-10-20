package CE_06;

public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		
		int intX = (int)x; int intY=(int)y;
		float zecX = (float)(x-intX);  float zecY=(float)(y-intY);
		int c3X = (int)(zecX*1000); int c3Y=(int)(zecY*1000); 
		
		if(intX == intY && c3X==c3Y) {
			return true;
		} else {
			return false;
		}
	}
}
