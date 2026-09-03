import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String[]> rainnyDay=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            if(weather.equals("Rain")){
                String [] str={date,day,weather};
                rainnyDay.add(str);
            }

        }

        String[] answer=rainnyDay.get(0);
            for(int j=0; j<rainnyDay.size(); j++)
            {
                if(rainnyDay.get(j)[0].compareTo(answer[0])<0){
                    answer=rainnyDay.get(j);
                }
            }   
               System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);  
    }
}