class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        ArrayList<Integer> factMin = new ArrayList<>();
        ArrayList<Integer> factMax = new ArrayList<>();

        for( int i = 1 ; i<=min ; i++){
            if(min%i == 0){
                factMin.add(i);
            }
        }

         for( int i = 1 ; i<=max ; i++){
            if(max%i == 0){
                factMax.add(i);
            }
        }

        int common = 1;

        for(int i = 0 ; i<factMax.size() ; i++){
            if(factMin.contains(factMax.get(i))){
                common = Math.max(common , factMax.get(i));
            }
        }

        return common;



    }
}