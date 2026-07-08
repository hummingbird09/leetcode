class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n = nums.length;
        int[] ans = new int[n];
        int[] positives = new int[n/2];
        int [] negatives = new int[n/2];
        int index = 0;
        int indP = 0 ;
        int indN = 0;


        for(int i = 0 ; i<nums.length;i++){
            if(nums[i] >= 0){
                positives[indP] = nums[i];
                indP++;
            }
            else{
                negatives[indN] = nums[i];
                indN++;
            }
        }
        
    
        

        for(int i = 0 ; i<nums.length-1;i++){
            ans[i] = positives[index];
            ans[i+1] = negatives[index];
            index++;
            i++;
        }
        return ans;
    }
}