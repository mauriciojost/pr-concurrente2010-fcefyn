import java.util.Random;
import java.util.concurrent.Semaphore;


public class Generator implements Runnable{
	private int nmuestras;
	private boolean stopFlag = false;
	private float muestras[];
	private Semaphore semaphore;
	
	public Generator(int n_muestras){
		if (Math.abs(n_muestras)==0){
			n_muestras = 1;
		}
		this.nmuestras = n_muestras;
		this.semaphore = new Semaphore(n_muestras);
		this.muestras = new float[n_muestras];
		giveAValueToSamples();
		Thread t = new Thread(this, "Generator Thread");
		t.start();
	}
	
	public float getMuestra(int canal){
		float ret;
		this.semaphore.acquireUninterruptibly();
		canal = Math.abs(canal) % this.nmuestras;
		ret = (float) this.muestras[canal];
		this.semaphore.release();
		return ret;
	}
	
	public void run(){
		while(this.stopFlag==false){
			try{
				Thread.sleep(1);
			}catch(Exception e){}
			giveAValueToSamples();
		}
	}
	
	private void giveAValueToSamples(){
		this.semaphore.acquireUninterruptibly(this.nmuestras);
		Random rnd = new Random();
		for(int i=0; i<nmuestras; i++){
			muestras[i] = (float) ((0.99 * muestras[i]) + (0.01 * rnd.nextFloat()));
		}
		this.semaphore.release(this.nmuestras);
	}
	
	public void stop(){
		this.stopFlag = true;
	}
}
