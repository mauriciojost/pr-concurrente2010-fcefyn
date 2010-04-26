package paquete;

//No es una broma, existe un animal que se llama asi (aunque tecnicamente no corre). 
//Es un pez que pasa la mayor parte del tiempo fuera del agua, para ello almacena agua y la trasporta para seguir obteniendo oxigeno. 
//Para el proceso de reproduccion construyen piscinas en el barro y compiten, el ejemplar que tiene la mejor piscina, con las paredes más altas tiene más posibilidades de conseguir hembras. También existen los flojos que en vez de construir su propia piscina, se apropian de la de otro saltador del fango y reciben todos los beneficios (las batallas entre machos por territorios, son espectaculares). 

public class SaltadorDeFango extends Animal implements Corredor {
	protected Pista pista;
	protected int position = 0;
	
	SaltadorDeFango(String nombre) {
		super(nombre);
		/*Utiliza el constructor de la superclase Animal*///position=6000;
		//No es necesario modificar mas atributos.
	}

	// Asigna un nuevo hilo a la bestia
	public void correr() {

		Runnable runab = this; 
		Thread my_thread = (new Thread(runab,this.getNombre()));
		my_thread.setPriority(10);
		my_thread.start();
	}


	public String getID() {
		return (this.getNombre() + ", Diseñado por Ignacio Furey");
	}

	//Asigna una pista a la bestia
	public void setPista(Pista pista) {
		this.pista = pista;
		
	}

	//Hace correr a la bestia
	public void run() {
		try{
			while(true){
				position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+1)));
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". He llegado al final! <<<<<<<<<<<<<<<");
		}
		
	}

}
