#include <stdio.h>
#include <stdlib.h>

int main () {
	float n1;
	int positivos = 0;
	int negativos = 0;
	
	float i=0;
	float soma = 0;
	float media = 0;
	float ppositivos = 0;
	float pnegativos = 0;
	do {
	    
		printf("Digite um número para armazenar e calcular sua média \n");
		scanf("%f",&n1);
		
		soma = soma + n1;
		
		if (n1 > 0) {
		   positivos++;
		}
		else if (n1 < 0) {
		    negativos++;
		}
		
		i++;
		
		if (n1 == 0) {
		    
		    i = i - 1;
		}
	} while (n1 != 0);	
	
	media = soma / i;
	ppositivos = (positivos/i)*100;
	pnegativos = (negativos/i)*100;
	printf("Valor de i %.2f \n",i);
	printf("Valor de media %.2f \n",media);
	printf("Quantidade de postivos %d \n",positivos);
	printf("Quantidade de negativos %d \n",negativos);
	printf("Percentual postivos %.2f \n",ppositivos);
	printf("Percentual negativos %.2f \n",pnegativos);
	
	
	
	
	return 0;
}