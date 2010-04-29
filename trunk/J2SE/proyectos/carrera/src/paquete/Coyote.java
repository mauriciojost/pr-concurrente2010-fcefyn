package paquete;

public class Coyote extends Animal implements Corredor {
	
         protected Pista pista;
         protected int posicion=0;

	
	           
	             public Coyote (String coyote){		
	             super(coyote);
	}

	public void correr() {

		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread C_hilo = (new Thread(runab, nombre_hilo));
		C_hilo.setPriority(10);
		C_hilo.start();
	}

	
	public String getID() {
		return this.getNombre();
	}

	
	public void setPista(Pista pista) {
		this.pista = pista;
		
	}


	public void run() {
		try{
			while(true){
				posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)),10);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". el numero uno!!!************************");
		}
		
	}}


