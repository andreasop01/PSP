package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Servidor1 {
	public static void main(String[] args) {
		int puerto=6000;
		String host="localhost";
		
		ServerSocket servidor;
		
		try {
			servidor=new ServerSocket(puerto);
			System.out.println("Escuchando.....");
			Socket cliente=servidor.accept();
			System.out.println("Cliente aceptado ");
			
			System.out.println("Cconectado..."+cliente.getInetAddress());
			
			//FLUJO DE SALIDA AL SERVIDOR -->ESCRIBE
			DataOutputStream flujoSalida=new DataOutputStream(cliente.getOutputStream());
			flujoSalida.writeUTF("Hola desde el servidor!!");
			
			//FLUJO DE ENTRADA -->LEE
			DataInputStream flujoEntrada=new DataInputStream(cliente.getInputStream());
			
			
			//Cerrar Streams y socket
			flujoEntrada.close();
			flujoSalida.close();
			servidor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	}

