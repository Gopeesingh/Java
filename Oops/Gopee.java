package Oops;

import Oops.Gopee.Student.Cellphone;

public class Gopee {
    // class
    public static class Student{
        String name;
        int rno;
        double percent;

        // method 
        public void printDetail(){
            System.out.println("My name is" + name);
            System.out.println("my percent is" + percent);
        }
            // class 2
    public static class Cellphone{
                public void ringing(){
                    System.out.println("Ringing" );
                }
                public void vibreating(){
                    System.out.println("Viberating");
                }
            }
        }
    // object
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Gopee Singh";
        st.rno = 54;
        st.percent = 95.3;
       System.out.println(st.name); // Gopee Singh
       System.out.println(st.percent); // 95.3
       st.printDetail(); // My name isGopee Singh, my percent is95.3
        
       // object 2
    Cellphone vivo = new Cellphone();
    vivo.vibreating();
    vivo.ringing();
    }
}
