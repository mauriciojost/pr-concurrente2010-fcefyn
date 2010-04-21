package paquete;

/* Clase que implementa Cracker. */


public class Cracker_200404117 implements Cracker {
	
	
	//private int clave = 0; /* Atributo privado que representa a la clave en curso. */
    public int k=0;
    public int bandera=0;
	public int izq=0;	
	public int derecha =10000;
	public int mid;
	
	
	public String getNextKey(boolean ultima_clave_se_paso) {
	
		String cadena;
		
		
		    
			if(bandera == 0)
			{mid=(izq+derecha)/2;
			
			bandera ++;
			k++;
			cadena = String.valueOf(mid);
			
			
			System.out.println("la bandera esta en "+bandera);
			System.out.println("middddddddd en primer if "+String.valueOf(mid));
			System.out.println(k +")"+ultima_clave_se_paso+"El mid es =" + cadena+" el derecha es ="+derecha+"el izq="+izq);
			
			return cadena;
			}
		
			else
			{    
			      if (ultima_clave_se_paso == true)// mid>clave
			      derecha=mid-1;
			      else
			      izq=mid+1;
			}
			
			mid=(izq+derecha)/2;
			cadena = String.valueOf(mid);
			k++;
			System.out.println(k +")"+ultima_clave_se_paso+"El mid es =" + cadena+"el derecha es ="+derecha+"el izq="+izq);
			
		
		
		return cadena;
	}
	
	/* Obtención del nombre del alumno. */
	
	public String getStudentName() { 
		return "Prados, Santiago ";
	}
	
	public int getCurrentKey(){
		return mid;
	}
}