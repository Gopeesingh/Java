public class SearchMatrix {
    static boolean searchMatrix(int [][]a, int target) {
        // number of rows = n, number of cols = m
        int n = a.length, m = a[0].length;
        int st = 0, end = n*m - 1;
        while(st <= end) {
            int mid = st + (end - st)/2;
            int midElt = a[mid/m][mid%m];
            if(midElt == target) return true;
            if(target < midElt) {
                end = mid -1;
            }
            else{
                st = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] a = {1, 3, 5, 7, 10, 11, 16, 20, 23, 30, 34, 60};
        int target = 10;
        System.out.println(searchMatrix(null, target));
    }
}
