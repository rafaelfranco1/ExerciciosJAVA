package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class LoopsRepeticao2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String n;//nome
		String s;//senha
		boolean v; //verifica a regra de neg�cio
		
		
		do {
			System.out.println("******");
			System.out.println("Digite seu usu�rio");
			n = sc.nextLine();
			System.out.println("Digite sua senha");
			s = sc.nextLine();
		if(n.equalsIgnoreCase(s)) {
			System.out.println("Uus�rio e senha n�o podem ser iguais");
			
			v = true;
		}
		else {
			System.out.println("Computado");
			v = false;
			
		} } while (v == true);
		

}
}