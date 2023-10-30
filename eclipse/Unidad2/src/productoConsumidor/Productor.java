package productoConsumidor;

public class Productor extends Thread{
	private Cinta c;
	private int n;
	
	public Productor(Cinta c, int n) {
		this.c=c;
		this.n=n;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			c.put(i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
