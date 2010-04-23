package paquete;

public class Perro extends Animal implements Corredor{
	private Pista pista;
	private int position=0;
	
	Perro(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		(new Thread(this,this.getID())).start();
	}
	
	

	@Override
	public void run() {
		while(true){
			position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position)),16);
		}
	}

	
	
	@Override
	public void setPista(Pista pista) {
		// TODO Auto-generated method stub
		this.pista = pista;
	}

	@Override
	public String getID() {
		return this.getNombre();
	}

}
