package tcpHilos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		String host="localhost";
		int puerto=6000;
		Scanner sc=new Scanner(System.in);
		try {
			Socket cliente=new Socket(host,puerto);
			//flujo de salida del servidor
			PrintWriter fsalida=new PrintWriter(cliente.getOutputStream(),true);
			//flujo de entrada
			BufferedReader fentrada=new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			
			System.out.println("Dame un texto");
			String cadena="";
			String eco="";
			
			while(!cadena.equals("*")) {
				cadena=sc.nextLine();
				if(cadena.equals("*")) {
					fsalida.println(cadena);
					continue;
				}
				//1) envio la cadena al hilo
				fsalida.println(cadena);
				
				//4) recibo la cadena modificada
				eco=fentrada.readLine();
				System.out.println("ECO-->"+eco);
			}
			
			
			
			fsalida.close();
			fentrada.close();
			cliente.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
