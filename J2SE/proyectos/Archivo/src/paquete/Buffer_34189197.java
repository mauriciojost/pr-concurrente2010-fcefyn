package paquete;

import java.util.concurrent.Semaphore;

public class Buffer_34189197 implements Readable, Writable {
	String buffer[];
	int capacidad;
	int indice = 0;
	Semaphore saca,pone;
	Object deauno;
	
	public Buffer_34189197(int capacidad){
		this.capacidad = capacidad;
		buffer = new String[capacidad];
		saca = new Semaphore(1);
		pone = new Semaphore(1);
		deauno = new Object();
	}
	@Override
	public String getDato() {
		// TODO Auto-generated method stub
		if(indice == 0){
			saca.acquireUninterruptibly();
		}
		synchronized(deauno){
		pone.release();
		return buffer[indice--];//Quita el dato y actualiza el indecie
		}
	}

	@Override
	public void setDato(String dato) {
		// TODO Auto-generated method stub
		if(indice == (capacidad-1)){
			pone.acquireUninterruptibly();
		}
		synchronized(deauno){
		buffer[++indice] = dato;
		saca.release();// Agrega el dato.
		}
	}
	
}

