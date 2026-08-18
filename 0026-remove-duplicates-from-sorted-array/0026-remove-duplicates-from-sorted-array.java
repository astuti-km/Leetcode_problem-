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