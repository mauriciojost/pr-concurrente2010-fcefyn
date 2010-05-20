package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import javax.swing.JButton;


public class BotonIgual extends JButton implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private HashMap<String,Object> objetos = new HashMap<String,Object>();
	private Calculadora calculadora = new Calculadora();
	
	/**
	 * Instancia un objeto Boton
	 * @param label	Nombre del boton.
	 */
	public BotonIgual(String label, Calculadora calculadora){
		super(label);
		this.calculadora = calculadora;
		this.addMouseListener(this);
	}
	
	public HashMap<String,Object> getObjetos(){
		return objetos;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		try { // Para evitar excepciones cuando no hay valor.
			float valor1 = (Float.valueOf(((CajaTexto)objetos.get("ct1")).getText())).intValue();
			float valor2 = (Float.valueOf(((CajaTexto)objetos.get("ct2")).getText())).intValue();
			valor1 = calculadora.calcular(valor1, valor2);
			((CajaTexto)objetos.get("ct3")).setText(String.valueOf(valor1));
		} catch (Exception e){}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
