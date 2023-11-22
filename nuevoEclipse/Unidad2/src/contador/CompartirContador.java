package contador;

public class CompartirContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contador c=new Contador(100);
		HiloACont h1= new HiloACont("A",c);
		HilosBCont h2= new HilosBCont("B",c);
		
		h1.start();
		h2.start();
		
	}

}
