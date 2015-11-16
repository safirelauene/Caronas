package Client;

import Server.Carona;
import Server.Motorista;

public class Main {

	public static void main(String[] args) {
	
		MotoristaList motoristas = new MotoristaList();
		CaronaList caronas = new CaronaList();
		
		motoristas.getMotoristas();
		
		
		caronas.getCaronas();
		for (Carona c: caronas.returnAllRotasC()){
			System.out.println(c);
		}
		
//		for(Motorista m : motoristas.returnAllRotasM()){
//			System.out.println(m);
//		}
		
		
	}

}
