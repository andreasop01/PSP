package sushiRibera;

public class Servicio {
	public static void main(String[] args) {
		int tamaño=10;
		Cinta cinta=new Cinta(10);
		
		//Crear los hilos chef y 3 clientes
		Chef ch1=new Chef(cinta);
		Cliente c1=new Cliente(cinta,"Lori");
		Cliente c2=new Cliente(cinta,"Leon");
		Cliente c3=new Cliente(cinta,"Tina");
		
		c1.start();
		c2.start();
		c3.start();
		ch1.start();
		
		
}
}

