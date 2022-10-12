package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class LoopsRepeticao11 {

			public static void main(String[] args) {
				Scanner scanner = new Scanner (System.in);
				int soma = 0;
				System.out.println("Este software mostra a soma de um intervalo entre dois números");
				System.out.println("Digite o primeiro número");
				int n1 = scanner.nextInt();
				System.out.println("Digite o segundo número");
				int n2 = scanner.nextInt();
				
				for (int i = n1; i<=n2; i++) {
					soma = soma + i;
				}
				
				System.out.println("A soma entre "+n1+" e "+n2+" é: "+soma);
				
				System.out.println("Fazendo com while");
				soma = 0;
				int i = n1;
				while (i <= n2) {
					soma = soma + i;
					i++;
				}
				System.out.println("A soma entre "+n1+" e "+n2+" é: "+soma);
				
				
			}

		


	}

