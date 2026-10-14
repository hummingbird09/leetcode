class Solution {
    public int largestInteger(int n, int s) {
        
        if (s > n * 9 || s < 0) {
            return -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int digit = Math.min(s, 9);
            sb.append(digit);
            s -= digit;
        }
        
        
        if (s > 0) {
            return -1;
        }
        
        String st = sb.toString();
        
        return Integer.parseInt(st);
    }
}