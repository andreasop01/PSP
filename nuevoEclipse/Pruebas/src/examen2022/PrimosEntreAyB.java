package examen2022;

import java.util.Scanner;

public class PrimosEntreAyB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int numero1=sc.nextInt();
		System.out.println("Dime otro numero: ");
		int numero2=sc.nextInt();
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
