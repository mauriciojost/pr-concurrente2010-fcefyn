package paquete;

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Buffer b = new Buffer(20);
		//Buffer_33870228_33959924 b = new Buffer_33870228_33959924(20);
		Buffer_33870228_33959924_Sem b = new Buffer_33870228_33959924_Sem(10);
		Writer w = new Writer(b);
		Reader r = new Reader(b);
		new Thread(w).start();
		new Thread(r).start();
	}

}
