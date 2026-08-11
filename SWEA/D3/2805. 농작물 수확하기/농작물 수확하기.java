
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int t=1; t<=T; t++){
            int N=Integer.parseInt(br.readLine());
            int sum=0;

            int[][] arr=new int[N][N];
            for(int i=0; i<N; i++){
                String line= br.readLine();
                for(int j=0; j<N; j++){
                    arr[i][j]=line.charAt(j)-'0';
                }
            }

            //위쪽 구간
            for(int i=0; i<N/2; i++){
                for(int j=N/2-i; j<=N/2+i; j++){
                    sum+=arr[i][j];
                }
            }

            //가운데 구간
            for(int i=0; i<N; i++){
                sum+=arr[N/2][i];
            }

            //아래쪽 구간
            for(int i=N/2-1; i>=0; i--){
                for(int j=N/2-i; j<=N/2+i; j++){
                    sum+=arr[N-1-i][j];
                }
            }

            System.out.println("#"+t+" "+sum);
        }

    }
}
