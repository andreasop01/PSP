package examen2019;

import java.io.File;
import java.io.IOException;

public class LlamaBinarioFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder pd= new ProcessBuilder("java","examen2019.Binario");
		pd.directory(new File(".\\bin"));
		
		File entrada=new File("binario.txt");
		File salida=new File("salida.txt");
		File error=new File("error.txt");
		
		pd.redirectInput(entrada);
		pd.redirectOutput(salida);
		pd.redirectError(error);
		
		Process p=pd.start();	

	}

}
