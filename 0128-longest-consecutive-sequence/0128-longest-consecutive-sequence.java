class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;
        
        for(int num : set){
            int currElement = 0;
            int currLength = 0;
            if(!set.contains(num-1)){
                currElement = num;
                currLength++;

                while(set.contains(currElement+1)){
                    currElement +=1;
                    currLength++;
                   
                }
            }

             maxLength = Math.max(currLength , maxLength);
        }

        return maxLength;

    }
}