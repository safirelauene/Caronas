package Client;

import java.util.LinkedList;
import java.util.List;


public class MotoristaList {

    List<Motorista> motoristas = new LinkedList<Motorista>();
    Connect connection = new Connect();
    
    public List<Motorista> getMotoristas(){
    	try{
    			
    		motoristas = connection.sendGetM();
    		return motoristas;
    		
    	}catch(Exception e){
    		e.printStackTrace();
    		return null;
    	}
    }
    
    
	
}
