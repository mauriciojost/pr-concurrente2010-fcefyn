package paquete;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer b = new Buffer(20);
		Writer w = new Writer(b);
		Reader r = new Reader(b);
		new Thread(w).start();
		new Thread(r).start();
	}

}
