package Oops;

public class Interface {

    interface Bicycle{
        int a = 45;
        void applyBrack(int Decrement); // abstract method
        void speedUp(int increment);
    }

    interface HornBicycle{
        void blowHornK3g();
        void blowHornMaihu();

    }
    static class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pee pee poo");
    }
public void applyBrack(int Decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
            System.out.println("Speedup");
        }
    public void blowHornK3g(){
            System.out.println("Hat nn.. Pee pee pee");
        }
    public void blowHornMaihu(){
            System.out.println("Mai hoon n po po po");
        }
    }
    public static void main(String[] args) {
        AvonCycle cyclegopee = new AvonCycle();
      cyclegopee.applyBrack(1); // Applying Brake
      System.out.println(cyclegopee.a);   // 45
      cyclegopee.blowHornMaihu();   // Mai hoon n po po po
    }
    }

