package paquete;
import java.util.Random;


public class Cracker_34318087 implements Cracker {
	
	String name;
	int key;
	
	public Cracker_34318087 ()
	{
		Random random = new Random();
				
		name = "Garcia, Ernesto Javier";
		key =random.nextInt(500);
		
			}
	
	
	public String getStudentName() {
		return this.name;

	}


	public String getNextKey(boolean ultima_clave_se_paso) {
		
		String cadena=String.valueOf(key);
	
		this.BuscadorClave(cadena, ultima_clave_se_paso);
		
		return cadena;
		
		
	}

	public void BuscadorClave(String string, boolean indicador){
		
		if (indicador == true)
		{
		
		string = String.valueOf(key--);
		}
		else 
		{
			string = String.valueOf(key++);
		}	
		
	}
	
	
	
}

