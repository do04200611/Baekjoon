#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int x, y;
	scanf("%d %d", &x, &y);

		if (x < 0) { //x가 음수 일 때
			if (y < 0) {// y가 음수 일 때
				printf("3");
			}
			if (y > 0) {// y가 양수 일 때
				printf("2");
			}
		}
		else if (x > 0) { // x가 양수 일 때
			if (y > 0) {// y가 양수 일 때
				printf("1");
			}
			if (y < 0) { // y가 음수 일 때
				printf("4");
			}
		}
		return 0;

	}

