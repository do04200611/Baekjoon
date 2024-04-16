#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int  main() {
	int num, num2;

	scanf("%d %d", &num, &num2);
	

	int  first = ((num2 % 100) % 10) * num;
	int second = ((num2 % 100) / 10) * num;
	int third  = (num2 / 100) * num;
	int result = num * num2;

	printf("%d\n", first);
	printf("%d\n", second);
	printf("%d\n", third);
	printf("%d\n", result);

	return 0;


}