package paquete;

public class Main {

	public static void main(String[] args) {
		
		CajaFuerte caja 	= new CajaFuerte(1487); 
		Cracker cracker_seq = new SequentialCracker();
		//Cracker miCracker 	= new MiCracker();
		
		caja.addCracker(cracker_seq);
		caja.addCracker(new paquete.Cracker_200204474());
		caja.addCracker(new paquete.Cracker_200204946());
		caja.addCracker(new paquete.Cracker_200404117());
		caja.addCracker(new paquete.Cracker_30353812());
		caja.addCracker(new paquete.Cracker_30995308());
		caja.addCracker(new paquete.Cracker_32187957());
		caja.addCracker(new paquete.Cracker_32578216());
		caja.addCracker(new paquete.Cracker_32943329());
		caja.addCracker(new paquete.Cracker_33242359());
		caja.addCracker(new paquete.Cracker_33303393());
		caja.addCracker(new paquete.Cracker_33320188());
		caja.addCracker(new paquete.Cracker_33700254());
		caja.addCracker(new paquete.Cracker_33870228());
		caja.addCracker(new paquete.Cracker_33941256());
		caja.addCracker(new paquete.cracker_33959924());
		caja.addCracker(new paquete.Cracker_34189197());
		caja.addCracker(new paquete.Cracker_34346712());
		caja.addCracker(new paquete.Cracker_34441188());
		caja.addCracker(new paquete.Cracker_200305601());
		caja.addCracker(new paquete.Cracker_32079839());
		caja.addCracker(new paquete.Cracker_33082634());
		
		caja.testCrackers(10000);
	}
}
