class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map = new  HashMap<>();
      int index = 0;
      int[] ans = new int[k];

      //  find frequency 
      for(int num : nums){
        if(map.containsKey(num)){
             map.put(num , map.get(num)+1);
        }
        else{
            map.put(num , 1);
        }
      }

    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

    Collections.sort(list , (a,b) -> b.getValue() - a.getValue());

    while(index < k){
        ans[index] = list.get(index).getKey();
        index++;
    }
        
        return ans;
    }
}