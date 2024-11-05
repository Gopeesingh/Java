package Oops;

public class Thread_PracticeSet {
    // QUESTION 1:-

    // static class Practice13 extends Thread{
    //     public void run(){
    //         while(true){
    //             System.out.println("Good Morning!");
    //         }
    //     }
    // }
    //     static class Practice13b extends Thread{
    //         public void run(){
    //             while(true){
    //                 System.out.println("Welcome!");
    //             }
    //         }
    //     }
    // public static void main(String[] args) {
    //     Practice13 p1 = new Practice13();
    //     Practice13b p2 = new Practice13b();
    //    // p1.start();
    //    // p2.start();
    // }

    // QUESTION 2:-->
    
    // static class Practice13 extends Thread{
    //     public void run(){
    //         while(true){
    //             System.out.println("Good Morning!");
    //         }
    //     }
    // }
    //     static class Practice13b extends Thread{
    //         public void run(){
    //             while(true){
    //                 try{
    //                 //    Thread.sleep(millis: 200);
    //                 }
    //                 catch(Exception e){
    //                     System.out.println(e);
    //                 }
    //                 System.out.println("Welcome!");
    //             }
    //         }
    //     }
    // public static void main(String[] args) {
    //     Practice13 p1 = new Practice13();
    //     Practice13b p2 = new Practice13b();
    //    // p1.start();
    //    // p2.start();
    // }

    // QUESTION 3 -->

    static class Practice13 extends Thread{
        public void run(){
            while(true){
                System.out.println("Good Morning!");
            }
        }
    }
        static class Practice13b extends Thread{
            public void run(){
                while(true){
                    try{
                    //    Thread.sleep(millis: 200);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    System.out.println("Welcome!");
                }
            }
        }
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
       // p1.setPriority(6);
        //p2.setPriority(9);
        //System.out.println(p1.setPriority()); //6
      // System.out.println(p2.setPriority());   //9

      // and Question 4 only change is 
   // System.out.println(Thread.currentThread().getState()); // Runable
    }
}
