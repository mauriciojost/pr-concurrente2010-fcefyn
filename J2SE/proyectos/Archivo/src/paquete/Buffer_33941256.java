//Arlettaz Emiliano DNI: 33941256
//El diagrama de clases esta echo con el plugin UML2 del eclipse

package paquete;

public class Buffer_33941256 implements Readable, Writable {
	String buffer[];
	int capacidad;
	int indice = 0;
	
	public Buffer_33941256(int capacidad){
		this.capacidad = capacidad;
		buffer = new String[capacidad];
	}
	
	synchronized public String getDato() {
		while(indice == 0){
			try{
				wait();
			}
			catch(InterruptedException e){
				
			}
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
			catch(InterruptedException e){
				
			}
		}
		
		this.buffer[++indice] = dato;
		notifyAll();
		System.out.println("Se coloco " + dato + " en la posicion " + (indice - 1));
	}

}
