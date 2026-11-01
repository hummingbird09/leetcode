class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] lSum = leftSum(nums);
        int[] rSum = rightSum(nums);
        for(int i = 0; i<n ; i++){
            ans[i] = Math.abs(lSum[i]-rSum[i]);
        }
        return ans;

        
    }
    public int[] leftSum(int[] nums){
        int[] temp = new int[nums.length];
        temp[0] = 0;
        int sum = 0;
        for(int i = 1 ; i<temp.length ; i++){
            sum = sum + nums[i-1];
            temp[i] = sum;
            
        }
        return temp;
    }
    public int[] rightSum(int[] nums){
        int sum = 0;
        for(int n  : nums){
            sum += n;
        }
        int[] right = new int[nums.length];
        for(int i = 0; i<nums.length ; i++){
            sum = sum-nums[i];
            right[i] = sum;
        }
        return right;
    }
}