package paquete;

public interface Corredor extends Runnable {
	public void correr();
	public void setPista(Pista pista);
	public String getID();
}
