#include <stdio.h>
int main()
{
	int num[100];
	int v, n;
	scanf("%d", &n);
	for (int i = 0; i < n; i++)
	{
		scanf("%d", &num[i]);
	}
	scanf("%d", &v);

	int count = 0;
	for (int i = 0; i < n; i++) {
		if (num[i] == v)
			count++;
	}
	printf("%d", count);
}