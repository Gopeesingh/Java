package Oops;

import java.util.*;

public class Abstract_Method {
    abstract class parent2{
        // Constructor
        public parent2(){
    System.out.println("Mai Parent2 ka Constructor hu");
        }
        public void sayHello(){
            System.out.println("Hello!!....");
        }
        abstract public void greet1();
        abstract public void greet();
    }
    public  class child2 extends parent2{
    public void greet1(){
        System.out.println("Good Morning");
    }
    public void greet(){
        System.out.println("Good afternoon ");
    }
    }
    public abstract class child3 extends parent2{
        public void ok(){
            System.out.println("I am Good!!..");
        }
    }
    public static void main(String[] args) {
    //    parent2 p = new parent2();  //through error
    // child2 c = new child2();
    }
}
