package paquete;

public class Main {
	public static void main(String[] args) {
		Pista pista;
		
		pista = new Pista();
		Corredor pichu = new Perro("Pichu");
		Corredor roque = new Perro("Roque");
		Corredor michi = new Gato ("Michi");
		
		pista.addCorredor(pichu);
		pista.addCorredor(roque);
		pista.addCorredor(michi);
		
		pista.iniciarCarrera();
	}

}
