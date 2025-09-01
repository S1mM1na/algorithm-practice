#include <stdio.h>
#include <string.h>
int main() {
	char str[1001];
	
	int n;
	fgets(str, sizeof(str), stdin);
	scanf("%d", &n);
	if (sizeof(str) >= n) {
		printf("%c", str[n-1]);
	}
	
	
}