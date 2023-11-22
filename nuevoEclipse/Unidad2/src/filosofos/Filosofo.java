package filosofos;

public class Filosofo extends Thread {
	
	private int id;
	private Mesa mesa;
	
	public Filosofo(int i, Mesa m) {
		id=i;
		mesa=m;
	}
	
	public void pensar() {
	
		System.out.println(id+" esta pensando -_-");
		try { Thread.sleep((int)(Math.random()*1000.0)+100); }
		catch (Exception e) { }
	
	}
	
	
	public void run() {
			while(true) {
		//for(int i=0; i<3; i++) {
			pensar();
			mesa.cena(id);
		
		}
		
	}


}

