package jana60;

import java.text.DecimalFormat;

public class Prodotto {

	DecimalFormat df = new DecimalFormat("####.0#€");
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;
	
	public Prodotto(int codice, String nome, String marca, double prezzo, int iva){
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}
	
	public String prezzoIva() {
		return df.format(prezzo + (prezzo/100) * iva);
	}

	@Override
	public String toString() {
		return "Nome prodotto: " + nome 
				+ "\nCodice: " + codice 
				+ "\nMarca: " + marca
				+ "\nPrezzo: " + df.format(prezzo)
				+ "\nIva: " + iva + "%"
				+ "\nPrezzo finale: " + prezzoIva();
		
	}
	
	
}

