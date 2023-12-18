package tcpHilos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		ServerSocket servidor;
		try {
			servidor=new ServerSocket(6000);
			System.out.println("Servidor inicial");
			
			while(true) {
				Socket cliente =servidor.accept();
				HilosServidor h=new HilosServidor(cliente);
				h.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
