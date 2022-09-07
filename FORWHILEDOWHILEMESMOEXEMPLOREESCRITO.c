// Online C compiler to run C program online
#include <stdio.h>

int main() {
    	printf("Com for \n");
	int i;
	for (i = 0 ; i < 11 ; i++) {
		
		printf("%d \n",i);
	}
	printf("\n");

	
	printf("Com While \n");
	
     i = 0 ;
    
   	while (i < 11) {
		
		printf("%d \n",i);
		i++;
	}
	printf("\n");
	printf("Com Do While \n");
	
    // zerando o valor de i;
    i = 0;
   
   	do {
		
	printf("%d \n",i);
	i++;
	}while (i < 11);
}