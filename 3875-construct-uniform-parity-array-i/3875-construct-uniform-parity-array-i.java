class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int nums2[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums1[i]%2==0){
                        return true;
                }
                if(nums1[i]%2!=0){
                    return true;
                }


            }
        }
        return true;
    }
}