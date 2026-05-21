
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
			int M=Integer.parseInt(st.nextToken());
			int max=0;
			
			int[][] arr=new int[N][N];
			for(int i=0; i<N; i++) { //N*N 배열에 값 초기
				st=new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0; i<=N-M; i++) { //파리채 시작 위
				for(int j=0; j<=N-M; j++ ) {
					int sum=0;
					
					for(int x=i; x<i+M; x++) {
						for(int y=j; y<j+M;y++) {
							sum+=arr[x][y];
						}
					}
					
					max=Math.max(max, sum);
				}
			}
			System.out.println("#"+t+" "+max);
		}
		
	}
}