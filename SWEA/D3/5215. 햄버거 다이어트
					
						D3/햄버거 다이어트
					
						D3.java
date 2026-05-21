
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int[] taste, cal;
    static int num, maxCal, max;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            num = Integer.parseInt(st.nextToken());
            maxCal = Integer.parseInt(st.nextToken());

            taste = new int[num];
            cal = new int[num];

            for (int n = 0; n < num; n++) {

                st = new StringTokenizer(br.readLine());

                taste[n] = Integer.parseInt(st.nextToken());
                cal[n] = Integer.parseInt(st.nextToken());
            }

            max = 0;

            getSubSet(0, 0, 0);

            System.out.println("#" + t + " " + max);
        }
    }

    private static void getSubSet(int cnt, int calSum, int tasteSum) {

        if (calSum > maxCal)
            return;

        if (cnt == num) {

            max = Math.max(max, tasteSum);

            return;
        }

        // 선택
        getSubSet(cnt + 1,
                calSum + cal[cnt],
                tasteSum + taste[cnt]);

        // 미선택
        getSubSet(cnt + 1,
                calSum,
                tasteSum);
    }
}