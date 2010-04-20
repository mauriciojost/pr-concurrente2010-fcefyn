package paquete;

public class cracker_33959924 implements Cracker
{   private int clave=5000, ini=0, fin=9999, contador=0;

    public String getNextKey(boolean ultima_clave_se_paso)
    {
    	String cadena;
    	System.out.println("Max: " + fin + " /// Min: " + ini);
    	
    	if(contador==0)
    	{
    		cadena = String.valueOf(clave);
			//System.out.println("nueva clave  "+cadena);
			clave= Integer.valueOf(cadena);
			contador=contador+1;
			return cadena;
    	}
    	else
    	{
    		if (ultima_clave_se_paso==true)
    		{
    			fin=clave;
    			clave=ini+(fin-ini)/2+1;
    			cadena = String.valueOf(clave);
    			//System.out.println(cadena);
    			clave= Integer.valueOf(cadena);
    			contador=contador+1;
    			return cadena;
    		}
    		else
    		{
    			ini=clave;
    			clave=clave+(fin-ini)/2+1;
    			cadena = String.valueOf(clave);
    			//System.out.println(cadena);
    			clave= Integer.valueOf(cadena);
    			contador=contador+1;
    			return cadena;
    		}
    	}
    }
    
    
    public String getStudentName(){
		return "Nonino, Julián";
	}

}
