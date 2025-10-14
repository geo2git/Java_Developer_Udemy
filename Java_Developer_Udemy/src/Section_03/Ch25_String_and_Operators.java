package Section_03;

public class Ch25_String_and_Operators {

	public static void main(String[] args) {

		String s1 = "qqq";
		String s2 = "www";
		int w = 33;
		String s3 = s1 + s2;
		String s4 = s1 + w;

		System.out.println(s4);

		int res = 1 + 2;
		System.out.println(res);
		int prevRes = res;
		System.out.println(res);

		res = res - 1;
		System.out.println(res);

		char c1 = 'W';
		char c2 = 'Q';
		System.out.println(c1 + c2);
		System.out.println(" " + c1 + c2);
	}
}
