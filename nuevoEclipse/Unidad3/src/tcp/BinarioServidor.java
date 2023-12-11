package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BinarioServidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int puerto=6000;
		String host="localhost";
		
		ServerSocket servidor;
		
		try {
			servidor=new ServerSocket(puerto);
			System.out.println("Escuchando.....");
			Socket cliente=servidor.accept();
			System.out.println("Cliente aceptado ");
			
			System.out.println("Conectado..."+cliente.getInetAddress());
			//FLUJO DE ENTRADA -->LEE
			DataInputStream flujoEntrada=null;
			DataOutputStream flujoSalida=null;
			String binario="";
			
			while(!binario.equals("0")) {
				
				flujoEntrada=new DataInputStream(cliente.getInputStream());
				binario=Integer.toBinaryString(Integer.parseInt(flujoEntrada.readUTF()));
				
				//FLUJO DE SALIDA AL SERVIDOR -->ESCRIBE
				flujoSalida=new DataOutputStream(cliente.getOutputStream());
				flujoSalida.writeUTF(binario);
					
			}

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
