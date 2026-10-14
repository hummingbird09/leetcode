class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // If the sum is greater than the maximum possible or less than 1, it's impossible
        if (sum > num * 9 || sum < 1) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num; i++) {
            
            int digit = Math.min(9, sum);
            sb.append(digit);
            sum -= digit;
        }
        
        return sb.toString();
    }
}