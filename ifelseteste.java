package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class ifelseteste {
	public static void main(String[]args){
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >=18) {
			System.out.println("Maior de idade");
		}
		
		else {
			System.out.println("Menor de idade");
		}
		
	}
}
