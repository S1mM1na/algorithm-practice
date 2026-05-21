
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int tc=Integer.parseInt(br.readLine());
		for(int t=1; t<=tc; t++) {
			int N=Integer.parseInt(br.readLine());
			int[] arr=new int[N];
			int[] count=new int[101];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int i=0; i<1000; i++) {
				int score=Integer.parseInt(st.nextToken());
				count[score]+=1;
			}
			int maxCount=0;
			int answer=0;
			for(int i=1; i<=100; i++) {
				if(count[i]>=maxCount) {
					maxCount=count[i];
					answer=i;
				}
			}
			System.out.println("#"+N+ " "+answer);
			
		}
		
	}
}
