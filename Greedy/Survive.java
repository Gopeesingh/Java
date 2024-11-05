package Greedy;
import java.util.*;
public class Survive {
    public static void main(String[] args) {
        int S = 10; // no of days of survive
        int N = 16; // M sa buy 
        int M = 2; // har din consume (Sunday ko khana nahi milega)

        int total_food_required = S * M;
        double result;
        if((M>N) || (7*M) > (6*N)){
            result =  -1;
        }else{
            result = (int) Math.ceil((double)total_food_required/N);// here (int) means it remove decimal in ans when we use double -> and use for ceil for upper value
            // floor(lower no round off) ceil(upper number round off)
            // 9 - 9.9 - 10 
        }
        System.out.println(result); //2.0
    }
}
