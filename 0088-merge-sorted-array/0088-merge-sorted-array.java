class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index2 = 0;
        for(int i = nums1.length-1 ; i>=nums1.length-n ; i--){
            if(nums1[i] == 0){
                nums1[i] = nums2[index2];
                index2++;
            }
            else{
                continue;
            }
        }

        Arrays.sort(nums1);
    }
}