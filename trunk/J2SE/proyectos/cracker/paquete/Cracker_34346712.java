package paquete;

public class Cracker_34346712 implements Cracker
{
	private int clave;
	private int	max = 9999;
	private int	min = 0;
	private int counter = 0;
	
	
	public String getNextKey(boolean ultimaClaveSePaso)
	{
		String cadena;
		
		if (counter == 0)
		{
			if ((max-min)%2 == 1)
			{
				clave = ((max-min)/2) + (1/2);
			}
			else
			{
				clave = (max-min)/2;
			}
			counter++;
			cadena = String.valueOf(clave);
			return cadena;
		}
		
		if (ultimaClaveSePaso)
		{
			max = clave;
			if ((max-min)%2 == 1)
			{
				clave = min+((max-min)/2) + (1/2);
			}
			else
			{
				clave = min+(max-min)/2;
			}
		counter++;
		cadena = String.valueOf(clave);
		return cadena;
		}
		
		else
		{
			min = clave;
			if ((max-min)%2 == 1)
			{
				clave = min+((max-min)/2) + (1/2);
			}
			else
			{
				clave = min+(max-min)/2;
			}
			counter++;
			cadena = String.valueOf(clave);
			return cadena;
		}

	}

	public String getStudentName() 
	{
		return "RUEDA, René Alejandro";
	}
	public int getCurrentKey()
	{
		return clave;
	}
	
}
