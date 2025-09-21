import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] freqX = new int[10];
        int[] freqY = new int[10];

        for (int i = 0; i < X.length(); i++) {
            int d = X.charAt(i) - '0';
            freqX[d]++;
        }
        for (int i = 0; i < Y.length(); i++) {
            int d = Y.charAt(i) - '0';
            freqY[d]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int d = 9; d >= 0; d--) {
            int common = Math.min(freqX[d], freqY[d]);
            while (common-- > 0) sb.append(d);
        }

        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}