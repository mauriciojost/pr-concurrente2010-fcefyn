package paquete;

//Importamos clase semaforo
import java.util.concurrent.Semaphore;

public class ColectivoConDosInspectoresSemaphore_200204946 extends Vehiculo{
	
	//Dos semaforos inicializados en 1 para exclusion mutua
	private int A=1;
	private int B=1;
	private Semaphore SemaforoA=new Semaphore(A);
	private Semaphore SemaforoB=new Semaphore(B);
	
	//Contructor
	public ColectivoConDosInspectoresSemaphore_200204946(int MaxIngA,int MaxIngB){
		super(MaxIngA, MaxIngB);
	}
	
	//Ingreso con semaforo por puerta A
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p){	
		SemaforoA.acquireUninterruptibly();
		if(this.getIngresosPorPuertaA() < this.getIngresosPermitidosPorPuertaA()){
			this.incrementarIngresosPorPuertaA();
		}
		SemaforoA.release();	
	}
	
	//Ingreso con Semaforo por puerta B
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p){
		SemaforoB.acquireUninterruptibly();
		if(this.getIngresosPorPuertaB() < this.getIngresosPermitidosPorPuertaB()){
			this.incrementarIngresosPorPuertaB();
		}
		SemaforoB.release();
	}
	
	//Devolver APELLIDO y Nombre
	public String getAPELLIDONombreDelAlumno() {
		String nombre = "SUREDA José";
		return nombre;
	}
}