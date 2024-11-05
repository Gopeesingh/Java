package BackTracking;

public class MazePath {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        int count = maze(0, 0, rows-1, cols-1);
        System.out.println(count);
    }
    private static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr == er && sc == ec) return 1;

        int downWays = maze(sr+1, sc, er, ec);
        int rightWays = maze(sr, sc+1, er, ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }
}
