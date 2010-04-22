package paquete;

public class Cracker32763326 implements Cracker{

private int clave = 0;
private static int ideaS = 9999;
private static int ideaI = 0;
private boolean primeraVez = true;

	
	public String getNextKey(boolean ultima_clave_se_paso) {
		
		clave = (ideaS-ideaI)/2;
		
		if(!primeraVez){	
		
			if(ultima_clave_se_paso){
								 	ideaS = ideaS - clave;
								 	clave = ((ideaS-ideaI)/2)+ideaI;
			}else{
				ideaI = ideaI + clave;
				clave = ((ideaS-ideaI)/2)+ideaI;
			}
		}
		
		System.out.println("Probando la clave: " + clave + "...");
		primeraVez = false;
		String cadena;
		cadena = String.valueOf(clave++);
		return cadena;
	}

	public String getStudentName() { 
		return "Morales, Nicolás Esteban";
	}
	
	public int getCurrentKey(){
		return clave;
	}
}
