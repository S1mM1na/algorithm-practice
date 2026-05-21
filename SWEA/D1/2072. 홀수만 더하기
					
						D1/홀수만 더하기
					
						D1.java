import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int sum=0;
            for(int i=0; i<10; i++){
                int num=Integer.parseInt(st.nextToken());
                if(num%2==1){
                    sum+=num;
                }
            }
            System.out.println("#"+tc+" "+sum);

        }
    }
}
