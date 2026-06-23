class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
                maximum=Math.max(maximum,cnt);
            }
            else {
                cnt=0;
            }
        }
        return maximum;
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int off=0;
        int res=1;
        int cm=1;
        while(cm<n){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            nums[off+1]=nums[cm];
            off++;
            res++;
            cm++;
        }
        return res;
    }
}
