import java.util.Scanner;
public class Main {
    static int i=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        recursive1(n);
        System.out.println();
        recursive2(n);

    }
    static void recursive1(int n){
        
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        i++;
        recursive1(n);

    }
    static void recursive2(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        recursive2(n-1);
    }
}