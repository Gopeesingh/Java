package DynamicProgramming;

public class HouseRobber {
    // 9 1 3 8
    static int calls = 0;
    private static int rob(int[] houses, int ind, int[]dp){
        calls++;
    if(ind >= houses.length)
        return 0;
    if(ind == houses.length - 1)
        return houses[ind];

        if(dp[ind] != -1)
        return dp[ind];
    
        int pick = houses[ind] + rob(houses, ind+2, dp);
        int not_pick = rob(houses, ind + 1, dp);

        return dp[ind] =  Math.max(pick, not_pick);
    }
    public static void main(String[] args) {
        int n = 4;
        int[] houses = new int[n];
        houses[0] = 9;
        houses[1] = 1;
        houses[2] = 3;
        houses[3] = 8;
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            dp[i] = -1;
        }
        
        System.out.println(rob(houses, 0, dp));
        System.out.println(calls);
    }
}
