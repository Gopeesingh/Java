package Random;

public class ReverseString {
    public static void revS(String str){
        char[] chArray = str.toCharArray();
        int i = 0;
        int j = chArray.length-1;
        while(i<=j){
            char temp = chArray[i];
            chArray[i] = chArray[j];
            chArray[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(chArray));
    }
    public static void main(String[] args) {
        String str = "Gopee";
        ReverseString b = new ReverseString();
        b.revS(str);
    
    }
}
