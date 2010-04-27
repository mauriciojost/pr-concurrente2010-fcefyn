package paquete;

public class Leopardo extends Animal implements Corredor {

	protected Pista pista; 
	protected int posicion=0;
	private String nombre="Taz de Andrea Laluf";
	
	Leopardo(String nombre) {
		super(nombre);
		
	}

	public void correr() {
		
		
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread Leopardo_hilo = (new Thread(runab,nombre_hilo));
		Leopardo_hilo.setPriority(10);
		Leopardo_hilo.start();
		
	}

	public String getID() {
		
		return this.getNombre();
	}

	public void setPista(Pista pista) {
		
		this.pista=pista;
	}

	public void run() {
		
		try{
			while(true){
				
				posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)));
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". Llegué!!!! :D"+"pertenezco a: "+this.nombre);
		}
	}
		
		
}


