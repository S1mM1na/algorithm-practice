
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int N,K;
    static int answer;
    static int[] dr={1,0,-1,0};
    static int[] dc={0,1,0,-1};
    static int [][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            answer=0;
            StringTokenizer st=new StringTokenizer(br.readLine());
            N=Integer.parseInt(st.nextToken());//부지 크기
            K=Integer.parseInt(st.nextToken());//최대 공사 가능 높이

            int max=Integer.MIN_VALUE;
            map=new int[N][N];
            visited=new boolean[N][N];
            for(int i=0; i<N; i++){
                st=new StringTokenizer(br.readLine());
                //가장 높은 부지 구하기
                for(int j=0; j<N; j++){
                    map[i][j]=Integer.parseInt(st.nextToken());
                    if(map[i][j]>max) {
                        max = map[i][j];
                        }
                    }
                }

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){

                    if(map[i][j]==max){
                        visited[i][j]=true;
                        dfs(i,j,1,false);
                        visited[i][j]=false;
                    }

                }
            }
            System.out.println("#"+tc+" "+answer);

        }
    }

    private static void dfs(int r, int c,int length,boolean usedCut ){

        answer=Math.max(answer,length);
        for(int d=0; d<4; d++){
            int nr=r+dr[d];
            int nc=c+dc[d];

            //범위 벗어났을 경우
            if(nc<0||nc>=N||nr<0||nr>=N||visited[nr][nc]){
                continue;
            }

            //이동할 곳의 높이가 더 낮을 경우
            if(map[nr][nc]<map[r][c]){
                visited[nr][nc]=true;
                dfs(nr,nc,length+1,usedCut);
                visited[nr][nc]=false;
            }

            //이동할 곳의 높이가 더 높을 경우
            else if (!usedCut) {
                int newHeight=map[r][c]-1;
                //K이하로 깎을 수 있다면
                if(map[nr][nc]-newHeight<=K){
                    int original=map[nr][nc];
                    map[nr][nc]=newHeight;
                    visited[nr][nc]=true;

                    dfs(nr,nc,length+1,true);
                    visited[nr][nc]=false;

                    map[nr][nc]=original;

                }
            }

            }
        }
}
