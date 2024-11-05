package Oops;

public class Constructors {

public static class MyMainEmployee{
    private int id;
    private String name;

    // Constructor
    public MyMainEmployee(String myName,int myid){
    this.id = 45;
    this.name = myName;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
    public static void main(String[] args) {
        MyMainEmployee gopee = new MyMainEmployee("codeWithGopee",12);
        // gopee.setName("CodeWithGopee");
        // gopee.setId(34);
        System.out.println(gopee.getId());   //45
        System.out.println(gopee.getName()); // codeWithGopee
    }
    }

