#include <stdio.h>
//#imprimir de 0 a 50 usando while
int main () {
	
	int numero = 0;
	printf("Usando while \n");
	while (numero < 11) {
		printf("%i \n",numero);
		numero = numero + 1;
	}
	
	printf("\n \n");
	printf("Usando do while \n");
	numero = 0;
	
	do {
		printf("%i \n",numero);
		numero = numero + 1;
	}while(numero < 11);
	
	printf("\n \n");
	printf("Usando for");
	numero = 0;
	for (numero ; numero < 11 ; numero++) {
		printf("%i \n",numero);
	}
	
	return 0;
	
}