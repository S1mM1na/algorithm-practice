

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int num = Integer.parseInt(br.readLine());

            char[][] arr = new char[8][8];

            for (int i = 0; i < 8; i++) {
                String line = br.readLine();

                for (int j = 0; j < 8; j++) {
                    arr[i][j] = line.charAt(j);
                }
            }

            int count = 0;

            // 가로 회문 검사
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - num; j++) {
                    int sameCount = 0;

                    for (int n = 0; n < num / 2; n++) {
                        if (arr[i][j + n]
                                == arr[i][j + num - 1 - n]) {
                            sameCount++;
                        }
                    }

                    if (sameCount == num / 2) {
                        count++;
                    }
                }
            }

            // 세로 회문 검사
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - num; j++) {
                    int sameCount = 0;

                    for (int n = 0; n < num / 2; n++) {
                        if (arr[j + n][i]
                                == arr[j + num - 1 - n][i]) {
                            sameCount++;
                        }
                    }

                    if (sameCount == num / 2) {
                        count++;
                    }
                }
            }

            System.out.println("#" + tc + " " + count);
        }
    }
}