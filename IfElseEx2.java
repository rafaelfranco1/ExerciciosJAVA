package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx2 {
	public static void main(String[]args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número para ver se é positivo,negativo ou nulo");
		int n1 = scan.nextInt();
		
		if (n1 > 0) {
			System.out.println("Positivo");
		}
		else if (n1 < 0) {
			System.out.println("Negativo");
		}
		
		else {
			System.out.println("Zero");
		}
		
	}
}
