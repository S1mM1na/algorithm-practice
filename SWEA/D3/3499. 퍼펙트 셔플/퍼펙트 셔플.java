import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++){
            int N=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());

            String[] cards=new String[N];
            for(int i=0; i<N; i++){
                cards[i]=st.nextToken();
            }
            int mid=(N+1)/2;

            StringBuilder sb=new StringBuilder();
            sb.append("#").append(tc);
            for(int i=0; i<mid; i++){
                sb.append(" ").append(cards[i]);

                if(i+mid<N){
                    sb.append(" ").append(cards[i+mid]);
                }
            }
            System.out.println(sb);
        }


    }
}
