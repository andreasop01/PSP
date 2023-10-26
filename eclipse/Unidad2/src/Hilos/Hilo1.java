package Hilos;

public class Hilo1 extends Thread {
	int id;
	
	public Hilo1(int id) {
		this.id=id;
	}
	
	//la funcionabilidad del hijo es el run
	public void run() {
		System.out.println("Hilos "+id);
	}
}
