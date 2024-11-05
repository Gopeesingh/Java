package DynamicProgramming;
import java.util.*;
public class Edit_Str1_To_Make_Str2_2 {

     // RECURSION :-
    
    // private static int rec(int i, int j,String str1, String str2,){

    //         // base case
    //         if(i == -1) return dp[i][j] = j+1;
    //         if(j == -1) return dp[i][j] = i+1;
    
    
    
    //         if(str1.charAt(i) == str2.charAt(j))
    //         return rec(i-1, j-1, str1, str2);
    
    //         int replace = 1 + rec(i-1, j-1, str1, str2);
    //         int insertion = 1 + rec(i, j-1, str1, str2);
    //         int deletion = 1 + rec(i-1, j, str1, str2);
    //         return Math.min(replace, Math.min(insertion, deletion));
    //     }
    //     public static void main(String[] args) {
    //         String str1 = "SUNDAY";
    //         String str2 = "SATURDAY";
    //         int m = str1.length();
    //         int n = str2.length();
    //         }
    //         System.out.println(rec(m-1, n-1, str1, str2,dp)); // 3
    //     }

    // MEMORISTION :-

// private static int rec(int i, int j,String str1, String str2,int [][] dp){

//     if(dp[i][j] != -1)
//     return dp[i][j];
//         // base case
//         if(i == 0) return dp[i][j] = j;
//         if(j == 0) return dp[i][j] = i;



//         if(str1.charAt(i-1) == str2.charAt(j-1))
//         return dp[i][j] = rec(i-1, j-1, str1, str2, dp);

//         int replace = 1 + rec(i-1, j-1, str1, str2, dp);
//         int insertion = 1 + rec(i, j-1, str1, str2, dp);
//         int deletion = 1 + rec(i-1, j, str1, str2, dp);
//         return dp[i][j] = Math.min(replace, Math.min(insertion, deletion));
//     }
//     public static void main(String[] args) {
//         String str1 = "SUNDAY";
//         String str2 = "SATURDAY";
//         int m = str1.length();
//         int n = str2.length();

//         int [][] dp = new int[m+1][n+1];
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 dp[i][j] = -1;
//             }
//         }
//         System.out.println(rec(m-1, n-1, str1, str2,dp)); // 3
//     }

// TEBULATION :-

// private static int rec(int i, int j,String str1, String str2,int [][] dp){

//     if(dp[i][j] != -1)
//     return dp[i][j];
//         // base case
//         if(i == 0) return dp[i][j] = j;
//         if(j == 0) return dp[i][j] = i;



//         if(str1.charAt(i-1) == str2.charAt(j-1))
//         return dp[i][j] = rec(i-1, j-1, str1, str2, dp);

//         int replace = 1 + rec(i-1, j-1, str1, str2, dp);
//         int insertion = 1 + rec(i, j-1, str1, str2, dp);
//         int deletion = 1 + rec(i-1, j, str1, str2, dp);
//         return dp[i][j] = Math.min(replace, Math.min(insertion, deletion));
//     }
//     public static void main(String[] args) {
//         String str1 = "SUNDAY";
//         String str2 = "SATURDAY";
//         int m = str1.length();
//         int n = str2.length();

//         int [][] dp = new int[m+1][n+1];
//         // base condition
//         for(int i=0; i<m; i++)
//         dp[i][0] = i;
//             for(int j=0; j<n; j++)
//         dp[0][j] = j;
    
//         for(int i=1; i<=m; i++){
//             for(int j=1; j<=n; j++){
//                 if(str1.charAt(i-1) == str2.charAt(j-1)){
//                 dp[i][j] = dp[i-1][j-1];
//                 continue;
//                 }
//                 int replace = 1 + dp[i-1][j-1];
//                 int insertion = 1 + dp[i][j-1];
//                 int deletion = 1 + dp[i-1][j];
//             dp[i][j] = Math.min(replace, Math.min(insertion, deletion));
//             }
//         }
//         System.out.println(dp[m][n]); // 3
//     }


// SPACE OPTIMIZATION :-

private static int rec(int i, int j,String str1, String str2,int [][] dp){

    if(dp[i][j] != -1)
    return dp[i][j];
        // base case
        if(i == 0) return dp[i][j] = j;
        if(j == 0) return dp[i][j] = i;



        if(str1.charAt(i-1) == str2.charAt(j-1))
        return dp[i][j] = rec(i-1, j-1, str1, str2, dp);

        int replace = 1 + rec(i-1, j-1, str1, str2, dp);
        int insertion = 1 + rec(i, j-1, str1, str2, dp);
        int deletion = 1 + rec(i-1, j, str1, str2, dp);
        return dp[i][j] = Math.min(replace, Math.min(insertion, deletion));
    }
    public static void main(String[] args) {
        String str1 = "SUNDAY";
        String str2 = "SATURDAY";
        int m = str1.length();
        int n = str2.length();

        int [][] dp = new int[m+1][n+1];
        int []prev = new int[n+1];
        int []cur = new int[n+1]; 
        // base condition
        for(int i=0; i<n; i++)
        prev[i] = i; //dp[i] = prev --> dp[i] = cur && dp[i-1] = prev

    
        for(int i=1; i<=m; i++){
            cur[0] = i;
            for(int j=1; j<=n; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                cur[j] = prev[j-1];
                continue;
                }
                int replace = 1 + prev[j-1];
                int insertion = 1 + cur[j-1];
                int deletion = 1 + prev[j];
        cur[j] = Math.min(replace, Math.min(insertion, deletion));
            }
          //  prev = cur; // shallow copy
            prev = Arrays.copyOf(cur,n + 1);
        }
        System.out.println(prev[n]); // 3  dp[m] = prev
    }
}