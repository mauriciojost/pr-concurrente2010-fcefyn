package paquete;


public class Cracker_200404576 implements Cracker {
    private int max=10000;
    private int min=0;
    private int clave =0;


	public String getNextKey(boolean ultima_clave_se_paso) {
		System.out.println("Probando la clave: " + clave + "...");
		String cadena;

		if (ultima_clave_se_paso == true){
                    max=clave;}
                else{
                   min=clave;}

                clave=((max+min)/2);
                cadena = String.valueOf(clave);
                return cadena;
	}


	public String getStudentName() {
		return "Esperanza, Manuel";
	}

	public int getCurrentKey(){
		return clave;
	}
}