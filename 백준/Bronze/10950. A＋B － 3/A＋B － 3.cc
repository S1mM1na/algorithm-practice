#include <stdio.h>
int main()
{
	int T;
	int A, B;
	int num[100000];
	scanf("%d", &T);
	for (int i = 0; i < T; i++)
	{
		scanf("%d %d", &A, &B);
		num[i] = A + B;
	}
	for (int i = 0; i < T; i++)
	{
		printf("%d\n", num[i]);
	}
	return 0;
}