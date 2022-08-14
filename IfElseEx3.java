package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx3 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite seu sexo M para Masculino F para Feminino");
		String sexo = scan.nextLine();
		sexo = sexo.toUpperCase();
		
		if (sexo.equals("M")) {
			System.out.println("Masculino");
		}
		else if (sexo.equals("F")) {
			System.out.println("Feminino");
		}
		else {
			System.out.println("Não Binário");
		}
	}
}
