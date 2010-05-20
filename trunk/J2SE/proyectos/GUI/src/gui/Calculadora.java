package gui;

public class Calculadora {
	public static final int SUMA = 1;
	public static final int RESTA = 2;
	public static final int MULT = 3;
	public static final int DIV = 4;
	
	private int operacion = 0;
	
	public Calculadora(){
		
	}
	
	/**
	 * Establece el valor de operación.
	 * @param operacion	Ver constantes definidas en la clase Calculadora.
	 */
	public void setOperacion(int operacion){
		this.operacion = operacion;
	}
	
	/**
	 * Realiza el cálculo matemático indicado por operación.
	 * @param valor1	Primer operando.
	 * @param valor2	Segundo operando.
	 * @return valor1	Valor resultante de la operación matemática.
	 */
	public float calcular(float valor1, float valor2){
		switch(operacion){
			case SUMA:
				valor1 += valor2;
				break;
			case RESTA:
				valor1 -= valor2;
				break;
			case MULT:
				valor1 *= valor2;
				break;
			case DIV:
				valor1 /= valor2;
				break;
			default:
				return 0;
		}
		return valor1;
	}
	
	/**
	 * Realiza el cálculo matemático indicado por operación.
	 * @param valor1	Primer operando.
	 * @param valor2	Segundo operando.
	 * @param operacion	Operación matemática.
	 * @return valor1	Valor resultante de la operación matemática.
	 */
	public float calcular(float valor1, float valor2, int operacion){
		switch(operacion){
			case SUMA:
				valor1 += valor2;
				break;
			case RESTA:
				valor1 -= valor2;
				break;
			case MULT:
				valor1 *= valor2;
				break;
			case DIV:
				valor1 /= valor2;
				break;
			default:
				return 0;
		}
		return valor1;
	}
}
