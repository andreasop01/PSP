package Procesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LlamaEjemploCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File(".\\bin");
		ProcessBuilder pd=new ProcessBuilder("java","Procesos.EjemploCadena");
		pd.directory(dir);
		try {
			Process p=pd.start();
			//escribimos en ejemplo cadena
			OutputStream os=p.getOutputStream();
			os.write("Andrea\n".getBytes());
			os.flush();
			
			InputStream is=p.getInputStream();
			int c;
			
			while((c=is.read())!=-1) {
				System.out.print((char)c);
			}
			is.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
