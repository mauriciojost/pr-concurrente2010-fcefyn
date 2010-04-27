package paquete;

public class canguro extends Animal implements Corredor {
	protected Pista pista; 
	protected int p=0; 
	
	canguro(String nombre) {
		super(nombre);
}
	public void correr() {
	
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread hilocanguro = (new Thread(runab,nombre_hilo)); 
		hilocanguro.start();
	}
	

	public String getID() {
		return this.getNombre();
	}

	public void run() {
		try{
			while(true){
				p = Integer.parseInt(pista.setPosition(this, Integer.toHexString(p+1)),9);
			}
		}catch(NumberFormatException e){
			System.out.println("YO SOY EL " + this.getID() +". END <<<");
		}
	}

	public void setPista(Pista pista) {
		this.pista = pista;
	}

	
	
}