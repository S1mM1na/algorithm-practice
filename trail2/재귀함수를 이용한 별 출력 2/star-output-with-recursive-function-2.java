import java.util.Scanner;
public class Main {
    static int i=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         recursive1(n);
         recursive2(n);
    }
    static void recursive1(int n){
        if(n==0)return;
        for(int i=0; i<n; i++){
            System.out.print("* ");
        }
        System.out.println();
        recursive1(n-1);
    }
    
    static void recursive2(int n){
        if(i>n){
            return;
        }
        for(int j=0; j<i; j++){
            System.out.print("* ");
        }
        System.out.println();
        i++;
        recursive2(n);
    }
}