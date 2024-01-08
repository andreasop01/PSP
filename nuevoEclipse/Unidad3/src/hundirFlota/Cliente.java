package hundirFlota;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import numeroTCP.Numeros;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String host="localhost";
		int puerto=6000;
		Socket cliente=new Socket(host,puerto);
		
		
		Scanner sc=new Scanner (System.in);
		int intentos=0;
		int barcosHundi=0;
		DataOutputStream output=new DataOutputStream(cliente.getOutputStream());
		DataInputStream input=new DataInputStream(cliente.getInputStream());
		
		
		while(intentos<10 && barcosHundi<10) {
			System.out.println("Escribe fila y columna (7,8)");
			String posicion=sc.next();
			
			//1 enviamos un objet al cliente
			output.writeUTF(posicion);
			output.flush();
			
			//2 recibimos el objeto modificado
			String respuesta=input.readUTF();
			
			if(respuesta.equals("AGUA")) {
				System.out.println("Haz fallado");
				intentos++;
			}else {
				System.out.println("barco hundido");
				barcosHundi++;
			}
		}
		
		if(intentos>=10) {
			System.out.println("loser!!");
		}else {
			System.out.println("Winner!!!!");
		}
	}

}
