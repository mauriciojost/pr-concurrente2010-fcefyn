import files.*;
import gui.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initComponentCalculadora(new Calculadora());
		initComponentFile();
		
	}
	
	public static void initComponentCalculadora(Calculadora calculadora){
		Pantalla p = new Pantalla("Ventana");
		
		JPanel jpSuper = new JPanel();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		FlowLayout bl1 = new FlowLayout();
		FlowLayout bl2 = new FlowLayout();
		BorderLayout bl3 = new BorderLayout();
				
		Boton b1 = new Boton("+", Calculadora.SUMA, calculadora);
		Boton b2 = new Boton("-", Calculadora.RESTA, calculadora);
		Boton b3 = new Boton("x", Calculadora.MULT, calculadora);
		Boton b4 = new Boton("/", Calculadora.DIV, calculadora);
		BotonIgual bi = new BotonIgual("=", calculadora);
		
		CajaTexto ct1 = new CajaTexto(true); // Operando 1. Editable.
		CajaTexto ct2 = new CajaTexto(true); // Operando 2. Editable.
		CajaTexto ct3 = new CajaTexto(false); // Resultado. No editable.
				
		bi.getObjetos().put("ct1", ct1);
		bi.getObjetos().put("ct2", ct2);
		bi.getObjetos().put("ct3", ct3);
		
		jp1.setLayout(bl1);
		jp1.add(b1, FlowLayout.LEFT);
		jp1.add(b2, FlowLayout.LEFT);
		jp1.add(b3, FlowLayout.LEFT);
		jp1.add(b4, FlowLayout.LEFT);
		jp1.add(bi, FlowLayout.LEFT);
		
		jp2.setLayout(bl2);
		jp2.add(ct3, FlowLayout.LEFT);
		jp2.add(ct2, FlowLayout.LEFT);
		jp2.add(ct1, FlowLayout.LEFT);
		
		jpSuper.setLayout(bl3);
		jpSuper.add(jp1, BorderLayout.NORTH);
		jpSuper.add(jp2, BorderLayout.CENTER);
		p.add(jpSuper);
		p.setVisible(true);
	}

	public static void initComponentFile(){
		
		// Instanciación.
		Archivo a = new Archivo("C:\\Test.txt");
		
		Pantalla p = new Pantalla("Ventana");
		
		JPanel jpSuper = new JPanel();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		FlowLayout bl1 = new FlowLayout();
		FlowLayout bl2 = new FlowLayout();
		BorderLayout bl3 = new BorderLayout();
		
		AreaTexto at1 = new AreaTexto(true); // Editable.
		
		BotonClose jb1 = new BotonClose(at1, a);
		BotonSave jb2 = new BotonSave(at1, a);
		BotonOpen jb3 = new BotonOpen(at1, a);
		// End Instanciación.
		
				
		// Configuración de jp1.
		jp1.setLayout(bl1);
		jp1.add(jb1, FlowLayout.LEFT);
		jp1.add(jb2, FlowLayout.LEFT);
		jp1.add(jb3, FlowLayout.LEFT);
		// End Configuración de jp1.
				
		// Configuración de jp2.
		jp2.setLayout(bl2);
		jp2.add(at1, FlowLayout.LEFT);
		// Configuración de jp2.
		
		// Configuracion de jpSuper.
		jpSuper.setLayout(bl3);
		jpSuper.add(jp1, BorderLayout.NORTH);
		jpSuper.add(jp2, BorderLayout.CENTER);
		// Configuracion de jpSuper.
		
		// Configuracion de p.
		p.add(jpSuper);
		p.setVisible(true);
		// End Configuracion de p.
		
	}
}
