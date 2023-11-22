package Procesos;

import java.io.IOException;
import java.io.InputStream;

public class ejercicio2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder pb=new ProcessBuilder("CMD","/C","DIRECT");
		Process p=pb.start();
		
		InputStream is=p.getInputStream();
		int c;
		
		while((c=is.read())!=-1) {
			System.out.print((char)c);
		}
		is.close();
		InputStream err=p.getErrorStream();
		c=0;
		while((c=err.read())!=-1) {
			System.out.print((char)c);
		}
		err.close();
		
	}

}
