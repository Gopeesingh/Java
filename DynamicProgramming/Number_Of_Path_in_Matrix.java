package DynamicProgramming;

public class Number_Of_Path_in_Matrix {

    // RECURSTION

    // public static int rec(int i, int j){
    //     if(i == 0 && j == 0) return 1;

    //     if(i < 0 || j < 0) return 0;

    //     return rec(i-1, j) + rec(i, j-1);
    // }
    // public static void main(String[] args) {
    //     int M = 2;
    //     int N = 3;
    //     System.out.println(rec(M-1,N-1)); // 3
    // }

    // MEMOISTION

    // public static int rec(int i, int j, int [][]dp){
    //     // base case
    //     if(i == 0 && j == 0) return 1;
    //     if(i < 0 || j < 0) return 0;

    //     if(dp[i][j] != -1) return dp[i][j];

    //     return dp[i][j] = rec(i-1, j, dp) + rec(i, j-1, dp);
    // }
    // public static void main(String[] args) {
    //     int M = 2;
    //     int N = 3;
    //     int [][]dp = new int [M][N];
    //     for(int i = 0; i<M; i++){
    //         for(int j = 0; j<N; j++){
    //             dp[i][j] = -1;
    //         }
    //     }
    //     System.out.println(rec(M-1,N-1, dp)); // 3
    // }

    // TEBULATION :--


    public static void main(String[] args) {
        int M = 2;
        int N = 3;
        int [][]dp = new int [M][N];
        dp[0][0] = 1;
        for(int i=0; i<M; i++){
            dp[i][0] = 1;
        }
        for(int j=0; j<N; j++){
            dp[0][j] = 1;
        }
        for(int i=1; i<M; i++){
            for(int j=1; j<N; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        System.out.println(dp[M-1][N-1]); // 3
    }
}
