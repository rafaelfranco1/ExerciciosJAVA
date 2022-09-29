package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class LoopsRepeticao3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nome;
		int idade;
		boolean verifica = false;
		double salario;
		String sexo;
		String civil;
		
		
		do {
			System.out.println("Digite seu nome: ");
			nome = sc.next();
			if (nome.length() <= 3) {
				System.out.println("O nome precisa ter mais de 3 letras! Por favor tente" +
						"novamente");
			}
			else {
				verifica = true;
			}
		}while(!verifica);
		
		do {
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
			if (idade >= 0 && idade <= 150 ) {
				verifica = true;
			}
			else {
				System.out.println("Idade inválida! Idade só é permitida entre 0 e 150 " +
						"anos, tente novamente: ");
				verifica = false;
			}
		}while(!verifica);
		
		do {
			System.out.println("Digite seu salário");
			salario = sc.nextDouble();
			if (salario <= 0) {
				System.out.println("Salário tem que ser maior que zero " +
						"tente novamente: ");
				verifica = false;
			} else {
				verifica = true;
			}
		}while(!verifica);
		
		do {
			System.out.println("Digite seu sexo!M para masculino F para feminino");
			sexo = sc.next();
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				verifica = true;
			}
			else {
				System.out.println("Sexo inválido tente novamente!");
				verifica = false;
			}
		}while(!verifica);
		
}
}
