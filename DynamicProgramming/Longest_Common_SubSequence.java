package DynamicProgramming;

public class Longest_Common_SubSequence {

    // by recursion

//    public static int rec(String s1, String s2, int i, int j){

//     // base case
//     if(i<0 || j<0)
//     return 0;

// if(s1.charAt(i) == s2.charAt(j)){
//     int match = 1 + rec(s1, s2, i-1, j-1);
//     return match;
// }
// int not_match = Math.max(rec(s1, s2, i-1, j), rec(s1, s2, i, j-1));
// return not_match;

//     }
// public static void main(String[] args) {
//     String s1 = "AGGTAB";
//     String s2 = "GXTXAYB";
//     int n1 = s1.length();
//     int n2 = s2.length();
//     System.out.println(rec(s1, s2, n1-1, n2-1));
//    }


// by memoization

// public static int rec(String s1, String s2, int i, int j, int [][]dp){

//     // base case
//     if(i<0 || j<0)
//     return 0;

//     if(dp[i][j] != -1){
//         return dp[i][j];
//     }
//  // work
// if(s1.charAt(i) == s2.charAt(j)){
//     return dp[i][j] = 1 + rec(s1, s2, i-1, j-1, dp);
// }
//  return dp[i][j] =  Math.max(rec(s1, s2, i-1, j, dp), rec(s1, s2, i, j-1, dp));
//     }
// public static void main(String[] args) {
//     String s1 = "AGGTAB";
//     String s2 = "GXTXAYB";
//     int m = s1.length();
//     int n = s2.length();
//     int [][]dp = new int[m][n];
//     for(int i=0; i<m; i++){
//         for(int j=0; j<n; j++){
//             dp[i][j] = -1;
//         }
//     }
//     System.out.println(rec(s1, s2, m-1, n-1, dp));
//    }

// tebulation :-

// public static int rec(String s1, String s2, int i, int j, int [][]dp){

//     // base case
//     if(i==0 || j==0)
//     return 0;

//     if(dp[i][j] != -1){
//         return dp[i][j];
//     }
// // work
// if(s1.charAt(i-1) == s2.charAt(j-1)){
//     // match
//     return dp[i][j] = 1 + rec(s1, s2, i-1, j-1, dp);
// }
//    // not match
//  return dp[i][j] =  Math.max(rec(s1, s2, i-1, j, dp), rec(s1, s2, i, j-1, dp));
//     }
// public static void main(String[] args) {
//     String s1 = "AGGTAB";
//     String s2 = "GXTXAYB";
//     int m = s1.length();
//     int n = s2.length();
//     int [][]dp = new int[m+1][n+1];
//     for(int i=0; i<=m; i++)
//         dp[i][0] = 0;
//         for(int j=0; j<=n; j++)
//             dp[0][j] = 0;
        
//             for(int i=1; i<=m; i++){
//                 for(int j=1; j<=n; j++){
//                     // work
// if(s1.charAt(i-1) == s2.charAt(j-1)){
//     dp[i][j] = 1 + dp[i-1][j-1];
// }
// else{
//     dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]);
//                 }
//             }
//         }
//     System.out.println(dp[m][n]);
// }

// SPACE OPTIMIZATION :-

public static int rec(String s1, String s2, int i, int j, int [][]dp){

    // base case
    if(i==0 || j==0)
    return 0;

    if(dp[i][j] != -1){
        return dp[i][j];
    }
// work
if(s1.charAt(i-1) == s2.charAt(j-1)){
    // match
    return dp[i][j] = 1 + rec(s1, s2, i-1, j-1, dp);
}
   // not match
 return dp[i][j] =  Math.max(rec(s1, s2, i-1, j, dp), rec(s1, s2, i, j-1, dp));
    }
public static void main(String[] args) {
    String s1 = "AGGTAB";
    String s2 = "GXTXAYB";
    int m = s1.length();
    int n = s2.length();

    int[] curr = new int[n+1];
    int[] prev = new int[n+1];
        for(int j=0; j<=n; j++)
            prev[j] = 0;
        
   
            for(int i=1; i<=m; i++){
                for(int j=1; j<=n; j++){
                    // work
if(s1.charAt(i-1) == s2.charAt(j-1)){
    curr[j] = 1 + prev[j-1];
}
else{
    curr[j] =  Math.max(prev[j], curr[j-1]);
                }
                prev = curr;
            }
        }
    System.out.println(prev[n]);
}
}

