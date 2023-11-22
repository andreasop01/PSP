package contador;

public class Contador {
	private int cont=0;
	
	public Contador(int cont) {
		this.cont=cont;
	}
	
	
	public synchronized void incrementa() {
		this.cont++;
	}
	public synchronized void decremebta() {
		this.cont--;
	}

	public int getCont() {
		return cont;
	}

	
	
	
}
