import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(recursive(0,arr,n));
    }
    static int recursive(int i,int[] arr,int n){
        
        if(i>=n){
            return Integer.MIN_VALUE;
        }
        int max=recursive(i+1,arr,n);
        return Math.max(arr[i],max);
    }
}