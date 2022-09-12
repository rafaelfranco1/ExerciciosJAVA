#include <stdio.h>
#include <stdlib.h>

int main() {
	int q1 = 0;
	int q2 = 0;
	int q3 = 0;
	int q4 = 0;
	int n1 = 0 ;
	
	while (n1 >= 0 ) {
		
		printf("Digite o número para saber em qual intervalo ele está de 0 até 100 \n: ");
		
		scanf("%d",&n1);
		if (n1 >=0 && n1 <=25) {
			q1 = q1 + 1;
		}
		if (n1 >=26 && n1 <=50) {
			q2 = q2 + 1;
		}
		if (n1 >=51 && n1 <=75) {
			q3 = q3 + 1;
		}
		if (n1 >=76 && n1 <=100) {
			q4 = q1 + 1;
		}
		
		
	}
	printf("Possui %d números de 0 até 25 \n",q1);
	printf("Possui %d números de 26 até 50 \n",q2);
	printf("Possui %d números de 51 até 75 \n",q3);
	printf("Possui %d números de 76 até 100 \n",q4);
	
	return 0;
}	