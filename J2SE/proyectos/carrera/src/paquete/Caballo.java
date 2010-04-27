package paquete;

public class Caballo extends Animal implements Corredor{
	
	protected Pista pista;
	protected int position;
	
	public Caballo(String name){
		super(name);		
	}
	
	public void correr(){		
		Runnable r = this;
		Thread newThread = new Thread(r,this.getID());
		newThread.start();
	}
	
	public void setPista(Pista pista) {
		this.pista = pista;
	}
	
	//Corredor Methods
	
	public String getID(){
		return (super.getNombre());		
	}
	
	public void run() {
		try{
			while(true){
				position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+1)),9);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". llegueeeeee! (con el caballo cansado)<<<<<<<<<<<<<<<");			
		}
	}
		
		
	
}

