package misioneros;

public class LaCocina {
	public static void main(String[] args) {
		int tamaño=5;//tamaño de la olla
		Olla laolla=new Olla(tamaño);
	//Crear el cocinero y lanzarlo
	//Crear 3 caníbales y lanzarlos
		
		Cocinero c=new Cocinero(laolla);
		Canibales c1=new Canibales(laolla,1);
		Canibales c2=new Canibales(laolla,2);
		Canibales c3=new Canibales(laolla,3);
		
		c.start();
		c1.start();
		c2.start();
		c3.start();
		
		
	
	}
}

