package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class LoopsReticao12 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um número entre 1 e 10 para ver sua tabuada:");
		int n = scanner.nextInt();
		System.out.println("Tabuada do :"+n);
		for (int i = 1; i<=10 ; i++) {
			System.out.println(n+" X "+i+ " = " +n*i);
		}
	}

}
