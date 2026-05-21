
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		
		for(int t=1; t<=tc; t++) {
			int[] arr= new int[10];
			StringTokenizer st= new StringTokenizer(br.readLine());
			
			for(int i=0; i<10; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			
			int max=arr[0];
			int min=arr[0];
			
			int sum=0;
			
			for(int i=0; i<10; i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
				else if(arr[i]<min) {
					min=arr[i];
				}
				sum+=arr[i];
			}
			sum=sum-min-max;
			double answer=(double) sum/8;
			System.out.println("#"+t+" "+Math.round(answer));
		}
	}
}