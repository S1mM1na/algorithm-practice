import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt(); // 삼각형의 크기
            
            // 파스칼의 삼각형을 담을 2차원 배열 선언 (0번 인덱스부터 사용)
            int[][] dp = new int[N][N];

            System.out.println("#" + t);

            for (int i = 0; i < N; i++) {
                // i번째 줄에는 i+1개의 숫자가 들어감
                for (int j = 0; j <= i; j++) {
                    // 규칙 1: 줄의 처음과 끝은 무조건 1
                    if (j == 0 || j == i) {
                        dp[i][j] = 1;
                    } 
                    // 규칙 2: 그 외에는 왼쪽 위와 오른쪽 위의 합
                    else {
                        dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                    }
                    
                    // 문제 조건에 맞춰 숫자 사이에 한 칸의 공백을 두고 출력
                    System.out.print(dp[i][j] + " ");
                }
                // 한 줄 출력이 끝나면 줄바꿈
                System.out.println();
            }
        }
        sc.close();
    }
}