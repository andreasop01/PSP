package tcpHilos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HilosServidor extends Thread{
	BufferedReader fentrada;
	PrintWriter fsalida;
	Socket socket;
	
	public HilosServidor(Socket s) {
		this.socket=s;
		
		try {
			fsalida=new PrintWriter(socket.getOutputStream(),true);
			fentrada=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		
		
		
		
		//2) recibo la cadena del cliente
		try {
			//se encarga de cada cliente que se conecta
			String cadena="";
			while(!cadena.equals("*")) {
				cadena=fentrada.readLine();
				if(cadena.equals("*")) {
					
					continue;
				}
				//3) pasamos a mayuscula y reenviamos al cliente
				
				fsalida.println(cadena.trim().toUpperCase());
			}

			//cerramos flujos y socket
			fsalida.close();
			fentrada.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
