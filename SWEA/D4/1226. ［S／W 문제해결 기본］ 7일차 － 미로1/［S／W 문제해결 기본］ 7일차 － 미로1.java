import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] dr={-1,1,0,0};
    static int[] dc={0,0,-1,1};
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for(int tc=1; tc<=10; tc++){
            int T=Integer.parseInt(br.readLine());
            int[][] arr=new int[16][16];
            visited = new boolean[16][16];

            int startI=0;
            int stastJ=0;
            
            for(int i=0; i<16; i++){
                String str=br.readLine();
                for(int j=0; j<16; j++){
                    arr[i][j]=str.charAt(j)-'0';
                    if(arr[i][j]==2){
                        startI=i;
                        stastJ=j;

                    }
                }

            }
            visited[startI][stastJ]=true;
            int result=dfs(startI,stastJ,arr);

            System.out.println("#"+T+" "+result);
        }



    }
    static int dfs(int r, int c,int[][] arr){
        for(int d=0; d<4; d++){
            int nr=r+dr[d];
            int nc=c+dc[d];
            if(nr<0||nr>=16||nc<0||nc>=16||arr[nr][nc]==1||visited[nr][nc]){
                continue;
            }
            if(arr[nr][nc]==3){
                return 1;
            }
            visited[nr][nc]=true;
            int result= dfs(nr,nc,arr);
            if(result==1){
                return 1;
            }

        }
        return 0;


    }
}
