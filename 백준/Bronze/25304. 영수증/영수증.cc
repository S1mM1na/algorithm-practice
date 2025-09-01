#include <stdio.h>
int main()
{
	int total_price, total_num;
	scanf("%d", &total_price);
	scanf("%d", &total_num);
	int price[100000];
	int num[100000];
	int sum=0;
	for (int i = 0; i < total_num; i++)
	{
		scanf("%d %d", &price[i], &num[i]);
		sum += price[i] * num[i];
	}
	if (sum == total_price)
		printf("Yes");
	else if (sum != total_price)
		printf("No");
	return 0;
}