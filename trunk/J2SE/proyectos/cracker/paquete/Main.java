package paquete;

public class Main {

	public static void main(String[] args) {
		
		CajaFuerte caja 	= new CajaFuerte(185); 
		Cracker cracker_seq = new SequentialCracker();
		//Cracker miCracker 	= new MiCracker();
		
		caja.addCracker(cracker_seq);
		//caja.addCracker(miCracker);
		
		caja.testCrackers(10000);
	}
}
