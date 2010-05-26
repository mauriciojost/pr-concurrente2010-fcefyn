package paquete;

import java.util.concurrent.Semaphore;

public class Buffer_31602695 implements Readable, Writable {
	String buffer[];
	int capacidad;
	int indice = 0;
	Semaphore saca,pone;
	Object deauno;
	
	public Buffer_31602695(int capacidad){
		this.capacidad = capacidad;
		buffer = new String[capacidad];
		saca = new Semaphore(1);
		pone = new Semaphore(1);
		deauno = new Object();
	}

	public String getDato() {
		// TODO Auto-generated method stub
		if(indice == 0){
			saca.acquireUninterruptibly();
		}
		synchronized(deauno){
		pone.release();
		return buffer[indice--];
		}
	}

	public void setDato(String dato) {
		if(indice == (capacidad-1)){
			pone.acquireUninterruptibly();
		}
		synchronized(deauno){
		buffer[++indice] = dato;
		saca.release();// Agrega el dato.
		}
	}
	
}

