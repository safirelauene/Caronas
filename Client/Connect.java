package Client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class Connect {
	
	public List<Motorista> sendGetM() throws IOException, JSONException{
		StringBuilder result = new StringBuilder();
		String url = "http://127.0.0.1:4567/rotam";
		URL obj = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection) obj.openConnection();
        InputStream in = urlConnection.getInputStream();
        InputStreamReader isw = new InputStreamReader(in);
        int data = isw.read();
        while (data != -1) {
            char current = (char) data;
            data = isw.read();
            result.append(current);
        }
		List<Motorista> m = transformaJSONMotorista(new JSONArray(result.toString()));
		
		return m;
	}
	
	public List<Carona> sendGetC() throws IOException, JSONException{
		StringBuilder result = new StringBuilder();
		String url = "http://127.0.0.1:4567/rotac";
		URL obj = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection) obj.openConnection();
        InputStream in = urlConnection.getInputStream();
        InputStreamReader isw = new InputStreamReader(in);
        int data = isw.read();
        while (data != -1) {
            char current = (char) data;
            data = isw.read();
            result.append(current);
        }
		
		List<Carona> c = transformaJSONCarona(new JSONArray(result.toString()));
		return c;
	}
	
	public List<Motorista> transformaJSONMotorista(JSONArray response){
		
		List<Motorista> motoristas = new LinkedList<Motorista>(); 

        try 
        {
            for (int i = 0; i < response.length(); i++) {
                JSONObject obj = response.getJSONObject(i);
                motoristas.add(new Motorista(obj.getString("saida"), obj.getString("destino"), obj.getInt("quantDisp")));
            }
            
        } catch (JSONException e) {
            // handle exception
        }
		
		return motoristas;
	}
	
	public List<Carona> transformaJSONCarona(JSONArray response){
		
		List<Carona> caronas = new LinkedList<Carona>(); 

        try 
        {
            for (int i = 0; i < response.length(); i++) {
                JSONObject obj = response.getJSONObject(i);
                caronas.add(new Carona(obj.getString("saida"), obj.getString("destino")));
            }
            
        } catch (JSONException e) {
            // handle exception
        }
		
		return caronas;
	}

}
