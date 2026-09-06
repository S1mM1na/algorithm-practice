import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int[] arr = {a, b, c, d, e};

        int answer = Integer.MAX_VALUE;

        // 1명짜리 팀을 먼저 고름

        for (int i = 0; i < 5; i++) {

            // 나머지 4명 중 첫 번째 2명 팀

            for (int j = 0; j < 5; j++) {
                if (j == i) continue;
                for (int k = j + 1; k < 5; k++) {
                    if (k == i) continue;
                    int team1 = arr[i];
                    int team2 = arr[j] + arr[k];
                    int team3 = 0;

                    // 남은 2명이 마지막 팀
                    for (int m = 0; m < 5; m++) {
                        if (m != i && m != j && m != k) {
                            team3 += arr[m];
                        }
                    }

                    // 세 팀 능력치가 모두 달라야 함
                    if (team1 == team2 ||
                        team1 == team3 ||
                        team2 == team3) {
                        continue;

                    }

                    int max = Math.max(team1, Math.max(team2, team3));
                    int min = Math.min(team1, Math.min(team2, team3));
                    answer = Math.min(answer, max - min);
                }
            }
        }
        // 가능한 팀 구성이 하나도 없으면 -1
        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}