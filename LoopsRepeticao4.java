package com.loiane.cursojava.aula17;

public class LoopsRepeticao4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			
		    
		      double popA = 80000;
		      double popB = 200000;
		      int i = 0;
		      while (popA <= popB) {
		          popA = (popA*0.03) + popA;
		          popB = (popB*0.015) + popB;
		          i++;
		      }
		      System.out.println("População A: " + popA);
		      System.out.println("População B: " + popB);
		      System.out.println("Tempo: " +i +" anos");
	}

}
