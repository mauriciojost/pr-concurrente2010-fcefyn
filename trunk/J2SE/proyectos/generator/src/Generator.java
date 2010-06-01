import java.util.Random;


public class Generator implements Runnable{
	private int nmuestras;
	private boolean stopFlag = false;
	private float muestras[];
	
	public Generator(int n_muestras){
		this.nmuestras = n_muestras;
		this.muestras = new float[n_muestras];
		giveAValueToSamples();
		Thread t = new Thread(this, "Generator Thread");
		t.start();
	}
	public float getMuestra(int canal){
		canal = Math.abs(canal) % this.nmuestras;
		return (float) this.muestras[canal];
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
		Random rnd = new Random();
		for(int i=0; i<nmuestras; i++){
			muestras[i] = (float) ((0.99 * muestras[i]) + (0.01 * rnd.nextFloat()));
		}
	}
	
	public void stop(){
		this.stopFlag = true;
	}
}
