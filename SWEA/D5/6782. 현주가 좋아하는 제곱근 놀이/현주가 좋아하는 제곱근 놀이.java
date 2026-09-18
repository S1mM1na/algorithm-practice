import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            long N=Long.parseLong(br.readLine());
            long cnt=0;
            
            while(N!=2){
                long sqrt=(long)Math.sqrt(N);
                if(sqrt*sqrt==N){
                    N=sqrt;
                    cnt++;
                }
                else{
                    long next=(sqrt+1)*(sqrt+1);
                    cnt+=next-N;
                    N=next;
                }
            }
            System.out.println("#"+tc+" "+cnt);
        }

    }
}
