import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] result;
    static int[] check;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth){
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (check[i] == 0) {
                result[depth] = i;
                check[i] = 1;
                dfs(depth + 1);
                check[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        result = new int[M];
        check  = new int[N + 1];

        dfs(0);
        System.out.print(sb.toString());
    }
}