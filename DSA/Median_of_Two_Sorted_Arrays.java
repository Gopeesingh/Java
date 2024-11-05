package DSA;

public class Median_of_Two_Sorted_Arrays {

    public static int[] mergeSort(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        return mergeSortHelper(nums1, 0, m - 1, nums2, 0, n - 1, mergedArray, 0);
    }
 
    private static int[] mergeSortHelper(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int[] mergedArray, int startMerged) {
        if (start1 > end1) {
            System.arraycopy(nums2, start2, mergedArray, startMerged, end2 - start2 + 1);
            return mergedArray;
        }
        if (start2 > end2) {
            System.arraycopy(nums1, start1, mergedArray, startMerged, end1 - start1 + 1);
            return mergedArray;
        }
        
        int mid1 = (start1 + end1) / 2;
        int mid2 = (start2 + end2) / 2;
 
        if (nums1[mid1] <= nums2[mid2]) {
            System.arraycopy(nums1, start1, mergedArray, startMerged, mid1 - start1 + 1);
            mergeSortHelper(nums1, mid1 + 1, end1, nums2, start2, end2, mergedArray, startMerged + (mid1 - start1 + 1));
        } else {
            System.arraycopy(nums1, start2, mergedArray, startMerged, mid2 - start2 + 1);
            mergeSortHelper(nums1, start1, end1, nums2, mid2 + 1, end2, mergedArray, startMerged + (mid2 - start2 + 1));
        }
 
        return mergedArray;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // int[] mergedArray = mergeSort(array1, array2);

        // // Print the merged array
        // for (int i : mergedArray) {
        //     System.out.print(i + " ");

    
        
        // }
    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     
    // }
}

}