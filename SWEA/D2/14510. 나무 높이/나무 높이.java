
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++){
            int N=Integer.parseInt(br.readLine());
            int[] tree=new int[N];
            st=new StringTokenizer(br.readLine());
            int max=0;
            for(int i=0; i<N; i++){
                tree[i]=Integer.parseInt(st.nextToken());
                max=Math.max(max,tree[i]);//가장 큰 나무의 키 구하기
            }

            int answer=Integer.MAX_VALUE;

            for(int t=max; t<=max+1; t++){
                int[] newTree=new int[N];
                for(int i=0; i<N; i++){
                    newTree[i]=t-tree[i];
                }

                int one=0;
                int two=0;
                for(int i=0; i<N; i++){
                    two+=newTree[i]/2;
                    one+=newTree[i]%2;
                }

                while(one+1<two){
                    two-=1;
                    one+=2;
                }
                int day=0;
                if(one>two){
                    day=one*2-1;
                }
                else{
                    day=two*2;
                }
                answer=Math.min(answer,day);
            }
            System.out.println("#"+tc+" "+answer);

        }
    }
}
