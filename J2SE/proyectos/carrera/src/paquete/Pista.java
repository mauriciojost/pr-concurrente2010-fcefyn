package paquete;

import java.util.HashMap;
import java.util.Iterator;

/* Clase que contiene varios corredores, y la información asociada a la posición de cada uno. */
public class Pista {
	
	private HashMap<Corredor, Integer> corredores; /* Colección de corredores agregados a la pista. */
	private int puesto=1;
	
	/* Nueva pista. */
	public Pista(){
		corredores = new HashMap<Corredor, Integer>();
	}
	
	/* Cambio de posición de un corredor en particular. 
	 * La cadena FINAL indica que se ha llegado a la meta. 
	 */
	public String setPosition(Corredor c, String position){
		Integer valor = new Integer(0); 
		
		try{
			//Algoritmo para decidir si es penalizado o avanza.
			valor = Integer.parseInt(position, 16);
		}catch(Exception e){
			e.printStackTrace();
			return "0"; /* Posición alcanzada! */
		}	
			
		if (corredores.get(c).intValue()+1 != valor.intValue()){
			valor = 0;	// Penalizado. Por vivo!
			System.out.println(c.getID() + " Penalizado!");
		}
			
		corredores.put(c, valor);	// Actualización de la posición
			String nueva_pos = Integer.toString(valor.intValue(), 16);
			
			if (valor.intValue()%100==0){
				//System.out.println(c.getID() + " en posición: " + nueva_pos);
			}
			if (valor.intValue()>(0x200000)){
			//if (valor.intValue()>100000){
				System.out.println(">>>>>>>>>>>>La pista felicita a " + c.getID() + " por llegar a la meta! Puesto: " + puesto++);
				return "FINAL"; /* Posición alcanzada! */
			}
			
			return nueva_pos;
		
	}
	
	/* Agregado de corredores. */
	public void addCorredor(Corredor corredor){
		corredores.put(corredor, 0);
		corredor.setPista(this);
	}
	
	/* Puesta en marcha de cada uno de los corredores. */
	public void iniciarCarrera(){
		Iterator<Corredor> it = corredores.keySet().iterator();
		Corredor actual;
		while(it.hasNext()){
			actual = (Corredor)it.next();
			actual.correr();
		}
	}
}
