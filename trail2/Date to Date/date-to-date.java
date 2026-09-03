import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
       
        int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum=0;
        if (m1 == m2) {
            sum = d2 - d1 + 1;
        } else {
            sum += days[m1 - 1] - d1 + 1;
            while (++m1 < m2) {
                sum += days[m1 - 1];
            }
            sum += d2;
        }

        System.out.println(sum);
    }
}