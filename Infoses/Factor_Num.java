package Infoses;

public class Factor_Num {
    public static void findFactors(int n) {
        System.out.println("Factors of " + n + ":");
        
        // Loop to find factors
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " "); // Print the smaller factor
                
                // To avoid printing the square root twice
                if (i != n / i) {
                    System.out.print((n / i) + " "); // Print the corresponding larger factor
                }
            }
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
        int n = 36; // Change this value to find factors of any number
        findFactors(n);
    }
}
