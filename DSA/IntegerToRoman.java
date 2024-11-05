package DSA;

public class IntegerToRoman {
    public String intToRoman(int num) {

        int intValue[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String code[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String ans = "";
        for(int i=0;i<intValue.length;i++) { // itrate on value
            while(num>=intValue[i]) { // we check if num 2837 > 1000
                ans = ans + code[i]; // now add in roman -> M
                num=num-intValue[i]; // now 2837 - 1000 = 1837 now again go to check on while 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 2837;
        IntegerToRoman in = new IntegerToRoman();
        in.intToRoman(num);
        System.out.println(in.intToRoman(num)); // MMDCCCXXXVII
    }
}
