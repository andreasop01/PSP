package ejercicio2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class PrimosFicheros {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			ProcessBuilder pd= new ProcessBuilder("java","ejercicio2.Primos");
			pd.directory(new File(".\\bin"));
			
			File entrada=new File("numero.txt");
			File salida=new File("salida.txt");
			File error=new File("error.txt");
			
			pd.redirectInput(entrada);
			pd.redirectOutput(salida);
			pd.redirectError(error);
			
			try {
				Process p=pd.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	

		}

	}


	
	
	

