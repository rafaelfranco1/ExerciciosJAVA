package com.loiane.cursojava.aula17;

public class LoopsRepeticao15 {

 public static void main(String[] args) {
	 	int i = 0;
	 	int a0 = 0;
	 	int a1 = 1;
	 	int n = 13;
	 	int p;
	 	while (i <= n) {
	 		p = a0 + a1;
	 		a0 = a1;
	 		a1 = p;
	 		
	 		System.out.println(p);
	 		i++;
	 	}
	 	
	 
	}

}
