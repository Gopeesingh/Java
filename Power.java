// public class Power {
//     static int pow(int p, int q) {
//         // base case 
// if(q==0) return 1;
// // recursive work
// return pow(p,q-1) * p;
//     }
//     public static void main(String[] args) {
//         System.out.println(pow(2, 03));
//     }
// }

public class Power {
    static int pow(int p, int q) {
        // base case 
if(q==0) return 1;
// recursive work
int smallPow = pow(p,q/2);
if(q%2==0) {
    return smallPow * smallPow;
}
else{
    return p * smallPow * smallPow;
}
    }
    public static void main(String[] args) {
        System.out.println(pow(5, 03));
    }
}
