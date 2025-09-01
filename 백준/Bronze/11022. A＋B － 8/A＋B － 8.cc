#include <stdio.h>
int main()
{
	int n,A, B;
	scanf("%d", &n);
	for (int i = 0; i < n; i++){
		scanf("%d %d", &A, &B);
		printf("Case #%d: %d + %d = %d\n", i + 1,A,B,A+B);
	}
}