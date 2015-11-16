package Client;

public class Motorista {
	
	@Override
	public String toString() {
		return "Motorista [saida=" + saida + ", destino=" + destino + ", quantDisp=" + quantDisp + "]";
	}

	private String saida;
	private String destino;
	private int quantDisp;
	
	
	public Motorista(String saida, String destino, int quantDisp) {
		this.saida = saida;
		this.destino = destino;
		this.quantDisp = quantDisp;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public int getquantDisp() {
		return quantDisp;
	}

	public void setquantDisp(int quantDisp) {
		this.quantDisp = quantDisp;
	}
}
