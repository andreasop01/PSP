package examen2022;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LlamaPrimosEntreABArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		File dir=new File(".\\bin");
		ProcessBuilder pd=new ProcessBuilder("java","examen2022.PrimosEntreABArgs",sc.next(),sc.next());
		pd.directory(dir);
		Process p;
		try {
			p = pd.start();
			
			InputStream is=p.getInputStream();
			
			int c;
			
			while((c=is.read())!=-1) {
				System.out.print((char)c);
			}
			is.close();
			
			InputStream error=p.getErrorStream();
			int er;
			
			while((er=error.read())!=-1) {
				System.out.print((char)er);
			}
			error.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
