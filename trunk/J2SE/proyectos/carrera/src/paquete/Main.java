package paquete;

public class Main {
	public static void main(String[] args) {
		
		Pista pista;
		pista = new Pista();
		
		Corredor pichu 	= 	new Perro("Pichu de Federico Bazán");
		Corredor roque 	= 	new Perro("Roque de Mauricio Jost");

		Corredor saltador = new SaltadorDeFango("Saltador de Fango");
		//Corredor dormilon = new Perezoso("Dormilon de Renzo Pisseta");
		Corredor chita = 	new Chita ("Osita de Melisa Torres");
		//Corredor ranita = new Rana("Rene de Alejandro Rueda");		
		Corredor condorito = new Buitre("Condorito");
		Corredor kintaafondo = new Gacela("ComoPinia");		
		Corredor tigre =	new Tigre("Tigre de Luis Rodriguez");
		Corredor cangrejo = new Cangrejo("Bicho de Dario Samban");
		Corredor coyote = 	new Coyote("Acme");
		Corredor Bernardo = new Dinosaurio("El Dinosaurio Bernardo");
		Corredor sonic = 	new Puercoespin("Sonic de Nico Morales XD");
		Corredor pipo = new Condor("Pipo de Agustin Carrizo");
		Corredor hp = new Caballo("MT Hourse Power");
		Corredor fox = new Zorro("Zorro Viejo de José Ribodino");
		Corredor paco = new Guanaco("Paco de José Sureda");
		Corredor leon = new Leon ("León de Julián Nonino");
		Corredor pantera = new Pantera ("Pantera de Florencia Caro");

		Corredor Poni= new Poni("ICO de Janet Soler");

		Corredor pollo=new Pollo("Pollo de Ernesto García");
		Corredor Hipopotamo = new Hipopotamo("Pumper de Aguirre Patricio");
		

		pista.addCorredor(saltador);
		pista.addCorredor(pollo);
		pista.addCorredor(hp);
		pista.addCorredor(Bernardo);
		pista.addCorredor(cangrejo);
		pista.addCorredor(chita);
		pista.addCorredor(pichu);
		pista.addCorredor(roque);
		//pista.addCorredor(dormilon);
		//pista.addCorredor(ranita);
		pista.addCorredor(condorito);
		pista.addCorredor(paco);
		pista.addCorredor(kintaafondo);
		pista.addCorredor(tigre);
		pista.addCorredor(coyote);
		pista.addCorredor(sonic);
		pista.addCorredor(pipo);
		pista.addCorredor(fox);
		pista.addCorredor(leon);
		pista.addCorredor(pantera);
		pista.addCorredor(Poni);
		pista.addCorredor(Hipopotamo);
		pista.iniciarCarrera();
		
	}

}
