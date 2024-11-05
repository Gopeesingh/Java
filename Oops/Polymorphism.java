package Oops;

public class Polymorphism {

    interface MyCamera2{
        void takeSnap2();
        void recordVideo2();
        default void record4kVideo2(){
            System.out.println("Recording in 4k...");
        }
    }
    interface MyWifi2{
        String[] getNetworks2();
        void connectToNetwork2(String network);
    }
   static class MyCellPhone2{
        void callNumber2(int phoneNumber){
            System.out.println("Calling "+ phoneNumber);
        }
        void okcall2(){
            System.out.println("Connecting...");
        }
    }
    public static class MySmartphone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
        public void takeSnap2(){
            System.out.println("Taking snap");
        }
        public void recordVideo2(){
            System.out.println("taking video");
        }

        public void record4KVideo2(){
            System.out.println("taking video");
        }

        public String[] getNetworks2(){
            System.out.println("Getting List of network");
        String[] networkList = {"Gopee", "Harsh", "Kartikey"};
        return networkList;
    }
    public void connectToNetwork2(String network){
        System.out.println("Connecting to "+ network);
    }
}
public static void main(String[] args) {
    MyCamera2 cam2 = new MySmartphone2();
   // cam2.getNetworks(); -> not allowed

    cam2.record4kVideo2(); // Recording in 4k...
    
    MySmartphone2 s = new MySmartphone2();
    s.callNumber2(1);//Calling 1
    s.recordVideo2(); // taking video
    s.getNetworks2(); // Getting List of network
 }
}

