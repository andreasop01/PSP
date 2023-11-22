package sushiRibera;

public class Cliente  extends Thread { //debe ser un hilo
	private Cinta cinta=null;
	private String nombre="";
	    
	    public Cliente(Cinta c,String nombre){
	           this.cinta=c;
	           this.nombre=nombre;
	    }
	    public void run(){

	            while (true){
	                  cinta.consumir(nombre);
	                   try {
	   					Thread.sleep(400);
	   				} catch (InterruptedException e) {
	   					// TODO Auto-generated catch block
	   					e.printStackTrace();
	   				}
	            }
	    }
		
		
}
