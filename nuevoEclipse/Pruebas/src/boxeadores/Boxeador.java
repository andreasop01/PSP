package boxeadores;

import java.util.Random;

public class Boxeador  extends Thread{

	private String nombre;
	private int nGolpes=0;
	private Ring ring;
	//Constructor
	public Boxeador(String nombre, int nGolpes, Ring ring) {
		this.nombre=nombre;
		this.nGolpes=nGolpes;
		this.ring=ring;
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getnGolpes() {
		return nGolpes;
	}

	public void setnGolpes(int nGolpes) {
		this.nGolpes = nGolpes;
	}

	
	//Cada vez que se ejecuta este método se suma 1 
	//al número de golpes que le da al otro boxeador
	public void pegar() {
		
		nGolpes++;
		
	}

	@Override
	public void run() {
	
		//El número total de golpes del ring sea inferior a 10
		
		while (nGolpes<10) {
			
				ring.pegar(this);
				pegar();
				try {
					Thread.sleep(new Random().nextInt(200));
				} catch (InterruptedException ie) {}
			}
		
	}
}