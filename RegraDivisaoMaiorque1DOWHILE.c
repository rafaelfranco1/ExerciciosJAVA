#include <stdio.h>
#include <stdlib.h>

int main () {
	
	int d,n;
	float r;
	
	do {
		printf("Digite o numerador e o denominador \n");
		scanf("%d%d",&n,&d);
		
	}while (d > n || d == 0);
	
	r = d/n;
	printf("O resultado da divisão é: %.2f",r);
	
	
	return 0;
}