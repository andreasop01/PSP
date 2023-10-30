package productoConsumidor;

public class Consumidor extends Thread{
	private Cinta c;
	private int n;
	
	public Consumidor(Cinta c, int n) {
		this.c=c;
		this.n=n;
	}
	public void run() {
		int valor;
		for(int i=0;i<5;i++) {
			valor=c.get();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
