package paquete;

public class Cangrejo extends Animal implements Corredor{

	private Pista pista;
	private int posicion=0;
	
	Cangrejo(String nombre) {
		super(nombre);
	}

	@Override
	public void correr() {
			
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread el_bicho = new Thread(runab,nombre_hilo);
		el_bicho.setPriority(10);
		el_bicho.start();
		
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
		
		try{
			while(true){
				
				posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)),16);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". Llego el Bicho!");
		}
	}
		
	}
	


