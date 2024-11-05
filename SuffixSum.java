import java.util.*;
public class SuffixSum {
    static void printArray(int []arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makeSuffixSumArray(int []arr) {
    
int n = arr.length;
int [] suffix = new int[n];

suffix[0] =  arr[j];
for(int i=1; i<n; i++) {
    for(int j=i; j<n; j++) {
    // pref[i] = pref[i-1] + arr[i];
   arr[i] = arr[i]+ arr[j];
    }
}
// return pref;
return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] arr = new int[n];
    
     System.out.println("Enter " + n + " elements");
     for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
     }
    System.out.println("original Array");
    printArray(arr);
    int [] suffix = makeSuffixSumArray(arr);
    System.out.println("Input Array");
    printArray(arr);
}
}
