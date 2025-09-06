#include <stdio.h>
int main()
{
	int score;
	scanf("%d", &score);
	int i;
	i = score / 10;
	switch (i){
	case 10:
		printf("A");
		break;
	case 9:
		printf("A");
		break;
	case 8:
		printf("B");
		break;
	case 7:
		printf("C");
		break;
	case 6:
		printf("D");
		break;
	default:
		printf("F");
		break;
	}
	return 0;
}