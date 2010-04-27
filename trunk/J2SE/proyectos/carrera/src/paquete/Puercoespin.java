package paquete;

public class Puercoespin extends Animal implements Corredor{

	
	protected Pista pista; 
	protected int posicion=0;
		
	Puercoespin(String nombre) {		//Mando mi nombre a la 
		super(nombre);					//superclase..
	}


	public void correr() {				//Creo el runnable y hecho 
		Runnable runab = this; 			//a correr..
		String nombre_hilo = this.getID();
		Thread puercoEspin = (new Thread(runab,nombre_hilo));
		puercoEspin.setPriority(10);
		puercoEspin.start();
	}

	public String getID() {				//Digo mi nombre..
		return this.getNombre();
	}

	public void setPista(Pista pista) {	//Me paro en la pista..
		this.pista = pista;
		
	}

	public void run() {					//Acciones cuando corro..				
		try{
			while(true){
						posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)),10);
			}
		
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +" y ya llegue al final.!!<<<<<<<<<<<<<<<");
		}	
	}

}
