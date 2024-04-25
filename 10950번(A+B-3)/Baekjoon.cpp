#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int a;
	scanf("%d", &a);

	for (int i = 0; i != a; i++)
	{
		int  ac, ab;
		scanf("%d %d",  &ac, &ab);
		printf("%d",ac+ab );

	}

}
