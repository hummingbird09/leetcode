class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
     
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) {
        ans = entry.getKey();
        break;
    }
}

    return ans;    
      
    }
}