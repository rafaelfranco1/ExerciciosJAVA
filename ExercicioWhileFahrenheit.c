// Online C compiler to run C program online
#include <stdio.h>

//conversão de farenheit para celsius , poré de 40 a 70 graus célsius
//usando do while
int main () {
	float f = 40;
	float c;
	
	do {
	  c = 5.0/9.0 * (f - 32);
	  printf("%f \n", c);
	  f = f + 1;
} while (f < 71);
//com loop wihle
    while (f < 71) {
        
        c = 5.0/9.0 * (f - 32);
        printf("%f \n",c);
        f = f + 1;
    }

	return 0;

}