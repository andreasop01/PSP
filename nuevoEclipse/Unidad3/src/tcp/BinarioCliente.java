package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BinarioCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String host="localhost";
		int puerto=6000;
		Socket cliente;
		
		
		
		try {
			cliente=new Socket(host,puerto);
			String numero="";
			DataOutputStream flujoSalida=null;
			DataInputStream flujoEntrada=null;
			
			while(!numero.equals("0")) {
				//FLUJO DE SALIDA AL SERVIDOR -->ESCRIBE
				numero=sc.next();
				flujoSalida=new DataOutputStream(cliente.getOutputStream());
				flujoSalida.writeUTF(numero);
				//FLUJO DE ENTRADA -->LEE
				flujoEntrada=new DataInputStream(cliente.getInputStream());
				System.out.println("Recibo del servidor: "+flujoEntrada.readUTF());
			}

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
