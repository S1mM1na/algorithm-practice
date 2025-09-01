#include <stdio.h>
int main()
{
	int A, B;
	int sum[10000];
	int i = 0;
	while (scanf("%d %d", &A, &B) != EOF)
	{
		sum[i] = A + B;
		i++;
	}

	for ( int j = 0; sum[j] != NULL; j++)
	{
		printf("%d\n", sum[j]);
	}
	return 0;

}