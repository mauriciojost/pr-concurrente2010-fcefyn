package paquete;

public class Zorro extends Animal implements Corredor{
	
	protected Pista pista; 
	protected int position=0; 
	
	Zorro(String nombre) {
		super(nombre); 
	}

	@Override
	public void correr() {
		Runnable runab = this; 
		String zorro = this.getID();
		Thread hilo_zorro = (new Thread(runab,zorro)); 
		//hilo_zorro.setPriority(10);
		hilo_zorro.start();
	}
	
	@Override
	public void run() {
		try{
			while(true){
				position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+1)),16);
				}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". Por fin llegue!!!!");
		}
	}

	@Override
	public void setPista(Pista pista) {
		this.pista = pista;
	}

	@Override
	public String getID() {
		return this.getNombre();
	}
}