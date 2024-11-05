package Random;
import java.util.*;
public class Price_off_Problems {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int []items =  {250, 645, 300, 900, 50};
        for(int i=0; i<items.length; i++){
            int offprice = items[i] * 10/100;
            int finalprice = items[i] - offprice;
            l.add(finalprice);
        }
        System.out.println(l);
    }
}