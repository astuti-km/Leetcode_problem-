class Solution {
    public void sortColors(int[] nums) {
        int n=0;
        int m=0;
        int p=nums.length-1;
        while(m<=p){
            if (nums[m]==0) {
                int temp = nums[n];
                nums[n] = nums[m];
                nums[m] = temp;

                n++;
                m++;
            }
            else if (nums[m]==1){
                m++;
            }
            else {
                int temp=nums[m];
                nums[m]=nums[p];
                nums[p]=temp;
                p--;
            }
        }
    }
}