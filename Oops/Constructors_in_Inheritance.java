package Oops;

public class Constructors_in_Inheritance {

static class Base{
    Base(){
        System.out.println("I am a Constructor");
    }
    Base(int x){
        System.out.println("I am overloaded constructor with value of x as:" + x);
    }
}

   static class Derived extends Base{
        Derived(){
            super(0);
            System.out.println("I am a derived class constructor");
        }
        Derived(int x, int y){
            super(x);
            System.out.println("I am overloaded constructor with value of y as:" + y);
        }
    }
    static class ChildOfDerived extends Derived{
        ChildOfDerived(){
            System.out.println("I am a child of derived constructor");
        }
        ChildOfDerived(int x, int y, int z){
            super(x, y);
            System.out.println("I am overloaded constructor with value of z as:" + z);
        }
    }
    public static void main(String[] args) {
   // Base b = new Base();
    //Derived d = new Derived();
    Derived d = new Derived(14,9);

    ChildOfDerived cd = new ChildOfDerived(12,13,14);
    // output is
    /* I am overloaded constructor with value of x as:12
I am overloaded constructor with value of y as:13
I am overloaded constructor with value of z as:14 */
            }
}
