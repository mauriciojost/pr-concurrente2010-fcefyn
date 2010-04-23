package paquete;

import java.util.Iterator;
import java.util.Vector;

/* Clase que contiene varios corredores, y la información asociada a la posición de cada uno. */
public class Pista {
	
	private Vector<Corredor> corredores; /* Colección de corredores agregados a la pista. */
	
	/* Nueva pista. */
	public Pista(){
		corredores = new Vector<Corredor>();
	}
	
	/* Cambio de posición de un corredor en particular. */
	public String setPosition(Corredor c, String position){
		
		//Algoritmo para decidir si es penalizado o avanza.
		Integer valor = Integer.parseInt(position, 16);
		String str = Integer.toString(valor.intValue()+1, 16);
		System.out.println("El corredor " + c.getID() + " se encuentra en: " + position);
		return str;
	}
	
	/* Agregado de corredores. */
	public void addCorredor(Corredor corredor){
		corredores.add(corredor);
		corredor.setPista(this);
	}
	
	/* Puesta en marcha de cada uno de los corredores. */
	public void iniciarCarrera(){
		Iterator<Corredor> it = corredores.iterator();
		Corredor actual;
		while(it.hasNext()){
			actual = (Corredor)it.next();
			actual.correr();
		}
	}
}
