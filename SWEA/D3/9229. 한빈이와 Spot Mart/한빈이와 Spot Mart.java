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
            StringTokenizer st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());
            ArrayList<Integer> arr=new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            
            for(int i=0; i<N; i++){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int max=-1;
            for(int i=0; i<N-1; i++){
                for(int j=i+1;j<N; j++){
                    if(arr.get(i)+ arr.get(j)>max&&arr.get(i)+ arr.get(j)<=M){
                        max=arr.get(i)+ arr.get(j);
                    }
                }
            }

            System.out.println("#"+tc+" "+max);
            }

        }
    }

