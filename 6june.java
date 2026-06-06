class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftSum[]=new int[n];
        int rightSum[]=new int[n];
        
        for(int i=1;i<n;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+nums[i+1];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
    }
}

import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        int cnt1 = 0, cnt2 = 0;
        int element1 = 0, element2 = 0;

        for (int i = 0; i < n; i++) {

            if (cnt1 > 0 && nums[i] == element1) {
                cnt1++;
            }
            else if (cnt2 > 0 && nums[i] == element2) {
                cnt2++;
            }
            else if (cnt1 == 0) {
                element1 = nums[i];
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                element2 = nums[i];
                cnt2 = 1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == element1) {
                cnt1++;
            }
            else if (nums[i] == element2) {
                cnt2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if (cnt1 > n / 3) {
            ans.add(element1);
        }

        if (cnt2 > n / 3) {
            ans.add(element2);
        }

        return ans;
    }
}
