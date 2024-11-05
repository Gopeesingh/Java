public class MaxInArrayRecursion {
    static int maxInArray(int[]arr, int idx) {
// base case
if(idx == arr.length-1) {
    return arr[idx];
}
// small problem -> idx+1, end of the array-> max -> recursive work
int smallAns = maxInArray(arr, idx+1);
// self work and final ans
return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        int []arr = {5, 6, 10, 8, 9};
        System.out.println(maxInArray(arr, 0));
    }
}
