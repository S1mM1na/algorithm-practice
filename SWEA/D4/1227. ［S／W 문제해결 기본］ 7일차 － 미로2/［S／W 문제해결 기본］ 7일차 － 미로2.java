import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    static boolean[][] visited;
    static int[] dr={-1,1,0,0};
    static int[] dc={0,0,-1,1};
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for(int tc=1; tc<=10; tc++){
            int T=Integer.parseInt(br.readLine());
            map=new int[100][100];
            for(int i=0; i<100; i++){
                String line=br.readLine();
                for(int j=0; j<100; j++){
                    map[i][j] = line.charAt(j)-'0';
                }
            }
            visited=new boolean[100][100];
            int answer=bfs(1,1);
            System.out.println("#"+T+" "+answer);

        }
    }
    static int bfs(int r,int c){
        Queue<int[]> queue=new ArrayDeque<>();
        queue.offer(new int[]{r,c});
        visited[r][c]=true;

        while(!queue.isEmpty()){
            int[] cur=queue.poll();
            for(int d=0; d<4; d++){
                int nr=cur[0]+dr[d];
                int nc=cur[1]+dc[d];

                if(nr<0||nr>=100||nc<0||nc>=100){
                    continue;
                }
                if(visited[nr][nc]){
                    continue;
                }

                if (map[nr][nc]==3){
                    return 1;
                }

                if(map[nr][nc]==0){
                    visited[nr][nc]=true;
                    queue.offer(new int[]{nr,nc});
                }
            }
        }
        return 0;
    }
}
