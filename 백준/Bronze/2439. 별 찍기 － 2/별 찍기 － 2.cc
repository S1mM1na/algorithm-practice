#include <stdio.h>
int main()
{
	int num;
	scanf("%d", &num);
	for (int i = 1; i <= num; i++) //num개의 줄
	{
		for (int j = num - i; j > 0; j--)
		{
			printf(" ");
		}
		for (int k = 1; k <= i; k++)
		{
			printf("*");
		}
		printf("\n");
	}
}
