package DynamicProgramming;

import java.util.List;

public class Word_Break {
    //// memoization

    // private static int rec(int idx, String s, List<String> wordDict, int[] dp){
    //     if(idx == s.length()) return 1;

    //     if(dp[idx] != 1){
    //         return dp[idx];
    //     }

    //     for(int i=idx; i<s.length(); i++){
    //         String prefix = s.substring(idx, i + 1);
    //         if(wordDict.contains(prefix)){
    //             // suffix pe rec
    //             if(rec(i + 1, s, wordDict, dp) == 1){
    //                 return dp[idx] = 1;
    //             }
    //             else{
    //                 return dp[idx] = 0;
    //             }
    //         }
    //     }
    //     return dp[idx] = 0;
    // }
    // public static void main(String[] args) {
    //     String s = "catsandog";
    //     List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");
    //     int n = s.length();
    //     int[] dp = new int[n];
    //     for(int i=0; i<n; i++){
    //         dp[i] = -1;
    //     }
    //     System.out.println(rec(0, s, wordDict, dp));
    // }

    // //Tebulation:-

    private static int rec(int idx, String s, List<String> wordDict, int[] dp){
        if(idx == s.length()) return 1;

        if(dp[idx] != 1){
            return dp[idx];
        }

        for(int i=idx; i<s.length(); i++){
            String prefix = s.substring(idx, i + 1);
            if(wordDict.contains(prefix)){
                // suffix pe rec
                if(rec(i + 1, s, wordDict, dp) == 1){
                    return dp[idx] = 1;
                }
                
            }
        }
        return dp[idx] = 0;
    }
    public static void main(String[] args) {
        String s = "catsandog";
        List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");
        int n = s.length();
        int[] dp = new int[n+1];
        // base condition
        dp[n] = 1;

        for(int idx=n-1; idx>=0; idx--){
            for(int i=idx; i<s.length(); i++){
            String prefix = s.substring(idx, i + 1);
            if(wordDict.contains(prefix)){
                // suffix pe rec
                if(dp[i + 1] == 1){
                     dp[idx] = 1;
                }
                
            }
        }
    }
       
        // System.out.println(rec(0, s, wordDict, dp));
        System.out.println(dp[0]);
    }
}