// public class FibonacciRecursive {
//     static int fib(int n) {
//         // base case
//         if(n==0) {
//             return n;
//         }
//             if(n==1) {
//                 return n;
//         }
//         // recursive case
//         int prev = fib(n-1);
//         int prePrev = fib(n-2);
//         // self work
//         int ans = prev + prePrev;
//         return ans;
//     }
//     public static void main(String[] args) {
//         System.out.println(fib(6));
//     }
// }

public class FibonacciRecursive {
    static int fib(int n) {
        if(n==0 || n==1)   return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
