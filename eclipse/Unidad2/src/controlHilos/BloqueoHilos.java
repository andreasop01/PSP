package controlHilos;

public class BloqueoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjetoCompartido o=new ObjetoCompartido();
		HiloCadena h1= new HiloCadena(o,"A");
		HiloCadena h2= new HiloCadena(o,"B");
		
		h1.start();
		h2.start();
		
	}

}
