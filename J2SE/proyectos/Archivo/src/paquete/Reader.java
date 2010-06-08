package paquete;

public class Reader implements Runnable {
	private Readable b;
	
	public Reader(Readable b){
		this.b = b;
	}
	@Override
	public void run() 
	{
		String dato = new String();
		for(int i=0; i<40; i++)
			dato = b.getDato();
		
	}

}
