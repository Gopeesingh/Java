public class CountDigitsRecursive {
    static int cod(int n) {
        // base case
        if(n>0) return n;
    
        return cod(n/10)+ n%10 ;
    }
    public static void main(String[] args) {
        System.out.println(cod(1234));
    }
}
