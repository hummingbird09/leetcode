import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] absNums = new long[n];
        for (int i = 0; i < n; i++) {
            absNums[i] = Math.abs((long) nums[i]);
        }
        
        Arrays.sort(absNums);
        
        long sum = 0;
        int k = n / 2; 
        
        for (int i = 0; i < k; i++) {
            sum -= absNums[i] * absNums[i];
        }
        
        
        for (int i = k; i < n; i++) {
            sum += absNums[i] * absNums[i];
        }
        
        return sum;
    }
}