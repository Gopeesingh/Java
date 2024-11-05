package Oops;

public class PQ1_Abstract_Intrfaces {
    static abstract class Pen{
        abstract void write();
        abstract void refill();
    }
    public static class FountainPen extends Pen{
      void write(){
    System.out.println("Write");
        }
     void refill(){
    System.out.println("Refill");
        }
        void changeNib(){
            System.out.println("Changing Nib");
        }
    }
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib(); // Changing Nib
    }
}
