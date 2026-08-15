class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxEndingHere = 0, minEndingHere = 0;
        int maxSubarraySum = Integer.MIN_VALUE;
        int minSubarraySum = Integer.MAX_VALUE;

        for (int num : nums) {
            totalSum += num;

           
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSubarraySum = Math.max(maxSubarraySum, maxEndingHere);

            
            minEndingHere = Math.min(num, minEndingHere + num);
            minSubarraySum = Math.min(minSubarraySum, minEndingHere);
        }

        // Handle edge case: If all elements are negative, return maxSubarraySum directly
        if (maxSubarraySum < 0) {
            return maxSubarraySum;
        }

        return Math.max(maxSubarraySum, totalSum - minSubarraySum);
    }
}