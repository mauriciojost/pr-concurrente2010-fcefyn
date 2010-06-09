package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;


public class Boton extends JButton implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Calculadora c;
	private int operacion;
	
	public Boton(String label, int operacion, Calculadora c){
		super(label);
		this.operacion = operacion; // ID de la operación matemática asociada al boton.
		this.c = c;	// Referencia a un objeto Calculadora.
		this.addMouseListener(this); // IMPORTANTE
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// Setea el nombre de la operación seleccionada.
		c.setOperacion(operacion);
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
