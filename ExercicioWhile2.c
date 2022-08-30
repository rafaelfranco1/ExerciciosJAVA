#include <stdio.h>

int main() {
	
	int i = 10;
	
	do {
		printf("%d \n",i);
		i = i - 1;
	} while (i > 0) ;
	
	//usando for
	
	i = 10;
	
	for (i, i > 0 , i = i -1) {
		printf("%d \n",i);
		
	}
	
	//usando while
	
	i = 10;
	
	while (i > 0) {
		printf("%d \n",i);
		i = i - 1 ;
	}
	return 0;
}