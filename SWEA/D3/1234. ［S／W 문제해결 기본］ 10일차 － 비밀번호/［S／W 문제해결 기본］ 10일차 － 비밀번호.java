
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int t=1; t<=10; t++){

            StringTokenizer st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            String line=st.nextToken();

            ArrayList<Integer> arr=new ArrayList<>();

            for(int i=0; i<N; i++){
                arr.add(line.charAt(i)-'0');
            }

            for(int i=0; i<arr.size()-1; i++){ //N으로 두면 계속 사이즈가 줄어서 에러뜸
                if(arr.get(i).equals(arr.get(i+1))){
                    arr.remove(i);
                    arr.remove(i);//뒤에 있던 게 땡겨짐
                    i=-1;// 마지막에 i++ 실행돼서 i--부터 시작해야함
                }
            }

            StringBuilder sb=new StringBuilder();
            for(int num :arr){
                sb.append(num);
            }

            String result=sb.toString();

            System.out.println("#"+t+" "+result);
        }
    }
}
