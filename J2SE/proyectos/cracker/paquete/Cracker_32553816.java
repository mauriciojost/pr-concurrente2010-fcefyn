package paquete;

public class Cracker_32553816 implements Cracker {
	private int key;
	private int max_value = 9999;
	private int min_value = 0;
	private int contador = 0;
	
	public Cracker_32553816(){
		key = max_value/2;
	}


	public String getNextKey(boolean ultimaClaveSePaso) {
		if(contador == 0){
			System.out.println("Probando la clave: " + key + "...");
			contador++;
			return String.valueOf(key);
		}
		else{
			if(ultimaClaveSePaso){
				max_value = key;
				key = (max_value - min_value)/2 + min_value;
				contador++;
				System.out.println("Probando la clave: " + key + "...");
				return String.valueOf(key);
			}
			else{
				min_value = key;
				key = (max_value - min_value)/2 + min_value;
				contador++;
				System.out.println("Probando la clave: " + key + "...");
				return String.valueOf(key);
			}
		}
	}

	public String getStudentName() {
		return "Furey, Ignacio";
	}
	
	public int getCurrentKey(){
		return key;
	}

}