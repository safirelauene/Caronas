package Server;
import static spark.Spark.get;

import org.json.JSONArray;
import org.json.JSONException;

import spark.Request;
import spark.Response;
import spark.Route;


public class BuscaRotaCarona implements Busca {
	public BD usuario;
	public View view;
	
	public BuscaRotaCarona(BD usuario, View view) {
		this.usuario = usuario;
		this.view = view;
	}

	public void makeRoute(){
		get(new Route("/rotac") {
	         @Override
	         public Object handle(Request request, Response response) {

	     	    usuario.searchCarona();
	     		
	     	    try {
	     	    	JSONArray jsonResult = view.generateJSON2();
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

	     	    usuario.searchCaronaSaida(request.params(":saida"));
	     		
	     	    try {
	     	    	JSONArray jsonResult = view.generateJSON2();
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

	     	    usuario.searchCaronaDestino(request.params(":destino"));
	     		
	     	    try {
	     	    	JSONArray jsonResult = view.generateJSON2();
	     	    	return jsonResult;
				} catch (JSONException e) {
					
					e.printStackTrace();
				}

	     	    return null;    
	     	    
	         }
	      });
		
	}

}
