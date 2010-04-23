package paquete;

public  class cracker_33602761 implements Cracker {

	private int clave;
	public int der=9999, izq=0,i=0;

	public String getNextKey(boolean ultima_clave_se_excedio)
	{	
		System.out.println("CLAVE:"+clave);
		//para cuando no se pasa
		if(i==0) {
			clave=5000;
		    String cadena;
			cadena =String.valueOf (clave);	
            System.out.println("nueva clave  "+cadena);
            clave= Integer.valueOf(cadena);
            i=i+1;
            return cadena;
			
		}
		
		
		else{	
	          if (ultima_clave_se_excedio==true)
				   {
	                der=clave;
		            clave=izq+(der-izq)/2;
					System.out.println("Nuevo Izquierdo "+der);
				    String cadena;
			        cadena =String.valueOf (clave);	
			        System.out.println("nueva clave  "+cadena);
			        clave= Integer.valueOf(cadena);
			        i=i+1;
			        return cadena;
		           }
			
							
    //para cuando se pasa	
		else{
			
			izq=clave;
			clave=clave +((der-izq)/2 )+1;
			System.out.println("Nuevo Derecho "+der);
			String cadena;
		    cadena =String.valueOf(clave);	
		    System.out.println("nueva clave  "+cadena);
		    clave= Integer.valueOf(cadena);
		    i=i+1;
		    return cadena;
		        }
		}
				}
	
			
	public String getStudentName(){
		return "Chiappe,Bernardo";
	}

	
}
