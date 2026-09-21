class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        long[] result = new long[k];
        long[] dp = new long[k];
        for (int x : nums) {
            long[] newDp = new long[k];
            int rem = x % k;
            newDp[rem]++;
            for (int r = 0; r < k; r++) {
                if (dp[r] > 0) {
                    int newRem = (int)((long) r * x % k);
                    newDp[newRem] += dp[r];
                }
            }
            for (int r = 0; r < k; r++) {
                result[r] += newDp[r];
            }
            dp = newDp;
        }
        return result;
    }
}