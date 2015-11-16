package Server;
import static spark.Spark.get;

import org.json.JSONArray;
import org.json.JSONException;

import spark.Request;
import spark.Response;
import spark.Route;

public class BuscaRotaMotorista implements Busca{
	
	public BD usuario;
	public View view;
	
	public BuscaRotaMotorista(BD usuario, View view) {
		this.usuario = usuario;
		this.view = view;
	}

	public void makeRoute(){
		
		get(new Route("/rotam") {
	         @Override
	         public Object handle(Request request, Response response) {

	     	    usuario.searchMotorista();
	     		
	     	    try {
	     	    	JSONArray jsonResult = view.generateJSON1();
	     	    	return jsonResult;
				} catch (JSONException e) {
					
					e.printStackTrace();
				}

	     	    return null;    
	     	    
	         }
	      });
		
		get(new Route("/rotas/saida/:saida") {
	         @Override
	         public Object handle(Request request, Response response) {
 
	     	    usuario.searchMotoristaSaida(request.params(":saida"));
	     		
	     	    try {
	     	    	JSONArray jsonResult = view.generateJSON1();
	     	    	return jsonResult;
				} catch (JSONException e) {
					
					e.printStackTrace();
				}

	     	    return null;    
	     	    
	         }
	      });
		
		get(new Route("/rotas/destino/:destino") {
	         @Override
	         public Object handle(Request request, Response response) {

	     	    usuario.searchMotoristaDestino(request.params(":destino"));
	     		
	     	    try {
	     	    	JSONArray jsonResult = view.generateJSON1();
	     	    	return jsonResult;
				} catch (JSONException e) {
					
					e.printStackTrace();
				}

	     	    return null;    
	     	    
	         }
	      });
		
		
		
	}
	

}
