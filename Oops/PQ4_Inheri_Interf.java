package Oops;

public class PQ4_Inheri_Interf {
     // Q.6 --> 

     interface TvRemote{
        void off();
        void on();
        void puase();
        }
        static  class  SmartTvRemote implements  TvRemote{
        public void off(){
        System.out.println(" Band!");
        }
    public  void on(){
    System.out.println("Chalu!");
        }
        public void puase(){
    System.out.println("Ruk ja sim sim !");
        }
            }
    public static void main(String[] args) {
        SmartTvRemote sx = new SmartTvRemote();
        sx.off(); // Band!
        sx.on(); //Chalu!
        sx.puase(); //Ruk ja sim sim !
    }
}
