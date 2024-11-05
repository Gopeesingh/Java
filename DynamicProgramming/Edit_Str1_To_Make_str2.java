package DynamicProgramming;

public class Edit_Str1_To_Make_str2 {
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
        String s1 = "SUNDAY"; // UN
        String s2 = "SATURDAY"; // ATUR
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
        int lcsLength = prev[n];
        System.out.println(Math.max(s1.length() - lcsLength, s2.length() - lcsLength));
    }
}
