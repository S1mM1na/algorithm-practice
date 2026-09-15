import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    static int N;
    static char[][] map;
    static boolean[][] visited;

    static int[] dr={-1,-1,-1,0,0,1,1,1};
    static int[] dc={-1,0,1,-1,1,-1,0,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++){
            N=Integer.parseInt(br.readLine());

            map=new char[N][N];
            visited=new boolean[N][N];

            for(int i=0; i<N; i++){
                map[i]=br.readLine().toCharArray();
            }

            int answer=0;
            
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(map[r][c]=='*')
                        continue;
                    if(visited[r][c])
                        continue;
                    if(countMine(r,c)==0){
                        answer++;
                        bfs(r,c);
                    }
                }
            }
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(map[r][c]!='*'&& !visited[r][c]){
                        answer++;
                    }
                }
            }

            System.out.println("#"+tc+" "+answer);


        }

    }

    //지뢰 갯수 확인
    static int countMine(int r,int c){
        int cnt=0;
        for(int d=0; d<8; d++){
            int nr=r+dr[d];
            int nc=c+dc[d];

            if(nr<0||nr>=N||nc<0||nc>=N){
                continue;
            }
            if(map[nr][nc]=='*'){
                cnt++;
            }
        }
        return cnt;
    }

    //0인 칸을 눌렀을때 열리는 영역
    static void bfs(int r, int c){
        Queue<int[]> queue=new ArrayDeque<>();
        queue.offer(new int[]{r,c});
        visited[r][c]=true;
        
        while(!queue.isEmpty()){
            int[] cur= queue.poll();;
            
            int cr=cur[0];
            int cc=cur[1];
            
            for(int d=0; d<8; d++){
                int nr=cr+dr[d];
                int nc=cc+dc[d];
                
                if(nc<0||nc>=N||nr<0||nr>=N){
                    continue;
                }
                if(visited[nr][nc]){
                    continue;
                }
                if(map[nr][nc]=='*'){
                    continue;
                }
                
                visited[nr][nc]=true;
                
                if(countMine(nr,nc)==0){
                    queue.offer(new int[]{nr,nc});
                }
                
            }
        }
    }
}
