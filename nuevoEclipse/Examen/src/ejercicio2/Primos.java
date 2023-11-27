package ejercicio2;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int numero1=sc.nextInt();
		boolean esPrimo=true;
		
		for(int i=0;i<=numero1; i++) {
			
			
			for(int x=2;x<=numero1/2;x++) {
				if(numero1%x==0) {
					esPrimo=false;
					
				}
				
			}
			
		}
		if(esPrimo) {
			System.out.println("Es primo");
		}else {
			System.out.println(numero1+" No es primo");
		}
	}

}
