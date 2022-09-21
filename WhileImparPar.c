#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int i = 1;
	int n;
	int positivos = 0;
	int negativos = 0;
	
	while (i <=5) {
		printf("Digite um número , vai ser contabilizado o mesmo é positivo ou negativo: ");
		scanf("%d",&n);
		i++;
		
		if (n > 0) {
			positivos = positivos + 1;
		}
		
		if (n < 0) {
			negativos = negativos + 1;
		}
	}
	printf("Possui %d números positivos \n",positivos);
	printf("Possui %d números negativos",negativos);
	return 0;
}
