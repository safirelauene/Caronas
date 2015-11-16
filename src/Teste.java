
public class Teste {
	
	static BD bancod = new BD();
	
	public static void main(String[] args) {
		inicializaUsua();
		
		View view = new View();
		
		BuscaRotaMotorista buscRotMot = new BuscaRotaMotorista(bancod,view);
		BuscaRotaCarona buscRotCar = new BuscaRotaCarona(bancod,view);
		
		view.setR(buscRotCar);
		
		bancod.registerObserver(view);
		buscRotCar.makeRoute();
		
	}
	
	public static void inicializaUsua(){
		
		bancod.addRota(new Motorista("bosque_eucaliptos","olivo_gomes", 1));		
		bancod.addRota(new Motorista("eugenio_melo","bosque_eucaliptos",4));
		bancod.addRota(new Carona("ademar_de_barros","olivo_gomes"));
		
	}

}
