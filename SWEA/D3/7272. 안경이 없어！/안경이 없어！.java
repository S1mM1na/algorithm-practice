
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        int tc=Integer.parseInt(br.readLine());

        for(int t=1; t<=tc; t++){
            StringTokenizer st=new StringTokenizer(br.readLine());

            String A=st.nextToken();
            String B=st.nextToken();

            boolean same=true;

            if(A.length()!=B.length()){// 만약 길이가 다르다면 같지 않음
                same=false;
            }
            else{
                for(int i=0; i<A.length(); i++){
                    if(!(hole(A.charAt(i))==hole((B.charAt(i))))){ //hole 수가 다르다면 같지 않음
                        same=false;
                        break;//하나라도 다르면 다른 문자열이기 때문에 뒤에 더 확인하지 않고 break;
                    }
                }
            }

            if(same){//만약
                System.out.println("#"+t+" SAME");
            }else{
                System.out.println("#"+t+" DIFF");
            }

        }

    }

    public static int hole(char c){
        if(c=='B')
            return 2;
        if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
            return 1;

        return 0;
    }
}
