package Server;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.db4o.ObjectSet;


public class View implements Observer{
	
	private Busca r;
	private BuscaRotaCarona b1;
	private BuscaRotaMotorista b2;
	private ObjectSet result;
	
//	public void setR(Busca r){
//		this.r = r;
//	}
	
	public void setB1(BuscaRotaCarona b){
		this.b1 = b;
	}
	
	public void setB2(BuscaRotaMotorista b){
		this.b2 = b;
	}
	
	
	public void routingR(){
		b1.makeRoute();
		b2.makeRoute();
	}
	
	public void update(ObjectSet result){
		this.result = result;
	}
	
	public JSONArray generateJSON1() throws JSONException{
		JSONArray jsonResult = new JSONArray();
 	    
 	    
 	    for(Object i: this.result){
 	    	Motorista rota = (Motorista)i;
 	    	JSONObject jsonObj = new JSONObject();
 	    	try {
				jsonObj.put("saida", rota.getSaida());
				jsonObj.put("destino", rota.getDestino());
     	    	jsonObj.put("quantDisp", rota.getquantDisp());
     	    	jsonResult.put(jsonObj);
			} catch (JSONException e) {
				e.printStackTrace();
			}
 	    	
 	    }
 	    return jsonResult;
	}
	
	public JSONArray generateJSON2() throws JSONException{
		JSONArray jsonResult = new JSONArray();
 	    
 	    for(Object i: this.result){
 	    	Carona rota = (Carona)i;
 	    	
 	    	JSONObject jsonObj = new JSONObject();
 	    	try {
				jsonObj.put("saida", rota.getSaida());
				jsonObj.put("destino", rota.getDestino());
     	    	jsonResult.put(jsonObj);
			} catch (JSONException e) {
				e.printStackTrace();
			}
 	    	
 	    }
 	    return jsonResult;
	}



}
