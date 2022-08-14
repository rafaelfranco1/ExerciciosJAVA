package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx8 {
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual o preco do produto 1? ?");
		double p1 = scan.nextDouble();
		System.out.println("Qual o preco do produto 2? ?");
		double p2 = scan.nextDouble();
		System.out.println("Qual o preco do produto 3? ?");
		double p3 = scan.nextDouble();
		double menor;
		if (p1 <= p2 && p1 <= p3) {
			System.out.println("Menor é o "+p1);
			menor = p1;
			System.out.println("O menor é o"+menor);
		}
		else if (p2 <= p1 && p2 <= p3) {
			System.out.println("Menor é o "+p2);
			menor = p2;
			System.out.println("O menor é o"+menor);
		}
		
		else if (p3 <= p1 && p3 <= p1) {
			System.out.println("Menor é o "+p3);
			menor = p3;
			System.out.println("O menor é o"+menor);
		}
		
		
	}
}
