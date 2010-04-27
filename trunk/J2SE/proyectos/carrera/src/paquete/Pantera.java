package paquete;

public class Pantera extends Animal implements Corredor
{
	protected Pista pista; 
	protected int position=0;

	Pantera (String nombre) 
	{
		super(nombre);
		
	}
	
	
	public void correr() 
    {
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread hilo_correr = (new Thread(runab,nombre_hilo));
		hilo_correr.setPriority (10);
		hilo_correr.start();
	}
	
	public String getID() 
	{
		return getNombre();
	}
	
	public void setPista(Pista pista) 
	{
		this.pista = pista;
	}
	
	public void run() 
    {
		try
    	{
    		while(true)
    		{
    			position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+1)),16);
			}
		}
    	catch(NumberFormatException e)
    	{
    		System.out.println("Soy " + this.getID() +" ¡¡¡ He llegado a la meta  =) !!! ");
    	}		
	}
	
}
