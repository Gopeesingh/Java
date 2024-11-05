package Oops;

public class Default_method {
    interface MyCamera{
        void takeSnap();
        void recordVideo();
        default void record4kVideo(){
            System.out.println("Recording in 4k...");
        }
    }
    interface MyWifi{
        String[] getNetworks();
        void connectToNetwork(String network);
    }
   static class MyCellPhone{
        void callNumber(int phoneNumber){
            System.out.println("Calling "+ phoneNumber);
        }
        void okcall(){
            System.out.println("Connecting...");
        }
    }
    public static class MySmartphone extends MyCellPhone implements MyWifi, MyCamera{
        public void takeSnap(){
            System.out.println("Taking snap");
        }
        public void recordVideo(){
            System.out.println("taking video");
        }

        public void record4KVideo(){
            System.out.println("taking video");
        }

        public String[] getNetworks(){
            System.out.println("Getting List of network");
        String[] networkList = {"Gopee", "Harsh", "Kartikey"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public static void main(String[] args) {
    MySmartphone ms = new MySmartphone();
    ms.record4KVideo(); // taking video

    String[] ar = ms.getNetworks();
    for(String item : ar){
        System.out.println(item);/* Getting List of network 
        Gopee
       Harsh
        Kartikey */
    }
}
}
