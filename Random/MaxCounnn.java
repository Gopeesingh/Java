package Random;

public class MaxCounnn {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int n = cardPoints.length;
        
        // Calculate the sum of the first k elements.
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
    
        int maxSum = sum;
        
        // Try taking elements from the end instead of the start.
        for (int i = 0; i < k; i++) {
            sum -= cardPoints[k - 1 - i];
            sum += cardPoints[n - 1 - i];
            maxSum = Math.max(maxSum, sum);
        }
    
        return maxSum;
    }
    public static void main(String[] args) {
        int []cardPoints =  {1,2,3,4,5,6,1};
        MaxCounnn a = new MaxCounnn();
        int res = a.maxScore(cardPoints, 3);
        System.out.println(res);
    }
}
