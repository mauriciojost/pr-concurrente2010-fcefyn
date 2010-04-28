package paquete;


public class Jirafa extends Animal implements Corredor{
	
	private int posicion=0;
	private Pista pista;
	String posstring;
	

	public Jirafa(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr() {
		
		Thread hilo_corredor = (new Thread(this));
		hilo_corredor.start();
	}

	@Override
	public String getID() {
		return this.getNombre();
	}

	@Override
	public void setPista(Pista pista) {
		this.pista=pista;
		
	}

	@Override
	public void run() {
		boolean corriendo=true;
		while(corriendo){
			posicion=posicion+1;
			posstring = pista.setPosition(this, Integer.toHexString(posicion));
			corriendo=posstring!="FINAL";
			
			
		
		}
		
	}

}
