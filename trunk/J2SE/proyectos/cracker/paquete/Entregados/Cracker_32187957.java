package paquete;

public class Cracker_32187957 implements Cracker {
private int clave=5000; 		/*primera clave de prueba*/
private boolean primera=true;	/*falg que indica si se corre por primera vez el metodo getNextKey*/
private int max=10000;
private int min=0;
	
	public String getNextKey(boolean ultimaClaveSePaso) {
		String cadena;
		System.out.println("la ultima se paso? "+ultimaClaveSePaso);
		if(!primera)						/*La primera vuelta no ejecuta lo siguiente*/
			{
			if (ultimaClaveSePaso)
				{max=clave; 				/*el max es el valor anterior*/
				clave=((max-min)/2)+min;	
				}
			else
				{min=clave;					/*el minimo es el valor anterior*/
				 clave=((max-min)/2)+min;
				}
			}
		primera=false;	
		
		cadena = String.valueOf(clave);
			
		System.out.println("La clave generada es: "+cadena);
		return cadena;
		}
	
	public String getStudentName() {
		return "RODRIGUEZ,Luis";
	}

}
