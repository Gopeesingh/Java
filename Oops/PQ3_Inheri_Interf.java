package Oops;

public class PQ3_Inheri_Interf {
    static abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disConnected();
    }
    static class SmartTelePhone extends TelePhone{
    void ring(){
    System.out.println("Ringing..");
    }
    void lift(){
System.out.println("Lifting..");
    }
    void disConnected(){
System.out.println("Tututu..");
    }
    void camera(){
        System.out.println("Click...");
    }
    }
    
    public static void main(String[] args) {
        TelePhone p = new SmartTelePhone();
        p.disConnected(); //Tututu
       // p.camera(); -- > through eroor

    }
}