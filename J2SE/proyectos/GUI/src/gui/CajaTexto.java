package gui;
import javax.swing.JTextField;


public class CajaTexto extends JTextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int COLUMNS = 25;
	
	public CajaTexto(boolean editable){
		super(CajaTexto.COLUMNS);
		this.setEditable(editable);
	}
	
	public CajaTexto(int columns, boolean editable){
		super(columns);
		this.setEditable(editable);
	}

}
