#include <stdio.h>
int main()
{
	int num;
	int str1[1000000];
	int str2[1000000];
	int sum[1000000];
	scanf("%d", &num);
	for (int i = 0; i < num; i++)
	{
		scanf("%d %d", &str1[i], &str2[i]);
		sum[i] = str1[i] + str2[i];
	}
	for (int i = 0; i < num; i++)
	{
		printf("%d\n", sum[i]);
	}
	return 0;
}