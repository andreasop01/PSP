package sushiRibera;

import java.util.ArrayList;

public class Cinta  { //objeto compartido 
	
	private int numero=0;
	private ArrayList <Integer> cinta;
	private int sushi=0;

	public Cinta(int numero) {
		this.numero=numero;
		this.cinta=new ArrayList<>();
		
	}
	
	public synchronized void servir() {
		
		 //mientras la cinta está llena
		while(cinta.size()==numero) {
			System.out.println("No se pueden  colocar más piezas de sushi en la cinta!!");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int nSushis=(int)(1+Math.random()*4);
		int espacioDispo=numero-cinta.size();
		//Colocar 1,2,3 o 4 piezas si se puede
		
		if(espacioDispo<nSushis) {
			nSushis=espacioDispo;
		}
		
		System.out.println("Chef: Se va a añadir "+nSushis+" piezas de sushi a la cinta");
		                           
		for(int i=0;i<nSushis;i++) {
			cinta.add(sushi);
			sushi++;
		}
		notifyAll();
		
		//si hay sitio
		

	}
	public synchronized void consumir(String nombre) {
		int sushiConsumido ;
		//Mientras la cinta esté vacía
		while(cinta.size()==0) {
			System.out.println("No hay nada mas que sacar: CINTA VACÍA...... ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//Cuando se puede consumir comer 1, 2 o 3
		int nSushis=(int)(1+Math.random()*3);
		int sushienlaCinta=cinta.size();
		
		if(nSushis>sushienlaCinta) {
			nSushis=sushienlaCinta;
		}
		
		for(int i=0;i<nSushis;i++) {
			sushiConsumido=cinta.remove(0);
			System.out.println("\tCliente: "+nombre+" esta comiendo "+sushiConsumido);
		}
		notifyAll();
			
		}//



}

