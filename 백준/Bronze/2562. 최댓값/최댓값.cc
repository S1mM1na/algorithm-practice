#include <stdio.h>
int main()
{
	int arr[100],arr2[100];
	for (int i = 0; i < 9; i++)
	{
	scanf("%d", &arr[i]);
	arr2[i] = arr[i];
	}
	int count = 1;
	int temp = 0;
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 8 - i; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	for (int i = 0; i < 9; i++) {
		if (arr[8] == arr2[i])
			break;
		count++;
	}
	printf("%d\n%d", arr[8], count);
	return 0;
}