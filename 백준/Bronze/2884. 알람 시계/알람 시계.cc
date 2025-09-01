#include <stdio.h>
int main()
{
	int H, M;
	scanf("%d %d", &H, &M);
	if (M >= 45)
	{
		M = M - 45;
		printf("%d %d", H, M);
	}

	else if (M < 45)
	{
		if (H > 0)
		{
			H = H - 1;
		}
		else
		{
			H = H + 24 - 1;
		}
		
		M = M + 60 - 45;
		printf("%d %d", H, M);
	}

	return 0;
}