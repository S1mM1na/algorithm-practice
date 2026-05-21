import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 1; tc <= 10; tc++) {

            // 1. 건물의 개수 N을 읽는다
            String line = br.readLine();
            int N = Integer.parseInt(line);

            // 2. N개의 건물의 높이를 읽는다
            int[] buildings = new int[N]; // 배열 크기를 N으로 설정
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) { // 건물의 높이를 배열에 저장
                buildings[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            // 3. 조망권 확보 세대 계산 
            for (int i = 2; i < N - 2; i++) {
                // 현재 건물 주변 4개 중 가장 높은 건물의 높이 찾기
                int maxNeighbor = Math.max(
                        Math.max(buildings[i - 2], buildings[i - 1]),
                        Math.max(buildings[i + 1], buildings[i + 2])
                );

                // 현재 건물이 주변 최고 높이보다 높을 때만 그 차이를 더함
                if (buildings[i] > maxNeighbor) {
                    count += (buildings[i] - maxNeighbor);
                }
            }


            System.out.println("#" + tc + " " + count);
        }
    }
}
