package paquete;

public class Main {
	public static void main(String[] args) {
		Pista pista;
		
		pista = new Pista();
		Corredor pichu = new Perro("Pichu");
		Corredor roque = new Perro("Roque");
		Corredor picho = new PerroPicaron ("Picho");
		Corredor lapradon = new Gato("Michi");
		Corredor dormilon=new Perezoso("Dormilon");

		
		Corredor chita= new Chita ("Centella");

		Corredor ranita=new Rana("Rene");

		
		pista.addCorredor(chita);
		pista.addCorredor(pichu);
		pista.addCorredor(roque);
		pista.addCorredor(picho);
		pista.addCorredor(lapradon);
		pista.addCorredor(dormilon);
		pista.addCorredor(ranita);
	
		pista.iniciarCarrera();
	}

}
