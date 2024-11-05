/////:- COUNT THE NUMBER OF OCCURRENCE OF PARTICULAR ELEMENTS-:////

// import java.util.Scanner;
// public class QuestionArray {
    
//     static int countOccurrences(int[]arr, int x) {
//         int count = 0;
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i]==x) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array");
//         int n = sc.nextInt();
 
//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " element: ");
//         for(int i=0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter x");
//         int x = sc.nextInt();
//         System.out.println("COUNT OF x :" + countOccurrences(arr,x) );
//     }
// }

//////:- FIND THE LAST OCCURRENCE OF AN ELEMENT X IN AGIVEN ARRAY  ///////

//  import java.util.Scanner;
// public class QuestionArray {
    
//     static int lastOccurrences(int[]arr, int x) {
//         int lastIndex = -1;
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i]==x) {
//                 lastIndex=i;
//             }
//         }
//         return lastIndex;
//     }
//     static int countOccurrences(int[]arr, int x ) {
//         int count = 0;
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i]==x) {
//                 count++;
//             }
//         }
//         return count;
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter size of array");
//     int n = sc.nextInt();

//     int[]arr = new int[n];
//     System.out.println("Enter " + n + " elements ");
//     for(int i=0; i<arr.length; i++) {
//         arr[i] = sc.nextInt();
//     }
//     System.out.println("Enter x");
//     int x = sc.nextInt();
//     System.out.println("Last Occurence of x :" + lastOccurrences(arr,x));
// }
// }

// COUNT THE NUMBER OF ELEMENTS STRICALY GRETER THEN X

// import java.util.Scanner;
// public class QuestionArray {
    
//     static int countOccurrences(int[]arr, int x) {
//         int count = 0;
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i]>x) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " element: ");
//         for(int i=0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter x");
//         int x = sc.nextInt();
//         System.out.println("STRICLY GREATER THAN x :" + countOccurrences(arr,x) );
//     }
// }

//  import java.util.Arrays;
//  import java .util.Scanner;
// public class QuestionArray {
    
//     static int smallestAndLargestElement(int[]arr) {
//         Arrays.sort(arr);
        
//         int count = 0;
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i]>x) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " element: ");
//         for(int i=0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter x");
//         int x = sc.nextInt();
//         System.out.println("STRICLY GREATER THAN x :" + countOccurrences(arr,x) );
//     }
// }
