package Oops;

public class Thread_Constructor {
    static class MyThr extends Thread{
        public MyThr(String name){
        //    super(name);  // this line through error
        }
        public void run(){
            while(true){
                System.out.println("I am thread");
            }
        }
    }
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Gopee");
        MyThr t2 = new MyThr("Kishan");
      //  t1.start(); // this line through error
      //  t2.start(); // this line through error
      //System.out.println("The id of the thread t1 is "+ t1.getId()); //  // this line through error
     //System.out.println("The id of the thread t1 is "+ t1.getName()); //  // this line through error
       //System.out.println("The id of the thread t2 is "+ t2.getId()); //  // this line through error
     //System.out.println("The id of the thread t2 is "+ t2.getName()); //  // this line through error
    }
}

