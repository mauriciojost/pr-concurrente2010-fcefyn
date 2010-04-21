package paquete;

public class Cracker_33700254 implements Cracker{
	
	private int clave = 5000;
	private int paso = 2500;
	private boolean ClaveN=false;
	private int ini = 0;

	public String getNextKey(boolean ultimaClaveSePaso) {
		String cadena;
		cadena = String.valueOf(clave);
		System.out.println(cadena);
		if(ini == 0){
			ini = 1;
			return cadena;
		}
		
		if (test(ultimaClaveSePaso)){		
			if(ini == 1){
				paso = 1000;
				ini++;
			} else {
				paso = (paso / 10);
			}
		}
               
		while(ultimaClaveSePaso){
			ClaveN = true;
			clave = (clave - paso);
			cadena = String.valueOf(clave);
			return cadena;
		}	
				
		while(!ultimaClaveSePaso){
			ClaveN = false;
			clave = (clave + paso);
			cadena = String.valueOf(clave);
			return cadena;
		}
		
		return cadena;
	}

	public String getStudentName() {
		return "Aguirre, Patricio";
	}
	
	public boolean test (boolean ClaveAnterior){
		System.out.println("ClaveN: " + ClaveN + " /// ClaveAnterior: " + ClaveAnterior);
		if(ClaveN != ClaveAnterior){
			return true;
		} else {
			return false;
		}
		
	}

}
