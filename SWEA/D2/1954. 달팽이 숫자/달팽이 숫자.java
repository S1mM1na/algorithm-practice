
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());// 테스트케이스 개수
		StringTokenizer st;
		
		for(int t=1; t<=tc; t++) {
			st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int[][] arr=new int[N][N];
			
			int[] dx= {0,1,0,-1};
			int[] dy= {1,0,-1,0};
			
			int dir=0;
			int x=0;
			int y=0;
			
			for(int num=1; num<=N*N; num++) {
				arr[x][y]=num;
				
				int nx=x+dx[dir];
				int ny=y+dy[dir];
				
				if(nx<0||ny<0||nx>=N||ny>=N||arr[nx][ny]!=0) {
					dir=(dir+1)%4;
					
					nx=x+dx[dir];
					ny=y+dy[dir];
				}
				
				x=nx;
				y=ny;
			}
			System.out.println("#"+t);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}
}