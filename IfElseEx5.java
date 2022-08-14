package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx5 {
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite a primeira nota");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota");
		double n2 = scan.nextDouble();
		
		double media = ((n1 + n2)/2);
		
		if (media >= 7 && media != 10) {
			System.out.println("Aprovado");
		}
		else if (media == 10) {
			System.out.println("Aprovado com distinção");
		}
		
		else {
			System.out.println("Reprovado");
		}
		
	}
}
