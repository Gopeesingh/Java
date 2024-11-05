package Oops;

public class Inheritance_Circle_Cylinder {
    public static class Circle3{
        public static double  area3( int radii){
            return Math.PI*radii*radii;
        }
     static class Cylinder3 extends Circle3{
        public static double volume3(int radii, int height){
            return Math.PI*radii*radii*height;
        }
    }
    }
    public static void main(String[] args) {
        int radii = 2;
        int height = 3;
   

    }
}
