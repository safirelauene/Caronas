package Client;

import java.util.LinkedList;
import java.util.List;

import Server.Motorista;

public class MotoristaList {

    List<Motorista> motoristas = new LinkedList<Motorista>();
    Connect connection = new Connect();
    
    public void getMotoristas(){
    	try{
    			
    		motoristas = connection.sendGetM();
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    public List<Motorista> returnAllRotasM(){
        List<Motorista> rotasM = new LinkedList<Motorista>();
        for(Motorista m : motoristas){
        	rotasM.add(m);
        }
        return rotasM;
    }
	
}
