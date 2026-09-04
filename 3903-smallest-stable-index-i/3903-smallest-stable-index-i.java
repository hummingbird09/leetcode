class Solution {
    public int firstStableIndex(int[] nums, int k) {

        for(int i = 0; i<nums.length ; i++){
            int score = max(0,i,nums) - min(i,nums.length-1 , nums);
            if(score <=k){
                return i;
            }
        }
        return -1;
        
    }
    public int max (int start , int end , int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = start ; i<= end ; i++){
            max = Math.max(nums[i] , max);
        }
        return max;
    }

    public int min (int start , int end , int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i = start ; i<= end ; i++){
            min = Math.min(nums[i] , min);
        }
        return min;
    }
}