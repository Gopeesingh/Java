package DSA;

public class Find_a_Peak_Element_II {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int left = 0;
        int right = m - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;
            int maxRow = 0;

            // Find the maximum element in the mid column
            for (int row = 0; row < n; row++) {
                if (mat[row][midCol] > mat[maxRow][midCol]) {
                    maxRow = row;
                }
            }

            // Check if the maximum element is a peak
            boolean isLeftSmaller = midCol - 1 < 0 || mat[maxRow][midCol] > mat[maxRow][midCol - 1];
            boolean isRightSmaller = midCol + 1 >= m || mat[maxRow][midCol] > mat[maxRow][midCol + 1];

            if (isLeftSmaller && isRightSmaller) {
                return new int[]{maxRow, midCol};
            } else if (!isLeftSmaller) {
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        }

        return new int[]{-1, -1}; // This line is never reached if the input always has a peak element
    }
    public static void main(String[] args) {
        
    }
}
