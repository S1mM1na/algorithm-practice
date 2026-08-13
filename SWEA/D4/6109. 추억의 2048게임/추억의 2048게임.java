
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            switch (S) {
                case "left":
                    pushLeft(arr, N);
                    mergeLeft(arr, N);
                    pushLeft(arr, N);
                    break;

                case "right":
                    pushRight(arr, N);
                    mergeRight(arr, N);
                    pushRight(arr, N);
                    break;

                case "up":
                    pushUp(arr, N);
                    mergeUp(arr, N);
                    pushUp(arr, N);
                    break;

                case "down":
                    pushDown(arr, N);
                    mergeDown(arr, N);
                    pushDown(arr, N);
                    break;
            }

            sb.append("#").append(t).append("\n");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(arr[i][j]);
                    if (j != N - 1) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }

        }

        System.out.print(sb);

}
    //위로 밀기
    public static void pushUp(int [][] arr,int N){
        for(int j=0; j<N; j++){
            for(int i=0; i<N; i++){
                if(arr[i][j]==0){
                    for(int k=i+1; k<N; k++){
                        if(arr[k][j]!=0){
                            arr[i][j]=arr[k][j];
                            arr[k][j]=0;
                            break;
                        }
                    }
                }
            }
        }
    }
    //위로 합치기
    public static void mergeUp(int[][]arr,int N){
        for(int j=0; j<N; j++){
            for(int i=0; i<N-1; i++){
                if(arr[i][j]!=0&&arr[i][j]==arr[i+1][j]){
                    arr[i][j]*=2;
                    arr[i+1][j]=0;
                    i++;
                }
            }
        }
    }
    //아래로 밀기
    public static void pushDown(int[][]arr,int N){
        for(int j=0; j<N; j++){
            for(int i=N-1; i>=0; i--){
                if(arr[i][j]==0){
                    for(int k=i-1; k>=0; k--){
                        if(arr[k][j]!=0){
                            arr[i][j]=arr[k][j];
                            arr[k][j]=0;
                            break;
                        }
                    }
                }
            }
        }
    }
    //아래로 합치기
    public static void mergeDown(int[][]arr,int N){
        for(int j=0; j<N; j++){
            for(int i=N-1; i>0; i--){
                if(arr[i][j]!=0&&arr[i][j]==arr[i-1][j]){
                    arr[i][j]*=2;
                    arr[i-1][j]=0;
                    i--;
                }
            }
        }
    }
    //왼쪽으로 밀기
    public static void pushLeft(int[][]arr,int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j]==0){
                    for(int k=j+1; k<N; k++){
                        if(arr[i][k]!=0){
                            arr[i][j]=arr[i][k];
                            arr[i][k]=0;
                            break;
                        }
                    }
                }
            }
        }
    }
    //왼쪽으로 합치기
    public static void mergeLeft(int[][]arr,int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N-1; j++){
                if(arr[i][j]!=0&&arr[i][j]==arr[i][j+1]){
                    arr[i][j]*=2;
                    arr[i][j+1]=0;
                    j++;
                }
            }
        }
    }
    //오른쪽으로 밀기
    public static void pushRight(int[][]arr,int N){
        for(int i=0; i<N; i++){
            for(int j=N-1; j>=0; j--){
                if(arr[i][j]==0){
                    for(int k=j-1; k>=0; k--){
                        if(arr[i][k]!=0){
                            arr[i][j]=arr[i][k];
                            arr[i][k]=0;
                            break;
                        }
                    }
                }
            }
        }
    }
    //오른쪽으로 합치기
    public static void mergeRight(int[][]arr,int N){
        for(int i=0; i<N; i++){
            for(int j=N-1; j>0; j--){
                if(arr[i][j]!=0&&arr[i][j]==arr[i][j-1]){
                    arr[i][j]*=2;
                    arr[i][j-1]=0;
                    j--;
                }
            }
        }
    }
}
