package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
	private String fileName;
	private BufferedReader br;
	private BufferedWriter bw;
        
	public Archivo(String fileName){
		this.fileName = fileName;
	}
	
	/**
	 * Instancia BufferedReader para poder leer el archivo de nombre fileName.
	 * Instancia BufferedWriter para poder escribir el archivo de nombre fileName.
	 * @return True if the file can be opened. False otherwise.
	 */
	public boolean openFileReadWrite(){
		try {
			br = new BufferedReader(new FileReader(fileName));
			bw = new BufferedWriter(new FileWriter(fileName));
			return true;
		}
		catch (IOException e) { return false; }
	}
	
	public BufferedReader getBufferedReader(){
		return br;
	}
	
	public BufferedWriter getBufferedWriter(){
		return bw;
	}
	
	public String openAndRead(){
		String linea;
		String cadena = new String("");
		if(this.openFileReadWrite()){
			while((linea = this.getNextLine()) != null){
				cadena = cadena + linea;
			}
			return cadena;
		}
		return null;
	}
	
	/**
	 * Obtiene siguiente linea del archivo.
	 * @return line	Linea leída de archivo. null si no hay mas lineas por leer.
	 */
	public String getNextLine(){
		String line;
		try { line = br.readLine(); }
		catch (IOException e) { return null; }
		return line;
	}
	
	public void saveFile(String text){
		this.clear();
		try {
			bw.write(text);
			bw.flush();
		} catch (IOException e) { e.printStackTrace(); }
		
	}
	
	public void clear(){
		new File(fileName).delete();
	}
	
	public void closeFile(){
		try { 
			br.close();
			bw.close();
		}
		catch (Exception e) { }
	}
}
