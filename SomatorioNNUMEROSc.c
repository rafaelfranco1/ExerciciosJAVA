#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int i = 1;
	int n;
	printf("Digite o final do somatório: \n");
	int soma = 0;
	scanf("%d",&n);
	while (i <= n) {
		soma = soma + i;
		i++;
	
	}
	printf("A soma dos %d numeros é %d ",n,soma);
	return 0;
}