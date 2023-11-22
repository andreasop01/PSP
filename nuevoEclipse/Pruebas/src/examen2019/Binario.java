package examen2019;

import java.util.Scanner;

public class Binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero?");
		String numero=sc.next();
		
		System.out.println(Integer.toBinaryString(Integer.parseInt(numero)));

	}

}
