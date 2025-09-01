#include <stdio.h>
int main() {
	int n, m;
	scanf("%d %d", &n, &m);
	int gdc;//최대 공약수
	
	int big = n > m ? n : m;
	int small = n < m ? n : m;
	int mod=big%small;//나머지 값을 받을 변수
	while (mod != 0) {
		big = small;
		small = mod;
		mod = big % small;
	} //small값이 최대 공약수
	gdc = small;
	int lcm = (n * m) / gdc;
	printf("%d\n%d", gdc, lcm);
}