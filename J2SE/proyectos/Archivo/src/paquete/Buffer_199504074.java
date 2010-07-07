package paquete;
import java.util.concurrent.*;

public class Buffer_199504074 implements Readable, Writable {
	String buffer[];
	int capacidad;
	int indice = 0;
	Semaphore vacio, lleno, mutex;
	String dato;
	
	
	public Buffer_199504074(int capacidad){
		this.capacidad = capacidad;
		buffer = new String[capacidad];
		vacio=new Semaphore(capacidad);
		lleno=new Semaphore(0);
		mutex=new Semaphore(1);
		
		
	
	}
	@Override
	 public String getDato() {
		
		
		lleno.acquireUninterruptibly();
		mutex.acquireUninterruptibly();
		
		dato=buffer[indice--];
		
			
		vacio.release();
		mutex.release();
		
		
		return dato; // Retorna dato y actualiza el indice.
	}

	@Override
	 public void setDato(String dato) {
		
		
		
		vacio.acquireUninterruptibly();
		mutex.acquireUninterruptibly();
		
		buffer[++indice] = dato; // Agrega el dato.
		
		
		lleno.release();
		mutex.release();
	}

}
