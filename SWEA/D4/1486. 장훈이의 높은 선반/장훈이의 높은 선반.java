import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int N,M;
    static int[] height;
    static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++){
            min=Integer.MAX_VALUE;
            StringTokenizer st=new StringTokenizer(br.readLine());
            N=Integer.parseInt(st.nextToken());
            M=Integer.parseInt(st.nextToken());
            height=new int[N];
            st=new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                height[i]=Integer.parseInt(st.nextToken());
            }

            dfs(0,0);

            int result=min-M;

            System.out.println("#"+tc+" "+result);
        }
    }

    static void dfs(int idx,int sum){
        if(sum>=M){
            min=Math.min(min,sum);
            return;
        }
        if(idx==N){
            return;
        }
        
        //사람을 선택하는 경우
        dfs(idx+1,sum+height[idx]);

        //선택하지 않는 경우
        dfs(idx+1,sum);
    }
}
