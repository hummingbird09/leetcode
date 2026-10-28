import java.util.HashMap;
import java.util.Map;

class Solution {
    static final int MOD = 1_000_000_007;

    class LazySegmentTree {
        int n;
        long[] sum;    // Stores the sum of squares of distinct counts
        long[] sumC;   // Stores the sum of counts (c) for range updates
        long[] lazy;   // Lazy propagation array

        public LazySegmentTree(int n) {
            this.n = n;
            sum = new long[4 * n];
            sumC = new long[4 * n];
            lazy = new long[4 * n];
        }

        private void push(int node, int start, int end) {
            if (lazy[node] != 0) {
                long v = lazy[node];
                int mid = (start + end) / 2;
                
                apply(2 * node, start, mid, v);
                apply(2 * node + 1, mid + 1, end, v);
                
                lazy[node] = 0;
            }
        }

        private void apply(int node, int start, int end, long v) {
            // (c + v)^2 = c^2 + 2*v*c + v^2 * length
            long len = (end - start + 1);
            sum[node] = (sum[node] + 2 * v * sumC[node] + v * v % MOD * len) % MOD;
            sumC[node] = (sumC[node] + v * len) % MOD;
            lazy[node] = (lazy[node] + v) % MOD;
        }

        public void update(int node, int start, int end, int l, int r, long v) {
            if (l > end || r < start) return;
            if (l <= start && end <= r) {
                apply(node, start, end, v);
                return;
            }
            push(node, start, end);
            int mid = (start + end) / 2;
            update(2 * node, start, mid, l, r, v);
            update(2 * node + 1, mid + 1, end, l, r, v);
            sum[node] = (sum[2 * node] + sum[2 * node + 1]) % MOD;
            sumC[node] = (sumC[2 * node] + sumC[2 * node + 1]) % MOD;
        }

        public long query(int node, int start, int end, int l, int r) {
            if (l > end || r < start) return 0;
            if (l <= start && end <= r) return sum[node];
            push(node, start, end);
            int mid = (start + end) / 2;
            return (query(2 * node, start, mid, l, r) + query(2 * node + 1, mid + 1, end, l, r)) % MOD;
        }
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;
        LazySegmentTree tree = new LazySegmentTree(n);
        Map<Integer, Integer> lastSeen = new HashMap<>();
        
        long totalSumOfSquares = 0;
        long currentSumOfSquares = 0;

        for (int r = 0; r < n; r++) {
            int l = lastSeen.containsKey(nums[r]) ? lastSeen.get(nums[r]) + 1 : 0;
            lastSeen.put(nums[r], r);

            // Update range [l, r] by adding 1 to distinct counts
            tree.update(1, 0, n - 1, l, r, 1);

            // The query over the entire tree [0, r] gives the sum of squares of all subarrays ending at r
            long prefixSum = tree.query(1, 0, n - 1, 0, r);
            totalSumOfSquares = (totalSumOfSquares + prefixSum) % MOD;
        }

        return (int) (totalSumOfSquares % MOD);
    }
}