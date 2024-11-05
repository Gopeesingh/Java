package Random;

import java.util.Scanner;

public class Codechef {
    public static void volumeComparison(int A, int B, int C, int X){
        int VoulumeOfCuboid = A*B*C;
    int VoulumeOfCube = X*X*X;
    if(VoulumeOfCuboid == VoulumeOfCube){
    System.out.println("Equal");
    }
    else if(VoulumeOfCuboid > VoulumeOfCube){
    System.out.println("Cuboid");
    }
        else{
        System.out.println("Cuboid");
    }
}
public static void main (String[] args) throws java.lang.Exception{
     Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt(); // Length of the cuboid
        int B = sc.nextInt(); // Width of the cuboid
        int C = sc.nextInt(); // Height of the cuboid
        int X = sc.nextInt(); // Edge length of the cube

        volumeComparison(A, B, C, X);
  }
}
