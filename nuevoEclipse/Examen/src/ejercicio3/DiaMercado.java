package ejercicio3;
public class DiaMercado {
	public static void main(String[] args) {
		int tam=6;
		Lonja l=new Lonja(tam);
		Pescador p=new Pescador(l);
		//crear la lonja y los hilos
		Comprador c1=new Comprador(l,1);
		Comprador c2=new Comprador(l,2);
		Comprador c3=new Comprador(l,3);
		
		c1.start();
		c2.start();
		c3.start();
		p.start();
		
		
		
	}
}
