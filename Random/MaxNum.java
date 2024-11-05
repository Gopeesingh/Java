package Random;

public class MaxNum {
    public void max(){
        int arr[] = {2,5,82,45,33};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("Max"+ans);
    }
    public static void main(String[] args) {
        MaxNum m = new MaxNum();
        m.max();
    }
}
