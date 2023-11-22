package fabrica;


public class Fabrica  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranuras=10;
		Cinta micintatransportadora=new Cinta(ranuras);
		new Thread(new BrazoMecanicoDos(micintatransportadora)).start();
		
		new Thread(new BrazoMecanicoUno(micintatransportadora)).start();
	}

}
