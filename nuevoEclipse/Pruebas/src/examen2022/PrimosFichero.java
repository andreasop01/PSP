package examen2022;

import java.io.File;
import java.io.IOException;

public class PrimosFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder pd= new ProcessBuilder("java","examen2022.PrimosEntreAyB");
		pd.directory(new File(".\\bin"));
		
		File entrada=new File("primos.txt");
		File salida=new File("salida.txt");
		File error=new File("error.txt");
		
		pd.redirectInput(entrada);
		pd.redirectOutput(salida);
		pd.redirectError(error);
		
		Process p=pd.start();	

	}

}
