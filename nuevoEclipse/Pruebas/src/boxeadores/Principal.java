package boxeadores;
public class Principal {

	public static void main(String args[]) {
	
		Ring ring = new Ring();
		Boxeador boxeador1=new Boxeador("Pepito",0,ring);
		Boxeador boxeador2=new Boxeador("Jose",0,ring);
		
		//Lanza los hilos		
		
		boxeador1.start();
		boxeador2.start();
		
		//Esperar a que los dos hilos terminen de ejecutarse
		
		try {
			boxeador1.join();
			boxeador2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		if (boxeador1.getnGolpes() > boxeador2.getnGolpes())
			System.out.println("Ha ganado " + boxeador1.getNombre());
		else if (boxeador1.getnGolpes() < boxeador2.getnGolpes())
			System.out.println("Ha ganado " + boxeador2.getNombre());
		else
			System.out.println("Empate");
	}
}