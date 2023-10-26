package Hilos;

public class Hilo2 implements Runnable {
	int id;
	public Hilo2(int id) {
		this.id=id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("HILO "+id);
	}

}
