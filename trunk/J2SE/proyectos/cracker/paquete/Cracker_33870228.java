package paquete;

public class Cracker_33870228 implements Cracker 
{
    private int clave = 5000; /* Atributo privado que representa a la clave en curso. */
	private int lim_inf = 0;
	private int lim_sup = 9999;
	private int contador=0;
	
	
	/* Obtención de la clave secuencial. */
	public String getNextKey(boolean ultima_clave_se_paso) 
	{   String cadena;
		System.out.println("Probando la clave: " + clave + "...");
	
		if(contador==0)
		{
			cadena = String.valueOf(clave);
			contador=contador+1;
			return cadena;
		}
		
		else
		{
			if (ultima_clave_se_paso)
			{
				lim_sup = clave;
				clave = lim_inf+((lim_sup-lim_inf)/2);
				cadena = String.valueOf(clave);
				contador=contador+1;
				return cadena;
			}
			else
			{
				lim_inf = clave;
				clave = lim_inf+((lim_sup-lim_inf)/2);
				cadena = String.valueOf(clave);
				contador=contador+1;
				return cadena;
			}
		}
		
		
	
	}

	/* Obtención del nombre del alumno. */
	public String getStudentName() { 
		return "CARO, Maria Florencia";
	}
	
	public int getCurrentKey(){
		return clave;
	}
}
