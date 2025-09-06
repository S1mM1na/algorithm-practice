#include <stdio.h>
int main()
{
	int H, M;
	int C;

	scanf("%d %d", &H, &M);
	scanf("%d", &C);

	if (M + C < 60)
	{
		printf("%d %d", H, M + C);
	}

	else if (M + C == 60)
	{
		H++;
		if (H >= 24)
		{
			H = H - 24;
		}
		printf("%d %d", H, M + C - 60);
	}

	else //M+C가 60보다 클때
	{
		int K = M + C;
		for (int i = 0; K >= 60; i++)
		{
			H++;
			K = K - 60;
		}
		if (H >= 24)
		{
			H = H - 24;
		}
		printf("%d %d", H,K);
	}
	return 0;
}