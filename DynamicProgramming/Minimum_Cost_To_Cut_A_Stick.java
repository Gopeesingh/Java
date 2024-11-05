package DynamicProgramming;
import java.util.*;
public class Minimum_Cost_To_Cut_A_Stick {
    // // RECURSTION :-
    // public static int rec(int i, int j, List<Integer> cuts){
    //     // base case
    // if(i>j) return 0;
    // int minimum = 9999999;
    // for(int k = i; k <= j; k++){
    //     int cost = rec(i, k-1, cuts) + rec(k+1, j, cuts)
    //                 + cuts.get(j + 1) - cuts.get(i - 1);
    //         minimum = Math.min(minimum, cost);
    // }
    // return minimum;
    // }
    // public static void main(String[] args) {
    //     List<Integer> cut = List.of(5, 6, 1, 4, 2);
    //     int c = cut.size();
    //     int n = 9;
    //     List<Integer> cuts = new ArrayList<>();
    //     cuts.add(0);
    //     cuts.addAll(cut);
    //     cuts.add(n);
    //     Collections.sort(cuts);
    //     System.out.println(rec(1, c, cuts)); //22
    // }

    // MEMOISTION :-

    // public static int rec(int i, int j, List<Integer> cuts, int [][]dp){
    //     if(dp[i][j] != -1)
    //     return dp[i][j];

    //  // base case
    // if(i>j) return 0;
    // int minimum = 9999999;
    // for(int k = i; k <= j; k++){
    //     int cost = rec(i, k-1, cuts, dp) + rec(k+1, j, cuts, dp)
    //                 + cuts.get(j + 1) - cuts.get(i - 1);
    //         minimum = Math.min(minimum, cost);
    // }
    // return dp[i][j] = minimum;
    // }
    // public static void main(String[] args) {
    //     List<Integer> cut = List.of(1, 3, 4, 5);
    //     int c = cut.size();
    //     int n = 7;
    //     List<Integer> cuts = new ArrayList<>();
    //     cuts.add(0);
    //     cuts.addAll(cut);
    //     cuts.add(n);
    //     Collections.sort(cuts);

    //     int [][]dp = new int[c+2][c+2];
    //     for(int i = 0; i <= c; i++){
    //         for(int j = 0; j <= c; j++){
    //             dp[i][j] = -1;
    //         }
    //     }
    //     System.out.println(rec(1, c, cuts, dp)); //16
    // }

    // TEBULATION : -->

    public static int rec(int i, int j, List<Integer> cuts, int [][]dp){
        if(dp[i][j] != -1)
        return dp[i][j];

     // base case
    if(i>j) return 0;
    int minimum = 9999999;
    for(int k = i; k <= j; k++){
        int cost = rec(i, k-1, cuts, dp) + rec(k+1, j, cuts, dp)
                    + cuts.get(j + 1) - cuts.get(i - 1);
            minimum = Math.min(minimum, cost);
    }
    return dp[i][j] = minimum;
    }
    public static void main(String[] args) {
        List<Integer> cut = List.of(1, 3, 4, 5);
        int c = cut.size();
        int n = 7;
        List<Integer> cuts = new ArrayList<>();
        cuts.add(0);
        cuts.addAll(cut);
        cuts.add(n);
        Collections.sort(cuts);

        int [][]dp = new int[c+2][c+2];
        for(int i = 0; i <= c; i++){
            for(int j = 0; j <= i; j++){
                dp[i][j] = 0;
            }
        }

        for(int i=c; i>=1; i--){
            for(int j=i; j<=c; j++){
                int minimum = 9999999;
                for(int k = i; k <= j; k++){
                    int cost = dp[i][k-1]  + dp[k+1][j]
                                + cuts.get(j + 1) - cuts.get(i - 1);
                        minimum = Math.min(minimum, cost);
                }
                dp[i][j] = minimum;
                }
            }
        System.out.println(dp[1][c]); //16
    }
}
