package Client;

import java.util.LinkedList;
import java.util.List;


public class CaronaList {
	
	List<Carona> caronas = new LinkedList<Carona>();
    Connect connection = new Connect();
    
    public List<Carona> getCaronas(){
    	try{
    			
    		caronas = connection.sendGetC();
    		return caronas;
    		
    	}catch(Exception e){
    		e.printStackTrace();
    		return null;
    	}
    }
 
}
