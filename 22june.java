class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}

class Solution {
    public int maxNumberOfBalloons(String text) {
        int cnt[]=new int[10];

        String str="balon";
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);

            for(int j=0;j<5;j++){
                if(ch==str.charAt(j)){
                    cnt[j]+=1;
                    break;
                }
            }
        }
        cnt[2]>>=1;
        cnt[3]>>=1;

        int min = Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            min=Math.min(min,cnt[i]);
        }
        return min;
    }
}
