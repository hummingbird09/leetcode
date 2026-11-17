class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            s = sum(s, k);
        }
        return s;
    }
    
    public String sum(String s, int k) {
        StringBuilder temp = new StringBuilder();
        int len = s.length();
        
        
        for (int i = 0; i < len; i += k) {
            int end = Math.min(i + k, len);
            String group = s.substring(i, end);
            
            
            int groupSum = 0;
            for (int j = 0; j < group.length(); j++) {
                groupSum += group.charAt(j) - '0';
            }
            
            temp.append(groupSum);
        }
        
        return temp.toString();
    }
}