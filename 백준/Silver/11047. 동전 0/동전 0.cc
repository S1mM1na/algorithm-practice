#include <stdio.h>
int main()
{
	int n,k;
	int i,sum=0;
	int arr[10];
	scanf("%d",&n);
	scanf("%d",&k);//4200
	
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	while(k!=0)
	{
		sum+=k/arr[n-1];
		k=k%arr[n-1];
		n--;
	}
	printf("%d",sum);
}