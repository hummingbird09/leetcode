class Solution {
    public int sumCounts(List<Integer> nums) {
        List<List<Integer>> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i<nums.size() ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = i; j <nums.size() ; j++ ){
                temp.add(nums.get(j));
                list.add(new ArrayList<>(temp));
            }
            
        }

        for(List<Integer> liElement : list){
            Set<Integer> set = new HashSet<>(liElement);
            sum += set.size()*set.size();
        }
        return sum;
    }
   
}