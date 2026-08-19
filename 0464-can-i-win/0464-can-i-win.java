class Solution {
    int max;
    int target;
    Boolean[] dp;
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        max=maxChoosableInteger;
        target = desiredTotal;
        int sum =max* (max)+1 / 2;
        if(sum<target){ 
        return false;
        }
        if(target<=max){
            return true;
        }
        dp=new Boolean[1<<max];
        return solve(0,0);
    }
    public boolean solve(int used, int total){
        if(dp[used]!=null){ 
        return dp[used];
        }
        for (int i = 1; i <= max; i++) {
            if ((used & (1 << (i - 1))) == 0) { 
                if (total + i >= target) {
                    return dp[used] = true;
                }
                boolean opponent = solve(
                    used|(1 << (i - 1)),
                    total+i
                );
                if (!opponent) {
                    return dp[used] = true;
                }
            }
        }
        return dp[used] = false;
    }
}