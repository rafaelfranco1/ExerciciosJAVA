package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class LoopsRepeticao10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Este software mostra o intervalo entre dois n�meros");
		System.out.println("Digite o primeiro n�mero");
		int n1 = scanner.nextInt();
		System.out.println("Digite o segundo n�mero");
		int n2 = scanner.nextInt();
		
		do {
			System.out.println(n1);
			n1++;
		}while (n1 <=n2);
		
	
		
	}

}
