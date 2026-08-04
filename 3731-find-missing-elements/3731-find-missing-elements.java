class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];
        int j = 0;
        for (int i = min; i < max; i++) {
            if (nums[j] == i) {
                j++; 
            } else {
                list.add(i); 
            }
        }

        return list;
    }
}