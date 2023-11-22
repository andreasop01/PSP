package Hilos;

public class HilosThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREAMOS LOS HILOS
		System.out.println("INiCiO");
		Hilo1 h1=new Hilo1(1);
		Hilo1 h2= new Hilo1(2);
		Hilo1 h3=new Hilo1(3);
		
		//LANZAMOS LOS HILOS
		h1.start();
		h2.start();
		h3.start();
		System.out.println("FIN");
	}

}
