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
		//Implementar creacion del hilo para correr
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
		//Implementar como corre el animal
	}
	
}
