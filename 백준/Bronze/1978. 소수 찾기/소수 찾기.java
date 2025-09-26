
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean[] sieve(int max) {
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime,true);
        isPrime[0] =isPrime[1]=false;

        for (int p = 2; p * p <= max; p++) {
            if (isPrime[p]) {
                for (int m = p * p; m <= max; m += p) {
                    isPrime[m] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
        }

        boolean[] isPrime = sieve(max);

        int count = 0;
        for (int x : arr) {
            if (isPrime[x]) count++;
        }
        System.out.println(count);
    }
}