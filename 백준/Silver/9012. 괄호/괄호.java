
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T=Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            String str=br.readLine();
            Stack<Character> stack=new Stack<Character>();
            boolean isValid=true;
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);

                if(c=='(') stack.push(c); // "("가 나왔을때 push
                else{ // ")"가 나왔을때 pop
                    if (stack.isEmpty()) { //만약 비어있을때 )가 나오면 isValid가 아님
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                isValid = false;
            }
            
            if (isValid) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }
}
