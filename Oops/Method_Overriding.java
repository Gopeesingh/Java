package Oops;

public class Method_Overriding {
    public static class A{
        public int a ;
        public int gopee(){
            return 4;
        }
        public void meth2(){
            System.out.println("I am method 2 of class A");;
        }
    }
    public static class B extends A{
        @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    }
    public static void main(String[] args) {
        A a = new A();
        a.meth2(); //I am method 2 of class A
        B b = new B();
        b.meth2(); //I am method 2 of class B
    }
}
