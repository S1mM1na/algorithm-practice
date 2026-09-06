
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc=1; tc<=T; tc++) {
            int N=Integer.parseInt(br.readLine());
            int[] tree=new int[N];
            StringTokenizer st=new StringTokenizer(br.readLine());
            int max=0;

            for (int i=0; i<N; i++) {
                tree[i] = Integer.parseInt(st.nextToken());
                max=Math.max(max, tree[i]);
            }

            int one=0; // 1이 필요한 횟수
            int two=0; // 2가 필요한 횟수

            // 각 나무가 얼마나 부족한지 계산
            for(int i=0; i<N; i++){
                int diff=max-tree[i];
                two+=diff/2;
                one+=diff%2;
            }


            // 2 하나를 1 두 개로 변환
            while(two>one+1){
                two--;
                one+=2;
            }

            int answer;
            if(one>two){
                answer=one*2-1;
            } else {
                answer=two*2;
            }

            System.out.println("#" + tc + " " + answer);
        }
    }
}
