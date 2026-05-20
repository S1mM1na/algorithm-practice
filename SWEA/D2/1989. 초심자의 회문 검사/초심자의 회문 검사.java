import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            String str = br.readLine();

            int answer = 1;

            for (int j = 0; j < str.length() / 2; j++) {

                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    answer = 0;
                    break;
                }
            }

            System.out.println("#" + i + " " + answer);
        }
    }
}