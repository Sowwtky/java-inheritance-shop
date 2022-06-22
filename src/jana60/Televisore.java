package jana60;

public class Televisore extends Prodotto{

	private int dimensioni;
	private boolean smart;
	
	public Televisore(int codice, String nome, String marca, double prezzo, int iva, int dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDimensioni: " + dimensioni;
	}
	
	
	
	
}
