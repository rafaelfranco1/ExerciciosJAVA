package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class LoopsRepeticao7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int numero;
		int maior = Integer.MIN_VALUE;
		
		while (i <= 5) {
			System.out.println("Digite 5 número para mostrar o maior deles");
			numero = scanner.nextInt();
			
			
			if (numero >= maior) {
				maior = numero;
				
			}
			i++;
		}
		
		System.out.println(maior);
		

	}

}
