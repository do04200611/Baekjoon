#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int A, B, C;
	scanf("%d %d %d", &A, &B, &C);

	B += C;

	if (B>= 60)
	{
		A += B / 60;
		B = B%60;
		
	}
	 if (A >= 24)
	{
		A -= 24;
	}
	
	 printf("%d %d", A, B);
	return 0;
}

