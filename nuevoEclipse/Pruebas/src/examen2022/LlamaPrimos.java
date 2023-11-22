package examen2022;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class LlamaPrimos {

	public static void main(String[] args) {
		ProcessBuilder pb=new ProcessBuilder("java","examen2022.PrimosEntreAyB");
		pb.directory(new File(".\\bin"));
		Scanner sc=new Scanner(System.in);
		
		
		try {
			Process p=pb.start();
			OutputStream op=p.getOutputStream();
			String numero1=sc.next()+"\n";
			op.write(numero1.getBytes());
			op.flush();
			
			String numero2=sc.next()+"\n";
			op.write(numero2.getBytes());
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
		}// TODO Auto-generated method stub

	}

}
