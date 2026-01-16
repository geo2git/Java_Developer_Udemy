package CE_29;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Nr de galeti de care are nevoie este: " + PaintJob.getBucketCount(3, 3, 2, 1));
		
		System.out.println("Nr de galeti de care are nevoie este: " + PaintJob.getBucketCount(3, 3, 2));
		
		System.out.println("Nr de galeti de care are nevoie este: " + PaintJob.getBucketCount(11, 3));
	}
}
