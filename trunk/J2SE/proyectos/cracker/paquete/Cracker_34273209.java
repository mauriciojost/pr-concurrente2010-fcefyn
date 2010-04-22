package paquete;
import java.util.Random;

public class Cracker_34273209 implements Cracker {
	private int clave = 0;
	String nombre;
	
	public Cracker_34273209 ()
	{
		Random random = new Random();
				
		nombre = "CARRIZO, Agustin";
		clave = random.nextInt(100);
		
			}
public void encontrarclave(String cadena, boolean b){
		if (b == true){
		cadena = String.valueOf(clave--);
		}
		else {
			cadena = String.valueOf(clave++);
		}	
		
	}

public String getNextKey(boolean ultima_clave_se_paso) {
		String cadena=String.valueOf(clave);
		this.encontrarclave(cadena, ultima_clave_se_paso);
		return cadena;
	}

	public String getStudentName() {
		return this.nombre;

	}
	
	public int getCurrentKey(){
		return clave;
	}
}
