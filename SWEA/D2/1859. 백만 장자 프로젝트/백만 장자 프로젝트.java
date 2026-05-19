import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {

            int N = Integer.parseInt(br.readLine());

            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long answer = 0;

            // 뒤에서부터 최대값 관리
            int maxPrice = arr[N - 1];

            for (int i = N - 2; i >= 0; i--) {

                // 현재 값이 미래 최대값보다 작으면 구매
                if (arr[i] < maxPrice) {
                    answer += (maxPrice - arr[i]);
                }

                // 더 큰 값 나오면 최대값 갱신
                else {
                    maxPrice = arr[i];
                }
            }

            System.out.println("#" + tc + " " + answer);
        }
    }
}
