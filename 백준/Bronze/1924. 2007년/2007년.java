import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
       
        int totalDays = 0;
        for (int i = 1; i < x; i++) {
            totalDays += days[i];
        }
        totalDays += y;

        int dayOfWeek = (totalDays - 1) % 7;
        
        System.out.println(week[dayOfWeek]);
        sc.close();
    }
}