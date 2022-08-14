package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx10 {
	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o turno que você estuda");
		String turno = scan.nextLine();
		
		if (turno.equalsIgnoreCase("M") || turno.equalsIgnoreCase("matutino")
				|| turno.equalsIgnoreCase("m-matutino")) {
			System.out.println("Bom Dia!");
		}
		
		
		if (turno.equalsIgnoreCase("V") || turno.equalsIgnoreCase("vespertino")
				|| turno.equalsIgnoreCase("v-vespertino")) {
			System.out.println("Boa Tarde!");
		}
		
		
		if (turno.equalsIgnoreCase("n") || turno.equalsIgnoreCase("noturno")
				|| turno.equalsIgnoreCase("N-Noturno")) {
			System.out.println("Bom Dia!");
		}
		
		else {
			System.out.println("Valor Inválido");
		}
}
}