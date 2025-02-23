package DynamicProgramming;
import java.util.*;
public class CoinsChange {
    private static int rec(List<Integer> coins, int sum, int idx, int[][] dp){
if(dp[idx][sum] != -1)
return dp[idx][sum];

        if(idx == 0){
            if(sum % coins.get(idx) == 0)
            return 1;
            else
            return 0;
        }

        int pick = 0;
        if(sum >= coins.get(idx))
           pick = rec(coins, sum - coins.get(idx), idx, dp);
        int notPick = rec(coins, sum, idx - 1, dp);
            
        return pick + notPick;
    }
    public static void main(String[] args) {
        List<Integer> coins = List.of(1,2,3);
        int n = coins.size();
        int totalSum = 4;
        int[][] dp = new int[n + 1][totalSum + 1];
        for(int i=0; i<=totalSum; i++){
            if(i % coins.get(0) == 0)
            dp[0][i] = 1;
            else
                dp[0][i] = 0;
        }

        for(int idx = 1; idx < n; idx++){
            for(int sum = 0; sum <= totalSum; sum++){
                
        int pick = 0;
        if(sum >= coins.get(idx))
           pick = dp[idx][sum - coins.get(idx)];
        int notPick = dp[idx - 1][sum];

        dp[idx][sum] =  pick + notPick;
            }
        }
        //System.out.println(rec(coins, sum, n-1, dp)); // 4
        System.out.println(dp[n - 1][totalSum]);
    }
}
