import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			String num=String.valueOf(i);
			int clapCount=0;
			
			for(int j=0; j<num.length(); j++) { //한글자씩 분리해서 3,6,9가 들어가 있는지 확
				char c=num.charAt(j);
				
				if(c=='3'||c=='6'||c=='9') {
					clapCount++;
				}
			}
			
			if(clapCount>0) {
				for(int j=0; j<clapCount; j++) {
					System.out.print("-");
				}
			}
			
			else {
				System.out.print(i);
			}
			System.out.print(" ");
		}
		
	}
}
