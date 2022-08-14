package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx7 {
	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite n1");
		int n1 = scan.nextInt();
		System.out.println("Digite n2");
		int n2 = scan.nextInt();
		System.out.println("Digite n3");
		int n3 = scan.nextInt();
		
		if (n1 >= n2 && n1 >=n3) {
			System.out.println("Maior é o n1");
		}
		if (n2 >= n1 && n2 >=n3) {
			System.out.println("Maior é o n2");
		}
		if (n3 >= n2 && n3 >=n1) {
			System.out.println("Maior é o n3");
		}
		if (n1 <= n2 && n1 <=n3) {
			System.out.println("Menor é o n1");
		}
		if (n2 <= n1 && n2 <=n3) {
			System.out.println("Menor é o n2");
		}
		if (n3 <= n2 && n3 <=n1) {
			System.out.println("Menor é o n3");
		}
	}
}	
