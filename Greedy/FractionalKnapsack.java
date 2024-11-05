package Greedy;
import java.util.*;
public class FractionalKnapsack {
    private static class Item{
        Integer value;
        Integer weight;
        public String toString(){
            return value + " " + weight;
        }
    }
    public static class ItemComparators implements Comparator<Item>{
        public int compare(Item i1, Item i2){
            if((i1.value/ i1.weight) < (i2.value/i2.weight))
            return 1;
            else if((i1.value/i1.weight) > (i2.value/i2.weight))
            return -1;
            else 
                 return 0;
        }
    }
    public static void main(String[] args) {
        List<Integer> value = List.of(60, 100, 150, 120);
        List<Integer> weights = List.of(10, 20, 50, 15);
        List<Item> itemsList = new ArrayList<>();
        for(int i=0; i<value.size(); i++){
            Item item = new Item();
            item.value = value.get(i);
            item.weight = weights.get(i);
            itemsList.add(item);
        }
    itemsList.sort(new ItemComparators()); // sort karana input ko sabse valuable chij front pe aur sabse chip cheej last me using comparator
    System.out.println(itemsList); // [120 15, 60 10, 100 20, 150 50]
    int W = 30;
    int profit = 0;
    for(int i=0; i<itemsList.size() && W>0; i++){
        Item item = itemsList.get(i); // item ko nikala
        if(item.weight <= W){ // weight ki capcity jada ho ya barabar ho
            profit += item.value;
            W -= item.weight;
        }else{
            profit += item.value / item.weight * W;
            W = 0;
        } // 120 + 60 + 25 = 205
    }
    System.out.println(profit); // 205
    }
}
