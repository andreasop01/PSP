package misioneros;

import java.util.ArrayList;

public class Olla {
	
	private int numero;
	private ArrayList<Integer>olla;
	
	public Olla(int numero) {
		this.numero=numero;
		olla=new ArrayList<Integer>();
	}
	
	public synchronized void EcharAlaOlla(int nummisionero) {
		
		while(olla.size()==numero) {
			//Si la olla está llena
			System.out.println("No se puede echar a la olla: OLLA  LLENA ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
		olla.add(nummisionero);
		//Si se puede cocinar habrá que echar otro 
		System.out.println("		Cocinando al misionero:  "+nummisionero);
		nummisionero++;
		notifyAll();
		
		}
	
	
	public synchronized int SacardelaOlla(int numerocanibal) {
		int misionero;
		
		while(olla.size()==0) {
			//Si la olla está vacía no se puede sacar
			System.out.println("No hay nada más que sacar: OLLA VACÍA ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}//
		misionero=olla.remove(0);
		//Si hay misioneros cocinados se podrán sacar y comer

		System.out.println("El canibal "+numerocanibal+" está comiendo "+misionero);
		notifyAll();
		return misionero;
	}
}
