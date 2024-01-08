package hundirFlota;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int puerto=6000;
		ServerSocket servidor=new ServerSocket(puerto);
		
		System.out.println("Servidor esperando ...");
		Socket cliente=servidor.accept();
		System.out.println("Cliente aceptado");
		
		//enviamos
		DataInputStream input=new DataInputStream(cliente.getInputStream());
		DataOutputStream output=new DataOutputStream(cliente.getOutputStream());
		
		Tablero t=new Tablero();
		String mensaje;
		
		while(t.getBarcos()>0 && t.getIntentos()<10) {

			String posiciones[]=input.readUTF().split(",");
			int fila=Integer.parseInt(posiciones[0]);
			int columna=Integer.parseInt(posiciones[1]);
			
			if(t.getTablero()[fila][columna]==0) {
				mensaje="AGUA";
				 t.setIntentos(t.getIntentos()+1);
				
			}else {
				mensaje="Barco";
				t.setBarcos(t.getBarcos()-1);
				t.getTablero()[fila][columna]=0;
				
			}
			output.writeUTF(mensaje);
			output.flush();
			
			
		}
	}

}
