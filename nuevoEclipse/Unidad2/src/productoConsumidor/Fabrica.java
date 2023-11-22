package productoConsumidor;

public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cinta c=new Cinta();
		Productor p=new Productor(c,1);
		Consumidor co=new Consumidor(c,1);
		
		p.start();
		co.start();
		

	}

}
