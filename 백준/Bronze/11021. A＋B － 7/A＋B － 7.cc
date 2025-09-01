#include <stdio.h>
int main()
{
	int n;
	int A, B;
	int sum[10000];
	scanf("%d", &n);
	for (int i = 0; i < n; i++)
	{
		scanf("%d %d", &A, &B);
		sum[i] = A + B;
	}
	for (int i = 0; i < n; i++)
	{
		printf("Case #%d: %d\n", i + 1, sum[i]);
	}
}