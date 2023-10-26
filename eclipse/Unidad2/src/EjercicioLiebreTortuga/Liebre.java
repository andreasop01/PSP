package EjercicioLiebreTortuga;

public class Liebre extends Thread {
	int id;
	public Liebre(int id) {
		this.id=id;
	}
	public void run() {
		int i=0;
		System.out.println("Emieza la tiebre"+id);
		
		while(i<10) {
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" L"+id+" ");
			i++;
		}
		System.out.println("Llega a la meta la Liebre"+id);
	}
}
