package Server;
import java.util.LinkedList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Constraint;
import com.db4o.query.Query;


public class BD {
	private List<Observer> observers = new LinkedList<Observer>();
	ObjectContainer motoristas  = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "../bd.db4o");
	ObjectContainer caronas  = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "../bd2.db4o");
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void notifyObservers(ObjectSet result){
		for(Observer o : observers){
			o.update(result);
		}
	}
	
	public void addRota(Motorista m){
		motoristas.store(m);
	}
	
	public void addRota(Carona c){
		caronas.store(c);
	}
	
	public void searchMotorista(){
		Query query=motoristas.query();
	    ObjectSet result = query.execute();
		notifyObservers(result);	
	}
	
	public void searchMotoristaSaida(String saida){
		Query query=motoristas.query();
		query.descend("saida").constrain(saida);
	    ObjectSet result = query.execute();
	    
		notifyObservers(result);
	}
	
	public void searchMotoristaDestino(String destino){
		Query query=motoristas.query();
		query.descend("destino").constrain(destino);
	    ObjectSet result = query.execute();
	    
		notifyObservers(result);
	}
	
	public void searchCarona(){
		Query query=caronas.query();
	    ObjectSet result = query.execute();
		notifyObservers(result);
	}
	
	public void searchCaronaSaida(String saida){
		Query query=caronas.query();
		query.descend("saida").constrain(saida);
	    ObjectSet result = query.execute();
	    
		notifyObservers(result);
	}
	
	public void searchCaronaDestino(String destino){
		Query query=caronas.query();
		query.descend("destino").constrain(destino);
	    ObjectSet result = query.execute();
	    
		notifyObservers(result);
	}

}
