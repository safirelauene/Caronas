
public class Carona {
	@Override
	public String toString() {
		return "Carona [saida=" + saida + ", destino=" + destino + "]";
	}

	private String saida;
	private String destino;
	
	
	
	public Carona(String saida, String destino) {
		this.saida = saida;
		this.destino = destino;
		
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
}
