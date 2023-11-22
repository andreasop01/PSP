package fabrica;

import java.util.ArrayList;

public class Cinta {
	private int dimension=10;
	private ArrayList<Double> cintatransportadora;
	private int cont=0;
	
	public Cinta(int dimension) {
		this.dimension=dimension;
		cintatransportadora=new ArrayList<>();
	}
	
	public synchronized void insertar(double valor) {
		 //cintatransportadora llena
		while(cintatransportadora.size()==dimension) {
			System.out.println("Cinta llena");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		cintatransportadora.add(valor);

		//Si hay hueco en la cinta	
		System.out.println("NUEVA PIEZA EN LA CINTA "+valor);
		notifyAll();
		


	}
	public synchronized double extraer() {
		double valor=0;
		//cintatransportadora vac�o
		while(cintatransportadora.size()==0) {
			System.out.println("\t CINTA TRANSPORTADORA VACiA ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//Si hay producto lo saca y lo pasa a la cadena de montaje
		valor=cintatransportadora.remove(0);
		System.out.println("Se a retirado de la cinta el producto "+valor);
		notifyAll();
	
		return valor;
			
		}//
	}//cintatransportadora
