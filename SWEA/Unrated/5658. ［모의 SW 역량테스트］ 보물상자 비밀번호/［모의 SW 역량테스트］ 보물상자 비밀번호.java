

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());//testcase수

        for(int tc=1; tc<=T; tc++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());//숫자 수
            int K=Integer.parseInt(st.nextToken());//k번째 큰 수

            String totalSecret=br.readLine();
            totalSecret=totalSecret+totalSecret;

            HashSet<String> secret=new HashSet<>();

            //전체수를 4로 나눈 수만큼씩 잘라서 배열에 저장
            for(int i=0; i<N; i++){
                secret.add(totalSecret.substring(i, i + N/4));
            }

            String[] result=secret.toArray(new String[0]);
            
            //배열에 존재하는 16진수 수들을 내림차순 정렬
            Arrays.sort(result, (a, b) ->
                    Integer.compare(
                            Integer.parseInt(b, 16),
                            Integer.parseInt(a, 16)
                    )
            );

            System.out.println("#"+tc+" "+Integer.parseInt(result[K-1],16));


        }
    }
}
