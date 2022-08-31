#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
//Calcula a média de um intedeterminado número de vezes , mostra a quantida de positivos e negativos
// em forma percentual , e a quantidade de números positivos e negativos .
int main() {
	
	float valor = -1;
	float soma = 0;
	float media;
	float pp = 0;
	float pn = 0;
	float total;
	float positivos = 0;
	float negativos = 0;
	while (valor != 0) {
		printf("Digite um valor : ");
		scanf("%f",&valor);
		
		
		if (valor >0) {
			positivos = positivos + 1;
			
		}
		if (valor < 0) {
			negativos = negativos + 1;
		}
		soma = soma + valor;
		
		total = positivos + negativos;
		pp = positivos*100/total;
		pn = negativos*100/total;
		
		media = soma/total;
		
	}
		printf("A média é : %.2f \n",media);
		printf("A quantidade de positivos é : %.2f \n",positivos);
		printf("A quantidade de negativos é : %.2f \n",negativos);
		printf("A porcentagem de positivos é : %.2f \n",pp);
		printf("A porcentagem de negativos é : %.2f \n",pn);
	return 0;
}