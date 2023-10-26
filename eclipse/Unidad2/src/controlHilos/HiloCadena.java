package controlHilos;

public class HiloCadena  extends Thread{
	private ObjetoCompartido o;
	String cadena;
	
	public HiloCadena(ObjetoCompartido o,String cadena) {
		this.o=o;
		this.cadena=cadena;
	}
	
	public void run() {
		synchronized(o) {
			for(int i=0;i<10;i++) {
				o.pintaCadena(cadena);
				o.notify();//para notificar que se ha imprimido
				try {
					o.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			o.notifyAll();
		}
		
	}
}
