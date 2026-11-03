class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <nums.length-1 ; i+=2 ){
            String concat = "";
            String s1 = "" + nums[i];
            String s2 = "" + nums[i+1];
            concat = s1 + s2;
            min  = Math.min(min,Integer.parseInt(concat));
        }
        return min;
    }
}