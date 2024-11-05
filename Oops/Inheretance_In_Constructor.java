package Oops;

import Oops.Constructors_in_Inheritance.Derived;

public class Inheretance_In_Constructor {
  public static class Base1{ // class
        Base1(){ // constructor
            System.out.println("I am a Base1 class constructor");
        }
        Base1(int a){ // constructor
       System.out.println("I am overloaded constructor with value of a as:"+ a);
        }
    }
    public static class Derived1 extends Base1 {
    Derived1(){
        System.out.println("I am a Derived1 class constructor");
    }
    Derived1(int a , int b){
        super(a);
        System.out.println("I am overloaded constructor of Derived with value of b as:"+ b);
    }
    }
    private static class ChildOfDerived extends Derived1{
        ChildOfDerived(){
            System.out.println(" I am child of derived Constructor");
        }
        ChildOfDerived(int a, int b, int c){
            super(a,b);
            System.out.println("I am an overloaded constructor of Derived with value of c as:"+ c);
        }
    }
    public static void main(String[] args) {
    
    ChildOfDerived c = new ChildOfDerived();
    //output is
    
     // I am a base class constructor
     // I am a Derived class constructor
     // I am child of derived Constructor

    ChildOfDerived d = new ChildOfDerived(1,2,3);
    /*  I am overloaded constructor with value of a as:1
        I am overloaded constructor of Derived with value of b as:2
        I am an overloaded constructor of Derived with value of c as:3 */
    }
}
