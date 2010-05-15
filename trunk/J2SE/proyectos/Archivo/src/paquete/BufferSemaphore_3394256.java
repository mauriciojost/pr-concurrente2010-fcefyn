//Arlettaz Emiliano DNI: 33941256
//El diagrama de clases esta echo con el plugin UML2 del eclipse

package paquete;

import java.util.concurrent.Semaphore;

public class BufferSemaphore_3394256 implements Writable, Readable {
	private Semaphore sem = new Semaphore(1);
	private Semaphore vacio;
	private Semaphore lleno;
	String buffer[];
	int capacidad;
	int indice = 0;
	String dato;
	
	public BufferSemaphore_3394256(int capacidad){
		this.capacidad = capacidad;
		this.buffer = new String[capacidad];
		this.vacio = new Semaphore(capacidad);
		this.lleno = new Semaphore(0);
		
	}
	
	public String getDato() {
		
		this.lleno.acquireUninterruptibly();
		this.sem.acquireUninterruptibly();	
		
		System.out.println("Se saco " + this.buffer[indice] + " de la posicion " + (indice - 1));
		dato = this.buffer[indice--];
		
		this.sem.release();		
		this.vacio.release();
		
		return this.dato;
			
	}

	public void setDato(String dato) {	

		this.vacio.acquireUninterruptibly();
		this.sem.acquireUninterruptibly();		
		
		this.buffer[++indice] = dato;
		System.out.println("Se coloco " + dato + " en la posicion " + (indice - 1));
		
		this.sem.release();		
		this.lleno.release();
		
	}

}
