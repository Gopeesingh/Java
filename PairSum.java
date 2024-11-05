
import java.util.Scanner;
public class PairSum {
    static int pairSum(int[]arr,int target) {
        int ans= 0;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=n+1; j<n; j++){
                if(arr[i]+arr[j]==target) {
                    ans++;
                }
            }
        }
        return ans;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println(" Enter " + n + " element ");
    for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter target Sum");
    int target = sc.nextInt();
    System.out.println(pairSum(arr,target));
}
}