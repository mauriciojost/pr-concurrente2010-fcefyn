package paquete;

import java.util.*;

/*
 * Clase CajaFuerte. 
 * Genera una clave secreta.
 * Hace test de Crackers. 
 */
public class CajaFuerte {
	
	private int clave;
	private Vector<Cracker> crackersVector;
	
	/* Si es -1, se genera aleatoriamente. Caso contrario se toma la entregada. */
	public CajaFuerte(int clave){
		crackersVector = new Vector<Cracker>();
		Random rnd = new Random();
		if (clave>-1){
			this.clave = Math.abs(clave)%10000;
		}else{
			this.clave = rnd.nextInt(10000);
		}
		System.out.println("CajaFuerte creada. Clave secreta: " + this.clave);
	}
	
	/* Agrega un cracker a la caja fuerte. */
	public void addCracker(Cracker c){
		this.crackersVector.add(c);
	}
	
	/* Realiza un test (iterando tantas veces como 'n_iteraciones') de todos los
	 * crackers agregados.  
	 */
	public void testCrackers(int n_iteraciones){
		Iterator<Cracker> iterator; 
		Cracker cracker;
		String clave_obtenida_str;
		int clave_obtenida_int, i;
		boolean ultima_clave_se_excedio;
		
		iterator = crackersVector.iterator();
		
		/* Test de cada Cracker. */
		while(iterator.hasNext()){
			
			cracker = (Cracker)iterator.next(); /* Obtención del próximo Cracker disponible. */
			ultima_clave_se_excedio = false;	/* Inicialización de variables para un nuevo cracker. */
			
			/* Realiza 'n_iteraciones' sobre el Cracker actual. */
			for(i=0;i<n_iteraciones;i++){ 
				clave_obtenida_str = cracker.getNextKey(ultima_clave_se_excedio);
				clave_obtenida_int = Integer.valueOf(clave_obtenida_str);
				ultima_clave_se_excedio = (clave_obtenida_int>clave);
				
				/*if ((clave_obtenida_int>clave)){
					ultima_clave_se_excedio = true;
				}else{
					ultima_clave_se_excedio = false;
				}*/
				
				
				if (clave_obtenida_int==clave){
					/* Se encontró la clave. */
					System.out.println("Cracker de " + cracker.getStudentName() + " descifró la clave en la iteración número: " + i +".");
					break;
				}
				
			}
			
			/* Analiza condición de salida del test del cracker actual. */
			if (i>=n_iteraciones){ 
				/* No se encontró la clave en 'n_iteraciones' iteraciones. */
				System.out.println("Cracker de " + cracker.getStudentName() + " no descifró la clave en " + (i+1) + " intentos...");
			}
			
		}
	}

}
