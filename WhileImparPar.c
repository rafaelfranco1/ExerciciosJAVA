#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int i = 1;
	int n;
	int positivos = 0;
	int negativos = 0;
	
	while (i <=5) {
		printf("Digite um n�mero , vai ser contabilizado o mesmo � positivo ou negativo: ");
		scanf("%d",&n);
		i++;
		
		if (n > 0) {
			positivos = positivos + 1;
		}
		
		if (n < 0) {
			negativos = negativos + 1;
		}
	}
	printf("Possui %d n�meros positivos \n",positivos);
	printf("Possui %d n�meros negativos",negativos);
	return 0;
}
