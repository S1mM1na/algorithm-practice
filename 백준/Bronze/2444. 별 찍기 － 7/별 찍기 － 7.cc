#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
int main() {
	int n;
	scanf("%d", &n);
	for (int j = 0; j < n; j++) {
		for (int i = 1; i < n-j; i++) {
			printf(" ");
		}
		for (int i = 1; i <=(j+1)*2-1; i++) {
			printf("*");
		}
		printf("\n");
	}
	for (int j = 0; j < n-1; j++) {
		for (int i = 1; i <j+2; i++) {
			printf(" ");
		}
		for (int i = 1; i <=2*(n-j)-3; i++) {
			printf("*");
		}
		printf("\n");
	}
	
}