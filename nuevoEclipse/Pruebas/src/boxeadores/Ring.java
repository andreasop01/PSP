package boxeadores;

public class Ring {

	private int totalgolpes;
	
	//Constructor
	public Ring() {
		totalgolpes = 0;
	}
	
	//Getters y setters 
	
	public int getTotalgolpes() {
		return totalgolpes;
	}

	public void setTotalgolpes(int totalgolpes) {
		this.totalgolpes = totalgolpes;
	}
	
	
	public synchronized void pegar(Boxeador boxeador) {
	
		System.out.println("Golpea " + boxeador.getNombre() + " (" + boxeador.getnGolpes() + ")");
		totalgolpes++;
		
	}

	
}