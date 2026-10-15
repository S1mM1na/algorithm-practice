
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    static int maxCore;
    static int minLine;
    static int N;
    static int cnt;
    static int[][] map;
    static int[][] core;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++){
            N=Integer.parseInt(br.readLine());
            map=new int[N][N];

            core=new int[13][2];
            cnt=0;
            for(int i=0; i<N; i++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    map[i][j]=Integer.parseInt(st.nextToken());
                    if(map[i][j]==1){
                        if(i==0||j==0||i==N-1||j==N-1){
                            continue;
                        }
                        core[cnt][0]=i;
                        core[cnt][1]=j;
                        cnt++;
                    }
                }
            }
            maxCore=Integer.MIN_VALUE;
            minLine=Integer.MAX_VALUE;

            connect(0,0,0);
			System.out.println("#"+tc+" "+minLine);

        }
    }
    static void connect(int idx,int coreCnt, int distance){
        //종료조건
        if(cnt==idx){
            if(maxCore<coreCnt){
                maxCore=coreCnt;
                minLine=distance;
            }
            if(maxCore==coreCnt){
                minLine=Math.min(minLine,distance);
            }
            return;
        }
        int x=core[idx][0];
        int y=core[idx][1];

        for(int d=0; d<4; d++){
            int nx=x+dx[d];
            int ny=y+dy[d];
            int len=0;

            while(nx>=0&&ny>=0&&nx<N&&ny<N){
                if(map[nx][ny]!=0){
                    break;
                }
                nx+=dx[d];
                ny+=dy[d];
                len++;
            }

            if(nx<0||ny<0||nx>N-1||ny>N-1){
                nx=x+dx[d];
                ny=y+dy[d];

                for(int i=0; i<len; i++){
                    map[nx][ny]=2;
                    nx+=dx[d];
                    ny+=dy[d];

                }
                connect(idx+1,coreCnt+1,len+distance);

                nx=x+dx[d];
                ny=y+dy[d];

                for(int i=0; i<len; i++){
                    map[nx][ny]=0;
                    nx+=dx[d];
                    ny+=dy[d];

                }
            }

        }
        connect(idx+1,coreCnt,distance);
    }
}
