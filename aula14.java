import java.util.Scanner;


public class aula14 {
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner (System.in);
		
		int idade ;
		
		System.out.println("Digite sua idade");
		idade = scan.nextInt();
		if (idade >= 18) {
			System.out.println("Maior de idade");
			}
		//else {
		//	System.out.println("Menor de idade");
		//}
	}
}
