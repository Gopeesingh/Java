package Greedy;
import java.util.*;
public class SmallestNumber {
    public static void main(String[] args) {
        int S = 9;
        int D = 2;
        if(S == 0 || S > D*9){
            System.out.println("humse na ho paayega");
            return;
        }
        S -= 1;
        List<Integer> number = new ArrayList<>();
        for(int i=0; i<D; i++)
            number.add(0);

            // right to left chalo
            for(int i = D-1; i>=1; i--){
                if(S>9){
                number.set(i,9);
                S -= 9;
            }
            else{
             number.set(i,S);
             S = 0;
             break;
            }
        }
        // starting vaala 1 plus remining sum
        number.set(0, S+1);
        System.out.println(number); // [1, 8]
    }
}
