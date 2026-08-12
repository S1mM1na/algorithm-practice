
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import static java.lang.Integer.MAX_VALUE;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int t=1; t<=T; t++){
            int N=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            ArrayList<Integer> arr=new ArrayList<>();
            int sum=0;
            for(int i=0; i<N; i++){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arr,Collections.reverseOrder());

            int min=MAX_VALUE;
            for(int i=0; i<N; i++){
                sum+=arr.get(i);
            }
            for(int i=0; i<N/3 *3; i+=3){
                for(int j=0; j<3; j++){
                    if(min>arr.get(j+i))
                        min=arr.get(j+i);
                }
                sum-=min;
            }
            System.out.println("#"+t+" "+sum);
        }
    }
}
