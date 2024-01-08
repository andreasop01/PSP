package numeroTCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import tcp.Persona;

public class Servidor {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int puerto=6000;
		ServerSocket servidor=new ServerSocket(puerto);
		
		System.out.println("Servidor esperando ...");
		Socket cliente=servidor.accept();
		System.out.println("Cliente aceptado");
		
		//enviamos
		ObjectInputStream input=new ObjectInputStream(cliente.getInputStream());
		ObjectOutputStream output=new ObjectOutputStream(cliente.getOutputStream());
		
		
		Numeros n=new Numeros(1);
		
		 while(n.getNumero()>0) {
			 
			n=(Numeros)input.readObject();
			if(n.getNumero()<0) {
				System.out.println("Numero incorrecto "+n.getNumero());
				continue;
			}
			System.out.println("recibido el obejto " +n);
			//3 modificamos el objeto
			n.setCuadrado(n.getNumero()*n.getNumero());
			n.setCubo(n.getNumero()*n.getNumero()*n.getNumero());
			System.out.println("Enviado objeto modificado "+n);
			output.writeObject(n);
			

		}
		
		
		//cerramos flujos
		input.close();
		output.close();
		servidor.close();
		cliente.close();
		
		


	}

}
