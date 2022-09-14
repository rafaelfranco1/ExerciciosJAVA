#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int n;
	int i = 1;
	int soma = 0;
	printf("Digite um número inteiro, para ver as soma dos múltiplos de contidos de 1 até este número: ");
	scanf("%d",&n);
	while (i <= n) {
		if (i % 5 == 0) {
			soma = soma + i;
		}
		i = i + 1;
	
	}
	printf("%d",soma);
	return 0;
} 