package com.loiane.cursojava.aula17;

public class LoopRepeticao14 {

	public static void main(String[] args) {
		int n;
		int par = 0;
		int impar = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				par = par + 1;
			}
			if (i % 2 != 0) {
				impar = impar + 1;
			}
			
			
		}
		
		System.out.println("Possui "+par+" numeros pares");

	}

}
