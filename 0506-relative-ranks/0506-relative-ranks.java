class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        
        
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        
        Arrays.sort(indices, (a, b) -> Integer.compare(score[b], score[a]));
        
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[indices[i]] = "Gold Medal";
            } else if (i == 1) {
                ans[indices[i]] = "Silver Medal";
            } else if (i == 2) {
                ans[indices[i]] = "Bronze Medal";
            } else {
                ans[indices[i]] = Integer.toString(i + 1);
            }
        }
        
        return ans;
    }
}