package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class LoopsRepetição1a {

	public static void main(String[] args) {
		double nota;
		Scanner sc = new Scanner(System.in);
		boolean flag;
		do {
			System.out.println("Digite sua nota: ");
			nota = sc.nextDouble();
			if (nota >=0 && nota <=10) {
				flag = true;
			}
			else {
				System.out.println("Nota Inválida digite novamente! ");
				flag = false;
			}
		}while (flag == false);
	}

}
