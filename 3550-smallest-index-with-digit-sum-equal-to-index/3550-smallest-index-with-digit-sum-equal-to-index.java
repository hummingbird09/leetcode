class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i = 0; i<nums.length ; i++){
            int sum = sumDig(nums[i]);
            if(sum == i) return i;
        }
        return -1;
    }
    public int sumDig(int num){
        int sum = 0;
        while(num>0){
            int dig = num % 10;
            sum += dig;
            num /= 10;
        }
        return sum;
    }
}