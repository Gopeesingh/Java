package Oops;

public class Cylinder {
   
    public static class Cylinderss{
        private int redii;
        private int height;

        // constructor
        public Cylinderss(int redii, int height){
            this.redii = redii;
            this.height = height;
        }

            public double surfaceArea(){
        return 2 * 3.14 * redii * redii + 2*3.14*redii*height;
        }

        public double volume(){
            return 2 * 3.14 * redii * redii * height;
        }
    }

    public static void main(String[] args) {
        Cylinderss c1 = new Cylinderss(3,4);
        System.out.println(c1.surfaceArea());
        System.out.println(c1.volume());

    }
}
