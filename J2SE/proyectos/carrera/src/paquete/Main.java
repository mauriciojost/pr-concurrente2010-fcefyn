package paquete;

public class Main {
	public static void main(String[] args) {
		Pista pista;
		pista = new Pista();
		Corredor pichu = new Perro("pichu");
		pista.addCorredor(pichu);
		pista.iniciarCarrera();
	}

}
