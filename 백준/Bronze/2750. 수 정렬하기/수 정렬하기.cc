#include <stdio.h>
void bubblesort(int arr[],int len);
int main(void)
{
	int i,a,j;
	int arr[1000];
	scanf("%d",&i);
	for(a=0; a<i; a++)
	{
		scanf("%d",&j);
		arr[a]=j;
		j=0;
	}
	bubblesort(arr, i);
	for(a=0; a<i; a++)
	{
		printf("%d\n",arr[a]);
	}
	
}
void bubblesort(int arr[],int len)
{
	int i,j,temp=0; 
	for(i=0; i<len-1; i++)
	{
		for(j=0; j<(len-i)-1; j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}