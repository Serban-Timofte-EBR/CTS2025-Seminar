package DP.Comportamentale.ChainOfResponsability.Restaurant;

public class Comanda {
	private String produs;
	private int cantitate;
	private int grad;//am atasat un grad de dificultate ca sa stiu cine poate executa aceasta comanda
	
	public Comanda(String produs, int cantitate, int grad) {
		this.produs = produs;
		this.cantitate = cantitate;
		this.grad = grad;
	}

	public String getProdus() {
		return produs;
	}

	public int getCantitate() {
		return cantitate;
	}

	public int getGrad() {
		return grad;
	}
}
