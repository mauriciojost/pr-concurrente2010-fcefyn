package paquete;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pista pista;
		pista = new Pista();
		Corredor pichu = new Perro("pichu");
		pista.addCorredor(pichu);
		pista.iniciarCarrera();
	}

}
