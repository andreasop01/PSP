package numeroTCP;

import java.io.Serializable;

public class Numeros implements Serializable {
	private int numero;
	private long cuadrado;
	private long cubo;
	
	public Numeros(int numero) {
		super();
		this.numero = numero;
		this.cuadrado = 0;
		this.cubo = 0;
	}

	public Numeros() {
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public long getCuadrado() {
		return cuadrado;
	}

	public void setCuadrado(long cuadrado) {
		this.cuadrado = cuadrado;
	}

	public long getCubo() {
		return cubo;
	}

	public void setCubo(long cubo) {
		this.cubo = cubo;
	}

	@Override
	public String toString() {
		return "Numeros [numero=" + numero + ", cuadrado=" + cuadrado + ", cubo=" + cubo + "]";
	}
	
	
}
