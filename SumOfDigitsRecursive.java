// public class SumOfDigitsRecursive {
//     static int sod(int n) {
//         // base case
//         if(n>=0 && n<=9) return n;
//         // recursive work
// int smallAns = sod(n/10);
// // self work
// int ans = smallAns + n%10;
// return ans;
//     }
//     public static void main(String[] args) {
//         System.out.println(sod(1234));
//     }
// }

public class SumOfDigitsRecursive {
    static int sod(int n) {
        if(n>=0 && n<=9) return n;
return sod(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sod(12358));
    }
}