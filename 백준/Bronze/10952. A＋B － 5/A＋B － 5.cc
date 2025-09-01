#include <stdio.h>
int main()
{
	int A, B;
	int sum[100];
	int i = 0;
	while(1){

		scanf("%d %d", &A, &B);
		
		sum[i] = A + B;
		if (A == 0 && B == 0)
		{
			break;
		}
		i++;
	}
	for (int i = 0; sum[i] != NULL; i++)
	{
		printf("%d\n", sum[i]);
	}
	return 0;
}
