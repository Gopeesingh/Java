package Random;

public class Game {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
            if (num < 10) {
                singleDigitSum += num;
            } else if (num < 100) {
                doubleDigitSum += num;
            }
        }

        // // Alice's sum when choosing single-digit numbers
        // int bobSumSingle = totalSum - singleDigitSum;
        // // Alice's sum when choosing double-digit numbers
        // int bobSumDouble = totalSum - doubleDigitSum;

        // // Check if Alice can win with single-digit or double-digit numbers
        // //return singleDigitSum > bobSumSingle || doubleDigitSum > bobSumDouble;
        if(singleDigitSum > doubleDigitSum || singleDigitSum < doubleDigitSum){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {6, 7, 54, 55, 45};
        Game b = new Game();
        System.out.println(b.canAliceWin(nums)); // Output will be false because sum == 10
    }
}

