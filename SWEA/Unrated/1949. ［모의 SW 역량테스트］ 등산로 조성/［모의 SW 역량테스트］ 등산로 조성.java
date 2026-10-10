
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
    static int[] dr={-1,1,0,0};
    static int[] dc={0,0,-1,1};
    static int [][] map;
    static int N;
    static int K;
    static int maxStart;
    static boolean[][] visited;
    static int maxDistance;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            N=Integer.parseInt(st.nextToken());
            K=Integer.parseInt(st.nextToken());

            map=new int[N][N];
            maxStart=Integer.MIN_VALUE;
            visited=new boolean[N][N];
            maxDistance=0;

            for(int i=0; i<N; i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    map[i][j]=Integer.parseInt(st.nextToken());
                    if(map[i][j]>maxStart){
                        maxStart = map[i][j];
                    }
                }
            }

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(map[i][j]==maxStart){
                        visited[i][j]=true;
                        dfs(i,j,1,false);
                        visited[i][j]=false;
                    }
                }
            }
            System.out.println("#"+tc+" "+maxDistance);
        }
    }

    static void dfs(int r,int c,int sum, boolean useK){
        maxDistance=Math.max(sum,maxDistance);

        for(int d=0; d<4; d++){
            int nr=r+dr[d];
            int nc=c+dc[d];

            if(nr<0||nc<0||nr>=N||nc>=N||visited[nr][nc]) continue;

            //이동할 위치가 더 작은 경우
            if(map[r][c]>map[nr][nc]){
                visited[nr][nc]=true;
                dfs(nr,nc,sum+1,useK);
                visited[nr][nc]=false;
            }

            //더 큰데 깎을 수 있을 경우
            else if(!useK && map[nr][nc]-K <map[r][c] ){
                int original=map[nr][nc];
                map[nr][nc]=map[r][c]-1; //최대한 덜 깎아야 다음 칸을 갈때 유리하기 때문에 현재칸보다 한칸만 더 작게 깎음

                visited[nr][nc]=true;
                dfs(nr,nc,sum+1,true);
                visited[nr][nc]=false;

                map[nr][nc]=original;
            }
        }
    }
}
