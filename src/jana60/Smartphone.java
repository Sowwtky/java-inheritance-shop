package jana60;

import java.util.Random;

public class Smartphone extends Prodotto{
	
	Random ran = new Random();
	private int imei;
	private int memoria; 
	
	public Smartphone(int codice, String nome, String marca, double prezzo, int iva, int memoria, int imei) {
		super(codice, nome, marca, prezzo, iva);
		this.memoria = memoria;
		this.imei = imei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getImei() {
		return imei;
	}
	
	
	
	
	
}
