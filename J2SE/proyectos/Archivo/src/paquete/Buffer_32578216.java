
//Alumno: Reyes, Iván

//Matricula: 32.578.216

package paquete;

public class Buffer_32578216 implements Writable, Readable {
	String buffer[];
	int capacidad;
	int indice = 0;
	
	public Buffer_32578216(int capacidad){
		this.capacidad = capacidad;
		buffer = new String[capacidad];
	}
	
	synchronized public String getDato() {
		while(indice == 0){
			try{
				wait();
			}
			catch(InterruptedException e){	}
		}
		notifyAll();
		System.out.println("Se saco " + this.buffer[indice] + " de la posicion" + (indice - 1));
		return this.buffer[indice--];
	}

	synchronized public void setDato(String dato) {
		while(indice == (capacidad-1)){
			try{
				wait();
			}
			catch(InterruptedException e){   }
		}
		this.buffer[++indice] = dato;
		notifyAll();
		System.out.println("Se coloco " + dato + " en la posicion " + (indice - 1));
	}
}



/*¿Que sentido tienen las interfaces Readable y Writable?
 Las interfaces desligan los detalles de implementación del buffer
 */

