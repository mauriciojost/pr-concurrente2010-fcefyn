
public class Main {

	public static void main(String[] args) {
		Generator g = new Generator(2);
		for (int i=0; i<5000;i++){
			System.out.println("Generator: " + g.getMuestra(0) + " : " + g.getMuestra(1) + ".");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		g.stop();
	}

}
