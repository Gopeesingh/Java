package DynamicProgramming;

public class Fibonacii {
    static int calls = 0;
    private static int fibbo(int n, int[] dp){
        if(n == 1 || n == 0)
        return 1;

        if(dp[n] != -1){
            return dp[n];
        }
        calls++;
        int result = fibbo(n - 1, dp) + fibbo(n - 2, dp);
        dp[n] = result;
        return dp[n];

        // or line 12,13,14  we can wright return dp[n] = fibbo(n - 1, dp) + fibbo(n - 2, dp);
    }

    // 1 1 2 3 5 8 13 21........
    public static void main(String[] args) {
        int n = 15;
        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        System.out.println(fibbo(n, dp));
        System.out.println("Cslls : "+ calls);
    }
}
// TC - O(N)
// SC - O(N + N) = O(N)
