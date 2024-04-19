#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int A, B, C, num;
	scanf("%d %d %d",&A,&B,&C);

	if (A == B && B == C) {
		 num = A * 1000 + 10000;
		printf("%d ", num);
	}
	else if (A==B || A ==C) {
		 num = A * 100 + 1000;
		printf("%d ", num);
	}
	else if (B==C) {
		num = B * 100 + 1000;
		printf("%d ", num);
	}
	else if(A>B && A>C){
		num = A * 100;
		printf("%d ", num);
	}
	else if (B > C && B > A ) {
		num = B * 100;
		printf("%d ", num);
	}
	else if (C > A && C > B ) {
		num = C * 100;
		printf("%d ", num);
	}



}
