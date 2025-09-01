#include <stdio.h>
int main() {
	int n=123456;
	int arr[246913] = { 0, };
	for (int i = 2; i <= 2 * n; i++) {
		arr[i] = i;
	}
	for (int i = 2; i <= 2 * n; i++) {
		if (arr[i] == 0) continue;
		for (int j = i * 2; j <= 2 * n; j += i) {
			arr[j] = 0;
		}
	}

	while (n != 0) {
		int cnt = 0;
		scanf("%d", &n);
		if (n == 0) {
			break;
		}
		
		for (int i = n + 1; i <= 2 * n; i++) {
			if (arr[i] != 0) {
				cnt++;
			}
		}
		printf("%d\n", cnt);
	}

}