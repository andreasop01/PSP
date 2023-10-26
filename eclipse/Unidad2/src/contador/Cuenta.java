package contador;

public class Cuenta {
	private double saldo;
	private final double MAX=1000;
	
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public double getMAX() {
		return MAX;
	}

	public void retirarSaldo(double cantidad,String nombre) {
		System.out.println(nombre+" Va a retirar "+cantidad);
		if(saldo-cantidad>=0) {
			this.setSaldo(saldo-cantidad);
			System.out.println("El saldo es: "+this.getSaldo());
		}else {
			System.out.println("NO PUEDE RETIRAR DINERO");
		}
		try {
			Thread.sleep(10); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void ingresarSaldo(double cantidad,String nombre) {
		
		System.out.println(nombre+" Va a ingresar "+cantidad);
		
		if(saldo+cantidad<=MAX) {
			this.setSaldo(cantidad+saldo);
			System.out.println("El saldo es: "+this.getSaldo());
		}else {
			System.out.println("NO PUEDE INGRESAR");
		}
		try {
			Thread.sleep(10); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
