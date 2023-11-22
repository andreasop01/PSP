package contador;

public class Persona extends Thread{
	private Cuenta c;
	private String nombre;
	
	public Persona(Cuenta c, String n) {
		this.c=c;
		this.nombre=n;
		setName(n);
	}
	
	public void run() {
		for(int i=0; i<4;i++) {
			int aleatorio =(int) (Math.random()*500+1);
			c.retirarSaldo(aleatorio, getName());
			System.out.println(nombre+" SALDO ACTUAL "+c.getSaldo());
			aleatorio =(int) (Math.random()*500+1);
			c.ingresarSaldo(aleatorio, getName());
			System.out.println(nombre+" SALDO ACTUAL "+c.getSaldo());
		}
	}
}
