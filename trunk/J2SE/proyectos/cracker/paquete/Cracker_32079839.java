package paquete;
 
public class Cracker_32079839 implements Cracker{ 

	private int clave=0, Max=10000, Min=0; 
 
		public String getNextKey(boolean ultima_clave_se_paso) {

			if(ultima_clave_se_paso==true){
					Max=clave;
        	}
                        
			else if (ultima_clave_se_paso==false) {
					Min=clave;
			}
            
			clave=(Min+(Max-Min)/2);

			String cadena;
			cadena = String.valueOf(clave);
			return cadena;
		}
			
		public String getStudentName() {
			return "RIBODINO, José";
		}
			
		public int getCurrentKey(){
			return clave;
		}
}