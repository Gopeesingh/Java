package DynamicProgramming;

public class RegexMatching {

    // RECERSION -->

    // private static boolean rec(int i, int j, String s, String p){
    //     // base case
    //     if(j == -1 && i == -1) //  -> a a b
    //         return true;        //  -> * a .
        
    //         if(j == -1 && i >= 0)   // -> a a a b c
    //         return false;           // ->     a b *
    //     if(i == -1 && j >= 0){
    //         boolean flag = true;
    //         for(int x = 0; x <= j; x++){
    //             if(p.charAt(x) != '*')
    //             flag = false;
    //         }
    //         return true;
    //     }
        
    //     // work
    //     if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')
    //     return rec(i-1, j-1, s, p);

    //     else if(p.charAt(j) == '*')
    //     return rec(i, j-1, s, p) || rec(i-1, j, s, p); // ignore or take

    //     else
    //     return false; // not matching s and p
    // }

    // public static void main(String[] args) {
    //     String s = "abbbac";
    //     String p = "*a*.";

    //     System.out.println(rec(s.length()-1, p.length()-1, s, p));
    // }

    ////  MEMOISATION -->

    // private static boolean rec(int i, int j, String s, String p, int[][] dp){

    //     // base case
    //     if(j == -1 && i == -1) //  -> a a b
    //         return true;        //  -> * a .
        
    //         if(j == -1 && i >= 0)   // -> a a a b c
    //         return false;           // ->     a b *
    //     if(i == -1 && j >= 0){
            
    //         for(int x = 0; x <= j; x++){
    //             if(p.charAt(x) != '*')
    //             return false;
    //         }
    //         return true;
    //     }
    //     if (dp[i][j] != -1) { // Memoization check
    //         return dp[i][j] == 1;
    //     }
    //     boolean flag = true;
    //     // work
    //     if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')
    //     flag = rec(i-1, j-1, s, p, dp);

    //     else if(p.charAt(j) == '*')
    //     flag =  rec(i, j-1, s, p, dp) || rec(i-1, j, s, p, dp); // ignore or take

    //     else 
    //     return false; // not matching s and p

    //     dp[i][j] = flag ? 1 : 0; // Save result in dp array
    //     return flag;
    // }

    // public static void main(String[] args) {
    //     String s = "abbbac";
    //     String p = "*a*.";
    //     int m = s.length();
    //     int n = p.length();
    //     int [][]dp = new int[m+1][n+1];
    //     for(int i=0; i<m; i++){
    //         for(int j=0; j<n; j++){
    //             dp[i][j] = -1;
    //         }
    //     }

    //     System.out.println(rec(m - 1, n - 1, s, p, dp));
    // }

    //// TEBULATION :-->

    private static boolean rec(int i, int j, String s, String p, int[][] dp){

        // base case
        if(j == -1 && i == -1) //  -> a a b
            return true;        //  -> * a .
        
            if(j == -1 && i >= 0)   // -> a a a b c
            return false;           // ->     a b *
        if(i == -1 && j >= 0){
            
            for(int x = 0; x <= j; x++){
                if(p.charAt(x) != '*')
                return false;
            }
            return true;
        }
        if (dp[i][j] != -1) { // Memoization check
            return dp[i][j] == 1;
        }
        boolean flag = true;
        // work
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')
        flag = rec(i-1, j-1, s, p, dp);

        else if(p.charAt(j) == '*')
        flag =  rec(i, j-1, s, p, dp) || rec(i-1, j, s, p, dp); // ignore or take

        else 
        return false; // not matching s and p

        dp[i][j] = flag ? 1 : 0; // Save result in dp array
        return flag;
    }

    public static void main(String[] args) {
        String s = "aab"; //abbbac
        String p = "c*a*b";   // *a*.
        int m = s.length();
        int n = p.length();
        boolean [][]dp = new boolean[m+1][n+1];
        // base condition
        // for(int i=0; i<=m; i++)
        //     dp[i][0] = true;
        //     for(int j=0; j<=n; j++)
        //         dp[0][j] = true;
        dp[0][0] = true;

                 // Initialize the first row (s is empty)
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

                for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){

            
            if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.')
            dp[i][j] = dp[i-1][j-1];

            else if(p.charAt(j-1) == '*')
             dp[i][j] =  dp[i][j-1] || dp[i-1][j]; // ignore or take
            }
            }
        System.out.println(dp[m][n]);
    }
}

