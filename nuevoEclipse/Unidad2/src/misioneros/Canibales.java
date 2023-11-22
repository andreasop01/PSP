package misioneros;

public class Canibales extends Thread{

private Olla laolla=null;
private int numero=0;
    
    public Canibales(Olla o,int num){
           laolla=o;
           numero=num;
    }
    public void run(){
    	
    	int canibal;
            while (true){
                   canibal=laolla.SacardelaOlla(numero);
                   try {
   					Thread.sleep(400);
   				} catch (InterruptedException e) {
   					// TODO Auto-generated catch block
   					e.printStackTrace();
   				}
            }
    }
	
	
}

