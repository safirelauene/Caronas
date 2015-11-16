package Client;

import java.util.LinkedList;
import java.util.List;

import Server.Carona;

public class CaronaList {
	
	List<Carona> caronas = new LinkedList<Carona>();
    Connect connection = new Connect();
    
    public void getCaronas(){
    	try{
    			
    		caronas = connection.sendGetC();
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    public List<Carona> returnAllRotasC(){
        List<Carona> rotasC = new LinkedList<Carona>();
        for(Carona c: caronas){
        	rotasC.add(c);
        }
        return rotasC;
    }
}
