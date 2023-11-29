package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class BinarioCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host="localhost";
		int puerto=6000;
		Socket cliente;
		
		InetAddress ip=null;
		
		try {
			ip = InetAddress.getByName("192.168.21.100");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		try {
			cliente=new Socket(host,puerto);
			String numero="10";
			
			//FLUJO DE SALIDA AL SERVIDOR -->ESCRIBE
			DataOutputStream flujoSalida=new DataOutputStream(cliente.getOutputStream());
			flujoSalida.writeUTF(numero);
			
			//FLUJO DE ENTRADA -->LEE
			DataInputStream flujoEntrada=new DataInputStream(cliente.getInputStream());
			System.out.println("Recibo del servidor: "+flujoEntrada.readUTF());
			
			
			//Cerrar Streams y socket
			flujoEntrada.close();
			flujoSalida.close();
			cliente.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
