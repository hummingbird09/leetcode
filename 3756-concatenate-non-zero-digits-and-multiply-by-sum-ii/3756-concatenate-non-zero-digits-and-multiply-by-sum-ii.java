import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int m = s.length();
        long MOD = 1_000_000_007L;
        
        List<Integer> digits = new ArrayList<>();
        List<Integer> origIdx = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            char c = s.charAt(i);
            if (c != '0') {
                digits.add(c - '0');
                origIdx.add(i);
            }
        }
        
        int n = digits.size();
        int[] answer = new int[queries.length];
        if (n == 0) {
            return answer; 
        }
        
      
        long[] pow10 = new long[n + 1];
        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }
        
        
        long[] prefixMod = new long[n + 1];
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixMod[i + 1] = (prefixMod[i] * 10 + digits.get(i)) % MOD;
            prefixSum[i + 1] = prefixSum[i] + digits.get(i);
        }
        
    
        for (int q = 0; q < queries.length; q++) {
            int L = queries[q][0];
            int R = queries[q][1];
            
            
            int idxL = binarySearchLeft(origIdx, L);
            int idxR = binarySearchRight(origIdx, R);
            
            
            if (idxL > idxR) {
                answer[q] = 0;
                continue;
            }
            
            
            long digitSum = prefixSum[idxR + 1] - prefixSum[idxL];
            
          
            int len = idxR - idxL + 1;
            long num = (prefixMod[idxR + 1] - (prefixMod[idxL] * pow10[len]) % MOD + MOD) % MOD;
            
            
            answer[q] = (int) ((num * (digitSum % MOD)) % MOD);
        }
        
        return answer;
    }
    
    // Helper to find the first non-zero digit index >= L
    private int binarySearchLeft(List<Integer> arr, int target) {
        int low = 0, high = arr.size() - 1;
        int ans = arr.size();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    // Helper to find the last non-zero digit index <= R
    private int binarySearchRight(List<Integer> arr, int target) {
        int low = 0, high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}