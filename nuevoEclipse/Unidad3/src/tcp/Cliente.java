package tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host="localhost";
		int puerto=6000;
		Socket cliente;
		InetAddress ip2=null;
		
		try {
			ip2 = InetAddress.getByName("192.168.21.11");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		try {
			cliente=new Socket(ip2,puerto);
			//cliente=new Socket(host,puerto);
			
			InetAddress ip=cliente.getInetAddress();
			//puerto del cliente
			System.out.println("Puerto Local: "+cliente.getLocalPort());
			//puerto remoto
			System.out.println("Puerto remoto: "+cliente.getPort());
			//IP servidor
			System.out.println("Ip servidor: "+ip.getHostAddress());
			//Nombre del servidor
			System.out.println("Nombre del servidor"+ip.getHostName());
			
			cliente.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
