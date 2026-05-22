
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Solution{
	
	static int N,K;
	static int[] arr;
	static int answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			answer=0;
			N=Integer.parseInt(st.nextToken());
			K=Integer.parseInt(st.nextToken());
			arr=new int [N];
            st=new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			
			bfs(0,0);
			
			System.out.println("#"+tc+" "+answer);
		}
		
		
	}
	
	public static void bfs(int idx,int sum) {
		if(idx==N) { //모든 배열을 다 확인했고
			if(sum==K) { //합이 K가 되었을 때 
				answer++;
			}
			return;
		}
		//값을 더할 때
		bfs(idx+1, sum+arr[idx]);
		//값을 더하지 않을 때
		bfs(idx+1, sum);
	}
}