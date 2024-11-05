package Oops;

public class Fraction {
    public static class Fractionss{
        int num;
        int den;
        
        // Constructor 
        public Fractionss(int num, int den){
            this.num = num;
            this.den = den;
        }
    }
    public static void main(String[] args) {
        Fractionss f1 = new Fractionss(3, 4);
        System.out.println(f1.num+"/"+f1.den);
    }
}
