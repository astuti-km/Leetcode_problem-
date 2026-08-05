class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
       int m = primes.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int[] index = new int[m];
        long[] next = new long[m];
        for (int i = 0; i < m; i++) {
            next[i] = primes[i];
        }
        for (int i = 1; i < n; i++) {
            long min = next[0];
            for (int j = 1; j < m; j++) {
                if (next[j] < min) {
                    min = next[j];
                }
            }
            dp[i] = (int) min;
            for (int j = 0; j < m; j++) {
                if (next[j] == min) {
                    index[j]++;
                    next[j] = (long) dp[index[j]] * primes[j];
                }
            }
        }
        return dp[n - 1];
    }
}