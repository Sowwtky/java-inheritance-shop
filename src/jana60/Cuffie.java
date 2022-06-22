package jana60;

public class Cuffie extends Prodotto{
	
	private String colore;
	private boolean wireless;
	
	
	
	public Cuffie(int codice, String nome, String marca, double prezzo, int iva, String colore) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	
	
	

}
