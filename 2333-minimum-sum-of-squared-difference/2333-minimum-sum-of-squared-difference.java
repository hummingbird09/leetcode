import java.util.HashMap;
import java.util.Map;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long totalK = (long) k1 + k2;
        
        // Find maximum difference to size our frequency array
        int maxDiff = 0;
        int[] diffFreq = new int[100001];
        
        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            diffFreq[d]++;
            if (d > maxDiff) {
                maxDiff = d;
            }
        }
        
        
        for (int i = maxDiff; i > 0 && totalK > 0; i--) {
            if (diffFreq[i] == 0) continue;
            
            
            long take = Math.min(totalK, (long) diffFreq[i]);
            diffFreq[i] -= take;
            diffFreq[i - 1] += (int) take;
            totalK -= take;
        }
        
       
        long minSum = 0;
        for (int i = 1; i <= maxDiff; i++) {
            if (diffFreq[i] > 0) {
                minSum += (long) diffFreq[i] * i * i;
            }
        }
        
        return minSum;
    }
}