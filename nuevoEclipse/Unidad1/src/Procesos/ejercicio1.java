package Procesos;

import java.io.IOException;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessBuilder pb=new ProcessBuilder("NOTEPAD");
		try {
			Process p=pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
