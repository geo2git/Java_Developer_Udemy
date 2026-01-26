package Section_07.Ch86_90_References__Objets_Instances;

public class Ch86_House_Main {
	
	public static void main(String[] args) {
		
		Ch86_House h1 = new Ch86_House("alb", 100);
		//System.out.println(h1.getColor() + h1.getArea());
		System.out.println("Casa cu instanta h1 : " + h1.getColor() + h1.getArea());
		
		Ch86_House h2 = new Ch86_House("maro", 200);
		//System.out.println(h1.getColor() + h1.getArea());
		//System.out.println(h2.getColor() + h2.getArea());
		System.out.println("Casa cu instanta h1 : " + h1.getColor() + h1.getArea());
		System.out.println("Casa cu instanta h2 : " + h2.getColor() + h2.getArea());
		
		Ch86_House h3 = h2;
		
		//System.out.println(h3.getColor() + h3.getArea());
		//System.out.println(h2.getColor() + h2.getArea());
		System.out.println("Casa cu instanta h2 : " + h2.getColor() + h2.getArea());
		System.out.println("Casa cu instanta h3 : " + h3.getColor() + h3.getArea());
		
		Ch86_House h4 = new Ch86_House();
		h4.setColor("galben"); h4.setArea(300);
		System.out.println("Casa cu instanta h4 " +  h4.getColor() + h4.getArea());
		
		Ch86_House h5 = h4;
		System.out.println("Casa cu instanta h5 : " + h5.getColor() + h5.getArea());
        h5.setColor("rosu"); h5.setArea(444);
        System.out.println("Casa cu instanta h5 : " + h5.getColor() + h5.getArea());
        h2.setColor("mov"); h2.setArea(111);
        System.out.println("Casa cu instanta h2 : " + h2.getColor() + h2.getArea());
        System.out.println("Casa cu instanta h4 : " + h4.getColor() + h4.getArea());
        
        Ch86_House h6 = new Ch86_House(333);
     //   h6.setArea(222);
        h6.setColor("www");
        System.out.println("Casa cu instanta h6: " + h6.getArea());
        System.out.println("Casa cu instanta h6: " + h6.getColor());
        
	}
}
