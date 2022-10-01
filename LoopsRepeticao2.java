package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class LoopsRepeticao2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String n;//nome
		String s;//senha
		boolean v; //verifica a regra de negócio
		
		
		do {
			System.out.println("******");
			System.out.println("Digite seu usuário");
			n = sc.nextLine();
			System.out.println("Digite sua senha");
			s = sc.nextLine();
		if(n.equalsIgnoreCase(s)) {
			System.out.println("Uusário e senha não podem ser iguais");
			
			v = true;
		}
		else {
			System.out.println("Computado");
			v = false;
			
		} } while (v == true);
		

}
}