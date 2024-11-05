package Random;

import java.util.Scanner;

public class MakeMyArrayEqual {
    public static void make(int []arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] != arr[j]){
                    arr[i] = arr[i] + arr[j];
                }
            }
            if(arr[i] == arr[i+1]){
            System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception{
	Scanner sc = new Scanner(System.in);
	int arr = sc.nextInt();
	}
}
