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
	
		printf("Digite um n�mero , se for positivo ser� contabilizado: ");
		scanf("%d",&i);
		if (i < 0) {
			printf("N�mero negativo, este software trabalha somente com postivos \n");
			
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
	printf("Possui %d n�meros no total \n",total);
	printf("Possui %d n�meros pares \n",pares);
	printf("Possui %d n�meros �mpares \n",impares);
	printf("A m�dia dos n�meros pares �: %.2f \n",mediapar);
	printf("A m�dia dos n�meros geral �: %.2f \n",mediatotal);
	return 0;
}
