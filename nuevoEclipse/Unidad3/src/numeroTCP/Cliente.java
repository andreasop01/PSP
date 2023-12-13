package numeroTCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import tcp.Persona;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		String host="localhost";
		int puerto=6000;
		Socket cliente=new Socket(host,puerto);
		System.out.println("Escribe un numero");
		
		Scanner sc=new Scanner (System.in);
		int numero=1;
		ObjectOutputStream output=new ObjectOutputStream(cliente.getOutputStream());
		ObjectInputStream input=new ObjectInputStream(cliente.getInputStream());
		
		while(numero>0) {
			numero=sc.nextInt();
			Numeros n=new Numeros(numero);
			//1 enviamos un objet al cliente
			output.writeObject(n);
			output.flush();
			
			//2 recibimos el objeto modificado
			
			Numeros n1=(Numeros)input.readObject();
			System.out.println("recibido el obejto modificado "+n1);

		}
		//cerrar flujos
		input.close();
		output.close();
		
		System.out.println("Numero incorrecto "+numero);

	}

}
