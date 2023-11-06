package misioneros;

public class Cocinero extends Thread {

private Olla laolla=null;
    
    public Cocinero(Olla o){
           laolla=o;;
    }
    public void run(){
    	int misionero=0;
            while (true){
                laolla.EcharAlaOlla(++misionero);
                 try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                 
            }
    }
	
	
	
}
