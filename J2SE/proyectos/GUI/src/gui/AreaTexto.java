package gui;

import javax.swing.JTextArea;

public class AreaTexto extends JTextArea {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int ROWS = 10;
	private static final int COLUMNS = 25;
	
	public AreaTexto(boolean editable){
		super(AreaTexto.ROWS, AreaTexto.COLUMNS);
		this.setEditable(editable);
		this.setVisible(false);
	}
	
	public AreaTexto(int rows, int columns, boolean editable){
		super(rows, columns);
		this.setEditable(editable);
	}

}
