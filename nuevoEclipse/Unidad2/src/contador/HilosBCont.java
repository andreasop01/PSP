package contador;

public class HilosBCont extends Thread {
	private Contador cont;
	public HilosBCont(String nombre, Contador c) {
		this.cont=c;
		setName(nombre);
	}
	
	public void run() {
		for (int i=0; i<300;i++) {
			cont.decremebta();
			try {
				Thread.sleep(10); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(this.getName()+" "+cont.getCont());
	}
}
