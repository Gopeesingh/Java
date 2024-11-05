package Random;

public class Searchelement {
    public int search(){
        int [] arr = {1,3,5,6,7,9};
        int x = 10;
   int ans = -1;
   for(int i=0; i<arr.length; i++){
    if(arr[i] == x){
        ans = arr[i];
    }
    else{
        ans = 0;
    }
   }
   return ans;
    }
    public static void main(String[] args) {
        Searchelement s = new Searchelement();
     System.out.println(s.search());
    }
}
