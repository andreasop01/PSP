package examen2019;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class LlamarBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder pb=new ProcessBuilder("java","examen2019.Binario");
		pb.directory(new File(".\\bin"));
		Scanner sc=new Scanner(System.in);
		
		
		try {
			Process p=pb.start();
			OutputStream op=p.getOutputStream();
			String numero=sc.next()+"\n";
			op.write(numero.getBytes());
			op.flush();
			
			InputStream ip=p.getInputStream();
			int c;
			
			while((c=ip.read())!=-1) {
				System.out.print((char)c);
			}
			ip.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
