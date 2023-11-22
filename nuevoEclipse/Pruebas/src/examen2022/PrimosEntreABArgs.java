package examen2022;

import java.util.Scanner;

public class PrimosEntreABArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1=Integer.parseInt(args[0]);
	
		int numero2=Integer.parseInt(args[1]);
		int cont=0;
		
		for(int i=numero1;i<=numero2; i++) {
			
			boolean esPrimo=true;
			for(int x=2;x<=i/2;x++) {
				if(i%x==0) {
					esPrimo=false;
				}
			}
			if(esPrimo) {
				cont++;
			}
		}
		System.out.println("entre "+numero1+" y "+numero2+" hay : "+cont+" numero/s primo/s");
		
	}

}
