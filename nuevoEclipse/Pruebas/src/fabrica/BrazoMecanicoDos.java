package fabrica;

public class BrazoMecanicoDos extends Thread{
	private Cinta c=null;
    
    public BrazoMecanicoDos(Cinta c){
           this.c=c;
    }
    public void run(){
    	double item=0.0;
            while (true){
               //Insertar producto en la cinta
            	c.insertar(item);
            	item++;
                 try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                 
            }
    }
}
