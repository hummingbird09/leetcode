class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue()); 
        
       
        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            ans.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        
        return ans.toString();
    }
}