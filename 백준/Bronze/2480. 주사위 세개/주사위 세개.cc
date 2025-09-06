#include <stdio.h>
int main()
{
	int data[10000];
	int temp;
	for (int i = 0; i < 3; i++)
	{
		scanf("%d",&data[i]);
	}
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < (3 - 1) - i; j++) 
		{
			if (data[j] < data[j + 1]) 
			{	
				temp = data[j];
				data[j] = data[j + 1];
				data[j + 1] = temp;
			}
		}
	}
		
		if (data[0] ==data[1])
		{
			if (data[1] == data[2])
			{
				printf("%d", 10000 + data[0] * 1000);
			}
			else if (data[1] != data[2])
			{
				printf("%d", 1000 + data[0] * 100);
			}
		}

		else if (data[1] == data[2])
		{
			printf("%d", 1000 + data[1] * 100);
		}

		else
		{
			printf("%d", data[0] * 100);
		}
		return 0;
}