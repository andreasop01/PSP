package tcp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteObjeto {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		
		String host="localhost";
		int puerto=6000;
		Socket cliente=new Socket(host,puerto);
		//flujo de entrada para los objetos
		
		ObjectInputStream input=new ObjectInputStream(cliente.getInputStream());
		//flujo de salida para los objetos
		ObjectOutputStream output=new ObjectOutputStream(cliente.getOutputStream());
		
		//2 recibo el objeto del servior
		Persona p=(Persona) input.readObject();
		System.out.println("Recibo.."+p);
		
		//3 modificamos el objeto
		p.setEdad(56);
		System.out.println("Enviado objeto modificado "+p);
		output.writeObject(p);
		
		
		//cerrar flujos
		output.close();
		input.close();
	}
}
