package Random;

public class SumInt {
    public int sumOfArray(){
        int [] arr = {1,2,3,4,5};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans + arr[i];
        }
        return ans;
    }
public static void main(String[] args) {
   
    SumInt s = new SumInt();
   System.out.println(s.sumOfArray());
}
}
