package paquete;

public class Hiena extends Animal implements Corredor{

	protected Pista pista;
	protected int posicion=0;
	
	
	public Hiena (String hiena){
		super(hiena);
	}
   public void correr(){
	   Runnable runab = this;
	   String nombre_hilo = this.getID();
	   Thread hiena = (new Thread(runab, nombre_hilo));
	   hiena.setPriority(10);
	   hiena.start();
	   }
   
   public String getID() {
		return (this.getNombre()+ ", Hiena ");
       }
   public void setPista(Pista pista) {
		this.pista = pista;
		}
   
   public void run(){ // avanza de a un valor Hexadecimal sobre la pista
		try{
			while(true){
				posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)),16);
			}
		} catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". *Hiena wins flowers victory*");
		}
   }
}
