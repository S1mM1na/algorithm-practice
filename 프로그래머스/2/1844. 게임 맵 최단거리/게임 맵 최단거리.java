import java.util.*;
class Solution {
    int[] dx={-1,1,0,0};
    int[] dy={0,0,-1,1};
    public int solution(int[][] maps) {
        int n=maps.length;
        int m=maps[0].length;
        
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{0,0});
        
        while(!queue.isEmpty()){
            int[] now=queue.poll();//now에 현재 queue의 위치를 넣음
            int x=now[0]; //x는 현재 위치의 x좌표
            int y=now[1]; //y는 현재 위치의 y좌표
            
            for(int i=0; i<4; i++){
                int nx=x+dx[i]; //nx,ny는 다음으로 이동할 좌표
                int ny=y+dy[i];
                
                if(nx<0||ny<0||nx>=n||ny>=m){//맵을 넘어가는 경우
                    continue;
                }
                if(maps[nx][ny]==0){ // 맵의 벽
                    continue;
                }
                if(maps[nx][ny]>1){ //이미 방문한 경로
                    continue;
                }
                
                maps[nx][ny]=maps[x][y]+1;
                queue.offer(new int[]{nx,ny});
            }
        }
        if(maps[n-1][m-1]==1){
            return -1;
        }
        return maps[n-1][m-1]; //상대진영칸에 계산된 값이 정답
        
    }
}