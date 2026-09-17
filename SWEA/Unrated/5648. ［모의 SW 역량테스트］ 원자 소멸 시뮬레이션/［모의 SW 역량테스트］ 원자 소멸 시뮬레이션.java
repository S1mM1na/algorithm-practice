import java.io.*;
import java.util.*;

public class Solution{

    static int N;
    static int[][] atoms;
    static int[] dx={0,0,-1,1};
    static int[] dy={1,-1,0,0};
    static int[][] map=new int[4001][4001];

    public static void main(String[] args)throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1;tc<=T;tc++){
            N=Integer.parseInt(br.readLine());
            atoms=new int[N][5];

            for(int i=0;i<N;i++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                atoms[i][0]=Integer.parseInt(st.nextToken())*2;
                atoms[i][1]=Integer.parseInt(st.nextToken())*2;
                atoms[i][2]=Integer.parseInt(st.nextToken());
                atoms[i][3]=Integer.parseInt(st.nextToken());
                atoms[i][4]=1;
            }

            int answer=0;
            int alive=N;

            while(alive>0){
                //원자이동
                for(int i=0;i<N;i++){
                    if(atoms[i][4]==0){
                        continue;
                    }
                    int dir=atoms[i][2];
                    atoms[i][0]+=dx[dir];
                    atoms[i][1]+=dy[dir];
                    int x=atoms[i][0];
                    int y=atoms[i][1];

                    //범위밖으로나간원자
                    if(x<-2000||x>2000||y<-2000||y>2000){
                        atoms[i][4]=0;
                        alive--;
                        continue;
                    }

                    map[x+2000][y+2000]++;
                }

                //충돌확인
                for(int i=0;i<N;i++){
                    if(atoms[i][4]==0){
                        continue;
                    }
                    int x=atoms[i][0];
                    int y=atoms[i][1];

                    if(map[x+2000][y+2000]>=2){
                        answer+=atoms[i][3];
                        atoms[i][4]=0;
                        alive--;
                    }
                }

                //map초기화
                for(int i=0;i<N;i++){

                    int x=atoms[i][0];
                    int y=atoms[i][1];
                    if(x<-2000||x>2000||y<-2000||y>2000){
                        continue;
                    }

                    map[x+2000][y+2000]=0;
                }
            }

            System.out.println("#"+tc+" "+answer);
        }
    }
}