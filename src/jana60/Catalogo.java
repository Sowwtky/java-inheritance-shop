package jana60;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanti prodotti vuoi inseri?");
		int scelta = Integer.parseInt(scan.nextLine());
		Prodotto[] prodotti = new Prodotto[scelta];
		
		for (int i = 0; i < prodotti.length; i++) {
			System.out.println("Inserisci il nome del prodotto: ");
			
		}
		
		
		scan.close();
	}

}
