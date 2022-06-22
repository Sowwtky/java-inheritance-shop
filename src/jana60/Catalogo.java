package jana60;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//variabili
		int codiceProdotto, memoriaSmartphone, ivaProdotto, imeiSmartphone, dimensioniTV;
		String nomeProdotto, marcaProdotto, sceltaProdotto;
		double prezzoProdotto;
		boolean smartTV;
		
		//chiedo all'utente quanti prodotti vuole inserire
		System.out.println("Quanti prodotti vuoi inserire?");
		int scelta = Integer.parseInt(scan.nextLine());
		
		//creo array catalogo di tipo prodotto
		Prodotto[] catalogo = new Prodotto[scelta];
		
		for (int i = 0; i < catalogo.length; i++) {
			System.out.print("Inserisci il codice del prodotto: ");
			codiceProdotto = Integer.parseInt(scan.nextLine());
			System.out.print("Inserisci il nome del prodotto: ");
			nomeProdotto = scan.nextLine();
			System.out.print("Inserisci la marca del prodotto: ");
			marcaProdotto = scan.nextLine();
			System.out.print("Inserisci il prezzo del prodotto: ");
			prezzoProdotto = Double.parseDouble(scan.nextLine());
			System.out.print("Inserisci l'IVA del prodotto: ");
			ivaProdotto = Integer.parseInt(scan.nextLine());
			
			catalogo[i] = new Prodotto (codiceProdotto, nomeProdotto, marcaProdotto, prezzoProdotto, ivaProdotto);
			
			System.out.println("Ïl prodotto che stai inserendo é: \n(Digita 1) - Smartphone \n(Digita 2) - Televisore \n(Digita 3) - Cuffie");
			sceltaProdotto = scan.nextLine();
			
			switch (sceltaProdotto) {
			case "1":
				System.out.println("Hai scelto Smartphone");
				System.out.print("Inserisci la memoria dello Smartphone: ");
				memoriaSmartphone = Integer.parseInt(scan.nextLine());
				System.out.print("Inserisci il codice imei: ");
				imeiSmartphone = Integer.parseInt(scan.nextLine());
				
				catalogo[i] = new Smartphone (codiceProdotto, nomeProdotto, marcaProdotto, prezzoProdotto, ivaProdotto, memoriaSmartphone, imeiSmartphone);
				break;
			case "2":
				System.out.println("Hai scelto televisore");
				System.out.print("Inserisci le dimensioni (in pollici) del televisore: ");
				dimensioniTV = Integer.parseInt(scan.nextLine());
				System.out.print("É smart? \n(1) Si \n(2) No");
				
				
				catalogo[i] = new Smartphone (codiceProdotto, nomeProdotto, marcaProdotto, prezzoProdotto, ivaProdotto, memoriaSmartphone, imeiSmartphone);
				break;
			}
		}
		
		
		scan.close();
	}

}
