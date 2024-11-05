import java.util.Scanner;
public class ScondLargest {
    static int findMax(int []arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int findScondMax(int []arr) {
        int mx = findMax(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                System.out.println("Enter array size");
                int n = sc.nextInt();
                int []arr = new int[n];
                System.out.println(" Enter " + n + " elements ");
                for(int i=0; i<n; i++) {
                    arr[i]=sc.nextInt();
                }
                    System.out.println("Second Maximum element:" + findScondMax(arr));
            }
        }
