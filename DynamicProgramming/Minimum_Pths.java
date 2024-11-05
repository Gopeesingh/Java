package DynamicProgramming;
import java.util.*;
import java.util.ArrayList;

public class Minimum_Pths {
    // recursion

    // public static int rec(int i, int j, List<List<Integer>> grid){
    //     if(i == 0 && j == 0) return grid.get(0).get(0);

    //     if(i < 0 || j < 0) return Integer.MAX_VALUE;

    // return grid.get(i).get(j) + Math.min(rec(i-1, j, grid), rec(i, j-1, grid));
    // }
    // public static void main(String[] args) {
    //     List<List<Integer>> grid = new ArrayList<>();
    //     grid.add(List.of(1, 3, 1));
    //     grid.add(List.of(1, 5, 1));
    //     grid.add(List.of(4, 2, 1));
    //     int M = grid.size();
    //     int N = grid.get(0).size();
    //     System.out.println(rec(M-1, N-1, grid));
    // }

    // memoistion

    // public static int rec(int i, int j, List<List<Integer>> grid, int [][]dp){
    //     if(i == 0 && j == 0) return grid.get(0).get(0);

    //     if(i < 0 || j < 0) return Integer.MAX_VALUE;

    //     if(dp[i][j] != -1)return dp[i][j];

    // return dp[i][j]=  grid.get(i).get(j) + Math.min(rec(i-1, j, grid, dp), rec(i, j-1, grid, dp));
    // }
    // public static void main(String[] args) {
    //     List<List<Integer>> grid = new ArrayList<>();
    //     grid.add(List.of(1, 3, 1));
    //     grid.add(List.of(1, 5, 1));
    //     grid.add(List.of(4, 2, 1));
    //     int M = grid.size();
    //     int N = grid.get(0).size();
    //     int [][] dp = new int [M][N];
    //     for(int i = 0; i<M; i++){
    //         for(int j = 0; j<N; j++){
    //             dp[i][j]= -1;
    //         }
    //     }
    //     System.out.println(rec(M-1, N-1, grid, dp)); // 7
    // }
    // tebulation :--

 
    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(List.of(1, 3, 1));
        grid.add(List.of(1, 5, 1));
        grid.add(List.of(4, 2, 1));
        int M = grid.size();
        int N = grid.get(0).size();
        int [][] dp = new int [M][N];
        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                if(i == 0 && j == 0){
                dp[i][j] = grid.get(0).get(0);
                continue;
                }
                int D = Integer.MAX_VALUE;
                if(i>0) D = dp[i-1][j];
                int R = Integer.MAX_VALUE;
                if(j>0) R = dp[i][j-1];
            dp[i][j]=  grid.get(i).get(j) + Math.min(D, R);
            }
        }
        System.out.println(dp[M-1][N-1]);// 7
    }
}
