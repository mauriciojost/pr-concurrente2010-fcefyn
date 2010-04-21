package paquete;

public  class Cracker_32943329 implements Cracker {

	private int clave;
	public int desp=9999, ant=0, i=0;

	public String getNextKey(boolean ultima_clave_se_excedio)
	{	
		System.out.println("CLAVE:"+clave);

		//PARA CUANDO NO SE PASA
		if(i==0) {
			clave=5000;
		    String cadena;
			cadena=String.valueOf (clave);	
            System.out.println("Nueva CLAVE  "+cadena);
            clave=Integer.valueOf(cadena);
            i=i+1;
            return cadena;		
		}
		
		else{	
	          if (ultima_clave_se_excedio==true)
				   {
	                desp=clave;
		            clave=ant+(desp-ant)/2;
					System.out.println("Nuevo Izquierdo "+desp);
				    String cadena;
			        cadena=String.valueOf (clave);	
			        System.out.println("Nueva CLAVE  "+cadena);
			        clave=Integer.valueOf(cadena);
			        i=i+1;
			        return cadena;
		           }
							
        //PARA CUANDO SE PASA
		else{
			
			ant=clave;
			clave=clave +((desp-ant)/2 )+1;
			System.out.println("Nuevo Derecho "+desp);
			String cadena;
		    cadena=String.valueOf(clave);	
		    System.out.println("Nueva CLAVE  "+cadena);
		    clave=Integer.valueOf(cadena);
		    i=i+1;
		    return cadena;
		    }
		}
	}

			
	public String getStudentName(){
		return "FOCHINI,Gabriela";
	}
}
