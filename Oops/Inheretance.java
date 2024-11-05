package Oops;

public class Inheretance {
public static class Circle{
        public int radius;
         Circle(){ // constructor
            System.out.println("I am non parson of circle");
        }
        Circle(int r){
        System.out.println("I am circle parameterised constructor");
            this.radius = r;
        }
        public double area(){ // method
    return Math.PI*radius*radius;
        }
    }
static class Cylinder1 extends Circle{
        public int height;
        Cylinder1(int r, int h){
        super(r);
        System.out.println("I am Cylinder1 parameterized constructor");
            this.height = h;
        }
        public double voulme(){
                return Math.PI*radius*radius*height;
            }
        }
        public static void main(String[] args) {
            Cylinder1 obj = new Cylinder1(12, 14);
            System.out.println(obj.voulme()); // 6333.450789637023
            Circle c1 = new Circle(5);
            System.out.println(c1.area());
        }
    }

