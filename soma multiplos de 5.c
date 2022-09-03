#include <stdio.h>
#include <stdlib.h>

int main() {
	int n;
	int i = 0;
	soma = 0;
	printf("Digite o final do intervalo para realizar a soma: ");
	scanf ("%d",&n);
	printf("\n");
	
	while (i <= n) {
		if(i%5==0) {
			soma = soma +i;
		}
		i = i + 1;
		
	}
	printf("%d",soma);
	return 0;
}