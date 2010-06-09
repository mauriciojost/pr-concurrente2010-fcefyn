package files;

import gui.AreaTexto;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseReceptor implements MouseListener {
	private Archivo a;
	private AreaTexto at;
	
	public MouseReceptor(AreaTexto at){
		a = new Archivo("Test.txt");
		this.at = at;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int boton = arg0.getButton();
		switch(boton){
			case 1: // Primer boton agregado.
				System.out.println("OPEN");
				String linea;
				if(a.openFileReadWrite()){
					at.setVisible(false);
					while((linea = a.getNextLine()) != null){
						at.append(linea);
					}
					at.setVisible(true);
				}
				break;
			case 2: // Segundo boton agregado.
				System.out.println("SAVE");
				break;
			case 3: // Tercer boton agregado.
				System.out.println("CLOSE");
				a.closeFile();
				break;
			default:
		}
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
