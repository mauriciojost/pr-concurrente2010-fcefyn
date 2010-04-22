package paquete;

public class Cracker_33082634 implements Cracker{
	private int N4;
	private int N3;
	private int N2;
	private int N1;
	private int NUMERO;	
	
	public Cracker_33082634(){		
		this.N4=0;
		this.N3=0;
		this.N2=0;
		this.N1=0;
		this.NUMERO=4;
	}
	
	public String getNextKey(boolean sepasoclave){
		if (sepasoclave){
			NUMERO--;			
			if ((NUMERO==3)) 
				N4--;
			else if ((NUMERO==2)) 
				N3--;			
			else
				N2--;
		}
		switch (NUMERO){		
		case 4:
			this.N4++;
		break;
		case 3:
			this.N3++;
		break;
		case 2:
			this.N2++;
		break;
		case 1:
			this.N1++;
		break;
		};		
		
		Integer number=this.N4*1000+this.N3*100+this.N2*10+this.N1;
		if (number==-9)
			return "0";
		else
			return number.toString();
	}
	
	public String getStudentName(){
		return "LEANDRO TULA";
	}
}
