import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int N=0,M=0;
    static int[][] incompatible;
    static boolean[] selected;
    static int answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int tc=1; tc<=T; tc++){
            st=new StringTokenizer(br.readLine());
            N=Integer.parseInt(st.nextToken());
            M=Integer.parseInt(st.nextToken());

            incompatible=new int[M][2];

            for(int i=0; i<M; i++){
                st=new StringTokenizer(br.readLine());
                incompatible[i][0]=Integer.parseInt(st.nextToken());
                incompatible[i][1]=Integer.parseInt(st.nextToken());
            }

            selected=new boolean[N+1];

            answer=0;

            dfs(1);
            System.out.println("#"+tc+" "+answer);

        }






    }


    static void dfs(int cnt){
        //만약 모든 조합을 다 확인 했을 경우
        if(cnt==N+1){
            answer++;
            return;
        }

        //현재 재료를 선택하지 않는 경우
        dfs(cnt+1);

        boolean possible=true;
        //현재 재료를 선택하는 경우

        //현재 선택하는 재료와 선택된 재료가 같이 먹으면 안되는 경우
        for(int i=0; i<M; i++){
            if(cnt==incompatible[i][0]&&selected[incompatible[i][1]]){
                possible=false;
                break;
            }
            if(cnt==incompatible[i][1]&&selected[incompatible[i][0]]){
                possible=false;
                break;
            }
        }

        if(possible){
            selected[cnt]=true;
            dfs(cnt+1);
            selected[cnt]=false;
        }

    }
}
