package paquete;

public class Cracker_33320188 implements Cracker{
	private int sup, inf;
	private int clave;
	private boolean primeraVez;
	
	public Cracker_33320188(){
		primeraVez=true;
		//Limites del intervalo al comienzo:
		sup=10000;
		inf=0;
		//Primer valor que se va a probar:
		}
	
	public String getNextKey(boolean ultimaClaveSePaso) {
		//Se reduce el intervalo de búsqueda según el resultado anterior
		if(!primeraVez){
					if(!ultimaClaveSePaso) inf=clave;
					else sup=clave;
		}
		//Y el numero arriesgado es la mitad del intervalo
		clave=(sup+inf)/2;
		
		primeraVez=false;
		
		//System.out.println("Probando la clave: " + clave + "...");
		String cadena = String.valueOf(clave);
		return cadena;
	}

	public String getStudentName() {
		return "[ORTIZ, Javier]";
	}

}
