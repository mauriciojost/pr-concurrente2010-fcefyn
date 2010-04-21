package paquete;

public class Cracker_33941256 implements Cracker {
	
	private int clave = 0;
	private int inf = 0;    //Establece el limite inferior de las posibles claves
	private int sup = 9999; //Establece el limite superior de las posibles claves
	
	public String getNextKey(boolean ultima_clave_se_paso) {
		
		//System.out.println(inf +"   "+ sup +"   "+ clave);	
		
		if(ultima_clave_se_paso == true){        //Atualiza los limites si la clave es menor a la probada
		   sup = clave;
		}
		else if(ultima_clave_se_paso == false){  //Atualiza los limites si la clave es mayor a la probada
	       inf = clave;
		}
		
		clave = (inf + sup)/2;	//Determina la nueva clave como la mitad del rango posible
		
		System.out.println("Probando la clave: " + clave + "...");
		String cadena;
		cadena = String.valueOf(clave);

		return cadena;
	}
	
	public String getStudentName() {
		return "Arlettaz, Emiliano";
	}
	
	public int getCurrentKey(){
		return clave;
	}

}
