package sushiRibera;

public class Chef extends Thread { //debe ser un hilo
	private Cinta c=null;
    
    public Chef(Cinta c){
           this.c=c;
           
    }
    public void run(){
    	int sushi=1;
            while (true){
                c.servir();
                 try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                 
            }
    }
}