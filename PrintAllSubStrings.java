// Input:s = "abcd"
// output: a ab abc abcd b bc bcd c cd d

import java.util.*;
public class PrintAllSubStrings {
    public static void main(String[] args) {
        String str = "abcd";
        for(int i=0; i<=3; i++) {
            for(int j=i+1; j<=4; j++) {
                System.out.print(str.substring(i,j)+" "); // a ab abc abcd b bc bcd c cd d
            }
        }
    }
}
