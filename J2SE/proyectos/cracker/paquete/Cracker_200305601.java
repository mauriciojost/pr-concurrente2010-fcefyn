package paquete;

public class Cracker_200305601 implements Cracker {
	private int digit4;
	private int digit3;
	private int digit2;
	private int digit1;
	private int currentDigit;	
	
	public Cracker_200305601(){		
		this.digit4=0;
		this.digit3=0;
		this.digit2=0;
		this.digit1=0;
		this.currentDigit=4;
	}
	/* Obtiene la clave generada por el algoritmo del crack.
	 * 'ultima_clave_se_paso' indica si la clave anterior se excedió en su valor, o estuvo por debajo (estrictamente).  
	 */
	public String getNextKey(boolean ultima_clave_se_paso){
		if (ultima_clave_se_paso){
			currentDigit--;			
			if ((currentDigit==3)) 
				digit4--;
			else if ((currentDigit==2)) 
				digit3--;			
			else
				digit2--;
		}
		switch (currentDigit){		
		case 4:
			this.digit4++;
		break;
		case 3:
			this.digit3++;
		break;
		case 2:
			this.digit2++;
		break;
		case 1:
			this.digit1++;
		break;
		};		
		
		Integer number=this.digit4*1000+this.digit3*100+this.digit2*10+this.digit1;
		//System.out.println(number);		
		//try {int ch = System.in.read(); }catch(Exception e){}
		if (number==-9)
			return "0";
		else
			return number.toString();
	}
	
	/* Obtención del nombre del estudiante. Formato: 'APELLIDOS, Nombres'. */
	public String getStudentName(){
		return "Tapia, Martin";
	}
}
