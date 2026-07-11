import java.util.*;

class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        
       
        for (int num : nums) {
            maxRange = Math.max(maxRange, digitRange(num));
        }
        
        int sum = 0;
        for (int num : nums) {
            if (digitRange(num) == maxRange) {
                sum += num;
            }
        }
        
        return sum;
    }

    public static int digitRange(int num) {
        
        if (num == 0) return 0;
        
        
        num = Math.abs(num); 
        
        int largest = 0;
        int smallest = 9;

        while (num > 0) {
            int dig = num % 10;
            largest = Math.max(dig, largest);
            smallest = Math.min(dig, smallest);
            num = num / 10;
        }

        return largest - smallest;
    }
}