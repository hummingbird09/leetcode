import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        HashMap<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

       
        String[] arr = s.split("[()]");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            
            if (i % 2 == 0) {
                ans.append(arr[i]);
            } 
           
            else {
                ans.append(map.getOrDefault(arr[i], "?"));
            }
        }

        return ans.toString();
    }
}