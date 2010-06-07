package main;
import java.util.Random;
import java.util.concurrent.Semaphore;


public class Generator implements Runnable{
	private int nchannels; /* Amount of channels */
	private boolean stopFlag = false; 
	private float muestras[]; /* Sample of the N channels in certain moment */
	private Semaphore semaphore;
	private int T; /* 1/Fs */
	
	public Generator(int n_channels, int T){
		if (Math.abs(n_channels)==0){
			n_channels = 1;
		}
		this.T = T;
		this.nchannels = n_channels;
		this.semaphore = new Semaphore(n_channels);
		this.muestras = new float[n_channels];
		giveAValueToSamples();
		Thread t = new Thread(this, "Generator Thread");
		t.start();
	}
	
	public float getMuestra(int canal){
		float ret;
		this.semaphore.acquireUninterruptibly();
		canal = Math.abs(canal) % this.nchannels;
		ret = (float) this.muestras[canal];
		this.semaphore.release();
		return ret;
	}
	
	public void run(){
		while(this.stopFlag==false){
			try{
				Thread.sleep(T);
			}catch(Exception e){}
			giveAValueToSamples();
		}
	}
	
	private void giveAValueToSamples(){
		this.semaphore.acquireUninterruptibly(this.nchannels);
		Random rnd = new Random();
		for(int i=0; i<nchannels; i++){
			muestras[i] = (float) ((0.99 * muestras[i]) + (0.01 * rnd.nextFloat()));
		}
		this.semaphore.release(this.nchannels);
	}
	
	public void stop(){
		this.stopFlag = true;
	}
}
