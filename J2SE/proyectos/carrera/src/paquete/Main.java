package paquete;

public class Main {
	public static void main(String[] args) {
		
		Pista pista;
		pista = new Pista();
		
		Corredor pichu 	= 	new Perro("Pichu de Federico Bazán");
		Corredor roque 	= 	new Perro("Roque de Mauricio Jost");

		Corredor dormilon =	new Perezoso("Dormilon de Renzo Pisseta");		
		Corredor chita = 	new Chita ("Osita de Melisa Torres");
		//Corredor ranita =	new Rana("Rene de Alejandro Rueda");		
		Corredor condorito = new Buitre("Condorito");
		Corredor kintaafondo = new Gacela("ComoPinia");		
		Corredor tigre =	new Tigre("Tigre de Luis Rodriguez");
		Corredor cangrejo = new Cangrejo("Bicho de Dario Samban");
		Corredor coyote = 	new Coyote("Acme");
		Corredor Bernardo = new Dinosaurio("El Dinosaurio Bernardo");
		Corredor sonic = 	new Puercoespin("Sonic de Nico Morales");
		Corredor pipo = new Condor("Pipo de Agustin Carrizo");
		
		pista.addCorredor(Bernardo);
		pista.addCorredor(cangrejo);
		pista.addCorredor(chita);
		pista.addCorredor(pichu);
		pista.addCorredor(roque);
		pista.addCorredor(dormilon);
		//pista.addCorredor(ranita);
		pista.addCorredor(condorito);
		pista.addCorredor(kintaafondo);
		pista.addCorredor(tigre);
		pista.addCorredor(coyote);
		pista.addCorredor(sonic);
		pista.addCorredor(pipo);
		pista.iniciarCarrera();
	}

}
