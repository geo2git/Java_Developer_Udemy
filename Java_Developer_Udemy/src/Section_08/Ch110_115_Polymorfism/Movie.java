package Section_08.Ch110_115_Polymorfism;

public class Movie {

	private String title;

	public Movie(String title) {
		super();
		this.title = title;
	}
	
	public void watchMovie() {
		String instanceType = this.getClass().getSimpleName();
		System.out.println(title + " is a  " + instanceType + " film !");
		
		}
	
	public static Movie getMovie(String type, String title) {
		return switch(type.toUpperCase().charAt(0)) {
			case 'A' -> new Adventure(title);
			case 'C' -> new Comedy(title);
			case 'S' -> new SF(title);
			default -> new Movie(title);
		};
	}
	}

class Adventure extends Movie{

	public Adventure(String title) {
		super(title);
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
	System.out.printf(".. %s %n".repeat(3),
			"Scena de adventura",
			"Muzica in suspans",
			"Scena finala");
	
	}
	
}

class Comedy extends Movie{

	public Comedy(String title) {
		super(title);
	}
	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
	System.out.printf(".. %s %n".repeat(3),
			"Ceva funny",
			"O gluma spusa",
			"Rasete");
	
	}
	
}

class SF extends Movie{

	public SF(String title) {
		super(title);
	}
	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
	System.out.printf(".. %s %n".repeat(3),
			"O lume noua",
			"Oras futurist",
			"Nava spatiala");
	
	}
}
