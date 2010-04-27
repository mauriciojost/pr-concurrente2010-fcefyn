package paquete;

public class Dinosaurio extends Animal implements Corredor {
	protected Pista pista;
	protected int position = 0;
	
	Dinosaurio(String nombre) {
		super(nombre);
			}
	public void correr() {
		Runnable runab = this; 
		Thread hilo = (new Thread(runab,this.getNombre()));
		hilo.setPriority(10);
		hilo.start();
	}
	public String getID() {
		return (this.getNombre());
	}
	public void setPista(Pista pista) {
		this.pista = pista;
	}
	public void run() {
		try{ while(true){
				position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+1)));
			             }
		    }
		catch(NumberFormatException e){
			System.out.println("Soy " + getID() +". Llego al final! ");
		                              }
	}
}
