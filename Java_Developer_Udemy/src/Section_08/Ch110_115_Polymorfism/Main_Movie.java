package Section_08.Ch110_115_Polymorfism;

import java.util.Scanner;

public class Main_Movie {

	public static void main(String[] args) {

		Movie theMovie = new Movie("Vikings !");
		theMovie.watchMovie();

		Movie theAdventure = new Adventure("Vikings !");
		theAdventure.watchMovie();

		Movie theComedy = new Comedy("Seinfield !");
		theComedy.watchMovie();

		Movie theSF = new SF("Equilibrium");
		theSF.watchMovie();

		Movie mv2 = Movie.getMovie("SF", "Spartacus");
		mv2.watchMovie();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Introduceti un tip (A pt aventura, C pt comedie, S pt SF sau Q pt a renunta !");
			String type = sc.nextLine();
			
			if("Qq".contains(type)) {
				break;
			}
			System.out.println("Introduceti titlul filmului !");
			String titlu = sc.nextLine();
			Movie movie = Movie.getMovie(type, titlu);
			movie.watchMovie();
		}
	}
}
