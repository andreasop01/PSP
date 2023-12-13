package tcp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorObjeto {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int puerto=6000;
		ServerSocket servidor=new ServerSocket(puerto);
		
		System.out.println("Servidor esperando ...");
		Socket cliente=servidor.accept();
		System.out.println("Cliente aceptado");
		
		
		ObjectOutputStream output=new ObjectOutputStream(cliente.getOutputStream());
		
		//1 enviamos un objet al cliente
		Persona p=new Persona("Luis",22);
		output.writeObject(p);
		output.flush();
		
		ObjectInputStream input=new ObjectInputStream(cliente.getInputStream());
		//2 recibimos el objeto modificado
		Persona p1=(Persona)input.readObject();
		System.out.println("recibido el obejto modificado "+p1);
		
		//cerramos flujos
		input.close();
		output.close();
		cliente.close();
		servidor.close();
		
		
		

	}
}
 