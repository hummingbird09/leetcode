class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String big = s + s;
        return big.contains(goal);
    }
}