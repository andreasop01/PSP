package ejercicio2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class LlamaPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder pb=new ProcessBuilder("java","ejercicio2.Primos");
		pb.directory(new File(".\\bin"));
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		
		try {
			Process p=pb.start();
			OutputStream op=p.getOutputStream();
			String numero1=sc.next()+"\n";
			op.write(numero1.getBytes());
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


