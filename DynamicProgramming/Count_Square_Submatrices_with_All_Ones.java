package DynamicProgramming;

public class Count_Square_Submatrices_with_All_Ones {
    public static void main(String[] args) {
        int [][]grid = {{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}};
        int M = grid.length;
        int N = grid[0].length;
        
        int ans = 0;
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(grid[i][j] == 1 && i > 0 && j > 0){
        grid[i][j] = 1 + Math.min(grid[i - 1][j], Math.min(grid[i - 1][j - 1], grid[i][j - 1]));
                }
                ans += grid[i][j];
            }
        }
        System.out.println(ans); // 15
    }
}
