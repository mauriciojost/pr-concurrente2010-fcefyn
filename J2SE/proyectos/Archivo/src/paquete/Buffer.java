package paquete;

public class Buffer implements Readable, Writable {
	String buffer[];
	int capacidad;
	int indice = 0;
	
	public Buffer(int capacidad){
		this.capacidad = capacidad;
		buffer = new String[capacidad];
	}
	@Override
	public String getDato() {
		// TODO Auto-generated method stub
		if(indice == 0){
			// Debe esperar.
			
			return null; // Linea a quitar cuando se complete.
		}
		return buffer[indice--]; // Retorna dato y actualiza el indice.
	}

	@Override
	public void setDato(String dato) {
		// TODO Auto-generated method stub
		if(indice == (capacidad-1)){
			// Debe esperar.
			return; // Linea a quitar cuando se complete.
		}
		buffer[++indice] = dato; // Agrega el dato.
	}

}
