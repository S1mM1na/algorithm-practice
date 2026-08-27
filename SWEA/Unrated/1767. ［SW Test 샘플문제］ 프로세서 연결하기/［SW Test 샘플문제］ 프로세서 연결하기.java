import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    static int minLine;
    static int maxCore;
    static int[] dr={1,0,-1,0};
    static int[] dc={0,1,0,-1};
    static int[][] map;
    static int T,N;
    static ArrayList<int[]> core=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        T=Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++){
            N=Integer.parseInt(br.readLine());
            StringTokenizer st;
            minLine=Integer.MAX_VALUE;
            maxCore=Integer.MIN_VALUE;
            map=new int[N][N];
            core=new ArrayList<>();

            for(int i=0; i<N; i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    map[i][j]=Integer.parseInt(st.nextToken());
                    if(map[i][j]==1){
                        if(i==0||i==N-1||j==0||j==N-1){//가장 자리인 코어는 제외하고 넣음
                            continue;
                        }
                       core.add(new int[]{i,j});
                    }
                }
            }
            dfs(0,0,0);
            System.out.println("#"+tc+" "+minLine);
        }
    }

    //dfs에서는 코어 하나의 상하좌우 노드 연결을 책임짐
    private static void dfs(int index,int coreCount, int wireLength){

        //모든 코어를 다 확인했다면
        if(index==core.size()){
            //연결한 코어가 더 많다면 갱신
            if(coreCount>maxCore){
                maxCore=coreCount;
                minLine=wireLength;
            }
            //연결한 코어 수가 같다면?
            else if (coreCount==maxCore) {
                minLine=Math.min(minLine,wireLength);

            }
            return;
        }
        int r=core.get(index)[0];
        int c=core.get(index)[1];

        for(int d=0; d<4; d++){
            int nr=r+dr[d];
            int nc=c+dc[d];
            int length=0;

            while(nr>=0&&nr<N&&nc>=0&&nc<N){
                if(map[nr][nc]!=0){
                    break;
                }
                nr+=dr[d];
                nc+=dc[d];
                length++;
            }

            if(nr<0||nr>=N||nc<0||nc>=N){
                nr=r+dr[d];
                nc=c+dc[d];

                for(int i=0; i<length; i++){
                    map[nr][nc]=2;
                    nc+=dc[d];
                    nr+=dr[d];
                }

                dfs(index+1,coreCount+1,wireLength+length);

                nr=r+dr[d];
                nc=c+dc[d];

                for(int i=0; i<length; i++){
                    map[nr][nc]=0;
                    nr+=dr[d];
                    nc+=dc[d];
                }
            }
        }
        dfs(index+1,coreCount,wireLength);
    }

}
