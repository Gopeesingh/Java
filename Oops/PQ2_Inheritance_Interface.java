package Oops;

public class PQ2_Inheritance_Interface {
   public static class Monkey{
        void jump(){
System.out.println("Jumping...");
        }
        void bite(){
System.out.println("Biteing...");
        }
    }

    interface BasicAnimal{
        void eat();
        void sleep();
    }

 static class Human extends Monkey implements BasicAnimal{
        void speek(){
            System.out.println("Hello Sir!..");
        }
        public void eat(){
    System.out.println("Eat...");
        }
        public void sleep(){
    System.out.println("Sleeping...");
        }
    }
    public static void main(String[] args) {
        Human s = new Human();
        s.sleep(); // Sleeping..
        

// Q.5 --> Demonstrate polymorphism

        Monkey m1 = new Human();
        // m1.speek(); --> Cannot use methood becoz the reference is monkey which does not have speak method
    m1.bite();
    m1.jump();
        BasicAnimal coo = new Human();
    // coo.speek(); --> again cannot work
    coo.eat();
    coo.sleep();
    }
}
