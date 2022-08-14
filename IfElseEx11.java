package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx11 {
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite seu salário");
		
		double salario = scan.nextDouble();
		
		if (salario < 280) {
			double salario2 = salario * 1.20;
			double valor_aumento = salario * 0.20;
			System.out.println("Seu salário antes do reajuste era de "+salario);
			System.out.println("O percentual de aumento aplicado foi de 20%");
			System.out.println("O valor do aumento vai ser de "+valor_aumento);
			System.out.println("O valor do salário após o aumento: "+salario2);
		}
		
		
		if (salario >= 280 && salario < 700) {
			salario = salario * 1.15;
			System.out.println("Seu salário com aumento vai ser de "+salario);
		}
		
		if (salario >= 700 && salario < 1500) {
			salario = salario * 1.10;
			System.out.println("Seu salário com aumento vai ser de "+salario);
		}
		
		if (salario >= 1500) {
			salario = salario * 0.05;
			System.out.println("Seu salário com aumento vai ser de "+salario);
		}
	}
}
