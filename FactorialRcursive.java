
// public class FactorialRcursive {
//     static int factorial(int n) {
//         // base case
//         if(n==0) {
//           return 1;
//         }
//         // recursive work
//         int smallAns = factorial(n-1);
// // self work
// int ans = n * smallAns;
// return ans;
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }

public class FactorialRcursive {
    static int factorial(int n) {
        if(n==0) return 1;
      return  n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
