package DSA;

public class Clover {
    public static int cov(int clover){
        int leaf_colverValue = 4;
        int other_leaf_coverValue = 3;
        
        int Three_leaf_clover = clover - 1;
        
        return leaf_colverValue + other_leaf_coverValue * Three_leaf_clover;
    }
	public static void main (String[] args) throws java.lang.Exception	{
		// your code goes here
		int clover = 10;
    Clover d = new Clover(); 	
	System.out.println(d.cov(10));
	}
}
