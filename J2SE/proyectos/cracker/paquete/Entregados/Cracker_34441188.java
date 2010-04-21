package paquete;

public class Cracker_34441188 implements Cracker {
	private int clave = 0;
	private int min=0;
	private int max=0;
	
	public Cracker_34441188() {
		this.min = 0;
		this.max = 10000;
	}
	
	public Cracker_34441188(int min, int max) {
		super();
		this.min = min;
		this.max = max;
		this.clave=min;
	}

	public String getNextKey(boolean ultimaClaveSePaso) {

		String nuevaclave=null;
		
		if(ultimaClaveSePaso)
			{
				max=clave;
			}
		else{
				min=clave;
			}

		clave=((max-min)/2)+min;
		nuevaclave=String.valueOf(clave);

		return nuevaclave;
	}

	public String getStudentName() {

		return "Pisetta,Carlos Renzo";
	}
	
	public int getCurrentKey(){
		
		return clave;
	}

}
