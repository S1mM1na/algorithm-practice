#include <stdio.h>
int main()
{
	int n,x,i;
	int str[10000];
	scanf("%d %d",&n,&x);
	
	for(i=0; i<n; i++)
	{
		scanf("%d",&str[i]);
	}
	
	for(i=0; i<n; i++)
	{
		if(str[i]<x)
		{
			printf("%d ",str[i]);
		}
	}
	
}