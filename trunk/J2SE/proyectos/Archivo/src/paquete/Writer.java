package paquete;

public class Writer implements Runnable{
	private Writable b;
	
	public Writer(Writable b){
		this.b = b;
	}
	
	@Override
	public void run() 
	{
		for(int i=0; i<40; i++)
			b.setDato("dato");
		
	}

}
