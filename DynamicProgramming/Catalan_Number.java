package DynamicProgramming;

public class Catalan_Number {
    // BY RECURSIVE METHOD

    // public static int catalan(int n){
    //     if(n == 0 || n == 1) return 1;

    //     int ans = 0; 
    //     for(int i = 0; i <= n-1; i++){
    //         ans += catalan(i) * catalan(n - i - 1);
    //     }
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     int n = 4;
    //     System.out.println(catalan(n)); // 14
    // }

    // BY MEMOIZATION METHOD

    public static int catalan(int n){
        if(n == 0 || n == 1) return 1;

        int ans = 0; 
        for(int i = 0; i <= n-1; i++){
            ans += catalan(i) * catalan(n - i - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        int []dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int j = 2; j<=n-1; j++){
            // build up ans
            int ans  = 0;
        for(int i = 0; i <= j-1; i++){
            // this is formula of C0 * Cn-1.....
            dp[j] += dp[i] * dp[j - i - 1];
        }
    }
        System.out.println(dp[n]); // 14
    }
}
