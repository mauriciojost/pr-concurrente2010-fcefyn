package paquete;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.*;

/*
 * Clase CajaFuerte. 
 * Genera una clave secreta.
 * Hace test de Crackers. 
 */
public class CajaFuerte {
	
	private int clave;
	private Vector<Cracker> crackersVector;
	private boolean ultima_clave_se_excedio;
	
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
		System.out.println("Cracker agregado: " + c.getStudentName() + " ("+ c.getClass().getSimpleName() +").");
		this.crackersVector.add(c);
	}
	
	/* Realiza un test (iterando tantas veces como 'n_iteraciones') de todos los
	 * crackers agregados.  
	 */
	public void testCrackers(int n_iteraciones){
		Iterator<Cracker> iterator; 
		Cracker cracker;
		
		ArrayList<Object[]> tablaDeResultados = new ArrayList<Object[]>();
		
		iterator = crackersVector.iterator();
		
		/* Test de cada Cracker. */
		while(iterator.hasNext()){
			cracker = (Cracker)iterator.next(); /* Obtención del próximo Cracker disponible. */
			testOneCracker(cracker, n_iteraciones, tablaDeResultados, clave);
		}

		sortResults(tablaDeResultados);
		printResults(tablaDeResultados);
	}
	
	/* Imprime el resultado de cierto test. */
	private void printResults(ArrayList<Object[]> resultados){
		Iterator<Object[]> it = resultados.iterator();
		
		while (it.hasNext()){
			Object[] next = (Object[])it.next();
			System.out.println((Integer)next[0] + " " + (String)next[1]);
		}
		
	}
	
	/* Ordena los tests según la cantidad de iteraciones de cada Cracker. */
	private void sortResults(ArrayList<Object[]> resultados){
		System.out.print("\n\n\n\n");
		
		Comparator<Object[]> comp = new Comparator<Object[]>(){

			@Override
			public int compare(Object[] arg0, Object[] arg1) {
				Integer integ1 = (Integer)arg0[0];
				Integer integ2 = (Integer)arg1[0];
				return (integ1.intValue() - integ2.intValue());
				
			}};
		
		Collections.sort(resultados, comp);
	}
	
	private void agregarResultado(ArrayList<Object[]> r, String nombre, int iteraciones){
		Object[] obj = new Object[2];
		/* Formato: 
		 *  [0] Integer(iteraciones) 
		 *  [1] Resumen 
		 */
		obj[0] = new Integer(iteraciones);
		obj[1] = nombre;
		//System.out.println("Nuevo resultado: " + nombre + ", iteraciones " + iteraciones);
		r.add(obj);
	}
	
	public void testOneCracker(Cracker cracker, int n_iteraciones, ArrayList<Object[]> resultados, int esta_clave){
		/* Realiza 'n_iteraciones' sobre el Cracker actual. */
		String clave_obtenida_str;
		int clave_obtenida_int, i;
		
		/* Redirigir la salida para omitir la impresión de mensajes. */
		java.io.PrintStream old_out = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		
		ultima_clave_se_excedio = false;	/* Inicialización de variables para un nuevo cracker. */
		
		if ((esta_clave%1000)==0){
			System.out.print(esta_clave + "->");
		}
		for(i=0;i<n_iteraciones;i++){
			
			System.setOut(ps);
			try {baos.flush();} catch (IOException e) {e.printStackTrace();}
			clave_obtenida_str = cracker.getNextKey(ultima_clave_se_excedio);
			System.setOut(old_out);
			
			clave_obtenida_int = Integer.valueOf(clave_obtenida_str);
			ultima_clave_se_excedio = (clave_obtenida_int>esta_clave);
			
			if (clave_obtenida_int==esta_clave){
				/* Se encontró la clave. */
				//System.out.println("Cracker de " + cracker.getStudentName() + " descifró la clave en la iteración número: " + i +".");
				agregarResultado(resultados, cracker.getStudentName() + " (clave=" +esta_clave+")", i);
				break;
			}
		}
		
		/* Analiza condición de salida del test del cracker actual. */
		if (i>=n_iteraciones){ 
			/* No se encontró la clave en 'n_iteraciones' iteraciones. */
			//System.out.println("Cracker de " + cracker.getStudentName() + " no descifró la clave en " + (i+1) + " intentos...");
			agregarResultado(resultados, cracker.getStudentName(), i);
		}
		
	}
	
	private float getAverageIterationsValue(ArrayList<Object[]> resultados){
		Iterator<Object[]> it = resultados.iterator();
		long acumulador=0;
		int cant_resultados=0;
		Object[] resultado;
		while(it.hasNext()){
			resultado = (Object[])it.next();
			acumulador = acumulador + ((Integer)resultado[0]).intValue();
			cant_resultados++;
		}
		return ((float)acumulador)/cant_resultados;
	}
	
	public void fullTestCracker(Cracker cracker){
		int i;
		float avr;
		ArrayList<Object[]> resultados = new ArrayList<Object[]>();
		Class classCracker = cracker.getClass();
		Constructor[] constr = (Constructor[])classCracker.getConstructors();
		
		Cracker cr;
		System.out.print("\nTesteando cracker " + cracker.getStudentName() + ". Claves: ");
		try{
			for(i=0;i<10000;i++){
				cr = (Cracker)constr[0].newInstance((Object[])null);
				this.testOneCracker(cr, 10000, resultados, i);
				//agregarResultado(resultados, "a", 20);
			}
		}catch(Exception ex){
			System.out.println("No se ha encontrado el constructor por defecto...");
			ex.printStackTrace();
		}
		
		avr = getAverageIterationsValue(resultados);
		
		System.out.print("\nFin. Cracker: " + cracker.getStudentName() +" -> Iteraciones promedio: " + avr + "\n");
	}
	

}

