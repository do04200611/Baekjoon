#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int A, B, C, num; // 변수 세개 선언
	scanf("%d %d %d",&A,&B,&C); // 선언된 변수 값 입력 받기

	if (A == B && B == C) { // 변수 모두 같을 때
		 num = A * 1000 + 10000; 
	}
	else if (A==B || A ==C) {// 변수 2개의 값이 같을 때
		 num = A * 100 + 1000;
	}
	else if (B==C) { // 변수 2개의 값이 같을 때
		num = B * 100 + 1000;
	}
	else if(A>B && A>C){ // 최댓 값 구하기
		num = A * 100;
	}
	else if (B > C && B > A ) {// 최댓 값 구하기
		num = B * 100; 
	}
	else if (C > A && C > B ) {// 최댓 값 구하기
		num = C * 100;
	}

	printf("%d ", num);//num 값 출력
}
