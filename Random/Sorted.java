package Random;

public class Sorted {
    // public static boolean isSorted(int []arr){
    //     boolean check = true;
    //     for(int i=1; i<arr.length; i++){
    //         if(arr[i]<arr[i-1]){
    //             check = false;
    //         }
    //     }
    //     return check;
    // }
    // public static void main(String[] args) {
    //     int arr [] = {1,3,7,5,2,4};
    // System.out.println(isSorted(arr));
    // }


    public static void isSorted(){
        int arr [] = {1,3,7,5,2,4};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    }
   public static void main(String[] args) {
    Sorted s = new Sorted();
    isSorted();

}
}