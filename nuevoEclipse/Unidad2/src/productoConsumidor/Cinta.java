package productoConsumidor;

public class Cinta {
	int numero;
	private boolean disponible;
	
	public Cinta() {
		this.numero=0;
		this.disponible=false; //Cola vacia
	}
	
	public synchronized int get() {
		while(!disponible) {
			System.out.println("Cinta vacia");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("Consumido"+this.numero);
			disponible=false;
			notify();
			return this.numero;
		
	}
	
	public synchronized void  put(int valor) {
		while(disponible) {
			System.out.println("Cinta llena");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.numero=valor;
		System.out.println("Producido"+this.numero);
		disponible=true;
		notify();
	}
}

