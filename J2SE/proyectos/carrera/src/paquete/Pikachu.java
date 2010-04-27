package paquete;

public class Pikachu extends Animal implements Corredor{
	
	protected Pista pista;
	protected int pos;
	
	public Pikachu(String nombre) {
		super(nombre);
	}
	
	public void correr(){		
		Thread hilo=new Thread((Runnable)this,this.getID());
		hilo.setPriority(10);
		hilo.start();
	}
	
	public void setPista(Pista pista) {
		this.pista = pista;
	}

	
	public String getID(){
		return (super.getNombre());		
	}
	
	public void run() {
		
		try{
			while(true){
				pos = Integer.parseInt(pista.setPosition(this, Integer.toHexString(pos+1)),16);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". pika pika! Llegue!");			
		}
	}
		
		
	
}

