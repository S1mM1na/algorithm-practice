#include <stdio.h>
int main() {
	int n;
	scanf("%d", &n);
	
		for (int i = 2; n!=0; i++) {
			if (n == 1)
				break;
			else if (n % i == 0) {
				n /= i;
				printf("%d\n", i);
				i--;
			}
		}
	return 0;
}