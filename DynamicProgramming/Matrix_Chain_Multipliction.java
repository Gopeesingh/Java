package DynamicProgramming;

import java.util.List;

public class Matrix_Chain_Multipliction {

     // RECURSTION :--->

    // private static int rec(int i, int j, List<Integer> arr ){
    //     // base condition 
    // if(i == j) return 0;

    // // work
    // int minimum = 99999999;
    // for(int k = i; k < j; k++){
    //     int cost = rec(i, k, arr) + rec(k+1, j, arr) +
    //             (arr.get(i-1) * arr.get(k) * arr.get(j));
    //             if(cost < minimum)
    //             minimum = cost;
    // }
    // return minimum;
    // }
    // public static void main(String[] args) {
    //     List<Integer> arr = List.of(40, 20, 30, 10, 30);
    //     int n = arr.size();
    //     System.out.println(rec(1, n-1, arr)); // 26000
    // }

    // MEMOIZTION :---> bottom above

    // private static int rec(int i, int j, List<Integer> arr,  int [][] dp ){

    //     if(dp[i][j] != -1)
    //     return dp[i][j];

    //     // base condition 
    // if(i == j) return 0;

    // // work
    // int minimum = 99999999;
    // for(int k = i; k < j; k++){
    //     int cost = rec(i, k, arr, dp) + rec(k+1, j, arr, dp) +
    //             (arr.get(i-1) * arr.get(k) * arr.get(j));
    //             if(cost < minimum)
    //             minimum = cost;
    // }
    // return dp[i][j] = minimum;
    // }
    // public static void main(String[] args) {
    //     List<Integer> arr = List.of(40, 20, 30, 10, 30);
    //     int n = arr.size();
    //     int [][] dp = new int[n][n];
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             dp[i][j] = -1;
    //         }
    //     }
    //     System.out.println(rec(1, n-1, arr,dp)); // 26000
    // }

    // TEBULATION :---> Top Down

    private static int rec(int i, int j, List<Integer> arr,  int [][] dp ){
        
        if(dp[i][j] != -1)
        return dp[i][j];

        // base condition 
    if(i == j) return 0;

    // work
    int minimum = 99999999;
    for(int k = i; k < j; k++){
        int cost = rec(i, k, arr, dp) + rec(k+1, j, arr, dp) +
                (arr.get(i-1) * arr.get(k) * arr.get(j));
                if(cost < minimum)
                minimum = cost;
    }
    return dp[i][j] = minimum;
    }
    public static void main(String[] args) {
        List<Integer> arr = List.of(40, 20, 30, 10, 30);
        int n = arr.size();
        int [][] dp = new int[n][n];

        // base condition
        for(int i=0; i<n; i++){
            dp[i][i] = 0;
        }
        for(int i=n-1; i>=1; i--){
            for(int j=i+1; j<=n-1; j++){
                int minimum = 99999999;
                for(int k = i; k < j; k++){
                    int cost = dp[i][k] + dp[k+1][j] +
                            (arr.get(i-1) * arr.get(k) * arr.get(j));
                            if(cost < minimum)
                            minimum = cost;
                }
                dp[i][j] = minimum;
            }
        }
        System.out.println(dp[1][n-1]); // 26000
    }
}
