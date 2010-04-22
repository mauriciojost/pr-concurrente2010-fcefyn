package paquete;


public class Cracker_199504074 implements Cracker{
	
	int i;
	
	
	int miclave = (int) (Math.random()*10000+1);
	
	public Cracker_199504074(){
		
	}

	@Override
	public String getNextKey(boolean ultimaClaveSePaso) {
		
		if(ultimaClaveSePaso){
			miclave=miclave/4;
		}else miclave=(((9999-miclave)/4)+miclave);
		
		
		String micadena = String.valueOf(miclave);
		return micadena;
	}

	@Override
	public String getStudentName() {
		String alumno="LauraBaez";
		return alumno;
	}

	public int getCurrentKey(){
		return miclave;
	}
	
	
	
	
	

}
