package Procesos;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ejercicio3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder pb=new ProcessBuilder("CMD","/C","DATE");
		Process p=pb.start();
		
		OutputStream os=p.getOutputStream();
		os.write("06-06-2023".getBytes());
		os.flush();
		os.close();
		
		//leemos lo que ha psado en el proceso
		InputStream is=p.getInputStream();
		int c;
		while((c=is.read())!=-1) {
			System.out.print((char)c);
		}
		is.close();
		
		

	}

}
