package paquete;

import java.util.Iterator;
import java.util.Vector;

public class Pista {
	
	private Vector<Corredor> corredores;
	
	public Pista(){
		corredores = new Vector<Corredor>();
	}
	
	public String setPosition(Corredor c, String position){
		
		//Algoritmo para decidir si es penalizado o avanza.
		System.out.println("El corredor " + c.getID() + " se encuentra en: " + position);
		Integer valor = Integer.parseInt(position, 16);
		String str = Integer.toString(valor.intValue()+1, 16);
		return str;
		
	}
	
	public void addCorredor(Corredor corredor){
		corredores.add(corredor);
		corredor.setPista(this);
	}
	
	public void iniciarCarrera(){
		Iterator it = corredores.iterator();
		Corredor actual;
		while(it.hasNext()){
			actual = (Corredor)it.next();
			actual.correr();
		}
	}

}
