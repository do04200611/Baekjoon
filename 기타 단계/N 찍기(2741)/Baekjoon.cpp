#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main(void)
{
	int num; //num을 변수를 int형으로 선언
	scanf("%d", &num); //num의 값을 입력 받음

	for (int i = 1; i <= num; i++) { //i가 1부터 num보다 크거나 같을 때 까지 실행
		printf("%d\n", i); //i의 값을 출력
	}

	
}
