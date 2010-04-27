package paquete;

public class Condor extends Animal implements Corredor{
	protected Pista pista;
	protected int position=0;
	
	Condor(String nombre) {
		super(nombre);
	}
	
	public void correr() {
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread nuevo_hilo = (new Thread(runab,nombre_hilo));
		nuevo_hilo.start();
	}
	
	@Override
	public void run() {
		try{
			while(true){
				position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+1)),9);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". Llegue!!! ohhh!");
		}
	}
	
	
	public void setPista(Pista pista) {
		this.pista = pista;
	}
	
	public String getID() {
		return this.getNombre();
	}
	
	
}
