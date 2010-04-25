package paquete;

public class Rana extends Animal implements Corredor
{
	
	private int posicion = 0;
	private String estado;
	private Pista pista;
	
	Rana(String nombre) 
	{
		super(nombre);
		
	}

	
	public void correr() 
	{
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread hilo_corredor = (new Thread(runab,nombre_hilo));
		hilo_corredor.setPriority (10);
		hilo_corredor.start();
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
		boolean flag = true;
		while (flag)
		{
			posicion = posicion +1;
			estado = pista.setPosition(this, Integer.toHexString(posicion));
			flag = estado!="FINAL";
		}	
		System.out.println("Ya llegué!!");

	}

}
