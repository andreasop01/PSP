package Procesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class LlamaCadenaArgs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir=new File(".\\bin");
		ProcessBuilder pd=new ProcessBuilder("java","Procesos.EjemploCadenaArgs","Andrea","Llovera");
		pd.directory(dir);
		Process p=pd.start();
		
		InputStream is=p.getInputStream();
		int c;
		
		while((c=is.read())!=-1) {
			System.out.print((char)c);
		}
		is.close();
	}

}
