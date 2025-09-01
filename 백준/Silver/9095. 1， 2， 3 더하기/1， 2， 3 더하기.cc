#include <stdio.h>
int main() {
	int t,n; //t:케이스의 개수, n:정수
	scanf("%d", &t);
	int dp[11] = { 1,2,4, };
	for (int i = 0; i < t; i++) {
		scanf("%d", &n);
		for (int j = 3; j < n; j++)
			dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
		printf("%d\n", dp[n-1]);
	}
}