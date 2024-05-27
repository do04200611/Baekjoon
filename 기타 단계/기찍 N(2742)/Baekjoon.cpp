#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main(void)
{
	int num;
	scanf("%d", &num);
	int a = num;
	for (int i = 0; i < num; i++) {
		printf("%d\n", a);
		a--;

	}

	
}
