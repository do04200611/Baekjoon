#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main(void)
{
	int num; //변수 num을 int형으로 선언함
	scanf("%d", &num); //num의 값을 입력 받음
	int a = num; //a가 num에 대입함
	for (int i = 0; i < num; i++) { //i가 0부터 num보다 작거나 같을 때 까지 실행함
		printf("%d\n", a); //a의 값 출력
		a--; //a값 감소

	}

	
}
