package Random;
import java.util.*;
public class CounNum {
    public static int counts(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {2,3,4,5,2,9,8,2};
        // int x = 2;

        System.out.println("enter size of element");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter" +n+ "element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();
       System.out.println(counts(arr,x));
    }
}
