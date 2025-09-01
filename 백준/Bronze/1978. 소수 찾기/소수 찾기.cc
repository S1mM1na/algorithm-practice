#include <stdio.h>
int main() {
	int n,m,ck=0,count=0;
	scanf("%d", &n);
	for (int i = 1; i <= n; i++) {
		scanf("%d", &m);
		if (m != 1) {
			for (int j = 2; j < m; j++) {
				if (m % j == 0)
					count++;
			}
			if (count == 0)
				ck++;
			count = 0;
		}
	}
	printf("%d", ck);
}