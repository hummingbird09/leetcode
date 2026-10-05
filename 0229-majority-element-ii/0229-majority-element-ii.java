class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        int cond = nums.length/3;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > cond){
                list.add(entry.getKey());
            }
        }

        

        return list;
    }
}