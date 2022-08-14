package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx4 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite uma letra para verificar se é vogal ou consoante: ");
		
		String letra = sc.next();
		letra = letra.toUpperCase();
		
		if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
			System.out.println("Vogal");
		}
		else {
			System.out.println("Consoante");
		}
		
	}
}
