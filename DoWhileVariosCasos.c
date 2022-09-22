#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {
	
	int i = 3;
	int positivos = 0;
	int pares = 0;
	int impares = 0;
	float somapares = 0;
	float somaimpares = 0;
	int total;
	float mediapar;
	float mediatotal;
	while (i != 0) {
	
		printf("Digite um número , se for positivo será contabilizado: ");
		scanf("%d",&i);
		if (i < 0) {
			printf("Número negativo, este software trabalha somente com postivos \n");
			
		}
		
		if(i > 0) {
			positivos = positivos + 1;
		}
		
		if (i % 2 == 0) {
			
			
			if (i != 0 && i > 0) {
				pares = pares + 1;
				somapares = somapares + i;
				
			}
		}
		
		if (i % 2 != 0 && i > 0) {
			impares = impares + 1;
			somaimpares = somaimpares + i;
			
		}
		
	
		total = positivos;
		
		mediapar = somapares/positivos;
		mediatotal = (somapares + somaimpares)/positivos;
		
	}
	printf("Possui %d números no total \n",total);
	printf("Possui %d números pares \n",pares);
	printf("Possui %d números ímpares \n",impares);
	printf("A média dos números pares é: %.2f \n",mediapar);
	printf("A média dos números geral é: %.2f \n",mediatotal);
	return 0;
}
