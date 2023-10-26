package contador;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c= new Cuenta(80);
		System.out.println("SALDO INICAL "+c.getSaldo()+" SALDO MAX "+c.getMAX());
		
		Persona per1= new Persona(c,"Sara");
		Persona per2= new Persona(c,"Mateo");
		
		per1.start();
		per2.start();
		
		
		
	}

}
