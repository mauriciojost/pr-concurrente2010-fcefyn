package paquete;

public class Pollo extends Animal implements Corredor {
	protected Pista pista; 
	protected int posicion=0;
		
	Pollo(String nombre) {
		super(nombre);
		
	}

	public void correr() {
		
		
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread pollo_hilo = (new Thread(runab,nombre_hilo));
		pollo_hilo.setPriority(10);
		pollo_hilo.start();
		
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
		
		posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)),16);
	}
}catch(NumberFormatException e){
	System.out.println("Soy " + this.getID() +". Llegue al final! <<<<<<<<<<<<<<<");
}
}


}


