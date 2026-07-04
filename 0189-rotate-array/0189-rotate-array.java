class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] container = new int[nums.length];
        for(int i =0; i<nums.length;i++){
            container[(i+k)%n] = nums[i];
        }
        for(int i =0; i<nums.length;i++){
            nums[i] = container[i];
        }

    }
}