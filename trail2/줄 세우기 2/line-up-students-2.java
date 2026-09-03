import java.util.Scanner;
import java.util.Arrays;
public class Main {

    static class Student{
        int h;
        int w;
        int num;

        Student(int h,int w,int num){
            this.h=h;
            this.w=w;
            this.num=num;
        }
    }
    public static final int MAX_N = 1000;

    public static int[] h = new int[MAX_N];
    public static int[] w = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students=new Student[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
            
            students[i]=new Student(h[i],w[i],i+1);
        }

        Arrays.sort(students,(a,b)->{
            if(a.h!=b.h){
                return a.h-b.h;
            }
            return b.w-a.w;
        }
        );

        for(Student student:students){
            System.out.println(student.h+" "+student.w+" "+student.num);
        }

    }
}

