package Infoses;

public class Tady {
    public  static boolean istady(int num){
        while(num != 0){
            int digit1 = num%10;
            num /= 10;
            int digit2 = num%10;
            if(digit1 < digit2){
                return false;
            }
        }
        return true;
        }
        public static void main(String[] args) {
            int num = 1234;
        System.out.println(istady(num));
        }
}
