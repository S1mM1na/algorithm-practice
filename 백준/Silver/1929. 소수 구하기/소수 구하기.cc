#include <stdio.h>
#include <math.h>

int is_prime(int num) {
    if (num < 2)
        return 0;
    
    int sqrt_num = sqrt(num);
    for (int i = 2; i <= sqrt_num; i++) {
        if (num % i == 0)
            return 0;
    }
    
    return 1;
}

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    
    for (int i = n; i <= m; i++) {
        if (is_prime(i))
            printf("%d\n", i);
    }
    
    return 0;
}
