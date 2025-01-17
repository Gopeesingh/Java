package Oops;

public class Inheritance_Interface {

    interface sampleInterface{
        void meth1();
        void meth2();
    }
    interface childSampleInterface extends sampleInterface{ // inheritance
        void meth3();
        void meth4();
    }
    static class MySmapleClass implements childSampleInterface{ // interface
    public void meth3(){
            System.out.println("meth3");
        }
    public void meth4(){
            System.out.println("meth4");
        }
        public void meth1(){
            System.out.println("meth1");
        }
        public void meth2(){
            System.out.println("meth2");
        }
    }
    public static void main(String[] args) {
        MySmapleClass obj = new MySmapleClass();
        obj.meth1(); // meth1
        obj.meth2(); // meth 2
        obj.meth3(); // meth 3
        obj.meth4(); // meth 4
    }
}
