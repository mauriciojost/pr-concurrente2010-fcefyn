package paquete;
import java.lang.Math;


	public class Cracker_30353812 implements Cracker {
		private int clave = 0; 
		int a=5000;
		
		/* Obtención de la clave  */
		public String getNextKey(boolean ultima_clave_se_paso) {
			
			String cadena;
			System.out.println("Paso: " + a + " /// Clave: " + clave);
			
			if (ultima_clave_se_paso == false){
				cadena = String.valueOf(clave=clave+a);
				
				a = Math.round((a+1)/2);
			}	
			
			else{
				cadena = String.valueOf(clave=clave - a);
			
				a = Math.round((a+1)/2);
			}
			
			
			//System.out.println(a);
			//System.out.println(cadena);
			return cadena;
		}

		/* Obtención del nombre del alumno. */
		public String getStudentName() { 
			return "GALLO, CESAR";
		}
		
		public int getCurrentKey(){
			return clave;
		}
	}


