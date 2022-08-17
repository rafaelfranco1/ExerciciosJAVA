package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx12 {
	public static void main (String[]args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite quanto vale sua hora");
		double hora = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalhou no mês: ");
		double horasthladas = scan.nextDouble();
		
		double salbruto = hora * horasthladas;
		
		double ir = 0;
		if (salbruto <= 900) {
			 ir = 0;
		} else if (salbruto > 900 && salbruto <= 1500) {
		     ir = 0.05 * salbruto;
		} else if (salbruto >  900 && salbruto > 1500 && salbruto <= 2500) {
		     ir = 0.1 * salbruto;
		} else if (salbruto > 2500) {
		     ir = 0.2 * salbruto;
		}   
		double inss = 0.1 * salbruto;
		double fgts = 0.11 * salbruto;
		double totaldescontos = ir + inss;
		double salliquido = salbruto - totaldescontos;
		
		System.out.println("Salário Bruto: "+hora+" * "+horasthladas+"          R$"+salbruto+"       ");
		System.out.println("(-) IR (5%): "+"                        R$"+ir);
		System.out.println("(-) INSS (10%)                       R$"+inss);
		System.out.println("(-) fgts (11%)                       R$"+fgts);
		System.out.println("Total de descontos:                  R$"+totaldescontos);		
		System.out.println("Salário Líquido:                     R$"+salliquido);
		
		
		
	}
}
