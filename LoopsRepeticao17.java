package com.loiane.cursojava.aula17;

public class LoopsRepeticao17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
	 	int a0 = 0;
	 	int a1 = 1;
	 	int n = 15;
	 	int p = 0;
	 	while (i <= n) {
	 		while (p <= 500) {
	 		p = a0 + a1;
	 		a0 = a1;
	 		a1 = p;
	 		System.out.println(p);
	 		i++;
	 		}
	 		
	 		
	 	}
	 	

	}

}
