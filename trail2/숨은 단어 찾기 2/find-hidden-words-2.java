import java.util.Scanner;
public class Main {
    static int[] dr={0,0,-1,1,-1,1,-1,1};
    static int[] dc={-1,1,0,0,-1,1,1,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer=0;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i].charAt(j)!='L'){
                    continue;
                }

                for(int d=0; d<8; d++){
                    int r1=i+dr[d];
                    int c1=j+dc[d];

                    int r2=i+2*dr[d];
                    int c2=j+2*dc[d];

                    if (r1 < 0 || r1 >= n || c1 < 0 || c1 >= m) {
                        continue;
                    }

                    if (r2 < 0 || r2 >= n || c2 < 0 || c2 >= m) {
                        continue;
                    }

                    if(arr[r1].charAt(c1)=='E'&&arr[r2].charAt(c2)=='E'){
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}