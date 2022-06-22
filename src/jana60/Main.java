package jana60;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		int codice = rand.nextInt(999999999);
		String nome = "iPhone";
		String marca = "Apple";
		double prezzo = 999.99;
		int iva = 22;
		int imei = rand.nextInt();
		int memoria = 256;
		
		Prodotto telefono = new Prodotto(codice, nome, marca, prezzo, iva);
		
		System.out.println(telefono.toString());
		
		Smartphone iphone = new Smartphone(codice, nome, marca, prezzo, iva, memoria, imei);
		
		System.out.println(iphone.toString());
		
		
		
		
				

	}

}
