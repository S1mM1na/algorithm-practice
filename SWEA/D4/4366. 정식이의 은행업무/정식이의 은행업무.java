
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++){
            String str1=br.readLine();
            String str2=br.readLine();

            char[] num1=str1.toCharArray();
            char[] num2=str2.toCharArray();

            //2진수
            search:
            for(int i=0; i<num1.length; i++){
                char origin=num1[i];//원래 값 저장
                //만약 0이면 1, 1이면 0으로 바꿔줌
                if(num1[i]=='0'){
                    num1[i]='1';
                }
                else{
                    num1[i]='0';
                }

                //2진수를 10진수로 바꾼 값
                int value1=Integer.parseInt(new String (num1),2);

                //3진수
                for(int j=0; j<num2.length; j++){
                    char origin2=num2[j];

                    for(char c='0'; c<='2'; c++){
                        if(c==origin2){
                            continue;
                        }
                        num2[j]=c;

                        //3진수를 10진수로 바꾼 값
                        int value2=Integer.parseInt(new String (num2),3);

                        if(value1==value2){
                            System.out.println("#"+tc+" "+value1);
                            break search;
                        }
                    }
                    num2[j]=origin2;
                }

                num1[i]=origin;
            }

        }
    }
}
