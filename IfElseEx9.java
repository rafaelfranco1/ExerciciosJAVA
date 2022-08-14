package com.loiane.cursojava.aua14;

import java.util.Scanner;

public class IfElseEx9 {
	public static void main(String[]args) {
	Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite n1");
		int n1 = scan.nextInt();
		System.out.println("Digite n2");
		int n2 = scan.nextInt();
		System.out.println("Digite n3");
		int n3 = scan.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.println("O maior é n1");
			if (n2 >= n3) {
				System.out.println("O médio é o "+n2);
			} if (n3 >= n2) {
				System.out.println("O médio é o "+n3);
			} if (n2 <= n3) {
				System.out.println("O menor é o "+n2);
			}if (n3 <= n2) {
				System.out.println("O menor é o "+n3);
		}
		}
			
			if (n2 >= n1 && n2 >= n3) {
				System.out.println("O maior é "+n2);
				if (n1 >= n3) {
					System.out.println("O médio é o "+n1);
				} if (n3 >= n1) {
					System.out.println("O médio é o "+n3);
				} if (n1 <= n3) {
					System.out.println("O menor é o "+n1);
				}if (n3 <= n1) {
					System.out.println("O menor é o "+n3);
			}
			}
		
				
			
			
			
			if (n3 >= n1 && n3 >= n2) {
				System.out.println("O maior é "+n3);
				if (n1 >= n2) {
					System.out.println("O médio é o "+n1);
				} if (n2 >= n1) {
					System.out.println("O médio é o "+n2);
				} if (n1 <= n2) {
					System.out.println("O menor é o "+n1);
				}if (n2 <= n1) {
					System.out.println("O menor é o "+n2);
			}
			}
			
			
			
			
			
			
	}
}
		