package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx1 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O maior � "+n1);
		}
		else if (n2 > n1) {
			System.out.println("O maior � "+n2);
		}
		else {
			System.out.print("Os dois s�o iguais");
		}
	}
}
