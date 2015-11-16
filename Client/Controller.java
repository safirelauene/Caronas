package Client;

import java.util.ArrayList;
import java.util.List;


public class Controller {
	
	MotoristaList motoristas;
	CaronaList caronas;
	View view ;
	String textoM;
	String textoC;
	
	public void inicializa(){
		motoristas = new MotoristaList();
		caronas = new CaronaList();	
		chamaRotasMotoristas();
		chamaRotasCaronas();
		view = new View();
		view.gerarFrame(textoM,textoC);	
		
	}
	
	public void chamaRotasMotoristas(){
		
		textoM = "";
		
		List<Motorista> resultM = motoristas.getMotoristas();
		
		for(Motorista valorM : resultM){
			textoM = textoM+"Saída: "+valorM.getSaida()+"; Destino: "+valorM.getDestino()+"; Vagas Disponíveis: "+valorM.getquantDisp()+". \n";
		}
		
		
	}
		
	public void chamaRotasCaronas(){
		textoC = "";
		
		List<Carona> resultC = caronas.getCaronas();
		
		for(Carona valorC : resultC){
			textoC = textoC+"Saída: "+valorC.getSaida()+"; Destino: "+valorC.getDestino()+"; \n";
		}
		
	}
	
	
	
	
	
}
