lass Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for (int i = 0; i < n; i++) {
            int landFinish = landStartTime[i] + landDuration[i];

            for (int j = 0; j < m; j++) {
                int startWater = Math.max(landFinish, waterStartTime[j]);
                int finish = startWater + waterDuration[j];

                ans = Math.min(ans, finish);
            }
        }
        for (int j = 0; j < m; j++) {
            int waterFinish = waterStartTime[j] + waterDuration[j];

            for (int i = 0; i < n; i++) {
                int startLand = Math.max(waterFinish, landStartTime[i]);
                int finish = startLand + landDuration[i];

                ans = Math.min(ans, finish);
            }
        }

        return ans;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            int cost=prices[i]-min;
            maxProfit = Math.max(maxProfit,cost);
            min=Math.min(min,prices[i]);
        }
        return maxProfit;
    }
}

class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
