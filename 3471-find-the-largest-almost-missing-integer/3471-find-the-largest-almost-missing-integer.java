class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        int i = 0;
        int j = k-1;
        while(j<nums.length){
            find(i , j , map , nums);
            i++;
            j++;
        }

        ArrayList<Integer>list = new ArrayList<>();

        int max = -1;
        
        
        for (Map.Entry<Integer, Integer> num : map.entrySet()) {
            if (num.getValue() == 1) {
                max = Math.max(max, num.getKey());
            } 
        } 

        return max;

    }

    public void find(int start, int end, HashMap<Integer, Integer> map, int[] nums) {
    Set<Integer> uniqueInWindow = new HashSet<>();
    for (int i = start; i <= end; i++) {
        uniqueInWindow.add(nums[i]);
    }

    for (int num : uniqueInWindow) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
}
}