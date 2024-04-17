#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {

    long long A , B, C;


    //visual studio의 경우 scanf_s("%lld %lld %lld", &A, &B, &C);
    scanf("%lld %lld %lld", &A, &B, &C);
    long long s = A + B + C;
    printf("%lld",s);

    return 0;
}

