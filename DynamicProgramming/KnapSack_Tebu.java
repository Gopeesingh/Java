// package DynamicProgramming;

// import java.util.List;

// public class KnapSack_Tebu {
//         private static int rec(int idx, int W, List<Integer> profit, List<Integer> weights, int[][] dp){
//     if(dp[idx][W] != -1)
//     return dp[idx][W];
    
//         if(idx == 0){
//             if(weights.get(0) <= W)
//             return profit.get(0);
//             else
//             return 0;
//         }
//         int pick = 0;
//         if(W >= weights.get(idx))
//         pick = profit.get(idx) + rec( idx-1, W - weights.get(idx), profit, weights, dp);
//         int notPick = rec(idx - 1, W, profit, weights, dp);

//         return dp[idx][W] =  Math.max(pick, notPick);
//     }
//     public static void main(String[] args) {
//         List<Integer> profit = List.of(1, 2, 3);
//         List<Integer> weights = List.of(4, 5, 1);

//         int wt = 4;
//         int n = profit.size();
//         int[][] dp = new int[n + 1][wt + 1];

//         for(int i=0; i <= wt; i++){
//                 if(weights.get(0) <= i)
//                 dp[0][i] =  profit.get(0);
//                 else
//                 dp[0][i] = 0;
//             }
    
//     for(int idx = 1; idx<n; idx++){
//     for(int w = 0; w <= wt; w++){
//         int pick = 0;
//         if(w >= weights.get(idx))
//         pick = profit.get(idx) + dp[ idx-1][ w - weights.get(idx)];
//         int notPick = dp[idx - 1][w];

//         dp[idx][w] =  Math.max(pick, notPick);
//     }
//     }

//         System.out.println(dp[n - 1][wt]);
//     }
// }


// SPACE OPTIMIZATION :- 

package DynamicProgramming;

import java.util.List;

public class KnapSack_Tebu {
        private static int rec(int idx, int W, List<Integer> profit, List<Integer> weights, int[][] dp){
    if(dp[idx][W] != -1)
    return dp[idx][W];
    
        if(idx == 0){
            if(weights.get(0) <= W)
            return profit.get(0);
            else
            return 0;
        }
        int pick = 0;
        if(W >= weights.get(idx))
        pick = profit.get(idx) + rec( idx-1, W - weights.get(idx), profit, weights, dp);
        int notPick = rec(idx - 1, W, profit, weights, dp);

        return dp[idx][W] =  Math.max(pick, notPick);
    }
    public static void main(String[] args) {
        List<Integer> profit = List.of(1, 2, 3);
        List<Integer> weights = List.of(4, 5, 1);

        int wt = 4;
        int n = profit.size();
        int[][] dp = new int[n + 1][wt + 1];

        int[] prev = new int[wt + 1];
        int[] curr = new int[wt + 1];
        for(int i=0; i <= wt; i++){
            curr[i] = 0;
                if(weights.get(0) <= i)
                prev[i] =  profit.get(0);
                else
                prev[i] = 0;
            }
    
    for(int idx = 1; idx<n; idx++){
    for(int w = 0; w <= wt; w++){
        int pick = 0;
        if(w >= weights.get(idx))
        pick = profit.get(idx) + prev[ w - weights.get(idx)];
        int notPick = prev[w];

        curr[w] =  Math.max(pick, notPick);
    }
    System.arraycopy(curr, 0, prev, 0, wt + 1);
    }

        System.out.println(prev[wt]);
    }
}

