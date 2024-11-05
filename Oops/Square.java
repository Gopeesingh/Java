package Oops;

import Oops.Square.Squares.Rectangle;

public class Square {
    
// class 1
    public static class Squares{
        int side;
        // Constructor
        Squares(int side){
            this.side = side;
        }
        public int area(){ // method
            return side*side;
        }
        
        public int perimeter(){ // method
            return 4*side;
        }

        // class 2
        public static class Rectangle{
            int length;
            int bredth;

        // Constructor

            public Rectangle(int length, int breadth) {
            this.length = length;
            this.bredth = breadth;
            }

            public int rectArea(){
                return length*bredth;
            }
            public int rectPerimeter(){
                return 2*(length+bredth);
            }
        }
    }
        public static void main(String[] args) {
            // object 1
            Squares sq = new Squares(4);
            //sq.side = 4;
            System.out.println(sq.area()); // 16
            System.out.println(sq.perimeter()); // 16

            // object 2
            Rectangle re = new Rectangle(4,2);
            // re.length = 4;
            // re.bredth = 2;
            System.out.println(re.rectArea()); // 8
            System.out.println(re.rectPerimeter());// 12
        }
    }

