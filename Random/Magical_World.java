package Random;
import java.util.*;
public class Magical_World {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int X = sc.nextInt();
	int areaOfRect = A*B;
	int areaOfSq = X*X;
	if(areaOfSq >= areaOfRect){
	System.out.print("0");
	}else{
	while(B<=X){
	B-=1;
	if(areaOfSq >= areaOfRect){
	System.out.print("1");
	}
	}
	while(A<=X || B<=X){
	    A-=1;
	        B-=1;
	        if(areaOfSq >= areaOfRect){
	        System.out.print("2");
	        }
	    }
	    
	}

	}
}
