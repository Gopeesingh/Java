package Oops;

public class GetterAndSetter {
public static class MyEmployee{
    private int id;
    private String name;

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
        MyEmployee gopee = new MyEmployee();
        gopee.setName("Gopee Singh RajPut");
        System.out.println(gopee.getName()); // Gopee Singh RajPut
        gopee.setId(234);
        System.out.println(gopee.getId()); //234
    }
}

