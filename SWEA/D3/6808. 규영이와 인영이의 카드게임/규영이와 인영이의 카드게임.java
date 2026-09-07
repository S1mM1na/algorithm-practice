import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] cards_A;
    static int[] cards_B;
    static int[] selected;
    static boolean[] visited;

    static int win;
    static int lose;
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++){
            StringTokenizer st=new StringTokenizer(br.readLine());

            cards_A=new int[9];
            cards_B=new int[9];
            boolean[] check=new boolean[19];

            for(int i=0; i<9; i++){
                cards_A[i]=Integer.parseInt(st.nextToken());
                check[cards_A[i]]=true;
            }
            int idx=0;
            for(int i=1; i<19; i++){
                if(!check[i]){
                    cards_B[idx]=i;
                    idx++;
                }
            }

            selected=new int[9];
            visited=new boolean[9];

            win=0;
            lose=0;

            permutation(0);

            System.out.println("#"+tc+" "+win+" "+lose);
        }
    }

    static void permutation(int cnt){

        if(cnt==9){
            int sum_A=0;
            int sum_B=0;
            for(int i=0; i<9; i++){
                if(cards_A[i]>selected[i]){
                    sum_A+=cards_A[i]+selected[i];
                }
                else{
                    sum_B+=cards_A[i]+selected[i];
                }
            }

            if(sum_A>sum_B){
                win++;
            }
            else{
                lose++;
            }
            return;
        }

        //B카드 순열 만들기
        for(int i=0; i<9; i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            selected[cnt]=cards_B[i];

            permutation(cnt+1);

            visited[i]=false;
        }
    }
}
