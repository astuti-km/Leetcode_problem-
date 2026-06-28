class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int res=0;
        long total=0;

        for(int i=0;i<n;i++){
            total+=nums[i];

            while((long) nums[i]*(i-l+1)>total+(long)k){
                total-=nums[l];
                l++;
            }
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}