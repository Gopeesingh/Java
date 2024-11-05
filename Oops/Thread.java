package Oops;

public class Thread {
static class MyThread1 extends Thread{

        public void run(){
            int i = 0;
            while(i<400){
                System.out.println("My Cooking thread is Running");
                System.out.println("I am Happy!");
                i++;
            }
        }
    }
static class MyThread2 extends Thread{
        public void run(){
            int i=0;
            while(i<400){
                System.out.println(" Thread 2 is Chatting with her");
                System.out.println("I am sad!");
                i++;
            }
        }
    }
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
t1.run();
t2.run();
    }
}
