#include <stdio.h>

#include <stdlib.h>

int main() {
	float valor = 1;
	float quantidade = 0;
	float quantidadea = 0;
	float quantidadeb = 0;
	float quantidadec = 0;
	float quantidaded = 0;
	while (valor >= 0) {
		printf("Digite um valor : ");
		scanf("%f",&valor);
		if (valor >= 0 && valor <=25) {
			quantidadea = quantidadea + 1;
		}
		else if (valor > 25 && valor <=50) {
			quantidadeb = quantidadeb + 1;
		}
		else if (valor > 50 && valor <=75) {
			quantidadec = quantidadec + 1;
		}
		else if (valor > 75 && valor <=100) {
			quantidaded = quantidaded + 1;
		}
	}
	if (quantidadea > 0) {
		printf("Possui %.2f valores de 0 até 25 \n",quantidadea);
	}
	
	if (quantidadeb > 0) {
		printf("Possui %.2f valores de 25 até 50 \n",quantidadeb);
	}
	
	if (quantidadec > 0) {
		printf("Possui %.2f valores de 50 até 75 \n",quantidadec);
	}
	
	if (quantidaded > 0) {
		printf("Possui %.2f valores de 75 até 100 \n",quantidaded);
	}
	
	float total = quantidadea + quantidadeb + quantidadec + quantidaded;
	
	printf("Entreram nestes intervalos %.2f números \n",total);
	return 0;
}