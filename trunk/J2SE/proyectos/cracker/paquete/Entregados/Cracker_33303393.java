package paquete;

import java.util.Random;

public class Cracker_33303393 implements Cracker{

public String nombre="Torres Melisa";
public static int clave;


public CajaFuerte generador;
	

	public Cracker_33303393 (){
		
	clave=0;
	}	
	
	

public String getNextKey(boolean ultima_clave_se_paso) {
	
	String cadena;
	
	if(ultima_clave_se_paso==true){
		
	cadena= String.valueOf(clave--);
	
	}
	else{
		
	cadena= String.valueOf(clave++);
		
	}
	
return cadena;	
}

public String getStudentName() {
	
	return this.nombre;
}
}