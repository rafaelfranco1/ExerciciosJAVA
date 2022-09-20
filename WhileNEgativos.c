#include <stdio.h>
#include <stdlib.h>

int main () {
	int i = 1;
	int negativos = 0;
	int n ;
	while (i <= 10) {
		printf("Digite um valor, caso o mesmo seja negativo sera contabilizado: %d/10 ",i);
		scanf("%i",&n);
		
		if (n < 0 ) {
			negativos = negativos + 1;
		}
		i= i + 1;
		
	}
	
	printf("Possui %d negativos",negativos);
	
	return 0;
}
